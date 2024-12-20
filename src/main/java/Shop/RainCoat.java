package Shop;

public class RainCoat extends Goods implements Clothes, OuterWear{

    private final String name = "плащ";
    private final int price = 6000;
    private final int number = 2;

    @Override
    public void tryOn(){
        System.out.println("Примерка элемента одежды с наименованием" + name);
    }

    @Override
    public void makeWarm(){
        System.out.println(name + "согревает");
    }

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public int getNumber(){
        return number;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "RainCoat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
