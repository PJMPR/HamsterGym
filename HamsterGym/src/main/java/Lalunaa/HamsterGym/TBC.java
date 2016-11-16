package Lalunaa.HamsterGym;

public class TBC extends Activities {
	

	
	TBC()
	{
		setType("TBC");
		setTrainer("Kamil Pawelec");
		setDescription("Ćwiczenia ogólnorozwojowe, poprawiające kondycję fizyczną i ujędrniające wszystkie partie mięśniowe. Część główna poprzedzona jest intensywną rozgrzewką również na stepie. Połączenie pracy mięśni  ramion i nóg oraz zastosowanie dużej ilości powtórzeń sprzyja wyższej intensywności zajęć.");
		setDay(Day.Niedziela);
		setTime("17:00");
		setDuration("60min");
		setGroupSize(20);
		
	}
	
	
	private int numberOfCustomers() {
		
		String numberOfCustmers = "SELECT count(*) FROM TBC";
	    return this.getNumberOfCustomers();        
	}
	
	
	
}
