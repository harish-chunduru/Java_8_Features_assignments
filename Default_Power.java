interface Power {
    void showPower(); // abstract method
    default void defaultPower() {
        System.out.println("Default Power: 100W");
    }
}

public class Default_Power implements Power {
    @Override
    public void showPower() {
        System.out.println("Custom Power: 200W");
    }

    public static void main(String[] args) {
        Default_Power dp = new Default_Power();
        dp.showPower();      // Call abstract method
        dp.defaultPower();   // Call default method
    }
}
