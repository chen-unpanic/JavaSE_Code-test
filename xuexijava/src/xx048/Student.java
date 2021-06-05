package xx048;

public class Student {
    private String name;
    private int age;
    private String carier;

    public Student() {
    }

    public Student(String name, int age, String carier) {
        this.name = name;
        this.age = age;
        this.carier = carier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCarier() {
        return carier;
    }

    public void setCarier(String carier) {
        this.carier = carier;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carier='" + carier + '\'' +
                '}';
    }
}
