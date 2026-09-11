import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);

        // Step 2: Fix the first element (i)
        for (int i = 0; i < nums.length - 2; i++) {
            // Optimization: If the smallest available number is > 0, 
            // three positive numbers can never add up to 0
            if (nums[i] > 0) {
                break;
            }

            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3: Two-pointer scan for the remaining two elements
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Valid triplet found
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip identical elements to avoid duplicate triplets
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move pointers to the next new values
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small -> increase the left pointer
                    left++;
                } else {
                    // Sum is too large -> decrease the right pointer
                    right--;
                }
            }
        }

        return result;
    }
}