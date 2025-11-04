import * as jspb from 'google-protobuf'



export class RasterizePdfRequest extends jspb.Message {
  getData(): Uint8Array | string;
  getData_asU8(): Uint8Array;
  getData_asB64(): string;
  setData(value: Uint8Array | string): RasterizePdfRequest;

  getDpi(): number;
  setDpi(value: number): RasterizePdfRequest;

  getFormat(): RasterizePdfRequest.Format;
  setFormat(value: RasterizePdfRequest.Format): RasterizePdfRequest;

  getColor(): RasterizePdfRequest.ColorSpace;
  setColor(value: RasterizePdfRequest.ColorSpace): RasterizePdfRequest;

  getPages(): RasterizePdfRequest.PageOption;
  setPages(value: RasterizePdfRequest.PageOption): RasterizePdfRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RasterizePdfRequest.AsObject;
  static toObject(includeInstance: boolean, msg: RasterizePdfRequest): RasterizePdfRequest.AsObject;
  static serializeBinaryToWriter(message: RasterizePdfRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RasterizePdfRequest;
  static deserializeBinaryFromReader(message: RasterizePdfRequest, reader: jspb.BinaryReader): RasterizePdfRequest;
}

export namespace RasterizePdfRequest {
  export type AsObject = {
    data: Uint8Array | string,
    dpi: number,
    format: RasterizePdfRequest.Format,
    color: RasterizePdfRequest.ColorSpace,
    pages: RasterizePdfRequest.PageOption,
  }

  export enum Format { 
    PNG = 0,
    JPEG = 1,
    WEBP = 2,
  }

  export enum ColorSpace { 
    GRAY = 0,
    COLOR = 1,
  }

  export enum PageOption { 
    FIRST_LAST = 0,
    FIRST = 1,
    LAST = 2,
    ALL = 3,
    FIRST_FIVE = 4,
    FIRST_FIVE_AND_LAST = 5,
  }
}

export class RasterizePdfResponse extends jspb.Message {
  getIndex(): number;
  setIndex(value: number): RasterizePdfResponse;

  getData(): Uint8Array | string;
  getData_asU8(): Uint8Array;
  getData_asB64(): string;
  setData(value: Uint8Array | string): RasterizePdfResponse;

  getWidth(): number;
  setWidth(value: number): RasterizePdfResponse;

  getHeight(): number;
  setHeight(value: number): RasterizePdfResponse;

  getScale(): number;
  setScale(value: number): RasterizePdfResponse;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): RasterizePdfResponse.AsObject;
  static toObject(includeInstance: boolean, msg: RasterizePdfResponse): RasterizePdfResponse.AsObject;
  static serializeBinaryToWriter(message: RasterizePdfResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): RasterizePdfResponse;
  static deserializeBinaryFromReader(message: RasterizePdfResponse, reader: jspb.BinaryReader): RasterizePdfResponse;
}

export namespace RasterizePdfResponse {
  export type AsObject = {
    index: number,
    data: Uint8Array | string,
    width: number,
    height: number,
    scale: number,
  }
}

