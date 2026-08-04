class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // DATOS ENTRADA: strs = ["eat", "tea", "tan"]

       // Mapa: Clave = palabra ordenada, Valor = lista de anagramas
        Map<String, List<String>> res = new HashMap<>(); // res = {}

        // Inicia el bucle -> 1ra vuelta: s = "eat"
        for (String s : strs) { 
            
            // Convierte String a arreglo -> charArray = ['e', 'a', 't']
            char[] charArray = s.toCharArray(); 
            
            // Ordena alfabéticamente -> charArray = ['a', 'e', 't']
            Arrays.sort(charArray); 
            
            // Vuelve a hacer un String -> key = "aet"
            String key = new String(charArray); 

            // ¿Existe "aet" en el mapa? No -> Agrega key con lista vacía: 
            if (!res.containsKey(key)) { 
                res.put(key, new ArrayList<>()); // res = {"aet": []}
            }

            // Busca la lista de "aet" y le agrega "eat" 
            res.get(key).add(s); // -> res = {"aet": ["eat"]}
        } 
        // Fin del bucle. El mapa final queda: 
        // {
        // "aet": ["eat", "tea", "ate"], 
        // "ant": ["tan", "nat"]
        // }

        // Extrae solo las listas -> [ ["eat", "tea", "ate"], ["tan", "nat"] ]
        return new ArrayList<>(res.values()); 
    }
}
