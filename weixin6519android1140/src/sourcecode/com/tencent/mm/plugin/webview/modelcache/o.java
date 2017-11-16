package com.tencent.mm.plugin.webview.modelcache;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.bg;

public final class o
{
  public final j rFU;
  public final SparseArray<Object> rFV;
  public final SparseArray<Boolean> rFW;
  
  public o()
  {
    GMTrace.i(12366284587008L, 92136);
    this.rFU = new j();
    this.rFV = new SparseArray();
    this.rFW = new SparseArray();
    GMTrace.o(12366284587008L, 92136);
  }
  
  public static boolean a(String paramString, d paramd, int paramInt)
  {
    GMTrace.i(12366418804736L, 92137);
    paramd = a.rFX;
    bg.nm(paramString);
    GMTrace.o(12366418804736L, 92137);
    return false;
  }
  
  private static final class a
  {
    public static final o rFX;
    
    static
    {
      GMTrace.i(12358365741056L, 92077);
      rFX = new o();
      GMTrace.o(12358365741056L, 92077);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */