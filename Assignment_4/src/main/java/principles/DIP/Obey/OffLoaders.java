package principles.DIP.Obey;

/**
 * Created by student on 2016/04/04.
 */
public class OffLoaders implements Employees {
    String offLoaderTypeOfWork="off-load staff";
    public String work() {
        return offLoaderTypeOfWork;
    }
}
