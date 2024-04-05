package DesignPattern;



public class SingletonPatternDemo {
    private static SingletonPatternDemo instance;
    private int id;
    private String name;

    private int salary;
    private SingletonPatternDemo(){
        System.out.println("hai");
    }
    public static SingletonPatternDemo getInstance(){
        if(instance==null){
            instance=new SingletonPatternDemo();
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        SingletonPatternDemo s=SingletonPatternDemo.getInstance();
        s.setId(10);
        s.setName("jeeva");
        s.setSalary(20000);

        System.out.println("EmpID="+s.getId());
        System.out.println("EmpName="+s.getName());
        System.out.println("EmpSalary="+s.getSalary());
    }
}
