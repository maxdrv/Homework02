import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Package extends GiftComponent {

    // Строка для хранения описания пакета
    private String description;
    // ArrayList для хранения элементов пакета
    private List<GiftComponent> giftList = new ArrayList<>();

    /**
     * Конструктор создает пакет с начальной массой и стоимостью 0
     * @param description при создании пакта ему нужно задать описание
     */
    public Package(String description) {
        super(0, 0);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    /**
     *  Метод добавляет giftComponent в giftList, причем нельзя добавить объект в самого себя, это вызовет исключение
     * @param giftComponent может быть либо Package либо Sweets
     */
    public void add(GiftComponent giftComponent) {
        if (this != giftComponent) {                        // является ли текщий объект тем же объектом, что передают в параметре
            giftList.add(giftComponent);                    // добавление giftComponent в giftList
            changeCost(giftComponent.getCost());            // добавление стоимости changeCost и getCost методы суперкласса GiftComponent
            changeWeight(giftComponent.getWeight());        // добавление стоимости changeWeight и getWeight методы суперкласса GiftComponent
        } else {
            throw new UnsupportedOperationException("Нельзя положить пакет в самого себя");
        }
    }

    /**
     *  Метод удаляет giftComponent из giftList, причем нельзя удалить объект из самого себя и в случае удаления объекта которого там нет ничего не произойдет
     * @param giftComponent может быть либо Package либо Sweets
     */
    public void remove(GiftComponent giftComponent) {
        if (this != giftComponent) {                        // является ли текщий объект тем же объектом, что передают в параметре
            if (giftList.remove(giftComponent)) {           // если giftComponent есть в giftList, то он будет удален, если нет ничего не произойдет
                changeCost(-giftComponent.getCost());       // убавление стоимости changeCost и getCost методы суперкласса GiftComponent
                changeWeight(-giftComponent.getWeight());   // убавление стоимости changeWeight и getWeight методы суперкласса GiftComponent
            }
        } else {
            throw new UnsupportedOperationException("Нельзя достать пакет из самого себя");
        }
    }

    /**
     *  Перезапись метода абстрактного класса GiftComponent
     *  Метод выполняет итерацию по giftList и выводит информацию обо всех объектах содержащихся в GiftList
     *  идет подсчет стоимости и массы Package'ей
     */
    @Override
    public void getInfo() {
        double weight = 0;
        double cost = 0;

        // Разделитель указывает на начало Package'а
        System.out.println("+--START_PACKAGE----------+--------------------+---------------+");
        String format1 = "|%1$-62s|\n";
        System.out.format(format1, "  " + getDescription());        // getDescription дает описание Package'а

        // итерация по giftList
        Iterator sweetsIterator = giftList.iterator();
        while (sweetsIterator.hasNext()) {
            GiftComponent giftInfo = (GiftComponent) sweetsIterator.next();
            // вызов getInfo для очередного объекта в giftList, если это Package, то будет вызвана эта же функция,
            // если giftInfo является Sweets, то будет вызван метод getInfo приналежащий классу Sweets
            giftInfo.getInfo();
            weight += giftInfo.getWeight();         // подсчет массы
            cost += giftInfo.getCost();             // подсчет стоимости
        }
        String format2 = "|%1$-25s|%2$-20s|%3$-15s|\n";
        System.out.println("+-------------------------+--------------------+---------------+");
        // Вывод информации о Package, описание, масса и стоимость.
        System.out.format(format2, getDescription() + " Total:", "Weight: " + weight, "Cost: " + cost);
        // Разделитель указывает на конец Package'а
        System.out.println("+--END_PACKAGE------------+--------------------+---------------+");
    }
}


