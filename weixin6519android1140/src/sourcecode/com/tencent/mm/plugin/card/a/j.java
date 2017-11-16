package com.tencent.mm.plugin.card.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.pluginsdk.p.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;

public final class j
  implements p.c
{
  public j()
  {
    GMTrace.i(5114366525440L, 38105);
    GMTrace.o(5114366525440L, 38105);
  }
  
  public final boolean ajW()
  {
    GMTrace.i(5114500743168L, 38106);
    boolean bool = l.amV();
    GMTrace.o(5114500743168L, 38106);
    return bool;
  }
  
  public final boolean ajX()
  {
    GMTrace.i(5114634960896L, 38107);
    boolean bool = l.amX();
    GMTrace.o(5114634960896L, 38107);
    return bool;
  }
  
  public final String ajY()
  {
    GMTrace.i(5114769178624L, 38108);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(w.a.vra, null);
    GMTrace.o(5114769178624L, 38108);
    return str;
  }
  
  public final int ajZ()
  {
    int j = 0;
    int i = 0;
    GMTrace.i(5114903396352L, 38109);
    Object localObject1 = al.akn();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" where (status=0 OR ").append("status=5) and (block_mask").append("= '1' OR block_mask= '0' ").append(")");
    localObject2 = "select count(*) from UserCardInfo" + ((StringBuilder)localObject2).toString();
    localObject1 = ((com.tencent.mm.plugin.card.model.c)localObject1).fTZ.a((String)localObject2, null, 2);
    if (localObject1 == null) {}
    for (;;)
    {
      w.i("MicroMsg.CardMgrImpl", "getGiftCardCount:" + i);
      GMTrace.o(5114903396352L, 38109);
      return i;
      i = j;
      if (((Cursor)localObject1).moveToFirst()) {
        i = ((Cursor)localObject1).getInt(0);
      }
      ((Cursor)localObject1).close();
    }
  }
  
  public final boolean lE(int paramInt)
  {
    GMTrace.i(5115037614080L, 38110);
    boolean bool = l.lE(paramInt);
    GMTrace.o(5115037614080L, 38110);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */