package TD;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(serviceName="UserService")
public class UserService {
    @WebMethod(operationName = "addUser")
    public void addUser (@WebParam(name = "NHelpUser") NHelpUser user)
    {
        System.out.println("User with the name " + user.getName() + "the age " + String.valueOf(user.getAge()) + " and mission name" + user.getMission().getName());
    }
    @WebMethod(operationName = "GetUserWithID")
    public NHelpUser getUserWithID (@WebParam(name = "id") int id)
    {
        NHelpUser user = new NHelpUser();
        user.setAge(id);
        user.setName("test");
        Mission mission = new Mission();
        mission.setName("TestMission");
        mission.setStatus("StatusMission");
        user.setMission(mission);
        return user;
    }

}
