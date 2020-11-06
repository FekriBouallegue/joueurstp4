package com.fekri.joueurs.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.fekri.joueurs.entities.Joueur;

public interface JoueurService {
	Joueur saveJoueur(Joueur p);
	Joueur updateJoueur(Joueur p);
	void deleteJoueur(Joueur p);
	 void deleteJoueurById(Long id);
	 Joueur getJoueur(Long id);
	List<Joueur> getAlljoueurs();
	Page<Joueur> getAllJoueursParPage(int page, int size);
	
		List<Joueur> findByNomProduit(String nom);
		List<Joueur> findByNomProduitContains(String nom);
		List<Joueur> findByNomPrix (String nom, Double prix);
		List<Joueur> findByCategorie (Categorie categorie);
		List<Joueur> findByCategorieIdCat(Long id);
		List<Joueur> findByOrderByNomProduitAsc();
		List<Joueur> trierProduitsNomsPrix();
		}

}
