public class Main {
    public static void main(String[] args) {

//  1 задание

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = ( firstName + " " + middleName + " " + lastName );

        System.out.println("ФИО сотрудника - " + fullName);

//  2 задание

        fullName = fullName.replace("v","V");
        fullName = fullName.replace("a","A");
        fullName = fullName.replace("n","N");
        fullName = fullName.replace("o","O");
        fullName = fullName.replace("i","I");
        fullName = fullName.replace("c","C");
        fullName = fullName.replace("h","H");

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

//  3 задание

        fullName = fullName.replace(" ",";");

        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);

//  4 задание

        fullName = "Иванов Семён Семёнович";

        fullName = fullName.replace("ё","е");

        System.out.println("Данные ФИО сотрудника — " + fullName);
        
    }
}