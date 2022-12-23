import java.util.ArrayList;
import java.util.List;
public class ArrayListLearning {
    public static void main(String[] args) {
//        //Declaration
//        List<String> myStringList = new ArrayList<>();
//        Integer[] myNums = {1,2,3};
//        List<Integer> myIntList = new ArrayList<>();
//        myIntList.add(4);
//
//        //Add value into an array list | add
//        myStringList.add("1");
//        myStringList.add("5");
//        myStringList.add("2");
//        myStringList.add("4");
//
//        //get value
//        String valueIndex1 = myStringList.get(1);
//        System.out.println("Value index 1: " + valueIndex1);
//
//        //Insert a value into an array list | add
//        myStringList.add(2, "3");
//
//        //loop
//        for (String s : myStringList){
//            System.out.println(s);
//        }
//
//        //update value
//        myStringList.set(3,"5");
//
//        //remove a value from array list | remove
//        myStringList.remove(3);
//        myStringList.remove(2);
//
//        for (int elementIndex = 0; elementIndex < myStringList.size(); elementIndex++){
//            System.out.println("Element " + (elementIndex+1) + ":" + myStringList.get(elementIndex));
//        }
//        //Check element existences
//        boolean is6exesting = myStringList.contains("6");
//        System.out.println("Is 6 existing: " + is6exesting);

        //Remove duplicated elements without use set
        List<String> duplicatedValues = new ArrayList<>();
        duplicatedValues.add("A");
        duplicatedValues.add("B");
        duplicatedValues.add("C");
        duplicatedValues.add("D");
        duplicatedValues.add("E");
        duplicatedValues.add("A");
        duplicatedValues.add("B");

        List<String> listWithoutDuplicated = new ArrayList<>();
        for (String letter : duplicatedValues){
            if(!listWithoutDuplicated.contains(letter)){
                listWithoutDuplicated.add(letter);
            }
        }

        for (String letter : listWithoutDuplicated){
            System.out.println(letter);
        }
    }
}
