package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;

public final class JumpToBizTempSession
{
  public static final int SHOW_CHAT = 1;
  public static final int SHOW_MENU = 0;
  
  public JumpToBizTempSession()
  {
    GMTrace.i(19730006016L, 147);
    GMTrace.o(19730006016L, 147);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int MAX_SESSION_FROM_LENGTH = 1024;
    private static final String TAG = "MicroMsg.SDK.JumpToBizTempSession.Req";
    public String sessionFrom;
    public int showType;
    public String toUserName;
    
    public Req()
    {
      GMTrace.i(19193135104L, 143);
      GMTrace.o(19193135104L, 143);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(19461570560L, 145);
      if ((this.toUserName == null) || (this.toUserName.length() <= 0))
      {
        Log.e("MicroMsg.SDK.JumpToBizTempSession.Req", "checkArgs fail, toUserName is invalid");
        GMTrace.o(19461570560L, 145);
        return false;
      }
      if ((this.sessionFrom == null) || (this.sessionFrom.length() > 1024))
      {
        Log.e("MicroMsg.SDK.JumpToBizTempSession.Req", "checkArgs fail, sessionFrom is invalid");
        GMTrace.o(19461570560L, 145);
        return false;
      }
      GMTrace.o(19461570560L, 145);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(19327352832L, 144);
      GMTrace.o(19327352832L, 144);
      return 10;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(19595788288L, 146);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_jump_to_biz_webview_req_to_user_name", this.toUserName);
      paramBundle.putString("_wxapi_jump_to_biz_webview_req_session_from", this.sessionFrom);
      paramBundle.putInt("_wxapi_jump_to_biz_webview_req_show_type", this.showType);
      GMTrace.o(19595788288L, 146);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\JumpToBizTempSession.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */