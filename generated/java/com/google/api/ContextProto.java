// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/context.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

public final class ContextProto {
  private ContextProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      ContextProto.class.getName());
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
    internal_static_google_api_Context_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_ContextRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_ContextRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/context.proto\022\ngoogle.api\"8" +
      "\n\007Context\022-\n\005rules\030\001 \003(\0132\027.google.api.Co" +
      "ntextRuleR\005rules\"c\n\013ContextRule\022\032\n\010selec" +
      "tor\030\001 \001(\tR\010selector\022\034\n\trequested\030\002 \003(\tR\t" +
      "requested\022\032\n\010provided\030\003 \003(\tR\010providedBn\n" +
      "\016com.google.apiB\014ContextProtoP\001ZEgoogle." +
      "golang.org/genproto/googleapis/api/servi" +
      "ceconfig;serviceconfig\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_api_Context_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Context_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Context_descriptor,
        new java.lang.String[] { "Rules", });
    internal_static_google_api_ContextRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_ContextRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_ContextRule_descriptor,
        new java.lang.String[] { "Selector", "Requested", "Provided", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
