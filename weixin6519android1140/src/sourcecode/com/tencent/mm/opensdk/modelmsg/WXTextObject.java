package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;

public class WXTextObject
  implements WXMediaMessage.IMediaObject
{
  private static final int LENGTH_LIMIT = 10240;
  private static final String TAG = "MicroMsg.SDK.WXTextObject";
  public String text;
  
  public WXTextObject()
  {
    this(null);
    GMTrace.i(43486543872L, 324);
    GMTrace.o(43486543872L, 324);
  }
  
  public WXTextObject(String paramString)
  {
    GMTrace.i(43620761600L, 325);
    this.text = paramString;
    GMTrace.o(43620761600L, 325);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(44157632512L, 329);
    if ((this.text == null) || (this.text.length() == 0) || (this.text.length() > 10240))
    {
      Log.e("MicroMsg.SDK.WXTextObject", "checkArgs fail, text is invalid");
      GMTrace.o(44157632512L, 329);
      return false;
    }
    GMTrace.o(44157632512L, 329);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(43754979328L, 326);
    paramBundle.putString("_wxtextobject_text", this.text);
    GMTrace.o(43754979328L, 326);
  }
  
  public int type()
  {
    GMTrace.i(44023414784L, 328);
    GMTrace.o(44023414784L, 328);
    return 1;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(43889197056L, 327);
    this.text = paramBundle.getString("_wxtextobject_text");
    GMTrace.o(43889197056L, 327);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXTextObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */