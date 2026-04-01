class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> result = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorteds = new String(c);
            result.putIfAbsent(sorteds,new ArrayList<>());
            result.get(sorteds).add(s);
        } 
        return new ArrayList<>(result.values());  
    }
}
