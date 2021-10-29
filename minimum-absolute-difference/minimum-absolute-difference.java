class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>a=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff<min)
                min=diff;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff==min)
            {
                List<Integer>temp=new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                a.add(temp);
            }
        }
        
        return a;
        
        
        
    }
}