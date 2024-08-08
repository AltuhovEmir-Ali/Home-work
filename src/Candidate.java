public class Candidate {
    private String name;
    private int experience;
    private int age;
    private double expectedSalary;

    public Candidate(String name, int experience, int age, double expectedSalary) {
        this.name = name;
        this.experience = experience;
        this.age = age;
        this.expectedSalary = expectedSalary;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

}