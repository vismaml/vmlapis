import * as jspb from 'google-protobuf'

import * as google_api_annotations_pb from '../../google/api/annotations_pb'; // proto import: "google/api/annotations.proto"
import * as google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb'; // proto import: "google/protobuf/empty.proto"
import * as protoc$gen$openapiv2_options_annotations_pb from '../../protoc-gen-openapiv2/options/annotations_pb'; // proto import: "protoc-gen-openapiv2/options/annotations.proto"
import * as validate_validate_pb from '../../validate/validate_pb'; // proto import: "validate/validate.proto"


export class ProductTypeBatchSuggestRequest extends jspb.Message {
  getTextsList(): Array<string>;
  setTextsList(value: Array<string>): ProductTypeBatchSuggestRequest;
  clearTextsList(): ProductTypeBatchSuggestRequest;
  addTexts(value: string, index?: number): ProductTypeBatchSuggestRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeBatchSuggestRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeBatchSuggestRequest): ProductTypeBatchSuggestRequest.AsObject;
  static serializeBinaryToWriter(message: ProductTypeBatchSuggestRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeBatchSuggestRequest;
  static deserializeBinaryFromReader(message: ProductTypeBatchSuggestRequest, reader: jspb.BinaryReader): ProductTypeBatchSuggestRequest;
}

export namespace ProductTypeBatchSuggestRequest {
  export type AsObject = {
    textsList: Array<string>,
  }
}

export class ProductTypeBatchSuggestResponse extends jspb.Message {
  getSuggestionsList(): Array<ProductTypeSuggestion>;
  setSuggestionsList(value: Array<ProductTypeSuggestion>): ProductTypeBatchSuggestResponse;
  clearSuggestionsList(): ProductTypeBatchSuggestResponse;
  addSuggestions(value?: ProductTypeSuggestion, index?: number): ProductTypeSuggestion;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeBatchSuggestResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeBatchSuggestResponse): ProductTypeBatchSuggestResponse.AsObject;
  static serializeBinaryToWriter(message: ProductTypeBatchSuggestResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeBatchSuggestResponse;
  static deserializeBinaryFromReader(message: ProductTypeBatchSuggestResponse, reader: jspb.BinaryReader): ProductTypeBatchSuggestResponse;
}

export namespace ProductTypeBatchSuggestResponse {
  export type AsObject = {
    suggestionsList: Array<ProductTypeSuggestion.AsObject>,
  }
}

export class ProductTypeSuggestion extends jspb.Message {
  getCandidatesList(): Array<ProductTypeCandidate>;
  setCandidatesList(value: Array<ProductTypeCandidate>): ProductTypeSuggestion;
  clearCandidatesList(): ProductTypeSuggestion;
  addCandidates(value?: ProductTypeCandidate, index?: number): ProductTypeCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeSuggestion.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeSuggestion): ProductTypeSuggestion.AsObject;
  static serializeBinaryToWriter(message: ProductTypeSuggestion, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeSuggestion;
  static deserializeBinaryFromReader(message: ProductTypeSuggestion, reader: jspb.BinaryReader): ProductTypeSuggestion;
}

export namespace ProductTypeSuggestion {
  export type AsObject = {
    candidatesList: Array<ProductTypeCandidate.AsObject>,
  }
}

export class ProductTypeCandidate extends jspb.Message {
  getType(): ProductType;
  setType(value: ProductType): ProductTypeCandidate;

  getLabel(): string;
  setLabel(value: string): ProductTypeCandidate;

  getConfidence(): number;
  setConfidence(value: number): ProductTypeCandidate;

  getConfidenceLevel(): ConfidenceLevel;
  setConfidenceLevel(value: ConfidenceLevel): ProductTypeCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeCandidate.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeCandidate): ProductTypeCandidate.AsObject;
  static serializeBinaryToWriter(message: ProductTypeCandidate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeCandidate;
  static deserializeBinaryFromReader(message: ProductTypeCandidate, reader: jspb.BinaryReader): ProductTypeCandidate;
}

export namespace ProductTypeCandidate {
  export type AsObject = {
    type: ProductType,
    label: string,
    confidence: number,
    confidenceLevel: ConfidenceLevel,
  }
}

export class ProductTypeFeedbackRequest extends jspb.Message {
  getTextsList(): Array<string>;
  setTextsList(value: Array<string>): ProductTypeFeedbackRequest;
  clearTextsList(): ProductTypeFeedbackRequest;
  addTexts(value: string, index?: number): ProductTypeFeedbackRequest;

  getTrueCategoriesList(): Array<string>;
  setTrueCategoriesList(value: Array<string>): ProductTypeFeedbackRequest;
  clearTrueCategoriesList(): ProductTypeFeedbackRequest;
  addTrueCategories(value: string, index?: number): ProductTypeFeedbackRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ProductTypeFeedbackRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ProductTypeFeedbackRequest): ProductTypeFeedbackRequest.AsObject;
  static serializeBinaryToWriter(message: ProductTypeFeedbackRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ProductTypeFeedbackRequest;
  static deserializeBinaryFromReader(message: ProductTypeFeedbackRequest, reader: jspb.BinaryReader): ProductTypeFeedbackRequest;
}

export namespace ProductTypeFeedbackRequest {
  export type AsObject = {
    textsList: Array<string>,
    trueCategoriesList: Array<string>,
  }
}

export enum ProductType { 
  UNDEFINED = 0,
  ACCOUNTING_AUDIT = 1,
  ACCOUNTING_SOFTWARE = 2,
  ADVERTISING = 3,
  ALCOHOL_TOBACCO = 4,
  MEDICAL_LAB_EQUIPMENT = 5,
  BANKING_INVESTMENT = 6,
  BOOKS = 7,
  BUSINESS_CONSULTING = 8,
  CHEMICALS = 9,
  CLEANING_SERVICES = 10,
  CLEANING_SUPPLIES = 11,
  CLOTHING = 12,
  ELECTRONICS = 13,
  CONSTRUCTION_MATERIALS = 14,
  DECORATIONS_ART = 15,
  DEFENSE_SECURITY = 16,
  DEPOSITS = 17,
  DOMESTIC_APPLIANCES = 18,
  EDUCATION_TRAINING = 19,
  ENERGY = 20,
  FACILITY_MAINTENANCE = 21,
  AGRICULTURE = 22,
  FEES = 23,
  FINES = 24,
  FOOD_BEVERAGES = 25,
  FUEL_LUBRICANTS = 26,
  FURNITURE = 27,
  GIFTS = 28,
  GLASS_CERAMICS = 29,
  GOVERNMENT_SERVICES = 30,
  GRAPHIC_DESIGN = 31,
  FITNESS_CLUBS = 32,
  HEALTHCARE = 33,
  HOTELS = 34,
  INDUSTRIAL_MACHINERY = 35,
  MANUFACTURING = 36,
  INSURANCE = 37,
  INTERNET_MEDIA = 38,
  PROPERTY_RENTAL = 39,
  LEGAL = 40,
  PLANTS_ANIMALS = 41,
  MACHINERY_LEASING = 42,
  MARKETING = 43,
  MEETINGS = 44,
  MUSIC = 45,
  OFFICE_SUPPLIES = 46,
  PACKAGING = 47,
  PARKING = 48,
  PASSENGER_TRANSPORT = 49,
  PAYMENTS = 50,
  PAYROLL = 51,
  PERSONAL_SERVICES = 52,
  PERSONAL_CARE = 53,
  PHARMACEUTICALS = 54,
  MEDIA_SERVICES = 55,
  RECREATIONAL_SERVICES = 56,
  RESEARCH_TECH_CONSULTING = 57,
  RESTAURANTS = 58,
  RETIREMENT = 59,
  LOGISTICS = 60,
  SOFTWARE = 61,
  SPORTS_EQUIPMENT = 62,
  STORAGE = 63,
  TAXATION = 64,
  TELEPHONY = 65,
  TEXTILES = 66,
  JEWELRY = 67,
  TOLLS = 68,
  TOYS = 69,
  TRADE_REPAIR = 70,
  VEHICLE_RENTALS = 71,
  VEHICLES = 72,
  WATER_WASTE = 73,
  WEBSITE = 74,
}
export enum ConfidenceLevel { 
  UNKNOWN = 0,
  VERY_LOW = 1,
  LOW = 2,
  MID = 3,
  HIGH = 4,
  VERY_HIGH = 5,
}
