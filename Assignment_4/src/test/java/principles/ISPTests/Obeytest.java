package principles.ISPTests;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.AppConfig;
import principles.ISP.Obey.Deposit;
import principles.ISP.Obey.DepositTrans;
import principles.ISP.Obey.WithDraw;
import principles.ISP.Obey.WithDrawTrans;

/**
 * Created by student on 2016/04/04.
 */
public class Obeytest {
    private Deposit dep;
    private WithDraw draw;
    @Test
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        dep = (Deposit) ctx.getBean("dep");
        draw=(WithDraw) ctx.getBean("draw");
    }
    @Test
    public void testISP() throws Exception {
        dep=new DepositTrans();
        Assert.assertEquals(500.00,dep.amntToDeposit());
        draw=new WithDrawTrans();
        Assert.assertEquals(500.00,draw.amntToWithDraw());

    }
}
