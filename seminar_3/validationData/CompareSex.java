package seminar_3.validationData;

public class CompareSex {

    public boolean checkElement(String sex) {
        if (sex.equals(""))
            throw new RuntimeException("Не указан пол.");
        if (!(sex.contains("f") || sex.contains("m") && sex.length() == 1))
            throw new RuntimeException("Не правильно указан пол");
        return true;
    }
}