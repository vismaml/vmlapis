import * as jspb from 'google-protobuf'



export class DatasetStatistics extends jspb.Message {
  getLexicalDiversitySplitOnSpace(): number;
  setLexicalDiversitySplitOnSpace(value: number): DatasetStatistics;

  getLexicalDiversitySplitOnSpecial(): number;
  setLexicalDiversitySplitOnSpecial(value: number): DatasetStatistics;

  getPercentEmptyStrings(): number;
  setPercentEmptyStrings(value: number): DatasetStatistics;

  getPercentPureNumbersRemoveSpaces(): number;
  setPercentPureNumbersRemoveSpaces(value: number): DatasetStatistics;

  getPercentPureNumbersRemoveSpecial(): number;
  setPercentPureNumbersRemoveSpecial(value: number): DatasetStatistics;

  getPercentSpecialCharacters(): number;
  setPercentSpecialCharacters(value: number): DatasetStatistics;

  getPercentDigits(): number;
  setPercentDigits(value: number): DatasetStatistics;

  getPercentLetters(): number;
  setPercentLetters(value: number): DatasetStatistics;

  getPercentDuplicatesInDataset(): number;
  setPercentDuplicatesInDataset(value: number): DatasetStatistics;

  getMissingDataRatio(): number;
  setMissingDataRatio(value: number): DatasetStatistics;

  getTestSetAvgUnknownTokenRatio(): number;
  setTestSetAvgUnknownTokenRatio(value: number): DatasetStatistics;

  getVocabSize(): number;
  setVocabSize(value: number): DatasetStatistics;

  getAvgUnknownTokenRatio(): number;
  setAvgUnknownTokenRatio(value: number): DatasetStatistics;

  getJsDivergenceTokens(): number;
  setJsDivergenceTokens(value: number): DatasetStatistics;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DatasetStatistics.AsObject;
  static toObject(includeInstance: boolean, msg: DatasetStatistics): DatasetStatistics.AsObject;
  static serializeBinaryToWriter(message: DatasetStatistics, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DatasetStatistics;
  static deserializeBinaryFromReader(message: DatasetStatistics, reader: jspb.BinaryReader): DatasetStatistics;
}

export namespace DatasetStatistics {
  export type AsObject = {
    lexicalDiversitySplitOnSpace: number,
    lexicalDiversitySplitOnSpecial: number,
    percentEmptyStrings: number,
    percentPureNumbersRemoveSpaces: number,
    percentPureNumbersRemoveSpecial: number,
    percentSpecialCharacters: number,
    percentDigits: number,
    percentLetters: number,
    percentDuplicatesInDataset: number,
    missingDataRatio: number,
    testSetAvgUnknownTokenRatio: number,
    vocabSize: number,
    avgUnknownTokenRatio: number,
    jsDivergenceTokens: number,
  }
}

