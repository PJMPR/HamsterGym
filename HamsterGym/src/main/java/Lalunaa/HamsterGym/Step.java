package Lalunaa.HamsterGym;

public class Step extends Activities {

	Step() {
		setType("Step");
		setTrainer("Katarzyna Sokół");
		setDescription("Zajęci choreograficzne na stepie. Kształtujące mięśnie  nóg, pośladków oraz łydek, poprawiają kondycję oraz pomagają spalić zbędą tkankę tłuszczową.");
		setDay(Day.Piątek);
		setTime("17:00");
		setDuration("60min");
		setGroupSize(25);

	}

	private int numberOfCustomers() {

		String numberOfCustmers = "SELECT count(*) FROM Step";
		return this.getNumberOfCustomers();
	}

}
