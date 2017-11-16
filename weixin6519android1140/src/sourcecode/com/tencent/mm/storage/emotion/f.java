package com.tencent.mm.storage.emotion;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

public final class f
  extends i<e>
  implements f.a
{
  public static final String[] fTX;
  private com.tencent.mm.sdk.e.e fTZ;
  
  static
  {
    GMTrace.i(1561220612096L, 11632);
    fTX = new String[] { i.a(e.fTp, "EmojiSuggestDescInfo") };
    GMTrace.o(1561220612096L, 11632);
  }
  
  public f(com.tencent.mm.sdk.e.e parame)
  {
    this(parame, e.fTp, "EmojiSuggestDescInfo");
    GMTrace.i(1560683741184L, 11628);
    GMTrace.o(1560683741184L, 11628);
  }
  
  private f(com.tencent.mm.sdk.e.e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(1560817958912L, 11629);
    this.fTZ = parame;
    GMTrace.o(1560817958912L, 11629);
  }
  
  public final int a(com.tencent.mm.bu.f paramf)
  {
    GMTrace.i(1560952176640L, 11630);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1560952176640L, 11630);
    return 0;
  }
  
  public final boolean ag(ArrayList<ArrayList<String>> paramArrayList)
  {
    GMTrace.i(1561086394368L, 11631);
    if (paramArrayList.isEmpty())
    {
      w.i("MicroMsg.emoji.EmojiDescMapStorage", "group list is null.");
      GMTrace.o(1561086394368L, 11631);
      return false;
    }
    g localg;
    if ((this.fTZ instanceof g)) {
      localg = (g)this.fTZ;
    }
    for (long l = localg.cE(Thread.currentThread().getId());; l = -1L)
    {
      this.fTZ.delete("EmojiSuggestDescInfo", "", null);
      paramArrayList = paramArrayList.iterator();
      int i = 0;
      if (paramArrayList.hasNext())
      {
        Object localObject = (ArrayList)paramArrayList.next();
        if ((localObject == null) || (((ArrayList)localObject).isEmpty())) {
          break label231;
        }
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if (!bg.nm(str))
          {
            w.d("MicroMsg.emoji.EmojiDescMapStorage", "insert groupID%s, word:%s", new Object[] { String.valueOf(i), str });
            b(new e(String.valueOf(i), str));
          }
        }
        i += 1;
      }
      label231:
      for (;;)
      {
        break;
        if (localg != null) {
          localg.aL(l);
        }
        GMTrace.o(1561086394368L, 11631);
        return false;
      }
      localg = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */