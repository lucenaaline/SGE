import java.util.Scanner;

public class TrabalhandoStrings {

    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite uma senha: ");
//
//        String senha = scanner.nextLine();
//
//        if(senha.length() >= 8) {
//            System.out.println("Tudo certo!");
//        } else {
//            System.out.println("A senha precisa ter no minimo 8 caracteres");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int idade = scanner.nextInt();

        if(idade >=16 && idade <= 17) {
            System.out.println("Voto facultativo");
        } else if (idade >=18 && idade <= 60){
            System.out.println("Voto obrigatório");
        } else if (idade < 16) {
            System.out.println("Voce não pode votar");
        } else {
            System.out.println("Voto facultativo");
        }

    }
}
