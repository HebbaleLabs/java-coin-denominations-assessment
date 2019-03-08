package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hbhargav on 08/03/19.
 */
public class CoinChangeTest {

  @Test
  public void checkPositiveCase() {
    int[] coins = new int[]{1, 2, 5};
    int numCoins = CoinChange.minCoins(coins, 11);
    Assert.assertEquals(3, numCoins);

    coins = new int[]{1, 5, 10};
    numCoins = CoinChange.minCoins(coins, 8);
    Assert.assertEquals(4, numCoins);

    numCoins = CoinChange.minCoins(coins, 10);
    Assert.assertEquals(1, numCoins);
  }

  @Test
  public void checkNegativeCase() {
    int[] coins = new int[]{2};
    int numCoins = CoinChange.minCoins(coins, 3);
    Assert.assertEquals(-1, numCoins);

    coins = new int[]{5, 10};
    numCoins = CoinChange.minCoins(coins, 24);
    Assert.assertEquals(-1, numCoins);

    numCoins = CoinChange.minCoins(coins, 64);
    Assert.assertEquals(-1, numCoins);
  }

  @Test
  public void checkInvalidCase() {
    int[] coins = new int[]{};
    int numCoins = CoinChange.minCoins(coins, 3);
    Assert.assertEquals(-1, numCoins);

    coins = new int[]{};
    numCoins = CoinChange.minCoins(coins, -12);
    Assert.assertEquals(-1, numCoins);

    numCoins = CoinChange.minCoins(coins, -44);
    Assert.assertEquals(-1, numCoins);
  }
}
