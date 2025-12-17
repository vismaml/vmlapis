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

  getEntropy(): number;
  setEntropy(value: number): DatasetStatistics;

  getNumberOfClasses(): number;
  setNumberOfClasses(value: number): DatasetStatistics;

  getAvgSamplePerClass(): number;
  setAvgSamplePerClass(value: number): DatasetStatistics;

  getInconsistentLabelRatio(): number;
  setInconsistentLabelRatio(value: number): DatasetStatistics;

  getAvgLabelsPerInconsistentSample(): number;
  setAvgLabelsPerInconsistentSample(value: number): DatasetStatistics;

  getMissingDataRatio(): number;
  setMissingDataRatio(value: number): DatasetStatistics;

  getTestSetAvgUnknownTokenRatio(): number;
  setTestSetAvgUnknownTokenRatio(value: number): DatasetStatistics;

  getVocabSize(): number;
  setVocabSize(value: number): DatasetStatistics;

  getPercentSamplesNotInTargetVocab(): number;
  setPercentSamplesNotInTargetVocab(value: number): DatasetStatistics;

  getAvgUnknownTokenRatio(): number;
  setAvgUnknownTokenRatio(value: number): DatasetStatistics;

  getJsDivergenceClasses(): number;
  setJsDivergenceClasses(value: number): DatasetStatistics;

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
    entropy: number,
    numberOfClasses: number,
    avgSamplePerClass: number,
    inconsistentLabelRatio: number,
    avgLabelsPerInconsistentSample: number,
    missingDataRatio: number,
    testSetAvgUnknownTokenRatio: number,
    vocabSize: number,
    percentSamplesNotInTargetVocab: number,
    avgUnknownTokenRatio: number,
    jsDivergenceClasses: number,
    jsDivergenceTokens: number,
  }
}

