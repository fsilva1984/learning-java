package nanoProjects;

public class SmartTV {
  public static void main(String[] args) {
    // Mini project SmartTV

    // turn on tv
    System.out.println(turnOnTV());

    // increment sound
    System.out.println(incrementSound());
    System.out.println(incrementSound());


    // decrement sound
    System.out.println(decrementSound());


    // turn off tv
    System.out.println(turnOffTV());
  }

  // turn on tv
  static String turnOnTV() {
    return "TV on";
  }

  // increase sound
  static int increment = 0;
  static String incrementSound() {
    String notificationUpSound = String.format("Sound UP %d", ++increment);
    return notificationUpSound;
  }


  // decrease sound
  static String decrementSound() {
    String notificationUpSound = String.format("Sound Down %d", --increment);
    return notificationUpSound;
  }


  // turn off tv
  static String turnOffTV() {
    return "TV off";
  }
}
