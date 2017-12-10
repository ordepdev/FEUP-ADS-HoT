package hot;

import hot.state.Off;
import hot.state.State;
import hot.ui.StatusObserver;
import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDevice implements Device, Cloneable {

  private State state = new Off();
  private List<StatusObserver> observers = new ArrayList<>();

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
  public Device clone() {
    return SerializationUtils.clone(this);
  }
}
