public class thisdemo {
    
    int i;
    void setValue(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);

    }
    public static void main(String []args){
        thisdemo td=new thisdemo();
        td.setValue(100);
        td.show();
    }
}
