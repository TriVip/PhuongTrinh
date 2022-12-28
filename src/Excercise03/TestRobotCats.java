package Excercise03;

import java.util.Arrays;
import java.util.List;

public class TestRobotCats {

    public static void main(String[] args) {
//        RobotCat BatteryRobotCat = new BatteryRobotCat("Kitty", "26/12/2022", "AAA");
//        RobotCat SolarRobotCat = new SolarRobotCat();


//        SolarRobotCat.setName("Solar Energy Robot Cat");
//        SolarRobotCat.setProductionDate("26/12/2022");
//        System.out.println(SolarRobotCat.getName());
//        System.out.println(SolarRobotCat.getProductionDate());

        BatteryRobotCat BatteryRobotCatOld1 = new BatteryRobotCat("Kitty", "26/12/2022");
        BatteryRobotCat BatteryRobotCatOld2 = new BatteryRobotCat("Kitty", "26/12/2022");
        BatteryRobotCat BatteryRobotCatNew1 = new BatteryRobotCat("Kitty", "26/12/2022", "AAA");
        BatteryRobotCat BatteryRobotCatNew2 = new BatteryRobotCat("Kitty", "26/12/2022", "AAA");

        TestRobotCats testRobotCats = new TestRobotCats();
        testRobotCats.checkCatTypes(Arrays.asList(
                BatteryRobotCatNew1,
                BatteryRobotCatNew2,
                BatteryRobotCatOld1,
                BatteryRobotCatOld2
        ));

        SolarRobotCat solarRobotCat = new SolarRobotCat();
        solarRobotCat.charge();
        BatteryRobotCatNew1.charge();
    }

    public void checkCatTypes(List<BatteryRobotCat> batteryRobotCats){
        int totalCatOldType = 0;
        int totalCatNewType = 0;

        for (BatteryRobotCat robotCat : batteryRobotCats) {
            if(robotCat.getBatteryType() == null)
                totalCatOldType++;
            else
                totalCatNewType++;
        }

        System.out.printf("Total cat old type %d \n", totalCatOldType);
        System.out.printf("Total cat new type %d", totalCatNewType);
    }
}
