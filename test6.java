public class test6 {
    void show(){
        System.out.println("1");

    }
}
class xyz extends test6{
    void show(){
        System.out.println("2");
    }
    public static void main(String[]args){
        test6 t=new test6();
        t.show();
        xyz ob=new xyz();
        ob.show();  
    }
}
