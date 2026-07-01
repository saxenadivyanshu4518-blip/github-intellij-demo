package OOP.Abstraction;

// Abstract class defining the blueprint

abstract class CoffeeMachine {

    // Concrete method: Every machine boils water exactly the same way

    public void boilWater() {
        System.out.println("Boiling water to 90°C...");
    }

    // Abstract method: Every machine brews coffee differently

    public abstract void brew();
}

// Subclass 1: Espresso Machine

class EspressoMachine extends CoffeeMachine {
    @Override
    public void brew() {
        System.out.println("Extracting espresso under high pressure.");
    }
}

// Subclass 2: Premium Drip Coffee Machine

class DripCoffeeMachine extends CoffeeMachine {
    @Override
    public void brew() {
        System.out.println("Dripping water slowly through paper filter.");
    }
}

// Execution Class

public class Main {
    public static void main(String[] args) {

        // CoffeeMachine machine = new CoffeeMachine(); // ERROR! You cannot instantiate abstract classes.

        CoffeeMachine myMachine = new EspressoMachine();
        CoffeeMachine myMachine1 = new DripCoffeeMachine();
        myMachine.boilWater(); // Inherited concrete logic
        myMachine.brew();    // Specific abstract implementation
        myMachine1.brew();
    }
}
