package hot;

import hot.devices.NullDevice;

public class DeviceFactory {

	public static Device create(String deviceType) {
		Device device = new NullDevice();
		
		try {
			Class deviceClass = Class.forName("hot.devices."+deviceType); 
			device = (Device)deviceClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return device;
	}
}
