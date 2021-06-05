public class xx113a {
    private String brand;
    private int price;
    public xx113a(){ }
    public xx113a(String brand){
        this.brand = brand;
    }
    public  xx113a(int price){
        this.price=price;
    }
    public xx113a(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(int p){
        price=p;
    }
    public int getPrice(){
        return price;
    }

    public void show(){             //无stctic
        System.out.println("品牌 "+brand);
        System.out.println("价格 "+price);
        System.out.println("-----分割线-----");
    }
}
