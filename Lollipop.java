public class Lollipop extends Sweets{

    private String hardness;

    public Lollipop(double weight, double cost, String name, String hardness) {
        super(weight, cost, name);
        this.hardness = hardness;
    }

    public String getHardness() {
        return hardness;
    }

    /**
     *
     * @return возвращает свой уникальный параметр в виде строки
     */
    @Override
    public String parameter() {
        return "Hardness: " + getHardness();
    }
}
