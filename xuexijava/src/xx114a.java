public class xx114a {
    private String name;
    private String sex;
    private int age;

    public xx114a() {
    }

    public xx114a(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return  name;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name+" "+sex+" "+age);
    }
}
