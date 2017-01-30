package Lalunaa.HamsterGym;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
@NamedQueries({
       @NamedQuery(name = "trainer.all", query = "SELECT t FROM Trainer t"),
       @NamedQuery(name = "trainer.id", query = "SELECT t FROM Trainer t WHERE t.id=:id")
})
public class Trainer implements IHaveId {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;	
		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
