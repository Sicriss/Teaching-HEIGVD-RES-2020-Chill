package ch.heigvd.res.chill.domain.tiffanybonzon;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Vagabonde implements IProduct {

  public final static String NAME = "La Vagabonde";
  public final static BigDecimal PRICE = new BigDecimal(3.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}