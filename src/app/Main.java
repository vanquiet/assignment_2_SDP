package app;

import gui.GUIFactory;
import gui.MacOSFactory;
import gui.WindowsFactory;
import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mode = "";
        String platform = "";

        if (args.length >= 2) {
            mode = args[0];
            platform = args[1];
        } else {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter mode (ROAD/SEA): ");
            if (sc.hasNextLine()) {
                mode = sc.nextLine();
            }

            System.out.print("Enter platform (WINDOWS/MACOS): ");
            if (sc.hasNextLine()) {
                platform = sc.nextLine();
            }
        }

        mode = mode.trim();
        platform = platform.trim();

        if (mode.isEmpty() || platform.isEmpty()) {
            System.out.println("Error: Missing input arguments");
            return;
        }

        Logistics logistics;
        if (mode.equalsIgnoreCase("ROAD")) {
            logistics = new RoadLogistics();
        } else if (mode.equalsIgnoreCase("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Error: Unknown mode " + mode);
            return;
        }

        GUIFactory factory;
        if (platform.equalsIgnoreCase("WINDOWS")) {
            factory = new WindowsFactory();
        } else if (platform.equalsIgnoreCase("MACOS")) {
            factory = new MacOSFactory();
        } else {
            System.out.println("Error: Unknown platform " + platform);
            return;
        }

        System.out.println("Delivery mode: " + mode.toUpperCase());
        System.out.println("UI platform: " + platform.toUpperCase());

        DeliveryApplication app = new DeliveryApplication(factory, logistics);
        app.run("laboratory equipment", "Aktau warehouse");
    }
}