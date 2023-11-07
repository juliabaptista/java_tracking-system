package org.example.project.week10.c02_tracking_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HRSystem hrSystem = new HRSystem();

        // Create and add applicants
        Applicant applicant1 = new Applicant(null, "Berlin", "Paris", 70000.0, "Pending");
        Applicant applicant2 = new Applicant(null, "Belo Horizonte", "Belo Horizonte", 80000.0, "Pending");
        hrSystem.addApplicant(applicant1);
        hrSystem.addApplicant(applicant2);

        // Create and add job positions
        JobPosition jobPosition1 = new JobPosition("Software Engineer", "Java Developer", 60000.0, 80000.0, List.of("Java"), "Berlin", "IT", "Developer");
        JobPosition jobPosition2 = new JobPosition("HR Manager", "HR Specialist", 60000.0, 80000.0, List.of("Recruiting"), "Milan", "HR", "Manager");
        hrSystem.addJobPosition(jobPosition1);
        hrSystem.addJobPosition(jobPosition2);

        // Create and add recruiters
        Recruiter recruiter1 = new Recruiter("John", new ArrayList<>(), Set.of("IT"), Set.of("Developer"));
        Recruiter recruiter2 = new Recruiter("Alice", new ArrayList<>(), Set.of("HR"), Set.of("Manager"));
        hrSystem.addRecruiter(recruiter1);
        hrSystem.addRecruiter(recruiter2);

        // Assign job positions to recruiters
        recruiter1.assignJobPosition(jobPosition1);
        recruiter2.assignJobPosition(jobPosition2);

        // Review applicants
        recruiter1.reviewApplicant(applicant1);
        recruiter2.reviewApplicant(applicant2);

        // Generate recruitment reports
        hrSystem.generateReports();
    }
}

