package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import java.net.URLEncoder;

public class HandleScanResult
{
  public HandleScanResult()
  {
    GMTrace.i(16777216000L, 125);
    GMTrace.o(16777216000L, 125);
  }
  
  public static class Req
    extends BaseReq
  {
    private static final int MAX_URL_LENGHT = 10240;
    public String scanResult;
    
    public Req()
    {
      GMTrace.i(15435038720L, 115);
      GMTrace.o(15435038720L, 115);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(15703474176L, 117);
      if ((this.scanResult == null) || (this.scanResult.length() < 0))
      {
        GMTrace.o(15703474176L, 117);
        return false;
      }
      if (this.scanResult.length() > 10240)
      {
        GMTrace.o(15703474176L, 117);
        return false;
      }
      GMTrace.o(15703474176L, 117);
      return true;
    }
    
    public int getType()
    {
      GMTrace.i(15569256448L, 116);
      GMTrace.o(15569256448L, 116);
      return 17;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(15837691904L, 118);
      super.toBundle(paramBundle);
      paramBundle.putString("_wxapi_scan_qrcode_result", URLEncoder.encode(this.scanResult));
      GMTrace.o(15837691904L, 118);
    }
  }
  
  public static class Resp
    extends BaseResp
  {
    public Resp()
    {
      GMTrace.i(15971909632L, 119);
      GMTrace.o(15971909632L, 119);
    }
    
    public Resp(Bundle paramBundle)
    {
      GMTrace.i(16106127360L, 120);
      fromBundle(paramBundle);
      GMTrace.o(16106127360L, 120);
    }
    
    public boolean checkArgs()
    {
      GMTrace.i(16642998272L, 124);
      GMTrace.o(16642998272L, 124);
      return true;
    }
    
    public void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(16374562816L, 122);
      super.fromBundle(paramBundle);
      GMTrace.o(16374562816L, 122);
    }
    
    public int getType()
    {
      GMTrace.i(16240345088L, 121);
      GMTrace.o(16240345088L, 121);
      return 17;
    }
    
    public void toBundle(Bundle paramBundle)
    {
      GMTrace.i(16508780544L, 123);
      super.toBundle(paramBundle);
      GMTrace.o(16508780544L, 123);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\modelbiz\HandleScanResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */