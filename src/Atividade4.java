import java.util.Scanner;
public class Atividade4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite um numero: ");
        double numero= scanner.nextDouble();
        double cubo = numero * numero * numero;
        double quadrado = numero * numero;

        System.out.println(" o seu numero digitado ao quadrado é :"+ quadrado +" e o seu numero ao cubo é: "+cubo);
    }
}