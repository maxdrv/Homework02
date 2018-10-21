public class Candy extends Sweets {

    private String sweetness;

    public Candy(double weight, double cost, String name, String sweetness) {
        super(weight, cost, name);
        this.sweetness = sweetness;
    }

    public String getSweetness() {
        return sweetness;
    }

    /**
     *
     * @return возвращает свой уникальный параметр в виде строки
     */
    @Override
    public String parameter() {
        return "Sweetness: " + getSweetness();
    }
}
