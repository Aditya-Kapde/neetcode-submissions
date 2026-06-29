class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m,n;
        m=matrix.length;
        n=matrix[0].length;
        int lr=0,rr=m-1;
        while(lr<=rr)
        {
            int midr=(lr+rr)/2;
            int lc=0,rc=n-1;
            while(lc<=rc)
            {
                int midc=(lc+rc)/2;
                if(matrix[midr][midc]==target)
                return true;
                else if(matrix[midr][midc]>target)
                rc=midc-1;
                else
                lc=midc+1;
            }
            if(matrix[midr][0]>target)
            rr=midr-1;
            else
            lr=midr+1;
        }
        return false;
    }
}
