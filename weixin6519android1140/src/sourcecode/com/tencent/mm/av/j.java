package com.tencent.mm.av;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;

public final class j
  extends com.tencent.mm.sdk.e.j
  implements e
{
  public static final String[] fTX;
  g goN;
  
  static
  {
    GMTrace.i(13186354905088L, 98246);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS oplog2 ( id INTEGER PRIMARY KEY , inserTime long , cmdId int , buffer blob , reserved1 int , reserved2 long , reserved3 text , reserved4 text ) " };
    GMTrace.o(13186354905088L, 98246);
  }
  
  public j(g paramg)
  {
    GMTrace.i(13186086469632L, 98244);
    this.goN = paramg;
    GMTrace.o(13186086469632L, 98244);
  }
  
  public final boolean a(e.b paramb)
  {
    GMTrace.i(13186220687360L, 98245);
    if (paramb == null)
    {
      GMTrace.o(13186220687360L, 98245);
      return true;
    }
    if (this.goN.delete("oplog2", "id= ? AND inserTime= ?", new String[] { paramb.id, paramb.gFw }) >= 0)
    {
      GMTrace.o(13186220687360L, 98245);
      return true;
    }
    GMTrace.o(13186220687360L, 98245);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\av\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */