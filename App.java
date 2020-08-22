class App{
  public static void main(String [] args){
    if(args.length !=3){
      printlnUsage();
    }
    else{
      try{
        int firstNum=Integer.parseInt(args[1]);
        int secondNum=Integer.parseInt(args[2]);
        if(args[0].equals("mul")){
          System.out.println(firstNum*secondNum);
        }
        else if(args[0].equals("div")){
          try{
            System.out.println(firstNum/secondNum);
           }
           catch(ArithmeticException exp){
             System.out.println("Cannot divide by zero");
             System.out.println(exp.getMessage());
           }
         }
        else if(args[0].equals("add")){
          System.out.println(firstNum+secondNum);
        }
        else if(args[0].equals("sub")){
          System.out.println(firstNum-secondNum);
        }
      }
      catch(NumberFormatException exp){
        System.out.println("Incorrect num was given");
        System.out.println(exp.getMessage());
      }
    }
  }
  static void printlnUsage(){
    System.out.print("Usage");
    System.out.println(" Java calculator [mu/div/add/sub] FirstNum SecondNum");
    System.out.print("Example");
    System.out.println(" Java calculator div 1 9");
  }
}
