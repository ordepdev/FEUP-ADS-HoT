package hot;

import hot.ui.StatusObserver;
import hot.devices.Status;
import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDevice implements Device, Cloneable {

  private Status status = Status.OFF;
  private List<StatusObserver> observers = new ArrayList<>();

  public void turnOn() {
    this.status = Status.ON;
    notifyObservers();
  }

  public void turnOff() {
    this.status = Status.OFF;
    notifyObservers();
  }

  public boolean isOn() {
    return this.status.equals(Status.ON);
  }

  @Override
  public void register(StatusObserver observer) {
    this.observers.add(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(this.status));
  }

  @Override
  public Device clone() {
    return SerializationUtils.clone(this);
  }
}
