final class Base {
    int price;
    String color;
    static String brand;
    public void setValue(int a, String b){
      price=a;
      color=b;
    }
    public static void getValue(Base a1){
      System.out.println("Price="+a1.price+"Color="+a1.color+"Brand="+brand+ "\n");
    }
    final public static void show(){
        System.out.println("Brand="+brand);
    }
}

public class main2 {
    public static void main(String[] args) {
        Base b1 = new Base();
        b1.setValue(500,"blue");
        Base.brand="iphone";
        // b1.getValue();
        // b1.brand="motorola";
        Base b2 = new Base();
        b2.setValue(1500,"black");
        // b2.getValue();
        Base.getValue(b1);
        Base.show();
    //     Base b3 = new Base();
    //     b3.setValue(1000,"brown","nokia");
    //     b3.getValue();
    // }
    }
}
