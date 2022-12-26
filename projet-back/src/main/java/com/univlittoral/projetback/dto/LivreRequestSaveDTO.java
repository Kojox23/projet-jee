package com.univlittoral.projetback.dto;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.projetback.enums.GenresEnum;

public class LivreRequestSaveDTO {
	private Long id;
	private String nom;
	private String editeur;
	private Integer nbPages;
	private Date dateParution;
	private String lieuParution;
	@Enumerated(EnumType.STRING)
	private GenresEnum genre;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public Integer getNbPages() {
		return nbPages;
	}
	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}
	public Date getDateParution() {
		return dateParution;
	}
	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}
	public String getLieuParution() {
		return lieuParution;
	}
	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}
	public GenresEnum getGenre() {
		return genre;
	}
	public void setGenre(GenresEnum genre) {
		this.genre = genre;
	}
	
	
}
