package TD;

public class NHelpUser {
    private String name;
    private int age;
    private Mission mission;

    public NHelpUser(String name, int age, Mission mission)
    {
        this.name = name;
        this.age = age;
        this.mission = mission;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public Mission getMission()
    {
        return mission;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setMission(Mission mission)
    {
        this.mission = mission;
    }
    public NHelpUser()
    {

    }
}
