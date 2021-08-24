class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        int []ans=new int[cells.length];
        for(int i=0;i<cells.length;i++)
            ans[i]=cells[i];
        n=n%14;
        if(n==0)
            n=14;
        while(n-->0)
        {
           /*  for(int i=0;i<8;i++)
                System.out.print(cells[i]+" ");*/
           /// System.out.println("---------------");
           for(int i=0;i<8;i++)
           {
               if(i==0 || i==7)
               {
                
               }
               else
               {
                   if(cells[i-1]==cells[i+1])
                       ans[i]=1;
                   else
                       ans[i]=0;
               }
             
           }
               ans[0]=0;
               ans[7]=0;
               for(int i1=0;i1<8;i1++)
                   cells[i1]=ans[i1];
         /*   for(int i=0;i<8;i++)
                System.out.print(cells[i]+" ");
            System.out.println();*/
        }
        return ans;
    }
}