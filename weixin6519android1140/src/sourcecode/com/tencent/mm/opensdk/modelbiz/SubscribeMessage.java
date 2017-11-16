package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;

public final class SubscribeMessage
{
  private SubscribeMessage()
  {
    GMTrace.i(16292824219648L, 121391);
    GMTrace.o(16292824219648L, 121391);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int LENGTH_LIMIT = 1024;
    private static final String TAG = "MicroMsg.SDK.SubscribeMessage.Req";
    public String reserved;
    public int scene;
    public String templateID;
    
    public Req()
    {
      GMTrace.i(16291213606912L, 121379);
      GMTrace.o(16291213606912L, 121379);
    }
    
    public Req(Bundle paramBundle)
    {
      GMTrace.i(16291347824640L, 121380);
      fromBundle(paramBundle);
      GMTrace.o(16291347824640L, 121380);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(16291884695552L, 121384);
      if ((this.templateID == null) || (this.templateID.length() == 0))
      {
        Log.e("MicroMsg.SDK.SubscribeMessage.Req", "checkArgs fail, templateID is null");
        GMTrace.o(16291884695552L, 121384);
        return false;
      }
      if (this.templateID.length() > 1024)
      {
        Log.e("MicroMsg.SDK.SubscribeMessage.Req", "checkArgs fail, templateID is too long");
        GMTrace.o(16291884695552L, 121384);
        return false;
      }
      if ((this.reserved != null) && (this.reserved.length() > 1024))
      {
        Log.e("MicroMsg.SDK.SubscribeMessage.Req", "checkArgs fail, reserved is too long");
        GMTrace.o(16291884695552L, 121384);
        return false;
      }
      GMTrace.o(16291884695552L, 121384);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(16291616260096L, 121382);
      super.fromBundle(paramBundle);
      this.scene = paramBundle.getInt("_wxapi_subscribemessage_req_scene");
      this.templateID = paramBundle.getString("_wxapi_subscribemessage_req_templateid");
      this.reserved = paramBundle.getString("_wxapi_subscribemessage_req_reserved");
      GMTrace.o(16291616260096L, 121382);
    }
    
    public int getType()
    {
      GMTrace.i(16291482042368L, 121381);
      GMTrace.o(16291482042368L, 121381);
      return 18;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(16291750477824L, 121383);
      super.toBundle(paramBundle);
      paramBundle.putInt("_wxapi_subscribemessage_req_scene", this.scene);
      paramBundle.putString("_wxapi_subscribemessage_req_templateid", this.templateID);
      paramBundle.putString("_wxapi_subscribemessage_req_reserved", this.reserved);
      GMTrace.o(16291750477824L, 121383);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    private static final String TAG = "MicroMsg.SDK.SubscribeMessage.Resp";
    public String action;
    public String reserved;
    public int scene;
    public String templateID;
    
    public Resp()
    {
      GMTrace.i(16292018913280L, 121385);
      GMTrace.o(16292018913280L, 121385);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(16292153131008L, 121386);
      fromBundle(paramBundle);
      GMTrace.o(16292153131008L, 121386);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(16292690001920L, 121390);
      GMTrace.o(16292690001920L, 121390);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(16292421566464L, 121388);
      super.fromBundle(paramBundle);
      this.templateID = paramBundle.getString("_wxapi_subscribemessage_resp_templateid");
      this.scene = paramBundle.getInt("_wxapi_subscribemessage_resp_scene");
      this.action = paramBundle.getString("_wxapi_subscribemessage_resp_action");
      this.reserved = paramBundle.getString("_wxapi_subscribemessage_resp_reserved");
      GMTrace.o(16292421566464L, 121388);
    }
    
    public int getType()
    {
      GMTrace.i(16292287348736L, 121387);
      GMTrace.o(16292287348736L, 121387);
      return 18;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(16292555784192L, 121389);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_subscribemessage_resp_templateid", this.templateID);
      paramBundle.putInt("_wxapi_subscribemessage_resp_scene", this.scene);
      paramBundle.putString("_wxapi_subscribemessage_resp_action", this.action);
      paramBundle.putString("_wxapi_subscribemessage_resp_reserved", this.reserved);
      GMTrace.o(16292555784192L, 121389);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\SubscribeMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */