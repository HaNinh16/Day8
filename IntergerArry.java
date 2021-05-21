import java.util.Scanner;

public class IntergerArry {
    static void IntArry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử cho mảng : ");
        int size = sc.nextInt();

        //Nhập giá trị cho mảng
        int intArry[] = new int[size];
        System.out.println(" Nhập giá phần tử của mảng ");
        for (int i = 0; i < intArry.length; i++) {
            // System.out.println("Nhập số phần tử thứ " + i + " : ");
//            Scanner sc2 = new Scanner(System.in);
            intArry[i] = sc.nextInt();
        }
        for (int i = 0; i < intArry.length; i++) {
            System.out.println("Phần tử thứ " + i + " của mảng là : " + intArry[i]);
        }

        //Tính tổng phần tử của mảng
        int tong = 0;
        for (int i = 0; i < intArry.length; i++) {
            tong = tong + intArry[i];
        }
        System.out.println("Tổng các phần tử của mảng là : " + tong);

        //Tính tổng các số chẵn
        int tongChan = 0;
        for (int i = 0; i < intArry.length; i++) {
            if (intArry[i] % 2 == 0) {
                tongChan = tongChan + intArry[i];
            }
        }
        System.out.println("Tổng các số chẵn trong mảng : " + tongChan);

//        //Sắp xếp tăng dần
//        int temp = intArry[0];
//        for (int i = 0; i < intArry.length; i++){
//            for (int j = i +1; j < intArry.length; j++){
//                if (intArry[i] > intArry[j]){
//                    temp = intArry[i];
//                    intArry[i] = intArry[j];
//                    intArry[j] = temp;
//                }
//            }
//        }
//        System.out.println("Phần tử lớn nhất : " + intArry[intArry.length -1]);
//        System.out.println("Phần tử nhỏ nhất : " + intArry[0]);
//        System.out.println("Phần tử lớn thứ hai : " + intArry[intArry.length - 2]);

        //Tìm số lớn nhất
        int max = intArry[0];
        int inDex = 0;
        for (int i = 0; i < intArry.length; i++){
            if (max < intArry[i]){
                max = intArry[i];
                inDex = i;
            }
        }
        System.out.println("Phần tử lớn nhất : " + max + " Index của phẩn tử : " + inDex);

        //Tìm số nhỏ nhất
        int min = intArry[0];
        int inDex2 = 0;
        for (int i = 0; i < intArry.length; i++){
            if (min > intArry[i]){
                min = intArry[i];
                inDex2 = i;
            }
        }
        System.out.println("Phần tử nhỏ nhất : " + min + " Index của phẩn tử : " + inDex2);

        //Tìm số lớn thứ 2
        int max2 = intArry[0];
        int inDex3 = 0;
        for (int i = 0; i < intArry.length; i++){
            if (max2 < intArry[i] && intArry[i] != max){
                max2 = intArry[i];
                inDex3 = i;
            }
        }
        System.out.println("Phần tử lớn thứ 2 : " + max2 + " Index của phẩn tử : " + inDex3);


    }
}
