# Week 7 Java Practice — Abstract Classes, Interfaces & Polymorphism

Five independent Java exercises. Each folder has one source file containing its supporting types and a runnable demo.

## Problems
1. **The Talking Toy Box** — abstract `Toy`, final ID assigned by a static counter, `ToyCar`, `ToyRobot`.
2. **Warehouse Label Printer** — `Printable` interface, `PackageBox`, `Invoice`, and `printAll`.
3. **Orchestra Warm-Up Routine** — `Instrument` → `StringInstrument` → `Violin`, with each override building on `super.play()`.
4. **Smart Kitchen Assistant** — abstract `KitchenTool`, validated JavaBean speed property, `Washable`, and `Blender`.
5. **Package Drop-Off Log** — abstract `DeliveryNote`, two direct subclasses, overloaded `confirmDelivery`, and polymorphic `logAll`.

## Compile and run
Run these commands from the relevant problem folder:

```bash
javac ToyDemo.java
java ToyDemo
```

Replace `ToyDemo.java` / `ToyDemo` with the source filename / public class name for the chosen problem:
- `PrintableDemo.java` / `PrintableDemo`
- `InstrumentDemo.java` / `InstrumentDemo`
- `KitchenDemo.java` / `KitchenDemo`
- `DeliveryNoteDemo.java` / `DeliveryNoteDemo`

Each folder is independent; compile its source file separately.
