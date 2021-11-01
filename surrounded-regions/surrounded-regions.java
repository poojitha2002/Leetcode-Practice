class Solution {
    public void bfs(char [][]b,int i,int j)
    {
         int []dx={-1,0,1,0};
         int []dy={0,1,0,-1};
         Queue<ArrayList<Integer>>q=new LinkedList<>();
         q.add(new ArrayList<>(Arrays.asList(i,j)));
          while(!q.isEmpty())
           {
                  ArrayList<Integer>temp=q.poll();
                  int curx=(int)temp.get(0);
                  int cury=(int)temp.get(1);
                  b[curx][cury]='1';
                  for(int i1=0;i1<4;i1++)
                  {
                      if(curx+dx[i1]<b.length && curx+dx[i1]>=0 && cury+dy[i1]<b[0].length && cury+dy[i1]>=0)
                      {
                          
                          if(b[curx+dx[i1]][cury+dy[i1]]=='O'){
                           b[curx+dx[i1]][cury+dy[i1]]='1';
                           q.add(new ArrayList<>(Arrays.asList(curx+dx[i1],cury+dy[i1])));
                          }
                      }
                  }
                  
           }
    }
    public void solve(char[][] board) {
        
        
            for(int j=0;j<board[0].length;j++)
            {
                 if(board[0][j]=='O')
                 {
                   bfs(board,0,j);   
                 }
            }
            for(int j=0;j<board[0].length;j++)
            {
                if(board[board.length-1][j]=='O')
                    bfs(board,board.length-1,j);
            } 
            for(int i=0;i<board.length;i++)
                if(board[i][0]=='O')
                      bfs(board,i,0);
        
            for(int i=0;i<board.length;i++)
                    if(board[i][board[0].length-1]=='O')
                          bfs(board,i,board[0].length-1);
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board[0].length;j++)
                {
                    if(board[i][j]=='O')
                        board[i][j]='X';
                  else  if(board[i][j]=='1')
                        board[i][j]='O';
                }
            }
           
        
        
        
    }
}