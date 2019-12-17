package org.meteogroup.pointcompression;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.DataProvider;

public abstract class BasePointTest {

  @DataProvider
  public Object[][] arrayOfPoints() {
    return new Object[][]{
        {new ArrayList<>(Arrays.asList(
            new Point(toInt(52.1161994934082f), toInt(13.787839889526367f)),
            new Point(toInt(39.94520950317383f), toInt(15.137619972229004f))
        )), "3qm5r35v82H6i39zsgxsK"},
        {new ArrayList<>(Arrays.asList(
            new Point(toInt(83.45456f), toInt(57.75121f)),
            new Point(toInt(12.77555f), toInt(91.15116f))
        )), "mylnjpy_stjByoss0uti4nT"}
    };
  }

  private static int toInt(float f) {
    return (int) Math.round(f * 1e6);
  }
}
