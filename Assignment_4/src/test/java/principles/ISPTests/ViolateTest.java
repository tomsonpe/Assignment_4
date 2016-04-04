package principles.ISPTests;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.AppConfig;
import principles.ISP.violate.DepositTrans;
import principles.ISP.violate.Transaction;
import principles.ISP.violate.WithdrawTrans;

/**
 * Created by student on 2016/04/04.
 */
public class ViolateTest {
    private Transaction trans1,trans2;
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        trans1 = (Transaction) ctx.getBean("trans1");
        trans2=(Transaction) ctx.getBean("trans2");
    }
    @Test
    public void testViolateISP() throws Exception {
        trans1=new DepositTrans();
        Assert.assertEquals(500.00,trans1.getAmount());
        trans2=new WithdrawTrans();
        Assert.assertEquals(500.00,trans2.getAmount());
    }
}
