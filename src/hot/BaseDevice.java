package hot;

import hot.ui.StatusObserver;
import hot.devices.Status;
import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDevice implements Device, Cloneable {

  private boolean on = false;
  private List<StatusObserver> observers = new ArrayList<>();

  public void turnOn() {
    this.on = true;
    notifyObservers();
  }

  public void turnOff() {
    this.on = false;
    notifyObservers();
  }

  public boolean isOn() {
    return this.on;
  }

  @Override
  public void register(StatusObserver observer) {
    this.observers.add(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(on ? Status.ON : Status.OFF));
  }

  @Override
  public Device clone() {
    return SerializationUtils.clone(this);
  }
}
