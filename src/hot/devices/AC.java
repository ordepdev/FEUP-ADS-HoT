package hot.devices;

import hot.BaseDevice;

public class AC extends BaseDevice {

	private int targetTemperature = 10;
	private int ambientTemperature = 10;

	public void setTemperature(int t) {
		targetTemperature = t;
	}

	public int getTemperature() {
		return ambientTemperature;
	}

}
