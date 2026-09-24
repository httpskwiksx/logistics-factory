package app;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;
import ui.GUIFactory;
import ui.WindowsFactory;
import ui.MacOSFactory;
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: <ROAD|SEA> <WINDOWS|MACOS>");
            return;
        }
        String deliveryType = args[0].toUpperCase();
        String platform = args[1].toUpperCase();

        boolean validInput = true;

        if (!"ROAD".equals(deliveryType) && !"SEA".equals(deliveryType)) {
            System.out.println("Invalid delivery type. Use ROAD or SEA.");
            validInput = false;
        }

        if (!"WINDOWS".equals(platform) && !"MACOS".equals(platform)) {
            System.out.println("Invalid platform. Use WINDOWS or MACOS.");
            validInput = false;
        }

        if (!validInput) {
            return;
        }

        Logistics logistics;

        if ("ROAD".equals(deliveryType)) {
            logistics = new RoadLogistics();
        } else {
            logistics = new SeaLogistics();
        }

        GUIFactory factory;

        if ("WINDOWS".equals(platform)) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }
    }
}