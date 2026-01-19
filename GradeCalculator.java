package projecgrade;

public abstract class GradeCalculator {
    protected String courseCode;
    protected String studentId;

    public GradeCalculator(String courseCode, String studentId) {
        this.courseCode = courseCode;
        this.studentId = studentId;
    }

    
    public abstract String calculateGrade(double score);

   
    public abstract double calculateGPA(String grade);

   
    public abstract boolean isValidScore(double score);

   
    public String getCourseCode() {
        return courseCode;
    }

    public String getStudentId() {
        return studentId;
    }


}
