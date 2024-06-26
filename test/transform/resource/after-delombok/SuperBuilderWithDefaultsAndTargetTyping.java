import java.util.Arrays;
public class SuperBuilderWithDefaultsAndTargetTyping {
	public static class Parent {
		private String foo;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private static String $default$foo() {
			return doSth(Arrays.asList(1), Arrays.asList('a'));
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static abstract class ParentBuilder<C extends SuperBuilderWithDefaultsAndTargetTyping.Parent, B extends SuperBuilderWithDefaultsAndTargetTyping.Parent.ParentBuilder<C, B>> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private boolean foo$set;
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private String foo$value;
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B foo(final String foo) {
				this.foo$value = foo;
				foo$set = true;
				return self();
			}
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected abstract B self();
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public abstract C build();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public java.lang.String toString() {
				return "SuperBuilderWithDefaultsAndTargetTyping.Parent.ParentBuilder(foo$value=" + this.foo$value + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private static final class ParentBuilderImpl extends SuperBuilderWithDefaultsAndTargetTyping.Parent.ParentBuilder<SuperBuilderWithDefaultsAndTargetTyping.Parent, SuperBuilderWithDefaultsAndTargetTyping.Parent.ParentBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private ParentBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected SuperBuilderWithDefaultsAndTargetTyping.Parent.ParentBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public SuperBuilderWithDefaultsAndTargetTyping.Parent build() {
				return new SuperBuilderWithDefaultsAndTargetTyping.Parent(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		protected Parent(final SuperBuilderWithDefaultsAndTargetTyping.Parent.ParentBuilder<?, ?> b) {
			if (b.foo$set) this.foo = b.foo$value;
			 else this.foo = SuperBuilderWithDefaultsAndTargetTyping.Parent.$default$foo();
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static SuperBuilderWithDefaultsAndTargetTyping.Parent.ParentBuilder<?, ?> builder() {
			return new SuperBuilderWithDefaultsAndTargetTyping.Parent.ParentBuilderImpl();
		}
	}
	public static class Child extends Parent {
		private String foo;
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private static String $default$foo() {
			return doSth(Arrays.asList(1), Arrays.asList('a'));
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static abstract class ChildBuilder<C extends SuperBuilderWithDefaultsAndTargetTyping.Child, B extends SuperBuilderWithDefaultsAndTargetTyping.Child.ChildBuilder<C, B>> extends Parent.ParentBuilder<C, B> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private boolean foo$set;
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private String foo$value;
			/**
			 * @return {@code this}.
			 */
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public B foo(final String foo) {
				this.foo$value = foo;
				foo$set = true;
				return self();
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected abstract B self();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public abstract C build();
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public java.lang.String toString() {
				return "SuperBuilderWithDefaultsAndTargetTyping.Child.ChildBuilder(super=" + super.toString() + ", foo$value=" + this.foo$value + ")";
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		private static final class ChildBuilderImpl extends SuperBuilderWithDefaultsAndTargetTyping.Child.ChildBuilder<SuperBuilderWithDefaultsAndTargetTyping.Child, SuperBuilderWithDefaultsAndTargetTyping.Child.ChildBuilderImpl> {
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			private ChildBuilderImpl() {
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			protected SuperBuilderWithDefaultsAndTargetTyping.Child.ChildBuilderImpl self() {
				return this;
			}
			@java.lang.Override
			@java.lang.SuppressWarnings("all")
			@lombok.Generated
			public SuperBuilderWithDefaultsAndTargetTyping.Child build() {
				return new SuperBuilderWithDefaultsAndTargetTyping.Child(this);
			}
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		protected Child(final SuperBuilderWithDefaultsAndTargetTyping.Child.ChildBuilder<?, ?> b) {
			super(b);
			if (b.foo$set) this.foo = b.foo$value;
			 else this.foo = SuperBuilderWithDefaultsAndTargetTyping.Child.$default$foo();
		}
		@java.lang.SuppressWarnings("all")
		@lombok.Generated
		public static SuperBuilderWithDefaultsAndTargetTyping.Child.ChildBuilder<?, ?> builder() {
			return new SuperBuilderWithDefaultsAndTargetTyping.Child.ChildBuilderImpl();
		}
	}
	static String doSth(java.util.List<Integer> i, java.util.List<Character> c) {
		return null;
	}
}
