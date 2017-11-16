package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;

public class LaunchFromWX
{
  private LaunchFromWX()
  {
    GMTrace.i(26306674688L, 196);
    GMTrace.o(26306674688L, 196);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int MESSAGE_ACTION_LENGTH_LIMIT = 2048;
    private static final int MESSAGE_EXT_LENGTH_LIMIT = 2048;
    private static final String TAG = "MicroMsg.SDK.LaunchFromWX.Req";
    public String country;
    public String lang;
    public String messageAction;
    public String messageExt;
    
    public Req()
    {
      GMTrace.i(24964497408L, 186);
      GMTrace.o(24964497408L, 186);
    }
    
    public Req(Bundle paramBundle)
    {
      GMTrace.i(25098715136L, 187);
      fromBundle(paramBundle);
      GMTrace.o(25098715136L, 187);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(25635586048L, 191);
      if ((this.messageAction != null) && (this.messageAction.length() > 2048))
      {
        Log.e("MicroMsg.SDK.LaunchFromWX.Req", "checkArgs fail, messageAction is too long");
        GMTrace.o(25635586048L, 191);
        return false;
      }
      if ((this.messageExt != null) && (this.messageExt.length() > 2048))
      {
        Log.e("MicroMsg.SDK.LaunchFromWX.Req", "checkArgs fail, messageExt is too long");
        GMTrace.o(25635586048L, 191);
        return false;
      }
      GMTrace.o(25635586048L, 191);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(25367150592L, 189);
      super.fromBundle(paramBundle);
      this.messageAction = paramBundle.getString("_wxobject_message_action");
      this.messageExt = paramBundle.getString("_wxobject_message_ext");
      this.lang = paramBundle.getString("_wxapi_launch_req_lang");
      this.country = paramBundle.getString("_wxapi_launch_req_country");
      GMTrace.o(25367150592L, 189);
    }
    
    public int getType()
    {
      GMTrace.i(25501368320L, 190);
      GMTrace.o(25501368320L, 190);
      return 6;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(25232932864L, 188);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxobject_message_action", this.messageAction);
      paramBundle.putString("_wxobject_message_ext", this.messageExt);
      paramBundle.putString("_wxapi_launch_req_lang", this.lang);
      paramBundle.putString("_wxapi_launch_req_country", this.country);
      GMTrace.o(25232932864L, 188);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public Resp()
    {
      GMTrace.i(25769803776L, 192);
      GMTrace.o(25769803776L, 192);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(25904021504L, 193);
      fromBundle(paramBundle);
      GMTrace.o(25904021504L, 193);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(26172456960L, 195);
      GMTrace.o(26172456960L, 195);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(26038239232L, 194);
      GMTrace.o(26038239232L, 194);
      return 6;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\LaunchFromWX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */