package hot.ui;

import hot.Device;

import javax.swing.AbstractButton;

/**
 * ObservableButton is a concrete implementation of StatusObserver in order
 * to keep its state consistent with the notifier object. It's also a decorator
 * of the AbstractButton. It's useful to add the observer capabilities to the
 * concrete JButton class.
 */
public class ObservableButton extends AbstractButton implements StatusObserver {

  private final Device device;

  private final AbstractButton button;

  public ObservableButton(Device device, AbstractButton button) {
    this.device = device;
    this.button = button;
  }

  @Override
  public void update() {
    this.button.setText(device.state().text());
    this.button.setBackground(device.state().color());
  }
}
