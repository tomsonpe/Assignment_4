package principles.SRPTests;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.AppConfig;
import principles.SRP.Violate.StudentNameImplem;
import principles.SRP.Violate.StudentNames;
import principles.SRP.Violate.StudentUserNames;
import principles.SRP.Violate.StudentUsernameImplem;

/**
 * Created by student on 2016/04/04.
 */
public class TestViolate {
    private StudentNames vio1;
    private StudentUserNames vio2;
    @Test
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        vio1 = (StudentNames) ctx.getBean("vio1");
        vio2 = (StudentUserNames) ctx.getBean("vio2");
    }

    @Test
    public void testSRP_obey() throws Exception {
        vio1=new StudentNameImplem();
        Assert.assertEquals("Phinda", vio1.displayNameOfStudent());
    }
    @Test
    public void testSRP_violate() throws Exception{
        vio2=new StudentUsernameImplem();
        Assert.assertEquals("214162966", vio2.displayStudentUsername());
    }
}
