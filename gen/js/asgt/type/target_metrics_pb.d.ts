import * as jspb from 'google-protobuf'



export class TargetMetrics extends jspb.Message {
  getTarget(): string;
  setTarget(value: string): TargetMetrics;

  getMetricsList(): Array<TargetMetrics.Metric>;
  setMetricsList(value: Array<TargetMetrics.Metric>): TargetMetrics;
  clearMetricsList(): TargetMetrics;
  addMetrics(value?: TargetMetrics.Metric, index?: number): TargetMetrics.Metric;

  getEntropy(): number;
  setEntropy(value: number): TargetMetrics;
  hasEntropy(): boolean;
  clearEntropy(): TargetMetrics;

  getNumberOfClasses(): number;
  setNumberOfClasses(value: number): TargetMetrics;
  hasNumberOfClasses(): boolean;
  clearNumberOfClasses(): TargetMetrics;

  getAvgSamplePerClass(): number;
  setAvgSamplePerClass(value: number): TargetMetrics;
  hasAvgSamplePerClass(): boolean;
  clearAvgSamplePerClass(): TargetMetrics;

  getInconsistentLabelRatio(): number;
  setInconsistentLabelRatio(value: number): TargetMetrics;
  hasInconsistentLabelRatio(): boolean;
  clearInconsistentLabelRatio(): TargetMetrics;

  getAvgLabelsPerInconsistentSample(): number;
  setAvgLabelsPerInconsistentSample(value: number): TargetMetrics;
  hasAvgLabelsPerInconsistentSample(): boolean;
  clearAvgLabelsPerInconsistentSample(): TargetMetrics;

  getPercentSamplesNotInTargetVocab(): number;
  setPercentSamplesNotInTargetVocab(value: number): TargetMetrics;
  hasPercentSamplesNotInTargetVocab(): boolean;
  clearPercentSamplesNotInTargetVocab(): TargetMetrics;

  getJsDivergenceClasses(): number;
  setJsDivergenceClasses(value: number): TargetMetrics;
  hasJsDivergenceClasses(): boolean;
  clearJsDivergenceClasses(): TargetMetrics;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): TargetMetrics.AsObject;
  static toObject(includeInstance: boolean, msg: TargetMetrics): TargetMetrics.AsObject;
  static serializeBinaryToWriter(message: TargetMetrics, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): TargetMetrics;
  static deserializeBinaryFromReader(message: TargetMetrics, reader: jspb.BinaryReader): TargetMetrics;
}

export namespace TargetMetrics {
  export type AsObject = {
    target: string,
    metricsList: Array<TargetMetrics.Metric.AsObject>,
    entropy?: number,
    numberOfClasses?: number,
    avgSamplePerClass?: number,
    inconsistentLabelRatio?: number,
    avgLabelsPerInconsistentSample?: number,
    percentSamplesNotInTargetVocab?: number,
    jsDivergenceClasses?: number,
  }

  export class Metric extends jspb.Message {
    getPrecision(): number;
    setPrecision(value: number): Metric;

    getConfidence(): number;
    setConfidence(value: number): Metric;

    getAnswerRate(): number;
    setAnswerRate(value: number): Metric;

    getTruePositive(): number;
    setTruePositive(value: number): Metric;

    getTrueNegative(): number;
    setTrueNegative(value: number): Metric;

    getFalsePositive(): number;
    setFalsePositive(value: number): Metric;

    getFalseNegative(): number;
    setFalseNegative(value: number): Metric;

    getMcc(): number;
    setMcc(value: number): Metric;

    getAccuracy(): number;
    setAccuracy(value: number): Metric;

    getBalancedAccuracy(): number;
    setBalancedAccuracy(value: number): Metric;

    getPrecisionBoundEpsilon(): number;
    setPrecisionBoundEpsilon(value: number): Metric;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): Metric.AsObject;
    static toObject(includeInstance: boolean, msg: Metric): Metric.AsObject;
    static serializeBinaryToWriter(message: Metric, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): Metric;
    static deserializeBinaryFromReader(message: Metric, reader: jspb.BinaryReader): Metric;
  }

  export namespace Metric {
    export type AsObject = {
      precision: number,
      confidence: number,
      answerRate: number,
      truePositive: number,
      trueNegative: number,
      falsePositive: number,
      falseNegative: number,
      mcc: number,
      accuracy: number,
      balancedAccuracy: number,
      precisionBoundEpsilon: number,
    }
  }


  export enum EntropyCase { 
    _ENTROPY_NOT_SET = 0,
    ENTROPY = 6,
  }

  export enum NumberOfClassesCase { 
    _NUMBER_OF_CLASSES_NOT_SET = 0,
    NUMBER_OF_CLASSES = 7,
  }

  export enum AvgSamplePerClassCase { 
    _AVG_SAMPLE_PER_CLASS_NOT_SET = 0,
    AVG_SAMPLE_PER_CLASS = 8,
  }

  export enum InconsistentLabelRatioCase { 
    _INCONSISTENT_LABEL_RATIO_NOT_SET = 0,
    INCONSISTENT_LABEL_RATIO = 9,
  }

  export enum AvgLabelsPerInconsistentSampleCase { 
    _AVG_LABELS_PER_INCONSISTENT_SAMPLE_NOT_SET = 0,
    AVG_LABELS_PER_INCONSISTENT_SAMPLE = 10,
  }

  export enum PercentSamplesNotInTargetVocabCase { 
    _PERCENT_SAMPLES_NOT_IN_TARGET_VOCAB_NOT_SET = 0,
    PERCENT_SAMPLES_NOT_IN_TARGET_VOCAB = 11,
  }

  export enum JsDivergenceClassesCase { 
    _JS_DIVERGENCE_CLASSES_NOT_SET = 0,
    JS_DIVERGENCE_CLASSES = 12,
  }
}

