package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class ak
  extends i<aj>
{
  public static final String[] fTX;
  e fTZ;
  
  static
  {
    GMTrace.i(4916126941184L, 36628);
    fTX = new String[] { i.a(aj.fTp, "PendingCardId") };
    GMTrace.o(4916126941184L, 36628);
  }
  
  public ak(e parame)
  {
    super(parame, aj.fTp, "PendingCardId", null);
    GMTrace.i(4915858505728L, 36626);
    this.fTZ = parame;
    GMTrace.o(4915858505728L, 36626);
  }
  
  public final List<aj> akk()
  {
    GMTrace.i(4915992723456L, 36627);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.fTZ.a("select * from PendingCardId where retryCount < 10", null, 2);
    while (localCursor.moveToNext())
    {
      aj localaj = new aj();
      localaj.b(localCursor);
      localArrayList.add(localaj);
    }
    localCursor.close();
    w.d("MicroMsg.PendingCardIdInfoStorage", "getAll, count = %d", new Object[] { Integer.valueOf(localArrayList.size()) });
    GMTrace.o(4915992723456L, 36627);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */