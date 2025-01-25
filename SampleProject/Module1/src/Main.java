public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = -8;
        numbers[8] = 175;
        numbers[9] = 65;

        // before sorting
        System.out.print("Before Selection Sort: ");
        printArrayElement(numbers);

        selectionSort(numbers);

        // after sorting
        System.out.print("\n\nAfter Selection Sort: ");
        printArrayElement(numbers);
    }

    private static void bubbleSort(int[] nums) {
        for (int unsortedPartitionIndex = nums.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--) {
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                // Change comparison to sort in descending order
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }
    private static void selectionSort(int[] nums) {
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = 0;
            for (int i = smallest + 1; i <= lastUnsortedIndex; i++) {
                // Find the smallest value
                if (nums[i] < nums[smallest]) {
                    smallest = i;
                }
            }
            // Swap the smallest value with the last unsorted index
            if (smallest != lastUnsortedIndex) {
                int temp = nums[smallest];
                nums[smallest] = nums[lastUnsortedIndex];
                nums[lastUnsortedIndex] = temp;
            }
        }
        // Reverse the array to get it in descending order
        reverseArray(nums);
    }

    private static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    private static void printArrayElement(int[] nums) {
        // shorthand for 'for (int i = 0; i < nums.length; i++)'
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
