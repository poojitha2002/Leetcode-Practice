class KthLargest {
     PriorityQueue<Integer>pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>();
        for(int i=0;i<k && i<nums.length;i++)
            pq.add(nums[i]);
        for(int i=k;i<nums.length;i++)
        {
            if(pq.peek()>=nums[i])
            {
                
            }
            else
            {
                pq.poll();
                pq.add(nums[i]);
            }
            
        }
        this.k=k;
    }
    
    public int add(int val) {
       // System.out.println(pq);
        if(pq.size()<k)
        {
            pq.add(val);
        }
         
      else  if(pq.peek()>=val)
        {
            
        }
        else
        {
            pq.poll();
            pq.add(val);
            
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */