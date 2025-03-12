import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite uma temperatura em Fareheit : ");
        double farehiet = scanner.nextDouble();
        double celsius = (farehiet - 32) * 5/9;
        System.out.println(" a temperatura em farehiet é :" + celsius);

        }
    }
