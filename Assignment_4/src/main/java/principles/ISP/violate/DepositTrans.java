package principles.ISP.violate;

/**
 * Created by student on 2016/04/04.
 */
public class DepositTrans implements Transaction{
    public String execute()
    {
        return "Deposit executing...";
    }
    public double getAmount()
    {
        return 500.00;
    }
}
