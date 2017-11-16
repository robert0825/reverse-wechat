package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;

public class WXVideoObject
  implements WXMediaMessage.IMediaObject
{
  private static final int LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXVideoObject";
  public String videoLowBandUrl;
  public String videoUrl;
  
  public WXVideoObject()
  {
    GMTrace.i(44291850240L, 330);
    GMTrace.o(44291850240L, 330);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(44828721152L, 334);
    if (((this.videoUrl == null) || (this.videoUrl.length() == 0)) && ((this.videoLowBandUrl == null) || (this.videoLowBandUrl.length() == 0)))
    {
      Log.e("MicroMsg.SDK.WXVideoObject", "both arguments are null");
      GMTrace.o(44828721152L, 334);
      return false;
    }
    if ((this.videoUrl != null) && (this.videoUrl.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXVideoObject", "checkArgs fail, videoUrl is too long");
      GMTrace.o(44828721152L, 334);
      return false;
    }
    if ((this.videoLowBandUrl != null) && (this.videoLowBandUrl.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXVideoObject", "checkArgs fail, videoLowBandUrl is too long");
      GMTrace.o(44828721152L, 334);
      return false;
    }
    GMTrace.o(44828721152L, 334);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(44426067968L, 331);
    paramBundle.putString("_wxvideoobject_videoUrl", this.videoUrl);
    paramBundle.putString("_wxvideoobject_videoLowBandUrl", this.videoLowBandUrl);
    GMTrace.o(44426067968L, 331);
  }
  
  public int type()
  {
    GMTrace.i(44694503424L, 333);
    GMTrace.o(44694503424L, 333);
    return 4;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(44560285696L, 332);
    this.videoUrl = paramBundle.getString("_wxvideoobject_videoUrl");
    this.videoLowBandUrl = paramBundle.getString("_wxvideoobject_videoLowBandUrl");
    GMTrace.o(44560285696L, 332);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXVideoObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */