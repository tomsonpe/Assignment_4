package principles.LSP;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.AppConfig;
import principles.LSP.Violate.Designer;

/**
 * Created by student on 2016/04/04.
 */
public class TestViolate {
    private Designer design;
    @Test
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        design= (Designer) ctx.getBean("design");
    }

    @Test
    public void testObey() throws Exception {
        design=new Designer();
        design.setWorkerID("214162966");
        Assert.assertEquals("214162966", design.getWorkerId());

    }

}
