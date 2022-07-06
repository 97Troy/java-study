package StudentPerformanceManagementSystem;


/*
001 001 90 02
张三 语文 90 期末考试
张三 英语 90 期末考试

 */
public class ScoreRecord {//成绩记录类
    private String srId;//成绩记录序号
    private String studentId;
    private String subjectId;
    private double score;
    private String no;//考试场次

    public ScoreRecord() {
    }

    public ScoreRecord(String srId, String studentId, String subjectId, double score, String no) {
        this.srId = srId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.score = score;
        this.no = no;
    }

    public String getSrId() {
        return srId;
    }

    public void setSrId(String srId) {
        this.srId = srId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
