package softwarePrinciples.OCP.violate;

/**
 * Created by student on 2016/03/28.
 */
public class serviceProvidersImplem implements serviceProviders {
    public String service(int choose)
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
