public class Droid {
    int batteryLevel = 100;
    String name;

    public Droid(String droidName) {
        name = droidName;
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public static void main(String[] args) {
        Droid droid = new Droid("Codey");
        System.out.println(droid);
        droid.performTask("dancing");
        System.out.println(droid.batteryLevel);
    }
}