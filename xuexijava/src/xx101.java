public class xx101 {
    public static void main(String[] args) {
        xx100 computer = new xx100();
        System.out.print(computer.brand);
        System.out.println(computer.price);
        computer.brand = "华硕";
        computer.price = 4233;
        System.out.print(computer.brand);
        System.out.println(" "+computer.price);
        computer.playGames();
        computer.doWork();
        System.out.println("----------------");
        computer.brand = "联想";
        computer.price = 3000;
        System.out.print(computer.brand);
        System.out.println(" "+computer.price);
        computer.playGames();
        computer.doWork();

    }
    }

