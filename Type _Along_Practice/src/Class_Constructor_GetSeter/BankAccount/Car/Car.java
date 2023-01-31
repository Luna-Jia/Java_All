package Class_Constructor_GetSeter.BankAccount.Car;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // state, fields, templete, blueprint

    public void setModel(String model){
        String validModule = model.toLowerCase();
        if (validModule.equals("carrera") || validModule.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
