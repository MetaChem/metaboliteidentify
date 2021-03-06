package met2id.spectraRef

/**
 * Created by hahah on 2016/12/5.
 */
//http://www.nonlinear.com/progenesis/qi/v2.2/faq/database-fragmentation-algorithm.aspx

class MathTool {
    static Double massErrorScore(Double numA, Double numB, Double tolppm){
        return 100 - (((Math.abs(numA - numB)/numB * 1000000)/tolppm) * 10000).round()/100
    }

    static Double calPPM(Double numA, Double numB){
        return Math.abs(numA - numB)/numB * 1000000
    }

    static Boolean wPPMtol(Double numA, Double numB, Double tolppm){
        return calPPM(numA, numB) <= tolppm
    }

    static Double similirityScore(Map<Double, Double> queryIntDist, Map<Double, Double> dbIntDist, Double tol) {
        Iterator<Double> queryIter = queryIntDist.keySet().sort().iterator()
        Iterator<Double> dbIter = dbIntDist.keySet().sort().iterator()
        Double dotProduct = 0
        Double qSqurSum = 0
        Double dbSqurSum = 0
        Double factor = 1

        // To avoid few peaks in the query spectra but still got a high score
        Integer querySize =  queryIntDist.keySet().size()
        if (querySize==3){
            factor = 0.8
        } else if (querySize==2){
            factor = 0.5
        } else if (querySize==1){
            factor = 0.3
        }

        def tmpqKey = null
        def tmpdbKey = null
        while ((queryIter.hasNext() || tmpqKey != null) && (dbIter.hasNext() || tmpdbKey != null)) {
            if (tmpqKey == null) tmpqKey = queryIter.next()
            if (tmpdbKey == null) tmpdbKey = dbIter.next()

            Double tmpqW = 0
            Double tmpdbW = 0
            if (Math.abs(tmpdbKey - tmpqKey) < tol) {
                tmpqW = weightInt(tmpqKey, queryIntDist.get(tmpqKey))
                tmpqKey = null
                tmpdbW = weightInt(tmpdbKey, dbIntDist.get(tmpdbKey))
                tmpdbKey = null
            } else {
                if (tmpqKey < tmpdbKey) {
                    tmpqW = weightInt(tmpqKey, queryIntDist.get(tmpqKey))
                    tmpqKey = null
                } else {
                    tmpdbW = weightInt(tmpdbKey, dbIntDist.get(tmpdbKey))
                    tmpdbKey = null
                }
            }

            dotProduct += tmpqW * tmpdbW
            qSqurSum += Math.pow(tmpqW, 2.0)
            dbSqurSum += Math.pow(tmpdbW, 2.0)
        }
        while (queryIter.hasNext()){
            if (tmpqKey == null) tmpqKey = queryIter.next()
            qSqurSum += Math.pow(weightInt(tmpqKey, queryIntDist.get(tmpqKey)), 2.0)
            tmpqKey = null
        }
        while (dbIter.hasNext()){
            if (tmpdbKey == null) tmpdbKey = dbIter.next()
            dbSqurSum += Math.pow(weightInt(tmpdbKey, dbIntDist.get(tmpdbKey)), 2.0)
            tmpdbKey = null
        }
        Double tmpdouble = dotProduct/(Math.sqrt(qSqurSum) * Math.sqrt(dbSqurSum))
        if (tmpdouble.isNaN()){
            return 0
        } else {
            return factor * tmpdouble
        }
    }

    static Double weightInt(Double mz, Double intensity){
        return Math.pow(mz, 2.0) * Math.sqrt(intensity)
    }

    static void main(String[] args){
        println(weightInt(5,16))

        Map<Double, Double> queryIntDist = new TreeMap<>()
        queryIntDist.put(Double.valueOf(36), Double.valueOf(637))
        queryIntDist.put(Double.valueOf(143), Double.valueOf(34))
        queryIntDist.put(Double.valueOf(88.097), Double.valueOf(78))
        queryIntDist.put(Double.valueOf(1), Double.valueOf(547))
        queryIntDist.put(Double.valueOf(0.4), Double.valueOf(47))

        Map<Double, Double> dbIntDist = new TreeMap<>()
        dbIntDist.put(Double.valueOf(37), Double.valueOf(637))

        println(similirityScore(dbIntDist, queryIntDist, 1.2))

        Map spLib = SearchRefLib.loadMGF("test.mgf")
        ArrayList ms1Ar = SearchRefLib.searchMS1mass(231.0, 10, spLib)
        ArrayList ms2Ar = SearchRefLib.compareMGF(ms1Ar, spLib,queryIntDist,0)
        println(ms2Ar)
        println("****&&&&")
        println(spLib.values().spectrum)

    }
}
