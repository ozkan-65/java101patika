
public class ogrenciBilgiSistemi {
     public static void main(String[] args){
        teacher t1=new teacher("Sedat Kılıç","TRH","05536578901");
        teacher t2=new teacher("Ahmet Korkmaz","FZK","05547654321");
        teacher t3=new teacher("Veysel Güzel","KMYA","05434569875");

        course tarih=new course("TARİH","101","TRH");
        tarih.addTeacher(t1);
        course fizik=new course("FİZİK","102","FZK");
        fizik.addTeacher(t2);
        course kimya=new course("KİMYA","202","KMYA");
        kimya.addTeacher(t3);

        student s1=new student("Emre Bilir","23547","4",tarih,fizik,kimya);
        s1.addBulkExamNote(100,73,56,56,31,89);
        s1.isPass();

        student s2=new student("Ömer Atiç","35631","3",tarih,fizik,kimya);
        s1.addBulkExamNote(56,79,21,67,75,13);
        s2.isPass();
    }
}
