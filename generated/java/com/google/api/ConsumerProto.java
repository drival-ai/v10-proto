// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/consumer.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

public final class ConsumerProto {
  private ConsumerProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      ConsumerProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_ProjectProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_ProjectProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Property_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Property_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031google/api/consumer.proto\022\ngoogle.api\"" +
      "I\n\021ProjectProperties\0224\n\nproperties\030\001 \003(\013" +
      "2\024.google.api.PropertyR\nproperties\"\305\001\n\010P" +
      "roperty\022\022\n\004name\030\001 \001(\tR\004name\0225\n\004type\030\002 \001(" +
      "\0162!.google.api.Property.PropertyTypeR\004ty" +
      "pe\022 \n\013description\030\003 \001(\tR\013description\"L\n\014" +
      "PropertyType\022\017\n\013UNSPECIFIED\020\000\022\t\n\005INT64\020\001" +
      "\022\010\n\004BOOL\020\002\022\n\n\006STRING\020\003\022\n\n\006DOUBLE\020\004Bh\n\016co" +
      "m.google.apiB\rConsumerProtoP\001ZEgoogle.go" +
      "lang.org/genproto/googleapis/api/service" +
      "config;serviceconfigb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_api_ProjectProperties_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_ProjectProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_ProjectProperties_descriptor,
        new java.lang.String[] { "Properties", });
    internal_static_google_api_Property_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_Property_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Property_descriptor,
        new java.lang.String[] { "Name", "Type", "Description", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
