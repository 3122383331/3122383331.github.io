package hspedu;

public class Encapsulation {
    public static void main(String[] args) {
        person p=new person("jack",130,5000);
        //p.setName("jack");
        // p.setAge(1800);
        //p.setSalary(30000);
        p.info();
    }
}
class person{
   public String name;
   private int age;
   private double salary;
   public person(String name,int age,double salary){
       //this.name=name;
       //this.age=age;
       //this.salary=salary;
       //会绕过保护机制，这时我们可以将set方法写在构造器中，这样仍然可以验证
       setName(name);
       setAge(age);
       setSalary(salary);
   }
   public void setName(String name){
       if(name.length()>=2&&name.length()<=6)
       this.name=name;
       else{
           System.out.println("格式不正确");
           this.name="无名";
       }
   }
   //快捷键 setxxx和getxxx  art+insert
   //右键->生成 getter and setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if(age>=0&&age<=120)
        this.age = age;
       else {
           System.out.println("年龄不正确");
           this.age=18;
       }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void info(){
       System.out.println(name+age+salary);
    }
}
