package hot.ui;

/**
 * Provides an interface for attaching and detaching Observer objects.
 */
public interface Notifier {

  /**
   * Register an Observer to be notified about the state changes.
   *
   * @param observer {@link StatusObserver}
   */
  void register(StatusObserver observer);

  /**
   * Sends a notification to its observers when the state changes.
   */
  void notifyObservers();
}
