public class Demo{
  public static String arrToString(int[] arr){
    int length = arr.length;
    String end = "";
    if(length == 0){
      return "{" + "}";
    }
    for(int i = 0;i< length;i++){
      end = end + Integer.valueOf(arr[i]) + "," + " ";
    }
    end = end.substring(0, end.length() - 2);
    return "{" + end + "}";
  }
 public static String arrayDeepToSTring(int[][] arr){
   int length = arr.length;
   String end = "{ \n";
   if(length == 0){
     return "{" + "}";
   }
   for(int i = 0;i < length;i++){
     end = end + "{";
     for(int j = 0;j < arr[i].length;j++){
       end = end + Integer.valueOf(arr[i][j]) + ",";
     }
     end = end + "}" + ",\n";
   }
   System.out.print(end + "}");
   return end + "}";
 }
 public static int[][] create2DArray(int rows, int cols, int maxValue){
   int[][] arr = new int[rows][cols];
   int length = arr.length;
   for(int i = 0;i < length;i++){
     for(int j = 0;j < arr[0].length;j++){
       arr[i][j] = (int)(Math.random() * (maxValue + 1));
   }
 }
 return arr;
}
public static int[][] create2DArrayRandomized(int rows, int cols,int maxValue){
  int[][] arr = new int [rows][];
  int length = arr.length;
  for(int i = 0;i < rows;i++){
    arr[i] = new int[(int)(Math.random() * (cols + 1))];
  }
  for(int i = 0;i < length;i++){
    for(int j = 0;j < arr[i].length;j++){
      arr[i][j] = (int)(Math.random() * (maxValue + 1));
    }
  }
  return arr;
}
  public static void main(String[] args) {
    if(args.length == 0){
      loopnums.printLoop(5);
    }
    else{
    loopnums.printLoop(Integer.parseInt(args[0]));
  }
}
}
