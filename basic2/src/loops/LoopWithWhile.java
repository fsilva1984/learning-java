package loops;

import java.util.concurrent.ThreadLocalRandom;

public class LoopWithWhile {
  public static void main(String[] args) {
    int accumulator = 0;
    int money = 5;
    while (money > 0) {
      int number = randomNumbers();
      accumulator += number;
      System.out.println(number+" "+money);
      money--;
    }

    System.out.println(accumulator);

  }
  /*
   * int productPrice = randomNumbers();
   * int remainingMoney = money - productPrice;
   * System.out.println(productPrice+" "+remainingMoney);
   * if (remainingMoney <= 8) {
   * money = 0;
   * }
   * 
   */

  static int randomNumbers() {
    return ThreadLocalRandom.current().nextInt(2, 18);
  }
}
