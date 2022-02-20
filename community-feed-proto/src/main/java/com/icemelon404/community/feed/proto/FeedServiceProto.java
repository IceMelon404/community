// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FeedServiceProto.proto

package com.icemelon404.community.feed.proto;

public final class FeedServiceProto {
  private FeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserWithPost_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserWithPost_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FeedPushRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FeedPushRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FeedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FeedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PushResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PushResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FeedServiceProto.proto\"a\n\013FeedRequest\022" +
      "\023\n\013feedOwnerId\030\001 \001(\003\022\020\n\010boundary\030\002 \001(\003\022\014" +
      "\n\004size\030\003 \001(\005\022\035\n\tdirection\030\004 \001(\0162\n.Direct" +
      "ion\"3\n\014UserWithPost\022\023\n\013feedOwnerId\030\001 \001(\003" +
      "\022\016\n\006postId\030\002 \001(\003\"6\n\017FeedPushRequest\022#\n\014u" +
      "serWithPost\030\001 \003(\0132\r.UserWithPost\"\"\n\014Feed" +
      "Response\022\022\n\006postId\030\001 \003(\003B\002\020\001\"5\n\nPushResu" +
      "lt\022\021\n\tisSuccess\030\001 \001(\010\022\024\n\014errorMessage\030\002 " +
      "\001(\t*!\n\tDirection\022\t\n\005UPPER\020\000\022\t\n\005LOWER\020\0012f" +
      "\n\021SocialFeedService\022&\n\007getFeed\022\014.FeedReq" +
      "uest\032\r.FeedResponse\022)\n\010pushFeed\022\020.FeedPu" +
      "shRequest\032\013.PushResult2g\n\022PrivateFeedSer" +
      "vice\022&\n\007getFeed\022\014.FeedRequest\032\r.FeedResp" +
      "onse\022)\n\010pushFeed\022\020.FeedPushRequest\032\013.Pus" +
      "hResultB(\n$com.icemelon404.community.fee" +
      "d.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FeedRequest_descriptor,
        new java.lang.String[] { "FeedOwnerId", "Boundary", "Size", "Direction", });
    internal_static_UserWithPost_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UserWithPost_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserWithPost_descriptor,
        new java.lang.String[] { "FeedOwnerId", "PostId", });
    internal_static_FeedPushRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_FeedPushRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FeedPushRequest_descriptor,
        new java.lang.String[] { "UserWithPost", });
    internal_static_FeedResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_FeedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FeedResponse_descriptor,
        new java.lang.String[] { "PostId", });
    internal_static_PushResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_PushResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PushResult_descriptor,
        new java.lang.String[] { "IsSuccess", "ErrorMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
