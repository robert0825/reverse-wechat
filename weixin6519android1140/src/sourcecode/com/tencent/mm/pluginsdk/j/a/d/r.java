package com.tencent.mm.pluginsdk.j.a.d;

import android.annotation.SuppressLint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class r
  extends i<q>
{
  public static final String[] fTX;
  private static final String trA;
  @SuppressLint({"UseSparseArrays"})
  private static final HashMap<Integer, g.d> trB;
  public final com.tencent.mm.bu.g goN;
  private final HashMap<String, Object> trC;
  
  static
  {
    GMTrace.i(881944690688L, 6571);
    fTX = new String[] { i.a(q.fTp, "ResDownloaderRecordTable") };
    trA = com.tencent.mm.storage.w.ghv + com.tencent.mm.a.g.n(String.format("mm%d", new Object[] { Integer.valueOf(Integer.MIN_VALUE) }).getBytes()) + "/";
    Object localObject = new HashMap();
    trB = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("RES_DOWNLOADER_RECORD_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(879260336128L, 6551);
        String[] arrayOfString = r.fTX;
        GMTrace.o(879260336128L, 6551);
        return arrayOfString;
      }
    });
    localObject = p.bKq().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Iterator)localObject).next();
    }
    GMTrace.o(881944690688L, 6571);
  }
  
  private r(com.tencent.mm.bu.g paramg)
  {
    super(paramg, q.fTp, "ResDownloaderRecordTable", null);
    GMTrace.i(880870948864L, 6563);
    this.trC = new HashMap();
    this.goN = paramg;
    paramg = p.bKq().iterator();
    while (paramg.hasNext()) {
      paramg.next();
    }
    GMTrace.o(880870948864L, 6563);
  }
  
  static r bKr()
  {
    GMTrace.i(881005166592L, 6564);
    try
    {
      new File(trA).mkdirs();
      Object localObject = new com.tencent.mm.bu.g();
      if (!((com.tencent.mm.bu.g)localObject).a(trA + "ResDown.db", trA + "EnResDown.db", -2147483648L, com.tencent.mm.compatible.d.p.sZ(), trB))
      {
        com.tencent.mm.sdk.platformtools.w.f("MicroMsg.ResDownloaderStorage", "res downloader db init failed");
        GMTrace.o(881005166592L, 6564);
        return null;
      }
      localObject = new r((com.tencent.mm.bu.g)localObject);
      GMTrace.o(881005166592L, 6564);
      return (r)localObject;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ResDownloaderStorage", "new storage failed, exception = %s", new Object[] { localException });
      GMTrace.o(881005166592L, 6564);
    }
    return null;
  }
  
  public final q OO(String paramString)
  {
    GMTrace.i(881542037504L, 6568);
    if (bg.nm(paramString))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ResDownloaderStorage", "query with null or nil urlKey, return null");
      GMTrace.o(881542037504L, 6568);
      return null;
    }
    q localq = new q();
    localq.field_urlKey_hashcode = paramString.hashCode();
    if (super.b(localq, new String[] { "urlKey_hashcode" }))
    {
      GMTrace.o(881542037504L, 6568);
      return localq;
    }
    GMTrace.o(881542037504L, 6568);
    return null;
  }
  
  public final boolean f(q paramq)
  {
    GMTrace.i(881273602048L, 6566);
    if (bg.nm(paramq.field_urlKey))
    {
      GMTrace.o(881273602048L, 6566);
      return false;
    }
    paramq.field_urlKey_hashcode = paramq.field_urlKey.hashCode();
    boolean bool = super.c(paramq, new String[] { "urlKey_hashcode" });
    GMTrace.o(881273602048L, 6566);
    return bool;
  }
  
  public final boolean g(q paramq)
  {
    GMTrace.i(881407819776L, 6567);
    if (bg.nm(paramq.field_urlKey))
    {
      GMTrace.o(881407819776L, 6567);
      return false;
    }
    paramq.field_urlKey_hashcode = paramq.field_urlKey.hashCode();
    boolean bool = super.b(paramq);
    GMTrace.o(881407819776L, 6567);
    return bool;
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(881139384320L, 6565);
    if (bg.nm(paramString))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ResDownloaderStorage", "delete with null or nil urlKey, return false");
      GMTrace.o(881139384320L, 6565);
      return false;
    }
    q localq = new q();
    localq.field_urlKey_hashcode = paramString.hashCode();
    boolean bool = super.a(localq, new String[] { "urlKey_hashcode" });
    GMTrace.o(881139384320L, 6565);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\d\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */