/*
Fazer um programa que le um valor inteiro N e depois N numeros inteiros.
Ao final, mostra a soma dos N numeros lidos.

| Entrada | Saida |
| 5       | 11    |
| 2       |       |
| 4       |       |
| 0       |       |
*/
import java.util.Scanner;

public class ExemploAula05For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtd_numeros = -1, soma = 0, numero = 0;
        
        while (qtd_numeros < 0) {
            qtd_numeros = input.nextInt();
            if (qtd_numeros < 0)
                System.out.println("Error: valor invalido! Tente novamente.");
        }
        
        for (int i = 0; i < qtd_numeros; i++) {
            numero = input.nextInt();
            soma += numero;
        }

        System.out.println(soma);

        input.close();
    }
}