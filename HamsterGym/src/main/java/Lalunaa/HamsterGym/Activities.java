package Lalunaa.HamsterGym;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="activities")
@NamedQueries({
       @NamedQuery(name = "activities.all", query = "SELECT a FROM Activities a"),
       @NamedQuery(name = "activities.id", query = "SELECT a FROM Activities a WHERE a.id=:id")
})
public class Activities implements IHaveId {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	@ManyToOne
	private Trainer trainer;
	private String day;
	private String time;
	private String duration;
	private int groupSize;
	private String description;
	

	public void info() {

		System.out.println("Nazwa: " + type);
		System.out.println("Trener: " + trainer);
		System.out.println("Opis zajęć: " + description);
		System.out.println("Dzień tygodnia: " + day);
		System.out.println("Godzina rozpoczęcia: " + time);
		System.out.println("Czas trwania: " + duration);
		System.out.println("Wielkość grupy: " + groupSize);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getGroupSize() {
		return groupSize;
	}

	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	

}
