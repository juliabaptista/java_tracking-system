package org.example.project.week10.c02_tracking_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HRSystem {
    private List<JobPosition> jobPositions;
    private List<Recruiter> recruiters;
    private List<Applicant> applicants;

    public HRSystem() {
        this.jobPositions = new ArrayList<>();
        this.recruiters = new ArrayList<>();
        this.applicants = new ArrayList<>();
    }

    public void addJobPosition(JobPosition jobPosition) {
        if (jobPosition != null && jobPosition.getOfferedSalaryRangeStart() <= jobPosition.getOfferedSalaryRangeEnd()) {
            jobPositions.add(jobPosition);
        }
    }

    public void addRecruiter(Recruiter recruiter) {
        if (recruiter != null) {
            recruiters.add(recruiter);
        }
    }

    public void addApplicant(Applicant applicant) {
        if (applicant != null) {
            applicants.add(applicant);
        }
    }

    public void generateReports() {
        // Report 1: Number of Applicants per Status
        Map<String, Integer> applicantsPerStatus = new HashMap<>();
        for (Applicant applicant : applicants) {
            String status = applicant.getStatus();
            applicantsPerStatus.put(status, applicantsPerStatus.getOrDefault(status, 0) + 1);
        }

        System.out.println("Report 1: Number of Applicants per Status");
        for (Map.Entry<String, Integer> entry : applicantsPerStatus.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Report 2: Number of Applicants per Job Position
        Map<String, Integer> applicantsPerJobPosition = new HashMap<>();
        for (JobPosition jobPosition : jobPositions) {
            applicantsPerJobPosition.put(jobPosition.getTitle(), 0);
        }

        for (Applicant applicant : applicants) {
            String status = applicant.getStatus();
            for (JobPosition jobPosition : jobPositions) {
                if (jobPosition.getTitle().equals(status)) {
                    applicantsPerJobPosition.put(jobPosition.getTitle(), applicantsPerJobPosition.get(jobPosition.getTitle()) + 1);
                }
            }
        }

        System.out.println("Report 2: Number of Applicants per Job Position");
        for (Map.Entry<String, Integer> entry : applicantsPerJobPosition.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Report 3: Number of Recruiters per Managed Job Position
        Map<String, Integer> recruitersPerJobPosition = new HashMap<>();
        for (Recruiter recruiter : recruiters) {
            List<JobPosition> managedPositions = recruiter.getJobPositionsManaged();
            for (JobPosition jobPosition : managedPositions) {
                recruitersPerJobPosition.put(jobPosition.getTitle(), recruitersPerJobPosition.getOrDefault(jobPosition.getTitle(), 0) + 1);
            }
        }

        System.out.println("Report 3: Number of Recruiters per Managed Job Position");
        for (Map.Entry<String, Integer> entry : recruitersPerJobPosition.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Report 4: Number of Applicants for a Specific Job Position
        String specificJobTitle = "Software Engineer"; // Change this to the job title you want to report
        int applicantsForSpecificJob = applicantsPerJobPosition.getOrDefault(specificJobTitle, 0);

        System.out.println("Report 4: Number of Applicants for " + specificJobTitle + ": " + applicantsForSpecificJob);

        // Add more reports as needed based on your project requirements.
    }
}
