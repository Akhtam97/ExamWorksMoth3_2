import java.util.LinkedList;
import java.util.Scanner;

public class MainPerson extends Exception {
    public static void main(String[] args) {
        //Создаю Лист
        LinkedList<Person> people = new LinkedList<Person>();
        addPeople(people);
        for (Person p : people) {
            System.out.println(p);
        }
    }

    //Метод для добавления людей и тут же после добавления пропишу try catch

    public static LinkedList<Person> addPeople(LinkedList<Person> people) {
        LinkedList<Person> newlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Добавьте 2 людей ФИО");
        newlist.add(new Person(sc.nextLine(),sc.nextLine(), sc.nextLine()));
        System.out.println("Еще 1");
        newlist.add(new Person(sc.nextLine(),sc.nextLine(), sc.nextLine()));
        people.addAll(newlist);
        try {
          if (newlist.get(0).equals(newlist.get(1))) {
                    throw new RuntimeException();
                }else{
                    System.out.println("Все впорядке!");
                }
            }catch (RuntimeException ex){
            System.err.println("Добавлено 2 одинковых объекта!");
            }
        finally {
            System.out.println("Файнали для понтов добавил :D");
        }return newlist;
    }


}
