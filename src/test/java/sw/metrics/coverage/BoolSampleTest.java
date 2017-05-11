package sw.metrics.coverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoolSampleTest {

    private BoolSample boolSample;

    @Before
    public void init() {
        boolSample = new BoolSample();
    }

    @Test
    public void test() {
        Assert.assertEquals(false, boolSample.process(false, false, false));
        Assert.assertEquals(false, boolSample.process(true, false, false));
        Assert.assertEquals(false, boolSample.process(true, true, false));
        Assert.assertEquals(true, boolSample.process(true, true, true));
    }

}
