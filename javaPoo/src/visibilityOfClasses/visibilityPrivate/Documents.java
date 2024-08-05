package visibilityOfClasses.visibilityPrivate;

public class Documents {

  // declare a private class
  private class CarDocumentation {
    // method private of class
    void documentCar() {
      System.out.println("Numero do RENAVAN: 134252-234");
    }
  }

  /*
   * default method of the public class, which creates an instance
   * of the private class and invokes its method
   */
  void callCarDocumentation() {
    CarDocumentation carDocumentation = new CarDocumentation();
    carDocumentation.documentCar();
  }

  /*
   * invokes the default method of the public class
   */
  public static void main(String[] args) {
    Documents documents = new Documents();
    documents.callCarDocumentation();
  }
}

