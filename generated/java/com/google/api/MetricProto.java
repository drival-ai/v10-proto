// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/metric.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

public final class MetricProto {
  private MetricProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      MetricProto.class.getName());
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
    internal_static_google_api_MetricDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_MetricDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Metric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Metric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Metric_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Metric_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027google/api/metric.proto\022\ngoogle.api\032\026g" +
      "oogle/api/label.proto\"\235\004\n\020MetricDescript" +
      "or\022\022\n\004name\030\001 \001(\tR\004name\022\022\n\004type\030\010 \001(\tR\004ty" +
      "pe\0223\n\006labels\030\002 \003(\0132\033.google.api.LabelDes" +
      "criptorR\006labels\022H\n\013metric_kind\030\003 \001(\0162\'.g" +
      "oogle.api.MetricDescriptor.MetricKindR\nm" +
      "etricKind\022E\n\nvalue_type\030\004 \001(\0162&.google.a" +
      "pi.MetricDescriptor.ValueTypeR\tvalueType" +
      "\022\022\n\004unit\030\005 \001(\tR\004unit\022 \n\013description\030\006 \001(" +
      "\tR\013description\022!\n\014display_name\030\007 \001(\tR\013di" +
      "splayName\"O\n\nMetricKind\022\033\n\027METRIC_KIND_U" +
      "NSPECIFIED\020\000\022\t\n\005GAUGE\020\001\022\t\n\005DELTA\020\002\022\016\n\nCU" +
      "MULATIVE\020\003\"q\n\tValueType\022\032\n\026VALUE_TYPE_UN" +
      "SPECIFIED\020\000\022\010\n\004BOOL\020\001\022\t\n\005INT64\020\002\022\n\n\006DOUB" +
      "LE\020\003\022\n\n\006STRING\020\004\022\020\n\014DISTRIBUTION\020\005\022\t\n\005MO" +
      "NEY\020\006\"\217\001\n\006Metric\022\022\n\004type\030\003 \001(\tR\004type\0226\n\006" +
      "labels\030\002 \003(\0132\036.google.api.Metric.LabelsE" +
      "ntryR\006labels\0329\n\013LabelsEntry\022\020\n\003key\030\001 \001(\t" +
      "R\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001B_\n\016com.g" +
      "oogle.apiB\013MetricProtoP\001Z7google.golang." +
      "org/genproto/googleapis/api/metric;metri" +
      "c\242\002\004GAPIb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.LabelProto.getDescriptor(),
        });
    internal_static_google_api_MetricDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_MetricDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_MetricDescriptor_descriptor,
        new java.lang.String[] { "Name", "Type", "Labels", "MetricKind", "ValueType", "Unit", "Description", "DisplayName", });
    internal_static_google_api_Metric_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_Metric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Metric_descriptor,
        new java.lang.String[] { "Type", "Labels", });
    internal_static_google_api_Metric_LabelsEntry_descriptor =
      internal_static_google_api_Metric_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Metric_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Metric_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.LabelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
