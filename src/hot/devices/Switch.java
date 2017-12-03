package hot.devices;

import hot.BaseDevice;
import hot.Device;

import java.util.ArrayList;
import java.util.List;

public class Switch extends BaseDevice {

	private List<Device> devices = new ArrayList<>();
	
	public void connectTo(Device device) {
		devices.add(device);
	}
	
	public void turnOn() {
		devices.forEach(Device::turnOn);
	}

  @Override
  public Device clone() {
    return new Switch();
  }
}
