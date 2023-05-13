package com.devsuperior.dslist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameminDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepositories;

@Service
public class GameService {
	
	@Autowired
	private GameRepositories gameRepositories;
	
	public List<GameminDTO> findAll(){
		List<Game> result = gameRepositories.findAll();
		List<GameminDTO>  dto = result.stream().map(x -> new GameminDTO(x)).toList();
		return  dto;
		
	}

}
