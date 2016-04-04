package softwarePrinciples;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import softwarePrinciples.Config.AppConfig;
import softwarePrinciples.OCP.violate.serviceProviders;

/**
 * Created by student on 2016/03/28.
 */
public class TestOCPviolate
{
    private serviceProviders ser;
    @Test
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ser = (serviceProviders) ctx.getBean("ser");
    }
    @Test
    public void testOCP_v() throws Exception {
        Assert.assertEquals("Airtime",ser.service(1));
    }
}
