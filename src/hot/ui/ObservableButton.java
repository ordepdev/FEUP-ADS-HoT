package hot.ui;

import hot.devices.Status;

import javax.swing.AbstractButton;

/**
 * ObservableButton is a concrete implementation of StatusObserver in order
 * to keep its state consistent with the notifier object. It's also a decorator
 * of the AbstractButton. It's useful to add the observer capabilities to the
 * concrete JButton class.
 */
public class ObservableButton extends AbstractButton implements StatusObserver {

  private final AbstractButton button;

  public ObservableButton(AbstractButton button) {
    this.button = button;
  }

  @Override
  public void update(Status status) {
    this.button.setText(status.name());
    this.button.setBackground(status.color());
  }
}
