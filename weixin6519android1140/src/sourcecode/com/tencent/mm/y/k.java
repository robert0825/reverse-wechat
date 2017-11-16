package com.tencent.mm.y;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;

public final class k
{
  public static int zB()
  {
    GMTrace.i(616730460160L, 4595);
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      w.w("MicroMsg.BottleConversationLogic", "get Bottle Total Conversation Unread, but has not set uin");
      GMTrace.o(616730460160L, 4595);
      return 0;
    }
    Cursor localCursor = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().bTh();
    if ((localCursor != null) && (localCursor.getCount() > 0)) {
      localCursor.moveToFirst();
    }
    for (int i = localCursor.getInt(0);; i = 0)
    {
      if (localCursor != null) {
        localCursor.close();
      }
      GMTrace.o(616730460160L, 4595);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */