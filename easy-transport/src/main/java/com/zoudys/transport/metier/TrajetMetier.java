package com.zoudys.transport.metier;

import java.util.List;
import com.zoudys.transport.entities.*;

public interface TrajetMetier {

	public List<Trajet> listAllTrajet();
	public Trajet addTrajet(Trajet trajet);
	public boolean deleteTrajet(Long idTrajet);
	public Trajet getTrajet(Long idTrajet);
	public Trajet updateTrajet(Long idTrajet, Trajet trajet);
}
