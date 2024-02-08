

    class Employee{
        int id;
        int salary;
        String name;
        public void printDetails(){
            System.out.println("My id is " + id);
            System.out.println("and my name is "+ name);
        }

        public int getSalary(){
            return salary;
        }
    }

    public class cwh_38_cuustom_class {
        public static void main(String[] args) {
            System.out.println("This is our custom class");
            Employee jayesh = new Employee(); // Instantiating a new Employee Object
            Employee john = new Employee(); // Instantiating a new Employee Object

            // Setting Attributes for Harry
            jayesh.id = 12;
            jayesh.salary = 34;
            jayesh.name = "CodeWithJayesh";

            // Setting Attributes for John
            john.id = 17;
            john.salary = 12;
            john.name = "John Khandelwal";

            // Printing the Attributes
            jayesh.printDetails();
            john.printDetails();
            int salary = john.getSalary();
            System.out.println(salary);
            // System.out.println(harry.id);
            // System.out.println(harry.name);
        }
    }


