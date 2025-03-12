import java.util.Scanner;
public class Atividade6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite a:  ");

        double a= scanner.nextDouble();
        System.out.println("digite b: ");
        double b= scanner.nextDouble();

        System.out.println("digite c: ");
        double c= scanner.nextDouble();

        double resultado  = Math.pow(b,2)-(4*a*c);

        System.out.println( "o resultado de delta é "+ resultado);
    }
}