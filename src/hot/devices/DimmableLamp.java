package hot.devices;

import hot.Device;

public class DimmableLamp extends Device {
	private int intensity = 0;

	public void dimmTo(int i) {
		intensity = i;
	}

	public int getIntensity() {
		return intensity;
	}	
}
