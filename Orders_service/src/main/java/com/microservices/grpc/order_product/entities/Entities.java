// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entities.proto

// Protobuf Java Version: 3.25.6
package com.microservices.grpc.order_product.entities;

public final class Entities {
  private Entities() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_product_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_product_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_order_product_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_order_product_Order_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016entities.proto\022\rorder_product\"S\n\007Produ" +
      "ct\022\n\n\002id\030\001 \001(\005\022\020\n\010quantity\030\002 \001(\005\022*\n\005stat" +
      "e\030\003 \001(\0162\033.order_product.ProductState\"c\n\005" +
      "Order\022\n\n\002id\030\001 \001(\005\022\022\n\nproduct_id\030\002 \001(\005\022\020\n" +
      "\010quantity\030\003 \001(\005\022(\n\005state\030\004 \001(\0162\031.order_p" +
      "roduct.OrderState*/\n\014ProductState\022\r\n\tAVA" +
      "ILABLE\020\000\022\020\n\014OUT_OF_STOCK\020\001*5\n\nOrderState" +
      "\022\013\n\007CREATED\020\000\022\016\n\nPROCESSING\020\001\022\n\n\006FAILED\020" +
      "\002B1\n-com.microservices.grpc.order_produc" +
      "t.entitiesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_order_product_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_order_product_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_product_Product_descriptor,
        new java.lang.String[] { "Id", "Quantity", "State", });
    internal_static_order_product_Order_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_order_product_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_order_product_Order_descriptor,
        new java.lang.String[] { "Id", "ProductId", "Quantity", "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
