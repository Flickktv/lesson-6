public class dop {
    public static void main(String[] args) {

        //5

        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        String middleName = fullName.substring(fullName.lastIndexOf(' ') + 1);
        String lastName = fullName.substring(0, fullName.indexOf(' '));
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
        System.out.println();

        //6

        fullName = "ivanov ivan ivanovich";
        lastName = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, fullName.indexOf(' ')).toLowerCase();
        firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.indexOf(' ') + 2).toUpperCase() + fullName.substring(fullName.indexOf(' ') + 2, fullName.lastIndexOf(' ')).toLowerCase();
        middleName = fullName.substring(fullName.lastIndexOf(' ') + 1, fullName.lastIndexOf(' ') + 2).toUpperCase() + fullName.substring(fullName.lastIndexOf(' ') + 2).toLowerCase();
        System.out.println("Верное написание Ф.И.О. сорудника с заглавных букв - " + lastName + " " + firstName + " " + middleName);

        //7

        String s1 = "135";
        String s2 = "246";
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            newS.append(charArray1[i]);
            newS.append(charArray2[i]);
        }
        System.out.println("Данные строки - " + newS);

        //8

        String letters = "aabccddefgghiijjkk";
        String doubles = "";
        boolean flag = true;
        char let = ' ';
        for (int i = 0; i < letters.length() - 1; i++) {
            if (let != letters.charAt(i)) {
                flag = true;                                        // проверка на многократное повторение символа
            }
            if (letters.charAt(i) == letters.charAt(i + 1) && flag){
                doubles = doubles + letters.charAt(i);
                flag = false;
                let = letters.charAt(i);
            }
        }
        System.out.println(doubles);

    }
}
