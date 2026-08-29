class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h =new HashMap<>();
        for(String w:strs){
        char key[] = w.toCharArray();
        Arrays.sort(key);
        String s = new String(key);
         if(!h.containsKey(s)){
            h.put(s,new ArrayList<>());
         }
         h.get(s).add(w);
        }
        return new ArrayList(h.values());
    }
}
