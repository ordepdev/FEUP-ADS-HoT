package hot.devices;

public interface DimmableDevice {

  void dimmTo(int intensity);

  int getIntensity();
}
