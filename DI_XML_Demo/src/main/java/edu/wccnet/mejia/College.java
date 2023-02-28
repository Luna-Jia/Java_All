package edu.wccnet.mejia;

public class College {

    private String collegeName;
    private int yearBuilt;
    private String zipCode;
    private int enrollment;

    public College(String collegeName, int yearBuilt) {
        this.collegeName = collegeName;
        this.yearBuilt = yearBuilt;
    }

    public College() {
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeName='" + collegeName + '\'' +
                ", yearBuilt=" + yearBuilt +
                ", zipCode='" + zipCode + '\'' +
                ", enrollment=" + enrollment +
                '}';
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }
}
