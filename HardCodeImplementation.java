public class HardCodeImplementation {

    public void go() {
        // Для удобства проверки, масса и стоимость приведены одинаковые 0.1 и 1.0
        Sweets lollipop1 = new Lollipop(0.1,1,"Chupa Chups", "0.5");
        Sweets candy1 = new Candy(0.1,1,"Caramel", "0.87");
        Sweets candy2 = new Candy(0.1,1,"Chocolate", "0.59");
        Sweets candy3 = new Candy(0.1,1,"With liquor", "0.75");
        Sweets jellybean1 = new Jellybean(0.1,1,"Gummy Bears", "0.7");
        Sweets jellybean2 = new Jellybean(0.1,1,"Jelly Snakes", "0.65");

        // Упаковка пакета с жевательными конфетами
        Package pack3 = new Package("JellybeanPack");
        pack3.add(jellybean1);
        pack3.add(jellybean2);

        // Упаковка пакета с конфетами
        Package pack2 = new Package("CandyPack");
        pack2.add(candy1);
        pack2.add(candy2);
        //  В пакет с конфетами кладут пакет с жевательными конфетами
        pack2.add(pack3);

        // В главный пакет кладут пакет с конфетами и дополнительно чупачупс
        Package pack1 = new Package("Main");
        pack1.add(lollipop1);
        pack1.add(pack2);

        // Пополняем внутренний пакет с конфетами
        pack2.add(candy3);

        // Вывод информации в консоль
        pack1.getInfo();

        // Удаление конфеты из внутреннуго пакета
        pack2.remove(candy1);
        System.out.println("================================================================");
        pack1.getInfo();

    }
}
