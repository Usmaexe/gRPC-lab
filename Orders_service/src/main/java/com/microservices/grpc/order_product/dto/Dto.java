// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto.proto

// Protobuf Java Version: 3.25.6
package com.microservices.grpc.order_product.dto;

public final class Dto {
  private Dto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_product_CreateOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_product_CreateOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_product_CreateOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_product_CreateOrderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_product_GetProductByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_product_GetProductByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_product_GetProductByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_product_GetProductByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_product_UpdateProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_product_UpdateProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_product_UpdateProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_product_UpdateProductResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tdto.proto\022\rorder_product\032\016entities.pro" +
      "to\":\n\022CreateOrderRequest\022\022\n\nproduct_id\030\001" +
      " \001(\005\022\020\n\010quantity\030\002 \001(\005\":\n\023CreateOrderRes" +
      "ponse\022#\n\005order\030\001 \001(\0132\024.order_product.Ord" +
      "er\"+\n\025GetProductByIdRequest\022\022\n\nproduct_i" +
      "d\030\001 \001(\005\"A\n\026GetProductByIdResponse\022\'\n\007pro" +
      "duct\030\001 \001(\0132\026.order_product.Product\"?\n\024Up" +
      "dateProductRequest\022\'\n\007product\030\001 \001(\0132\026.or" +
      "der_product.Product\"9\n\025UpdateProductResp" +
      "onse\022\017\n\007success\030\001 \001(\010\022\017\n\007message\030\002 \001(\tB," +
      "\n(com.microservices.grpc.order_product.d" +
      "toP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.microservices.grpc.order_product.entities.Entities.getDescriptor(),
        });
    internal_static_order_product_CreateOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_order_product_CreateOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_product_CreateOrderRequest_descriptor,
        new java.lang.String[] { "ProductId", "Quantity", });
    internal_static_order_product_CreateOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_order_product_CreateOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_product_CreateOrderResponse_descriptor,
        new java.lang.String[] { "Order", });
    internal_static_order_product_GetProductByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_order_product_GetProductByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_product_GetProductByIdRequest_descriptor,
        new java.lang.String[] { "ProductId", });
    internal_static_order_product_GetProductByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_order_product_GetProductByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_product_GetProductByIdResponse_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_order_product_UpdateProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_order_product_UpdateProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_product_UpdateProductRequest_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_order_product_UpdateProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_order_product_UpdateProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_product_UpdateProductResponse_descriptor,
        new java.lang.String[] { "Success", "Message", });
    com.microservices.grpc.order_product.entities.Entities.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
