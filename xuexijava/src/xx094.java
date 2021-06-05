public class xx094 {
    public static void main(String[] args) {
        int[] shuzu={68,27,95,88,171,996,51,210};
        int sum = 0;
        for(int i=0;i< shuzu.length;i++){
            if(shuzu[i]%2==1 | shuzu[i]%10==7 | shuzu[i]/10%10==7){
                continue;
            }else {
                sum += shuzu[i];
            }
        }
        System.out.println(sum);
    }
}
