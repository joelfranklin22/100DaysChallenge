import java.util.Scanner;  

class WeightMars{
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  System.out.print("How many pounds (lbs) do you weigh? ") ;
  float weight = input.nextFloat();

  // computing the weight on mars
  double weightOnMars = (weight * .38);

  // displaying results with 4 decimal places
  System.out.println("Your weight is "+String.format("%.4f",weightOnMars)+" lbs on Mars");

    System.out.println("Converting the variable into integer");
    int weightOnMarsInt = (int)weightOnMars;
    System.out.println(weightOnMarsInt);

    System.out.println("Converting the variable into char");
    char weightOnMarsChar = (char)weightOnMars;
    System.out.println(weightOnMarsChar);

    System.out.println("Converting the variable into Int and doing an operation on it");
    int newIntVariable = weightOnMarsChar * 2;
    System.out.println(newIntVariable);
    
  }
}