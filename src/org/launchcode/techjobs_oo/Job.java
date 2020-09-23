package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String[] availableData = new String[5];
        String[] fields = new String[5];
        fields[0] = this.name;
        fields[1] = this.employer.toString();
        fields[2] = this.location.toString();
        fields[3] = this.positionType.toString();
        fields[4] = this.coreCompetency.toString();

        for (int i = 0; i < 5; i++) {
           if (fields[i].equals("")) {
               availableData[i] = "Data not available";
           } else {
               availableData[i] = fields[i];
           }
        }

        if (availableData.toString().equals("")) {
            return "OOPS! This job does not seem to exist.";
        } else {
            return "\nID: " + this.id +
                    "\nName: " + availableData[0] +
                    "\nEmployer: " + availableData[1] +
                    "\nLocation: " + availableData[2] +
                    "\nPosition Type: " + availableData[3] +
                    "\nCore Competency: " + availableData[4] + "\n";
        }
    }
}
