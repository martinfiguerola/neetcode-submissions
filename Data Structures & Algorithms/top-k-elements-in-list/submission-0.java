class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Contar frecuencias de cada número
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 2. Crear los buckets. El índice representa la frecuencia (de 0 a N)
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // buckets = [ 0: [], 1: [], 2: [], 3: [], 4: [], 5: [], 6: [] ]

        // 3. Colocar los números en sus correspondientes buckets de frecuencia
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        // buckets = [ 0: [], 1: [3], 2: [2], 3: [1], 4: [], 5: [], 6: [] ]

        // 4. Recorrer de atrás hacia adelante para tomar los k más frecuentes
        // k = 2
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            for (int num : buckets[i]) {
                result[index] = num;
                index++;
                if (index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
