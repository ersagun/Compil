package fr.ul.miage.exemple;
import java.util.Date;


public class Evenement {

	public String id_event;
	
	public Date date;

	public Evenement (String id, Date d) {
		this.id_event=id;
		this.date=d;
	}

	public String getId_event() {
		return id_event;
	}

	public void setId_event(String id_event) {
		this.id_event = id_event;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
