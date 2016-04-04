package principles.ISP.violate;

/**
 * Created by student on 2016/04/04.
 */
public class WithdrawTrans implements Transaction {
    public String execute()
    {
        return "WithDraw executing...";
    }
    public double getAmount()
    {
        return 500.00;
    }
}
