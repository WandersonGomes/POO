/*
Fazer um programa que le numeros inteiros ate que um zero seja lido.
Ao final mostra a soma dos numeros lidos.

| Entrada | Saida |
| 5       | 11    |
| 2       |       |
| 4       |       |
| 0       |       |
*/
import java.util.Scanner;

public class ExemploAula05While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero = -1, soma = 0;

        while (numero != 0) {
            numero = input.nextInt();
            soma += numero;
        }

        System.out.println(soma);

        input.close();
    }
}