import java.util.Scanner;

public class Bt_4 {
    public static void main(String[] args) {
        // B1: Tạo mảng cho sẵn phần tử (lưu ý nhập đừng thứ tự tăng dần)
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // B2: Lấy số cần tìm từ Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm trong mảng: ");
        int target = scanner.nextInt();

        // B3: Tìm số lớn nhất trong mảng và in ra
        int max = arr[arr.length - 1];
        System.out.println("Số lớn nhất trong mảng là: " + max + " tại vị trí " + (arr.length - 1));

        // Tìm kiếm nhị phân và in ra vị trí của số cần tìm
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
    }

    // Hàm tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }
}
