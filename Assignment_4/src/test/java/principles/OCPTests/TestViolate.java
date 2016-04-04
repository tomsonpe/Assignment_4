package principles.OCPTests;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.AppConfig;
import principles.OCP.Violate.ServiceProvider;
import principles.OCP.Violate.ServiceProviderImplem;

/**
 * Created by student on 2016/04/04.
 */
public class TestViolate {
    private ServiceProvider ser;
    @Test
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ser = (ServiceProvider) ctx.getBean("ser");
    }

    @org.junit.Test
    public void testOCP() throws Exception {
        ser=new ServiceProviderImplem();
        Assert.assertEquals("Airtime",  ser.buyAirtime());
    }
}
