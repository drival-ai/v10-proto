// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/iam/v1/iam_policy.proto
// Protobuf Java Version: 4.29.1

package com.google.iam.v1;

public interface TestIamPermissionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.v1.TestIamPermissionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A subset of `TestPermissionsRequest.permissions` that the caller is
   * allowed.
   * </pre>
   *
   * <code>repeated string permissions = 1 [json_name = "permissions"];</code>
   * @return A list containing the permissions.
   */
  java.util.List<java.lang.String>
      getPermissionsList();
  /**
   * <pre>
   * A subset of `TestPermissionsRequest.permissions` that the caller is
   * allowed.
   * </pre>
   *
   * <code>repeated string permissions = 1 [json_name = "permissions"];</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <pre>
   * A subset of `TestPermissionsRequest.permissions` that the caller is
   * allowed.
   * </pre>
   *
   * <code>repeated string permissions = 1 [json_name = "permissions"];</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  java.lang.String getPermissions(int index);
  /**
   * <pre>
   * A subset of `TestPermissionsRequest.permissions` that the caller is
   * allowed.
   * </pre>
   *
   * <code>repeated string permissions = 1 [json_name = "permissions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionsBytes(int index);
}
