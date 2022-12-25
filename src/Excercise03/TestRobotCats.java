package Excercise03;

public class TestRobotCats {

    public static void main(String[] args) {
        RobotCat BatteryRobotCat = new BatteryRobotCat();
        RobotCat SolarRobotCat = new SolarRobotCat();

        BatteryRobotCat.setName("Battery Robot Cat");
        BatteryRobotCat.setProductionDate("26/12/2022");

        SolarRobotCat.setName("Solar Energy Robot Cat");
        SolarRobotCat.setProductionDate("26/12/2022");

        System.out.println(BatteryRobotCat.getName());
        System.out.println(BatteryRobotCat.getProductionDate());
        System.out.println(SolarRobotCat.getName());
        System.out.println(SolarRobotCat.getProductionDate());

    }
}
