package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.dto.LivreRequestSaveDTO;
import com.univlittoral.projetback.entity.LivreEntity;

public class LivreMapper {
	public static LivreDTO map(LivreEntity LivreEntity) {
		LivreDTO result = new LivreDTO();
		result.setId (LivreEntity.getId());
		result.setNom (LivreEntity.getNom());
		result.setEditeur (LivreEntity.getEditeur());
		result.setNbPages (LivreEntity.getNbPages());
		result.setDateParution (LivreEntity.getDateParution());
		result.setLieuParution (LivreEntity.getLieuParution());
		result.setGenre (LivreEntity.getGenre());
		return result;
	}
	
	
	public static LivreEntity mapSave(LivreRequestSaveDTO livreDTO) {

	    LivreEntity result = new LivreEntity();


	    if(livreDTO.getId() != null) {
            result.setId (livreDTO.getId());
        }
		result.setNom (livreDTO.getNom());
		result.setEditeur (livreDTO.getEditeur());
		result.setNbPages (livreDTO.getNbPages());
		result.setDateParution (livreDTO.getDateParution());
		result.setLieuParution (livreDTO.getLieuParution());
		result.setGenre (livreDTO.getGenre());

	    return result;
	    }
	
	public static LivreEntity mapEntityToEntity(LivreEntity myEntity, LivreRequestSaveDTO lrs) { 
		
		myEntity.setId (lrs.getId());
		myEntity.setNom (lrs.getNom());
		myEntity.setEditeur (lrs.getEditeur());
		myEntity.setNbPages (lrs.getNbPages());
		myEntity.setDateParution (lrs.getDateParution());
		myEntity.setLieuParution (lrs.getLieuParution());
		myEntity.setGenre (lrs.getGenre());

		return myEntity;
		}
	
	public static List <LivreDTO> map(List<LivreEntity> livreEntities){
		List <LivreDTO>result= new ArrayList<LivreDTO>();
		for(final LivreEntity entity : livreEntities) {
			result.add(LivreMapper.map(entity));
		}
		return result;
	}
}
