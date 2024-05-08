package io.github.llmagentbuilder.tool.extractwebpagecontent;

public class ExtractWebPageContentConfig {

  private int sizeLimit = 1000;

  public int getSizeLimit() {
    return sizeLimit;
  }

  public void setSizeLimit(int sizeLimit) {
    this.sizeLimit = sizeLimit;
  }

  @Override
  public String toString() {
    return "ExtractWebPageContentConfig{" +
        "sizeLimit=" + sizeLimit +
        '}';
  }
}
