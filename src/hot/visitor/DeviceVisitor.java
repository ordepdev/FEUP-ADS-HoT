package hot.visitor;

import hot.AggregatedDevice;
import hot.Device;

public interface DeviceVisitor {
  void visit(Device device);
  void visit(AggregatedDevice device);
}
