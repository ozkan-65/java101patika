
public class course {
     teacher Teacher;
    String name;
    String code;
    String prefix;
    int note;
    int noteS;

    course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        note=0;
        noteS=0;
    }

    void addTeacher(teacher Teacher){
        if(Teacher.branch.equals(this.prefix)) {
            this.Teacher = Teacher;
        }
        else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }

    void printTeacher(){
        this.Teacher.print();
}
}
