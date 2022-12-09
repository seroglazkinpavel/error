package seminar_3.validationData;

public class CompareDataProcessor {
    private CompareFullName checkFullName;
    private CompareBirthday checkBirthday;
    private CompareSex checkSex;
    private ComparePhoneNumber comparePhoneNumber;

    public CompareDataProcessor(CompareFullName checkFullName,
            CompareBirthday checkBirthday,
            CompareSex checkSex,
            ComparePhoneNumber comparePhoneNumber) {
        this.checkFullName = checkFullName;
        this.checkBirthday = checkBirthday;
        this.checkSex = checkSex;
        this.comparePhoneNumber = comparePhoneNumber;
    }

    public boolean checkBirthday(String birthday) {
        this.checkBirthday.checkElement(birthday);
        // System.out.println("Birthday format is OK.");
        return true;
    }

    public boolean checkPhoneNumber(String phoneNumber) {
        this.comparePhoneNumber.checkElement(phoneNumber);
        // System.out.println("PhoneNumber format is OK.");
        return true;
    }

    public boolean checkFullName(String[] fullName) {
        this.checkFullName.checkFullName(fullName);
        // System.out.println("Full name format is OK.");
        return true;
    }

    public boolean checkSex(String sex) {
        this.checkSex.checkElement(sex);
        // System.out.println("Sex format is OK.");
        return true;
    }
}