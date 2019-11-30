public class Tasks8 {
   public int year;

    public void tasks8 () {
        if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
            System.out.println("Год является високосным");

        } else {
            System.out.println("Данный год не является високосным");
        }
    }
}
