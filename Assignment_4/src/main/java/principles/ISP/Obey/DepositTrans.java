package principles.ISP.Obey;

/**
 * Created by student on 2016/04/04.
 */
public class DepositTrans implements Deposit{
    public String execute()
    {
        return "depositing";
    }
    public double amntToDeposit()
    {
        execute();
        return 500.00;
    }
}
