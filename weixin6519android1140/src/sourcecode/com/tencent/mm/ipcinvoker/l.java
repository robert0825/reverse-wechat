package com.tencent.mm.ipcinvoker;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.concurrent.ExecutorService;

class l
{
  private static volatile l fVz;
  private ae fVA;
  private m fVB;
  private ae mHandler;
  private HandlerThread mHandlerThread;
  
  private l()
  {
    GMTrace.i(18711427678208L, 139411);
    this.mHandlerThread = e.SV("IPCThreadCaller#Worker-" + hashCode());
    this.mHandlerThread.start();
    this.mHandler = new ae(this.mHandlerThread.getLooper());
    this.fVA = new ae(Looper.getMainLooper());
    this.fVB = m.vT();
    GMTrace.o(18711427678208L, 139411);
  }
  
  public static boolean d(Runnable paramRunnable)
  {
    GMTrace.i(18711561895936L, 139412);
    vR().fVB.fVD.execute(paramRunnable);
    GMTrace.o(18711561895936L, 139412);
    return true;
  }
  
  private static l vR()
  {
    GMTrace.i(18711293460480L, 139410);
    if (fVz == null) {}
    try
    {
      if (fVz == null) {
        fVz = new l();
      }
      l locall = fVz;
      GMTrace.o(18711293460480L, 139410);
      return locall;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */