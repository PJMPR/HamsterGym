package Lalunaa.HamsterGym;

public class Joga extends Activities {

	Joga() {
		
		setType("Joga");
		setTrainer("Eliza Kózka");
		setDescription("Zajmuje się rozwojem człowieka zarówno w sensie fizycznym, psychicznym jak i duchowym. Buduje piękną sylwetkę, poprawia stan zdrowia, działa również kojąco na nerwy, wycisza umysł. Dodają energii i siły działaniom w codziennym życiu.");
		setDay(Day.Wtorek);
		setTime("19:00");
		setDuration("45min");
		setGroupSize(25);

	}
	
	public void info() {
		super.info();
	}

	private int numberOfCustomers() {

		String numberOfCustmers = "SELECT count(*) FROM Joga";
		return this.getNumberOfCustomers();
	}

}
