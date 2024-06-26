import com.google.common.collect.ImmutableList;
import lombok.Builder;
import lombok.Singular;
public @Builder class BuilderWithDeprecated {
  public static @java.lang.SuppressWarnings("all") @lombok.Generated class BuilderWithDeprecatedBuilder {
    private @java.lang.SuppressWarnings("all") @lombok.Generated String dep1;
    private @java.lang.SuppressWarnings("all") @lombok.Generated int dep2;
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<String> strings;
    private @java.lang.SuppressWarnings("all") @lombok.Generated com.google.common.collect.ImmutableList.Builder<Integer> numbers;
    @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecatedBuilder() {
      super();
    }
    /**
     * @deprecated since always
     * @return {@code this}.
     */
    public @java.lang.Deprecated @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated.BuilderWithDeprecatedBuilder dep1(final String dep1) {
      this.dep1 = dep1;
      return this;
    }
    /**
     * @return {@code this}.
     */
    public @java.lang.Deprecated @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated.BuilderWithDeprecatedBuilder dep2(final int dep2) {
      this.dep2 = dep2;
      return this;
    }
    public @java.lang.Deprecated @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated.BuilderWithDeprecatedBuilder string(final String string) {
      if ((this.strings == null))
          this.strings = new java.util.ArrayList<String>();
      this.strings.add(string);
      return this;
    }
    public @java.lang.Deprecated @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated.BuilderWithDeprecatedBuilder strings(final java.util.Collection<? extends String> strings) {
      if ((strings == null))
          {
            throw new java.lang.NullPointerException("strings cannot be null");
          }
      if ((this.strings == null))
          this.strings = new java.util.ArrayList<String>();
      this.strings.addAll(strings);
      return this;
    }
    public @java.lang.Deprecated @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated.BuilderWithDeprecatedBuilder clearStrings() {
      if ((this.strings != null))
          this.strings.clear();
      return this;
    }
    public @java.lang.Deprecated @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated.BuilderWithDeprecatedBuilder number(final Integer number) {
      if ((this.numbers == null))
          this.numbers = com.google.common.collect.ImmutableList.builder();
      this.numbers.add(number);
      return this;
    }
    public @java.lang.Deprecated @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated.BuilderWithDeprecatedBuilder numbers(final java.lang.Iterable<? extends Integer> numbers) {
      if ((numbers == null))
          {
            throw new java.lang.NullPointerException("numbers cannot be null");
          }
      if ((this.numbers == null))
          this.numbers = com.google.common.collect.ImmutableList.builder();
      this.numbers.addAll(numbers);
      return this;
    }
    public @java.lang.Deprecated @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated.BuilderWithDeprecatedBuilder clearNumbers() {
      this.numbers = null;
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated build() {
      java.util.List<String> strings;
      switch (((this.strings == null) ? 0 : this.strings.size())) {
      case 0 :
          strings = java.util.Collections.emptyList();
          break;
      case 1 :
          strings = java.util.Collections.singletonList(this.strings.get(0));
          break;
      default :
          strings = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.strings));
      }
      com.google.common.collect.ImmutableList<Integer> numbers = ((this.numbers == null) ? com.google.common.collect.ImmutableList.<Integer>of() : this.numbers.build());
      return new BuilderWithDeprecated(this.dep1, this.dep2, strings, numbers);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return (((((((("BuilderWithDeprecated.BuilderWithDeprecatedBuilder(dep1=" + this.dep1) + ", dep2=") + this.dep2) + ", strings=") + this.strings) + ", numbers=") + this.numbers) + ")");
    }
  }
  String dep1;
  @Deprecated int dep2;
  @Singular @Deprecated java.util.List<String> strings;
  @Singular @Deprecated ImmutableList<Integer> numbers;
  @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated(final String dep1, final int dep2, final java.util.List<String> strings, final ImmutableList<Integer> numbers) {
    super();
    this.dep1 = dep1;
    this.dep2 = dep2;
    this.strings = strings;
    this.numbers = numbers;
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated BuilderWithDeprecated.BuilderWithDeprecatedBuilder builder() {
    return new BuilderWithDeprecated.BuilderWithDeprecatedBuilder();
  }
}
