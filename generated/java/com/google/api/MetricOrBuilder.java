// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/metric.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

public interface MetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Metric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An existing metric type, see [google.api.MetricDescriptor][google.api.MetricDescriptor].
   * For example, `custom.googleapis.com/invoice/paid/amount`.
   * </pre>
   *
   * <code>string type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * An existing metric type, see [google.api.MetricDescriptor][google.api.MetricDescriptor].
   * For example, `custom.googleapis.com/invoice/paid/amount`.
   * </pre>
   *
   * <code>string type = 3 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * The set of label values that uniquely identify this metric. All
   * labels listed in the `MetricDescriptor` must be assigned values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The set of label values that uniquely identify this metric. All
   * labels listed in the `MetricDescriptor` must be assigned values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * The set of label values that uniquely identify this metric. All
   * labels listed in the `MetricDescriptor` must be assigned values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The set of label values that uniquely identify this metric. All
   * labels listed in the `MetricDescriptor` must be assigned values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The set of label values that uniquely identify this metric. All
   * labels listed in the `MetricDescriptor` must be assigned values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2 [json_name = "labels"];</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
