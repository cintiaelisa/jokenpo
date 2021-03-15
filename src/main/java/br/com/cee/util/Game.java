package br.com.cee.util;

public class Game {
	
	public static String getResult(int userChoice, int choiceComputer) {
		
		switch (userChoice)
        {
            // Rock
            case 0:
                if (choiceComputer == 1) {
                    System.out.println("Usuário ganho! Pedra ganha.");
                    return "user";
                    
                } else if (choiceComputer == 2) {
                    System.out.println("Computador ganhou! Papel embrulha a pedra.");
                    return "computer";
                    
                } else
                    System.out.println("Empate!");
                return "tie";

            // Scissor
            case 1:
                if (choiceComputer == 0) {
                    System.out.println("Computador ganhor! Pedra ganha.");
                    return "computer";
                    
                } else if (choiceComputer == 2) {
                    System.out.println("Usuário ganhou! Tesoura corta o papel.");
                    return "user";
                    
                } else
                    System.out.println("Empate!");
                return "tie";

            // Paper
            case 2:
                if (choiceComputer == 0) {
                    System.out.println("Usuário ganhou! Papel embrulha a pedra.");
                    return "user";
                   
                } else if (choiceComputer == 1) {
                    System.out.println("Computador ganhou! Tesoura corta papel.");
                    return "computer";
                    
                } else
                    System.out.println("Empate!");
                return "tie";

            default:
                System.out.println("Opção não válida.");
                break;
        }
		
		return "";
        
	}

}
