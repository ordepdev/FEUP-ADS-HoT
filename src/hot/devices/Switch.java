package hot.devices;

import hot.BaseDevice;
import hot.Device;

import java.util.ArrayList;

public class Switch extends BaseDevice {

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
