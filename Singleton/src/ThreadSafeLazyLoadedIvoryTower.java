public final class ThreadSafeLazyLoadedIvoryTower {

  private static volatile ThreadSafeLazyLoadedIvoryTower instance;

  private ThreadSafeLazyLoadedIvoryTower() {

	  if (instance != null) {
      throw new IllegalStateException("Already initialized.");
    }
  }


  public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
    if (instance == null) {
      synchronized (ThreadSafeLazyLoadedIvoryTower.class) {
        if (instance == null) {
          instance = new ThreadSafeLazyLoadedIvoryTower();
        }
      }
    }
    return instance;
  }
}