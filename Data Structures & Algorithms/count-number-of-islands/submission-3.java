class Solution {
    private static final int[][] dir={{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        int ans=0;
        int m=grid.length;
        int n=grid[0].length;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j]=='1')
                {
                    bfs(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void bfs(char[][] grid, int r, int c)
    {
        Queue<int[]> q=new LinkedList<>();
        grid[r][c]='0';
        q.add(new int[]{r,c});

        while(!q.isEmpty())
        {
            int[] node=q.poll();
            int row=node[0];
            int col=node[1];

            for(int[] d : dir)
            {
                int nr=row+d[0];
                int nc=col+d[1];

                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='1')
                {
                    q.add(new int[]{nr, nc});
                    grid[nr][nc]='0';
                }
            }
        }
    }
}






