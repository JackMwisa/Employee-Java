public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Hana", 4);
        Employee employee2 = new Employee("Hana", 4);

        System.out.println(employee1.equals(employee2));

        System.out.println(employee1);
        System.out.println(employee2);

    }
}