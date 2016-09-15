package test;

import entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import manager.EntityHandler;

public class Tester {
    public static void main(String[] args) {
        
        //SchemaBuilder sb = new SchemaBuilder();
        //sb.initSchema();
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_jpqlDemo_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        EntityHandler eh = new EntityHandler(em);
        
        eh.createNewStudent("Patrick", "Johansen");
        
        Student student = eh.getStudentByFirstName("Patrick");
        student.addStudyPoint("Test", 5, 4);
    }
    
    
}
