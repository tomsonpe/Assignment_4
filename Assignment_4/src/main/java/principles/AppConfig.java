package principles;

import org.springframework.context.annotation.Bean;
import principles.DIP.Obey.Employees;
import principles.DIP.Obey.OffLoaders;
import principles.ISP.Obey.Deposit;
import principles.ISP.Obey.DepositTrans;
import principles.ISP.Obey.WithDraw;
import principles.ISP.Obey.WithDrawTrans;
import principles.ISP.violate.Transaction;
import principles.ISP.violate.WithdrawTrans;
import principles.LSP.Obey.Worker;
import principles.LSP.Violate.Designer;
import principles.OCP.Violate.ServiceProvider;
import principles.OCP.Violate.ServiceProviderImplem;
import principles.SRP.Obey.Student;
import principles.SRP.Obey.StudentImplem;
import principles.SRP.Violate.StudentNameImplem;
import principles.SRP.Violate.StudentNames;
import principles.SRP.Violate.StudentUserNames;
import principles.SRP.Violate.StudentUsernameImplem;

/**
 * Created by student on 2016/04/04.
 */
public class AppConfig {
    @Bean(name="emp")
    public Employees work() {return new OffLoaders();}

    @Bean(name="stud")
    public Student getStud() {return new StudentImplem();}

    @Bean(name="vio1")
    public StudentNames getStudName() {return new StudentNameImplem();}
    @Bean(name="vio2")
    public StudentUserNames getStudUsername() {return new StudentUsernameImplem();}

    @Bean(name="ser")
    public ServiceProvider getService() {return new ServiceProviderImplem();}

    @Bean(name="dep")
    public Deposit getDeposit(){return new DepositTrans();}

    @Bean(name="draw")
    public WithDraw getWithdrawal(){return new WithDrawTrans();}

    @Bean(name="trans1")
    public Transaction getTrans1(){return (Transaction) new DepositTrans();}
    @Bean(name="trans2")
    public Transaction getTrans2(){return  new WithdrawTrans();}

    @Bean(name="work")
    public Worker getWorker(){return  new Worker();}

    @Bean(name="work")
    public Designer getDesigner(){return  new Designer();}
}
