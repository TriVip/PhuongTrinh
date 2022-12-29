package Exersise04;

public class RobotDog {
    private String name;
    private int id;
    protected static int counter = 0;
    protected static String defaultName = "RobotDog";


    public RobotDog() {
    }

    public RobotDog(String name) {
        this.name = name;
        counter++;
        this.id = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected static void doSth(){
        System.out.println("Gau Gau");
    }

    protected String getDefaultName(){
        return defaultName;
    }
}
