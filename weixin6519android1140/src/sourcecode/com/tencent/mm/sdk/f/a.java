package com.tencent.mm.sdk.f;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.atomic.AtomicInteger;
import junit.framework.Assert;

public final class a
{
  private ThreadGroup gKe;
  private final AtomicInteger vmJ;
  private e.b vmK;
  
  a(e.b paramb)
  {
    GMTrace.i(13982131814400L, 104175);
    this.vmJ = new AtomicInteger(1);
    this.vmK = paramb;
    this.gKe = new ThreadGroup("MM_FREE_THREAD_GROUP");
    GMTrace.o(13982131814400L, 104175);
  }
  
  final HandlerThread cJ(String paramString, int paramInt)
  {
    GMTrace.i(13982266032128L, 104176);
    Assert.assertNotNull("newThread arg name is null!", paramString);
    paramString = new a("MM_Thread_Pool_Free_Handler_Thread#" + this.vmJ.getAndIncrement() + "#" + paramString, paramInt);
    GMTrace.o(13982266032128L, 104176);
    return paramString;
  }
  
  static final class a
    extends HandlerThread
  {
    a(String paramString, int paramInt)
    {
      super(paramInt);
      GMTrace.i(13981192290304L, 104168);
      GMTrace.o(13981192290304L, 104168);
    }
    
    public final void run()
    {
      GMTrace.i(13981460725760L, 104170);
      super.run();
      GMTrace.o(13981460725760L, 104170);
    }
    
    public final void start()
    {
      GMTrace.i(13981326508032L, 104169);
      super.start();
      GMTrace.o(13981326508032L, 104169);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */