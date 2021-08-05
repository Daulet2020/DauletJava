package Interface;

public class ToyotaHybird implements Cars, GasVehicles, ElectricVehicles{

	@Override
	public void Charge() {
		System.out.println("Charge");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Self drive mode");
		
	}

	@Override
	public void PumpGas() {
		System.out.println("Pump Gas");
		
	}

	@Override
	public void start() {
		System.out.println("Push button");
		
	}

	@Override
	public void fly() {
		System.out.println("Flying mode");
		
	}

	@Override
	public void SelfParking() {
		System.out.println("Self Parking mode");
		
	}

}
