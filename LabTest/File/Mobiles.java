class Mobile {
    protected String Brand;
    protected String Processor;

    Mobile(String Brand, String Processor) {
        this.Brand = Brand;
        this.Processor = Processor;
    }

    public void DeviceType() {
        System.out.println("General Mobile Phone");
    }

    public void status() {
        System.out.println("Status: Active");
    }
}

class Samsung extends Mobile {
    protected String MadeIn;
    protected String MadeYear;

    Samsung(String MadeIn, String MadeYear, String Brand, String Processor) {
        super(Brand, Processor);
        this.MadeIn = MadeIn;
        this.MadeYear = MadeYear;
    }

    @Override
    public void DeviceType() {
        System.out.println("Smartphone");
    }
}

class SamsungGalaxy extends Samsung {
    private String ScreenSize;

    SamsungGalaxy(String ScreenSize, String MadeIn, String MadeYear, String Brand, String Processor) {
        super(MadeIn, MadeYear, Brand, Processor);
        this.ScreenSize = ScreenSize;
    }

    @Override
    public void DeviceType() {
        System.out.println("Flagship Smartphone");
    }

    public String getScreenSize() {
        return ScreenSize;
    }
}

public class Mobiles {
    public static void main(String[] args) {
        SamsungGalaxy galaxy = new SamsungGalaxy("6.7 inch", "South Korea", "2026", "Samsung", "Snapdragon 8 Gen 3");

        System.out.println("Mobile Information\n");
        System.out.println("Brand: " + galaxy.Brand);
        System.out.println("Processor: " + galaxy.Processor);
        System.out.println("Made In: " + galaxy.MadeIn);
        System.out.println("Made Year: " + galaxy.MadeYear);
        System.out.println("Screen Size: " + galaxy.getScreenSize());
        galaxy.status();
    }
}
