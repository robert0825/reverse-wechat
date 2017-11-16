package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.f.b.a;
import com.tencent.mm.plugin.exdevice.f.b.d;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;

public final class e
  extends i<com.tencent.mm.plugin.exdevice.f.b.a.e>
{
  public static final String[] fTX;
  private com.tencent.mm.sdk.e.e fTZ;
  
  static
  {
    GMTrace.i(11194966474752L, 83409);
    fTX = new String[] { i.a(com.tencent.mm.plugin.exdevice.f.b.a.e.fTp, "HardDeviceLikeUser") };
    GMTrace.o(11194966474752L, 83409);
  }
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, com.tencent.mm.plugin.exdevice.f.b.a.e.fTp, "HardDeviceLikeUser", null);
    GMTrace.i(11194563821568L, 83406);
    this.fTZ = parame;
    parame.eZ("HardDeviceLikeUser", "CREATE INDEX IF NOT EXISTS ExdeviceRankLikeInfoRankIdAppNameIndex ON HardDeviceLikeUser ( rankID, appusername )");
    GMTrace.o(11194563821568L, 83406);
  }
  
  public final void a(String paramString1, String paramString2, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.e> paramArrayList)
  {
    GMTrace.i(11194832257024L, 83408);
    if (!bg.nm(paramString1)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (paramArrayList != null) {
        break;
      }
      w.i("MicroMsg.ExdeviceRankLikeUserStg", "batchInsertOrUpdate failed, data is null.");
      GMTrace.o(11194832257024L, 83408);
      return;
    }
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      com.tencent.mm.plugin.exdevice.f.b.a.e locale = (com.tencent.mm.plugin.exdevice.f.b.a.e)paramArrayList.next();
      if (locale != null) {}
      for (bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        if (!c(locale, new String[] { "rankID", "username" })) {
          break label126;
        }
        w.d("MicroMsg.ExdeviceRankLikeUserStg", "hy: update success");
        break;
      }
      label126:
      if (b(locale)) {
        w.d("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert success");
      } else {
        w.w("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert or update failed");
      }
    }
    ad.aua().a("HardDeviceLikeUser", new d(paramString1, paramString2, null));
    GMTrace.o(11194832257024L, 83408);
  }
  
  public final ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.e> wQ(String paramString)
  {
    com.tencent.mm.plugin.exdevice.f.b.a.e locale = null;
    GMTrace.i(11194698039296L, 83407);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.ExdeviceRankLikeUserStg", "hy: param error");
      GMTrace.o(11194698039296L, 83407);
      return null;
    }
    Object localObject = String.format("select *, rowid from %s where %s = ? order by %s desc", new Object[] { "HardDeviceLikeUser", "rankID", "timestamp" });
    localObject = this.fTZ.a((String)localObject, new String[] { bg.aq(paramString, "") }, 2);
    if (localObject == null)
    {
      w.e("MicroMsg.ExdeviceRankLikeUserStg", "Get no rank in DB");
      GMTrace.o(11194698039296L, 83407);
      return null;
    }
    paramString = locale;
    if (((Cursor)localObject).moveToFirst())
    {
      paramString = new ArrayList();
      do
      {
        locale = new com.tencent.mm.plugin.exdevice.f.b.a.e();
        locale.b((Cursor)localObject);
        paramString.add(locale);
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    GMTrace.o(11194698039296L, 83407);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\b\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */