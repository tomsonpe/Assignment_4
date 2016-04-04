package principles.ISP.Obey;

/**
 * Created by student on 2016/04/04.
 */
public class WithDrawTrans implements WithDraw {
    public String execute()
    {
        return "withDraw";
    }
    public double amntToWithDraw()
    {
        execute();
        return 500.00;
    }
}
