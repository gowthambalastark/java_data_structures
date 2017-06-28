class rotate{
public static void rotateit(int[][] matrix) {
      int n = matrix.length;
      int half = n / 2;

      for (int layer = 0; layer < half; layer++) {
          int first = layer;
          int last = n - 1 - layer;

          for (int i = first; i < last; i++) {
              int offset = i - first;
              int j = last - offset;
              int top = matrix[first][i]; // save top

              // left -> top
              matrix[first][i] = matrix[j][first];          

              // bottom -> left
              matrix[j][first] = matrix[last][j]; 

              // right -> bottom
              matrix[last][j] = matrix[i][last]; 

              // top -> right
              matrix[i][last] = top; // right <- saved top
          }
      }
  }
  public static void main(String[] args) {
  	int[][] ma=new int[3][3];
  	rotateit(ma);
  }
}