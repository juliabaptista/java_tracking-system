package org.example.project.week10.c02_tracking_system;

import java.util.List;
import java.util.Set;

public class Recruiter {
    private String name;
    private List<JobPosition> jobPositionsManaged;
    private Set<String> specializedIndustries;
    private Set<String> specializedRoles;

    public Recruiter(String name, List<JobPosition> jobPositionsManaged, Set<String> specializedIndustries, Set<String> specializedRoles) {
        this.name = name;
        this.jobPositionsManaged = jobPositionsManaged;
        this.specializedIndustries = specializedIndustries;
        this.specializedRoles = specializedRoles;
    }

    public void assignJobPosition(JobPosition jobPosition) {
        jobPositionsManaged.add(jobPosition);
    }

    public void reviewApplicant(Applicant applicant) {
        applicant.setStatus("Reviewed");
    }

    public boolean isSpecializedFor(JobPosition jobPosition) {
        return jobPositionsManaged.contains(jobPosition) && specializedIndustries.contains(jobPosition.getIndustry()) && specializedRoles.contains(jobPosition.getRole());
    }

    // Getters and Setters for class attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobPosition> getJobPositionsManaged() {
        return jobPositionsManaged;
    }

    public void setJobPositionsManaged(List<JobPosition> jobPositionsManaged) {
        this.jobPositionsManaged = jobPositionsManaged;
    }

    public Set<String> getSpecializedIndustries() {
        return specializedIndustries;
    }

    public void setSpecializedIndustries(Set<String> specializedIndustries) {
        this.specializedIndustries = specializedIndustries;
    }

    public Set<String> getSpecializedRoles() {
        return specializedRoles;
    }

    public void setSpecializedRoles(Set<String> specializedRoles) {
        this.specializedRoles = specializedRoles;
    }
}
