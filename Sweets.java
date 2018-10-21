public abstract class Sweets extends GiftComponent {

    private String name;

    public Sweets(double weight, double cost, String name) {
        super(weight, cost);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     *  Перезапись метода абстрактного класса GiftComponent
     *  Метод выводит информацию об объекте Sweets
     */
    @Override
    public void getInfo() {
        String format3 = "|%1$-25s|%2$-20s|%3$-15s|%4$-30s\n";
        System.out.format(format3, "   Name: " + getName(), "Weight: " + super.getWeight(), "Cost: " + super.getCost(), parameter());
    }
}
