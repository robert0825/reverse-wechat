package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import java.net.URLEncoder;

public class OpenWebview
{
  public OpenWebview()
  {
    GMTrace.i(23085449216L, 172);
    GMTrace.o(23085449216L, 172);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int MAX_URL_LENGHT = 10240;
    public String url;
    
    public Req()
    {
      GMTrace.i(21743271936L, 162);
      GMTrace.o(21743271936L, 162);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(22011707392L, 164);
      if ((this.url == null) || (this.url.length() < 0))
      {
        GMTrace.o(22011707392L, 164);
        return false;
      }
      if (this.url.length() > 10240)
      {
        GMTrace.o(22011707392L, 164);
        return false;
      }
      GMTrace.o(22011707392L, 164);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(21877489664L, 163);
      GMTrace.o(21877489664L, 163);
      return 12;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(22145925120L, 165);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_jump_to_webview_url", URLEncoder.encode(this.url));
      GMTrace.o(22145925120L, 165);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public String result;
    
    public Resp()
    {
      GMTrace.i(22280142848L, 166);
      GMTrace.o(22280142848L, 166);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(22414360576L, 167);
      fromBundle(paramBundle);
      GMTrace.o(22414360576L, 167);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(22951231488L, 171);
      GMTrace.o(22951231488L, 171);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(22682796032L, 169);
      super.fromBundle(paramBundle);
      this.result = paramBundle.getString("_wxapi_open_webview_result");
      GMTrace.o(22682796032L, 169);
    }
    
    public int getType()
    {
      GMTrace.i(22548578304L, 168);
      GMTrace.o(22548578304L, 168);
      return 12;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(22817013760L, 170);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_open_webview_result", this.result);
      GMTrace.o(22817013760L, 170);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\OpenWebview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */