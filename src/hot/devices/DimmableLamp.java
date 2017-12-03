package hot.devices;

import hot.BaseDevice;
import hot.Device;

public class DimmableLamp extends BaseDevice implements DimmableDevice  {

	private Device device;

	private int intensity = 0;

	public DimmableLamp(Device device) {
		this.device = device;
	}

	@Override
	public void turnOn() {
		this.device.turnOn();
	}

	@Override
	public void turnOff() {
		this.device.turnOff();
	}

	@Override
	public boolean isOn() {
		return this.device.isOn();
	}

	@Override
	public void dimmTo(int i) {
		intensity = i;
	}

  @Override
  public int getIntensity() {
		return intensity;
	}
}
