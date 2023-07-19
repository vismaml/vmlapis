# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ssn/type/text_annotation.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from vml_proto.ssn.type import geometry_pb2 as ssn_dot_type_dot_geometry__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1essn/type/text_annotation.proto\x12\x08ssn.type\x1a\x17ssn/type/geometry.proto\"\xb7\x04\n\x0eTextAnnotation\x12$\n\x05pages\x18\x01 \x03(\x0b\x32\x0e.ssn.type.PageR\x05pages\x12\x12\n\x04text\x18\x02 \x01(\tR\x04text\x1aW\n\x10\x44\x65tectedLanguage\x12#\n\rlanguage_code\x18\x01 \x01(\tR\x0clanguageCode\x12\x1e\n\nconfidence\x18\x02 \x01(\x02R\nconfidence\x1a\xd7\x01\n\rDetectedBreak\x12\x44\n\x04type\x18\x01 \x01(\x0e\x32\x30.ssn.type.TextAnnotation.DetectedBreak.BreakTypeR\x04type\x12\x1b\n\tis_prefix\x18\x02 \x01(\x08R\x08isPrefix\"c\n\tBreakType\x12\x0b\n\x07UNKNOWN\x10\x00\x12\t\n\x05SPACE\x10\x01\x12\x0e\n\nSURE_SPACE\x10\x02\x12\x12\n\x0e\x45OL_SURE_SPACE\x10\x03\x12\n\n\x06HYPHEN\x10\x04\x12\x0e\n\nLINE_BREAK\x10\x05\x1a\xb7\x01\n\x0cTextProperty\x12X\n\x12\x64\x65tected_languages\x18\x01 \x03(\x0b\x32).ssn.type.TextAnnotation.DetectedLanguageR\x11\x64\x65tectedLanguages\x12M\n\x0e\x64\x65tected_break\x18\x02 \x01(\x0b\x32&.ssn.type.TextAnnotation.DetectedBreakR\rdetectedBreak\"\xc0\x01\n\x04Page\x12\x41\n\x08property\x18\x01 \x01(\x0b\x32%.ssn.type.TextAnnotation.TextPropertyR\x08property\x12\x14\n\x05width\x18\x02 \x01(\x05R\x05width\x12\x16\n\x06height\x18\x03 \x01(\x05R\x06height\x12\'\n\x06\x62locks\x18\x04 \x03(\x0b\x32\x0f.ssn.type.BlockR\x06\x62locks\x12\x1e\n\nconfidence\x18\x05 \x01(\x02R\nconfidence\"\xe8\x02\n\x05\x42lock\x12\x41\n\x08property\x18\x01 \x01(\x0b\x32%.ssn.type.TextAnnotation.TextPropertyR\x08property\x12\x39\n\x0c\x62ounding_box\x18\x02 \x01(\x0b\x32\x16.ssn.type.BoundingPolyR\x0b\x62oundingBox\x12\x33\n\nparagraphs\x18\x03 \x03(\x0b\x32\x13.ssn.type.ParagraphR\nparagraphs\x12\x38\n\nblock_type\x18\x04 \x01(\x0e\x32\x19.ssn.type.Block.BlockTypeR\tblockType\x12\x1e\n\nconfidence\x18\x05 \x01(\x02R\nconfidence\"R\n\tBlockType\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x08\n\x04TEXT\x10\x01\x12\t\n\x05TABLE\x10\x02\x12\x0b\n\x07PICTURE\x10\x03\x12\t\n\x05RULER\x10\x04\x12\x0b\n\x07\x42\x41RCODE\x10\x05\"\xcf\x01\n\tParagraph\x12\x41\n\x08property\x18\x01 \x01(\x0b\x32%.ssn.type.TextAnnotation.TextPropertyR\x08property\x12\x39\n\x0c\x62ounding_box\x18\x02 \x01(\x0b\x32\x16.ssn.type.BoundingPolyR\x0b\x62oundingBox\x12$\n\x05words\x18\x03 \x03(\x0b\x32\x0e.ssn.type.WordR\x05words\x12\x1e\n\nconfidence\x18\x04 \x01(\x02R\nconfidence\"\xd0\x01\n\x04Word\x12\x41\n\x08property\x18\x01 \x01(\x0b\x32%.ssn.type.TextAnnotation.TextPropertyR\x08property\x12\x39\n\x0c\x62ounding_box\x18\x02 \x01(\x0b\x32\x16.ssn.type.BoundingPolyR\x0b\x62oundingBox\x12*\n\x07symbols\x18\x03 \x03(\x0b\x32\x10.ssn.type.SymbolR\x07symbols\x12\x1e\n\nconfidence\x18\x04 \x01(\x02R\nconfidence\"\xba\x01\n\x06Symbol\x12\x41\n\x08property\x18\x01 \x01(\x0b\x32%.ssn.type.TextAnnotation.TextPropertyR\x08property\x12\x39\n\x0c\x62ounding_box\x18\x02 \x01(\x0b\x32\x16.ssn.type.BoundingPolyR\x0b\x62oundingBox\x12\x12\n\x04text\x18\x03 \x01(\tR\x04text\x12\x1e\n\nconfidence\x18\x04 \x01(\x02R\nconfidenceB6Z4github.com/e-conomic/vmlapis/gen/go/ssn/type;ssntypeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ssn.type.text_annotation_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z4github.com/e-conomic/vmlapis/gen/go/ssn/type;ssntype'
  _globals['_TEXTANNOTATION']._serialized_start=70
  _globals['_TEXTANNOTATION']._serialized_end=637
  _globals['_TEXTANNOTATION_DETECTEDLANGUAGE']._serialized_start=146
  _globals['_TEXTANNOTATION_DETECTEDLANGUAGE']._serialized_end=233
  _globals['_TEXTANNOTATION_DETECTEDBREAK']._serialized_start=236
  _globals['_TEXTANNOTATION_DETECTEDBREAK']._serialized_end=451
  _globals['_TEXTANNOTATION_DETECTEDBREAK_BREAKTYPE']._serialized_start=352
  _globals['_TEXTANNOTATION_DETECTEDBREAK_BREAKTYPE']._serialized_end=451
  _globals['_TEXTANNOTATION_TEXTPROPERTY']._serialized_start=454
  _globals['_TEXTANNOTATION_TEXTPROPERTY']._serialized_end=637
  _globals['_PAGE']._serialized_start=640
  _globals['_PAGE']._serialized_end=832
  _globals['_BLOCK']._serialized_start=835
  _globals['_BLOCK']._serialized_end=1195
  _globals['_BLOCK_BLOCKTYPE']._serialized_start=1113
  _globals['_BLOCK_BLOCKTYPE']._serialized_end=1195
  _globals['_PARAGRAPH']._serialized_start=1198
  _globals['_PARAGRAPH']._serialized_end=1405
  _globals['_WORD']._serialized_start=1408
  _globals['_WORD']._serialized_end=1616
  _globals['_SYMBOL']._serialized_start=1619
  _globals['_SYMBOL']._serialized_end=1805
# @@protoc_insertion_point(module_scope)
