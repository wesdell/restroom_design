/*
 * Single Responsibility ->  Un metodo es encargado de realizar una sola tarea, es decir,
 * realizar una unica operacion.
 * Los siguientes conceptos forman parte del disenio.
 * Cohesion -> Relacion entre elementos.
 * Acoplamiento -> Dependencia con otros elementos.
 * */

public class Main {
  public static void main(String[] args) {
    Building building = new Building();
    Person man1 = new Person(Genre.MAN, Disability.NO);
    Person man2 = new Person(Genre.MAN, Disability.NO);
    Person man3 = new Person(Genre.MAN, Disability.NO);
    Person man4 = new Person(Genre.MAN, Disability.NO);
    Person man5 = new Person(Genre.MAN, Disability.NO);
    Person woman = new Person(Genre.WOMAN, Disability.NO);
    man1.useRestroom(building);
    man2.useRestroom(building);
    man3.useRestroom(building);
    man4.useRestroom(building);
    man5.useRestroom(building);
    man3.leaveCleanRestroom();
    man5.useRestroom(building);
    woman.useRestroom(building);
    System.out.println(building.getRestroomsAvailable());
  }
}