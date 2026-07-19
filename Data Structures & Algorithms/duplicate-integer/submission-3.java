class Solution {
    public boolean hasDuplicate(int[] nums) {
        // [1, 2, 3, 3]
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }

        return false;
    }
}