// import java.util.HashSet;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        // boolean duplicate=false;
        for(int num:nums){
            if(s.contains(num)){
                return true;
            }
            s.add(num);
        }
        return false;
    }
}