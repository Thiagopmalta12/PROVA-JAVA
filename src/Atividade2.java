import java.util.Scanner;
public class Atividade2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite uma temperatura em celsius : ");
        double celsius= scanner.nextDouble();
        double fareheit = (celsius * 9/5 ) + 32;
        System.out.println(" a temperatura em farehiet é :" + fareheit);
    }
}