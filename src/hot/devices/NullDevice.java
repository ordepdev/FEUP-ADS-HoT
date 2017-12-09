package hot.devices;

import hot.BaseDevice;
import hot.Device;

public class NullDevice extends BaseDevice {

  private static Device instance;

  public static Device instance() {
    if(instance == null){
      instance = new NullDevice();
    }
    return instance;
  }

  private NullDevice() {
  }

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
