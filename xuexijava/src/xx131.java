public class xx131 {
    public static void main(String[] args) {
        int[] shuzu = {1,23,456,789};
     getS(shuzu);
        System.out.println(getS(shuzu));
    }
    public static String getS(int[] arr){
        StringBuilder sb= new StringBuilder();
        sb.append("[");
        for(int i =0 ;i< arr.length;i++){
             if(i!=arr.length-1){
                 sb.append(arr[i]+",");
             } else {
                 sb.append(arr[i]);
             }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
