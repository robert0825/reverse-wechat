package com.tencent.mm.plugin.exdevice.f.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.exdevice.f.a.j;
import com.tencent.mm.plugin.exdevice.f.a.l;
import com.tencent.mm.plugin.exdevice.f.a.m;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.ad.e
{
  public f kCw;
  public com.tencent.mm.plugin.exdevice.f.a.f kCx;
  
  public c()
  {
    GMTrace.i(11195637563392L, 83414);
    w.d("MicroMsg.ExdeviceRankInfoManager", "hy: constructing manager....");
    at.wS().a(1042, this);
    at.wS().a(1041, this);
    at.wS().a(1043, this);
    at.wS().a(1040, this);
    GMTrace.o(11195637563392L, 83414);
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(14877900931072L, 110849);
    at.wS().a(new l(paramString3, paramString2, paramInt, paramString1), 0);
    GMTrace.o(14877900931072L, 110849);
  }
  
  public static void c(String paramString, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList)
  {
    GMTrace.i(11195905998848L, 83416);
    com.tencent.mm.plugin.exdevice.f.b.b.d locald = ad.atS();
    if (!bg.nm(paramString)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (paramArrayList == null) {
        break label222;
      }
      String str = String.format("select COUNT(*) from %s where %s = ?", new Object[] { "HardDeviceRankInfo", "rankID" });
      paramString = locald.fTZ.a(str, new String[] { bg.aq(paramString, "") }, 2);
      if (paramString != null) {
        break;
      }
      w.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
      i = 0;
      if (i != 0) {
        break label180;
      }
      paramString = paramArrayList.iterator();
      while (paramString.hasNext()) {
        locald.a((com.tencent.mm.plugin.exdevice.f.b.a.d)paramString.next(), false);
      }
    }
    if (paramString.moveToFirst()) {}
    for (int i = paramString.getInt(0);; i = 0)
    {
      paramString.close();
      break;
      w.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
    }
    GMTrace.o(11195905998848L, 83416);
    return;
    label180:
    paramString = paramArrayList.iterator();
    while (paramString.hasNext()) {
      locald.b((com.tencent.mm.plugin.exdevice.f.b.a.d)paramString.next(), false);
    }
    GMTrace.o(11195905998848L, 83416);
    return;
    label222:
    w.w("MicroMsg.ExdeviceRankInfoStg", "hy: data is null. abort insert");
    GMTrace.o(11195905998848L, 83416);
  }
  
  public static ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> wL(String paramString)
  {
    com.tencent.mm.plugin.exdevice.f.b.a.d locald = null;
    GMTrace.i(11195771781120L, 83415);
    w.d("MicroMsg.ExdeviceRankInfoManager", "hy: getting like info...");
    if (!bg.nm(paramString))
    {
      Object localObject = ad.atS();
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.ExdeviceRankInfoStg", "hy: param error");
        GMTrace.o(11195771781120L, 83415);
        return null;
      }
      String str = String.format("select *, rowid from %s where %s = ? order by %s desc", new Object[] { "HardDeviceRankInfo", "rankID", "score" });
      localObject = ((com.tencent.mm.plugin.exdevice.f.b.b.d)localObject).fTZ.a(str, new String[] { bg.aq(paramString, "") }, 2);
      if (localObject == null)
      {
        w.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
        GMTrace.o(11195771781120L, 83415);
        return null;
      }
      if (((Cursor)localObject).moveToFirst())
      {
        paramString = new ArrayList();
        do
        {
          locald = new com.tencent.mm.plugin.exdevice.f.b.a.d();
          locald.b((Cursor)localObject);
          paramString.add(locald);
        } while (((Cursor)localObject).moveToNext());
      }
      for (;;)
      {
        ((Cursor)localObject).close();
        GMTrace.o(11195771781120L, 83415);
        return paramString;
        w.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
        paramString = locald;
      }
    }
    w.w("MicroMsg.ExdeviceRankInfoManager", "hy: param error");
    GMTrace.o(11195771781120L, 83415);
    return null;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11196040216576L, 83417);
    w.d("MicroMsg.ExdeviceRankInfoManager", "hy: netscene back.err type: %d, err code: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramk instanceof j))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error.");
        GMTrace.o(11196040216576L, 83417);
      }
    }
    else if ((paramk instanceof l))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
        GMTrace.o(11196040216576L, 83417);
      }
    }
    else if (((paramk instanceof m)) && ((paramInt1 != 0) || (paramInt2 != 0))) {
      w.w("MicroMsg.ExdeviceRankInfoManager", "hy: scene error");
    }
    GMTrace.o(11196040216576L, 83417);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */