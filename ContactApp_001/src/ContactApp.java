import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactApp {
    private final static int DEFAULT_CAPACITY = 5;
    private static int size = 0;
    private static Contact[] contacts = new Contact[DEFAULT_CAPACITY];
    private static Contact[] contactsSorted = new Contact[DEFAULT_CAPACITY];
    private static boolean run = true;
    private static Languages language = Languages.ENGLISH;
    private final static String regex = "^[+]?([0-9]{1,4})?[ ]?[0-9]{1,3}[ ]?[0-9]{3}[ -]?[0-9]{2}[ -]?[0-9]{2}$|^[+]?([0-9]{1,4})?[ ]?[(][0-9]{1,3}[)][ ]?[0-9]{3}[ -]?[0-9]{2}[ -]?[0-9]{2}$|^[0-9]{2,7}$";
    private static int[] suitableIndex;
    public static void main(String[] args) {
        changeLanguage();
        while(run){

            if(size == contacts.length){
                contacts = Arrays.copyOf(contacts, DEFAULT_CAPACITY + size + 1);
            }

            String step = getInputAsString(language.getTextByLanguage(TextNames.MENU),"[0123456](\\.)?");

            switch (step){
                case "1", "1." -> addContact();
                case "2", "2." -> showContactList();
                case "3", "3." -> editContact();
                case "4", "4." -> deleteContact();
                case "5", "5." -> searchContact();
                case "6", "6." -> changeLanguage();
                case "0", "0." -> run = false;
            }

        }
        System.out.println(language.getTextByLanguage(TextNames.SUCCESS_EXIT));
    }

    private static void searchContact() {
        if (size == 0){
            System.out.println(language.getTextByLanguage(TextNames.NO_CONTACT));
            sleep350();
            return;
        }
        String answer = getInputAsString(language.getTextByLanguage(TextNames.ENTER_NAME_OR_PHONE_SE));
        if (answer.equalsIgnoreCase("back"))
            return;

        int[] index = new int[0];
        int ordinal = 1;
        for (int i = 0; i < size; i++) {
            if (equalsOrContains(answer, contacts[i])) {
                System.out.println(ordinal + " - " + contacts[i]);
                ordinal++;

                index = Arrays.copyOf(index, index.length + 1);
                index[index.length - 1] = i;
            }
        }

        if (index.length == 0) {
            System.out.println(language.getTextByLanguage(TextNames.NOT_FOUND));
        }
        sleep350();
    }

    private static void deleteContact() {
        if (size == 0){
            System.out.println(language.getTextByLanguage(TextNames.NO_CONTACT));
            sleep350();
            return;
        }

        String answer = getInputAsString(language.getTextByLanguage(TextNames.SHOW), "[12](\\.)?");
        switch (answer) {
            case "1", "1." -> deleteWithoutSearch();
            case "2", "2." -> deleteWithSearch();
            case "back" -> {}
        }

    }

    private static void deleteWithSearch() {
        String answer = getInputAsString(language.getTextByLanguage(TextNames.ENTER_NAME_OR_PHONE_DEL));
        if (answer.equalsIgnoreCase("back"))
            return;

        int[] index = new int[0];
        int ordinal = 1;
        for (int i = 0; i < size; i++) {
            if (equalsOrContains(answer, contacts[i])) {
                System.out.println(ordinal + " - " + contacts[i]);
                ordinal++;

                index = Arrays.copyOf(index, index.length + 1);
                index[index.length - 1] = i;
            }
        }

        if (index.length == 0) {
            System.out.println(language.getTextByLanguage(TextNames.NOT_FOUND));
            sleep350();
        } else {
            int ordinalNumber = 1;

            if (index.length != 1) {
                String ordinalString = getInputAsString(language.getTextByLanguage(TextNames.ENTER_ORDINAL), "[0-9]{1,1000}", 1, index.length);

                if (ordinalString.equals("back")) {
                    return;
                }

                ordinalNumber = Integer.parseInt(ordinalString);
            }
            switch (getInputAsString(language.getTextByLanguage(TextNames.CONFIRM_DELETE), "[1](\\.)?")) {
                case "1", "1." -> {
                    contacts[index[ordinalNumber - 1]] = null;

                    Contact[] helper = Arrays.copyOfRange(contacts, 0, size);
                    int i = 0;
                    for (Contact contact : helper) {
                        if(contact != null){
                            contacts[i] = contact;
                            i++;
                        }
                    }
                    size--;
                    System.out.println(language.getTextByLanguage(TextNames.SUCCESS_DELETE));
                    sleep350();
                }
                case "back" -> {}
            }
        }
    }

    private static void deleteWithoutSearch() {
        sortContactsByABC();
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + " - " + contactsSorted[i]);
        }

        String ordinal = getInputAsString(language.getTextByLanguage(TextNames.ENTER_ORDINAL), "[0-9]{1,1000}", 1, contacts.length);

        if(ordinal.equals("back")){
            return;
        }

        int ordinalNumber = Integer.parseInt(ordinal);

        switch (getInputAsString(language.getTextByLanguage(TextNames.CONFIRM_DELETE), "[1](\\.)?")) {
            case "1", "1." -> {
                contacts[suitableIndex[ordinalNumber - 1]] = null;

                Contact[] helper = Arrays.copyOfRange(contacts, 0, size);
                int i = 0;
                for (Contact contact : helper) {
                    if(contact != null){
                        contacts[i] = contact;
                        i++;
                    }
                }
                helper = null;

                size--;
                System.out.println(language.getTextByLanguage(TextNames.SUCCESS_DELETE));
                sleep350();
            }
            case "back" -> {}
        }
    }

    private static void sleep350() {
        try {
            Thread.sleep(350);
        } catch (InterruptedException e) {
            System.out.println();
        }
    }

    private static void editContact() {
        if (size == 0){
            System.out.println(language.getTextByLanguage(TextNames.NO_CONTACT));
            sleep350();
            return;
        }

        String answer = getInputAsString(language.getTextByLanguage(TextNames.SHOW), "[12](\\.)?");
        switch (answer) {
            case "1", "1." -> editWithoutSearch();
            case "2", "2." -> editWithSearch();
            case "back" -> {}
        }
    }

    private static void editWithSearch() {
        String answer = getInputAsString(language.getTextByLanguage(TextNames.ENTER_NAME_OR_PHONE));
        if (answer.equalsIgnoreCase("back"))
            return;

        int[] index = new int[0];
        int ordinal = 1;
        for (int i = 0; i < size; i++) {
            if (equalsOrContains(answer, contacts[i])) {
                System.out.println(ordinal + " - " + contacts[i]);
                ordinal++;

                index = Arrays.copyOf(index, index.length + 1);
                index[index.length - 1] = i;
            }
        }

        if (index.length == 0) {
            System.out.println(language.getTextByLanguage(TextNames.NOT_FOUND));
            sleep350();
        } else {
            int ordinalNumber = 1;
            if(index.length != 1) {
                String ordinalString = getInputAsString(language.getTextByLanguage(TextNames.ENTER_ORDINAL), "[0-9]{1,1000}", 1, index.length);

                if (ordinalString.equals("back")) {
                    return;
                }

                ordinalNumber = Integer.parseInt(ordinalString);
                System.out.println(contacts[index[ordinalNumber - 1]]);
            }

            switch (getInputAsString(language.getTextByLanguage(TextNames.RENAME_OR_EDIT), "[12](\\.)?")) {
                case "1", "1." -> {
                    String fullName = getInputAsString(language.getTextByLanguage(TextNames.FULL_NAME));

                    if (fullName.equalsIgnoreCase("back"))
                        return;

                    contacts[index[ordinalNumber - 1]].setFullName(fullName);
                    System.out.println(language.getTextByLanguage(TextNames.SUCCESS_RENAMED));
                    sleep350();
                }
                case "2", "2." -> {
                    String phoneNumber = getInputAsString(language.getTextByLanguage(TextNames.PHONE_NUMBER), regex);

                    if (phoneNumber.equalsIgnoreCase("back"))
                        return;

                    contacts[index[ordinalNumber - 1]].setPhoneNumber(phoneNumber);
                    System.out.println(language.getTextByLanguage(TextNames.SUCCESS_EDITED));
                    sleep350();
                }
                case "back" -> {}
            }
        }
    }

    private static void editWithoutSearch() {
        sortContactsByABC();
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + " - " + contactsSorted[i]);
        }

        String ordinal = getInputAsString(language.getTextByLanguage(TextNames.ENTER_ORDINAL), "[0-9]{1,1000}", 1, contacts.length);

        if(ordinal.equals("back")){
            return;
        }

        int ordinalNumber = Integer.parseInt(ordinal);

        switch (getInputAsString(language.getTextByLanguage(TextNames.RENAME_OR_EDIT), "[12](\\.)?")) {
            case "1", "1." -> {
                String fullName = getInputAsString(language.getTextByLanguage(TextNames.FULL_NAME));

                if (fullName.equalsIgnoreCase("back"))
                    return;

                contacts[suitableIndex[ordinalNumber - 1]].setFullName(fullName);
                System.out.println(language.getTextByLanguage(TextNames.SUCCESS_RENAMED));
                sleep350();
            }
            case "2", "2." -> {
                String phoneNumber = getInputAsString(language.getTextByLanguage(TextNames.PHONE_NUMBER), regex);

                if (phoneNumber.equalsIgnoreCase("back"))
                    return;

                contacts[suitableIndex[ordinalNumber - 1]].setPhoneNumber(phoneNumber);
                System.out.println(language.getTextByLanguage(TextNames.SUCCESS_EDITED));
                sleep350();
            }
            case "back" -> {}
        }
    }

    private static String getInputAsString(String ask, String regex, int min, int max) {
        while (true){
            String answer = getInputAsString(ask, regex);
            if(answer.equals("back"))
                return answer;

            int answerInt = Integer.parseInt(answer);
            if(min <= answerInt && answerInt <= max){
                return answer;
            }
        }
    }

    private static boolean equalsOrContains(String inputText, Contact contact){
        String latin = CyrillToLatin.cyrillToLatin(inputText).toLowerCase();
        String cyrill = LatinToCyrill.latinToCyrill(inputText).toLowerCase();

        boolean nameContains = contact.getFullName().toLowerCase().contains(latin) || contact.getFullName().toLowerCase().contains(cyrill);
        boolean numberContains = contact.getPhoneNumber().toLowerCase().contains(latin) || contact.getPhoneNumber().toLowerCase().contains(cyrill);

        return nameContains || numberContains;
    }

    private static void showContactList() {
        if (size == 0){
            System.out.println(language.getTextByLanguage(TextNames.NO_CONTACT));
            sleep350();
            return;
        }
        switch (getInputAsString(language.getTextByLanguage(TextNames.SHOW_MODE), "[123](\\.)?")){
            case "1", "1." -> {
                sortContactsByABC();
                for (int i = 0; i < size; i++) {
                    System.out.println(i + 1 + ". " + contactsSorted[i]);
                }
                sleep350();
            }
            case "2", "2." -> {
                for (int i = 0; i < size; i++) {
                    System.out.println(i + 1 + ". " + contacts[i]);
                }
                sleep350();
            }
            case "3", "3." -> {
                for (int i = size - 1; i >= 0; i--) {
                    System.out.println(i + 1 + ". " + contacts[i]);
                }
                sleep350();
            }
            case "back" -> {}
        }
    }

    private static void sortContactsByABC() {
        Contact[] fullContacts = Arrays.copyOfRange(contacts, 0, size);

        List<Contact> list = Arrays.asList(fullContacts);
        list.sort(new ContactComparator());
        contactsSorted = list.toArray(new Contact[list.size()]);

        suitableIndex = new int[contactsSorted.length];

        for (int i = 0; i < contactsSorted.length; i++) {
            for (int j = 0; j < contacts.length; j++) {
                if(contactsSorted[i] == contacts[j])
                    suitableIndex[i] = j;
            }
        }
    }

    private static void addContact() {
        String fullName = getInputAsString(language.getTextByLanguage(TextNames.FULL_NAME));

        if(fullName.equals("back"))
            return;

        label:
        {
            String phoneNumber = getInputAsString(language.getTextByLanguage(TextNames.PHONE_NUMBER), regex);

            if(phoneNumber.equals("back"))
                return;

            for (int i = 0; i < size; i++) {
                if(phoneNumber.equals(contacts[i].getPhoneNumber())) {
                    System.out.println(language.getTextByLanguage(TextNames.NOT_SUCCESS_ADD) + "\n" + contacts[i]);
                    sleep350();
                    break label;
                }
            }

            contacts[size] = new Contact(fullName, phoneNumber);
            size++;

            System.out.println(language.getTextByLanguage(TextNames.SUCCESS_ADDED));
            sleep350();
        }
    }

    private static String getInputAsString(String ask, String regex) {
        String phoneNumber;
        do {
            phoneNumber = getInputAsString(ask);
        }while(!phoneNumber.matches(regex) && !phoneNumber.equalsIgnoreCase("back"));

        if(phoneNumber.equalsIgnoreCase("back"))
            return "back";

        return phoneNumber;
    }

    private static void changeLanguage() {
        label:
        while (true){
            String ask = """
                    =-=-=-=-=-=-=-=-=-=
                    Change language: || Выберите язык: || Tilni tanlang:
                    1. English \\ Английский \\ Ingliz
                    2. Russian \\ Русский \\ Rus
                    3. Uzbek \\ Узбекский \\ O'zbek
                    ?:\s""";

            String input = getInputAsString(ask, "[123](\\.)?");
            switch (input) {
                case "1", "1." -> {
                    language = Languages.ENGLISH;
                    break label;
                }
                case "2", "2." -> {
                    language = Languages.RUSSIAN;
                    break label;
                }
                case "3", "3." -> {
                    language = Languages.UZBEK;
                    break label;
                }
                default -> {}
            }
        }
    }

    private static String getInputAsString(String ask) {
        System.out.println(ask);
        return new Scanner(System.in).nextLine().trim();
    }

    public static Languages getLanguage() {
        return language;
    }
}
