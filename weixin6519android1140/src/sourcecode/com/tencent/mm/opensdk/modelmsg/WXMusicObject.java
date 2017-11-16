package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;

public class WXMusicObject
  implements WXMediaMessage.IMediaObject
{
  private static final int LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXMusicObject";
  public String musicDataUrl;
  public String musicLowBandDataUrl;
  public String musicLowBandUrl;
  public String musicUrl;
  
  public WXMusicObject()
  {
    GMTrace.i(42815455232L, 319);
    GMTrace.o(42815455232L, 319);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(43352326144L, 323);
    if (((this.musicUrl == null) || (this.musicUrl.length() == 0)) && ((this.musicLowBandUrl == null) || (this.musicLowBandUrl.length() == 0)))
    {
      Log.e("MicroMsg.SDK.WXMusicObject", "both arguments are null");
      GMTrace.o(43352326144L, 323);
      return false;
    }
    if ((this.musicUrl != null) && (this.musicUrl.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXMusicObject", "checkArgs fail, musicUrl is too long");
      GMTrace.o(43352326144L, 323);
      return false;
    }
    if ((this.musicLowBandUrl != null) && (this.musicLowBandUrl.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXMusicObject", "checkArgs fail, musicLowBandUrl is too long");
      GMTrace.o(43352326144L, 323);
      return false;
    }
    GMTrace.o(43352326144L, 323);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(42949672960L, 320);
    paramBundle.putString("_wxmusicobject_musicUrl", this.musicUrl);
    paramBundle.putString("_wxmusicobject_musicLowBandUrl", this.musicLowBandUrl);
    paramBundle.putString("_wxmusicobject_musicDataUrl", this.musicDataUrl);
    paramBundle.putString("_wxmusicobject_musicLowBandDataUrl", this.musicLowBandDataUrl);
    GMTrace.o(42949672960L, 320);
  }
  
  public int type()
  {
    GMTrace.i(43218108416L, 322);
    GMTrace.o(43218108416L, 322);
    return 3;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(43083890688L, 321);
    this.musicUrl = paramBundle.getString("_wxmusicobject_musicUrl");
    this.musicLowBandUrl = paramBundle.getString("_wxmusicobject_musicLowBandUrl");
    this.musicDataUrl = paramBundle.getString("_wxmusicobject_musicDataUrl");
    this.musicLowBandDataUrl = paramBundle.getString("_wxmusicobject_musicLowBandDataUrl");
    GMTrace.o(43083890688L, 321);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXMusicObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */