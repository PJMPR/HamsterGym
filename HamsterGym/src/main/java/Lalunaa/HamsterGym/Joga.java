package Lalunaa.HamsterGym;

public class Joga extends Activities {

	Joga() {
		
		setType("Joga");
		setTrainer("Eliza Kózka");
		setDescription("Zajmuje się rozwojem człowieka zarówno w sensie fizycznym, psychicznym jak i duchowym. Pozwala integrować myślenie, emocje i działanie, prowadzi do osiągnięcia równowagi i harmonii, po za tym jest doskonałą metodą pracy nie tylko z ciałem. Buduje piękną sylwetkę, poprawia stan zdrowia, działa również kojąco na nerwy, wycisza umysł. Systematyczne ćwiczenia mają działanie profilaktyczne na większość chorób. Dodają energii i siły działaniom w codziennym życiu. Zajęcia dla wszystkich.");
		setDay(Day.Wtorek);
		setTime("19:00");
		setDuration("45min");
		setGroupSize(25);

	}

	private int numberOfCustomers() {

		String numberOfCustmers = "SELECT count(*) FROM Joga";
		return this.getNumberOfCustomers();
	}

}
