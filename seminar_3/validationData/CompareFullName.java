package seminar_3.validationData;

public class CompareFullName {
    public boolean checkFullName(String[] fullName) {
        if (fullName[0] == "" || fullName[1] == "" || fullName[2] == "")
            throw new RuntimeException("Не указано полное имя.");
        for (String s : fullName) {
            char[] strToArray = s.toCharArray(); // Преобразуем строку phoneNumber в массив символов (char)
            for (int j = 0; j < strToArray.length; j++) {
                if (Character.isDigit(s.charAt(j)))
                    throw new RuntimeException("Неправильный формат вместо букв цифры ФИО.");
            }
        }
        return true;
    }
}