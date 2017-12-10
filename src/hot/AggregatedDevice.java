package hot;

import hot.devices.Status;
import hot.state.Off;
import hot.state.State;
import hot.ui.StatusObserver;
import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AggregatedDevice implements Device {

  private List<Device> devices = new ArrayList<>();
  private List<StatusObserver> observers = new ArrayList<>();

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
  public State state() {
    return devices.stream().map(Device::state).findFirst().orElse(new Off());
  }

  @Override
  public void register(StatusObserver observer) {
    this.observers.add(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(StatusObserver::update);
  }

  @Override
  public Device clone() {
    return SerializationUtils.clone(this);
  }
}
