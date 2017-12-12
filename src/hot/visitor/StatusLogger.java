package hot.visitor;

import hot.AggregatedDevice;
import hot.Device;

import java.util.function.Function;

public class StatusLogger implements DeviceVisitor {

  private final Function<Device, String> print =
      device -> "Device #" + device.toString() + ": " + device.state().text();

  @Override
  public void visit(Device device) {
    System.out.println(print.apply(device));
  }

  @Override
  public void visit(AggregatedDevice device) {
    device.devices().forEach(d -> System.out.println(print.apply(d)));
  }
}
