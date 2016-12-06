package Lalunaa.HamsterGym;

public class Salsation extends Activities {

	Salsation() {
		setType("Salsation");
		setTrainer("Daria Jolkowska");
		setDescription("Salsation opiera się na radości, którą niesie taniec i ruch, kładzie nacisk na muzyczną interpretację poszczególnych choreografii połączonych z treningiem funkcjonalnym i niesamowitą zabawą. Każdy, kto kocha taniec jest mile widziany.");
		setDay(Day.Czwartek);
		setTime("19:00");
		setDuration("90min");
		setGroupSize(15);

	}

	private int numberOfCustomers() {

		String numberOfCustmers = "SELECT count(*) FROM Salsation";
		return this.getNumberOfCustomers();
	}

}
