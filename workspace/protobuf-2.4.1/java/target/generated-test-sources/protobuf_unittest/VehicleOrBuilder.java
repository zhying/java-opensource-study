// Generated by the protocol buffer compiler.  DO NOT EDIT!

package protobuf_unittest;

public interface VehicleOrBuilder
    extends com.google.protobuf.MessageOrBuilder {
  
  // optional .protobuf_unittest.Engine engine = 1;
  boolean hasEngine();
  protobuf_unittest.Engine getEngine();
  protobuf_unittest.EngineOrBuilder getEngineOrBuilder();
  
  // repeated .protobuf_unittest.Wheel wheel = 2;
  java.util.List<protobuf_unittest.Wheel> 
      getWheelList();
  protobuf_unittest.Wheel getWheel(int index);
  int getWheelCount();
  java.util.List<? extends protobuf_unittest.WheelOrBuilder> 
      getWheelOrBuilderList();
  protobuf_unittest.WheelOrBuilder getWheelOrBuilder(
      int index);
}
