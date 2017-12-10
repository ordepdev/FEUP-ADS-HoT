package hot.ui;

/**
 * Defines an updating interface for objects that
 * should be notified of status changes in a device.
 */
public interface StatusObserver {

  /**
   * Update the state of the observer object
   * based on the notifier object status.
   */
  void update();
}
