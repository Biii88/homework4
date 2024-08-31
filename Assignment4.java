
package assignment4;
import java.util.Scanner;
public class Assignment4 {
    public static float[] importData(float[] mang) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextFloat();
        }
        return mang;
    }
    public static void printData(float[] mang) {
        System.out.print("Mang gom : ");
        for (float so : mang) {
            System.out.print(so + " ");
        }
        System.out.println();
    }
    public static float findMax2(float[] mang) {
        float max = Float.MIN_VALUE,max2 = Float.MIN_VALUE;
        for (float so : mang) {
            if (so > max) {
                max2 = max;
                max = so;
            } else if (so > max2 && so < max) {
                max2 = so;
            }
        }
        return max2;
    }
    public static float[] deleteOddNumber(float[] mang) {
        int demSoChan = 0;
        for (float so : mang){
            if (so % 2 == 0){
                demSoChan++;
            }
        }
        float[] mangSoChan = new float[demSoChan];
        int chiSo = 0;
        for (float so : mang){
            if (so % 2 ==0){
                mangSoChan[chiSo++] = so;
            }
        }
        return mangSoChan;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int kichThuoc = scanner.nextInt();
        float[] mang = new float[kichThuoc];
        mang = importData(mang);
        printData(mang);
        float lonThuHai = findMax2(mang);
        System.out.println("Phan tu lon thu 2 trong mang: " + lonThuHai);
        float[] mangSoChan = deleteOddNumber(mang);
        System.out.print("Mang sau khi xoa cac so le: ");
        printData(mangSoChan);
    }
}