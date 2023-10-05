public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Donn", "driver", "johndonn@example.com", "+123456789", 20);
        Employee employee2 = new Employee("Jane Donn", "teacher", "janedonn@example.com", "+987654321", 25);

        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);

        package1.SameName sameName1 = new package1.SameName();
        sameName1.dosmth();

        package2.SameName sameName2 = new package2.SameName();
        sameName2.dosmth();

        Car myCar = new Car();
        myCar.start();
    }
}