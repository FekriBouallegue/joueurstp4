package com.fekri.joueurs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.fekri.joueurs.entities.Joueur;
import com.fekri.joueurs.repos.JoueurRepository;

@SpringBootApplication
public class JoueurServiceImpl implements JoueurService {
	@Autowired
	JoueurRepository joueurRepository;

	@Override
	public Joueur saveJoueur(Joueur p) {
		return joueurRepository.save(p);
	}

	@Override
	public Joueur updateJoueur(Joueur p) {
		return joueurRepository.save(p);
	}

	@Override
	public void deleteJoueur(Joueur p) {
		joueurRepository.delete(p);
		
	}

	@Override
	public void deleteJoueurById(Long id) {
		joueurRepository.deleteById(id);		
	}

	@Override
	public Joueur getJoueur(Long id) {
		return joueurRepository.findById(id).get();
	}

	@Override
	public List<Joueur> getAlljoueurs() {
		return joueurRepository.findAll();
	}

	@Override
	public Page<Joueur> getAllJoueursParPage(int page, int size) {
		return joueurRepository.findAll(PageRequest.of(page, size));

	}

}
