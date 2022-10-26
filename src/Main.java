public class Main {
    public static void main(String[] args) {

        //1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();

        //2

        String s = fullName.toUpperCase();
        System.out.println("ФИО сотрудника для заполнения отчета - " + s);
        System.out.println();

        //3

        s = fullName.replace(" ", "; ");
        System.out.println("Данный ФИО сотрудника для административного отдела " + s);
        System.out.println();

        //4

        fullName = "Иванов Семён Семёнович";
        s = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + s);
        System.out.println();


    }
}