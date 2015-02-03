/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.cli.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class TTypeEntry extends org.apache.thrift.TUnion<TTypeEntry, TTypeEntry._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTypeEntry");
  private static final org.apache.thrift.protocol.TField PRIMITIVE_ENTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("primitiveEntry", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ARRAY_ENTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("arrayEntry", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField MAP_ENTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("mapEntry", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField STRUCT_ENTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("structEntry", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField UNION_ENTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("unionEntry", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField USER_DEFINED_TYPE_ENTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("userDefinedTypeEntry", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRIMITIVE_ENTRY((short)1, "primitiveEntry"),
    ARRAY_ENTRY((short)2, "arrayEntry"),
    MAP_ENTRY((short)3, "mapEntry"),
    STRUCT_ENTRY((short)4, "structEntry"),
    UNION_ENTRY((short)5, "unionEntry"),
    USER_DEFINED_TYPE_ENTRY((short)6, "userDefinedTypeEntry");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PRIMITIVE_ENTRY
          return PRIMITIVE_ENTRY;
        case 2: // ARRAY_ENTRY
          return ARRAY_ENTRY;
        case 3: // MAP_ENTRY
          return MAP_ENTRY;
        case 4: // STRUCT_ENTRY
          return STRUCT_ENTRY;
        case 5: // UNION_ENTRY
          return UNION_ENTRY;
        case 6: // USER_DEFINED_TYPE_ENTRY
          return USER_DEFINED_TYPE_ENTRY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRIMITIVE_ENTRY, new org.apache.thrift.meta_data.FieldMetaData("primitiveEntry", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TPrimitiveTypeEntry.class)));
    tmpMap.put(_Fields.ARRAY_ENTRY, new org.apache.thrift.meta_data.FieldMetaData("arrayEntry", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TArrayTypeEntry.class)));
    tmpMap.put(_Fields.MAP_ENTRY, new org.apache.thrift.meta_data.FieldMetaData("mapEntry", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TMapTypeEntry.class)));
    tmpMap.put(_Fields.STRUCT_ENTRY, new org.apache.thrift.meta_data.FieldMetaData("structEntry", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TStructTypeEntry.class)));
    tmpMap.put(_Fields.UNION_ENTRY, new org.apache.thrift.meta_data.FieldMetaData("unionEntry", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TUnionTypeEntry.class)));
    tmpMap.put(_Fields.USER_DEFINED_TYPE_ENTRY, new org.apache.thrift.meta_data.FieldMetaData("userDefinedTypeEntry", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TUserDefinedTypeEntry.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTypeEntry.class, metaDataMap);
  }

  public TTypeEntry() {
    super();
  }

  public TTypeEntry(_Fields setField, Object value) {
    super(setField, value);
  }

  public TTypeEntry(TTypeEntry other) {
    super(other);
  }
  public TTypeEntry deepCopy() {
    return new TTypeEntry(this);
  }

  public static TTypeEntry primitiveEntry(TPrimitiveTypeEntry value) {
    TTypeEntry x = new TTypeEntry();
    x.setPrimitiveEntry(value);
    return x;
  }

  public static TTypeEntry arrayEntry(TArrayTypeEntry value) {
    TTypeEntry x = new TTypeEntry();
    x.setArrayEntry(value);
    return x;
  }

  public static TTypeEntry mapEntry(TMapTypeEntry value) {
    TTypeEntry x = new TTypeEntry();
    x.setMapEntry(value);
    return x;
  }

  public static TTypeEntry structEntry(TStructTypeEntry value) {
    TTypeEntry x = new TTypeEntry();
    x.setStructEntry(value);
    return x;
  }

  public static TTypeEntry unionEntry(TUnionTypeEntry value) {
    TTypeEntry x = new TTypeEntry();
    x.setUnionEntry(value);
    return x;
  }

  public static TTypeEntry userDefinedTypeEntry(TUserDefinedTypeEntry value) {
    TTypeEntry x = new TTypeEntry();
    x.setUserDefinedTypeEntry(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case PRIMITIVE_ENTRY:
        if (value instanceof TPrimitiveTypeEntry) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TPrimitiveTypeEntry for field 'primitiveEntry', but got " + value.getClass().getSimpleName());
      case ARRAY_ENTRY:
        if (value instanceof TArrayTypeEntry) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TArrayTypeEntry for field 'arrayEntry', but got " + value.getClass().getSimpleName());
      case MAP_ENTRY:
        if (value instanceof TMapTypeEntry) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TMapTypeEntry for field 'mapEntry', but got " + value.getClass().getSimpleName());
      case STRUCT_ENTRY:
        if (value instanceof TStructTypeEntry) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TStructTypeEntry for field 'structEntry', but got " + value.getClass().getSimpleName());
      case UNION_ENTRY:
        if (value instanceof TUnionTypeEntry) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TUnionTypeEntry for field 'unionEntry', but got " + value.getClass().getSimpleName());
      case USER_DEFINED_TYPE_ENTRY:
        if (value instanceof TUserDefinedTypeEntry) {
          break;
        }
        throw new ClassCastException("Was expecting value of type TUserDefinedTypeEntry for field 'userDefinedTypeEntry', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case PRIMITIVE_ENTRY:
          if (field.type == PRIMITIVE_ENTRY_FIELD_DESC.type) {
            TPrimitiveTypeEntry primitiveEntry;
            primitiveEntry = new TPrimitiveTypeEntry();
            primitiveEntry.read(iprot);
            return primitiveEntry;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case ARRAY_ENTRY:
          if (field.type == ARRAY_ENTRY_FIELD_DESC.type) {
            TArrayTypeEntry arrayEntry;
            arrayEntry = new TArrayTypeEntry();
            arrayEntry.read(iprot);
            return arrayEntry;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case MAP_ENTRY:
          if (field.type == MAP_ENTRY_FIELD_DESC.type) {
            TMapTypeEntry mapEntry;
            mapEntry = new TMapTypeEntry();
            mapEntry.read(iprot);
            return mapEntry;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRUCT_ENTRY:
          if (field.type == STRUCT_ENTRY_FIELD_DESC.type) {
            TStructTypeEntry structEntry;
            structEntry = new TStructTypeEntry();
            structEntry.read(iprot);
            return structEntry;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case UNION_ENTRY:
          if (field.type == UNION_ENTRY_FIELD_DESC.type) {
            TUnionTypeEntry unionEntry;
            unionEntry = new TUnionTypeEntry();
            unionEntry.read(iprot);
            return unionEntry;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case USER_DEFINED_TYPE_ENTRY:
          if (field.type == USER_DEFINED_TYPE_ENTRY_FIELD_DESC.type) {
            TUserDefinedTypeEntry userDefinedTypeEntry;
            userDefinedTypeEntry = new TUserDefinedTypeEntry();
            userDefinedTypeEntry.read(iprot);
            return userDefinedTypeEntry;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PRIMITIVE_ENTRY:
        TPrimitiveTypeEntry primitiveEntry = (TPrimitiveTypeEntry)value_;
        primitiveEntry.write(oprot);
        return;
      case ARRAY_ENTRY:
        TArrayTypeEntry arrayEntry = (TArrayTypeEntry)value_;
        arrayEntry.write(oprot);
        return;
      case MAP_ENTRY:
        TMapTypeEntry mapEntry = (TMapTypeEntry)value_;
        mapEntry.write(oprot);
        return;
      case STRUCT_ENTRY:
        TStructTypeEntry structEntry = (TStructTypeEntry)value_;
        structEntry.write(oprot);
        return;
      case UNION_ENTRY:
        TUnionTypeEntry unionEntry = (TUnionTypeEntry)value_;
        unionEntry.write(oprot);
        return;
      case USER_DEFINED_TYPE_ENTRY:
        TUserDefinedTypeEntry userDefinedTypeEntry = (TUserDefinedTypeEntry)value_;
        userDefinedTypeEntry.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case PRIMITIVE_ENTRY:
          TPrimitiveTypeEntry primitiveEntry;
          primitiveEntry = new TPrimitiveTypeEntry();
          primitiveEntry.read(iprot);
          return primitiveEntry;
        case ARRAY_ENTRY:
          TArrayTypeEntry arrayEntry;
          arrayEntry = new TArrayTypeEntry();
          arrayEntry.read(iprot);
          return arrayEntry;
        case MAP_ENTRY:
          TMapTypeEntry mapEntry;
          mapEntry = new TMapTypeEntry();
          mapEntry.read(iprot);
          return mapEntry;
        case STRUCT_ENTRY:
          TStructTypeEntry structEntry;
          structEntry = new TStructTypeEntry();
          structEntry.read(iprot);
          return structEntry;
        case UNION_ENTRY:
          TUnionTypeEntry unionEntry;
          unionEntry = new TUnionTypeEntry();
          unionEntry.read(iprot);
          return unionEntry;
        case USER_DEFINED_TYPE_ENTRY:
          TUserDefinedTypeEntry userDefinedTypeEntry;
          userDefinedTypeEntry = new TUserDefinedTypeEntry();
          userDefinedTypeEntry.read(iprot);
          return userDefinedTypeEntry;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PRIMITIVE_ENTRY:
        TPrimitiveTypeEntry primitiveEntry = (TPrimitiveTypeEntry)value_;
        primitiveEntry.write(oprot);
        return;
      case ARRAY_ENTRY:
        TArrayTypeEntry arrayEntry = (TArrayTypeEntry)value_;
        arrayEntry.write(oprot);
        return;
      case MAP_ENTRY:
        TMapTypeEntry mapEntry = (TMapTypeEntry)value_;
        mapEntry.write(oprot);
        return;
      case STRUCT_ENTRY:
        TStructTypeEntry structEntry = (TStructTypeEntry)value_;
        structEntry.write(oprot);
        return;
      case UNION_ENTRY:
        TUnionTypeEntry unionEntry = (TUnionTypeEntry)value_;
        unionEntry.write(oprot);
        return;
      case USER_DEFINED_TYPE_ENTRY:
        TUserDefinedTypeEntry userDefinedTypeEntry = (TUserDefinedTypeEntry)value_;
        userDefinedTypeEntry.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case PRIMITIVE_ENTRY:
        return PRIMITIVE_ENTRY_FIELD_DESC;
      case ARRAY_ENTRY:
        return ARRAY_ENTRY_FIELD_DESC;
      case MAP_ENTRY:
        return MAP_ENTRY_FIELD_DESC;
      case STRUCT_ENTRY:
        return STRUCT_ENTRY_FIELD_DESC;
      case UNION_ENTRY:
        return UNION_ENTRY_FIELD_DESC;
      case USER_DEFINED_TYPE_ENTRY:
        return USER_DEFINED_TYPE_ENTRY_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public TPrimitiveTypeEntry getPrimitiveEntry() {
    if (getSetField() == _Fields.PRIMITIVE_ENTRY) {
      return (TPrimitiveTypeEntry)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'primitiveEntry' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPrimitiveEntry(TPrimitiveTypeEntry value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.PRIMITIVE_ENTRY;
    value_ = value;
  }

  public TArrayTypeEntry getArrayEntry() {
    if (getSetField() == _Fields.ARRAY_ENTRY) {
      return (TArrayTypeEntry)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'arrayEntry' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setArrayEntry(TArrayTypeEntry value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.ARRAY_ENTRY;
    value_ = value;
  }

  public TMapTypeEntry getMapEntry() {
    if (getSetField() == _Fields.MAP_ENTRY) {
      return (TMapTypeEntry)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'mapEntry' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMapEntry(TMapTypeEntry value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.MAP_ENTRY;
    value_ = value;
  }

  public TStructTypeEntry getStructEntry() {
    if (getSetField() == _Fields.STRUCT_ENTRY) {
      return (TStructTypeEntry)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'structEntry' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStructEntry(TStructTypeEntry value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STRUCT_ENTRY;
    value_ = value;
  }

  public TUnionTypeEntry getUnionEntry() {
    if (getSetField() == _Fields.UNION_ENTRY) {
      return (TUnionTypeEntry)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'unionEntry' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setUnionEntry(TUnionTypeEntry value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.UNION_ENTRY;
    value_ = value;
  }

  public TUserDefinedTypeEntry getUserDefinedTypeEntry() {
    if (getSetField() == _Fields.USER_DEFINED_TYPE_ENTRY) {
      return (TUserDefinedTypeEntry)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'userDefinedTypeEntry' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setUserDefinedTypeEntry(TUserDefinedTypeEntry value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.USER_DEFINED_TYPE_ENTRY;
    value_ = value;
  }

  public boolean isSetPrimitiveEntry() {
    return setField_ == _Fields.PRIMITIVE_ENTRY;
  }


  public boolean isSetArrayEntry() {
    return setField_ == _Fields.ARRAY_ENTRY;
  }


  public boolean isSetMapEntry() {
    return setField_ == _Fields.MAP_ENTRY;
  }


  public boolean isSetStructEntry() {
    return setField_ == _Fields.STRUCT_ENTRY;
  }


  public boolean isSetUnionEntry() {
    return setField_ == _Fields.UNION_ENTRY;
  }


  public boolean isSetUserDefinedTypeEntry() {
    return setField_ == _Fields.USER_DEFINED_TYPE_ENTRY;
  }


  public boolean equals(Object other) {
    if (other instanceof TTypeEntry) {
      return equals((TTypeEntry)other);
    } else {
      return false;
    }
  }

  public boolean equals(TTypeEntry other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(TTypeEntry other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
