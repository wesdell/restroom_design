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
    Person man = new Person(Genre.MAN, Disability.NO);
    Person woman = new Person(Genre.WOMAN, Disability.NO);
    Person disabilityMan = new Person(Genre.MAN, Disability.NO);
    man.useRestroom(building);
    woman.useRestroom(building);
    disabilityMan.useRestroom(building);
    System.out.println(building.getRestroomsAvailable());
  }
}