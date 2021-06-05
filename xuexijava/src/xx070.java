public class xx070 {
    public static void main(String[] args) {
        getmax();
    }
    public static void getmax(){
        int a = 1;
        int b = 2;
        int c = 3;
        int max =a;
        if(a<b){
            max = b;
        }
        if(max<c){
            max = c;
        }
        System.out.println(max);
    }
}
