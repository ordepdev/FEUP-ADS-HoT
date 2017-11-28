package hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AggregatedDevice implements Device {

  private List<Device> devices = new ArrayList<>();

  public AggregatedDevice(Device... devices) {
    this.devices.addAll(Arrays.asList(devices));
  }

  @Override
  public void turnOn() {
    devices.forEach(Device::turnOn);
  }

  @Override
  public void turnOff() {
    devices.forEach(Device::turnOff);
  }

  @Override
  public boolean isOn() {
    return devices.stream().allMatch(Device::isOn);
  }

  @Override
  public Device clone() {
    return this.clone();
  }
}
