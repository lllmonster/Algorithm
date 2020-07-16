class Solution {
    /**
    How to rotate image 90 degree (clockwise)?
    reverse upside down, and then, swap the symmetry
     */
    public void rotate(int[][] matrix) {
        int start = 0, end = matrix.length-1;
        while (start < end) {
            int[] tmp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = tmp;
            start++;end--;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        } 
    }
}