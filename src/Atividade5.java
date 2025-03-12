import java.util.Scanner;
public class Atividade5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite a base: ");
        double base= scanner.nextDouble();
        System.out.println("digite a altura: ");
        double altura= scanner.nextDouble();
        double area  = (base * altura)/2;
        System.out.println( "a area do triangulo é: "+ area);
    }
}