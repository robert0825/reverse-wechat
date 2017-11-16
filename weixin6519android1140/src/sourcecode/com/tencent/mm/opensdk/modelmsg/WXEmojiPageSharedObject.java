package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public class WXEmojiPageSharedObject
  implements WXMediaMessage.IMediaObject
{
  private static final String TAG = "MicroMsg.SDK.WXEmojiSharedObject";
  public String desc;
  public String iconUrl;
  public int pageType;
  public String secondUrl;
  public int tid;
  public String title;
  public int type;
  public String url;
  
  public WXEmojiPageSharedObject()
  {
    GMTrace.i(35165044736L, 262);
    GMTrace.o(35165044736L, 262);
  }
  
  public WXEmojiPageSharedObject(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt3, String paramString5)
  {
    GMTrace.i(35299262464L, 263);
    this.tid = paramInt2;
    this.title = paramString1;
    this.desc = paramString2;
    this.iconUrl = paramString3;
    this.secondUrl = paramString4;
    this.pageType = paramInt3;
    this.url = paramString5;
    this.type = paramInt1;
    GMTrace.o(35299262464L, 263);
  }
  
  public boolean checkArgs()
  {
    GMTrace.i(35836133376L, 267);
    if ((d.a(this.title)) || (d.a(this.iconUrl)))
    {
      Log.e("MicroMsg.SDK.WXEmojiSharedObject", "checkArgs fail, title or iconUrl is invalid");
      GMTrace.o(35836133376L, 267);
      return false;
    }
    GMTrace.o(35836133376L, 267);
    return true;
  }
  
  public void serialize(Bundle paramBundle)
  {
    GMTrace.i(35433480192L, 264);
    paramBundle.putInt("_wxemojisharedobject_tid", this.tid);
    paramBundle.putString("_wxemojisharedobject_title", this.title);
    paramBundle.putString("_wxemojisharedobject_desc", this.desc);
    paramBundle.putString("_wxemojisharedobject_iconurl", this.iconUrl);
    paramBundle.putString("_wxemojisharedobject_secondurl", this.secondUrl);
    paramBundle.putInt("_wxemojisharedobject_pagetype", this.pageType);
    paramBundle.putString("_wxwebpageobject_url", this.url);
    GMTrace.o(35433480192L, 264);
  }
  
  public int type()
  {
    GMTrace.i(35701915648L, 266);
    int i = this.type;
    GMTrace.o(35701915648L, 266);
    return i;
  }
  
  public void unserialize(Bundle paramBundle)
  {
    GMTrace.i(35567697920L, 265);
    this.tid = paramBundle.getInt("_wxemojisharedobject_tid");
    this.title = paramBundle.getString("_wxemojisharedobject_title");
    this.desc = paramBundle.getString("_wxemojisharedobject_desc");
    this.iconUrl = paramBundle.getString("_wxemojisharedobject_iconurl");
    this.secondUrl = paramBundle.getString("_wxemojisharedobject_secondurl");
    this.pageType = paramBundle.getInt("_wxemojisharedobject_pagetype");
    this.url = paramBundle.getString("_wxwebpageobject_url");
    GMTrace.o(35567697920L, 265);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\WXEmojiPageSharedObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */