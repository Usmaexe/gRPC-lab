// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

// Protobuf Java Version: 3.25.6
package com.microservices.grpc.order_product.services;

public final class Services {
  private Services() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016services.proto\022\rorder_product\032\016entitie" +
      "s.proto\032\tdto.proto2\245\001\n\014OrderService\022T\n\013C" +
      "reateOrder\022!.order_product.CreateOrderRe" +
      "quest\032\".order_product.CreateOrderRespons" +
      "e\022?\n\021UpdateOrderStatus\022\024.order_product.O" +
      "rder\032\024.order_product.Order2\313\001\n\016ProductSe" +
      "rvice\022]\n\016GetProductById\022$.order_product." +
      "GetProductByIdRequest\032%.order_product.Ge" +
      "tProductByIdResponse\022Z\n\rUpdateProduct\022#." +
      "order_product.UpdateProductRequest\032$.ord" +
      "er_product.UpdateProductResponseB1\n-com." +
      "microservices.grpc.order_product.service" +
      "sP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.microservices.grpc.order_product.entities.Entities.getDescriptor(),
          com.microservices.grpc.order_product.dto.Dto.getDescriptor(),
        });
    com.microservices.grpc.order_product.entities.Entities.getDescriptor();
    com.microservices.grpc.order_product.dto.Dto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
