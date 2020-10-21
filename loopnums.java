public class loopnums{
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = i - 1; j < n; j++){
         System.out.print(i); //prints out rectangular shaped numbers (like the example above)
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    printLoop(5);
  }
}
