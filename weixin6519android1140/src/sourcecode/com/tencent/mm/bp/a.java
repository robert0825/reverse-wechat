package com.tencent.mm.bp;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.d;
import com.tencent.mm.api.k;
import com.tencent.mm.cache.ArtistCacheManager;
import com.tencent.mm.cache.g;
import com.tencent.mm.t.e;
import java.util.Iterator;
import java.util.Stack;

public final class a
  implements k
{
  private com.tencent.mm.bl.b evi;
  
  public a(com.tencent.mm.bl.b paramb)
  {
    GMTrace.i(19671487086592L, 146564);
    this.evi = paramb;
    GMTrace.o(19671487086592L, 146564);
  }
  
  public final int getTextColor()
  {
    GMTrace.i(19672560828416L, 146572);
    Object localObject1 = (com.tencent.mm.cache.c)ArtistCacheManager.rR().a(com.tencent.mm.d.a.eve);
    if (localObject1 == null)
    {
      GMTrace.o(19672560828416L, 146572);
      return 0;
    }
    localObject1 = ((com.tencent.mm.cache.c)localObject1).fMj;
    if (localObject1 != null)
    {
      localObject1 = ((Stack)localObject1).iterator();
      int i = 0;
      label128:
      for (;;)
      {
        j = i;
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        Object localObject2 = (com.tencent.mm.t.c)((Iterator)localObject1).next();
        if ((localObject2 instanceof e))
        {
          localObject2 = (e)localObject2;
          int[] arrayOfInt = com.tencent.mm.view.footer.a.xBe;
          j = 0;
          for (;;)
          {
            if (j >= arrayOfInt.length) {
              break label128;
            }
            if (((e)localObject2).rz == arrayOfInt[j])
            {
              i = 1 << j | i;
              break;
            }
            j += 1;
          }
        }
      }
    }
    int j = 0;
    GMTrace.o(19672560828416L, 146572);
    return j;
  }
  
  public final int oA()
  {
    GMTrace.i(19672023957504L, 146568);
    com.tencent.mm.cache.b localb = (com.tencent.mm.cache.b)ArtistCacheManager.rR().a(com.tencent.mm.d.a.evc);
    if (localb == null)
    {
      GMTrace.o(19672023957504L, 146568);
      return 0;
    }
    int i = localb.aJ(false);
    GMTrace.o(19672023957504L, 146568);
    return i;
  }
  
  public final int oB()
  {
    GMTrace.i(19672158175232L, 146569);
    int i = 0;
    Object localObject = (com.tencent.mm.cache.b)ArtistCacheManager.rR().a(com.tencent.mm.d.a.evc);
    if (localObject != null) {
      i = ((com.tencent.mm.cache.b)localObject).fMl + 0;
    }
    localObject = (g)ArtistCacheManager.rR().a(com.tencent.mm.d.a.evd);
    int j = i;
    if (localObject != null) {
      j = i + ((g)localObject).fMl;
    }
    GMTrace.o(19672158175232L, 146569);
    return j;
  }
  
  public final boolean oC()
  {
    GMTrace.i(19672292392960L, 146570);
    com.tencent.mm.cache.a locala = (com.tencent.mm.cache.a)ArtistCacheManager.rR().a(com.tencent.mm.d.a.evf);
    if (locala == null)
    {
      GMTrace.o(19672292392960L, 146570);
      return false;
    }
    if (locala.aJ(false) > 0)
    {
      GMTrace.o(19672292392960L, 146570);
      return true;
    }
    GMTrace.o(19672292392960L, 146570);
    return false;
  }
  
  public final boolean oD()
  {
    boolean bool2 = false;
    GMTrace.i(19672426610688L, 146571);
    com.tencent.mm.d.b localb = this.evi.b(d.eqC);
    boolean bool1 = bool2;
    if (localb != null)
    {
      bool1 = bool2;
      if (localb.pN() == com.tencent.mm.d.a.evf) {
        if (((com.tencent.mm.d.c)localb).evW <= 0) {
          break label63;
        }
      }
    }
    label63:
    for (bool1 = true;; bool1 = false)
    {
      GMTrace.o(19672426610688L, 146571);
      return bool1;
    }
  }
  
  public final int oE()
  {
    GMTrace.i(19672695046144L, 146573);
    Object localObject = (com.tencent.mm.cache.b)ArtistCacheManager.rR().a(com.tencent.mm.d.a.evc);
    if (localObject == null)
    {
      GMTrace.o(19672695046144L, 146573);
      return 0;
    }
    localObject = ((com.tencent.mm.cache.b)localObject).fMj;
    if (localObject != null)
    {
      localObject = ((Stack)localObject).iterator();
      int i = 0;
      label113:
      for (;;)
      {
        j = i;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        com.tencent.mm.t.b localb = (com.tencent.mm.t.b)((Iterator)localObject).next();
        int[] arrayOfInt = com.tencent.mm.view.footer.a.xBe;
        j = 0;
        for (;;)
        {
          if (j >= arrayOfInt.length) {
            break label113;
          }
          if (localb.rz == arrayOfInt[j])
          {
            i = 1 << j | i;
            break;
          }
          j += 1;
        }
      }
    }
    int j = 0;
    GMTrace.o(19672695046144L, 146573);
    return j;
  }
  
  public final boolean oF()
  {
    GMTrace.i(19672829263872L, 146574);
    com.tencent.mm.cache.b localb = (com.tencent.mm.cache.b)ArtistCacheManager.rR().a(com.tencent.mm.d.a.evc);
    g localg = (g)ArtistCacheManager.rR().a(com.tencent.mm.d.a.evd);
    com.tencent.mm.cache.a locala = (com.tencent.mm.cache.a)ArtistCacheManager.rR().a(com.tencent.mm.d.a.evf);
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)ArtistCacheManager.rR().a(com.tencent.mm.d.a.eve);
    if (((localb != null) && (localb.aJ(true) > 0)) || ((localg != null) && (localg.aJ(true) > 0)) || ((localc != null) && (localc.aJ(true) > 0)) || ((locala != null) && (locala.aJ(true) > 0)))
    {
      GMTrace.o(19672829263872L, 146574);
      return true;
    }
    GMTrace.o(19672829263872L, 146574);
    return false;
  }
  
  public final int ox()
  {
    GMTrace.i(19671621304320L, 146565);
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)ArtistCacheManager.rR().a(com.tencent.mm.d.a.eve);
    if (localc == null)
    {
      GMTrace.o(19671621304320L, 146565);
      return 0;
    }
    int i = localc.rY()[1];
    GMTrace.o(19671621304320L, 146565);
    return i;
  }
  
  public final int oy()
  {
    GMTrace.i(19671755522048L, 146566);
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)ArtistCacheManager.rR().a(com.tencent.mm.d.a.eve);
    if (localc == null)
    {
      GMTrace.o(19671755522048L, 146566);
      return 0;
    }
    int i = localc.rY()[0];
    GMTrace.o(19671755522048L, 146566);
    return i;
  }
  
  public final int oz()
  {
    GMTrace.i(19671889739776L, 146567);
    g localg = (g)ArtistCacheManager.rR().a(com.tencent.mm.d.a.evd);
    if (localg == null)
    {
      GMTrace.o(19671889739776L, 146567);
      return 0;
    }
    int i = localg.aJ(false);
    GMTrace.o(19671889739776L, 146567);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\bp\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */