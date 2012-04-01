// Generated by the protocol buffer compiler.  DO NOT EDIT!

package protobuf_unittest;

public  final class Wheel extends
    com.google.protobuf.GeneratedMessage
    implements WheelOrBuilder {
  // Use Wheel.newBuilder() to construct.
  private Wheel(Builder builder) {
    super(builder);
  }
  private Wheel(boolean noInit) {}
  
  private static final Wheel defaultInstance;
  public static Wheel getDefaultInstance() {
    return defaultInstance;
  }
  
  public Wheel getDefaultInstanceForType() {
    return defaultInstance;
  }
  
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Wheel_descriptor;
  }
  
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Wheel_fieldAccessorTable;
  }
  
  private int bitField0_;
  // optional int32 radius = 1;
  public static final int RADIUS_FIELD_NUMBER = 1;
  private int radius_;
  public boolean hasRadius() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  public int getRadius() {
    return radius_;
  }
  
  // optional int32 width = 2;
  public static final int WIDTH_FIELD_NUMBER = 2;
  private int width_;
  public boolean hasWidth() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  public int getWidth() {
    return width_;
  }
  
  private void initFields() {
    radius_ = 0;
    width_ = 0;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized != -1) return isInitialized == 1;
    
    memoizedIsInitialized = 1;
    return true;
  }
  
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, radius_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, width_);
    }
    getUnknownFields().writeTo(output);
  }
  
  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;
  
    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, radius_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, width_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }
  
  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }
  
  public static protobuf_unittest.Wheel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static protobuf_unittest.Wheel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.Wheel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static protobuf_unittest.Wheel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.Wheel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static protobuf_unittest.Wheel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.Wheel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    Builder builder = newBuilder();
    if (builder.mergeDelimitedFrom(input)) {
      return builder.buildParsed();
    } else {
      return null;
    }
  }
  public static protobuf_unittest.Wheel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    Builder builder = newBuilder();
    if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
      return builder.buildParsed();
    } else {
      return null;
    }
  }
  public static protobuf_unittest.Wheel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static protobuf_unittest.Wheel parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  
  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(protobuf_unittest.Wheel prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }
  
  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder>
     implements protobuf_unittest.WheelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Wheel_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Wheel_fieldAccessorTable;
    }
    
    // Construct using protobuf_unittest.Wheel.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }
    
    private Builder(BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    private static Builder create() {
      return new Builder();
    }
    
    public Builder clear() {
      super.clear();
      radius_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      width_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    
    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }
    
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protobuf_unittest.Wheel.getDescriptor();
    }
    
    public protobuf_unittest.Wheel getDefaultInstanceForType() {
      return protobuf_unittest.Wheel.getDefaultInstance();
    }
    
    public protobuf_unittest.Wheel build() {
      protobuf_unittest.Wheel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }
    
    private protobuf_unittest.Wheel buildParsed()
        throws com.google.protobuf.InvalidProtocolBufferException {
      protobuf_unittest.Wheel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(
          result).asInvalidProtocolBufferException();
      }
      return result;
    }
    
    public protobuf_unittest.Wheel buildPartial() {
      protobuf_unittest.Wheel result = new protobuf_unittest.Wheel(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.radius_ = radius_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.width_ = width_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }
    
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protobuf_unittest.Wheel) {
        return mergeFrom((protobuf_unittest.Wheel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }
    
    public Builder mergeFrom(protobuf_unittest.Wheel other) {
      if (other == protobuf_unittest.Wheel.getDefaultInstance()) return this;
      if (other.hasRadius()) {
        setRadius(other.getRadius());
      }
      if (other.hasWidth()) {
        setWidth(other.getWidth());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }
    
    public final boolean isInitialized() {
      return true;
    }
    
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder(
          this.getUnknownFields());
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            this.setUnknownFields(unknownFields.build());
            onChanged();
            return this;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            radius_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            width_ = input.readInt32();
            break;
          }
        }
      }
    }
    
    private int bitField0_;
    
    // optional int32 radius = 1;
    private int radius_ ;
    public boolean hasRadius() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getRadius() {
      return radius_;
    }
    public Builder setRadius(int value) {
      bitField0_ |= 0x00000001;
      radius_ = value;
      onChanged();
      return this;
    }
    public Builder clearRadius() {
      bitField0_ = (bitField0_ & ~0x00000001);
      radius_ = 0;
      onChanged();
      return this;
    }
    
    // optional int32 width = 2;
    private int width_ ;
    public boolean hasWidth() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getWidth() {
      return width_;
    }
    public Builder setWidth(int value) {
      bitField0_ |= 0x00000002;
      width_ = value;
      onChanged();
      return this;
    }
    public Builder clearWidth() {
      bitField0_ = (bitField0_ & ~0x00000002);
      width_ = 0;
      onChanged();
      return this;
    }
    
    // @@protoc_insertion_point(builder_scope:protobuf_unittest.Wheel)
  }
  
  static {
    defaultInstance = new Wheel(true);
    defaultInstance.initFields();
  }
  
  // @@protoc_insertion_point(class_scope:protobuf_unittest.Wheel)
}

