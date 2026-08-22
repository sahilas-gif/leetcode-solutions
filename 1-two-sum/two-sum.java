class Solution {
    public static int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                } 
            }
        } 
        return new int[]{-1,-1};         
}

public static void main(String[] args) {
    int[] array = {2,7,11,15};
    int target = 9;

    int[] result = twoSum(array, target);

    if(result[0] != -1){
        System.out.print("Index is at " + result[0] + "," + result[1]);
    } else {
        System.out.println("Number is not present");
    } 
}
}