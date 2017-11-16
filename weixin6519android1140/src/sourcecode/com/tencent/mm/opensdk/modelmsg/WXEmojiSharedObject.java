package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;

public class WXEmojiSharedObject
  implements WXMediaMessage.IMediaObject
{
  private static final String TAG = "MicroMsg.SDK.WXEmojiSharedObject";
  public int packageflag;
  public String packageid;
  public String thumburl;
  public String url;
  
  public WXEmojiSharedObject()
  {
    GMTrace.i(35970351104L, 268);
    GMTrace.o(35970351104L, 268);
  }
  
  public WXEmojiSharedObject(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(36104568832L, 269);
    this.thumburl = paramString1;
    this.packageflag = paramInt;
    this.packageid = paramString2;
    this.url = paramString3;
    GMTrace.o(36104568832L, 269);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(36641439744L, 273);
    if ((TextUtils.isEmpty(this.packageid)) || (TextUtils.isEmpty(this.thumburl)) || (TextUtils.isEmpty(this.url)) || (this.packageflag == -1))
    {
      Log.e("MicroMsg.SDK.WXEmojiSharedObject", "checkArgs fail, packageid or thumburl is invalid");
      GMTrace.o(36641439744L, 273);
      return false;
    }
    GMTrace.o(36641439744L, 273);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(36238786560L, 270);
    paramBundle.putString("_wxemojisharedobject_thumburl", this.thumburl);
    paramBundle.putInt("_wxemojisharedobject_packageflag", this.packageflag);
    paramBundle.putString("_wxemojisharedobject_packageid", this.packageid);
    paramBundle.putString("_wxemojisharedobject_url", this.url);
    GMTrace.o(36238786560L, 270);
  }
  
  public int type()
  {
    GMTrace.i(36507222016L, 272);
    GMTrace.o(36507222016L, 272);
    return 15;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(36373004288L, 271);
    this.thumburl = paramBundle.getString("_wxwebpageobject_thumburl");
    this.packageflag = paramBundle.getInt("_wxwebpageobject_packageflag");
    this.packageid = paramBundle.getString("_wxwebpageobject_packageid");
    this.url = paramBundle.getString("_wxwebpageobject_url");
    GMTrace.o(36373004288L, 271);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXEmojiSharedObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */