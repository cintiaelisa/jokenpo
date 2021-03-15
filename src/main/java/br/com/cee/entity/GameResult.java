package br.com.cee.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GameResult implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Long id;
	String userName;
	Integer usersWins = 0;
	Integer computerWins = 0;
	Integer ties = 0;
	
	public GameResult() {
		
	}

	public GameResult(String userName, Integer usersWins, Integer computerWins) {
		this.userName = userName;
		this.usersWins = usersWins;
		this.computerWins = computerWins;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUsersWins() {
		return usersWins;
	}

	public void setUsersWins(Integer usersWins) {
		this.usersWins = usersWins;
	}

	public Integer getComputerWins() {
		return computerWins;
	}

	public void setComputerWins(Integer computerWins) {
		this.computerWins = computerWins;
	}
	
	public String getResult() {
		
		if(computerWins == usersWins) {
			return "Empate";
		} else if(computerWins > usersWins) {
			return "Computador ganhou!";
		} else {
			return "Usuário ganhou!";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameResult other = (GameResult) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public void setRound(String result) {
		
		if(result.equals("user")) {
			usersWins++;
		} else if(result.equals("computer")) {
			computerWins++;
		} else if (result.equals("tie")){
			ties++;
		} else {
			System.out.println("Resultado inválido");
		}
		
	}

}
