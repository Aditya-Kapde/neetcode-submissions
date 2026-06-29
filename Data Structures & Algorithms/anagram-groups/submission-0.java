
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to group strings by their sorted form.
        Map<String, List<String>> map = new HashMap<>();
        
        // Process each string in the array.
        for (String s : strs) {
            // Convert the string to a character array and sort it.
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            // Use the sorted string as a key.
            String key = new String(charArray);
            
            // If the key is not in the map, add it with a new list.
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // Add the original string to the corresponding list.
            map.get(key).add(s);
        }
        
        // Return all the grouped lists.
        return new ArrayList<>(map.values());
    }
}

