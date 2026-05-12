class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m = new HashMap<>();
        for(String word:strs){
            char key[]= word.toCharArray();
            Arrays.sort(key);
            String s = new String(key);
            if(!m.containsKey(s)){
                m.put(s,new ArrayList<>());
            }
            m.get(s).add(word);
        }
        return new ArrayList(m.values());
    }
}
