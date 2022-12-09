package seminar_3.validationData;

public class ComparePhoneNumber {
    public boolean checkElement(String phoneNumber) {
        char[] strToArray = phoneNumber.toCharArray(); // Преобразуем строку phoneNumber в массив символов (char)

        if (phoneNumber == "")
            throw new RuntimeException("Не указан телефон.");
        for (int i = 0; i < strToArray.length; i++) {
            if (!(Character.isDigit(Integer.valueOf(strToArray[i])) && strToArray.length == 11))
                throw new RuntimeException("Неправильный формат для телефона.");
        }
        return true;
    }
}
