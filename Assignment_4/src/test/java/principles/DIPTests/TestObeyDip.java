package principles.DIPTests;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.AppConfig;
import principles.DIP.Obey.Employees;
import principles.DIP.Obey.OffLoaders;
import principles.DIP.Obey.Packers;

/**
 * Created by student on 2016/04/04.
 */
public class TestObeyDip {
    private Employees emp;

    @Test
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        emp = (Employees) ctx.getBean("emp");
    }
    @Test
    public void testDIP_1() throws Exception{
        emp=new OffLoaders();
        Assert.assertEquals("off-load staff", emp.work());
    }

    @Test
    public void testDIP_2() throws Exception {
        emp=new Packers();
        Assert.assertEquals("Packing",emp.work());
    }
}
