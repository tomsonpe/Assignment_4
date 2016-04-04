package softwarePrinciples;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import softwarePrinciples.Config.AppConfig;
import softwarePrinciples.SRP.violate.student;
/**
 * Created by student on 2016/03/28.
 */
public class TestSRP_violate {
    private student stud;
    @Test
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        stud = (student) ctx.getBean("stud");
    }

    @Test
    public void testSRP_violate() throws Exception {
        Assert.assertEquals("Phinda",stud.displayStudentName());
        Assert.assertEquals("214162966",stud.displayStudentUsername());
    }
}
