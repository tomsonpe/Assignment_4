package softwarePrinciples.DIP;

/**
 * Created by student on 2016/03/28.
 */
public class Managers {
    Employees emp;
    public void setEmployee(Employees emp)
    {
        this.emp=emp;
    }
    public void manage()
    {
        emp.work();
    }
}
