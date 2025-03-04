// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/quota.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

public interface QuotaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Quota)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3 [json_name = "limits"];</code>
   */
  java.util.List<com.google.api.QuotaLimit> 
      getLimitsList();
  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3 [json_name = "limits"];</code>
   */
  com.google.api.QuotaLimit getLimits(int index);
  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3 [json_name = "limits"];</code>
   */
  int getLimitsCount();
  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3 [json_name = "limits"];</code>
   */
  java.util.List<? extends com.google.api.QuotaLimitOrBuilder> 
      getLimitsOrBuilderList();
  /**
   * <pre>
   * List of `QuotaLimit` definitions for the service.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.QuotaLimit limits = 3 [json_name = "limits"];</code>
   */
  com.google.api.QuotaLimitOrBuilder getLimitsOrBuilder(
      int index);

  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4 [json_name = "metricRules"];</code>
   */
  java.util.List<com.google.api.MetricRule> 
      getMetricRulesList();
  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4 [json_name = "metricRules"];</code>
   */
  com.google.api.MetricRule getMetricRules(int index);
  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4 [json_name = "metricRules"];</code>
   */
  int getMetricRulesCount();
  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4 [json_name = "metricRules"];</code>
   */
  java.util.List<? extends com.google.api.MetricRuleOrBuilder> 
      getMetricRulesOrBuilderList();
  /**
   * <pre>
   * List of `MetricRule` definitions, each one mapping a selected method to one
   * or more metrics.
   *
   * Used by metric-based quotas only.
   * </pre>
   *
   * <code>repeated .google.api.MetricRule metric_rules = 4 [json_name = "metricRules"];</code>
   */
  com.google.api.MetricRuleOrBuilder getMetricRulesOrBuilder(
      int index);
}
