package com.univlittoral.projetback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.repository.AuteurRepository;



@Service
public class AuteurService {
	@Autowired
	private AuteurRepository repo;
	public List<AuteurEntity> findAll() {
		List<AuteurEntity> listeAuteurEntity = repo.findAll();
		return listeAuteurEntity;
	}
	
	public AuteurEntity findOne(final Long id) {
		return repo.findById(id).orElse(null);
	}
	
}
