package bbbbbbb.九九乘法表;

public class JiuJiuChengFaBiao {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j & i == 1  ) {
                    System.out.println(j + "X" + i + "=" + i * j);
                }   else if (i!= j & j==1 ){
                    System.out.print(j + "X" + i + "=" + i * j);
                    System.out.print(" ");
                } else if( j==i) {
                    System.out.print("  ");
                    System.out.println(j + "X" + i + "=" + i * j);
                } else if(j==2 & (i== 2 |i==3|i==4)) {
                    System.out.print("  ");
                    System.out.print(j + "X" + i + "=" + i * j);
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                    System.out.print(j + "X" + i + "=" + i * j);
                }
            }
        }
    }
}

