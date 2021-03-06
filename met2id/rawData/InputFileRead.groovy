package met2id.rawData

import met2id.metaboEntity.PeakPair
import met2id.metaboEntity.Spectrum

/**
 * Created by hahah on 2017/3/8.
 */
class InputFileRead {
    static Spectrum XCMSread(String inputFile, boolean headerExist){
        BufferedReader br = new BufferedReader(new FileReader(new File(inputFile)))
        Spectrum spectrum = new Spectrum()

        br.eachLine {
            if (headerExist){
                headerExist = false
                return
            }
            it = it.trim()
            String[] tmpline = it.split("\t")

            tmpline[3] = na2zero(tmpline[3])
            tmpline[5] = na2zero(tmpline[5])

            Integer msLevel = Integer.valueOf(tmpline[2])
            Double rt = Double.valueOf(tmpline[3])
            Double mz = Double.valueOf(tmpline[4])
            Double intensity = Double.valueOf(tmpline[5])

            String id = tmpline[0]
            String parentID = tmpline[1]

            if (msLevel == 1){
                PeakPair tmpPeak = new PeakPair(mz,id,intensity,rt)
                spectrum.peakPairGroup.put(id, tmpPeak)
            } else if (msLevel == 2){
                if (spectrum.peakPairGroup.get(parentID) == null){
                    println("Wrong format of XCMS result file, MS2 peak appear before corresponding MS1 peak")
                } else if (spectrum.peakPairGroup.get(parentID).daughterMZPair == null){
                    spectrum.peakPairGroup.get(parentID).daughterMZPair = new HashMap<Double, Double>()
                    spectrum.peakPairGroup.get(parentID).daughterMZPair.put(mz, intensity)
                } else {
                    spectrum.peakPairGroup.get(parentID).daughterMZPair.put(mz, intensity)
                }
            }
        }
        br.close()
        return spectrum
    }

    static String na2zero(String tmpna){
        if (tmpna == "NA") {return "0"}
        if (tmpna == "NaN") {return "0"}
        return tmpna
    }

    static void main(String[] args){
        XCMSread("ex-data-n", true)
    }
}
