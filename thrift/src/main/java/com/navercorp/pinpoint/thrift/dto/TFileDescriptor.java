/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)", date = "2022-06-30")
public class TFileDescriptor implements org.apache.thrift.TBase<TFileDescriptor, TFileDescriptor._Fields>, java.io.Serializable, Cloneable, Comparable<TFileDescriptor> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFileDescriptor");

  private static final org.apache.thrift.protocol.TField OPEN_FILE_DESCRIPTOR_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("openFileDescriptorCount", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TFileDescriptorStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TFileDescriptorTupleSchemeFactory();

  private long openFileDescriptorCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPEN_FILE_DESCRIPTOR_COUNT((short)1, "openFileDescriptorCount");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OPEN_FILE_DESCRIPTOR_COUNT
          return OPEN_FILE_DESCRIPTOR_COUNT;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __OPENFILEDESCRIPTORCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPEN_FILE_DESCRIPTOR_COUNT, new org.apache.thrift.meta_data.FieldMetaData("openFileDescriptorCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFileDescriptor.class, metaDataMap);
  }

  public TFileDescriptor() {
  }

  public TFileDescriptor(
    long openFileDescriptorCount)
  {
    this();
    this.openFileDescriptorCount = openFileDescriptorCount;
    setOpenFileDescriptorCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFileDescriptor(TFileDescriptor other) {
    __isset_bitfield = other.__isset_bitfield;
    this.openFileDescriptorCount = other.openFileDescriptorCount;
  }

  public TFileDescriptor deepCopy() {
    return new TFileDescriptor(this);
  }

  @Override
  public void clear() {
    setOpenFileDescriptorCountIsSet(false);
    this.openFileDescriptorCount = 0;
  }

  public long getOpenFileDescriptorCount() {
    return this.openFileDescriptorCount;
  }

  public void setOpenFileDescriptorCount(long openFileDescriptorCount) {
    this.openFileDescriptorCount = openFileDescriptorCount;
    setOpenFileDescriptorCountIsSet(true);
  }

  public void unsetOpenFileDescriptorCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __OPENFILEDESCRIPTORCOUNT_ISSET_ID);
  }

  /** Returns true if field openFileDescriptorCount is set (has been assigned a value) and false otherwise */
  public boolean isSetOpenFileDescriptorCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __OPENFILEDESCRIPTORCOUNT_ISSET_ID);
  }

  public void setOpenFileDescriptorCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __OPENFILEDESCRIPTORCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case OPEN_FILE_DESCRIPTOR_COUNT:
      if (value == null) {
        unsetOpenFileDescriptorCount();
      } else {
        setOpenFileDescriptorCount((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OPEN_FILE_DESCRIPTOR_COUNT:
      return getOpenFileDescriptorCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OPEN_FILE_DESCRIPTOR_COUNT:
      return isSetOpenFileDescriptorCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TFileDescriptor)
      return this.equals((TFileDescriptor)that);
    return false;
  }

  public boolean equals(TFileDescriptor that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_openFileDescriptorCount = true;
    boolean that_present_openFileDescriptorCount = true;
    if (this_present_openFileDescriptorCount || that_present_openFileDescriptorCount) {
      if (!(this_present_openFileDescriptorCount && that_present_openFileDescriptorCount))
        return false;
      if (this.openFileDescriptorCount != that.openFileDescriptorCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(openFileDescriptorCount);

    return hashCode;
  }

  @Override
  public int compareTo(TFileDescriptor other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetOpenFileDescriptorCount(), other.isSetOpenFileDescriptorCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOpenFileDescriptorCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.openFileDescriptorCount, other.openFileDescriptorCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TFileDescriptor(");
    boolean first = true;

    sb.append("openFileDescriptorCount:");
    sb.append(this.openFileDescriptorCount);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TFileDescriptorStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFileDescriptorStandardScheme getScheme() {
      return new TFileDescriptorStandardScheme();
    }
  }

  private static class TFileDescriptorStandardScheme extends org.apache.thrift.scheme.StandardScheme<TFileDescriptor> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFileDescriptor struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPEN_FILE_DESCRIPTOR_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.openFileDescriptorCount = iprot.readI64();
              struct.setOpenFileDescriptorCountIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFileDescriptor struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OPEN_FILE_DESCRIPTOR_COUNT_FIELD_DESC);
      oprot.writeI64(struct.openFileDescriptorCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFileDescriptorTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TFileDescriptorTupleScheme getScheme() {
      return new TFileDescriptorTupleScheme();
    }
  }

  private static class TFileDescriptorTupleScheme extends org.apache.thrift.scheme.TupleScheme<TFileDescriptor> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFileDescriptor struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOpenFileDescriptorCount()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetOpenFileDescriptorCount()) {
        oprot.writeI64(struct.openFileDescriptorCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFileDescriptor struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.openFileDescriptorCount = iprot.readI64();
        struct.setOpenFileDescriptorCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

