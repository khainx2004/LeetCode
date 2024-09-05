class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid){
            Arrays.sort(row);
        }

        int sum = 0;
        for (int i = grid[0].length - 1; i >= 0; i--) {
            int greatest = 0;
            for(int j = 0; j < grid.length ; j ++) {
                greatest = Math.max(greatest, grid[j][i]);
            }
            sum += greatest;
        }
        return sum;
    }
}