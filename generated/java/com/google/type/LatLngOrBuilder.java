// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/type/latlng.proto
// Protobuf Java Version: 4.29.1

package com.google.type;

public interface LatLngOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.type.LatLng)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * </pre>
   *
   * <code>double latitude = 1 [json_name = "latitude"];</code>
   * @return The latitude.
   */
  double getLatitude();

  /**
   * <pre>
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * </pre>
   *
   * <code>double longitude = 2 [json_name = "longitude"];</code>
   * @return The longitude.
   */
  double getLongitude();
}
