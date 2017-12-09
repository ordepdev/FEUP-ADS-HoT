package hot;

import hot.devices.DimmableLamp;
import hot.devices.Lamp;
import hot.devices.NullDevice;

import java.util.HashMap;
import java.util.Map;

public class DeviceFactory {

	private static final Map<String, Device> prototypes = new HashMap<>();

	static {
		prototypes.put("Lamp", new Lamp());
		prototypes.put("DimmableLamp", new DimmableLamp(new Lamp()));
	}

	public static Device create(String deviceType) {
		return prototypes.getOrDefault(deviceType, NullDevice.instance()).clone();
	}
}
