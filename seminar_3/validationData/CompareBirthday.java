package seminar_3.validationData;

public class CompareBirthday {

    public boolean checkElement(String birthday) {
        String[] dataArray = birthday.split("\\.");
        if (dataArray.length != 3 || dataArray[0].length() != 2 || dataArray[1].length() != 2
                || dataArray[2].length() != 4)
            throw new RuntimeException("Неправильный формат для даты рождения");

        if (birthday == "")
            throw new RuntimeException("Не указана дата рождения.");
        for (String s : dataArray) {
            char[] strToArray = s.toCharArray(); // Преобразуем строку phoneNumber в массив символов (char)
            for (int j = 0; j < strToArray.length; j++) {
                if (!(Character.isDigit(s.charAt(j))))
                    throw new RuntimeException("Введены не цифры для даты рождения.");
            }
        }
        return true;
    }
}