class Calculator
{
  public static void main (String[]args)
  {
    int a = Integer.parseInt (args[0]);
    String c = args[1];
    int b = Integer.parseInt (args[2]);
    switch(c){
        case "+":
            System.out.println(a+b);
            break;
        case "-":
            System.out.println(a-b);
            break;
        case "*":
            System.out.println(a*b);
            break;
        case "/":
            if (b == 0){
                System.out.println("Denominator cannot be zero");
                break;
            }
            else{
                System.out.println(a/b);
                break;
            }
        default:
            System.out.println("Invalid");
    }
      
  }
}
