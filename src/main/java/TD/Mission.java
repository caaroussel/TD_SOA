package TD;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
public class Mission {
    private String name;
    private String status;


    public Mission(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName()
    {
        return name;
    }
    public String getStatus()
    {
        return status;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    public Mission() {

    }

}
