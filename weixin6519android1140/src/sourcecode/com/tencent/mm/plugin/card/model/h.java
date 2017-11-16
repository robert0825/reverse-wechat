package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class h
  extends i<g>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(4917737553920L, 36640);
    fTX = new String[] { i.a(g.fTp, "CardMsgInfo") };
    GMTrace.o(4917737553920L, 36640);
  }
  
  public h(e parame)
  {
    super(parame, g.fTp, "CardMsgInfo", null);
    GMTrace.i(4917200683008L, 36636);
    this.fTZ = parame;
    GMTrace.o(4917200683008L, 36636);
  }
  
  public final int ME()
  {
    int i = 0;
    GMTrace.i(4917469118464L, 36638);
    Cursor localCursor = this.fTZ.a(" select count(*) from CardMsgInfo where read_state = ? ", new String[] { "1" }, 2);
    if (localCursor == null)
    {
      GMTrace.o(4917469118464L, 36638);
      return 0;
    }
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    GMTrace.o(4917469118464L, 36638);
    return i;
  }
  
  public final Cursor Mx()
  {
    GMTrace.i(4917334900736L, 36637);
    Cursor localCursor = this.fTZ.rawQuery("select * from CardMsgInfo order by time desc", null);
    GMTrace.o(4917334900736L, 36637);
    return localCursor;
  }
  
  public final boolean aki()
  {
    GMTrace.i(4917603336192L, 36639);
    boolean bool = this.fTZ.eZ("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
    GMTrace.o(4917603336192L, 36639);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */