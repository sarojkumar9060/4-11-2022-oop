
public class Supedieskkey {
int i=10;

}
class B extends Supedieskkey
{
    int i=20;
    void show(int i){
        System.out.println(this.i);

    }
    public static void main(String[]args){
        B ob=new B();
        ob.show(30);
    }
}