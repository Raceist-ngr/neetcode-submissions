class Solution {
    int[][] dp;
    public int solve(int[][] grid,int i,int j,int n,int m){
        if(i>=n||j>=m) return Integer.MAX_VALUE;
        if(i==n-1&&j==m-1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];

        return dp[i][j]=grid[i][j]+Math.min(solve(grid,i+1,j,n,m),solve(grid,i,j+1,n,m));

    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        dp=new int[n+1][m+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        return solve(grid,0,0,n,m);
    }
}