package hot.builders;

import hot.AggregatedDevice;
import hot.Device;
import hot.ui.StatusObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class AggregatedDeviceBuilder {

  protected List<Device> devices = new ArrayList<>();
  protected List<StatusObserver> observers = new ArrayList<>();

  public AggregatedDeviceBuilder withDevice(Device device) {
    this.devices.add(device);
    return this;
  }

  public AggregatedDeviceBuilder withObserver(StatusObserver observer) {
    this.observers.add(observer);
    return this;
  }

  public abstract AggregatedDevice build();
}
