package principles.LSP.Obey;

/**
 * Created by student on 2016/04/04.
 */
public class GraphicDesigner extends Worker{
    private String name;
    private String workerId;

    public void setWorkerName(String fullName){
        name = fullName;
    }
    public void setWorkerID(String id){
        workerId = id;
    }
    public String getEmployeeName(){
        return name;
    }
    public String getWorkerId(){
        return workerId;
    }
}
