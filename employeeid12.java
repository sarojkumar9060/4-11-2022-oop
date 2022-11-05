public class employeeid12 {
    int empid;
    String name;
    String company;
    employeeid12(int empid, String name, String company){
        this.empid=empid;
        this.name=name;
        this.company=company;
    }
    Void display(){
        System.out.println(empid+" "+name+" "+company);
    }
    public static void main(String[]args){
        employeeid12 el=new employeeid12(101,"amit","sambhu");
        el.display();
        employeeid12 e2=new employeeid12(1010,"saroj","ggi");
        el.display();
    }
}
