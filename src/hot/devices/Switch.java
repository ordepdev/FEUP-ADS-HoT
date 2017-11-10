package hot.devices;

import java.util.ArrayList;

public class Switch extends Device {

	ArrayList<Device> devices = new ArrayList<Device>();
	
	public void connectTo(Device device) {
		devices.add(device);
	}
	
	public void turnOn() {
		for (Device device: devices) {
			device.turnOn();
		}
	}


}
