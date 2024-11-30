package Shop;

public class Apple extends Goods implements Food{

    private final String name = "яблоки";
    private final int price = 300;

    @Override
    public int getPrice(){
        return getPrice();
    }

    @Override
    public void weight(){
        System.out.println("Произвожу взвешивание яблок");
    }

    @Override
    public String toString(){
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
