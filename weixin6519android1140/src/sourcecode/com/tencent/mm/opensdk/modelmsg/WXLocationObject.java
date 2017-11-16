package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;

public class WXLocationObject
  implements WXMediaMessage.IMediaObject
{
  private static final String TAG = "MicroMsg.SDK.WXLocationObject";
  public double lat;
  public double lng;
  
  public WXLocationObject()
  {
    this(0.0D, 0.0D);
    GMTrace.i(39460012032L, 294);
    GMTrace.o(39460012032L, 294);
  }
  
  public WXLocationObject(double paramDouble1, double paramDouble2)
  {
    GMTrace.i(39594229760L, 295);
    this.lat = paramDouble1;
    this.lng = paramDouble2;
    GMTrace.o(39594229760L, 295);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(40131100672L, 299);
    GMTrace.o(40131100672L, 299);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(39728447488L, 296);
    paramBundle.putDouble("_wxlocationobject_lat", this.lat);
    paramBundle.putDouble("_wxlocationobject_lng", this.lng);
    GMTrace.o(39728447488L, 296);
  }
  
  public int type()
  {
    GMTrace.i(39996882944L, 298);
    GMTrace.o(39996882944L, 298);
    return 30;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(39862665216L, 297);
    this.lat = paramBundle.getDouble("_wxlocationobject_lat");
    this.lng = paramBundle.getDouble("_wxlocationobject_lng");
    GMTrace.o(39862665216L, 297);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXLocationObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */