public class Employee {

   public String fullName;
   public int age;
   public String position;
   public String email;
   public String mobileNumber;
   public double salary;
   public static final int AGE_LIMIT = 40;


    public Employee(String fullName, int age, String position, String email, String mobileNumber, double salary) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Возраст: " + age);
        System.out.println("Занимаемая должность: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + mobileNumber);
        System.out.println("Заработная плата: " + salary + "$");
    }

    public static void main(String[] args) {
        Employee[] ArrayEmp = new Employee[5];
        ArrayEmp[0] = new Employee("Попов В.П", 25, "менеджер", "popov@yandex.ru", "+79256555555", 700);
        ArrayEmp[1] = new Employee("Медведев В.А.", 45, "менеджер", "popov@yandex.ru", "+79256555555", 700);
        ArrayEmp[2] = new Employee("Попов В.П", 25, "менелжер", "popov@yandex.ru", "+79256555555", 700);
        ArrayEmp[3] = new Employee("Попов В.П", 50, "менелжер", "popov@yandex.ru", "+79256555555", 700);
        ArrayEmp[4] = new Employee("Попов В.П", 25, "менелжер", "popov@yandex.ru", "+79256555555", 700);

        for (int i = 0; i < ArrayEmp.length; i++) {
            System.out.println("\n\t@@@@ \nСотрудник №" + (i + 1));
            if (ArrayEmp[i].age >= AGE_LIMIT) {
                ArrayEmp[i].printInfo();

            } else {
                System.out.println("Возраст менее " + AGE_LIMIT + " лет");
            }
        }
    }

}
