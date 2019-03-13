package com.talfinder.assessment;

import java.util.Arrays;
import java.util.Collection;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Created by hbhargav on 08/03/19.
 */

@RunWith(Parameterized.class)
public class CoinChangeTest {

  @Parameters
  public static Collection<Object[]> parameters() {
    return Arrays.asList(new Object[][] {
        {new int[]{1, 2, 5}, 11, 3},
        {new int[]{1, 5, 10}, 8, 4},
        {new int[]{1, 5, 10}, 10, 1},
        {new int[]{2}, 3, -1},
        {new int[]{5, 10}, 24, -1},
        {new int[]{5, 10}, 64, -1},
        {new int[]{}, 3, -1},
        {new int[]{}, -12, -1},
        {new int[]{}, -44, -1}
    });
  }

  private final int[] coins;
  private final int amount;
  private final int expectedNumCoins;

  public CoinChangeTest(int[] coins, int amount, int expectedNumCoins) {
    this.coins = coins;
    this.amount = amount;
    this.expectedNumCoins = expectedNumCoins;
  }

  @Test
  public void checkCoinChange() {
    Assert.assertEquals("input:Coins as " + Arrays.toString(coins) + " and Amount as "+ amount , expectedNumCoins, CoinChange.minCoins(coins, amount));
  }
}
