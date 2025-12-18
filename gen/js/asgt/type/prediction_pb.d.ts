import * as jspb from 'google-protobuf'

import * as gen_bq_schema_bq_field_pb from '../../gen_bq_schema/bq_field_pb'; // proto import: "gen_bq_schema/bq_field.proto"
import * as google_protobuf_wrappers_pb from 'google-protobuf/google/protobuf/wrappers_pb'; // proto import: "google/protobuf/wrappers.proto"


export class Confidence extends jspb.Message {
  getLevel(): Confidence.Level;
  setLevel(value: Confidence.Level): Confidence;

  getValue(): google_protobuf_wrappers_pb.FloatValue | undefined;
  setValue(value?: google_protobuf_wrappers_pb.FloatValue): Confidence;
  hasValue(): boolean;
  clearValue(): Confidence;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Confidence.AsObject;
  static toObject(includeInstance: boolean, msg: Confidence): Confidence.AsObject;
  static serializeBinaryToWriter(message: Confidence, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Confidence;
  static deserializeBinaryFromReader(message: Confidence, reader: jspb.BinaryReader): Confidence;
}

export namespace Confidence {
  export type AsObject = {
    level: Confidence.Level,
    value?: google_protobuf_wrappers_pb.FloatValue.AsObject,
  }

  export enum Level { 
    UNKNOWN = 0,
    VERY_LOW = 1,
    LOW = 2,
    MID = 3,
    HIGH = 4,
    VERY_HIGH = 5,
  }
}

export class Prediction extends jspb.Message {
  getTargetsList(): Array<Prediction.Target>;
  setTargetsList(value: Array<Prediction.Target>): Prediction;
  clearTargetsList(): Prediction;
  addTargets(value?: Prediction.Target, index?: number): Prediction.Target;

  getUnknownTokenPercentage(): number;
  setUnknownTokenPercentage(value: number): Prediction;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Prediction.AsObject;
  static toObject(includeInstance: boolean, msg: Prediction): Prediction.AsObject;
  static serializeBinaryToWriter(message: Prediction, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Prediction;
  static deserializeBinaryFromReader(message: Prediction, reader: jspb.BinaryReader): Prediction;
}

export namespace Prediction {
  export type AsObject = {
    targetsList: Array<Prediction.Target.AsObject>,
    unknownTokenPercentage: number,
  }

  export class Target extends jspb.Message {
    getName(): string;
    setName(value: string): Target;

    getCandidatesList(): Array<Prediction.Target.Candidate>;
    setCandidatesList(value: Array<Prediction.Target.Candidate>): Target;
    clearCandidatesList(): Target;
    addCandidates(value?: Prediction.Target.Candidate, index?: number): Prediction.Target.Candidate;

    getUnknownTargetClass(): boolean;
    setUnknownTargetClass(value: boolean): Target;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): Target.AsObject;
    static toObject(includeInstance: boolean, msg: Target): Target.AsObject;
    static serializeBinaryToWriter(message: Target, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): Target;
    static deserializeBinaryFromReader(message: Target, reader: jspb.BinaryReader): Target;
  }

  export namespace Target {
    export type AsObject = {
      name: string,
      candidatesList: Array<Prediction.Target.Candidate.AsObject>,
      unknownTargetClass: boolean,
    }

    export class Candidate extends jspb.Message {
      getValue(): string;
      setValue(value: string): Candidate;

      getConfidence(): Confidence | undefined;
      setConfidence(value?: Confidence): Candidate;
      hasConfidence(): boolean;
      clearConfidence(): Candidate;

      serializeBinary(): Uint8Array;
      toObject(includeInstance?: boolean): Candidate.AsObject;
      static toObject(includeInstance: boolean, msg: Candidate): Candidate.AsObject;
      static serializeBinaryToWriter(message: Candidate, writer: jspb.BinaryWriter): void;
      static deserializeBinary(bytes: Uint8Array): Candidate;
      static deserializeBinaryFromReader(message: Candidate, reader: jspb.BinaryReader): Candidate;
    }

    export namespace Candidate {
      export type AsObject = {
        value: string,
        confidence?: Confidence.AsObject,
      }
    }

  }

}

