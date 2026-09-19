package app;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: <ROAD|SEA> <WINDOWS|MACOS>");
            return;
        }
        String deliveryType = args[0];
        String platform = args[1];
        Logistics logistics;

        if ("ROAD".equals(deliveryType)) {
            logistics = new RoadLogistics();
        } else if ("SEA".equals(deliveryType)) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Invalid delivery type. Use ROAD or SEA.");
            return;
        }
    }
}
