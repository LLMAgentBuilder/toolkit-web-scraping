package io.github.llmagentbuilder.tool.baiduhotsearch;

public class BaiduHotSearchConfig {

  private int numberOfItems = 10;

  public int getNumberOfItems() {
    return numberOfItems;
  }

  public void setNumberOfItems(int numberOfItems) {
    this.numberOfItems = numberOfItems;
  }

  @Override
  public String toString() {
    return "BaiduHotSearchConfig{" +
        "numberOfItems=" + numberOfItems +
        '}';
  }
}
