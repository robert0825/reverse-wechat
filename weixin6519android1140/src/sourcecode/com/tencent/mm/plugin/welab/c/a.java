package com.tencent.mm.plugin.welab.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  extends i<com.tencent.mm.plugin.welab.c.a.a>
{
  private e fTZ;
  
  public a(e parame)
  {
    super(parame, com.tencent.mm.plugin.welab.c.a.a.fTp, "LabAppInfo", null);
    GMTrace.i(15662000898048L, 116691);
    this.fTZ = parame;
    GMTrace.o(15662000898048L, 116691);
  }
  
  private boolean d(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    GMTrace.i(15662537768960L, 116695);
    com.tencent.mm.plugin.welab.c.a.a locala = new com.tencent.mm.plugin.welab.c.a.a();
    locala.field_LabsAppId = parama.field_LabsAppId;
    b(locala, new String[0]);
    if (parama.field_sequence <= locala.field_sequence)
    {
      w.i("LabAppInfoStorage", "sequence old origin.seq " + locala.field_sequence + " old.seq " + parama.field_sequence);
      GMTrace.o(15662537768960L, 116695);
      return false;
    }
    boolean bool = super.a(parama);
    GMTrace.o(15662537768960L, 116695);
    return bool;
  }
  
  public final List<com.tencent.mm.plugin.welab.c.a.a> bGD()
  {
    GMTrace.i(15662135115776L, 116692);
    Cursor localCursor = Mx();
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
    {
      com.tencent.mm.plugin.welab.c.a.a locala = new com.tencent.mm.plugin.welab.c.a.a();
      locala.b(localCursor);
      localArrayList.add(locala);
    }
    localCursor.close();
    GMTrace.o(15662135115776L, 116692);
    return localArrayList;
  }
  
  public final void bV(List<com.tencent.mm.plugin.welab.c.a.a> paramList)
  {
    GMTrace.i(15662269333504L, 116693);
    g localg;
    if ((this.fTZ instanceof g)) {
      localg = (g)this.fTZ;
    }
    for (long l = localg.cE(-1L);; l = 0L)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        c((com.tencent.mm.plugin.welab.c.a.a)paramList.next());
      }
      if (localg != null) {
        localg.aL(l);
      }
      GMTrace.o(15662269333504L, 116693);
      return;
      localg = null;
    }
  }
  
  public final void c(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    GMTrace.i(15662403551232L, 116694);
    if (!d(parama)) {
      b(parama);
    }
    GMTrace.o(15662403551232L, 116694);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */