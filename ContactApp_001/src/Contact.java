public class Contact {
    private String fullName;
    private String phoneNumber;

    public Contact(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        Languages language = ContactApp.getLanguage();
        return  language.getTextByLanguage(TextNames.CONTACT) + " : [ " +
                language.getTextByLanguage(TextNames.NAME) + " : '" + fullName + '\'' +
                ", " + language.getTextByLanguage(TextNames.PHONE) + " : '" + phoneNumber + '\'' +
                " ]";
    }
}
