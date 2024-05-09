public class Main {
  public static void main(String[] args) {
    Building fisRestroomFloor5 = new Building();
    WomenRestroom womenRestroom = fisRestroomFloor5.getWomenRestroom();
    Toilet toilet = womenRestroom.chooseToilet(1);
    toilet.openDoor();
    toilet.openSeatCover();
    toilet.use(1);
    toilet.closeSeatCover();
    toilet.closeDoor();
    toilet.leave(1);
    Toilet toilet2 = womenRestroom.chooseToilet(1);
    toilet2.use(1);
  }
}