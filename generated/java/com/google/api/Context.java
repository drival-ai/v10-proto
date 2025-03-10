// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/context.proto
// Protobuf Java Version: 4.29.1

package com.google.api;

/**
 * <pre>
 * `Context` defines which contexts an API requests.
 *
 * Example:
 *
 * context:
 * rules:
 * - selector: "*"
 * requested:
 * - google.rpc.context.ProjectContext
 * - google.rpc.context.OriginContext
 *
 * The above specifies that all methods in the API request
 * `google.rpc.context.ProjectContext` and
 * `google.rpc.context.OriginContext`.
 *
 * Available context types are defined in package
 * `google.rpc.context`.
 * </pre>
 *
 * Protobuf type {@code google.api.Context}
 */
public final class Context extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.api.Context)
    ContextOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      Context.class.getName());
  }
  // Use Context.newBuilder() to construct.
  private Context(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Context() {
    rules_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.ContextProto.internal_static_google_api_Context_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.ContextProto.internal_static_google_api_Context_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.Context.class, com.google.api.Context.Builder.class);
  }

  public static final int RULES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.api.ContextRule> rules_;
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.ContextRule> getRulesList() {
    return rules_;
  }
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.ContextRuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public com.google.api.ContextRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <pre>
   * A list of RPC context rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
   */
  @java.lang.Override
  public com.google.api.ContextRuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(1, rules_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rules_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.api.Context)) {
      return super.equals(obj);
    }
    com.google.api.Context other = (com.google.api.Context) obj;

    if (!getRulesList()
        .equals(other.getRulesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRulesCount() > 0) {
      hash = (37 * hash) + RULES_FIELD_NUMBER;
      hash = (53 * hash) + getRulesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.Context parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Context parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Context parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Context parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Context parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Context parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Context parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Context parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.api.Context parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.Context parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Context parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Context parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.Context prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * `Context` defines which contexts an API requests.
   *
   * Example:
   *
   * context:
   * rules:
   * - selector: "*"
   * requested:
   * - google.rpc.context.ProjectContext
   * - google.rpc.context.OriginContext
   *
   * The above specifies that all methods in the API request
   * `google.rpc.context.ProjectContext` and
   * `google.rpc.context.OriginContext`.
   *
   * Available context types are defined in package
   * `google.rpc.context`.
   * </pre>
   *
   * Protobuf type {@code google.api.Context}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Context)
      com.google.api.ContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.ContextProto.internal_static_google_api_Context_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.ContextProto.internal_static_google_api_Context_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.Context.class, com.google.api.Context.Builder.class);
    }

    // Construct using com.google.api.Context.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
      } else {
        rules_ = null;
        rulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.ContextProto.internal_static_google_api_Context_descriptor;
    }

    @java.lang.Override
    public com.google.api.Context getDefaultInstanceForType() {
      return com.google.api.Context.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.Context build() {
      com.google.api.Context result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.Context buildPartial() {
      com.google.api.Context result = new com.google.api.Context(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.api.Context result) {
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.api.Context result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.Context) {
        return mergeFrom((com.google.api.Context)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.Context other) {
      if (other == com.google.api.Context.getDefaultInstance()) return this;
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rulesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRulesFieldBuilder() : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.api.ContextRule m =
                  input.readMessage(
                      com.google.api.ContextRule.parser(),
                      extensionRegistry);
              if (rulesBuilder_ == null) {
                ensureRulesIsMutable();
                rules_.add(m);
              } else {
                rulesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.api.ContextRule> rules_ =
      java.util.Collections.emptyList();
    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rules_ = new java.util.ArrayList<com.google.api.ContextRule>(rules_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.api.ContextRule, com.google.api.ContextRule.Builder, com.google.api.ContextRuleOrBuilder> rulesBuilder_;

    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public java.util.List<com.google.api.ContextRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder setRules(
        int index, com.google.api.ContextRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder setRules(
        int index, com.google.api.ContextRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addRules(com.google.api.ContextRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addRules(
        int index, com.google.api.ContextRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addRules(
        com.google.api.ContextRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addRules(
        int index, com.google.api.ContextRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.api.ContextRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRule.Builder getRulesBuilder(
        int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRuleOrBuilder getRulesOrBuilder(
        int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);  } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public java.util.List<? extends com.google.api.ContextRuleOrBuilder> 
         getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder().addBuilder(
          com.google.api.ContextRule.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public com.google.api.ContextRule.Builder addRulesBuilder(
        int index) {
      return getRulesFieldBuilder().addBuilder(
          index, com.google.api.ContextRule.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of RPC context rules that apply to individual API methods.
     *
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.ContextRule rules = 1 [json_name = "rules"];</code>
     */
    public java.util.List<com.google.api.ContextRule.Builder> 
         getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.api.ContextRule, com.google.api.ContextRule.Builder, com.google.api.ContextRuleOrBuilder> 
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.api.ContextRule, com.google.api.ContextRule.Builder, com.google.api.ContextRuleOrBuilder>(
                rules_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rules_ = null;
      }
      return rulesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:google.api.Context)
  }

  // @@protoc_insertion_point(class_scope:google.api.Context)
  private static final com.google.api.Context DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.Context();
  }

  public static com.google.api.Context getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Context>
      PARSER = new com.google.protobuf.AbstractParser<Context>() {
    @java.lang.Override
    public Context parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Context> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Context> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.Context getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

