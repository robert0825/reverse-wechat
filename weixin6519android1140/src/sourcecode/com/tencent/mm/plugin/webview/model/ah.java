package com.tencent.mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.platformtools.w;

public final class ah
{
  public static ah rEL;
  public boolean hasInit;
  public e rEM;
  
  static
  {
    GMTrace.i(20497999855616L, 152722);
    rEL = new ah();
    GMTrace.o(20497999855616L, 152722);
  }
  
  private ah()
  {
    GMTrace.i(12006178422784L, 89453);
    this.rEM = null;
    GMTrace.o(12006178422784L, 89453);
  }
  
  public static ah bCp()
  {
    GMTrace.i(12006312640512L, 89454);
    ah localah = rEL;
    GMTrace.o(12006312640512L, 89454);
    return localah;
  }
  
  public final void setNetWorkState(int paramInt)
  {
    GMTrace.i(12006446858240L, 89455);
    if (this.rEM == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.WebViewVideoProxy", "set networkd state = %d, callbacker == null ? %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      if (this.rEM == null) {
        break label111;
      }
      Bundle localBundle = new Bundle();
      localBundle.putInt("webview_video_proxy_net_state", paramInt);
      try
      {
        this.rEM.d(5005, localBundle);
        GMTrace.o(12006446858240L, 89455);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.WebViewVideoProxy", "set network state failed : %s", new Object[] { localException.getMessage() });
      }
    }
    label111:
    GMTrace.o(12006446858240L, 89455);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */