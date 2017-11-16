package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;

public class SendMessageToWX
{
  private SendMessageToWX()
  {
    GMTrace.i(29796335616L, 222);
    GMTrace.o(29796335616L, 222);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int FAV_CONTENT_LENGTH_LIMIT = 26214400;
    private static final String TAG = "MicroMsg.SDK.SendMessageToWX.Req";
    public static final int WXSceneFavorite = 2;
    public static final int WXSceneSession = 0;
    public static final int WXSceneTimeline = 1;
    public WXMediaMessage message;
    public int scene;
    
    public Req()
    {
      GMTrace.i(28185722880L, 210);
      GMTrace.o(28185722880L, 210);
    }
    
    public Req(Bundle paramBundle)
    {
      GMTrace.i(28319940608L, 211);
      fromBundle(paramBundle);
      GMTrace.o(28319940608L, 211);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(28856811520L, 215);
      if (this.message == null)
      {
        Log.e("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail ,message is null");
        GMTrace.o(28856811520L, 215);
        return false;
      }
      if ((this.message.mediaObject.type() == 6) && (this.scene == 2)) {
        ((WXFileObject)this.message.mediaObject).setContentLengthLimit(26214400);
      }
      boolean bool = this.message.checkArgs();
      GMTrace.o(28856811520L, 215);
      return bool;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(28588376064L, 213);
      super.fromBundle(paramBundle);
      this.message = WXMediaMessage.Builder.fromBundle(paramBundle);
      this.scene = paramBundle.getInt("_wxapi_sendmessagetowx_req_scene");
      GMTrace.o(28588376064L, 213);
    }
    
    public int getType()
    {
      GMTrace.i(28454158336L, 212);
      GMTrace.o(28454158336L, 212);
      return 2;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(28722593792L, 214);
      super.toBundle(paramBundle);
      paramBundle.putAll(WXMediaMessage.Builder.toBundle(this.message));
      paramBundle.putInt("_wxapi_sendmessagetowx_req_scene", this.scene);
      paramBundle.putInt("_wxapi_sendmessagetowx_req_media_type", this.message.getType());
      GMTrace.o(28722593792L, 214);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public Resp()
    {
      GMTrace.i(28991029248L, 216);
      GMTrace.o(28991029248L, 216);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(29125246976L, 217);
      fromBundle(paramBundle);
      GMTrace.o(29125246976L, 217);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(29662117888L, 221);
      GMTrace.o(29662117888L, 221);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(29393682432L, 219);
      super.fromBundle(paramBundle);
      GMTrace.o(29393682432L, 219);
    }
    
    public int getType()
    {
      GMTrace.i(29259464704L, 218);
      GMTrace.o(29259464704L, 218);
      return 2;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(29527900160L, 220);
      super.toBundle(paramBundle);
      GMTrace.o(29527900160L, 220);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\modelmsg\SendMessageToWX.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */