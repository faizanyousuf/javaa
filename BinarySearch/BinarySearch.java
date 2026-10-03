public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 4, 9, 2, 5, 9 };

        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        binarySearch(arr, 10);
        binarySearch(arr, 5);

    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    swap(arr, i, j);
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == value) {
                System.out.println("Value "+value+" Found! At index = " + mid);
                return;
            }
            if (arr[mid] < value) {
                low = mid + 1;
            } else if (arr[mid] > value) {
                high = mid - 1;
            }
        }
        System.out.println("value "+ value + " Not Found!");
    }
}
