package principles.LSP;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.AppConfig;
import principles.LSP.Obey.Worker;

/**
 * Created by student on 2016/04/04.
 */
public class TestObey {
    private Worker work;
    @Test
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        work = (Worker) ctx.getBean("work");
    }

    @Test
    public void testObey() throws Exception {
        work=new Worker();
        work.setWorkerID("214162966");
        Assert.assertEquals("214162966",work.getWorkerId());

    }
}
