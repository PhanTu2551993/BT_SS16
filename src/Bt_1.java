import java.util.Scanner;

public class Bt_1 {
    // Bước 1: Hàm để lấy mảng số nguyên
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100); // Sinh số ngẫu nhiên từ 0 đến 99
        }
        return arr;
    }
    // Bước 2: Hàm để in ra mảng số nguyên
    public static void printArr(int[] arr) {
        System.out.println("Mảng số nguyên:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Bước 3: Thuật toán tuyến tính để tìm số lớn nhất trong mảng
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Bước 1: Gọi hàm để lấy mảng số nguyên
        int[] arr = getArr();

        // Bước 2: In ra mảng số nguyên
        printArr(arr);

        // Bước 3: Tìm số lớn nhất trong mảng
        int max = findMax(arr);

        // Bước 4: In số lớn nhất ra màn hình
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
