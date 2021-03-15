package br.com.cee;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.cee.entity.GameResult;
import br.com.cee.service.GameResultService;
import br.com.cee.util.Computer;
import br.com.cee.util.Game;

@Component
public class JokenpoApplicationCommandLine implements CommandLineRunner {
	
	@Override    
    public void run(String... args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
        char continueGame;
        String userName = "";
        int roundCounts = 0;
        
        GameResult result = new GameResult();
        
        GameResultService service = new GameResultService();
		
		do {
			System.out.println("Bem vindo ao Jokenpo");
			System.out.println("Digite seu nome:");
			
			result.setUserName(scanner.next());
			
			do {
			
				System.out.println("Escolha uma opção:");
				System.out.println("0 - Pedra");
				System.out.println("1 - Tesoura");
				System.out.println("2 - Papel");
				
				int choiceComputer = Computer.getOption();
				
				int choiceUser = scanner.nextInt();
				
				System.out.println("Computador escolheu: " + choiceComputer);
				
				result.setRound(Game.getResult(choiceUser, choiceComputer));
				
				roundCounts ++;
				
			} while (roundCounts < 10);
			
			System.out.println("O resultado foi: " + result.getResult());
			
			//service.save(result);
			
			result = new GameResult();
			
			roundCounts = 0;
			
			System.out.println("Você quer jogar de novo? y/n");
			
			continueGame= scanner.next().charAt(0);
			
			
		} while (continueGame == 'y');
	}


}
