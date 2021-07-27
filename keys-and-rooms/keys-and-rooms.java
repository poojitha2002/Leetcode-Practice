class Solution {
    public void dfs(int s,int []vis,List<List<Integer>> rooms)
    {
        vis[s]=1;
        for(int nbr:rooms.get(s))
        {
            if(vis[nbr]==0)
            {
                dfs(nbr,vis,rooms);
            }
        }
        return ;
        
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int []vis=new int[rooms.size()];
        for(int i=0;i<vis.length;i++)
            vis[i]=0;
            dfs(0,vis,rooms);
        for(int i=1;i<rooms.size();i++)
        {
            if(vis[i]==0)
            {
            return false;
            }
        }
        return true;
    }
}