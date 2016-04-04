package principles.OCP.Obey;

/**
 * Created by student on 2016/04/04.
 */
public class ServiceProvideImplem implements ServiceProvider {
    public String getService(int choose)
    {
        String massage="";
        switch(choose)
        {
            case 1:massage="Airtime";
                break;
            case 2:massage="Data";

        }
        return massage;
    }
}
