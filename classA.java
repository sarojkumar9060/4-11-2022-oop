public class classA {
   void showA(){
        System.out.println("a class method");
    
    }
}
class B extends classA{
    void showB(){
        System.out.println("b class method");
    }
    public static void main (String[]args){
        classA obl=new classA();
        obl.showA();
        B ob2=new B();
        ob2.showA();
        ob2.showB();
        // obl.showB();
    }
}