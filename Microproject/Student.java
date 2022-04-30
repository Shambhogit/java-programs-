package com.Microproject;

public class Student {
    private int StudentId;
    private String StudentName;
    private String studentPhone;
    private String studentCity;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public Student(String studentName, String studentPhone, String studentCity) {
        super();
        StudentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(int studentId, String studentName, String studentPhone, String studentCity) {
        super();
        StudentId = studentId;
        StudentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", studentPhone=" + studentPhone
                + ", studentCity=" + studentCity + "]";
    }
}
