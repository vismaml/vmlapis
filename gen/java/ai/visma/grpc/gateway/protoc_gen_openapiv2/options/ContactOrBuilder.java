// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

package ai.visma.grpc.gateway.protoc_gen_openapiv2.options;

public interface ContactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.gateway.protoc_gen_openapiv2.options.Contact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The identifying name of the contact person/organization.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The identifying name of the contact person/organization.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The URL pointing to the contact information. MUST be in the format of a
   * URL.
   * </pre>
   *
   * <code>string url = 2 [json_name = "url"];</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * The URL pointing to the contact information. MUST be in the format of a
   * URL.
   * </pre>
   *
   * <code>string url = 2 [json_name = "url"];</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * The email address of the contact person/organization. MUST be in the format
   * of an email address.
   * </pre>
   *
   * <code>string email = 3 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * The email address of the contact person/organization. MUST be in the format
   * of an email address.
   * </pre>
   *
   * <code>string email = 3 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();
}
