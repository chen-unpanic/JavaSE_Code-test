package 会员管理系统;

class Vip {  //类名
    private String name;
    private String callnumber;
    private int vipnumber;
    private String address;

    public Vip() {  //方法名必须与类名相同
        this.name = name;
        this.callnumber = callnumber;
        this.vipnumber = vipnumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCallnumber() {
        return callnumber;
    }

    public void setCallnumber(String callnumber) {
        this.callnumber = callnumber;
    }

    public int getVipnumber() {
        return vipnumber;
    }

    public void setVipnumber(int vipnumber) {
        this.vipnumber = vipnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
