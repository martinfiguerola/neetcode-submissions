class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = -1; 

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];   // 1. Guardamos el valor original
            arr[i] = max;        // 2. Reemplazamos con el máximo que venía de la derecha
            max = Math.max(max, temp); // 3. Actualizamos el máximo para la izquierda
        }
        
        return arr;

    }
}