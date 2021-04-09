/*
Fazer um programa que verifique a validade de uma senha fornecida pelo usuário.
A senha válida é o número 1234. Se a senha estiver correra devem ser impressa
a mensagen: ACESSO PERMITIDO e caso a senha seja inválida: ACESSO
NEGADO.
*/
import java.util.Scanner;

public class ExemploAula05Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("SENHA: ");
        String senha = input.nextLine();
        
        if (senha.equals("1234"))
            System.out.println("ACESSO PERMITIDO");
        else
            System.out.println("ACESSO NEGADO");

        input.close();        
    }
}