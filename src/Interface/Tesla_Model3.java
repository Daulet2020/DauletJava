package Interface;

public class Tesla_Model3 implements Cars, ElectricVehicles {

	public void start() {
		System.out.println("Voice control \"Tesla Start  \"");
	}
	
	public void Charge() {
		System.out.println("Charging");
	}
	
	public void SelfDrive() {
		System.out.println("Self Drive mode");
	}
	
	public void fly() {
		System.out.println("Fly mode");
	}
}
 