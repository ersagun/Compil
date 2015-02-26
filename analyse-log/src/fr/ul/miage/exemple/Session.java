package fr.ul.miage.exemple;
import java.util.ArrayList;
import java.util.Date;

/**
 * Classe a pour l'objectif de gerer les sessions
 * @author Ersagun
 *
 */
public class Session {

	public static ArrayList<Evenement> list_e= new ArrayList<Evenement>();

	public int id_session;

	public String ip;

	public long getFirst() {
		return (list_e.get(0).date).getTime();
	}

	public long getLast() {
		return (list_e.get(list_e.size()).date).getTime();
	}

	public void add(Evenement e) {
		this.list_e.add(e);
	}

	public boolean isDateOk (long date) {
		if (date>this.getFirst() && TpsExec.getTime(this.getFirst(), date)<=600000) {
			return true;
		}
		else {
			return false;
		}
	}

	public Session(String ip, int id_session ) {
		super();
		this.id_session = id_session;
		this.ip = ip;
	}

	public static ArrayList<Evenement> getList_e() {
		return list_e;
	}

	public static void setList_e(ArrayList<Evenement> list_e) {
		Session.list_e = list_e;
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
