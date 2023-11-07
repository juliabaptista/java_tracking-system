package org.example.project.week10.c02_tracking_system;

import java.util.List;

public class Applicant {
    private List<String> previousCompanies;
    private String currentCity;
    private String preferredLocation;
    private double expectedSalary;
    private String status;

    public Applicant(List<String> previousCompanies, String currentCity, String preferredLocation, double expectedSalary, String status) {
        this.previousCompanies = previousCompanies;
        this.currentCity = currentCity;
        this.preferredLocation = preferredLocation;
        this.expectedSalary = expectedSalary;
        this.status = status;
    }

    public boolean isRelocationPreferred() {
        return !currentCity.equals(preferredLocation);
    }

    // Getters and Setters for class attributes
    public List<String> getPreviousCompanies() {
        return previousCompanies;
    }

    public void setPreviousCompanies(List<String> previousCompanies) {
        this.previousCompanies = previousCompanies;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getPreferredLocation() {
        return preferredLocation;
    }

    public void setPreferredLocation(String preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
