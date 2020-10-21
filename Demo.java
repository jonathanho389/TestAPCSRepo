public class Demo{
  public static void main(String[] args) {
    if(args.length == 0){
      loopnums.printLoop(5);
    }
    else{
    loopnums.printLoop(Integer.parseInt(args[0]));
  }
}
}
