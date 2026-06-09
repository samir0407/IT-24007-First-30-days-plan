class Car {
    protected String Color;
    protected String Model;

    Car(String Color, String Model) {
        this.Color = Color;
        this.Model = Model;
    }

    public void CarType() {
        System.out.println("Utility Vehicle");
    }

    public void status() {
        System.out.println("Status: Running");
    }
}

class Toyota extends Car {
    protected String MadeIn;
    protected String MadeYear;

    Toyota(String MadeIn, String MadeYear, String Color, String Model) {
        super(Color, Model);
        this.MadeIn = MadeIn;
        this.MadeYear = MadeYear;
    }

    @Override
    public void CarType() {
        System.out.println("Off-roader");
    }
}

class ToyotaPremio extends Toyota {
    private String BodyType;

    ToyotaPremio(String BodyType, String MadeIn, String MadeYear, String Color, String Model) {
        super(MadeIn, MadeYear, Color, Model);
        this.BodyType = BodyType;
    }

    @Override
    public void CarType() {
        System.out.println("Passenger Car");
    }

    public String getBodyType() {
        return BodyType;
    }
}

public class Cars {
    public static void main(String[] args) {
        ToyotaPremio premio = new ToyotaPremio("White", "Premio G X","Japan", "2024" , "Sedan");

        System.out.println("Car Information\n");
        System.out.println("Color: " + premio.Color);
        System.out.println("Model: " + premio.Model);
        System.out.println("Made In: " + premio.MadeIn);
        System.out.println("Made Year: " + premio.MadeYear);
        System.out.println("Body Type: " + premio.getBodyType());
        premio.status();
    }
}
