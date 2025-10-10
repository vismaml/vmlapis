import * as jspb from 'google-protobuf'

import * as ssn_type_candidate_pb from '../../ssn/type/candidate_pb'; // proto import: "ssn/type/candidate.proto"


export class HotelDates extends jspb.Message {
  getCheckInDateList(): Array<ssn_type_candidate_pb.Candidate>;
  setCheckInDateList(value: Array<ssn_type_candidate_pb.Candidate>): HotelDates;
  clearCheckInDateList(): HotelDates;
  addCheckInDate(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  getCheckOutDateList(): Array<ssn_type_candidate_pb.Candidate>;
  setCheckOutDateList(value: Array<ssn_type_candidate_pb.Candidate>): HotelDates;
  clearCheckOutDateList(): HotelDates;
  addCheckOutDate(value?: ssn_type_candidate_pb.Candidate, index?: number): ssn_type_candidate_pb.Candidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): HotelDates.AsObject;
  static toObject(includeInstance: boolean, msg: HotelDates): HotelDates.AsObject;
  static serializeBinaryToWriter(message: HotelDates, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): HotelDates;
  static deserializeBinaryFromReader(message: HotelDates, reader: jspb.BinaryReader): HotelDates;
}

export namespace HotelDates {
  export type AsObject = {
    checkInDateList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
    checkOutDateList: Array<ssn_type_candidate_pb.Candidate.AsObject>,
  }
}

