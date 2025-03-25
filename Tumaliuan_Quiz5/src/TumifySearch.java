import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TumifySearch {

    public static void main(String[] args) {
        Integer[] dataset = {5, 3, 8, 1, 2, 7, 4, 6};
        int target = 4;

        String result = tumifySearch(dataset, target);
        System.out.println(result);
    }

    public static String tumifySearch(Integer[] dataset, int target) {
        // Step 1: Randomly shuffle the dataset
        List<Integer> shuffledList = Arrays.asList(dataset);
        Collections.shuffle(shuffledList);

        // Step 2: Sequentially search through the shuffled dataset
        for (int index = 0; index < shuffledList.size(); index++) {
            if (shuffledList.get(index).equals(target)) {
                return "Found target at index: " + index;
            }
        }

        // Step 3: If target is not found
        return "Target not found";
    }
}