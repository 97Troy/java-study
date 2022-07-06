package objectarray;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];
        Goods good1 = new Goods("abc1", "cloth1", 200,20);
        Goods good2 = new Goods("abc2", "cloth2", 220,15);
        Goods good3 = new Goods("abc3", "cloth3", 210,11);

        goods[0] = good1;
        goods[1] = good2;
        goods[2] = good3;


        for (Goods good : goods) {
            good.show();
        }
    }




}
