class Solution { 
    public int DFS(int [][]obstacleGrid,int i,int j,int totalZeros,int currentZeros)
    {
        if(i<0 || i>=obstacleGrid.length || j<0 || j>=obstacleGrid[0].length)
            return 0;
        if(obstacleGrid[i][j]==-1)
            return 0;
        if(obstacleGrid[i][j]==2 && totalZeros==currentZeros-1)
            return 1;
        else if(obstacleGrid[i][j]==2)
            return 0;
        obstacleGrid[i][j]=-1;
        int totalPaths=DFS(obstacleGrid,i+1,j,totalZeros,currentZeros+1)+
                       DFS(obstacleGrid,i-1,j,totalZeros,currentZeros+1)+
                       DFS(obstacleGrid,i,j+1,totalZeros,currentZeros+1)+ 
                       DFS(obstacleGrid,i,j-1,totalZeros,currentZeros+1);
        obstacleGrid[i][j]=0;
        return totalPaths;
            
    }
   
    public int uniquePathsIII(int[][] grid) {
        int totalZeros=0,startX=0,startY=0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                    totalZeros++;
                if(grid[i][j]==1)
                {
                    startX=i;
                    startY=j;
                }
            }
        }
        
        return DFS(grid,startX,startY,totalZeros,0);
    }
}