class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftNumber = 0;
        int rightNumber = numbers.length - 1;
        while (leftNumber < rightNumber) {
            int currentNumber = numbers[leftNumber] + numbers[rightNumber];
            if (currentNumber == target) {
                return new int[] {leftNumber + 1, rightNumber + 1};
            } else if (currentNumber < target) {
                leftNumber++;
            } else {
                rightNumber--;
            }
        }
        return new int[] {};
    }
}