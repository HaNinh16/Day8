import java.util.Scanner;

public class ElementArry {
    public static void EArry() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập só phần tử cho mảng : ");
        int n = sc.nextInt();

        System.out.print("\nNhập phần tử cho mảng : ");
        int[] elArry = new int[n];
        for (int i = 0; i < n; i++) {
            elArry[i] = sc.nextInt();
        }
        //In số nguyên
        System.out.print("\nSố nguyên trong mảng : ");
        for (int i = 0; i < n; i++) {
            if (ElementArry.EleArry(elArry[i])) {
                System.out.print(elArry[i] + "\t");
            }
        }
        //Tính tổng số nguyên
        System.out.print("\nTổng số nguyên trong mảng : ");
        int sumele = 0;
        for (int i = 0; i < n; i++) {
            if (ElementArry.EleArry(elArry[i])) {
                sumele = sumele + elArry[i];

            }
        }
        System.out.print(sumele);

        //Nhập vị trí K
        System.out.print("\nNhập vị trí k : ");
        int k = sc.nextInt();
        int l = 0;
        if (k > elArry.length) {
            System.out.print("\nMảng ko có phẩn tử ở vị trí " + k);
        } else {
            System.out.print("\nNhập giá trị thay thế : ");
            l = sc.nextInt();
            elArry[k] = l;
            System.out.print("Phần tử mảng sau khi cập nhật giá trị : ");
            for (int i = 0; i <elArry.length; i++){
                System.out.print(elArry[i]+ "\t");
            }
        }



    }

    public static boolean EleArry(int n) {

        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

