package com.tencent.mm.plugin.fps_lighter.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.gmtrace.GMTraceHandler;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class e
  extends GMTraceHandler
{
  public boolean isStart;
  public int lmO;
  private int lmP;
  c lmQ;
  
  public e(c paramc)
  {
    GMTrace.i(5221203836928L, 38901);
    this.isStart = false;
    this.lmQ = paramc;
    GMTrace.o(5221203836928L, 38901);
  }
  
  public static int aAj()
  {
    GMTrace.i(5221606490112L, 38904);
    int i = GMTrace.getMainThreadIndex();
    GMTrace.o(5221606490112L, 38904);
    return i;
  }
  
  public final void aAk()
  {
    GMTrace.i(5221740707840L, 38905);
    if (!this.isStart)
    {
      w.e("MicroMsg.FpsGMTraceHandler", "its never start!");
      GMTrace.o(5221740707840L, 38905);
      return;
    }
    this.lmO = GMTrace.getMainThreadIndex();
    GMTrace.o(5221740707840L, 38905);
  }
  
  public final List<Integer> getPointId()
  {
    GMTrace.i(5221874925568L, 38906);
    GMTrace.o(5221874925568L, 38906);
    return null;
  }
  
  public final void postBufferData(boolean paramBoolean)
  {
    GMTrace.i(5222143361024L, 38908);
    GMTrace.o(5222143361024L, 38908);
  }
  
  public final void stopTrace()
  {
    GMTrace.i(5221472272384L, 38903);
    if (!this.isStart)
    {
      GMTrace.o(5221472272384L, 38903);
      return;
    }
    GMTrace.stopTrace();
    this.lmP = GMTrace.getMainThreadIndex();
    w.i("MicroMsg.FpsGMTraceHandler", "[stopTrace] start:%s end:%s", new Object[] { Integer.valueOf(this.lmO), Integer.valueOf(this.lmP) });
    this.isStart = false;
    GMTrace.o(5221472272384L, 38903);
  }
  
  public final void syncDo(int paramInt, long paramLong)
  {
    GMTrace.i(5222009143296L, 38907);
    GMTrace.o(5222009143296L, 38907);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */