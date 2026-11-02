import * as jspb from 'google-protobuf'

import * as google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb'; // proto import: "google/protobuf/empty.proto"
import * as google_protobuf_timestamp_pb from 'google-protobuf/google/protobuf/timestamp_pb'; // proto import: "google/protobuf/timestamp.proto"
import * as ssn_type_candidate_pb from '../../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"


export class StartVerificationRequest extends jspb.Message {
  getSubject(): string;
  setSubject(value: string): StartVerificationRequest;

  getIdempotencyKey(): string;
  setIdempotencyKey(value: string): StartVerificationRequest;

  getDocument(): Uint8Array | string;
  getDocument_asU8(): Uint8Array;
  getDocument_asB64(): string;
  setDocument(value: Uint8Array | string): StartVerificationRequest;

  getCountryHint(): string;
  setCountryHint(value: string): StartVerificationRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): StartVerificationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: StartVerificationRequest): StartVerificationRequest.AsObject;
  static serializeBinaryToWriter(message: StartVerificationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): StartVerificationRequest;
  static deserializeBinaryFromReader(message: StartVerificationRequest, reader: jspb.BinaryReader): StartVerificationRequest;
}

export namespace StartVerificationRequest {
  export type AsObject = {
    subject: string,
    idempotencyKey: string,
    document: Uint8Array | string,
    countryHint: string,
  }
}

export class GetVerificationRequest extends jspb.Message {
  getVerificationId(): string;
  setVerificationId(value: string): GetVerificationRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GetVerificationRequest.AsObject;
  static toObject(includeInstance: boolean, msg: GetVerificationRequest): GetVerificationRequest.AsObject;
  static serializeBinaryToWriter(message: GetVerificationRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GetVerificationRequest;
  static deserializeBinaryFromReader(message: GetVerificationRequest, reader: jspb.BinaryReader): GetVerificationRequest;
}

export namespace GetVerificationRequest {
  export type AsObject = {
    verificationId: string,
  }
}

export class DeleteVerificationsRequest extends jspb.Message {
  getSubject(): string;
  setSubject(value: string): DeleteVerificationsRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeleteVerificationsRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeleteVerificationsRequest): DeleteVerificationsRequest.AsObject;
  static serializeBinaryToWriter(message: DeleteVerificationsRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeleteVerificationsRequest;
  static deserializeBinaryFromReader(message: DeleteVerificationsRequest, reader: jspb.BinaryReader): DeleteVerificationsRequest;
}

export namespace DeleteVerificationsRequest {
  export type AsObject = {
    subject: string,
  }
}

export class Verification extends jspb.Message {
  getVerificationId(): string;
  setVerificationId(value: string): Verification;

  getSubject(): string;
  setSubject(value: string): Verification;

  getIdempotencyKey(): string;
  setIdempotencyKey(value: string): Verification;

  getState(): Verification.State;
  setState(value: Verification.State): Verification;

  getReasonCode(): string;
  setReasonCode(value: string): Verification;

  getSubmittedAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setSubmittedAt(value?: google_protobuf_timestamp_pb.Timestamp): Verification;
  hasSubmittedAt(): boolean;
  clearSubmittedAt(): Verification;

  getCompletedAt(): google_protobuf_timestamp_pb.Timestamp | undefined;
  setCompletedAt(value?: google_protobuf_timestamp_pb.Timestamp): Verification;
  hasCompletedAt(): boolean;
  clearCompletedAt(): Verification;

  getFieldsList(): Array<VerifiedField>;
  setFieldsList(value: Array<VerifiedField>): Verification;
  clearFieldsList(): Verification;
  addFields(value?: VerifiedField, index?: number): VerifiedField;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Verification.AsObject;
  static toObject(includeInstance: boolean, msg: Verification): Verification.AsObject;
  static serializeBinaryToWriter(message: Verification, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Verification;
  static deserializeBinaryFromReader(message: Verification, reader: jspb.BinaryReader): Verification;
}

export namespace Verification {
  export type AsObject = {
    verificationId: string,
    subject: string,
    idempotencyKey: string,
    state: Verification.State,
    reasonCode: string,
    submittedAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    completedAt?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    fieldsList: Array<VerifiedField.AsObject>,
  }

  export enum State { 
    STATE_UNSPECIFIED = 0,
    STATE_ACCEPTED = 1,
    STATE_SUBMITTED = 2,
    STATE_VERIFIED = 3,
    STATE_SKIPPED = 4,
    STATE_EXPIRED = 5,
    STATE_FAILED = 6,
  }
}

export class VerifiedField extends jspb.Message {
  getName(): string;
  setName(value: string): VerifiedField;

  getCandidate(): ssn_type_candidate_pb.Candidate | undefined;
  setCandidate(value?: ssn_type_candidate_pb.Candidate): VerifiedField;
  hasCandidate(): boolean;
  clearCandidate(): VerifiedField;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): VerifiedField.AsObject;
  static toObject(includeInstance: boolean, msg: VerifiedField): VerifiedField.AsObject;
  static serializeBinaryToWriter(message: VerifiedField, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): VerifiedField;
  static deserializeBinaryFromReader(message: VerifiedField, reader: jspb.BinaryReader): VerifiedField;
}

export namespace VerifiedField {
  export type AsObject = {
    name: string,
    candidate?: ssn_type_candidate_pb.Candidate.AsObject,
  }
}

