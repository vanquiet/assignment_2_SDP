# Assignment 2: Factory Method & Abstract Factory

A console-based Java application combining the **Factory Method** and **Abstract Factory** design patterns within a single delivery system.

## Project Purpose
The application demonstrates how two creational design patterns collaborate:
- **Factory Method** handles logistics planning by delegating transport instantiation (`Truck`, `Ship`) to creator subclasses (`RoadLogistics`, `SeaLogistics`).
- **Abstract Factory** provides a consistent UI family (`Button`, `Checkbox`) matching the selected operating system (`Windows`, `macOS`) without coupling the client to concrete UI classes.

## Prerequisites
- Java Development Kit (JDK) 17 or higher

## Project Structure
```text
src/
├── app/
│   ├── DeliveryApplication.java
│   └── Main.java
├── gui/
│   ├── Button.java
│   ├── Checkbox.java
│   ├── GUIFactory.java
│   ├── MacOSButton.java
│   ├── MacOSCheckbox.java
│   ├── MacOSFactory.java
│   ├── WindowsButton.java
│   ├── WindowsCheckbox.java
│   └── WindowsFactory.java
└── logistics/
    ├── Logistics.java
    ├── RoadLogistics.java
    ├── SeaLogistics.java
    ├── Ship.java
    ├── Transport.java
    └── Truck.java
