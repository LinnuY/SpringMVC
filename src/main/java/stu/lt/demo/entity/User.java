package stu.lt.demo.entity;

/**
 * @Author LinuY
 * @Date 2020/7/16 9:00
 */
public class User {
    
    private Integer id;
    private String name;
    private String sex;
    private String mobileNumber;

    private int isUsing;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", isUsing=" + isUsing +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name, String sex, String mobileNumber, int isUsing) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.mobileNumber = mobileNumber;
        this.isUsing = isUsing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getIsUsing() {
        return isUsing;
    }

    public void setIsUsing(int isUsing) {
        this.isUsing = isUsing;
    }
}
