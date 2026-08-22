class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                // +1 porque el problema pide 1-indexed
                return new int[] { left + 1, right + 1 };
            } else if (currentSum > target) {
                right--; // Necesitamos una suma más pequeña
            } else {
                left++;  // Necesitamos una suma más grande
            }
        }

        return new int[] {};
    }
}
