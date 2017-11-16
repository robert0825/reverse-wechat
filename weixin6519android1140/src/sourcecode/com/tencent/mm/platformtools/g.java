package com.tencent.mm.platformtools;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import junit.framework.Assert;

public final class g
{
  public static SparseArray<a> hiR;
  
  static
  {
    GMTrace.i(13455461449728L, 100251);
    hiR = new SparseArray();
    GMTrace.o(13455461449728L, 100251);
  }
  
  public static final a a(int paramInt, String paramString, HashMap<Integer, g.d> paramHashMap, boolean paramBoolean)
  {
    GMTrace.i(13455193014272L, 100249);
    if ((!bg.nm(paramString)) && (paramHashMap != null)) {}
    int i;
    a locala;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      i = paramString.hashCode();
      locala = (a)hiR.get(i);
      if (locala != null) {
        break label178;
      }
      locala = new a(paramString, paramBoolean);
      if (!paramBoolean) {
        break;
      }
      h.xw();
      if (locala.a("", paramString, "", a.ww(), p.sZ(), paramHashMap, true)) {
        break label128;
      }
      throw new b((byte)0);
    }
    if (!locala.b(paramString, paramHashMap, true, false)) {
      throw new b((byte)0);
    }
    label128:
    hiR.put(i, locala);
    for (paramString = locala;; paramString = locala)
    {
      w.d("MicroMsg.GeneralDBHelper", "addRef %d", new Object[] { Integer.valueOf(paramInt) });
      paramString.hiT.put(paramInt, true);
      GMTrace.o(13455193014272L, 100249);
      return paramString;
      label178:
      if (paramBoolean == locala.hiS) {
        paramBoolean = true;
      }
      long l;
      for (;;)
      {
        Assert.assertTrue(paramBoolean);
        l = locala.cE(-1L);
        paramString = paramHashMap.values().iterator();
        for (;;)
        {
          if (paramString.hasNext())
          {
            paramHashMap = ((g.d)paramString.next()).rf();
            int j = paramHashMap.length;
            i = 0;
            label244:
            if (i < j)
            {
              String str = paramHashMap[i];
              w.d("MicroMsg.GeneralDBHelper", "init sql:" + str);
              try
              {
                locala.eZ(null, str);
                i += 1;
                break label244;
                paramBoolean = false;
              }
              catch (Exception localException)
              {
                for (;;)
                {
                  Assert.assertTrue("CreateTable failed:[" + str + "][" + localException.getMessage() + "]", false);
                }
              }
            }
          }
        }
      }
      locala.aL(l);
    }
  }
  
  public static final class a
    extends com.tencent.mm.bu.g
  {
    public final boolean hiS;
    SparseBooleanArray hiT;
    private final String path;
    
    public a(String paramString, boolean paramBoolean)
    {
      GMTrace.i(13451703353344L, 100223);
      this.hiT = new SparseBooleanArray();
      w.d("MicroMsg.GeneralDBHelper", "create db %s", new Object[] { paramString });
      this.hiS = paramBoolean;
      this.path = paramString;
      GMTrace.o(13451703353344L, 100223);
    }
    
    @Deprecated
    public final void dk(String paramString)
    {
      GMTrace.i(13452106006528L, 100226);
      w.e("MicroMsg.GeneralDBHelper", "forbid to use this method");
      if (this.hiT.size() <= 1) {
        super.dk(paramString);
      }
      GMTrace.o(13452106006528L, 100226);
    }
    
    public final void hA(int paramInt)
    {
      GMTrace.i(13451837571072L, 100224);
      w.d("MicroMsg.GeneralDBHelper", "try close db %d", new Object[] { Integer.valueOf(paramInt) });
      this.hiT.delete(paramInt);
      if (this.hiT.size() <= 0)
      {
        w.d("MicroMsg.GeneralDBHelper", "close db %d succ", new Object[] { Integer.valueOf(paramInt) });
        super.yE();
        g.hiR.remove(this.path.hashCode());
      }
      GMTrace.o(13451837571072L, 100224);
    }
    
    @Deprecated
    public final void yE()
    {
      GMTrace.i(13451971788800L, 100225);
      w.e("MicroMsg.GeneralDBHelper", "forbid to use this method %s", new Object[] { bg.bQW() });
      if (this.hiT.size() <= 1) {
        super.yE();
      }
      GMTrace.o(13451971788800L, 100225);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */