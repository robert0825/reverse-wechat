package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;

public final class GetMessageFromWX
{
  private GetMessageFromWX()
  {
    GMTrace.i(24830279680L, 185);
    GMTrace.o(24830279680L, 185);
  }
  
  public static class Req
    extends BaseReq
  {
    public String country;
    public String lang;
    public String username;
    
    public Req()
    {
      GMTrace.i(23219666944L, 173);
      GMTrace.o(23219666944L, 173);
    }
    
    public Req(Bundle paramBundle)
    {
      GMTrace.i(23353884672L, 174);
      fromBundle(paramBundle);
      GMTrace.o(23353884672L, 174);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(23890755584L, 178);
      GMTrace.o(23890755584L, 178);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(23756537856L, 177);
      super.fromBundle(paramBundle);
      this.lang = paramBundle.getString("_wxapi_getmessage_req_lang");
      this.country = paramBundle.getString("_wxapi_getmessage_req_country");
      GMTrace.o(23756537856L, 177);
    }
    
    public int getType()
    {
      GMTrace.i(23488102400L, 175);
      GMTrace.o(23488102400L, 175);
      return 3;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(23622320128L, 176);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_getmessage_req_lang", this.lang);
      paramBundle.putString("_wxapi_getmessage_req_country", this.country);
      GMTrace.o(23622320128L, 176);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    private static final String TAG = "MicroMsg.SDK.GetMessageFromWX.Resp";
    public WXMediaMessage message;
    
    public Resp()
    {
      GMTrace.i(24024973312L, 179);
      GMTrace.o(24024973312L, 179);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(24159191040L, 180);
      fromBundle(paramBundle);
      GMTrace.o(24159191040L, 180);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(24696061952L, 184);
      if (this.message == null)
      {
        Log.e("MicroMsg.SDK.GetMessageFromWX.Resp", "checkArgs fail, message is null");
        GMTrace.o(24696061952L, 184);
        return false;
      }
      boolean bool = this.message.checkArgs();
      GMTrace.o(24696061952L, 184);
      return bool;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(24427626496L, 182);
      super.fromBundle(paramBundle);
      this.message = WXMediaMessage.Builder.fromBundle(paramBundle);
      GMTrace.o(24427626496L, 182);
    }
    
    public int getType()
    {
      GMTrace.i(24293408768L, 181);
      GMTrace.o(24293408768L, 181);
      return 3;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(24561844224L, 183);
      super.toBundle(paramBundle);
      paramBundle.putAll(WXMediaMessage.Builder.toBundle(this.message));
      GMTrace.o(24561844224L, 183);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\GetMessageFromWX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */