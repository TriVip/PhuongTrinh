package Exercise;

import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
        System.out.println("Input a number:");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        for(int currentNum = inputNum; currentNum > 0; currentNum--){
            for (int a = inputNum; a >= currentNum; a--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------"); //=> IN TAM GIAC XUOI

//        for(int currentNum = inputNum; currentNum > 0; currentNum--){
//            for (int a = 1; a <= currentNum; a++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("--------------");  // => IN TAM GIAC NGUOC
    }
}
