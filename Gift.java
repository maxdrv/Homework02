public class Gift{

    private String name;
    private String parameter;
    private double weight;
    private double cost;

    public Gift(String name, String parameter, double weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.parameter = parameter;
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }
    public double getCost() { return cost; }
    public String getParameter() { return parameter; }

}
