import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Goa");
        addInOrder(placesToVisit, "Andra Pradesh");
        addInOrder(placesToVisit, "Vizag");
        addInOrder(placesToVisit, "Kerela");
        addInOrder(placesToVisit, "Haydrabad");
        addInOrder(placesToVisit, "Diu");
        addInOrder(placesToVisit, "Malvan");
        addInOrder(placesToVisit, "Malvan");
        printList(placesToVisit);
        visit(placesToVisit);



    }
    private static void printList(LinkedList<String> placesToVisit){
        for (String s : placesToVisit) {
            System.out.println("Places to visit: " + s);
        }
        System.out.println("============================================");
    }

    private static boolean addInOrder(LinkedList<String> placeList, String newCity){
        ListIterator<String> stringListIterator = placeList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison==0){
                System.out.println(newCity + " is already included in the list");
                return false;
            }else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner  = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
        }else{
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacation over");
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting "+ listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    System.out.println("=========================");
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Actions available: \npress ");
        System.out.println("0 - to quit");
        System.out.println("1 - Current visiting city");
        System.out.println("2 - Previous city");
        System.out.println("3 - Menu");

    }



}
