package com.zoudys.transport.metier;

import java.util.List;
import com.zoudys.transport.entities.*;

public interface TicketMetier {

	public List<Ticket> listAllTicket();
	public Ticket addTicket(Ticket ticket);
	public Ticket updateTicket(Long idTicket, Ticket ticket);
	public boolean deleteTicket(Long idTicket);
	
}
