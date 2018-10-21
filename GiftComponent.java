public abstract class GiftComponent {

    // поля суперкласса
    private double weight = 0;
    private double cost = 0;

    // конструктор суперкласса
    public GiftComponent(double weight, double cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    // changeWeight работает в двух направлениях, можно как убавить так и добавит weight
    public void changeWeight(double weight) {
        this.weight += weight;
    }

    // так же как и changeWeight
    public void changeCost(double cost) {
        this.cost += cost;
    }

    // Вызовет UnsupportedOperationException() при попытке вызова метода к объекту у которого нет имплементации данного метода
    public String parameter() {
        throw new UnsupportedOperationException();
    }

    public void getInfo() {
        throw new UnsupportedOperationException();
    }
}
