public class xx113b {
    public static void main(String[] args) {
        xx113a computer1 = new xx113a();
        computer1.show();
        xx113a computer2 = new xx113a("华硕");
        computer2.show();
        xx113a computer3 = new xx113a(3000);
        computer3.show();
        xx113a computer4 = new xx113a("联想",5000);
        computer4.show();
        xx113a computer5 = new xx113a();
        computer5.setBrand("惠普");
        computer5.setPrice(10000);
        computer5.show();

    }
}
