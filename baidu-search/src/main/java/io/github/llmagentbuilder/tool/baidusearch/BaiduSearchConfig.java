package io.github.llmagentbuilder.tool.baidusearch;

public class BaiduSearchConfig {

  private int numberOfItems = 10;

  public int getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(int numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  @Override
  public String toString() {
    return "BaiduSearchConfig{" +
        "numberOfItems=" + numberOfItems +
        '}';
  }
}
