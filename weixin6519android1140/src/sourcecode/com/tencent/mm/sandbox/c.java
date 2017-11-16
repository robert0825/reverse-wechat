package com.tencent.mm.sandbox;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class c
{
  private static c veJ;
  private static Map<Integer, Boolean> veK;
  
  static
  {
    GMTrace.i(3558783057920L, 26515);
    veJ = null;
    veK = new HashMap();
    GMTrace.o(3558783057920L, 26515);
  }
  
  public static void f(int paramInt, Object paramObject)
  {
    GMTrace.i(3558514622464L, 26513);
    w.i("MicroMsg.SandBoxCore", "regLifeCycle, id=" + paramInt + ", class=%s", new Object[] { paramObject.getClass().getName() });
    veK.put(Integer.valueOf(paramInt), Boolean.valueOf(true));
    w.i("MicroMsg.SandBoxCore", "regLifeCycle, map size=" + veK.size());
    GMTrace.o(3558514622464L, 26513);
  }
  
  public static void g(int paramInt, Object paramObject)
  {
    GMTrace.i(3558648840192L, 26514);
    w.i("MicroMsg.SandBoxCore", "unregLifeCycle, id=" + paramInt + ", class=%s", new Object[] { paramObject.getClass().getName() });
    veK.remove(Integer.valueOf(paramInt));
    w.i("MicroMsg.SandBoxCore", "unregLifeCycle, map size=" + veK.size());
    if (veK.size() == 0)
    {
      Process.killProcess(Process.myPid());
      w.w("MicroMsg.SandBoxCore", "Sandbox exit Now.");
      w.bPN();
    }
    GMTrace.o(3558648840192L, 26514);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */