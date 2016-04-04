package principles.OCPTests;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.AppConfig;
import principles.OCP.Obey.ServiceProvideImplem;
import principles.OCP.Obey.ServiceProvider;

/**
 * Created by student on 2016/04/04.
 */
public class TestObey {
    private ServiceProvider ser;
    @Test
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ser = (ServiceProvider) ctx.getBean("ser");
    }
    @Test
    public void testOCP_v() throws Exception {
        ser=new ServiceProvideImplem();
        Assert.assertEquals("Airtime", ser.getService(1));
    }
}
