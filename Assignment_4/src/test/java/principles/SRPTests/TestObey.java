package principles.SRPTests;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.AppConfig;
import principles.SRP.Obey.Student;
import principles.SRP.Obey.StudentImplem;

/**
 * Created by student on 2016/04/04.
 */
public class TestObey {
    private Student stud;
    @Test
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        stud = (Student) ctx.getBean("stud");
    }

    @Test
    public void testSRP_violate() throws Exception {
        stud=new StudentImplem();
        Assert.assertEquals("Phinda",stud.displayStudentName());
        Assert.assertEquals("214162966",stud.displayStudentUsername());
    }
}
