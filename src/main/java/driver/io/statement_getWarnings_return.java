/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package driver.io;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class statement_getWarnings_return implements org.apache.thrift.TBase<statement_getWarnings_return, statement_getWarnings_return._Fields>, java.io.Serializable, Cloneable, Comparable<statement_getWarnings_return> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("statement_getWarnings_return");

  private static final org.apache.thrift.protocol.TField WARNINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("warnings", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new statement_getWarnings_returnStandardSchemeFactory());
    schemes.put(TupleScheme.class, new statement_getWarnings_returnTupleSchemeFactory());
  }

  public List<CCSQLWarning> warnings; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WARNINGS((short)1, "warnings");

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
        case 1: // WARNINGS
          return WARNINGS;
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

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WARNINGS, new org.apache.thrift.meta_data.FieldMetaData("warnings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CCSQLWarning.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(statement_getWarnings_return.class, metaDataMap);
  }

  public statement_getWarnings_return() {
  }

  public statement_getWarnings_return(
    List<CCSQLWarning> warnings)
  {
    this();
    this.warnings = warnings;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public statement_getWarnings_return(statement_getWarnings_return other) {
    if (other.isSetWarnings()) {
      List<CCSQLWarning> __this__warnings = new ArrayList<CCSQLWarning>(other.warnings.size());
      for (CCSQLWarning other_element : other.warnings) {
        __this__warnings.add(new CCSQLWarning(other_element));
      }
      this.warnings = __this__warnings;
    }
  }

  public statement_getWarnings_return deepCopy() {
    return new statement_getWarnings_return(this);
  }

  @Override
  public void clear() {
    this.warnings = null;
  }

  public int getWarningsSize() {
    return (this.warnings == null) ? 0 : this.warnings.size();
  }

  public java.util.Iterator<CCSQLWarning> getWarningsIterator() {
    return (this.warnings == null) ? null : this.warnings.iterator();
  }

  public void addToWarnings(CCSQLWarning elem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<CCSQLWarning>();
    }
    this.warnings.add(elem);
  }

  public List<CCSQLWarning> getWarnings() {
    return this.warnings;
  }

  public statement_getWarnings_return setWarnings(List<CCSQLWarning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public void unsetWarnings() {
    this.warnings = null;
  }

  /** Returns true if field warnings is set (has been assigned a value) and false otherwise */
  public boolean isSetWarnings() {
    return this.warnings != null;
  }

  public void setWarningsIsSet(boolean value) {
    if (!value) {
      this.warnings = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WARNINGS:
      if (value == null) {
        unsetWarnings();
      } else {
        setWarnings((List<CCSQLWarning>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WARNINGS:
      return getWarnings();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WARNINGS:
      return isSetWarnings();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof statement_getWarnings_return)
      return this.equals((statement_getWarnings_return)that);
    return false;
  }

  public boolean equals(statement_getWarnings_return that) {
    if (that == null)
      return false;

    boolean this_present_warnings = true && this.isSetWarnings();
    boolean that_present_warnings = true && that.isSetWarnings();
    if (this_present_warnings || that_present_warnings) {
      if (!(this_present_warnings && that_present_warnings))
        return false;
      if (!this.warnings.equals(that.warnings))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(statement_getWarnings_return other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWarnings()).compareTo(other.isSetWarnings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWarnings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.warnings, other.warnings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("statement_getWarnings_return(");
    boolean first = true;

    sb.append("warnings:");
    if (this.warnings == null) {
      sb.append("null");
    } else {
      sb.append(this.warnings);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class statement_getWarnings_returnStandardSchemeFactory implements SchemeFactory {
    public statement_getWarnings_returnStandardScheme getScheme() {
      return new statement_getWarnings_returnStandardScheme();
    }
  }

  private static class statement_getWarnings_returnStandardScheme extends StandardScheme<statement_getWarnings_return> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, statement_getWarnings_return struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WARNINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.warnings = new ArrayList<CCSQLWarning>(_list24.size);
                for (int _i25 = 0; _i25 < _list24.size; ++_i25)
                {
                  CCSQLWarning _elem26;
                  _elem26 = new CCSQLWarning();
                  _elem26.read(iprot);
                  struct.warnings.add(_elem26);
                }
                iprot.readListEnd();
              }
              struct.setWarningsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, statement_getWarnings_return struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.warnings != null) {
        oprot.writeFieldBegin(WARNINGS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.warnings.size()));
          for (CCSQLWarning _iter27 : struct.warnings)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class statement_getWarnings_returnTupleSchemeFactory implements SchemeFactory {
    public statement_getWarnings_returnTupleScheme getScheme() {
      return new statement_getWarnings_returnTupleScheme();
    }
  }

  private static class statement_getWarnings_returnTupleScheme extends TupleScheme<statement_getWarnings_return> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, statement_getWarnings_return struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetWarnings()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetWarnings()) {
        {
          oprot.writeI32(struct.warnings.size());
          for (CCSQLWarning _iter28 : struct.warnings)
          {
            _iter28.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, statement_getWarnings_return struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.warnings = new ArrayList<CCSQLWarning>(_list29.size);
          for (int _i30 = 0; _i30 < _list29.size; ++_i30)
          {
            CCSQLWarning _elem31;
            _elem31 = new CCSQLWarning();
            _elem31.read(iprot);
            struct.warnings.add(_elem31);
          }
        }
        struct.setWarningsIsSet(true);
      }
    }
  }

}

