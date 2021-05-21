import java.util.Scanner;

public class MatrixArry {
    static void MatArry() {
        int dong = 2;
        int cot = 3;
        Scanner sc = new Scanner(System.in);
        int[][] mtArry1 = new int[dong][cot];
        System.out.println(" Nhập phần tử cho mảng 1: ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                mtArry1[i][j] = sc.nextInt();
                System.out.print(mtArry1[i][j] + "\t");
                // System.out.println( "Phần tử ở vị trí " + i + "-" + j +" là : " + mtArry1[i][j]);
            }
            System.out.print("\n");
        }

        int[][] mtArry2 = new int[dong][cot];
        System.out.println(" Nhập phần tử cho mảng 2: ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                mtArry2[i][j] = sc.nextInt();
                //System.out.println( "Phần tử ở vị trí " + i + "-" + j +" là : " + mtArry1[i][j]);
            }
        }

//        //Cộng 2 ma trận
//        int[][] mtSum = new int[dong][cot];
//        System.out.println(" Ma trận tổng ");
//        for (int i = 0; i < dong; i++) {
//            for (int j = 0; j < cot; j++) {
//                mtSum[i][j] = mtArry1[i][j] + mtArry2[i][j];
//                System.out.println("Phần tử ở vị trí " + i + "-" + j + " là : " + mtSum[i][j]);
//            }
//        }

//        //Ma trận chuyển vị - ma trận 1
        int[][] mtTranspose = new int[cot][dong];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                mtTranspose[j][i] = mtArry1[i][j];
            }
        }
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < dong; j++) {
                System.out.print(mtTranspose[i][j] + "\t");
            }
            System.out.print("\n");
        }

        //Ma trận chuyển vị ma trận 2
        int[][] mtTranspose1 = new int[cot][dong];
        int tam = 0;
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                tam = mtArry2[i][j];
                mtArry2[i][j] = mtTranspose1[j][i];
                mtTranspose1[j][i] = tam;
            }
        }
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < dong; j++) {
                System.out.print(mtTranspose1[i][j] + "\t");
            }
            System.out.print("\n");
        }


    }
}
