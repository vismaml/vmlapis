// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ssn/type/tier.proto

package ssn.type;

public final class TierOuterClass {
  private TierOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ssn.type.Tier}
   */
  public enum Tier
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Use the default tier. Defaults to the STANDARD option or account default, if set.
     * </pre>
     *
     * <code>DEFAULT = 0;</code>
     */
    DEFAULT(0),
    /**
     * <code>STANDARD = 1;</code>
     */
    STANDARD(1),
    /**
     * <code>PREMIUM = 2;</code>
     */
    PREMIUM(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Use the default tier. Defaults to the STANDARD option or account default, if set.
     * </pre>
     *
     * <code>DEFAULT = 0;</code>
     */
    public static final int DEFAULT_VALUE = 0;
    /**
     * <code>STANDARD = 1;</code>
     */
    public static final int STANDARD_VALUE = 1;
    /**
     * <code>PREMIUM = 2;</code>
     */
    public static final int PREMIUM_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Tier valueOf(int value) {
      return forNumber(value);
    }

    public static Tier forNumber(int value) {
      switch (value) {
        case 0: return DEFAULT;
        case 1: return STANDARD;
        case 2: return PREMIUM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Tier>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Tier> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Tier>() {
            public Tier findValueByNumber(int number) {
              return Tier.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return ssn.type.TierOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final Tier[] VALUES = values();

    public static Tier valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Tier(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ssn.type.Tier)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ssn/type/tier.proto\022\010ssn.type*.\n\004Tier\022" +
      "\013\n\007DEFAULT\020\000\022\014\n\010STANDARD\020\001\022\013\n\007PREMIUM\020\002B" +
      "6Z4github.com/e-conomic/vmlapis/gen/go/s" +
      "sn/type;ssntypeb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
