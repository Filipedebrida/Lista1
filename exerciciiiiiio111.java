import java.util.Scanner;

public class exerciciiiiiio111 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float soma, sub, mult, div, n1, n2;
        System.out.print("digite o primeiro numero: ");
        n1 = leia.nextFloat();

        System.out.print("digite o segundo numero: ");
        n2 = leia.nextFloat();

        soma = n1+n2;
        sub = n1-n2;
        mult = n1*n2;
        div = n1/n2;

        System.out.print("subtração: " + sub);
        System.out.print("Soma: " + soma);
        System.out.print("multiplicação: " + mult);
        System.out.print("divisão: " + div);
    }
}
