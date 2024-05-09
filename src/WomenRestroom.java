public class WomenRestroom {
  private Toilet[] toilets;

  public WomenRestroom() {
    this.toilets = new Toilet[4];
    for (Toilet toilet : toilets) {
      toilet = new Toilet();
    }
  }

//  public Toilet useFirstAvailableCleanToilet() {
//    for (Toilet toilet : toilets) {
//      if (toilet.isAvailableClean()) {
//        toilet.use();
//        return toilet;
//      }
//    }
//    return null;
//  }
}