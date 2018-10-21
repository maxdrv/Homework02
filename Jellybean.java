public class Jellybean extends Sweets {

    private String elasticity;

    public Jellybean(double weight, double cost, String name, String elasticity) {
        super(weight, cost, name);
        this.elasticity = elasticity;
    }

    public String getElasticity() {
        return elasticity;
    }

    /**
     *
     * @return возвращает свой уникальный параметр в виде строки
     */
    @Override
    public String parameter() {
        return "Elasticity: " + getElasticity();
    }
}
