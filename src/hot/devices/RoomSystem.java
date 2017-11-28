package hot.devices;

import hot.AggregatedDevice;
import hot.Device;

public class RoomSystem extends AggregatedDevice {

  public RoomSystem(Device... devices) {
    super(devices);
  }

  @Override
  public Device clone() {
    return new RoomSystem();
  }
}
