import java.util.ArrayList;
import java.util.List;

public class Bt_2 {
    public static void main(String[] args) {
        // B1: Tạo mảng 2 chiều và gọi hàm getArr() để gán
        int[][] arr = getArr();

        // B2: Tạo 2 List để lưu vị trí các số xuất hiện trong mảng 2 chiều
        List<Integer> rowPositions = new ArrayList<>();
        List<Integer> colPositions = new ArrayList<>();

        // B3: Tạo biến check mặc định là false
        boolean check = false;

        // B4: Duyệt qua mảng 2 chiều và tìm kiếm số trùng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // B5: Nếu số trùng, thêm vị trí vào 2 List và đặt check = true
                if (isDuplicate(arr, arr[i][j], i, j)) {
                    rowPositions.add(i);
                    colPositions.add(j);
                    check = true;
                }
            }
        }

        // B6: In ra các vị trí và trả về giá trị của biến check
        System.out.println("Các số trùng và vị trí:");
        for (int k = 0; k < rowPositions.size(); k++) {
            System.out.println("Số trùng: " + arr[rowPositions.get(k)][colPositions.get(k)] +
                    " | Vị trí: [" + rowPositions.get(k) + "][" + colPositions.get(k) + "]");
        }
        System.out.println("Trả về giá trị của biến check: " + check);
    }

    // Hàm tạo mảng 2 chiều ngẫu nhiên
    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    // Hàm kiểm tra số có xuất hiện trùng trong mảng 2 chiều không
    private static boolean isDuplicate(int[][] arr, int num, int row, int col) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num && (i != row || j != col)) {
                    count++;
                }
            }
        }
        return count > 0;
    }
}
