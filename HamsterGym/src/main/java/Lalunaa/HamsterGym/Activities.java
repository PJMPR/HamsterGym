package Lalunaa.HamsterGym;

public class Activities implements IHaveId {

	private String type;
	private String trainer;
	private Day day;
	private String time;
	private String duration;
	private int groupSize;
	private String description;
	private int numberOfCustomers;
	
	
	private int id;
	

	public void info() {

		System.out.println("Nazwa: " + type);
		System.out.println("Trener: " + trainer);
		System.out.println("Opis zajęć: " + description);
		System.out.println("Dzień tygodnia: " + day);
		System.out.println("Godzina rozpoczęcia: " + time);
		System.out.println("Czas trwania: " + duration);
		System.out.println("Wielkość grupy: " + groupSize);
		System.out.println("Obecnie zapisanych: " + numberOfCustomers);
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
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
