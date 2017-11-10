package hot;

import java.util.HashMap;
import java.util.Map;

import hot.devices.AC;
import hot.devices.DimmableLamp;
import hot.devices.RoomSystem;
import hot.devices.Switch;

public class HoT {

	static HoT instance = null;
	Map<String,Device> registry = new HashMap<String,Device>();
	
	public static void main(String[] args) {
		System.out.println("Hi! I am the House of Things!");
		getInstance().init();
	}

	private void init() {
		// setup
		Device l1 = DeviceFactory.create("Lamp"); registry.put("L1", l1);
		Device l2 = DeviceFactory.create("Lamp"); registry.put("L2", l2);
		DimmableLamp l3 = (DimmableLamp) DeviceFactory.create("DimmableLamp");
		AC ac = new AC();
		ac.setTemperature(21);

		Switch suitch = new Switch();
		Device roomSystem = new RoomSystem(l1, l2, l3, ac);

		// usage scenarios
		suitch.connectTo(roomSystem);
		suitch.turnOn();
		
		// verifying the system...
		if (l1.isOn() && l2.isOn())
			System.out.println("Yeah!");
		else {
			System.out.println("This is not working...");
		}
		
		l3.dimmTo(5);
		if (l3.isOn() && l3.getIntensity() == 5)
			System.out.println("Yeah!");
		else {
			System.out.println("Dimmer is not working...");
		}
		
		if (ac.getTemperature() == 21)
			System.out.println("Yeah!");
		else {
			System.out.println("AC is not working...");
		}
	}

	public static HoT getInstance() {
		if (instance == null) {
			instance = new HoT();
			instance.init();
		}
		return instance;	
	}

	public Device getDevice(String name) {
		return registry.get(name);
	}
}
