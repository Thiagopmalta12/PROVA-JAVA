import java.util.Scanner;
public class Atividade3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("digite seu peso : ");
        double peso= scanner.nextDouble();
        System.out.println("qual é a sua altura");
        double altura= scanner.nextDouble();
        double imc = peso/(altura * altura);
        System.out.println(" o seu imc é:" +imc);
    }
}