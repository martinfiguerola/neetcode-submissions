class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        // { 1:1, 2:2, 3:2 }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){ 
            bucket[entry.getValue()].add(entry.getKey()); 
        }

        int[] res = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i > 0; i--){
            // { 0:[], 1:[1], 2:[2,3], 3[], 4:[], 5:[] }
            //                    ^ 
            for (int num : bucket[i]){
                // [2, 3]
                //  ^
                res[index++] = num;
                if(index == k) return res;
            }
        }
        return res;
    }
}
