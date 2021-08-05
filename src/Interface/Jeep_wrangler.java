package Interface;

public class Jeep_wrangler implements Cars, GasVehicles{
	
	@Override
	public void start(){
		System.out.println("Call mechanic");
		System.out.println("Oil charge");
		System.out.println("Jump start");
	}
		
	
	public void PumpGas() {
		System.out.println("Pumping Gas");
	}
	
	@Override
	public void SelfParking() {
		System.out.println("Self Parking");
		
	}
	 
}
