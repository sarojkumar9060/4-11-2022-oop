import javax.swing.plaf.ColorUIResource;

public class couterDemo13 {
   static int count=0;
    couterDemo13(){
        count++;
        System.out.println(count);
    }
    public static void main(String[]args){
        couterDemo13 c1=new couterDemo13();
        couterDemo13 c2=new couterDemo13();
        couterDemo13 c3=new couterDemo13();
    }
}
 