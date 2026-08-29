class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            
            if (map.containsKey(sortedWord)) {
                map.get(sortedWord).add(word);
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(word);
                map.put(sortedWord, newGroup);
            }
        }
        return new ArrayList<>(map.values());
    }
}