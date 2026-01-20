import * as jspb from 'google-protobuf'



export class DatasetStatistics extends jspb.Message {
  getLexicalDiversitySplitOnSpace(): number;
  setLexicalDiversitySplitOnSpace(value: number): DatasetStatistics;
  hasLexicalDiversitySplitOnSpace(): boolean;
  clearLexicalDiversitySplitOnSpace(): DatasetStatistics;

  getLexicalDiversitySplitOnSpecial(): number;
  setLexicalDiversitySplitOnSpecial(value: number): DatasetStatistics;
  hasLexicalDiversitySplitOnSpecial(): boolean;
  clearLexicalDiversitySplitOnSpecial(): DatasetStatistics;

  getPercentEmptyStrings(): number;
  setPercentEmptyStrings(value: number): DatasetStatistics;
  hasPercentEmptyStrings(): boolean;
  clearPercentEmptyStrings(): DatasetStatistics;

  getPercentPureNumbersRemoveSpaces(): number;
  setPercentPureNumbersRemoveSpaces(value: number): DatasetStatistics;
  hasPercentPureNumbersRemoveSpaces(): boolean;
  clearPercentPureNumbersRemoveSpaces(): DatasetStatistics;

  getPercentPureNumbersRemoveSpecial(): number;
  setPercentPureNumbersRemoveSpecial(value: number): DatasetStatistics;
  hasPercentPureNumbersRemoveSpecial(): boolean;
  clearPercentPureNumbersRemoveSpecial(): DatasetStatistics;

  getPercentSpecialCharacters(): number;
  setPercentSpecialCharacters(value: number): DatasetStatistics;
  hasPercentSpecialCharacters(): boolean;
  clearPercentSpecialCharacters(): DatasetStatistics;

  getPercentDigits(): number;
  setPercentDigits(value: number): DatasetStatistics;
  hasPercentDigits(): boolean;
  clearPercentDigits(): DatasetStatistics;

  getPercentLetters(): number;
  setPercentLetters(value: number): DatasetStatistics;
  hasPercentLetters(): boolean;
  clearPercentLetters(): DatasetStatistics;

  getPercentDuplicatesInDataset(): number;
  setPercentDuplicatesInDataset(value: number): DatasetStatistics;
  hasPercentDuplicatesInDataset(): boolean;
  clearPercentDuplicatesInDataset(): DatasetStatistics;

  getMissingDataRatio(): number;
  setMissingDataRatio(value: number): DatasetStatistics;
  hasMissingDataRatio(): boolean;
  clearMissingDataRatio(): DatasetStatistics;

  getTestSetAvgUnknownTokenRatio(): number;
  setTestSetAvgUnknownTokenRatio(value: number): DatasetStatistics;
  hasTestSetAvgUnknownTokenRatio(): boolean;
  clearTestSetAvgUnknownTokenRatio(): DatasetStatistics;

  getVocabSize(): number;
  setVocabSize(value: number): DatasetStatistics;
  hasVocabSize(): boolean;
  clearVocabSize(): DatasetStatistics;

  getAvgUnknownTokenRatio(): number;
  setAvgUnknownTokenRatio(value: number): DatasetStatistics;
  hasAvgUnknownTokenRatio(): boolean;
  clearAvgUnknownTokenRatio(): DatasetStatistics;

  getJsDivergenceTokens(): number;
  setJsDivergenceTokens(value: number): DatasetStatistics;
  hasJsDivergenceTokens(): boolean;
  clearJsDivergenceTokens(): DatasetStatistics;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DatasetStatistics.AsObject;
  static toObject(includeInstance: boolean, msg: DatasetStatistics): DatasetStatistics.AsObject;
  static serializeBinaryToWriter(message: DatasetStatistics, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DatasetStatistics;
  static deserializeBinaryFromReader(message: DatasetStatistics, reader: jspb.BinaryReader): DatasetStatistics;
}

export namespace DatasetStatistics {
  export type AsObject = {
    lexicalDiversitySplitOnSpace?: number,
    lexicalDiversitySplitOnSpecial?: number,
    percentEmptyStrings?: number,
    percentPureNumbersRemoveSpaces?: number,
    percentPureNumbersRemoveSpecial?: number,
    percentSpecialCharacters?: number,
    percentDigits?: number,
    percentLetters?: number,
    percentDuplicatesInDataset?: number,
    missingDataRatio?: number,
    testSetAvgUnknownTokenRatio?: number,
    vocabSize?: number,
    avgUnknownTokenRatio?: number,
    jsDivergenceTokens?: number,
  }

  export enum LexicalDiversitySplitOnSpaceCase { 
    _LEXICAL_DIVERSITY_SPLIT_ON_SPACE_NOT_SET = 0,
    LEXICAL_DIVERSITY_SPLIT_ON_SPACE = 2,
  }

  export enum LexicalDiversitySplitOnSpecialCase { 
    _LEXICAL_DIVERSITY_SPLIT_ON_SPECIAL_NOT_SET = 0,
    LEXICAL_DIVERSITY_SPLIT_ON_SPECIAL = 3,
  }

  export enum PercentEmptyStringsCase { 
    _PERCENT_EMPTY_STRINGS_NOT_SET = 0,
    PERCENT_EMPTY_STRINGS = 4,
  }

  export enum PercentPureNumbersRemoveSpacesCase { 
    _PERCENT_PURE_NUMBERS_REMOVE_SPACES_NOT_SET = 0,
    PERCENT_PURE_NUMBERS_REMOVE_SPACES = 5,
  }

  export enum PercentPureNumbersRemoveSpecialCase { 
    _PERCENT_PURE_NUMBERS_REMOVE_SPECIAL_NOT_SET = 0,
    PERCENT_PURE_NUMBERS_REMOVE_SPECIAL = 6,
  }

  export enum PercentSpecialCharactersCase { 
    _PERCENT_SPECIAL_CHARACTERS_NOT_SET = 0,
    PERCENT_SPECIAL_CHARACTERS = 7,
  }

  export enum PercentDigitsCase { 
    _PERCENT_DIGITS_NOT_SET = 0,
    PERCENT_DIGITS = 8,
  }

  export enum PercentLettersCase { 
    _PERCENT_LETTERS_NOT_SET = 0,
    PERCENT_LETTERS = 9,
  }

  export enum PercentDuplicatesInDatasetCase { 
    _PERCENT_DUPLICATES_IN_DATASET_NOT_SET = 0,
    PERCENT_DUPLICATES_IN_DATASET = 10,
  }

  export enum MissingDataRatioCase { 
    _MISSING_DATA_RATIO_NOT_SET = 0,
    MISSING_DATA_RATIO = 16,
  }

  export enum TestSetAvgUnknownTokenRatioCase { 
    _TEST_SET_AVG_UNKNOWN_TOKEN_RATIO_NOT_SET = 0,
    TEST_SET_AVG_UNKNOWN_TOKEN_RATIO = 17,
  }

  export enum VocabSizeCase { 
    _VOCAB_SIZE_NOT_SET = 0,
    VOCAB_SIZE = 18,
  }

  export enum AvgUnknownTokenRatioCase { 
    _AVG_UNKNOWN_TOKEN_RATIO_NOT_SET = 0,
    AVG_UNKNOWN_TOKEN_RATIO = 20,
  }

  export enum JsDivergenceTokensCase { 
    _JS_DIVERGENCE_TOKENS_NOT_SET = 0,
    JS_DIVERGENCE_TOKENS = 22,
  }
}

