package telran.homework.lesson1;

public class Phone {

    private String number;
    private String model;
    private Double weight;

    public Phone() {

    }

    public Phone(String number, String model, Double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public void printPhoneInfo() {
        System.out.println("Phone info: ");
        System.out.print("Number: " + number);
        System.out.print("Model: " + model);
        System.out.print("Weight:" + weight);
    }

    public void recieveCall(String callerName) {
        System.out.println("Звонок от " + callerName);
    }

    public static void main(String[] args) {

        Phone iphone = new Phone("0154-343-344, ", "Iphone 15 ProMax, ", 200.0);
        Phone samsung = new Phone("0174-345-536, ", "Samsung S23 Ultra, ", 185.5);
        Phone redmi = new Phone("0154-345-123, ", "Redmi 123, ", 154.2);


        iphone.printPhoneInfo();
        System.out.println();

        samsung.printPhoneInfo();
        System.out.println();

        redmi.printPhoneInfo();
        System.out.println();

    }

}
