package com.univlittoral.projetback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.repository.LivreRepository;



@Service
public class LivreService {
	@Autowired
	private LivreRepository repo;
	public List<LivreEntity> findAll() {
		List<LivreEntity> listeLivreEntity = repo.findAll();
		return listeLivreEntity;
	}
	
	public LivreEntity findOne(final Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public void deleteOne(final Long id) {
		repo.deleteById(id);
	}
	
	public void AddOne(LivreEntity LivreEntity) {
        repo.save(LivreEntity);

    }

}
