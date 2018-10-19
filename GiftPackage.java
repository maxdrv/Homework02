import java.util.ArrayList;


public class GiftPackage{

    private double weight;
    private double cost;
    private ArrayList<Gift> listGifts = new ArrayList<>();

    /**
     * Добавляет объект в ArrayList и прибавляет общую стоимость и вес коробки
     * @param newGift
     */
    public void add(Gift newGift) {
        listGifts.add(newGift);
        this.weight += newGift.getWeight();
        this.cost += newGift.getCost();
    }

    /**
     * Удаление по сслыке на объект, если такой объект есть в ArrayList, то он будет удален, если его нет, то ничего не произойдет
     * @param newGift
     */
    public void remove(Gift newGift) {
        if (listGifts.remove(newGift)) {
            this.weight -= newGift.getWeight();
            this.cost -= newGift.getCost();
        }
    }

    /**
     * Удаление по индексу, если указаный индекс выходит за пределы ArrayList вызовет Exception
     * @param index
     */
    public void remove(int index) {
        Gift forRemove = listGifts.remove(index);
        this.weight -= forRemove.getWeight();
        this.cost -= forRemove.getCost();

    }

    public double getWeight() { return weight; }
    public double getCost() { return cost; }

    /**
     * Обеспечивает обход по ArrayList и вывод информации о подарке в консоль
     */
    public void getInfo() {
        System.out.println("+-------------------------");
        System.out.format("|Общий вес подарка: %.3f кг\n", getWeight());
        System.out.format("|Общая стоимость: %.2f \u20BD\n", getCost());
        System.out.println("+-------------------------");


        String format = "|%1$-40s|%2$-30s|%3$-15s|%4$-15s|\n";
        for (Gift listGift : listGifts) {
            System.out.format(format, "Название: " + listGift.getName(), "Параметр: " + listGift.getParameter(), "Вес: " + listGift.getWeight() + " кг", "Цена: " + listGift.getCost() + " \u20BD");
        }
    }
}
