import java.util.Comparator;

public class ContactComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact person1, Contact person2) {
        return person1.getFullName().compareTo(person2.getFullName());
    }
}
