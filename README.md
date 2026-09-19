# Logistics Factory

A Java console application demonstrating Factory Method and Abstract Factory.

## Patterns

- Factory Method: RoadLogistics creates Truck, and SeaLogistics creates Ship.
- Abstract Factory: WindowsFactory and MacOSFactory create matching buttons and checkboxes.
- DeliveryApplication uses the selected GUI factory and logistics object.

The program prints messages to the console. It does not create a real GUI or perform real deliveries.

## Packages

- logistics — transports and logistics creators.
- ui — buttons, checkboxes and GUI factories.
- app — application workflow and Main.

## Requirements

JDK 17.

## Run in IntelliJ IDEA

1. Open the project and select JDK 17.
2. Open Run → Edit Configurations.
3. Add an Application configuration.
4. Set Main class to app.Main and select the project module.
5. Set Program arguments to ROAD WINDOWS.
6. Click Run. IntelliJ builds the project before running.

## Arguments

Pass exactly two arguments: delivery type and UI platform.
Values are case-sensitive.

Valid combinations:
- ROAD WINDOWS
- ROAD MACOS
- SEA WINDOWS
- SEA MACOS

The sample cargo is Books, and the destination is Astana.

## Example Output

For ROAD WINDOWS:

```text
Rendering Windows button
Rendering Windows checkbox
Truck delivers Books to Astana
```

## Input Validation

Missing or extra arguments print usage instructions.
An unsupported delivery type or platform prints an error message.
The program then stops without rendering components or delivering cargo.

