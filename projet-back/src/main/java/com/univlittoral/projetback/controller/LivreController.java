package com.univlittoral.projetback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.dto.LivreRequestSaveDTO;
import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.service.LivreService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping
public class LivreController {
	@Autowired
    private LivreService service;
	
	@GetMapping(value="/rest/bd/livres/{id}")
	public LivreDTO findOne(@PathVariable Long id) {
		return LivreMapper.map(service.findOne(id));
	}
	
	@DeleteMapping(value="/rest/bd/livres/{id}")
	public void deleteOne(@PathVariable Long id) {
		service.deleteOne(id);
	}
	
	@PostMapping(value="/rest/bd/livres")
    public void AddOne(@RequestBody LivreRequestSaveDTO livreDTO){
        service.AddOne(LivreMapper.mapSave(livreDTO));
    }
	
	@PutMapping(value="/rest/bd/livres/{id}") 
    public void modifyLivre(@RequestBody LivreRequestSaveDTO livreDTO, @PathVariable Long id) { 
		LivreEntity livreUpdate = service.findOne(id);
		service.AddOne(LivreMapper.mapEntityToEntity(livreUpdate, livreDTO));
	}
}
