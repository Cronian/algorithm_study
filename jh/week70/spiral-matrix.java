class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        
        int i=0;
        int j=0;
        
        int r = matrix.length-1;
        int c = matrix[0].length-1;
        
        while(i<=r && j<=c) { 
            /* Right Move */
            for(int k=j; k<=c; k++) { 
                result.add(matrix[i][k]);
            }
            i++;
            
            /* Bottom Move */
            for(int k=i; k<=r; k++) { 
                result.add(matrix[k][c]);
            }
            c--;
            
            if(i<=r) { 
                /* Top Move */
                for(int k=c; k>=j; k--) { 
                    result.add(matrix[r][k]);
                }
                r--;
            }
            
            if(j<=c) { 
                /* Left Move */
                for(int k=r; k>=i; k--) { 
                    result.add(matrix[k][j]);
                }
                j++;
            }
        }
        
        return result;
    }
}