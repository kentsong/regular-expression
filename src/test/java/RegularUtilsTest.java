import org.junit.Assert;
import org.junit.Test;

public class RegularUtilsTest {

    @Test
    public void validEmailTest() {

        Assert.assertEquals(true, RegularUtils.validEmail("kent@linkwish.com"));
        Assert.assertEquals(true, RegularUtils.validEmail("111kent@linkwish.com"));
        Assert.assertEquals(true, RegularUtils.validEmail("kent@gmail.com"));
        Assert.assertEquals(true, RegularUtils.validEmail("kent@linkwish.com.tw"));

        Assert.assertEquals(false, RegularUtils.validEmail("ke..nt@linkwish.com.tw"));
        Assert.assertEquals(false, RegularUtils.validEmail(""));
        Assert.assertEquals(false, RegularUtils.validEmail("kent"));
        Assert.assertEquals(false, RegularUtils.validEmail("kent@linkwish"));
        Assert.assertEquals(false, RegularUtils.validEmail("kent@.com.com"));
    }

    @Test
    public void validHttpUrlTest() {

        Assert.assertEquals(true, RegularUtils.validHttpUrl("http://10.168.16.20/TC_API/api/product/"));
        Assert.assertEquals(false, RegularUtils.validHttpUrl("168.0.0.1"));
        Assert.assertEquals(true, RegularUtils.validHttpUrl("http://168.0.0.1"));
        Assert.assertEquals(false, RegularUtils.validHttpUrl("ftp://168.0.0.1"));
        Assert.assertEquals(true, RegularUtils.validHttpUrl("https://168.0.0.1"));
        Assert.assertEquals(true, RegularUtils.validHttpUrl("https://168.0.0.1/api/"));
        Assert.assertEquals(true, RegularUtils.validHttpUrl("http://168.0.0.1/api/"));


    }

}