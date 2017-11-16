package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;

public final class JumpToBizWebview
{
  public JumpToBizWebview()
  {
    GMTrace.i(20401094656L, 152);
    GMTrace.o(20401094656L, 152);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int EXT_MSG_LENGTH = 1024;
    private static final String TAG = "MicroMsg.SDK.JumpToBizWebview.Req";
    public String extMsg;
    public int scene;
    public String toUserName;
    public int webType;
    
    public Req()
    {
      GMTrace.i(19864223744L, 148);
      this.scene = 1;
      GMTrace.o(19864223744L, 148);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(20132659200L, 150);
      if ((this.toUserName == null) || (this.toUserName.length() <= 0))
      {
        Log.e("MicroMsg.SDK.JumpToBizWebview.Req", "checkArgs fail, toUserName is invalid");
        GMTrace.o(20132659200L, 150);
        return false;
      }
      if ((this.extMsg != null) && (this.extMsg.length() > 1024))
      {
        Log.e("MicroMsg.SDK.JumpToBizWebview.Req", "ext msg is not null, while the length exceed 1024 bytes");
        GMTrace.o(20132659200L, 150);
        return false;
      }
      GMTrace.o(20132659200L, 150);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(19998441472L, 149);
      GMTrace.o(19998441472L, 149);
      return 8;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(20266876928L, 151);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_jump_to_biz_webview_req_to_user_name", this.toUserName);
      paramBundle.putString("_wxapi_jump_to_biz_webview_req_ext_msg", this.extMsg);
      paramBundle.putInt("_wxapi_jump_to_biz_webview_req_web_type", this.webType);
      paramBundle.putInt("_wxapi_jump_to_biz_webview_req_scene", this.scene);
      GMTrace.o(20266876928L, 151);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\JumpToBizWebview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */