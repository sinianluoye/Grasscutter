// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VehicleInfo.proto

package emu.grasscutter.net.proto;

public final class VehicleInfoOuterClass {
  private VehicleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VehicleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VehicleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember> 
        getMemberListList();
    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember getMemberList(int index);
    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    int getMemberListCount();
    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder> 
        getMemberListOrBuilderList();
    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberListOrBuilder(
        int index);

    /**
     * <code>uint32 ownerUid = 2;</code>
     * @return The ownerUid.
     */
    int getOwnerUid();

    /**
     * <code>float curStamina = 3;</code>
     * @return The curStamina.
     */
    float getCurStamina();
  }
  /**
   * Protobuf type {@code VehicleInfo}
   */
  public static final class VehicleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VehicleInfo)
      VehicleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VehicleInfo.newBuilder() to construct.
    private VehicleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VehicleInfo() {
      memberList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VehicleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VehicleInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                memberList_ = new java.util.ArrayList<emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember>();
                mutable_bitField0_ |= 0x00000001;
              }
              memberList_.add(
                  input.readMessage(emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.parser(), extensionRegistry));
              break;
            }
            case 16: {

              ownerUid_ = input.readUInt32();
              break;
            }
            case 29: {

              curStamina_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          memberList_ = java.util.Collections.unmodifiableList(memberList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VehicleInfoOuterClass.internal_static_VehicleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VehicleInfoOuterClass.internal_static_VehicleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo.class, emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo.Builder.class);
    }

    public static final int MEMBERLIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember> memberList_;
    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember> getMemberListList() {
      return memberList_;
    }
    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder> 
        getMemberListOrBuilderList() {
      return memberList_;
    }
    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    @java.lang.Override
    public int getMemberListCount() {
      return memberList_.size();
    }
    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember getMemberList(int index) {
      return memberList_.get(index);
    }
    /**
     * <code>repeated .VehicleMember memberList = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberListOrBuilder(
        int index) {
      return memberList_.get(index);
    }

    public static final int OWNERUID_FIELD_NUMBER = 2;
    private int ownerUid_;
    /**
     * <code>uint32 ownerUid = 2;</code>
     * @return The ownerUid.
     */
    @java.lang.Override
    public int getOwnerUid() {
      return ownerUid_;
    }

    public static final int CURSTAMINA_FIELD_NUMBER = 3;
    private float curStamina_;
    /**
     * <code>float curStamina = 3;</code>
     * @return The curStamina.
     */
    @java.lang.Override
    public float getCurStamina() {
      return curStamina_;
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
      for (int i = 0; i < memberList_.size(); i++) {
        output.writeMessage(1, memberList_.get(i));
      }
      if (ownerUid_ != 0) {
        output.writeUInt32(2, ownerUid_);
      }
      if (curStamina_ != 0F) {
        output.writeFloat(3, curStamina_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < memberList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, memberList_.get(i));
      }
      if (ownerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, ownerUid_);
      }
      if (curStamina_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, curStamina_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo other = (emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo) obj;

      if (!getMemberListList()
          .equals(other.getMemberListList())) return false;
      if (getOwnerUid()
          != other.getOwnerUid()) return false;
      if (java.lang.Float.floatToIntBits(getCurStamina())
          != java.lang.Float.floatToIntBits(
              other.getCurStamina())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getMemberListCount() > 0) {
        hash = (37 * hash) + MEMBERLIST_FIELD_NUMBER;
        hash = (53 * hash) + getMemberListList().hashCode();
      }
      hash = (37 * hash) + OWNERUID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerUid();
      hash = (37 * hash) + CURSTAMINA_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCurStamina());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code VehicleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VehicleInfo)
        emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VehicleInfoOuterClass.internal_static_VehicleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VehicleInfoOuterClass.internal_static_VehicleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo.class, emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getMemberListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (memberListBuilder_ == null) {
          memberList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          memberListBuilder_.clear();
        }
        ownerUid_ = 0;

        curStamina_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VehicleInfoOuterClass.internal_static_VehicleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo build() {
        emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo buildPartial() {
        emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo result = new emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo(this);
        int from_bitField0_ = bitField0_;
        if (memberListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            memberList_ = java.util.Collections.unmodifiableList(memberList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.memberList_ = memberList_;
        } else {
          result.memberList_ = memberListBuilder_.build();
        }
        result.ownerUid_ = ownerUid_;
        result.curStamina_ = curStamina_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo other) {
        if (other == emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo.getDefaultInstance()) return this;
        if (memberListBuilder_ == null) {
          if (!other.memberList_.isEmpty()) {
            if (memberList_.isEmpty()) {
              memberList_ = other.memberList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMemberListIsMutable();
              memberList_.addAll(other.memberList_);
            }
            onChanged();
          }
        } else {
          if (!other.memberList_.isEmpty()) {
            if (memberListBuilder_.isEmpty()) {
              memberListBuilder_.dispose();
              memberListBuilder_ = null;
              memberList_ = other.memberList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              memberListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMemberListFieldBuilder() : null;
            } else {
              memberListBuilder_.addAllMessages(other.memberList_);
            }
          }
        }
        if (other.getOwnerUid() != 0) {
          setOwnerUid(other.getOwnerUid());
        }
        if (other.getCurStamina() != 0F) {
          setCurStamina(other.getCurStamina());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember> memberList_ =
        java.util.Collections.emptyList();
      private void ensureMemberListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          memberList_ = new java.util.ArrayList<emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember>(memberList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder> memberListBuilder_;

      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember> getMemberListList() {
        if (memberListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(memberList_);
        } else {
          return memberListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public int getMemberListCount() {
        if (memberListBuilder_ == null) {
          return memberList_.size();
        } else {
          return memberListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember getMemberList(int index) {
        if (memberListBuilder_ == null) {
          return memberList_.get(index);
        } else {
          return memberListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public Builder setMemberList(
          int index, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember value) {
        if (memberListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemberListIsMutable();
          memberList_.set(index, value);
          onChanged();
        } else {
          memberListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public Builder setMemberList(
          int index, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder builderForValue) {
        if (memberListBuilder_ == null) {
          ensureMemberListIsMutable();
          memberList_.set(index, builderForValue.build());
          onChanged();
        } else {
          memberListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public Builder addMemberList(emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember value) {
        if (memberListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemberListIsMutable();
          memberList_.add(value);
          onChanged();
        } else {
          memberListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public Builder addMemberList(
          int index, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember value) {
        if (memberListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemberListIsMutable();
          memberList_.add(index, value);
          onChanged();
        } else {
          memberListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public Builder addMemberList(
          emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder builderForValue) {
        if (memberListBuilder_ == null) {
          ensureMemberListIsMutable();
          memberList_.add(builderForValue.build());
          onChanged();
        } else {
          memberListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public Builder addMemberList(
          int index, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder builderForValue) {
        if (memberListBuilder_ == null) {
          ensureMemberListIsMutable();
          memberList_.add(index, builderForValue.build());
          onChanged();
        } else {
          memberListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public Builder addAllMemberList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember> values) {
        if (memberListBuilder_ == null) {
          ensureMemberListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, memberList_);
          onChanged();
        } else {
          memberListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public Builder clearMemberList() {
        if (memberListBuilder_ == null) {
          memberList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          memberListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public Builder removeMemberList(int index) {
        if (memberListBuilder_ == null) {
          ensureMemberListIsMutable();
          memberList_.remove(index);
          onChanged();
        } else {
          memberListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder getMemberListBuilder(
          int index) {
        return getMemberListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberListOrBuilder(
          int index) {
        if (memberListBuilder_ == null) {
          return memberList_.get(index);  } else {
          return memberListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder> 
           getMemberListOrBuilderList() {
        if (memberListBuilder_ != null) {
          return memberListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(memberList_);
        }
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder addMemberListBuilder() {
        return getMemberListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.getDefaultInstance());
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder addMemberListBuilder(
          int index) {
        return getMemberListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.getDefaultInstance());
      }
      /**
       * <code>repeated .VehicleMember memberList = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder> 
           getMemberListBuilderList() {
        return getMemberListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder> 
          getMemberListFieldBuilder() {
        if (memberListBuilder_ == null) {
          memberListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder>(
                  memberList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          memberList_ = null;
        }
        return memberListBuilder_;
      }

      private int ownerUid_ ;
      /**
       * <code>uint32 ownerUid = 2;</code>
       * @return The ownerUid.
       */
      @java.lang.Override
      public int getOwnerUid() {
        return ownerUid_;
      }
      /**
       * <code>uint32 ownerUid = 2;</code>
       * @param value The ownerUid to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerUid(int value) {
        
        ownerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ownerUid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerUid() {
        
        ownerUid_ = 0;
        onChanged();
        return this;
      }

      private float curStamina_ ;
      /**
       * <code>float curStamina = 3;</code>
       * @return The curStamina.
       */
      @java.lang.Override
      public float getCurStamina() {
        return curStamina_;
      }
      /**
       * <code>float curStamina = 3;</code>
       * @param value The curStamina to set.
       * @return This builder for chaining.
       */
      public Builder setCurStamina(float value) {
        
        curStamina_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float curStamina = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurStamina() {
        
        curStamina_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:VehicleInfo)
    }

    // @@protoc_insertion_point(class_scope:VehicleInfo)
    private static final emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo();
    }

    public static emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VehicleInfo>
        PARSER = new com.google.protobuf.AbstractParser<VehicleInfo>() {
      @java.lang.Override
      public VehicleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VehicleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VehicleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VehicleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VehicleInfoOuterClass.VehicleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VehicleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VehicleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021VehicleInfo.proto\032\023VehicleMember.proto" +
      "\"W\n\013VehicleInfo\022\"\n\nmemberList\030\001 \003(\0132\016.Ve" +
      "hicleMember\022\020\n\010ownerUid\030\002 \001(\r\022\022\n\ncurStam" +
      "ina\030\003 \001(\002B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VehicleMemberOuterClass.getDescriptor(),
        });
    internal_static_VehicleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VehicleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VehicleInfo_descriptor,
        new java.lang.String[] { "MemberList", "OwnerUid", "CurStamina", });
    emu.grasscutter.net.proto.VehicleMemberOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
