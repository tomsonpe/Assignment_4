package principles.DIP.Obey;

/**
 * Created by student on 2016/04/04.
 */
public class Packers implements Employees {
    String packersTypeOfWork="Packing";
    public String work()
    {
        return packersTypeOfWork;
    }
}
