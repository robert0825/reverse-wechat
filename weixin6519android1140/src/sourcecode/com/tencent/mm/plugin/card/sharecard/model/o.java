package com.tencent.mm.plugin.card.sharecard.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class o
  extends i<n>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(5072759029760L, 37795);
    fTX = new String[] { i.a(n.fTp, "ShareCardSyncItemInfo") };
    GMTrace.o(5072759029760L, 37795);
  }
  
  public o(e parame)
  {
    super(parame, n.fTp, "ShareCardSyncItemInfo", null);
    GMTrace.i(5072490594304L, 37793);
    this.fTZ = parame;
    GMTrace.o(5072490594304L, 37793);
  }
  
  public final List<n> akk()
  {
    GMTrace.i(5072624812032L, 37794);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.fTZ.a("select * from ShareCardSyncItemInfo where retryCount < 10", null, 2);
    while (localCursor.moveToNext())
    {
      n localn = new n();
      localn.b(localCursor);
      localArrayList.add(localn);
    }
    localCursor.close();
    w.d("MicroMsg.ShareCardSyncItemInfoStorage", "getAll, share card count = %d", new Object[] { Integer.valueOf(localArrayList.size()) });
    GMTrace.o(5072624812032L, 37794);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */