/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jelly.thrift.ticketing;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-01-08")
public class Departure implements org.apache.thrift.TBase<Departure, Departure._Fields>, java.io.Serializable, Cloneable, Comparable<Departure> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Departure");

  private static final org.apache.thrift.protocol.TField START_FIELD_DESC = new org.apache.thrift.protocol.TField("start", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REACH_FIELD_DESC = new org.apache.thrift.protocol.TField("reach", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("start_time", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField REACH_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("reach_time", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DepartureStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DepartureTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String start; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String reach; // required
  public double price; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String start_time; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String reach_time; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START((short)1, "start"),
    REACH((short)2, "reach"),
    PRICE((short)3, "price"),
    START_TIME((short)4, "start_time"),
    REACH_TIME((short)5, "reach_time");

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
        case 1: // START
          return START;
        case 2: // REACH
          return REACH;
        case 3: // PRICE
          return PRICE;
        case 4: // START_TIME
          return START_TIME;
        case 5: // REACH_TIME
          return REACH_TIME;
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
  private static final int __PRICE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START, new org.apache.thrift.meta_data.FieldMetaData("start", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REACH, new org.apache.thrift.meta_data.FieldMetaData("reach", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("start_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REACH_TIME, new org.apache.thrift.meta_data.FieldMetaData("reach_time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Departure.class, metaDataMap);
  }

  public Departure() {
  }

  public Departure(
    java.lang.String start,
    java.lang.String reach,
    double price,
    java.lang.String start_time,
    java.lang.String reach_time)
  {
    this();
    this.start = start;
    this.reach = reach;
    this.price = price;
    setPriceIsSet(true);
    this.start_time = start_time;
    this.reach_time = reach_time;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Departure(Departure other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStart()) {
      this.start = other.start;
    }
    if (other.isSetReach()) {
      this.reach = other.reach;
    }
    this.price = other.price;
    if (other.isSetStart_time()) {
      this.start_time = other.start_time;
    }
    if (other.isSetReach_time()) {
      this.reach_time = other.reach_time;
    }
  }

  public Departure deepCopy() {
    return new Departure(this);
  }

  @Override
  public void clear() {
    this.start = null;
    this.reach = null;
    setPriceIsSet(false);
    this.price = 0.0;
    this.start_time = null;
    this.reach_time = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStart() {
    return this.start;
  }

  public Departure setStart(@org.apache.thrift.annotation.Nullable java.lang.String start) {
    this.start = start;
    return this;
  }

  public void unsetStart() {
    this.start = null;
  }

  /** Returns true if field start is set (has been assigned a value) and false otherwise */
  public boolean isSetStart() {
    return this.start != null;
  }

  public void setStartIsSet(boolean value) {
    if (!value) {
      this.start = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getReach() {
    return this.reach;
  }

  public Departure setReach(@org.apache.thrift.annotation.Nullable java.lang.String reach) {
    this.reach = reach;
    return this;
  }

  public void unsetReach() {
    this.reach = null;
  }

  /** Returns true if field reach is set (has been assigned a value) and false otherwise */
  public boolean isSetReach() {
    return this.reach != null;
  }

  public void setReachIsSet(boolean value) {
    if (!value) {
      this.reach = null;
    }
  }

  public double getPrice() {
    return this.price;
  }

  public Departure setPrice(double price) {
    this.price = price;
    setPriceIsSet(true);
    return this;
  }

  public void unsetPrice() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean isSetPrice() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  public void setPriceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PRICE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getStart_time() {
    return this.start_time;
  }

  public Departure setStart_time(@org.apache.thrift.annotation.Nullable java.lang.String start_time) {
    this.start_time = start_time;
    return this;
  }

  public void unsetStart_time() {
    this.start_time = null;
  }

  /** Returns true if field start_time is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_time() {
    return this.start_time != null;
  }

  public void setStart_timeIsSet(boolean value) {
    if (!value) {
      this.start_time = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getReach_time() {
    return this.reach_time;
  }

  public Departure setReach_time(@org.apache.thrift.annotation.Nullable java.lang.String reach_time) {
    this.reach_time = reach_time;
    return this;
  }

  public void unsetReach_time() {
    this.reach_time = null;
  }

  /** Returns true if field reach_time is set (has been assigned a value) and false otherwise */
  public boolean isSetReach_time() {
    return this.reach_time != null;
  }

  public void setReach_timeIsSet(boolean value) {
    if (!value) {
      this.reach_time = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case START:
      if (value == null) {
        unsetStart();
      } else {
        setStart((java.lang.String)value);
      }
      break;

    case REACH:
      if (value == null) {
        unsetReach();
      } else {
        setReach((java.lang.String)value);
      }
      break;

    case PRICE:
      if (value == null) {
        unsetPrice();
      } else {
        setPrice((java.lang.Double)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStart_time();
      } else {
        setStart_time((java.lang.String)value);
      }
      break;

    case REACH_TIME:
      if (value == null) {
        unsetReach_time();
      } else {
        setReach_time((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case START:
      return getStart();

    case REACH:
      return getReach();

    case PRICE:
      return getPrice();

    case START_TIME:
      return getStart_time();

    case REACH_TIME:
      return getReach_time();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case START:
      return isSetStart();
    case REACH:
      return isSetReach();
    case PRICE:
      return isSetPrice();
    case START_TIME:
      return isSetStart_time();
    case REACH_TIME:
      return isSetReach_time();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Departure)
      return this.equals((Departure)that);
    return false;
  }

  public boolean equals(Departure that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_start = true && this.isSetStart();
    boolean that_present_start = true && that.isSetStart();
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (!this.start.equals(that.start))
        return false;
    }

    boolean this_present_reach = true && this.isSetReach();
    boolean that_present_reach = true && that.isSetReach();
    if (this_present_reach || that_present_reach) {
      if (!(this_present_reach && that_present_reach))
        return false;
      if (!this.reach.equals(that.reach))
        return false;
    }

    boolean this_present_price = true;
    boolean that_present_price = true;
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (this.price != that.price)
        return false;
    }

    boolean this_present_start_time = true && this.isSetStart_time();
    boolean that_present_start_time = true && that.isSetStart_time();
    if (this_present_start_time || that_present_start_time) {
      if (!(this_present_start_time && that_present_start_time))
        return false;
      if (!this.start_time.equals(that.start_time))
        return false;
    }

    boolean this_present_reach_time = true && this.isSetReach_time();
    boolean that_present_reach_time = true && that.isSetReach_time();
    if (this_present_reach_time || that_present_reach_time) {
      if (!(this_present_reach_time && that_present_reach_time))
        return false;
      if (!this.reach_time.equals(that.reach_time))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStart()) ? 131071 : 524287);
    if (isSetStart())
      hashCode = hashCode * 8191 + start.hashCode();

    hashCode = hashCode * 8191 + ((isSetReach()) ? 131071 : 524287);
    if (isSetReach())
      hashCode = hashCode * 8191 + reach.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(price);

    hashCode = hashCode * 8191 + ((isSetStart_time()) ? 131071 : 524287);
    if (isSetStart_time())
      hashCode = hashCode * 8191 + start_time.hashCode();

    hashCode = hashCode * 8191 + ((isSetReach_time()) ? 131071 : 524287);
    if (isSetReach_time())
      hashCode = hashCode * 8191 + reach_time.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Departure other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStart()).compareTo(other.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start, other.start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReach()).compareTo(other.isSetReach());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReach()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reach, other.reach);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPrice()).compareTo(other.isSetPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.price, other.price);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStart_time()).compareTo(other.isSetStart_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_time, other.start_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReach_time()).compareTo(other.isSetReach_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReach_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reach_time, other.reach_time);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Departure(");
    boolean first = true;

    sb.append("start:");
    if (this.start == null) {
      sb.append("null");
    } else {
      sb.append(this.start);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reach:");
    if (this.reach == null) {
      sb.append("null");
    } else {
      sb.append(this.reach);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("price:");
    sb.append(this.price);
    first = false;
    if (!first) sb.append(", ");
    sb.append("start_time:");
    if (this.start_time == null) {
      sb.append("null");
    } else {
      sb.append(this.start_time);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reach_time:");
    if (this.reach_time == null) {
      sb.append("null");
    } else {
      sb.append(this.reach_time);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DepartureStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DepartureStandardScheme getScheme() {
      return new DepartureStandardScheme();
    }
  }

  private static class DepartureStandardScheme extends org.apache.thrift.scheme.StandardScheme<Departure> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Departure struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.start = iprot.readString();
              struct.setStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REACH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reach = iprot.readString();
              struct.setReachIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.price = iprot.readDouble();
              struct.setPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.start_time = iprot.readString();
              struct.setStart_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REACH_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reach_time = iprot.readString();
              struct.setReach_timeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Departure struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.start != null) {
        oprot.writeFieldBegin(START_FIELD_DESC);
        oprot.writeString(struct.start);
        oprot.writeFieldEnd();
      }
      if (struct.reach != null) {
        oprot.writeFieldBegin(REACH_FIELD_DESC);
        oprot.writeString(struct.reach);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PRICE_FIELD_DESC);
      oprot.writeDouble(struct.price);
      oprot.writeFieldEnd();
      if (struct.start_time != null) {
        oprot.writeFieldBegin(START_TIME_FIELD_DESC);
        oprot.writeString(struct.start_time);
        oprot.writeFieldEnd();
      }
      if (struct.reach_time != null) {
        oprot.writeFieldBegin(REACH_TIME_FIELD_DESC);
        oprot.writeString(struct.reach_time);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DepartureTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DepartureTupleScheme getScheme() {
      return new DepartureTupleScheme();
    }
  }

  private static class DepartureTupleScheme extends org.apache.thrift.scheme.TupleScheme<Departure> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Departure struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStart()) {
        optionals.set(0);
      }
      if (struct.isSetReach()) {
        optionals.set(1);
      }
      if (struct.isSetPrice()) {
        optionals.set(2);
      }
      if (struct.isSetStart_time()) {
        optionals.set(3);
      }
      if (struct.isSetReach_time()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetStart()) {
        oprot.writeString(struct.start);
      }
      if (struct.isSetReach()) {
        oprot.writeString(struct.reach);
      }
      if (struct.isSetPrice()) {
        oprot.writeDouble(struct.price);
      }
      if (struct.isSetStart_time()) {
        oprot.writeString(struct.start_time);
      }
      if (struct.isSetReach_time()) {
        oprot.writeString(struct.reach_time);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Departure struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.start = iprot.readString();
        struct.setStartIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reach = iprot.readString();
        struct.setReachIsSet(true);
      }
      if (incoming.get(2)) {
        struct.price = iprot.readDouble();
        struct.setPriceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.start_time = iprot.readString();
        struct.setStart_timeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.reach_time = iprot.readString();
        struct.setReach_timeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
