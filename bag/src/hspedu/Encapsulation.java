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
       //���ƹ��������ƣ���ʱ���ǿ��Խ�set����д�ڹ������У�������Ȼ������֤
       setName(name);
       setAge(age);
       setSalary(salary);
   }
   public void setName(String name){
       if(name.length()>=2&&name.length()<=6)
       this.name=name;
       else{
           System.out.println("��ʽ����ȷ");
           this.name="����";
       }
   }
   //��ݼ� setxxx��getxxx  art+insert
   //�Ҽ�->���� getter and setter
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
           System.out.println("���䲻��ȷ");
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
