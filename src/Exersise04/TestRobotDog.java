package Exersise04;

public class TestRobotDog {

    public static void main(String[] args) {
        BatteryRobotDog robotDog1 = new BatteryRobotDog("LuLU");
//        System.out.println(robotDog1.getId());
        System.out.println(robotDog1.getDefaultName());

        SolarEnergyRobotDog robotDog2 = new SolarEnergyRobotDog("Mina");
//        System.out.println(robotDog2.getId());
        System.out.println(robotDog2.getDefaultName());
    }
}
