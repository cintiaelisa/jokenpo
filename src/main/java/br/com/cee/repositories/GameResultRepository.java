package br.com.cee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cee.entity.GameResult;

public interface GameResultRepository extends JpaRepository <GameResult, Long>{		

}
