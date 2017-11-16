package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;

public class WXDesignerSharedObject
  implements WXMediaMessage.IMediaObject
{
  private static final String TAG = "MicroMsg.SDK.WXEmojiSharedObject";
  public String designerName;
  public String designerRediretctUrl;
  public int designerUIN;
  public String thumburl;
  public String url;
  
  public WXDesignerSharedObject()
  {
    GMTrace.i(33017561088L, 246);
    GMTrace.o(33017561088L, 246);
  }
  
  public WXDesignerSharedObject(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(33151778816L, 247);
    this.url = paramString2;
    this.thumburl = paramString1;
    this.designerUIN = paramInt;
    this.designerName = paramString3;
    GMTrace.o(33151778816L, 247);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(33688649728L, 251);
    if ((this.designerUIN == 0) || (TextUtils.isEmpty(this.thumburl)) || (TextUtils.isEmpty(this.url)))
    {
      Log.e("MicroMsg.SDK.WXEmojiSharedObject", "checkArgs fail, packageid or thumburl is invalid");
      GMTrace.o(33688649728L, 251);
      return false;
    }
    GMTrace.o(33688649728L, 251);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(33285996544L, 248);
    paramBundle.putString("_wxemojisharedobject_thumburl", this.thumburl);
    paramBundle.putInt("_wxemojisharedobject_designer_uin", this.designerUIN);
    paramBundle.putString("_wxemojisharedobject_designer_name", this.designerName);
    paramBundle.putString("_wxemojisharedobject_designer_rediretcturl", this.designerRediretctUrl);
    paramBundle.putString("_wxemojisharedobject_url", this.url);
    GMTrace.o(33285996544L, 248);
  }
  
  public int type()
  {
    GMTrace.i(33554432000L, 250);
    GMTrace.o(33554432000L, 250);
    return 25;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(33420214272L, 249);
    this.thumburl = paramBundle.getString("_wxwebpageobject_thumburl");
    this.designerUIN = paramBundle.getInt("_wxemojisharedobject_designer_uin");
    this.designerName = paramBundle.getString("_wxemojisharedobject_designer_name");
    this.designerRediretctUrl = paramBundle.getString("_wxemojisharedobject_designer_rediretcturl");
    this.url = paramBundle.getString("_wxwebpageobject_url");
    GMTrace.o(33420214272L, 249);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXDesignerSharedObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */