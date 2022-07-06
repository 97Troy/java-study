package ManagementSystemDemo;

public class StudentDemo {
    private String sid;
    private String name;
    private double englishScore;
    private double mathScore;
    private double chineseScore;

    public StudentDemo() {
    }

    public StudentDemo(String sid, String name, double englishScore, double mathScore, double chineseScore) {
        this.sid = sid;
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(double chineseScore) {
        this.chineseScore = chineseScore;
    }
}
