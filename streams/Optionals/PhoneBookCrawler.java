package optionals;

public class PhoneBookCrawler {

    private PhoneBook2 phoneBook;

    public PhoneBookCrawler(PhoneBook2 phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name)
            .orElseThrow(() -> new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name)
            .orElse(phoneBook.toString());
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        // return phoneBook.findPhoneNumberByName(name)
        //     .orElseGet(() -> phoneBook.findNameByPhoneNumber(phoneNumber).orElse(phoneBook.getPhoneBookEntries().get("Jos de Vos")));

        return Stream.of(phoneBook.findPhoneNumberByName(name),
                         phoneBook.findNameByPhoneNumber(phoneNumber),
                         phoneBook.findPhoneNumberByName("Jos de Vos"))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst().get();
    }

    public PhoneBook2 getPhoneBook(){
        return phoneBook;
    }

}
