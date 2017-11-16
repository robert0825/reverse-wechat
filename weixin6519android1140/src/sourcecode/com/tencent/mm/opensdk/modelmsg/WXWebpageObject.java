package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;

public class WXWebpageObject
  implements WXMediaMessage.IMediaObject
{
  private static final int LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXWebpageObject";
  public String canvasPageXml;
  public String extInfo;
  public String webpageUrl;
  
  public WXWebpageObject()
  {
    GMTrace.i(44962938880L, 335);
    GMTrace.o(44962938880L, 335);
  }
  
  public WXWebpageObject(String paramString)
  {
    GMTrace.i(45097156608L, 336);
    this.webpageUrl = paramString;
    GMTrace.o(45097156608L, 336);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(45634027520L, 340);
    if ((this.webpageUrl == null) || (this.webpageUrl.length() == 0) || (this.webpageUrl.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXWebpageObject", "checkArgs fail, webpageUrl is invalid");
      GMTrace.o(45634027520L, 340);
      return false;
    }
    GMTrace.o(45634027520L, 340);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(45231374336L, 337);
    paramBundle.putString("_wxwebpageobject_extInfo", this.extInfo);
    paramBundle.putString("_wxwebpageobject_webpageUrl", this.webpageUrl);
    paramBundle.putString("_wxwebpageobject_canvaspagexml", this.canvasPageXml);
    GMTrace.o(45231374336L, 337);
  }
  
  public int type()
  {
    GMTrace.i(45499809792L, 339);
    GMTrace.o(45499809792L, 339);
    return 5;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(45365592064L, 338);
    this.extInfo = paramBundle.getString("_wxwebpageobject_extInfo");
    this.webpageUrl = paramBundle.getString("_wxwebpageobject_webpageUrl");
    this.canvasPageXml = paramBundle.getString("_wxwebpageobject_canvaspagexml");
    GMTrace.o(45365592064L, 338);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXWebpageObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */