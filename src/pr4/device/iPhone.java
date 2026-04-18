package pr4.device;

public class iPhone extends Device implements SellableAndPluggable{
    int storageGB;

    iPhone(String model, int storageGB) {
        super(model);
        this.storageGB = storageGB;
    }

    @Override
    public void sell() {
        System.out.println(model + " is sold");
    }

    @Override
    public void plugIn() {
        System.out.println(model + " is charging");
    }
}
