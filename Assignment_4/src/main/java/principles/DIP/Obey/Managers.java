package principles.DIP.Obey;

/**
 * Created by student on 2016/04/04.
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
