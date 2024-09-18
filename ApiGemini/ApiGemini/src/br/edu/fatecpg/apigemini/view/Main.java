package br.edu.fatecpg.apigemini.view;

import br.edu.fatecpg.apigemini.service.ConsomeApi;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("1- Fazer uma pergunta \n2- Sair");
            int mudar = scan.nextInt();
            scan.nextLine(); 
            
            if (mudar == 1) {
                System.out.println("Digite sua pergunta: ");
                String question = scan.nextLine();
                String resposta = ConsomeApi.fazerPergunta(question);
                System.out.println("Sua resposta é: " + resposta);
            } else {
                return;
            }
        }
    }
}
