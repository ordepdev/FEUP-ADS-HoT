package hot;

import hot.builders.RoomSystemBuilder;
import hot.ui.Dashboard;
import hot.visitor.StatusLogger;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Arrays;

public final class HoT {

  private static HoT instance;

  /**
   * Create the application.
   */
  private HoT() {
    initialize();
  }

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
      try {
        HoT.instance();
      } catch (Exception e) {
        e.printStackTrace();
      }
    });
  }

  public static HoT instance() {
    if (instance == null) {
      instance = new HoT();
    }
    return instance;
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Dashboard dashboard = new Dashboard();
    frame.getContentPane().add(dashboard.getPanel(), BorderLayout.CENTER);

    dashboard.add(DeviceFactory.create("Lamp"), 0, 0, 2, 1);
    dashboard.add(DeviceFactory.create("Lamp"), 0, 1, 1, 1);
    dashboard.add(DeviceFactory.create("Lamp"), 0, 2, 1, 1);
    dashboard.add(DeviceFactory.create("Lamp"), 0, 3, 1, 1);
    dashboard.add(DeviceFactory.create("Lamp"), 1, 1, 1, 1);
    dashboard.add(DeviceFactory.create("Lamp"), 1, 2, 1, 1);
    dashboard.add(DeviceFactory.create("Lamp"), 1, 3, 1, 1);
    dashboard.add(DeviceFactory.create("Lamp"), 2, 0, 2, 2);
    dashboard.add(DeviceFactory.create("Lamp"), 2, 2, 1, 1);
    dashboard.add(DeviceFactory.create("Lamp"), 2, 3, 1, 1);
    dashboard.add(DeviceFactory.create("Lamp"), 3, 2, 1, 1);
    dashboard.add(DeviceFactory.create("DimmableLamp"), 3, 3, 1, 1);

    Arrays.asList(
        DeviceFactory.create("DimmableLamp"),
        DeviceFactory.create("Lamp"),
        DeviceFactory.create("Lamp"),
        DeviceFactory.create("Lamp"),
        new RoomSystemBuilder()
            .withDevice(DeviceFactory.create("Lamp"))
            .withDevice(DeviceFactory.create("Lamp"))
            .withDevice(DeviceFactory.create("DimmableLamp"))
            .build()
    ).forEach(y -> y.accept(new StatusLogger()));
  }
}
