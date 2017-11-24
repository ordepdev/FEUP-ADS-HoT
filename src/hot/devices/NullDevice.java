package hot.devices;

import hot.BaseDevice;

public class NullDevice extends BaseDevice {

	@Override
	public void turnOn() {
	}

  @Override
	public void turnOff() {
	}

  @Override
	public boolean isOn() {
		return false;
	}
}
