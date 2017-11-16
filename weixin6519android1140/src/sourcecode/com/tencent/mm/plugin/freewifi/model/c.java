package com.tencent.mm.plugin.freewifi.model;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;

public final class c
{
  private HandlerThread lqa;
  private ae lqb;
  
  public c()
  {
    GMTrace.i(7131256324096L, 53132);
    GMTrace.o(7131256324096L, 53132);
  }
  
  public final ae aAR()
  {
    GMTrace.i(7131390541824L, 53133);
    if (this.lqa == null)
    {
      this.lqa = e.SV("FreeWifiHandlerThread_handlerThread");
      this.lqa.start();
    }
    if (this.lqb == null) {
      this.lqb = new ae(this.lqa.getLooper());
    }
    ae localae = this.lqb;
    GMTrace.o(7131390541824L, 53133);
    return localae;
  }
  
  public final void release()
  {
    GMTrace.i(7131524759552L, 53134);
    if (this.lqa != null)
    {
      this.lqa.quit();
      this.lqa = null;
    }
    this.lqb = null;
    GMTrace.o(7131524759552L, 53134);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */