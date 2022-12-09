package seminar_3.parseData;

import seminar_3.exceptions.ArrayException;

public class ParseData {

    private String data;
    private String[] dataArray;
    private final String[] fullName;
    private String birthday;
    private String phoneNumber;
    private String sex;

    /**
     * Разбирает строку на элементы.
     */
    public ParseData() {
        this.data = "";
        this.fullName = new String[3];
        this.birthday = "";
        this.phoneNumber = "";
        this.sex = "";
    }

    // @Override
    public String[] getFullName() {
        return this.fullName;
    }

    // @Override
    public String getBirthday() {
        return this.birthday;
    }

    // @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // @Override
    public String getSex() {
        return this.sex;
    }

    /**
     * Делаем формат строки для записи в файл.
     * 
     * @return - возвращает строку
     */
    // @Override
    public String[] getInfoToWrite() {
        String[] infoArray = new String[2];
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(this.fullName[0]).append(">").append("<").append(this.fullName[1]).append(">");
        sb.append("<").append(this.fullName[2]).append(">").append("<").append(this.birthday).append(">");
        sb.append("<").append(this.phoneNumber).append(">").append("<").append(this.sex).append(">");

        infoArray[0] = this.fullName[0];
        infoArray[1] = sb.toString();
        sb = new StringBuilder();
        return infoArray;
    }

    /**
     * Парсит строку и разлаживает ее по элементам
     * 
     * @param data - строка с консоли
     */
    // @Override
    public void disassemble(String data) {
        this.data = data;
        this.dataArray = this.data.split(" ");
        try {
            this.fullName[0] = this.dataArray[0];
            this.fullName[1] = this.dataArray[1];
            this.fullName[2] = this.dataArray[2];
            this.birthday = this.dataArray[3];
            this.phoneNumber = this.dataArray[4];
            this.sex = this.dataArray[5];
        } catch (RuntimeException e) {
            System.out.println("Неверное количество элементов во введенных данных!");
        }
    }

    /**
     * Геттер для массива с элементами распаршеной строки.
     * 
     * @return - возвращает массив с элементами после парсинга.
     */
    public String[] getDataArray() {
        if (dataArray == null)
            throw new ArrayException();
        return dataArray;
    }

}