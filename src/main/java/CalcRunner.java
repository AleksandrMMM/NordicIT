import java.util.ArrayList;
import java.util.Scanner;

public class CalcRunner {
   static ArrayList<Object> result = new ArrayList<>();
    static int count2 = 0;
    static int numberOne;
    static int numberTwo;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;




        while (count == 0 &&  count2 <= 5 ) {

            System.out.println("Введите код операции (0 - сумма, 1 - разность, 2 - произведение, 3 - деление, 4 - закончить работу, 5 - введите номер операции чтобы узнать результат");
            int numb = scanner.nextInt();


            switch (numb) {
                case 0:
                    System.out.println("Введите первое число");
                    numberOne = scanner.nextInt();
                    System.out.println("Введите второе число");
                    numberTwo = scanner.nextInt();
                    System.out.println(sum(numberOne, numberTwo));
                    break;
                case 1:
                    System.out.println("Введите первое число");
                    numberOne = scanner.nextInt();
                    System.out.println("Введите второе число");
                    numberTwo = scanner.nextInt();
                    System.out.println(raz(numberOne, numberTwo));
                    break;
                case 2:
                    System.out.println("Введите первое число");
                    numberOne = scanner.nextInt();
                    System.out.println("Введите второе число");
                    numberTwo = scanner.nextInt();
                    System.out.println(proizved(numberOne, numberTwo));
                    break;
                case 3:
                    System.out.println("Введите первое число");
                    numberOne = scanner.nextInt();
                    System.out.println("Введите второе число");
                    numberTwo = scanner.nextInt();
                    System.out.println(delenie(numberOne, numberTwo));
                    break;
                case 4:
                    count++;
                    break;
                case 5:
                    int numbOper = scanner.nextInt();
                    System.out.println(result.get(numbOper));
                    break;
                default:
                    System.out.println("Вы ввели неверный номер операции");


            }



        }
        if (count2 == 5) {
            System.out.println("калькулятор перегрелся.");
        }

    }
    public static int sum(int a, int b) {
        count2++;
        result.add(a + b);
        return a + b;
    }
    public static int raz(int a, int b) {
        count2++;
        result.add(a - b);
        return a - b;
    }
    public static int proizved(int a, int b) {
        count2++;
        result.add(a * b);
        return a * b;
    }
    public static double delenie(int a, int b) {
        double res = 0.00;
        if (b != 0) {
            res =  (double) (a / b);
            result.add(res);
            count2++;
        }else {
            System.out.println("Вы ввели ноль, на ноль делить нельзя.");
        }
        return res;
    }


}

