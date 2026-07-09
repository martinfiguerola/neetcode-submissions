class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> table = new HashSet<>();
        
        for ( int e : nums) {
            if(table.contains(e)) {
                return true;
            }else{
                table.add(e);
            }
        }

        return false;
    }
}