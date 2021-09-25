class Solution {
    public int longestConsecutive(int[] arr) {
     HashSet<Integer>h=new HashSet<>();
     int n=arr.length;
	 for(int i=0;i<n;i++)
	 h.add(arr[i]);
	 int ma=0;
	 
	 for(int i=0;i<n;i++)
	 {
	     if(h.contains(arr[i]-1))
	     continue;
	     else
	     {
	         int  c=0;
	         int num=arr[i];
	         while(h.contains(num))
	         {
	           c++;
	           num++;
	         }
	         ma=Math.max(ma,c);
	     }
	     
	 }
	 return ma;
    }
}