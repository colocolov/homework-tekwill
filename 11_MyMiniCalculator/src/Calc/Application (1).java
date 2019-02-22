package Calc;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //описание
        System.out.println("\nName: Calculator");
        System.out.println("Description: mini Calculator.");

        int loop = 1;
        while (loop == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter first value: ");
            int firstValue = scanner.nextInt();
            System.out.print("Enter second value: ");
            int secondValue = scanner.nextInt();
            //ввод операции над числами
            System.out.print("Enter operation + - * / %: ");
            String action = scanner.next();

            //выбор операции
            switch (action) {
                case "+":
                    Calculate add = new Calculate();
                    add.additionCalc(firstValue, secondValue);
                    break;
                case "-":
                    Calculate subtraction = new Calculate();
                    subtraction.subtractionCalc(firstValue, secondValue);
                    break;
                case "*":
                    Calculate multiplication = new Calculate();
                    multiplication.multiplicationCalc(firstValue, secondValue);
                    break;
                case "/":
                    Calculate division = new Calculate();
                    division.divisionCalc(firstValue, secondValue);
                    break;
                case "%":
                    Calculate remainder = new Calculate();
                    remainder.remainderCalc(firstValue, secondValue);
                    break;
                default:
                    System.out.println("You entered the wrong operation.");
            } // end switch

            System.out.print("\nRepeat: Y(yes) or N(no) - ");
            String repeat = scanner.next();
            switch (repeat) {
                case "Y":
                    loop = 1;
                    break;
                case "y":
                    loop = 1;
                    break;
                case "N":
                    loop = 0;
                    break;
                case "n":
                    loop = 0;
                    break;
                default:
                    System.out.println("You entered the wrong operation.");
                    loop = 0;
            }

        }

        System.out.println("\n Bye!");

    }

}
