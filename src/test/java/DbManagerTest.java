import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eshen on 5/17/16.
 */
public class DbManagerTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetStudent() throws Exception {

        DbManager dbManager = new DbManager();
        String student = dbManager.getStudent();
        String expectedStudent =  "A-student-eric";
        assertTrue(student.equals(expectedStudent));


    }
}