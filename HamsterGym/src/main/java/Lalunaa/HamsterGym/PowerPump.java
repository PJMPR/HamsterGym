package Lalunaa.HamsterGym;

public class PowerPump extends Activities {

	PowerPump() {
		setType("PowerPump");
		setTrainer("Jolanta Róża");
		setDescription("Zajęcia wytrzymałościowo-siłowe z wykorzystaniem specjalnej sztangi. Niezwykle efektywny sposób na kształtowanie sylwetki poprzez pracę z obciążeniem dostosowanym do indywidualnych możliwości ćwiczącego. Doskonała alternatywa dla treningu siłowego. Zaleca się aby osoby uczestniczące w zajęciach po raz pierwszy zgłosiły do instruktora prowadzącego w celu dobrania odpowiedniego obciążenia.");
		setDay(Day.Środa);
		setTime("17:30");
		setDuration("60min");
		setGroupSize(20);

	}

	private int numberOfCustomers() {

		String numberOfCustmers = "SELECT count(*) FROM PowerPump";
		return this.getNumberOfCustomers();
	}

}
