public class Homework02 {
    public static void main(String[] args) {

        Gift a1 = new Gift("Apple", "Green",0.250, 10.50);
        Gift a2 = new Gift("Candy", "Caramel",0.300, 20.01);
        Gift a3 = new Gift("Jellybean", "Blueberry",0.150, 15.50);
        Gift a4 = new Gift("Candy", "Chocolate",0.2, 20);
        Gift a5 = new Gift("Jellybean", "Grape Soda",0.2, 10.99);


        GiftPackage gp1 = new GiftPackage();
        gp1.add(a1);
        gp1.add(a2);
        gp1.add(a3);
        gp1.add(a4);
        gp1.add(a5);

        //gp.remove(a5);    // удаление по ссылке
        //gp1.remove(1);    // удаление по индексу
        //gp.remove(9);     // не будет работать так как индекс выходит за пределы ArrayList
        gp1.getInfo();
    }
}
