import java.util.Scanner;

public class Bt_3 {
    public static void main(String[] args) {
        // B1: Tạo mảng cho sẵn phần tử
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // B2: Lấy số cần tìm từ Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm trong mảng: ");
        int target = scanner.nextInt();

        // B3: Tìm số lớn nhất trong mảng và in ra
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max + " tại vị trí " + maxIndex);

        // Tìm kiếm tuyến tính và in ra vị trí của số cần tìm
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Số " + target + " được tìm thấy tại vị trí " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
    }
}
