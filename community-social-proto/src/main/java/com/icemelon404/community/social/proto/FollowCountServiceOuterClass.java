// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FollowCountService.proto

package com.icemelon404.community.social.proto;

public final class FollowCountServiceOuterClass {
  private FollowCountServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FollowCount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FollowCount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030FollowCountService.proto\"9\n\013FollowCoun" +
      "t\022\023\n\013followCount\030\001 \001(\005\022\025\n\rfollowerCount\030" +
      "\002 \001(\005\"\026\n\004User\022\016\n\006userId\030\001 \001(\00327\n\022FollowC" +
      "ountService\022!\n\nfetchCount\022\005.User\032\014.Follo" +
      "wCountB*\n&com.icemelon404.community.soci" +
      "al.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FollowCount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FollowCount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FollowCount_descriptor,
        new java.lang.String[] { "FollowCount", "FollowerCount", });
    internal_static_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_descriptor,
        new java.lang.String[] { "UserId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
