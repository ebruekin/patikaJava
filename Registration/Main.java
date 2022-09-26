package Registration;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ece", "TRHd", "555");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course matematik = new Course("Matematik", "102", "MTH");
        Course ingilizce = new Course("Ingilizce", "103", "ENG");

        
        Student s1 = new Student("ebru", "45", "4", tarih, matematik, ingilizce);

        s1.addCourseNote(100, 45, 76);
        s1.isPass();
        
        
        

        


        
    }
}
