//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Candidate candidate = new Candidate("Алиса", 5, 60000, 30);
        TechCompany techCompany = new TechCompany(70000, 3, 25);
        boolean isSuitable = techCompany.isCondidat(
                candidate.getExperience(),
                candidate.getAge(),
                candidate.getExpectedSalary());
        if (isSuitable) {
            System.out.println(candidate.getName() + " подходит для этой работы.");
        } else {
            System.out.println(candidate.getName() + " не подходит для этой работы.");
        }
        techCompany.displayCompanyDetails();
    }
}
