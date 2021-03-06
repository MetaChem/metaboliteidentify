package met2id.spectraRef

/**
 * Created by hahah on 2016/12/5.
 */
class MetaboliteSpectralMatch {
    Double ms2LibScore
    MetaboliteDBRef metaboliteRef

    MetaboliteSpectralMatch(MetaboliteDBRef tmpSuper, Double tmpScore){
        this.metaboliteRef = tmpSuper
        this.ms2LibScore = tmpScore
    }

    @Override
    String toString() {
        return this.metaboliteRef.toString() + "MS2LIBCOMP_SCORE=" + ms2LibScore + "\n\n"
    }
}
