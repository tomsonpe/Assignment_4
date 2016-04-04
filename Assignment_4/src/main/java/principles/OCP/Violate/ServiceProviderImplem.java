package principles.OCP.Violate;

/**
 * Created by student on 2016/04/04.
 */
public class ServiceProviderImplem implements ServiceProvider {
    public String buyAirtime()
    {
        return "Airtime";
    }
    public String buyData()
    {
        return "Buying Data";
    }
}
