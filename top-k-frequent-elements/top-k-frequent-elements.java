class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.get(nums[i])==null)
                hm.put(nums[i],1);
            else
                hm.put(nums[i],hm.get(nums[i])+1);
        }
        PriorityQueue<ArrayList<Integer>>pq=new PriorityQueue<>(
        (ArrayList<Integer>a1,ArrayList<Integer>a2)-> -(int)a1.get(1)+(int)a2.get(1));
        
        for(Map.Entry mp:hm.entrySet())
        {
            ArrayList<Integer>q=new ArrayList<>();
            q.add((int)mp.getKey());
            q.add((int)mp.getValue());
            pq.add(q);
        }
        int []a=new int[k];
        int i=0;
        while(k-->0)
        {
            ArrayList<Integer>w=pq.poll();
            a[i]=(int)w.get(0);
            i++;
        }
        return a;
        
    }
}