package hot.devices;

import hot.BaseDevice;
import hot.Device;

public class DimmableLamp extends BaseDevice implements Cloneable {

	private Device device;
	private int intensity = 0;

	public DimmableLamp(Device device) {
		this.device = device;
	}

	public void dimmTo(int i) {
		intensity = i;
	}

	public int getIntensity() {
		return intensity;
	}
}
