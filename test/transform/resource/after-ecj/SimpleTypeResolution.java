class SimpleTypeResolutionFail {
  private @Getter int x;
  SimpleTypeResolutionFail() {
    super();
  }
}
class SimpleTypeResolutionSuccess {
  private @lombok.Getter int x;
  SimpleTypeResolutionSuccess() {
    super();
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated int getX() {
    return this.x;
  }
}
