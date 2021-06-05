public class xx093 {
    public static void main(String[] args) {
        //鸡公一只五文钱，鸡母一只三文钱，鸡仔三个一文钱
        for(int i =0;i<=20;i++){
            for(int j = 0;j<=33;j++){
                int k = 100-i-j;
              if(k%3==0 && 5*i+3*j+k/3==100){
                  System.out.print(i+" ");
                  System.out.print(j+" ");
                  System.out.print(k);
                  System.out.println();
                }
            }
        }
    }
}
