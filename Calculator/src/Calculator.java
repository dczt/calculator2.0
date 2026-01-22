import java.util.Scanner;

public class Calculator {

     double num1;
     double num2;

    // Constructor
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return this.num1 + this.num2;
    }

    public double minus(){
        return this.num1 - this.num2;
    }

    public double multiple(){
        return this.num1 * this.num2;
    }

    public double divide(){
        if (this.num2 == 0){
            return 0.0;
        } else{
            return this.num1 / this.num2;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("============= CALCULATOR =============");

        System.out.print("Enter number 1: ");
        double usernum1 = s.nextDouble();
        System.out.print("Enter number 2: ");
        double usernum2 = s.nextDouble();

        System.out.println("========== OPERATIONS ==========");
        System.out.println("Addition = 1");
        System.out.println("Subtraction = 2");
        System.out.println("Multiplication = 3");
        System.out.println("Division = 4");

        System.out.print("Enter the number of operation: ");
        int oper = s.nextInt();
        Calculator c = new Calculator(usernum1, usernum2);
        System.out.println("The answer is: ");

        switch (oper) {
            case 1:
                System.out.println(c.add());
                break;
            case 2:
                System.out.println(c.minus());
                break;
            case 3:
                System.out.println(c.multiple());
                break;
            case 4:
                System.out.println(c.divide());
                break;
            default:
                System.out.println("Invalid Input!");
        }


        s.close();

    }
}
