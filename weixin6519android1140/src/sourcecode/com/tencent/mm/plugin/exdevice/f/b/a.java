package com.tencent.mm.plugin.exdevice.f.b;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import junit.framework.Assert;

public final class a
{
  SparseArray<WeakReference<e>> kCv;
  
  public a()
  {
    GMTrace.i(11196174434304L, 83418);
    GMTrace.o(11196174434304L, 83418);
  }
  
  public final void a(e parame)
  {
    GMTrace.i(11196308652032L, 83419);
    if (parame != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.kCv == null) {
        this.kCv = new SparseArray();
      }
      this.kCv.put(parame.hashCode(), new WeakReference(parame));
      GMTrace.o(11196308652032L, 83419);
      return;
    }
  }
  
  public final void a(String paramString, d paramd)
  {
    GMTrace.i(11196577087488L, 83421);
    Assert.assertTrue(true);
    if (this.kCv == null)
    {
      w.d("MicroMsg.ExdeviceRankCallbackManager", "hy: callback pool is null. abort");
      GMTrace.o(11196577087488L, 83421);
      return;
    }
    int i = 0;
    while (i < this.kCv.size())
    {
      int j = this.kCv.keyAt(i);
      e locale = (e)((WeakReference)this.kCv.get(j)).get();
      if (locale != null) {
        locale.b(paramString, paramd);
      }
      i += 1;
    }
    w.d("MicroMsg.ExdeviceRankCallbackManager", "hy: publish end");
    GMTrace.o(11196577087488L, 83421);
  }
  
  public final void b(e parame)
  {
    GMTrace.i(11196442869760L, 83420);
    if (parame != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.kCv != null) {
        break;
      }
      w.d("MicroMsg.ExdeviceRankCallbackManager", "hy: callback pool is null. abort ");
      GMTrace.o(11196442869760L, 83420);
      return;
    }
    this.kCv.remove(parame.hashCode());
    GMTrace.o(11196442869760L, 83420);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */