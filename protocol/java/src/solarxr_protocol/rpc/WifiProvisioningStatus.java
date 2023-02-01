// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

@SuppressWarnings("unused")
public final class WifiProvisioningStatus {
  private WifiProvisioningStatus() { }
  public static final int NONE = 0;
  public static final int SERIAL_INIT = 1;
  public static final int PROVISIONING = 2;
  public static final int CONNECTING = 3;
  public static final int CONNECTION_ERROR = 4;
  public static final int LOOKING_FOR_SERVER = 5;
  public static final int COULD_NOT_FIND_SERVER = 6;
  public static final int DONE = 7;

  public static final String[] names = { "NONE", "SERIAL_INIT", "PROVISIONING", "CONNECTING", "CONNECTION_ERROR", "LOOKING_FOR_SERVER", "COULD_NOT_FIND_SERVER", "DONE", };

  public static String name(int e) { return names[e]; }
}

