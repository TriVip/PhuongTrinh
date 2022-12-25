package Exercise01;

import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
//        int[] myArr = {3,5,7,2,6};
//        int total = 0;
//        for(int curArr =0; curArr < myArr.length; curArr++){
//            total = total + myArr[curArr];
//            System.out.println(myArr[curArr]);
//        }
//        int trungbinhcong = total / myArr.length;
//        System.out.println("Trung binh cong mang cac so nguyen:" + trungbinhcong);
        Scanner scanner = new Scanner(System.in);
        int[] myArr = new int[5];
        int total = 0;
        for(int curArr = 0; curArr < myArr.length; curArr++){
            System.out.println("Nhap vao so thu " + (curArr+1)+":");
            myArr[curArr] = scanner.nextInt();
        }
        for(int i = 0; i < myArr.length; i++){
            total = total + myArr[i];
        }
        int trungbinhcong = total/myArr.length;
        System.out.println("Ket qua trung binh cong cac so" + trungbinhcong);
    }
}
