import java.util.Scanner;

public class StringArry {
    static void StrArry() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Số phần tử cho mảng string : ");
//        int size = sc.nextInt();
        int size = Integer.valueOf(sc.nextLine());

        String[] stArry = new String[size];
//        sc.nextLine();
        System.out.println("\n Nhập giá trị mảng chuỗi :");
        for (int i = 0; i < stArry.length; i++) {
            stArry[i] = sc.nextLine();
        }
        int count = 0;
        String s = "Java";
        for (int i = 0; i < stArry.length; i++) {
            System.out.println(" Phần tử thứ " + i + " là : " + stArry[i]);
            if (stArry[i].contains(s)) {
                count++;
            }
        }

       
        System.out.println("Số lần xuất hiện Java trong mảng : " + count);

    }
}
