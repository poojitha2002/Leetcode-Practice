class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c)
            return mat;
        int [][]x=new int[r][c];
        int i1=0,j1=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                
                 
                    x[i1][j1++]=mat[i][j];
                 if(j1==c)
                {
                    i1++;
                    j1=0;
                }
                 
            }
        }
        return x;
        
    }
}