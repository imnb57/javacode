 class Details{
    int id;
    String name;
    double marks;

    Details(int id,String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public void grade(){
        if(this.marks>80){
            System.out.println("A");
        }
        else if(this.marks>60 && this.marks<79){
            System.out.println("B");
        }
        else if(this.marks>40 && this.marks<59){
            System.out.println("C");
        }
        else if(this.marks<40){
            System.out.println("F");
        }

    }
}
public class Student{
    public static void main(String[] args) {
        Details student1 = new Details(1, "Manoj", 100);
        Details student2 = new Details(2, "Nitesh",56);
        student1.grade();
        student2.grade();
    }
}
