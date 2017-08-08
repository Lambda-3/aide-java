package aide_messages;

public interface ShortMessage extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "aide_messages/ShortMessage";
  static final java.lang.String _DEFINITION = "string WhatsApp=\"WhatsApp\"\nstring type\nstring other\nstring content";
  static final java.lang.String WhatsApp = "\"WhatsApp\"";
  java.lang.String getType();
  void setType(java.lang.String value);
  java.lang.String getOther();
  void setOther(java.lang.String value);
  java.lang.String getContent();
  void setContent(java.lang.String value);
}
