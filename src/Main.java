public class Main {
  public static void main(String[] args) {
    Building building = new Building();
    Person person = new Person(Genre.MAN, Disability.NO);
    person.useUrinal(building);
    System.out.println(building.getRestroomsAvailable());
  }
}