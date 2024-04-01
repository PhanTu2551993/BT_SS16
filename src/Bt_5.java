import java.util.Arrays;
import java.util.Scanner;

public class Bt_5 {
    public static void main(String[] args) {
        // B1: Tạo mảng ngẫu nhiên và sắp xếp
        Integer[] arr = getArr();

        // B2: Nhập số min và max từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();

        // B3: Tìm vị trí của số lớn nhất nhỏ hơn hoặc bằng min
        int minIndex = binarySearch(arr, min);
        if (minIndex < 0) {
            minIndex = -minIndex - 2;
        }

        // Tìm vị trí của số nhỏ nhất lớn hơn hoặc bằng max
        int maxIndex = binarySearch(arr, max);
        if (maxIndex < 0) {
            maxIndex = -maxIndex - 1;
        } else {
            maxIndex++;
        }

        // B4: In ra số lượng số tìm thấy và chi tiết số đó
        int count = maxIndex - minIndex;
        System.out.println("Số lượng số trong khoảng từ " + min + " đến " + max + ": " + count);
        if (count > 0) {
            System.out.println("Các số trong khoảng từ " + min + " đến " + max + ":");
            for (int i = minIndex; i < maxIndex; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Không có số nào trong khoảng từ " + min + " đến " + max);
        }
    }

    // Hàm tạo mảng ngẫu nhiên và sắp xếp
    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }

    // Hàm tìm kiếm nhị phân
    private static int binarySearch(Integer[] arr, int target) {
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
        return -left - 1; // Trả về vị trí của số lớn nhất nhỏ hơn hoặc bằng target
    }
}
