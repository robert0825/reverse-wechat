package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class p
  extends i<o>
{
  public static final String[] fTX;
  e fTZ;
  
  static
  {
    GMTrace.i(6275081437184L, 46753);
    fTX = new String[] { i.a(o.fTp, "FavSearchInfo") };
    GMTrace.o(6275081437184L, 46753);
  }
  
  public p(e parame)
  {
    super(parame, o.fTp, "FavSearchInfo", null);
    GMTrace.i(6274678784000L, 46750);
    this.fTZ = parame;
    GMTrace.o(6274678784000L, 46750);
  }
  
  public final void ch(long paramLong)
  {
    GMTrace.i(6274813001728L, 46751);
    String str = "delete from FavSearchInfo where localId = " + paramLong;
    this.fTZ.eZ("FavSearchInfo", str);
    GMTrace.o(6274813001728L, 46751);
  }
  
  public final o ci(long paramLong)
  {
    o localo = null;
    GMTrace.i(6274947219456L, 46752);
    Object localObject = "select * from FavSearchInfo where localId = " + paramLong;
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (localObject == null)
    {
      GMTrace.o(6274947219456L, 46752);
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      localo = new o();
      localo.b((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    GMTrace.o(6274947219456L, 46752);
    return localo;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */