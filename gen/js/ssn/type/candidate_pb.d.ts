import * as jspb from 'google-protobuf'

import * as google_protobuf_wrappers_pb from 'google-protobuf/google/protobuf/wrappers_pb'; // proto import: "google/protobuf/wrappers.proto"
import * as ssn_type_geometry_pb from '../../ssn/type/geometry_pb'; // proto import: "ssn/type/geometry.proto"


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
    VERIFIED = 6,
  }
}

export class Candidate extends jspb.Message {
  getValue(): string;
  setValue(value: string): Candidate;

  getText(): string;
  setText(value: string): Candidate;

  getConfidence(): Confidence | undefined;
  setConfidence(value?: Confidence): Candidate;
  hasConfidence(): boolean;
  clearConfidence(): Candidate;

  getBoundingBox(): ssn_type_geometry_pb.BoundingPoly | undefined;
  setBoundingBox(value?: ssn_type_geometry_pb.BoundingPoly): Candidate;
  hasBoundingBox(): boolean;
  clearBoundingBox(): Candidate;

  getType(): Candidate.Type;
  setType(value: Candidate.Type): Candidate;

  getPageRef(): number;
  setPageRef(value: number): Candidate;

  getModelMetadata(): ModelSpec | undefined;
  setModelMetadata(value?: ModelSpec): Candidate;
  hasModelMetadata(): boolean;
  clearModelMetadata(): Candidate;

  getCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setCorrected(value?: google_protobuf_wrappers_pb.BoolValue): Candidate;
  hasCorrected(): boolean;
  clearCorrected(): Candidate;

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
    text: string,
    confidence?: Confidence.AsObject,
    boundingBox?: ssn_type_geometry_pb.BoundingPoly.AsObject,
    type: Candidate.Type,
    pageRef: number,
    modelMetadata?: ModelSpec.AsObject,
    corrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
  }

  export enum Type { 
    UNKNOWN = 0,
    FIELD = 1,
    DOCUMENT = 2,
  }
}

export class ModelSpec extends jspb.Message {
  getModelName(): string;
  setModelName(value: string): ModelSpec;

  getModelVer(): google_protobuf_wrappers_pb.Int64Value | undefined;
  setModelVer(value?: google_protobuf_wrappers_pb.Int64Value): ModelSpec;
  hasModelVer(): boolean;
  clearModelVer(): ModelSpec;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ModelSpec.AsObject;
  static toObject(includeInstance: boolean, msg: ModelSpec): ModelSpec.AsObject;
  static serializeBinaryToWriter(message: ModelSpec, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ModelSpec;
  static deserializeBinaryFromReader(message: ModelSpec, reader: jspb.BinaryReader): ModelSpec;
}

export namespace ModelSpec {
  export type AsObject = {
    modelName: string,
    modelVer?: google_protobuf_wrappers_pb.Int64Value.AsObject,
  }
}

export class LineCandidate extends jspb.Message {
  getText(): string;
  setText(value: string): LineCandidate;

  getAmount(): number;
  setAmount(value: number): LineCandidate;

  getPageRef(): number;
  setPageRef(value: number): LineCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): LineCandidate.AsObject;
  static toObject(includeInstance: boolean, msg: LineCandidate): LineCandidate.AsObject;
  static serializeBinaryToWriter(message: LineCandidate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): LineCandidate;
  static deserializeBinaryFromReader(message: LineCandidate, reader: jspb.BinaryReader): LineCandidate;
}

export namespace LineCandidate {
  export type AsObject = {
    text: string,
    amount: number,
    pageRef: number,
  }
}

export class PurchaseLineCandidate extends jspb.Message {
  getPageRef(): number;
  setPageRef(value: number): PurchaseLineCandidate;

  getCode(): string;
  setCode(value: string): PurchaseLineCandidate;

  getDescription(): string;
  setDescription(value: string): PurchaseLineCandidate;

  getQuantity(): string;
  setQuantity(value: string): PurchaseLineCandidate;

  getItemNumber(): string;
  setItemNumber(value: string): PurchaseLineCandidate;

  getUnit(): string;
  setUnit(value: string): PurchaseLineCandidate;

  getTotalDiscount(): string;
  setTotalDiscount(value: string): PurchaseLineCandidate;

  getPercentageDiscount(): string;
  setPercentageDiscount(value: string): PurchaseLineCandidate;

  getTotalInclVat(): string;
  setTotalInclVat(value: string): PurchaseLineCandidate;

  getTotalExclVat(): string;
  setTotalExclVat(value: string): PurchaseLineCandidate;

  getTotalVat(): string;
  setTotalVat(value: string): PurchaseLineCandidate;

  getPercentageVat(): string;
  setPercentageVat(value: string): PurchaseLineCandidate;

  getUnitPriceInclVat(): string;
  setUnitPriceInclVat(value: string): PurchaseLineCandidate;

  getUnitPriceExclVat(): string;
  setUnitPriceExclVat(value: string): PurchaseLineCandidate;

  getTotal(): string;
  setTotal(value: string): PurchaseLineCandidate;

  getUnitPrice(): string;
  setUnitPrice(value: string): PurchaseLineCandidate;

  getModelMetadata(): ModelSpec | undefined;
  setModelMetadata(value?: ModelSpec): PurchaseLineCandidate;
  hasModelMetadata(): boolean;
  clearModelMetadata(): PurchaseLineCandidate;

  getCodeConfidence(): Confidence | undefined;
  setCodeConfidence(value?: Confidence): PurchaseLineCandidate;
  hasCodeConfidence(): boolean;
  clearCodeConfidence(): PurchaseLineCandidate;

  getCodeCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setCodeCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasCodeCorrected(): boolean;
  clearCodeCorrected(): PurchaseLineCandidate;

  getDescriptionConfidence(): Confidence | undefined;
  setDescriptionConfidence(value?: Confidence): PurchaseLineCandidate;
  hasDescriptionConfidence(): boolean;
  clearDescriptionConfidence(): PurchaseLineCandidate;

  getDescriptionCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setDescriptionCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasDescriptionCorrected(): boolean;
  clearDescriptionCorrected(): PurchaseLineCandidate;

  getQuantityConfidence(): Confidence | undefined;
  setQuantityConfidence(value?: Confidence): PurchaseLineCandidate;
  hasQuantityConfidence(): boolean;
  clearQuantityConfidence(): PurchaseLineCandidate;

  getQuantityCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setQuantityCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasQuantityCorrected(): boolean;
  clearQuantityCorrected(): PurchaseLineCandidate;

  getItemNumberConfidence(): Confidence | undefined;
  setItemNumberConfidence(value?: Confidence): PurchaseLineCandidate;
  hasItemNumberConfidence(): boolean;
  clearItemNumberConfidence(): PurchaseLineCandidate;

  getItemNumberCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setItemNumberCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasItemNumberCorrected(): boolean;
  clearItemNumberCorrected(): PurchaseLineCandidate;

  getUnitConfidence(): Confidence | undefined;
  setUnitConfidence(value?: Confidence): PurchaseLineCandidate;
  hasUnitConfidence(): boolean;
  clearUnitConfidence(): PurchaseLineCandidate;

  getUnitCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setUnitCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasUnitCorrected(): boolean;
  clearUnitCorrected(): PurchaseLineCandidate;

  getTotalDiscountConfidence(): Confidence | undefined;
  setTotalDiscountConfidence(value?: Confidence): PurchaseLineCandidate;
  hasTotalDiscountConfidence(): boolean;
  clearTotalDiscountConfidence(): PurchaseLineCandidate;

  getTotalDiscountCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setTotalDiscountCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasTotalDiscountCorrected(): boolean;
  clearTotalDiscountCorrected(): PurchaseLineCandidate;

  getPercentageDiscountConfidence(): Confidence | undefined;
  setPercentageDiscountConfidence(value?: Confidence): PurchaseLineCandidate;
  hasPercentageDiscountConfidence(): boolean;
  clearPercentageDiscountConfidence(): PurchaseLineCandidate;

  getPercentageDiscountCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setPercentageDiscountCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasPercentageDiscountCorrected(): boolean;
  clearPercentageDiscountCorrected(): PurchaseLineCandidate;

  getTotalInclVatConfidence(): Confidence | undefined;
  setTotalInclVatConfidence(value?: Confidence): PurchaseLineCandidate;
  hasTotalInclVatConfidence(): boolean;
  clearTotalInclVatConfidence(): PurchaseLineCandidate;

  getTotalInclVatCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setTotalInclVatCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasTotalInclVatCorrected(): boolean;
  clearTotalInclVatCorrected(): PurchaseLineCandidate;

  getTotalExclVatConfidence(): Confidence | undefined;
  setTotalExclVatConfidence(value?: Confidence): PurchaseLineCandidate;
  hasTotalExclVatConfidence(): boolean;
  clearTotalExclVatConfidence(): PurchaseLineCandidate;

  getTotalExclVatCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setTotalExclVatCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasTotalExclVatCorrected(): boolean;
  clearTotalExclVatCorrected(): PurchaseLineCandidate;

  getTotalVatConfidence(): Confidence | undefined;
  setTotalVatConfidence(value?: Confidence): PurchaseLineCandidate;
  hasTotalVatConfidence(): boolean;
  clearTotalVatConfidence(): PurchaseLineCandidate;

  getTotalVatCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setTotalVatCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasTotalVatCorrected(): boolean;
  clearTotalVatCorrected(): PurchaseLineCandidate;

  getPercentageVatConfidence(): Confidence | undefined;
  setPercentageVatConfidence(value?: Confidence): PurchaseLineCandidate;
  hasPercentageVatConfidence(): boolean;
  clearPercentageVatConfidence(): PurchaseLineCandidate;

  getPercentageVatCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setPercentageVatCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasPercentageVatCorrected(): boolean;
  clearPercentageVatCorrected(): PurchaseLineCandidate;

  getUnitPriceInclVatConfidence(): Confidence | undefined;
  setUnitPriceInclVatConfidence(value?: Confidence): PurchaseLineCandidate;
  hasUnitPriceInclVatConfidence(): boolean;
  clearUnitPriceInclVatConfidence(): PurchaseLineCandidate;

  getUnitPriceInclVatCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setUnitPriceInclVatCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasUnitPriceInclVatCorrected(): boolean;
  clearUnitPriceInclVatCorrected(): PurchaseLineCandidate;

  getUnitPriceExclVatConfidence(): Confidence | undefined;
  setUnitPriceExclVatConfidence(value?: Confidence): PurchaseLineCandidate;
  hasUnitPriceExclVatConfidence(): boolean;
  clearUnitPriceExclVatConfidence(): PurchaseLineCandidate;

  getUnitPriceExclVatCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setUnitPriceExclVatCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasUnitPriceExclVatCorrected(): boolean;
  clearUnitPriceExclVatCorrected(): PurchaseLineCandidate;

  getTotalConfidence(): Confidence | undefined;
  setTotalConfidence(value?: Confidence): PurchaseLineCandidate;
  hasTotalConfidence(): boolean;
  clearTotalConfidence(): PurchaseLineCandidate;

  getTotalCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setTotalCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasTotalCorrected(): boolean;
  clearTotalCorrected(): PurchaseLineCandidate;

  getUnitPriceConfidence(): Confidence | undefined;
  setUnitPriceConfidence(value?: Confidence): PurchaseLineCandidate;
  hasUnitPriceConfidence(): boolean;
  clearUnitPriceConfidence(): PurchaseLineCandidate;

  getUnitPriceCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setUnitPriceCorrected(value?: google_protobuf_wrappers_pb.BoolValue): PurchaseLineCandidate;
  hasUnitPriceCorrected(): boolean;
  clearUnitPriceCorrected(): PurchaseLineCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PurchaseLineCandidate.AsObject;
  static toObject(includeInstance: boolean, msg: PurchaseLineCandidate): PurchaseLineCandidate.AsObject;
  static serializeBinaryToWriter(message: PurchaseLineCandidate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PurchaseLineCandidate;
  static deserializeBinaryFromReader(message: PurchaseLineCandidate, reader: jspb.BinaryReader): PurchaseLineCandidate;
}

export namespace PurchaseLineCandidate {
  export type AsObject = {
    pageRef: number,
    code: string,
    description: string,
    quantity: string,
    itemNumber: string,
    unit: string,
    totalDiscount: string,
    percentageDiscount: string,
    totalInclVat: string,
    totalExclVat: string,
    totalVat: string,
    percentageVat: string,
    unitPriceInclVat: string,
    unitPriceExclVat: string,
    total: string,
    unitPrice: string,
    modelMetadata?: ModelSpec.AsObject,
    codeConfidence?: Confidence.AsObject,
    codeCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    descriptionConfidence?: Confidence.AsObject,
    descriptionCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    quantityConfidence?: Confidence.AsObject,
    quantityCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    itemNumberConfidence?: Confidence.AsObject,
    itemNumberCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    unitConfidence?: Confidence.AsObject,
    unitCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    totalDiscountConfidence?: Confidence.AsObject,
    totalDiscountCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    percentageDiscountConfidence?: Confidence.AsObject,
    percentageDiscountCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    totalInclVatConfidence?: Confidence.AsObject,
    totalInclVatCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    totalExclVatConfidence?: Confidence.AsObject,
    totalExclVatCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    totalVatConfidence?: Confidence.AsObject,
    totalVatCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    percentageVatConfidence?: Confidence.AsObject,
    percentageVatCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    unitPriceInclVatConfidence?: Confidence.AsObject,
    unitPriceInclVatCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    unitPriceExclVatConfidence?: Confidence.AsObject,
    unitPriceExclVatCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    totalConfidence?: Confidence.AsObject,
    totalCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    unitPriceConfidence?: Confidence.AsObject,
    unitPriceCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
  }
}

export class AnswerCandidate extends jspb.Message {
  getQuestion(): string;
  setQuestion(value: string): AnswerCandidate;

  getAnswer(): string;
  setAnswer(value: string): AnswerCandidate;

  getConfidence(): Confidence | undefined;
  setConfidence(value?: Confidence): AnswerCandidate;
  hasConfidence(): boolean;
  clearConfidence(): AnswerCandidate;

  getModelMetadata(): ModelSpec | undefined;
  setModelMetadata(value?: ModelSpec): AnswerCandidate;
  hasModelMetadata(): boolean;
  clearModelMetadata(): AnswerCandidate;

  getPageRef(): number;
  setPageRef(value: number): AnswerCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AnswerCandidate.AsObject;
  static toObject(includeInstance: boolean, msg: AnswerCandidate): AnswerCandidate.AsObject;
  static serializeBinaryToWriter(message: AnswerCandidate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AnswerCandidate;
  static deserializeBinaryFromReader(message: AnswerCandidate, reader: jspb.BinaryReader): AnswerCandidate;
}

export namespace AnswerCandidate {
  export type AsObject = {
    question: string,
    answer: string,
    confidence?: Confidence.AsObject,
    modelMetadata?: ModelSpec.AsObject,
    pageRef: number,
  }
}

export class PageText extends jspb.Message {
  getPageRef(): number;
  setPageRef(value: number): PageText;

  getText(): string;
  setText(value: string): PageText;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PageText.AsObject;
  static toObject(includeInstance: boolean, msg: PageText): PageText.AsObject;
  static serializeBinaryToWriter(message: PageText, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PageText;
  static deserializeBinaryFromReader(message: PageText, reader: jspb.BinaryReader): PageText;
}

export namespace PageText {
  export type AsObject = {
    pageRef: number,
    text: string,
  }
}

export class VatDistributionCandidate extends jspb.Message {
  getPercentage(): string;
  setPercentage(value: string): VatDistributionCandidate;

  getAmount(): string;
  setAmount(value: string): VatDistributionCandidate;

  getModelMetadata(): ModelSpec | undefined;
  setModelMetadata(value?: ModelSpec): VatDistributionCandidate;
  hasModelMetadata(): boolean;
  clearModelMetadata(): VatDistributionCandidate;

  getPageRef(): number;
  setPageRef(value: number): VatDistributionCandidate;

  getExclVat(): string;
  setExclVat(value: string): VatDistributionCandidate;

  getInclVat(): string;
  setInclVat(value: string): VatDistributionCandidate;

  getPercentageConfidence(): Confidence | undefined;
  setPercentageConfidence(value?: Confidence): VatDistributionCandidate;
  hasPercentageConfidence(): boolean;
  clearPercentageConfidence(): VatDistributionCandidate;

  getPercentageCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setPercentageCorrected(value?: google_protobuf_wrappers_pb.BoolValue): VatDistributionCandidate;
  hasPercentageCorrected(): boolean;
  clearPercentageCorrected(): VatDistributionCandidate;

  getAmountConfidence(): Confidence | undefined;
  setAmountConfidence(value?: Confidence): VatDistributionCandidate;
  hasAmountConfidence(): boolean;
  clearAmountConfidence(): VatDistributionCandidate;

  getAmountCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setAmountCorrected(value?: google_protobuf_wrappers_pb.BoolValue): VatDistributionCandidate;
  hasAmountCorrected(): boolean;
  clearAmountCorrected(): VatDistributionCandidate;

  getExclVatConfidence(): Confidence | undefined;
  setExclVatConfidence(value?: Confidence): VatDistributionCandidate;
  hasExclVatConfidence(): boolean;
  clearExclVatConfidence(): VatDistributionCandidate;

  getExclVatCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setExclVatCorrected(value?: google_protobuf_wrappers_pb.BoolValue): VatDistributionCandidate;
  hasExclVatCorrected(): boolean;
  clearExclVatCorrected(): VatDistributionCandidate;

  getInclVatConfidence(): Confidence | undefined;
  setInclVatConfidence(value?: Confidence): VatDistributionCandidate;
  hasInclVatConfidence(): boolean;
  clearInclVatConfidence(): VatDistributionCandidate;

  getInclVatCorrected(): google_protobuf_wrappers_pb.BoolValue | undefined;
  setInclVatCorrected(value?: google_protobuf_wrappers_pb.BoolValue): VatDistributionCandidate;
  hasInclVatCorrected(): boolean;
  clearInclVatCorrected(): VatDistributionCandidate;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): VatDistributionCandidate.AsObject;
  static toObject(includeInstance: boolean, msg: VatDistributionCandidate): VatDistributionCandidate.AsObject;
  static serializeBinaryToWriter(message: VatDistributionCandidate, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): VatDistributionCandidate;
  static deserializeBinaryFromReader(message: VatDistributionCandidate, reader: jspb.BinaryReader): VatDistributionCandidate;
}

export namespace VatDistributionCandidate {
  export type AsObject = {
    percentage: string,
    amount: string,
    modelMetadata?: ModelSpec.AsObject,
    pageRef: number,
    exclVat: string,
    inclVat: string,
    percentageConfidence?: Confidence.AsObject,
    percentageCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    amountConfidence?: Confidence.AsObject,
    amountCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    exclVatConfidence?: Confidence.AsObject,
    exclVatCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
    inclVatConfidence?: Confidence.AsObject,
    inclVatCorrected?: google_protobuf_wrappers_pb.BoolValue.AsObject,
  }
}

export class DocumentMetadata extends jspb.Message {
  getPageCount(): number;
  setPageCount(value: number): DocumentMetadata;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DocumentMetadata.AsObject;
  static toObject(includeInstance: boolean, msg: DocumentMetadata): DocumentMetadata.AsObject;
  static serializeBinaryToWriter(message: DocumentMetadata, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DocumentMetadata;
  static deserializeBinaryFromReader(message: DocumentMetadata, reader: jspb.BinaryReader): DocumentMetadata;
}

export namespace DocumentMetadata {
  export type AsObject = {
    pageCount: number,
  }
}

