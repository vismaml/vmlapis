// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: ssn/scanner/v1alpha1/scanner.proto
//
// For information on using the generated types, please see the documenation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that your are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

public struct Scanner_InternalScanRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var data: Data = SwiftProtobuf.Internal.emptyData

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Scanner_InternalScanResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var ocr: [Ocrservice_OcrScanImageResponse] {
    get {return _storage._ocr}
    set {_uniqueStorage()._ocr = newValue}
  }

  public var ml: Mlservice_MlResponse {
    get {return _storage._ml ?? Mlservice_MlResponse()}
    set {_uniqueStorage()._ml = newValue}
  }
  /// Returns true if `ml` has been explicitly set.
  public var hasMl: Bool {return _storage._ml != nil}
  /// Clears the value of `ml`. Subsequent reads from it will return its default value.
  public mutating func clearMl() {_uniqueStorage()._ml = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

public struct Scanner_Feature {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var type: Scanner_Feature.TypeEnum = .documentFieldDetection

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public enum TypeEnum: SwiftProtobuf.Enum {
    public typealias RawValue = Int
    case documentFieldDetection // = 0
    case rawTextDetection // = 1
    case UNRECOGNIZED(Int)

    public init() {
      self = .documentFieldDetection
    }

    public init?(rawValue: Int) {
      switch rawValue {
      case 0: self = .documentFieldDetection
      case 1: self = .rawTextDetection
      default: self = .UNRECOGNIZED(rawValue)
      }
    }

    public var rawValue: Int {
      switch self {
      case .documentFieldDetection: return 0
      case .rawTextDetection: return 1
      case .UNRECOGNIZED(let i): return i
      }
    }

  }

  public init() {}
}

#if swift(>=4.2)

extension Scanner_Feature.TypeEnum: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  public static var allCases: [Scanner_Feature.TypeEnum] = [
    .documentFieldDetection,
    .rawTextDetection,
  ]
}

#endif  // swift(>=4.2)

public struct Scanner_ScanRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var image: Data = SwiftProtobuf.Internal.emptyData

  public var features: [Scanner_Feature] = []

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Scanner_ScanResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var documentFieldDetection: Mlservice_MlResponse {
    get {return _storage._documentFieldDetection ?? Mlservice_MlResponse()}
    set {_uniqueStorage()._documentFieldDetection = newValue}
  }
  /// Returns true if `documentFieldDetection` has been explicitly set.
  public var hasDocumentFieldDetection: Bool {return _storage._documentFieldDetection != nil}
  /// Clears the value of `documentFieldDetection`. Subsequent reads from it will return its default value.
  public mutating func clearDocumentFieldDetection() {_uniqueStorage()._documentFieldDetection = nil}

  public var rawTextDetection: String {
    get {return _storage._rawTextDetection}
    set {_uniqueStorage()._rawTextDetection = newValue}
  }

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "scanner"

extension Scanner_InternalScanRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".InternalScanRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "data"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularBytesField(value: &self.data)
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.data.isEmpty {
      try visitor.visitSingularBytesField(value: self.data, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Scanner_InternalScanRequest, rhs: Scanner_InternalScanRequest) -> Bool {
    if lhs.data != rhs.data {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Scanner_InternalScanResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".InternalScanResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "ocr"),
    2: .same(proto: "ml"),
  ]

  fileprivate class _StorageClass {
    var _ocr: [Ocrservice_OcrScanImageResponse] = []
    var _ml: Mlservice_MlResponse? = nil

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _ocr = source._ocr
      _ml = source._ml
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeRepeatedMessageField(value: &_storage._ocr)
        case 2: try decoder.decodeSingularMessageField(value: &_storage._ml)
        default: break
        }
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if !_storage._ocr.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._ocr, fieldNumber: 1)
      }
      if let v = _storage._ml {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Scanner_InternalScanResponse, rhs: Scanner_InternalScanResponse) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._ocr != rhs_storage._ocr {return false}
        if _storage._ml != rhs_storage._ml {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Scanner_Feature: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Feature"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "type"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularEnumField(value: &self.type)
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.type != .documentFieldDetection {
      try visitor.visitSingularEnumField(value: self.type, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Scanner_Feature, rhs: Scanner_Feature) -> Bool {
    if lhs.type != rhs.type {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Scanner_Feature.TypeEnum: SwiftProtobuf._ProtoNameProviding {
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "DOCUMENT_FIELD_DETECTION"),
    1: .same(proto: "RAW_TEXT_DETECTION"),
  ]
}

extension Scanner_ScanRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ScanRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "image"),
    2: .same(proto: "features"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularBytesField(value: &self.image)
      case 2: try decoder.decodeRepeatedMessageField(value: &self.features)
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.image.isEmpty {
      try visitor.visitSingularBytesField(value: self.image, fieldNumber: 1)
    }
    if !self.features.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.features, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Scanner_ScanRequest, rhs: Scanner_ScanRequest) -> Bool {
    if lhs.image != rhs.image {return false}
    if lhs.features != rhs.features {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Scanner_ScanResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ScanResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "documentFieldDetection"),
    2: .same(proto: "RawTextDetection"),
  ]

  fileprivate class _StorageClass {
    var _documentFieldDetection: Mlservice_MlResponse? = nil
    var _rawTextDetection: String = String()

    static let defaultInstance = _StorageClass()

    private init() {}

    init(copying source: _StorageClass) {
      _documentFieldDetection = source._documentFieldDetection
      _rawTextDetection = source._rawTextDetection
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        switch fieldNumber {
        case 1: try decoder.decodeSingularMessageField(value: &_storage._documentFieldDetection)
        case 2: try decoder.decodeSingularStringField(value: &_storage._rawTextDetection)
        default: break
        }
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      if let v = _storage._documentFieldDetection {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      }
      if !_storage._rawTextDetection.isEmpty {
        try visitor.visitSingularStringField(value: _storage._rawTextDetection, fieldNumber: 2)
      }
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Scanner_ScanResponse, rhs: Scanner_ScanResponse) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._documentFieldDetection != rhs_storage._documentFieldDetection {return false}
        if _storage._rawTextDetection != rhs_storage._rawTextDetection {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
