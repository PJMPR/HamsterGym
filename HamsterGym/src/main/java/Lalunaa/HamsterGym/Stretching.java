package Lalunaa.HamsterGym;

public class Stretching extends Activities {

	Stretching() {
		setType("Stretching");
		setTrainer("Karolina Polna");
		setDescription("Zajęcia poświęcone rozciąganiu wszystkich partii mięśniowych, prowadzone przy spokojnej, relaksacyjnej  muzyce. Dzięki regularnemu rozciąganiu ciało staje się bardziej elastyczne i przygotowane do efektywnego wykonywania ćwiczeń na innych zajęciach. Stretching doskonale likwiduje przykurcze mięśniowe, które mogą być spowodowane, np. siedzącym trybem pracy czy treningiem siłowym. Zajęcia dla wszystkich.");
		setDay(Day.Sobota);
		setTime("18:30");
		setDuration("45min");
		setGroupSize(25);

	}

	private int numberOfCustomers() {

		String numberOfCustmers = "SELECT count(*) FROM Stretching";
		return this.getNumberOfCustomers();
	}

}
