import java.util.Scanner;

public class CalcRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count == 0) {
            System.out.println("Введите первое число");
            int numberOne = scanner.nextInt();
            System.out.println("Введите второе число");
            int numberTwo = scanner.nextInt();
            System.out.println("Введите код операции (0 - сумма, 1 - разность, 2 - произведение, 3 - деление, 4 - закончить работу)");
        switch (scanner.nextInt()) {
            case 0:
                System.out.println(new Sum().sum(numberOne, numberTwo));
                break;
            case 1:
                System.out.println(new Raz().raz(numberOne, numberTwo));
                break;
            case 2:
                System.out.println(new Proizved().proizved(numberOne, numberTwo));
                break;
            case 3:
                System.out.println(new Delenie().delenie(numberOne, numberTwo));
                break;
            case 4:
                count++;
                break;
            default:
                System.out.println("Вы ввели неверный номер операции");


        }


        }
    }

    }

