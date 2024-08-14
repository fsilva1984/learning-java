package getterAndSetter;

public class Student {

  // all variables
  private String name;
  private int age;
  private long nss;
  private String addrs;
  private String status = "Ativo";
  private String sex;

  // all methods getters
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public long getNss() {
    return nss;
  }
  public String getaddrs() {
    return addrs;
  }
  public String getStatus() {
    return status;
  }
  public String getSex() {
    return sex;
  }

  // all method settrs
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setNss(long nss) {
    this.nss = nss;
  }
  public void setaddrs(String addrs) {
    this.addrs = addrs;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public void setSex(String sex) {
    this.sex = sex;
  }


}
