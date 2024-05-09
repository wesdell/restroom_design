public class Main {
  public static void main(String[] args) {
    Building fisRestroomFloor5 = new Building();
    WomenRestroom womenRestroom = fisRestroomFloor5.getWomenRestroom();
    Toilet toilet = womenRestroom.chooseToilet(1);
    toilet.use(1);
  }
}