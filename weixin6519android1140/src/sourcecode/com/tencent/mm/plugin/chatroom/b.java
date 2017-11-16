package com.tencent.mm.plugin.chatroom;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.storage.r;
import com.tencent.mm.y.ae;
import java.util.HashMap;

public final class b
  implements com.tencent.mm.kernel.api.bucket.a, d, com.tencent.mm.kernel.c.a, com.tencent.mm.plugin.chatroom.b.b
{
  private r jMC;
  
  public b()
  {
    GMTrace.i(14584098324480L, 108660);
    GMTrace.o(14584098324480L, 108660);
  }
  
  public final ae c(g paramg)
  {
    GMTrace.i(17857266057216L, 133047);
    paramg = new r(paramg);
    GMTrace.o(17857266057216L, 133047);
    return paramg;
  }
  
  public final HashMap<Integer, g.d> collectDatabaseFactory()
  {
    GMTrace.i(16419257319424L, 122333);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("CHATROOM_MEMBERS_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(16419123101696L, 122332);
        String[] arrayOfString = r.fTX;
        GMTrace.o(16419123101696L, 122332);
        return arrayOfString;
      }
    });
    GMTrace.o(16419257319424L, 122333);
    return localHashMap;
  }
  
  public final void onDataBaseClosed(g paramg1, g paramg2)
  {
    GMTrace.i(14584903630848L, 108666);
    GMTrace.o(14584903630848L, 108666);
  }
  
  public final void onDataBaseOpened(g paramg1, g paramg2)
  {
    GMTrace.i(14584500977664L, 108663);
    this.jMC = new r(paramg1);
    GMTrace.o(14584500977664L, 108663);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */