public class xx068 {
    public static void main(String[] args) {
        int[] shuzu={54,243,745,214,642,12,31};
        int max= shuzu[0];
        for(int i =1;i< shuzu.length;i++){
            if(max<shuzu[i]){
                max=shuzu[i];
            }
        }
        System.out.println(max);
    }
}
