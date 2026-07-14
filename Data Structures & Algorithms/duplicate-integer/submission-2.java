class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        // [2, 1, 2] | =>  [2, 1]
        // [ [] , [] , [] ] == 
        //    . 

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }

        return false;

    }
}