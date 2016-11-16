package Lalunaa.HamsterGym;

public class Salsation extends Activities {
	

	Salsation()
	{
		setType("Salsation");
		setTrainer("Daria Jolkowska");
		setDescription("Salsation opiera się na radości, którą niesie taniec i ruch, kładzie nacisk na muzyczną interpretację poszczególnych choreografii połączonych z treningiem funkcjonalnym i niesamowitą zabawą. Zajęcia są otwarte dla wszystkich, zarówno początkujących, jak i profesjonalistów. Każdy, kto kocha taniec jest mile widziany. Uczestnicy biorący udział w zajęciach zapoznają się z ruchami i ich techniką, co pozwala im łatwiej i dokładniej podążać za instruktorem oraz skupić się na własnej interpretacji tanecznej.");
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
	
	
	
