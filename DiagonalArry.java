import java.util.Scanner;

public class DiagonalArry {
    static void DiaArry() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số dòng : ");
        int dong = sc.nextInt();
        System.out.println("Nhập số cột : ");
        int cot = sc.nextInt();

        //Nhập phần tử cho mảng
        int[][] diaArry = new int[dong][cot];
        System.out.print("Nhập phần tử cho mảng : ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                diaArry[i][j] = sc.nextInt();
                System.out.print(diaArry[i][j] + "\t");
            }
            System.out.print("\n");
        }

        //In phần tử trên đg chéo chính
        int sumDia = 0;
        System.out.print("Đường chéo chính của ma trận vuông : ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (i == j) {
                    System.out.print(diaArry[i][j] + "\t");
                    sumDia = sumDia + diaArry[i][j];
                }
            }

        }
        System.out.println("\nTổng phần tử đg chéo chính: " + sumDia);

        //Sắp xếp hàng 2 tăng dần
        int tam = diaArry[1][0];
        System.out.print("Sắp xếp hàng 2 : ");
        for (int i = 0; i < cot; i++) {
            for (int j = i + 1; j < cot; j++) {
                if (diaArry[1][i] > diaArry[1][j]) {
                    tam = diaArry[1][i];
                    diaArry[1][i] = diaArry[1][j];
                    diaArry[1][j] = tam;

                }
            }
            System.out.print(diaArry[1][i] + "\t");
        }

    }
}
