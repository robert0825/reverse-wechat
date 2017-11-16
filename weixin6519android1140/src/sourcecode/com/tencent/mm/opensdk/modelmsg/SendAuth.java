package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;

public final class SendAuth
{
  private SendAuth()
  {
    GMTrace.i(28051505152L, 209);
    GMTrace.o(28051505152L, 209);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int LENGTH_LIMIT = 1024;
    private static final String TAG = "MicroMsg.SDK.SendAuth.Req";
    public String scope;
    public String state;
    
    public Req()
    {
      GMTrace.i(26440892416L, 197);
      GMTrace.o(26440892416L, 197);
    }
    
    public Req(Bundle paramBundle)
    {
      GMTrace.i(26575110144L, 198);
      fromBundle(paramBundle);
      GMTrace.o(26575110144L, 198);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(27111981056L, 202);
      if ((this.scope == null) || (this.scope.length() == 0) || (this.scope.length() > 1024))
      {
        Log.e("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, scope is invalid");
        GMTrace.o(27111981056L, 202);
        return false;
      }
      if ((this.state != null) && (this.state.length() > 1024))
      {
        Log.e("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, state is invalid");
        GMTrace.o(27111981056L, 202);
        return false;
      }
      GMTrace.o(27111981056L, 202);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(26843545600L, 200);
      super.fromBundle(paramBundle);
      this.scope = paramBundle.getString("_wxapi_sendauth_req_scope");
      this.state = paramBundle.getString("_wxapi_sendauth_req_state");
      GMTrace.o(26843545600L, 200);
    }
    
    public int getType()
    {
      GMTrace.i(26709327872L, 199);
      GMTrace.o(26709327872L, 199);
      return 1;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(26977763328L, 201);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_sendauth_req_scope", this.scope);
      paramBundle.putString("_wxapi_sendauth_req_state", this.state);
      GMTrace.o(26977763328L, 201);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    private static final int LENGTH_LIMIT = 1024;
    private static final String TAG = "MicroMsg.SDK.SendAuth.Resp";
    public String code;
    public String country;
    public String lang;
    public String state;
    public String url;
    
    public Resp()
    {
      GMTrace.i(27246198784L, 203);
      GMTrace.o(27246198784L, 203);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(27380416512L, 204);
      fromBundle(paramBundle);
      GMTrace.o(27380416512L, 204);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(27917287424L, 208);
      if ((this.state != null) && (this.state.length() > 1024))
      {
        Log.e("MicroMsg.SDK.SendAuth.Resp", "checkArgs fail, state is invalid");
        GMTrace.o(27917287424L, 208);
        return false;
      }
      GMTrace.o(27917287424L, 208);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(27648851968L, 206);
      super.fromBundle(paramBundle);
      this.code = paramBundle.getString("_wxapi_sendauth_resp_token");
      this.state = paramBundle.getString("_wxapi_sendauth_resp_state");
      this.url = paramBundle.getString("_wxapi_sendauth_resp_url");
      this.lang = paramBundle.getString("_wxapi_sendauth_resp_lang");
      this.country = paramBundle.getString("_wxapi_sendauth_resp_country");
      GMTrace.o(27648851968L, 206);
    }
    
    public int getType()
    {
      GMTrace.i(27514634240L, 205);
      GMTrace.o(27514634240L, 205);
      return 1;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(27783069696L, 207);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_sendauth_resp_token", this.code);
      paramBundle.putString("_wxapi_sendauth_resp_state", this.state);
      paramBundle.putString("_wxapi_sendauth_resp_url", this.url);
      paramBundle.putString("_wxapi_sendauth_resp_lang", this.lang);
      paramBundle.putString("_wxapi_sendauth_resp_country", this.country);
      GMTrace.o(27783069696L, 207);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\SendAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */