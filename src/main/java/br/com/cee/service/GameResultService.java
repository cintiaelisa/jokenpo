package br.com.cee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cee.entity.GameResult;
import br.com.cee.repositories.GameResultRepository;

@Service
public class GameResultService {
	
	@Autowired
	private GameResultRepository repo;
	
	public GameResult save(GameResult obj) {
		return repo.save(obj);
	}
	

}
