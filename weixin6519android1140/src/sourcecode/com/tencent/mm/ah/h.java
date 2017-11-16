package com.tencent.mm.ah;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.af;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;

public final class h
  extends af
{
  public h()
  {
    GMTrace.i(4498709807104L, 33518);
    GMTrace.o(4498709807104L, 33518);
  }
  
  public final boolean fq(int paramInt)
  {
    GMTrace.i(4498978242560L, 33520);
    if ((paramInt != 0) && (paramInt < 620758015))
    {
      GMTrace.o(4498978242560L, 33520);
      return true;
    }
    GMTrace.o(4498978242560L, 33520);
    return false;
  }
  
  public final String getTag()
  {
    GMTrace.i(4498844024832L, 33519);
    GMTrace.o(4498844024832L, 33519);
    return "MicroMsg.App.SyncTopConversation";
  }
  
  public final void transfer(int paramInt)
  {
    GMTrace.i(4499112460288L, 33521);
    w.d("MicroMsg.App.SyncTopConversation", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    at.AR();
    Object localObject1 = c.yH();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("select username from rconversation");
    ((StringBuilder)localObject2).append(" where flag & 4611686018427387904").append(" != 0");
    w.d("MicroMsg.App.SyncTopConversation", "sql:%s", new Object[] { localObject2 });
    localObject1 = ((g)localObject1).a(((StringBuilder)localObject2).toString(), null, 2);
    if (localObject1 != null)
    {
      while (((Cursor)localObject1).moveToNext())
      {
        localObject2 = ((Cursor)localObject1).getString(0);
        w.v("MicroMsg.App.SyncTopConversation", "userName %s", new Object[] { localObject2 });
        s.n((String)localObject2, false);
      }
      ((Cursor)localObject1).close();
    }
    GMTrace.o(4499112460288L, 33521);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ah\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */