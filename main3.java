class Aim <A,B>{
   A id;
   B name;

    public Aim(A id,B name) {
      this.id=id;
      this.name=name;
    }
    public void printl(){
        System.out.println(id + " " +name);
    }
   
}
public class main3{
  public static void main(String[] args) {
      Aim<Integer,String> a1= new Aim<>(15,"Hello");
      a1.printl();
}
}