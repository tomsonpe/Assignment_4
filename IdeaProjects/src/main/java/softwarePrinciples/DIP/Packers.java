package softwarePrinciples.DIP;

/**
 * Created by student on 2016/03/28.
 */
public class Packers implements Employees
{
    String packersTypeOfWork="Packing";
    public String work()
    {
        return packersTypeOfWork;
    }
}
