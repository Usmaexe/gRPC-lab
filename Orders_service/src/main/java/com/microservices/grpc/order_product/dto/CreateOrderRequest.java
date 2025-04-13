// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto.proto

// Protobuf Java Version: 3.25.6
package com.microservices.grpc.order_product.dto;

/**
 * <pre>
 * DTOs (Request/Response objects)
 * </pre>
 *
 * Protobuf type {@code order_product.CreateOrderRequest}
 */
public final class CreateOrderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:order_product.CreateOrderRequest)
    CreateOrderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateOrderRequest.newBuilder() to construct.
  private CreateOrderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateOrderRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateOrderRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.microservices.grpc.order_product.dto.Dto.internal_static_order_product_CreateOrderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservices.grpc.order_product.dto.Dto.internal_static_order_product_CreateOrderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservices.grpc.order_product.dto.CreateOrderRequest.class, com.microservices.grpc.order_product.dto.CreateOrderRequest.Builder.class);
  }

  public static final int PRODUCT_ID_FIELD_NUMBER = 1;
  private int productId_ = 0;
  /**
   * <code>int32 product_id = 1;</code>
   * @return The productId.
   */
  @java.lang.Override
  public int getProductId() {
    return productId_;
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private int quantity_ = 0;
  /**
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (productId_ != 0) {
      output.writeInt32(1, productId_);
    }
    if (quantity_ != 0) {
      output.writeInt32(2, quantity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (productId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, productId_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, quantity_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.microservices.grpc.order_product.dto.CreateOrderRequest)) {
      return super.equals(obj);
    }
    com.microservices.grpc.order_product.dto.CreateOrderRequest other = (com.microservices.grpc.order_product.dto.CreateOrderRequest) obj;

    if (getProductId()
        != other.getProductId()) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservices.grpc.order_product.dto.CreateOrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.microservices.grpc.order_product.dto.CreateOrderRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * DTOs (Request/Response objects)
   * </pre>
   *
   * Protobuf type {@code order_product.CreateOrderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:order_product.CreateOrderRequest)
      com.microservices.grpc.order_product.dto.CreateOrderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservices.grpc.order_product.dto.Dto.internal_static_order_product_CreateOrderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservices.grpc.order_product.dto.Dto.internal_static_order_product_CreateOrderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservices.grpc.order_product.dto.CreateOrderRequest.class, com.microservices.grpc.order_product.dto.CreateOrderRequest.Builder.class);
    }

    // Construct using com.microservices.grpc.order_product.dto.CreateOrderRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      productId_ = 0;
      quantity_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservices.grpc.order_product.dto.Dto.internal_static_order_product_CreateOrderRequest_descriptor;
    }

    @java.lang.Override
    public com.microservices.grpc.order_product.dto.CreateOrderRequest getDefaultInstanceForType() {
      return com.microservices.grpc.order_product.dto.CreateOrderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservices.grpc.order_product.dto.CreateOrderRequest build() {
      com.microservices.grpc.order_product.dto.CreateOrderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservices.grpc.order_product.dto.CreateOrderRequest buildPartial() {
      com.microservices.grpc.order_product.dto.CreateOrderRequest result = new com.microservices.grpc.order_product.dto.CreateOrderRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.microservices.grpc.order_product.dto.CreateOrderRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.productId_ = productId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.quantity_ = quantity_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.microservices.grpc.order_product.dto.CreateOrderRequest) {
        return mergeFrom((com.microservices.grpc.order_product.dto.CreateOrderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservices.grpc.order_product.dto.CreateOrderRequest other) {
      if (other == com.microservices.grpc.order_product.dto.CreateOrderRequest.getDefaultInstance()) return this;
      if (other.getProductId() != 0) {
        setProductId(other.getProductId());
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              productId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              quantity_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int productId_ ;
    /**
     * <code>int32 product_id = 1;</code>
     * @return The productId.
     */
    @java.lang.Override
    public int getProductId() {
      return productId_;
    }
    /**
     * <code>int32 product_id = 1;</code>
     * @param value The productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductId(int value) {

      productId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 product_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      productId_ = 0;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 2;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {

      quantity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      bitField0_ = (bitField0_ & ~0x00000002);
      quantity_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:order_product.CreateOrderRequest)
  }

  // @@protoc_insertion_point(class_scope:order_product.CreateOrderRequest)
  private static final com.microservices.grpc.order_product.dto.CreateOrderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservices.grpc.order_product.dto.CreateOrderRequest();
  }

  public static com.microservices.grpc.order_product.dto.CreateOrderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOrderRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateOrderRequest>() {
    @java.lang.Override
    public CreateOrderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreateOrderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOrderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservices.grpc.order_product.dto.CreateOrderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

