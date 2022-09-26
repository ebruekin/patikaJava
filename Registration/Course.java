package Registration;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code  =code;
        this.prefix = prefix;
       
        note = 0;
    }

    void addTeacher(Teacher teacher){       
        
        if(teacher.branch.equals(prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Ögretmen ve ders uyumsuz");
        }
       
    }

   
    
}
