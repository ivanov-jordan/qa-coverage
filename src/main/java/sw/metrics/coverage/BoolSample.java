package sw.metrics.coverage;

public class BoolSample {

    public boolean process(boolean bool1, boolean bool2, boolean bool3) {
        if (bool1) {
            if (bool2) {
                if (bool3) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
