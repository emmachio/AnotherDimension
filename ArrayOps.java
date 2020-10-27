public class ArrayOps{

  public static void main(String[] args) {
  }

  public static int sum(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int max = arr[0];
    for(int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] sumMatrix = new int[matrix.length];
    for(int i = 0; i < matrix.length; i++) {
      int sum = 0;
      for(int j = 0; j < matrix[i].length; j++) {
        sum = sum + matrix[i][j];
      }
      sumMatrix[i] = sum;
    }
    return sumMatrix;
  }

}
