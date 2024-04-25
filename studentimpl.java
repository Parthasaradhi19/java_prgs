public class studentimpl{
       public static void main(String[] p){
          student s = new student("james","12345");
          s.display();
}
}
class student{
       String nam,rn;
       student(String name,String rno){
             nam=name;
             rn=rno;
}
public void display(){
       System.out.printf("welcome %s rno is %s \n:",nam,rn);
}
}