package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;

public class ShowMessageFromWX
{
  private ShowMessageFromWX()
  {
    GMTrace.i(31272730624L, 233);
    GMTrace.o(31272730624L, 233);
  }
  
  public static class Req
    extends BaseReq
  {
    public String country;
    public String lang;
    public WXMediaMessage message;
    
    public Req()
    {
      GMTrace.i(29930553344L, 223);
      GMTrace.o(29930553344L, 223);
    }
    
    public Req(Bundle paramBundle)
    {
      GMTrace.i(30064771072L, 224);
      fromBundle(paramBundle);
      GMTrace.o(30064771072L, 224);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(30601641984L, 228);
      if (this.message == null)
      {
        GMTrace.o(30601641984L, 228);
        return false;
      }
      boolean bool = this.message.checkArgs();
      GMTrace.o(30601641984L, 228);
      return bool;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(30467424256L, 227);
      super.fromBundle(paramBundle);
      this.lang = paramBundle.getString("_wxapi_showmessage_req_lang");
      this.country = paramBundle.getString("_wxapi_showmessage_req_country");
      this.message = WXMediaMessage.Builder.fromBundle(paramBundle);
      GMTrace.o(30467424256L, 227);
    }
    
    public int getType()
    {
      GMTrace.i(30198988800L, 225);
      GMTrace.o(30198988800L, 225);
      return 4;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(30333206528L, 226);
      Bundle localBundle = WXMediaMessage.Builder.toBundle(this.message);
      super.toBundle(localBundle);
      paramBundle.putString("_wxapi_showmessage_req_lang", this.lang);
      paramBundle.putString("_wxapi_showmessage_req_country", this.country);
      paramBundle.putAll(localBundle);
      GMTrace.o(30333206528L, 226);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public Resp()
    {
      GMTrace.i(30735859712L, 229);
      GMTrace.o(30735859712L, 229);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(30870077440L, 230);
      fromBundle(paramBundle);
      GMTrace.o(30870077440L, 230);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(31138512896L, 232);
      GMTrace.o(31138512896L, 232);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(31004295168L, 231);
      GMTrace.o(31004295168L, 231);
      return 4;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\ShowMessageFromWX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */