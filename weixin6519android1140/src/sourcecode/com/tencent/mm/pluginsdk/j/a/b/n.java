package com.tencent.mm.pluginsdk.j.a.b;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aza;
import com.tencent.mm.protocal.c.azd;
import com.tencent.mm.protocal.c.azf;
import com.tencent.mm.protocal.c.azg;
import com.tencent.mm.protocal.c.ml;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class n
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  protected static final SparseArray<com.tencent.mm.pluginsdk.j.a.a.a> tqP;
  private volatile com.tencent.mm.ad.e fUd;
  protected final List<azg> tqO;
  
  static
  {
    GMTrace.i(16426639294464L, 122388);
    tqP = new SparseArray();
    GMTrace.o(16426639294464L, 122388);
  }
  
  public n()
  {
    GMTrace.i(850135089152L, 6334);
    this.tqO = new LinkedList();
    int[] arrayOfInt = i.tqs;
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfInt[i];
      Object localObject = (com.tencent.mm.pluginsdk.j.a.a.a)tqP.get(k);
      if ((localObject == null) || (!((com.tencent.mm.pluginsdk.j.a.a.a)localObject).kW(k)))
      {
        localObject = new azg();
        ((azg)localObject).jib = k;
        this.tqO.add(localObject);
      }
      i += 1;
    }
    GMTrace.o(850135089152L, 6334);
  }
  
  public static void a(com.tencent.mm.pluginsdk.j.a.a.a parama)
  {
    GMTrace.i(16426505076736L, 122387);
    tqP.put(39, parama);
    GMTrace.o(16426505076736L, 122387);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(850269306880L, 6335);
    this.fUd = parame1;
    w.d(getTag(), "before dispatch");
    int i = a(parame, bKj(), this);
    GMTrace.o(850269306880L, 6335);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(850403524608L, 6336);
    w.i(getTag(), "onGYNetEnd errType(%d), errCode(%d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (h.xw().wL())
    {
      long l = bg.Pu();
      h.xy().xh().a(w.a.vsK, Long.valueOf(l + 86400L));
    }
    String str;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = i(paramq);
      str = getTag();
      if (!bg.cc(paramArrayOfByte.udn)) {
        break label177;
      }
    }
    label177:
    for (paramq = "null";; paramq = String.valueOf(paramArrayOfByte.udn.size()))
    {
      w.i(str, "response.Res.size() = %s", new Object[] { paramq });
      if (!bg.cc(paramArrayOfByte.udn)) {
        com.tencent.mm.sdk.f.e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(861006725120L, 6415);
            Iterator localIterator = this.tqQ.iterator();
            if (localIterator.hasNext())
            {
              azf localazf = (azf)localIterator.next();
              Object localObject2 = n.this.getTag();
              int i = localazf.jib;
              if (bg.cc(localazf.uNB)) {}
              for (Object localObject1 = "null";; localObject1 = String.valueOf(localazf.uNB.size()))
              {
                w.i((String)localObject2, "resType(%d) responses.size() = %s", new Object[] { Integer.valueOf(i), localObject1 });
                if (bg.cc(localazf.uNB)) {
                  break;
                }
                localObject1 = localazf.uNB.iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  localObject2 = (aza)((Iterator)localObject1).next();
                  n.this.a(localazf.jib, (aza)localObject2);
                }
                break;
              }
            }
            GMTrace.o(861006725120L, 6415);
          }
        }, "NetSceneCheckResUpdate-ResponseHandlingThread");
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(850403524608L, 6336);
      return;
    }
  }
  
  public final void a(int paramInt, aza paramaza)
  {
    GMTrace.i(16011638079488L, 119296);
    if (paramaza == null)
    {
      GMTrace.o(16011638079488L, 119296);
      return;
    }
    w.i(getTag(), "resType = %d, subType = %d, res.Oper = %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramaza.uJY), Integer.valueOf(paramaza.urq) });
    if (paramaza.uNn != null) {
      w.i(getTag(), "resource.Info.FileFlag %d ", new Object[] { Integer.valueOf(paramaza.uNn.uNy) });
    }
    if (i.b.yV(paramaza.urq))
    {
      w.i(getTag(), "just do nothing");
      GMTrace.o(16011638079488L, 119296);
      return;
    }
    if (i.b.yW(paramaza.urq))
    {
      w.i(getTag(), "do cache");
      b.c.tqk.b(paramInt, paramaza, false);
    }
    if (i.b.yX(paramaza.urq))
    {
      w.i(getTag(), "do decrypt");
      b.c.tqk.c(paramInt, paramaza, false);
    }
    if (i.b.yY(paramaza.urq))
    {
      w.i(getTag(), "do delete");
      b.c.tqk.a(paramInt, paramaza, false);
    }
    GMTrace.o(16011638079488L, 119296);
  }
  
  protected abstract q bKj();
  
  protected abstract String getTag();
  
  protected abstract ml i(q paramq);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */