package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public class WXMiniProgramObject
  implements WXMediaMessage.IMediaObject
{
  public static final int MINIPROGRAM_TYPE_PREVIEW = 2;
  public static final int MINIPROGRAM_TYPE_TEST = 1;
  public static final int MINIPTOGRAM_TYPE_RELEASE = 0;
  private static final String TAG = "MicroMsg.SDK.WXMiniProgramObject";
  public int miniprogramType;
  public String path;
  public String userName;
  public String webpageUrl;
  public boolean withShareTicket;
  
  public WXMiniProgramObject()
  {
    GMTrace.i(42144366592L, 314);
    this.miniprogramType = 0;
    GMTrace.o(42144366592L, 314);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(42681237504L, 318);
    if (d.a(this.webpageUrl))
    {
      Log.e("MicroMsg.SDK.WXMiniProgramObject", "webPageUrl is null");
      GMTrace.o(42681237504L, 318);
      return false;
    }
    if (d.a(this.userName))
    {
      Log.e("MicroMsg.SDK.WXMiniProgramObject", "userName is null");
      GMTrace.o(42681237504L, 318);
      return false;
    }
    if ((this.miniprogramType < 0) || (this.miniprogramType > 2))
    {
      Log.e("MicroMsg.SDK.WXMiniProgramObject", "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW");
      GMTrace.o(42681237504L, 318);
      return false;
    }
    GMTrace.o(42681237504L, 318);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(42278584320L, 315);
    paramBundle.putString("_wxminiprogram_webpageurl", this.webpageUrl);
    paramBundle.putString("_wxminiprogram_username", this.userName);
    paramBundle.putString("_wxminiprogram_path", this.path);
    paramBundle.putBoolean("_wxminiprogram_withsharetiket", this.withShareTicket);
    paramBundle.putInt("_wxminiprogram_type", this.miniprogramType);
    GMTrace.o(42278584320L, 315);
  }
  
  public int type()
  {
    GMTrace.i(42547019776L, 317);
    GMTrace.o(42547019776L, 317);
    return 36;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(42412802048L, 316);
    this.webpageUrl = paramBundle.getString("_wxminiprogram_webpageurl");
    this.userName = paramBundle.getString("_wxminiprogram_username");
    this.path = paramBundle.getString("_wxminiprogram_path");
    this.withShareTicket = paramBundle.getBoolean("_wxminiprogram_withsharetiket");
    this.miniprogramType = paramBundle.getInt("_wxminiprogram_type");
    GMTrace.o(42412802048L, 316);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXMiniProgramObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */