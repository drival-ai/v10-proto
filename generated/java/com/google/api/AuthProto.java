// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/auth.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

public final class AuthProto {
  private AuthProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      AuthProto.class.getName());
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
    internal_static_google_api_Authentication_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Authentication_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_AuthenticationRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_AuthenticationRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_AuthProvider_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_AuthProvider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_OAuthRequirements_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_OAuthRequirements_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_AuthRequirement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_AuthRequirement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025google/api/auth.proto\022\ngoogle.api\032\034goo" +
      "gle/api/annotations.proto\"~\n\016Authenticat" +
      "ion\0224\n\005rules\030\003 \003(\0132\036.google.api.Authenti" +
      "cationRuleR\005rules\0226\n\tproviders\030\004 \003(\0132\030.g" +
      "oogle.api.AuthProviderR\tproviders\"\340\001\n\022Au" +
      "thenticationRule\022\032\n\010selector\030\001 \001(\tR\010sele" +
      "ctor\0223\n\005oauth\030\002 \001(\0132\035.google.api.OAuthRe" +
      "quirementsR\005oauth\0228\n\030allow_without_crede" +
      "ntial\030\005 \001(\010R\026allowWithoutCredential\022?\n\014r" +
      "equirements\030\007 \003(\0132\033.google.api.AuthRequi" +
      "rementR\014requirements\"\234\001\n\014AuthProvider\022\016\n" +
      "\002id\030\001 \001(\tR\002id\022\026\n\006issuer\030\002 \001(\tR\006issuer\022\031\n" +
      "\010jwks_uri\030\003 \001(\tR\007jwksUri\022\034\n\taudiences\030\004 " +
      "\001(\tR\taudiences\022+\n\021authorization_url\030\005 \001(" +
      "\tR\020authorizationUrl\">\n\021OAuthRequirements" +
      "\022)\n\020canonical_scopes\030\001 \001(\tR\017canonicalSco" +
      "pes\"P\n\017AuthRequirement\022\037\n\013provider_id\030\001 " +
      "\001(\tR\nproviderId\022\034\n\taudiences\030\002 \001(\tR\taudi" +
      "encesBk\n\016com.google.apiB\tAuthProtoP\001ZEgo" +
      "ogle.golang.org/genproto/googleapis/api/" +
      "serviceconfig;serviceconfig\242\002\004GAPIb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_api_Authentication_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Authentication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Authentication_descriptor,
        new java.lang.String[] { "Rules", "Providers", });
    internal_static_google_api_AuthenticationRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_AuthenticationRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_AuthenticationRule_descriptor,
        new java.lang.String[] { "Selector", "Oauth", "AllowWithoutCredential", "Requirements", });
    internal_static_google_api_AuthProvider_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_AuthProvider_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_AuthProvider_descriptor,
        new java.lang.String[] { "Id", "Issuer", "JwksUri", "Audiences", "AuthorizationUrl", });
    internal_static_google_api_OAuthRequirements_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_OAuthRequirements_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_OAuthRequirements_descriptor,
        new java.lang.String[] { "CanonicalScopes", });
    internal_static_google_api_AuthRequirement_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_AuthRequirement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_AuthRequirement_descriptor,
        new java.lang.String[] { "ProviderId", "Audiences", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
