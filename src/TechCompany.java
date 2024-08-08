public class TechCompany extends Company implements Condidat {
    @Override
    public boolean isCondidat(int experience, int age, double expectedSalary) {
        return experience >= experience && age >= age && expectedSalary <= expectedSalary;
    }

    @Override
    public void displayCompanyDetails() {
        System.out.println("Это технологическая компания. ");
    }

    public TechCompany(double offeredSalary, int experience, int age) {
        super(offeredSalary, experience, age);

    }
}
