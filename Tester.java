public class Tester{
  public static void main(String[] args) {
    int[] newarr1 = {1, 2, 3, 4};
    int[][] newarr2 = { {1, 2, 3, 4},
                        {5, 6, 7, 8}
                      };
    System.out.println(Demo.arrToString(newarr1).replace("},","},\n"));
    System.out.println(Demo.arrayDeepToString(newarr2).replace("},","},\n"));
    System.out.println(Demo.arrayDeepToString(Demo.create2DArray(5, 4, 4)).replace("},","},\n"));
    System.out.println(Demo.arrayDeepToString(Demo.create2DArrayRandomized(6,4,5)).replace("},","},\n"));
  }
}
