class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count the frequency of each number using a HashMap
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);   
        }

        // count = { 1:1, 2:2, 3:3 }

        // 2. Create the bucket array. The index represents the frequency (0 to N)
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // 3. Place each number into its corresponding frequency bucket
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            buckets[count].add(num);
        }

        // 4. Iterate backwards from highest frequency to collect the top K elements
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            for(int num : buckets[i]) {
                result[index] = num;
                index++;
                // Early exit once we have gathered k elements
                if (index == k) {
                    return result;
                }
            }
        }

        return result;

    }
}
