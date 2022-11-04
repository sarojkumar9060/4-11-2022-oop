import java.text.Annotation;

public class Animal1{
  
  public void run(){
    System.out.println("i am runing");

  }
    public static void main(String[]args){
        System.out.println("1");
        Animal1 art=new Animal1();
        art.eat();
        art.run();
        Animal1 aa=new Animal1();
    aa.run();
    aa.eat();

    }
    public void eat(){
        System.out.println("i am eating");
    }
}