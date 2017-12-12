package hot;

import hot.state.Off;
import hot.state.State;
import hot.ui.StatusObserver;
import hot.visitor.DeviceVisitor;
import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BaseDevice implements Device, Cloneable {

  private String id;
  private State state = new Off();
  private List<StatusObserver> observers = new ArrayList<>();

  public BaseDevice() {
    this.id = this.generateUniqueIdentifier();
  }

  public void turnOn() {
    changeState();
  }

  public void turnOff() {
    changeState();
  }

  private void changeState() {
    this.state = this.state().next();
    notifyObservers();
  }

  public boolean isOn() {
    return this.state.isOn();
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
  public State state() {
    return this.state;
  }

  @Override
  public void accept(DeviceVisitor visitor) {
    visitor.visit(this);
  }

  @Override
  public Device clone() {
    BaseDevice clone = SerializationUtils.clone(this);
    clone.id = this.generateUniqueIdentifier();
    return clone;
  }

  @Override
  public String toString() {
    return this.id;
  }

  private String generateUniqueIdentifier() {
    return UUID.randomUUID().toString().split("-")[0];
  }
}
