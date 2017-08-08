package aide_messages;

public interface Event extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "aide_messages/Event";
  static final java.lang.String _DEFINITION = "# event types\nuint8 Continuous=0\nuint8 NewOnly=1\nuint8 Precise=2\n# unit types\nstring Millisecond = \"ms\"\nstring Second = \"s\"\nstring Minute = \"m\"\nstring Hour = \"h\"\nstring Day = \"d\"\n# fields\nstring name\nstring[] params\nuint8 range\nstring rangeUnit\nuint8 step\nstring stepUnit\nuint8 executionType\nstring sparqlWhere";
  static final byte Continuous = 0;
  static final byte NewOnly = 1;
  static final byte Precise = 2;
  static final java.lang.String Millisecond = "\"ms\"";
  static final java.lang.String Second = "\"s\"";
  static final java.lang.String Minute = "\"m\"";
  static final java.lang.String Hour = "\"h\"";
  static final java.lang.String Day = "\"d\"";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.util.List<java.lang.String> getParams();
  void setParams(java.util.List<java.lang.String> value);
  byte getRange();
  void setRange(byte value);
  java.lang.String getRangeUnit();
  void setRangeUnit(java.lang.String value);
  byte getStep();
  void setStep(byte value);
  java.lang.String getStepUnit();
  void setStepUnit(java.lang.String value);
  byte getExecutionType();
  void setExecutionType(byte value);
  java.lang.String getSparqlWhere();
  void setSparqlWhere(java.lang.String value);
}
