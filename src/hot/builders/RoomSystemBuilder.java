package hot.builders;

import hot.AggregatedDevice;
import hot.devices.RoomSystem;

public class RoomSystemBuilder extends AggregatedDeviceBuilder {

  @Override
  public AggregatedDevice build() {
    return new RoomSystem(this.devices, this.observers);
  }
}
