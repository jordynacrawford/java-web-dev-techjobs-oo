package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;

    @Before
    public void createJobObjects() {
        job1 = new Job();
        job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
//        assertFalse(job1.getId() == job2.getId());
        assertEquals(job2.getId()-1, job1.getId(), 0);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().toString());
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals("Desert", testJob.getLocation().toString());
        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals("Quality control", testJob.getPositionType().toString());
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals("Persistence", testJob.getCoreCompetency().toString());
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job test1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test1.equals(test2));
    }

}
