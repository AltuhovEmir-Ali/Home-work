public abstract class Company {
    private double offeredSalary;
    private int experience;
    private int Age;

    public Company(double offeredSalary, int experience, int age) {
        this.offeredSalary = offeredSalary;
        this.experience = experience;
        Age = age;

    }

    public double getOfferedSalary() {
        return offeredSalary;
    }

    public void setOfferedSalary(double offeredSalary) {
        this.offeredSalary = offeredSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public abstract void displayCompanyDetails();
}
