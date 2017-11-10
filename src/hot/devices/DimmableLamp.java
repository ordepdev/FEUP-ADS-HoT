package hot.devices;

import hot.BaseDevice;

public class DimmableLamp extends BaseDevice {
	private int intensity = 0;

	public void dimmTo(int i) {
		intensity = i;
	}

	public int getIntensity() {
		return intensity;
	}	
}
