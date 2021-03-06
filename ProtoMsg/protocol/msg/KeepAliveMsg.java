// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KeepAliveMsg.proto

package protocol.msg;

public final class KeepAliveMsg {
  private KeepAliveMsg() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KeepAliveReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.KeepAliveReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 time = 1;</code>
     */
    int getTime();
  }
  /**
   * Protobuf type {@code protocol.KeepAliveReq}
   */
  public  static final class KeepAliveReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.KeepAliveReq)
      KeepAliveReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KeepAliveReq.newBuilder() to construct.
    private KeepAliveReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KeepAliveReq() {
      time_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KeepAliveReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 13: {

              time_ = input.readFixed32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.msg.KeepAliveMsg.KeepAliveReq.class, protocol.msg.KeepAliveMsg.KeepAliveReq.Builder.class);
    }

    public static final int TIME_FIELD_NUMBER = 1;
    private int time_;
    /**
     * <code>fixed32 time = 1;</code>
     */
    public int getTime() {
      return time_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (time_ != 0) {
        output.writeFixed32(1, time_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (time_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, time_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof protocol.msg.KeepAliveMsg.KeepAliveReq)) {
        return super.equals(obj);
      }
      protocol.msg.KeepAliveMsg.KeepAliveReq other = (protocol.msg.KeepAliveMsg.KeepAliveReq) obj;

      boolean result = true;
      result = result && (getTime()
          == other.getTime());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protocol.msg.KeepAliveMsg.KeepAliveReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.KeepAliveReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.KeepAliveReq)
        protocol.msg.KeepAliveMsg.KeepAliveReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveReq_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protocol.msg.KeepAliveMsg.KeepAliveReq.class, protocol.msg.KeepAliveMsg.KeepAliveReq.Builder.class);
      }

      // Construct using protocol.msg.KeepAliveMsg.KeepAliveReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        time_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveReq_descriptor;
      }

      public protocol.msg.KeepAliveMsg.KeepAliveReq getDefaultInstanceForType() {
        return protocol.msg.KeepAliveMsg.KeepAliveReq.getDefaultInstance();
      }

      public protocol.msg.KeepAliveMsg.KeepAliveReq build() {
        protocol.msg.KeepAliveMsg.KeepAliveReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protocol.msg.KeepAliveMsg.KeepAliveReq buildPartial() {
        protocol.msg.KeepAliveMsg.KeepAliveReq result = new protocol.msg.KeepAliveMsg.KeepAliveReq(this);
        result.time_ = time_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protocol.msg.KeepAliveMsg.KeepAliveReq) {
          return mergeFrom((protocol.msg.KeepAliveMsg.KeepAliveReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protocol.msg.KeepAliveMsg.KeepAliveReq other) {
        if (other == protocol.msg.KeepAliveMsg.KeepAliveReq.getDefaultInstance()) return this;
        if (other.getTime() != 0) {
          setTime(other.getTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protocol.msg.KeepAliveMsg.KeepAliveReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protocol.msg.KeepAliveMsg.KeepAliveReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int time_ ;
      /**
       * <code>fixed32 time = 1;</code>
       */
      public int getTime() {
        return time_;
      }
      /**
       * <code>fixed32 time = 1;</code>
       */
      public Builder setTime(int value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 time = 1;</code>
       */
      public Builder clearTime() {
        
        time_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.KeepAliveReq)
    }

    // @@protoc_insertion_point(class_scope:protocol.KeepAliveReq)
    private static final protocol.msg.KeepAliveMsg.KeepAliveReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protocol.msg.KeepAliveMsg.KeepAliveReq();
    }

    public static protocol.msg.KeepAliveMsg.KeepAliveReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KeepAliveReq>
        PARSER = new com.google.protobuf.AbstractParser<KeepAliveReq>() {
      public KeepAliveReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KeepAliveReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KeepAliveReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KeepAliveReq> getParserForType() {
      return PARSER;
    }

    public protocol.msg.KeepAliveMsg.KeepAliveReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface KeepAliveRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.KeepAliveRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>fixed32 ttl = 1;</code>
     */
    int getTtl();
  }
  /**
   * Protobuf type {@code protocol.KeepAliveRsp}
   */
  public  static final class KeepAliveRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.KeepAliveRsp)
      KeepAliveRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KeepAliveRsp.newBuilder() to construct.
    private KeepAliveRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KeepAliveRsp() {
      ttl_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KeepAliveRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 13: {

              ttl_ = input.readFixed32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveRsp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocol.msg.KeepAliveMsg.KeepAliveRsp.class, protocol.msg.KeepAliveMsg.KeepAliveRsp.Builder.class);
    }

    public static final int TTL_FIELD_NUMBER = 1;
    private int ttl_;
    /**
     * <code>fixed32 ttl = 1;</code>
     */
    public int getTtl() {
      return ttl_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (ttl_ != 0) {
        output.writeFixed32(1, ttl_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ttl_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(1, ttl_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof protocol.msg.KeepAliveMsg.KeepAliveRsp)) {
        return super.equals(obj);
      }
      protocol.msg.KeepAliveMsg.KeepAliveRsp other = (protocol.msg.KeepAliveMsg.KeepAliveRsp) obj;

      boolean result = true;
      result = result && (getTtl()
          == other.getTtl());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TTL_FIELD_NUMBER;
      hash = (53 * hash) + getTtl();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protocol.msg.KeepAliveMsg.KeepAliveRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protocol.msg.KeepAliveMsg.KeepAliveRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.KeepAliveRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.KeepAliveRsp)
        protocol.msg.KeepAliveMsg.KeepAliveRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveRsp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protocol.msg.KeepAliveMsg.KeepAliveRsp.class, protocol.msg.KeepAliveMsg.KeepAliveRsp.Builder.class);
      }

      // Construct using protocol.msg.KeepAliveMsg.KeepAliveRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        ttl_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protocol.msg.KeepAliveMsg.internal_static_protocol_KeepAliveRsp_descriptor;
      }

      public protocol.msg.KeepAliveMsg.KeepAliveRsp getDefaultInstanceForType() {
        return protocol.msg.KeepAliveMsg.KeepAliveRsp.getDefaultInstance();
      }

      public protocol.msg.KeepAliveMsg.KeepAliveRsp build() {
        protocol.msg.KeepAliveMsg.KeepAliveRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protocol.msg.KeepAliveMsg.KeepAliveRsp buildPartial() {
        protocol.msg.KeepAliveMsg.KeepAliveRsp result = new protocol.msg.KeepAliveMsg.KeepAliveRsp(this);
        result.ttl_ = ttl_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protocol.msg.KeepAliveMsg.KeepAliveRsp) {
          return mergeFrom((protocol.msg.KeepAliveMsg.KeepAliveRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protocol.msg.KeepAliveMsg.KeepAliveRsp other) {
        if (other == protocol.msg.KeepAliveMsg.KeepAliveRsp.getDefaultInstance()) return this;
        if (other.getTtl() != 0) {
          setTtl(other.getTtl());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protocol.msg.KeepAliveMsg.KeepAliveRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protocol.msg.KeepAliveMsg.KeepAliveRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int ttl_ ;
      /**
       * <code>fixed32 ttl = 1;</code>
       */
      public int getTtl() {
        return ttl_;
      }
      /**
       * <code>fixed32 ttl = 1;</code>
       */
      public Builder setTtl(int value) {
        
        ttl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 ttl = 1;</code>
       */
      public Builder clearTtl() {
        
        ttl_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.KeepAliveRsp)
    }

    // @@protoc_insertion_point(class_scope:protocol.KeepAliveRsp)
    private static final protocol.msg.KeepAliveMsg.KeepAliveRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protocol.msg.KeepAliveMsg.KeepAliveRsp();
    }

    public static protocol.msg.KeepAliveMsg.KeepAliveRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KeepAliveRsp>
        PARSER = new com.google.protobuf.AbstractParser<KeepAliveRsp>() {
      public KeepAliveRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KeepAliveRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KeepAliveRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KeepAliveRsp> getParserForType() {
      return PARSER;
    }

    public protocol.msg.KeepAliveMsg.KeepAliveRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_KeepAliveReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_KeepAliveReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_KeepAliveRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_KeepAliveRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022KeepAliveMsg.proto\022\010protocol\"\034\n\014KeepAl" +
      "iveReq\022\014\n\004time\030\001 \001(\007\"\033\n\014KeepAliveRsp\022\013\n\003" +
      "ttl\030\001 \001(\007B\035\n\014protocol.msg\252\002\014protocol.msg" +
      "b\006proto3"
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
    internal_static_protocol_KeepAliveReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_KeepAliveReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_KeepAliveReq_descriptor,
        new java.lang.String[] { "Time", });
    internal_static_protocol_KeepAliveRsp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protocol_KeepAliveRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_KeepAliveRsp_descriptor,
        new java.lang.String[] { "Ttl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
