package principles.LSP.Obey;

/**
 * Created by student on 2016/04/04.
 */
public class Worker {
    private String name;
    private String workerId;

    public void setWorkerName(String fullName){
        name = fullName;
    }
    public void setWorkerID(String id){
        workerId = id;
    }
    public String getWorkerName(){
        return name;
    }
    public String getWorkerId(){
        return workerId;
    }
}
