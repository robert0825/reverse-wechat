package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public class WXLaunchMiniProgram
{
  public WXLaunchMiniProgram()
  {
    GMTrace.i(17856058097664L, 133038);
    GMTrace.o(17856058097664L, 133038);
  }
  
  public static final class Req
    extends BaseReq
  {
    public static final int MINIPROGRAM_TYPE_PREVIEW = 2;
    public static final int MINIPROGRAM_TYPE_TEST = 1;
    public static final int MINIPTOGRAM_TYPE_RELEASE = 0;
    private static final String TAG = "MicroMsg.SDK.WXLaunchMiniProgram.Req";
    public int miniprogramType;
    public String path;
    public String userName;
    
    public Req()
    {
      GMTrace.i(17854715920384L, 133028);
      this.path = "";
      this.miniprogramType = 0;
      GMTrace.o(17854715920384L, 133028);
    }
    
    public final boolean checkArgs()
    {
      GMTrace.i(17854984355840L, 133030);
      if (d.a(this.userName))
      {
        Log.e("MicroMsg.SDK.WXLaunchMiniProgram.Req", "userName is null");
        GMTrace.o(17854984355840L, 133030);
        return false;
      }
      if ((this.miniprogramType < 0) || (this.miniprogramType > 2))
      {
        Log.e("MicroMsg.SDK.WXLaunchMiniProgram.Req", "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW");
        GMTrace.o(17854984355840L, 133030);
        return false;
      }
      GMTrace.o(17854984355840L, 133030);
      return true;
    }
    
    public final int getType()
    {
      GMTrace.i(17854850138112L, 133029);
      GMTrace.o(17854850138112L, 133029);
      return 19;
    }
    
    public final void toBundle(Bundle paramBundle)
    {
      GMTrace.i(17855118573568L, 133031);
      super.toBundle(paramBundle);
      paramBundle.putString("_launch_wxminiprogram_username", this.userName);
      paramBundle.putString("_launch_wxminiprogram_path", this.path);
      paramBundle.putInt("_launch_wxminiprogram_type", this.miniprogramType);
      GMTrace.o(17855118573568L, 133031);
    }
  }
  
  public static final class Resp
    extends BaseResp
  {
    public String extMsg;
    
    public Resp()
    {
      GMTrace.i(17855252791296L, 133032);
      GMTrace.o(17855252791296L, 133032);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(17855387009024L, 133033);
      fromBundle(paramBundle);
      GMTrace.o(17855387009024L, 133033);
    }
    
    public final boolean checkArgs()
    {
      GMTrace.i(17855923879936L, 133037);
      GMTrace.o(17855923879936L, 133037);
      return true;
    }
    
    public final void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(17855521226752L, 133034);
      super.fromBundle(paramBundle);
      this.extMsg = paramBundle.getString("_launch_wxminiprogram_ext_msg");
      GMTrace.o(17855521226752L, 133034);
    }
    
    public final int getType()
    {
      GMTrace.i(17855789662208L, 133036);
      GMTrace.o(17855789662208L, 133036);
      return 19;
    }
    
    public final void toBundle(Bundle paramBundle)
    {
      GMTrace.i(17855655444480L, 133035);
      super.toBundle(paramBundle);
      paramBundle.putString("_launch_wxminiprogram_ext_msg", this.extMsg);
      paramBundle.putInt("_wxapi_command_type", getType());
      GMTrace.o(17855655444480L, 133035);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\WXLaunchMiniProgram.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */