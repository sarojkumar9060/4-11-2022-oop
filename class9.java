public class CLASS9 {
    int i=10;

} 
class B extends CLASS9{
    int i=20;
    void show(int i){
        System.out.println(i);
    }
    public static void main(String []args){
        B ob=new B();
        ob.show(30);
    }
}

