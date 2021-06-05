public class xx107a {
    String name;
    String sex;
    private int age;
    public void setAge(int b){
        if(b<0 || b>120){
            System.out.println("年龄错误");} else{age = b;}
    }
    public int getAge(){
        return age;
    }
    public void xianShiMassage(){
        System.out.println(name+" "+age+" "+sex);
    }
}
