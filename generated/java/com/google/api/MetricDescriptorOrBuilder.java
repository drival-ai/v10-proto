// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/metric.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

public interface MetricDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.MetricDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the metric descriptor.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the metric descriptor.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The metric type, including its DNS name prefix. The type is not
   * URL-encoded.  All user-defined custom metric types have the DNS name
   * `custom.googleapis.com`.  Metric types should use a natural hierarchical
   * grouping. For example:
   *
   * "custom.googleapis.com/invoice/paid/amount"
   * "appengine.googleapis.com/http/server/response_latencies"
   * </pre>
   *
   * <code>string type = 8 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The metric type, including its DNS name prefix. The type is not
   * URL-encoded.  All user-defined custom metric types have the DNS name
   * `custom.googleapis.com`.  Metric types should use a natural hierarchical
   * grouping. For example:
   *
   * "custom.googleapis.com/invoice/paid/amount"
   * "appengine.googleapis.com/http/server/response_latencies"
   * </pre>
   *
   * <code>string type = 8 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * The set of labels that can be used to describe a specific
   * instance of this metric type. For example, the
   * `appengine.googleapis.com/http/server/response_latencies` metric
   * type has a label for the HTTP response code, `response_code`, so
   * you can look at latencies for successful responses or just
   * for responses that failed.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2 [json_name = "labels"];</code>
   */
  java.util.List<com.google.api.LabelDescriptor> 
      getLabelsList();
  /**
   * <pre>
   * The set of labels that can be used to describe a specific
   * instance of this metric type. For example, the
   * `appengine.googleapis.com/http/server/response_latencies` metric
   * type has a label for the HTTP response code, `response_code`, so
   * you can look at latencies for successful responses or just
   * for responses that failed.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2 [json_name = "labels"];</code>
   */
  com.google.api.LabelDescriptor getLabels(int index);
  /**
   * <pre>
   * The set of labels that can be used to describe a specific
   * instance of this metric type. For example, the
   * `appengine.googleapis.com/http/server/response_latencies` metric
   * type has a label for the HTTP response code, `response_code`, so
   * you can look at latencies for successful responses or just
   * for responses that failed.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2 [json_name = "labels"];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The set of labels that can be used to describe a specific
   * instance of this metric type. For example, the
   * `appengine.googleapis.com/http/server/response_latencies` metric
   * type has a label for the HTTP response code, `response_code`, so
   * you can look at latencies for successful responses or just
   * for responses that failed.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2 [json_name = "labels"];</code>
   */
  java.util.List<? extends com.google.api.LabelDescriptorOrBuilder> 
      getLabelsOrBuilderList();
  /**
   * <pre>
   * The set of labels that can be used to describe a specific
   * instance of this metric type. For example, the
   * `appengine.googleapis.com/http/server/response_latencies` metric
   * type has a label for the HTTP response code, `response_code`, so
   * you can look at latencies for successful responses or just
   * for responses that failed.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2 [json_name = "labels"];</code>
   */
  com.google.api.LabelDescriptorOrBuilder getLabelsOrBuilder(
      int index);

  /**
   * <pre>
   * Whether the metric records instantaneous values, changes to a value, etc.
   * Some combinations of `metric_kind` and `value_type` might not be supported.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor.MetricKind metric_kind = 3 [json_name = "metricKind"];</code>
   * @return The enum numeric value on the wire for metricKind.
   */
  int getMetricKindValue();
  /**
   * <pre>
   * Whether the metric records instantaneous values, changes to a value, etc.
   * Some combinations of `metric_kind` and `value_type` might not be supported.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor.MetricKind metric_kind = 3 [json_name = "metricKind"];</code>
   * @return The metricKind.
   */
  com.google.api.MetricDescriptor.MetricKind getMetricKind();

  /**
   * <pre>
   * Whether the measurement is an integer, a floating-point number, etc.
   * Some combinations of `metric_kind` and `value_type` might not be supported.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor.ValueType value_type = 4 [json_name = "valueType"];</code>
   * @return The enum numeric value on the wire for valueType.
   */
  int getValueTypeValue();
  /**
   * <pre>
   * Whether the measurement is an integer, a floating-point number, etc.
   * Some combinations of `metric_kind` and `value_type` might not be supported.
   * </pre>
   *
   * <code>.google.api.MetricDescriptor.ValueType value_type = 4 [json_name = "valueType"];</code>
   * @return The valueType.
   */
  com.google.api.MetricDescriptor.ValueType getValueType();

  /**
   * <pre>
   * The unit in which the metric value is reported. It is only applicable
   * if the `value_type` is `INT64`, `DOUBLE`, or `DISTRIBUTION`. The
   * supported units are a subset of [The Unified Code for Units of
   * Measure](http://unitsofmeasure.org/ucum.html) standard:
   *
   * **Basic units (UNIT)**
   *
   * * `bit`   bit
   * * `By`    byte
   * * `s`     second
   * * `min`   minute
   * * `h`     hour
   * * `d`     day
   *
   * **Prefixes (PREFIX)**
   *
   * * `k`     kilo    (10**3)
   * * `M`     mega    (10**6)
   * * `G`     giga    (10**9)
   * * `T`     tera    (10**12)
   * * `P`     peta    (10**15)
   * * `E`     exa     (10**18)
   * * `Z`     zetta   (10**21)
   * * `Y`     yotta   (10**24)
   * * `m`     milli   (10**-3)
   * * `u`     micro   (10**-6)
   * * `n`     nano    (10**-9)
   * * `p`     pico    (10**-12)
   * * `f`     femto   (10**-15)
   * * `a`     atto    (10**-18)
   * * `z`     zepto   (10**-21)
   * * `y`     yocto   (10**-24)
   * * `Ki`    kibi    (2**10)
   * * `Mi`    mebi    (2**20)
   * * `Gi`    gibi    (2**30)
   * * `Ti`    tebi    (2**40)
   *
   * **Grammar**
   *
   * The grammar also includes these connectors:
   *
   * * `/`    division (as an infix operator, e.g. `1/s`).
   * * `.`    multiplication (as an infix operator, e.g. `GBy.d`)
   *
   * The grammar for a unit is as follows:
   *
   * Expression = Component { "." Component } { "/" Component } ;
   *
   * Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ]
   * | Annotation
   * | "1"
   * ;
   *
   * Annotation = "{" NAME "}" ;
   *
   * Notes:
   *
   * * `Annotation` is just a comment if it follows a `UNIT` and is
   * equivalent to `1` if it is used alone. For examples,
   * `{requests}/s == 1/s`, `By{transmitted}/s == By/s`.
   * * `NAME` is a sequence of non-blank printable ASCII characters not
   * containing '{' or '}'.
   * * `1` represents dimensionless value 1, such as in `1/s`.
   * * `%` represents dimensionless value 1/100, and annotates values giving
   * a percentage.
   * </pre>
   *
   * <code>string unit = 5 [json_name = "unit"];</code>
   * @return The unit.
   */
  java.lang.String getUnit();
  /**
   * <pre>
   * The unit in which the metric value is reported. It is only applicable
   * if the `value_type` is `INT64`, `DOUBLE`, or `DISTRIBUTION`. The
   * supported units are a subset of [The Unified Code for Units of
   * Measure](http://unitsofmeasure.org/ucum.html) standard:
   *
   * **Basic units (UNIT)**
   *
   * * `bit`   bit
   * * `By`    byte
   * * `s`     second
   * * `min`   minute
   * * `h`     hour
   * * `d`     day
   *
   * **Prefixes (PREFIX)**
   *
   * * `k`     kilo    (10**3)
   * * `M`     mega    (10**6)
   * * `G`     giga    (10**9)
   * * `T`     tera    (10**12)
   * * `P`     peta    (10**15)
   * * `E`     exa     (10**18)
   * * `Z`     zetta   (10**21)
   * * `Y`     yotta   (10**24)
   * * `m`     milli   (10**-3)
   * * `u`     micro   (10**-6)
   * * `n`     nano    (10**-9)
   * * `p`     pico    (10**-12)
   * * `f`     femto   (10**-15)
   * * `a`     atto    (10**-18)
   * * `z`     zepto   (10**-21)
   * * `y`     yocto   (10**-24)
   * * `Ki`    kibi    (2**10)
   * * `Mi`    mebi    (2**20)
   * * `Gi`    gibi    (2**30)
   * * `Ti`    tebi    (2**40)
   *
   * **Grammar**
   *
   * The grammar also includes these connectors:
   *
   * * `/`    division (as an infix operator, e.g. `1/s`).
   * * `.`    multiplication (as an infix operator, e.g. `GBy.d`)
   *
   * The grammar for a unit is as follows:
   *
   * Expression = Component { "." Component } { "/" Component } ;
   *
   * Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ]
   * | Annotation
   * | "1"
   * ;
   *
   * Annotation = "{" NAME "}" ;
   *
   * Notes:
   *
   * * `Annotation` is just a comment if it follows a `UNIT` and is
   * equivalent to `1` if it is used alone. For examples,
   * `{requests}/s == 1/s`, `By{transmitted}/s == By/s`.
   * * `NAME` is a sequence of non-blank printable ASCII characters not
   * containing '{' or '}'.
   * * `1` represents dimensionless value 1, such as in `1/s`.
   * * `%` represents dimensionless value 1/100, and annotates values giving
   * a percentage.
   * </pre>
   *
   * <code>string unit = 5 [json_name = "unit"];</code>
   * @return The bytes for unit.
   */
  com.google.protobuf.ByteString
      getUnitBytes();

  /**
   * <pre>
   * A detailed description of the metric, which can be used in documentation.
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A detailed description of the metric, which can be used in documentation.
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * A concise name for the metric, which can be displayed in user interfaces.
   * Use sentence case without an ending period, for example "Request count".
   * This field is optional but it is recommended to be set for any metrics
   * associated with user-visible concepts, such as Quota.
   * </pre>
   *
   * <code>string display_name = 7 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * A concise name for the metric, which can be displayed in user interfaces.
   * Use sentence case without an ending period, for example "Request count".
   * This field is optional but it is recommended to be set for any metrics
   * associated with user-visible concepts, such as Quota.
   * </pre>
   *
   * <code>string display_name = 7 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();
}
