package softwarePrinciples.DIP;

/**
 * Created by student on 2016/03/28.
 */
public class OffLoaders implements Employees {
    String offLoaderTypeOfWork="off-load staff";
    public String work() {
        return offLoaderTypeOfWork;
    }
}
