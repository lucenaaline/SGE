import java.util.Scanner;

// Aline Lucena - https://github.com/lucenaaline

public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nome completo: ");
        String nome = scanner.nextLine();

        String[] array = nome.split(" "); //separa as palavras pelo espaço
        String letra = String.valueOf(array[0].charAt(0)); //primeira letra é a posição 1 (primeiro nome)
        String sobrenome = array[array.length -1]; //sobrenome é a ultima posição
        String login = letra+"_"+sobrenome; // junta os 2 e coloca _
        String senha = "a";


        boolean senhaPadrao = false; //condição do while

        while (senhaPadrao == false) { //se o usuario não digita senha forte ele volta e pede nova senha

            System.out.printf("Digite uma senha de 8 digitos FORTE: ");
            senha = scanner.nextLine();


            //Validação de senha
            if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {
                System.out.println(" ---------------------------------------------------");
                System.out.println("Senha forte!");

                senhaPadrao = true; // se o usuario digita senha forte ele já sai do laço e segue

            } else {
                System.out.println("Senha fraca - Utilize maiuscula, minuscula, numeros e caracteres especiais");
                System.out.println(" ---------------------------------------------------");

            }

            System.out.println("Usuário criado com sucesso, seu login é: "+login);
            System.out.println(" ---------------------------------------------------");


        }
        boolean logado = false;

        while (logado == false) {

        System.out.println("Faça o login novamente digitando seu usuário: ");
        String logUser = scanner.nextLine();

        System.out.println("Agora digite sua senha: ");
        String logSenha = scanner.nextLine();


            if (logUser.equals(login) && logSenha.equals(senha)) {
                System.out.println(" ---------------------------------------------------");
                System.out.println("Logado!");
                System.out.println(" ---------------------------------------------------");
                logado =  true;


            } else {
                System.out.println(" ---------------------------------------------------");
                System.out.println("Dados incorretos! Verifique usuário ou senha");
                System.out.println(" ---------------------------------------------------");
            }
        }
    }
}
