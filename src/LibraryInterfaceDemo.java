public class LibraryInterfaceDemo {
    public static void main(String[] args) {


        KidUser [] kidUsers = {new KidUser(), new KidUser()};
        int [] age = {10, 18};
        String [] bookTypes = {"Kids", "Fiction"};
        for( int i = 0; i< 2; i++){
            KidUser k = kidUsers[i];
            k.setAge(age[i]);
            k.setBookType(bookTypes[i]);
            k.registerAccount();
            k.requestBook();
        }

        AdultUser [] adultUsers = {new AdultUser(), new AdultUser()};
        int [] ageArr = {5, 23};
        String [] aBookTypes = {"Kids", "Fiction"};
        for( int i = 0; i< 2; i++){
            AdultUser a = adultUsers[i];
            a.setAge(ageArr[i]);
            a.setBookType(aBookTypes[i]);
            a.registerAccount();
            a.requestBook();
        }
    }
}
