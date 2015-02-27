package fr.ul.miage.exemple;



import java.util.ArrayList;


/**
 * Classe a pour l'objectif de presenter une session
 * @author Ersagun
 *
 */
public class Session {
	/**
	 * Liste d'evenement
	 */
	public ArrayList<Evenement> list_e= new ArrayList<Evenement>();
	
	/**
	 * id de session
	 */
	public int id_session;
	
	/**
	 * adresse ip 
	 */
	public String ip;
	/**
	 * premiere evenement
	 * @return
	 */
	public long getFirst() {
		return (list_e.get(0).date).getTime();
	}
	/**
	 * derniere evenement
	 * @return
	 */
	public long getLast() {
		return (list_e.get(list_e.size()).date).getTime();
	}
	/**
	 * ajoute dans la liste
	 * @param e
	 */
	public void add(Evenement e) {
		list_e.add(e);
	}
	/**
	 * verifie la date
	 * @param date
	 * @return
	 */
	public boolean isDateOk (long date) {
		if (date>this.getFirst() && TpsExec.getTime(this.getFirst(), date)<=600000) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Une session a un ip et un id
	 * @param ip
	 * @param id_session
	 */
	public Session(String ip, int id_session ) {
		super();
		this.id_session = id_session;
		this.ip = ip;
	}
	
	public ArrayList<Evenement> getList_e() {
		return list_e;
	}

	public void setList_e(ArrayList<Evenement> list_e) {
		this.list_e = list_e;
	}

	public int getId_session() {
		return id_session;
	}

	public void setId_session(int id_session) {
		this.id_session = id_session;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
