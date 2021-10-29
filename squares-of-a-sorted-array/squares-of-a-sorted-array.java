class Solution {
    public int[] sortedSquares(int[] a) {
        
         int []result=new int[a.length];
         int i=0;
        int k=a.length-1;
        
         int j=a.length-1;
        while(i<=j)
        {
            if(a[i]*a[i]<a[j]*a[j])
            {
                result[k]=a[j]*a[j];
                k--;
                j--;
            }
            else
            {
                result[k]=a[i]*a[i];
                i++;
                k--;
            }
                
        }
        return result;
    }
}