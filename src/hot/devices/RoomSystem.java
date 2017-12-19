package hot.devices;

import hot.AggregatedDevice;
import hot.Device;
import hot.ui.StatusObserver;

import java.util.List;

public class RoomSystem extends AggregatedDevice {

  public RoomSystem(Device... devices) {
    super(devices);
  }

  public RoomSystem(List<Device> devices, List<StatusObserver> observers) {
    super(devices, observers);
  }
}
