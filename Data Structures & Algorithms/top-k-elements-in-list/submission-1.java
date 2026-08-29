
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->h.get(b)-h.get(a));
        pq.addAll(h.keySet());
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}
