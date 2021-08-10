import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args){
        boolean quit = false;
        startPhone();
        printAction();
        while(!quit){
            System.out.println("\n Enter actions: (6 to show available actions)");
            int actions = scanner.nextInt();
            scanner.nextLine();
            switch (actions){
                case 0:
                    System.out.println("\nShutting down...\n");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContacts(newContact)){
            System.out.println("New contact added: "+name+", phone "+phone );
        }else{
            System.out.println("Cannot add, "+name+" already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord =  mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newContactName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newContactName,newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record");
        }

    }
    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting record");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name:"+existingContactRecord.getName()+" phone number"
                + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }
    private static void printAction(){
        System.out.println("\n Available actions \n");
        System.out.println("0 - Shutdown");
        System.out.println("1 - Print contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Update any existing contact");
        System.out.println("4 - Remove an existing contact");
        System.out.println("5 - Check if the contact exists");
        System.out.println("6 -Print available actions");

        System.out.println("Choose your actions");
    }



}
