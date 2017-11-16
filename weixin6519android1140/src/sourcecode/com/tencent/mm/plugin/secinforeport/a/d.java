package com.tencent.mm.plugin.secinforeport.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public enum d
  implements c
{
  private static c oFc;
  
  static
  {
    GMTrace.i(17524137656320L, 130565);
    oFb = new d("INSTANCE");
    oFd = new d[] { oFb };
    oFc = new a();
    GMTrace.o(17524137656320L, 130565);
  }
  
  private d()
  {
    GMTrace.i(17523466567680L, 130560);
    GMTrace.o(17523466567680L, 130560);
  }
  
  public static void a(c paramc)
  {
    GMTrace.i(17523600785408L, 130561);
    if (paramc != null) {
      oFc = paramc;
    }
    GMTrace.o(17523600785408L, 130561);
  }
  
  public final boolean F(int paramInt, long paramLong)
  {
    GMTrace.i(20977962450944L, 156298);
    boolean bool = oFc.F(paramInt, paramLong);
    GMTrace.o(20977962450944L, 156298);
    return bool;
  }
  
  public final void Gj(String paramString)
  {
    GMTrace.i(18975433949184L, 141378);
    oFc.Gj(paramString);
    GMTrace.o(18975433949184L, 141378);
  }
  
  public final void Gk(String paramString)
  {
    GMTrace.i(20149033762816L, 150122);
    oFc.Gk(paramString);
    GMTrace.o(20149033762816L, 150122);
  }
  
  public final void bI(String paramString, int paramInt)
  {
    GMTrace.i(18975568166912L, 141379);
    oFc.bI(paramString, paramInt);
    GMTrace.o(18975568166912L, 141379);
  }
  
  public final void bed()
  {
    GMTrace.i(20978096668672L, 156299);
    oFc.bed();
    GMTrace.o(20978096668672L, 156299);
  }
  
  private static final class a
    implements c
  {
    public a()
    {
      GMTrace.i(17522258608128L, 130551);
      GMTrace.o(17522258608128L, 130551);
    }
    
    public final boolean F(int paramInt, long paramLong)
    {
      GMTrace.i(20978633539584L, 156303);
      w.w("MicroMsg.SecInfoReporter", "!! Dummy implementation !!");
      GMTrace.o(20978633539584L, 156303);
      return false;
    }
    
    public final void Gj(String paramString)
    {
      GMTrace.i(18975970820096L, 141382);
      w.w("MicroMsg.SecInfoReporter", "!! Dummy implementation !!");
      GMTrace.o(18975970820096L, 141382);
    }
    
    public final void Gk(String paramString)
    {
      GMTrace.i(20149302198272L, 150124);
      w.w("MicroMsg.SecInfoReporter", "!! Dummy implementation !!");
      GMTrace.o(20149302198272L, 150124);
    }
    
    public final void bI(String paramString, int paramInt)
    {
      GMTrace.i(18976105037824L, 141383);
      w.w("MicroMsg.SecInfoReporter", "!! Dummy implementation !!");
      GMTrace.o(18976105037824L, 141383);
    }
    
    public final void bed()
    {
      GMTrace.i(20978767757312L, 156304);
      w.w("MicroMsg.SecInfoReporter", "!! Dummy implementation !!");
      GMTrace.o(20978767757312L, 156304);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\secinforeport\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */