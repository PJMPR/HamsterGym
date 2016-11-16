package Lalunaa.HamsterGym;



public class ABT extends Activities {

	
	ABT()
	{
		setType("ABT");
		setTrainer("Marek Jankowski");
		setDescription("Ćwiczenia ukierunkowane na najbardziej problematyczne partie mięśniowe u kobiet: brzuch, uda, pośladki. Prowadzone w umiarkowanym tempie również z użyciem dodatkowych przyborów gimnastycznych.");
		setDay(Day.Poniedziałek);
		setTime("18:00");
		setDuration("60min");
		setGroupSize(20);
						
	}
	
	public void info() {
		super.info();
	}
	
	
	private int numberOfCustomers() {
		
		String numberOfCustmers = "SELECT count(*) FROM ABT";
	    return this.getNumberOfCustomers();        
	}
	
	


	
	
		
	




}