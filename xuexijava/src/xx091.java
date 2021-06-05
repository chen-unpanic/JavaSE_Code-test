public class xx091 {
    public static void main(String[] args) {
        //逢七过
        for(int i=1;i<101;i++){
            if(i%7==0| i%10==7 | i/10%10==7){ if(i%20==0)
            {System.out.println("过");} else {
                System.out.print("过"+" ");
            }
            }else {if(i%20==0)
            {System.out.println(i);} else {
                System.out.print(i+" ");
            }

            }
        }
    }
}
