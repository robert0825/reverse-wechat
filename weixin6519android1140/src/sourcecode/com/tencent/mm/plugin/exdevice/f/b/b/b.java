package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.f.b.d;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public final class b
  extends i<com.tencent.mm.plugin.exdevice.f.b.a.a>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(11192282120192L, 83389);
    fTX = new String[] { i.a(com.tencent.mm.plugin.exdevice.f.b.a.a.fTp, "HardDeviceChampionInfo") };
    GMTrace.o(11192282120192L, 83389);
  }
  
  public b(e parame)
  {
    super(parame, com.tencent.mm.plugin.exdevice.f.b.a.a.fTp, "HardDeviceChampionInfo", null);
    GMTrace.i(11191879467008L, 83386);
    this.fTZ = parame;
    parame.eZ("HardDeviceChampionInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankChampionInfoRankIdAppNameIndex ON HardDeviceChampionInfo ( username )");
    GMTrace.o(11191879467008L, 83386);
  }
  
  public final boolean a(com.tencent.mm.plugin.exdevice.f.b.a.a parama, boolean paramBoolean)
  {
    GMTrace.i(11192147902464L, 83388);
    if (parama != null) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      Assert.assertTrue(paramBoolean);
      if (!c(parama, new String[] { "username" })) {
        break;
      }
      w.d("MicroMsg.ExdeviceRankChampionStg", "hy: update success");
      ad.aua().a("HardDeviceChampionInfo", new d(null, null, parama.field_username));
      GMTrace.o(11192147902464L, 83388);
      return true;
    }
    if (b(parama))
    {
      w.d("MicroMsg.ExdeviceRankChampionStg", "hy: insert success");
      ad.aua().a("HardDeviceChampionInfo", new d(null, null, parama.field_username));
      GMTrace.o(11192147902464L, 83388);
      return true;
    }
    w.w("MicroMsg.ExdeviceRankChampionStg", "hy: insert or update failed");
    GMTrace.o(11192147902464L, 83388);
    return false;
  }
  
  public final com.tencent.mm.plugin.exdevice.f.b.a.a wP(String paramString)
  {
    GMTrace.i(11192013684736L, 83387);
    Object localObject = String.format("select *, rowid from %s where %s = ? limit 1", new Object[] { "HardDeviceChampionInfo", "username" });
    localObject = this.fTZ.a((String)localObject, new String[] { bg.aq(paramString, "") }, 2);
    if (localObject == null)
    {
      w.e("MicroMsg.ExdeviceRankChampionStg", "Get no rank in DB");
      GMTrace.o(11192013684736L, 83387);
      return null;
    }
    paramString = null;
    if (((Cursor)localObject).moveToFirst())
    {
      paramString = new com.tencent.mm.plugin.exdevice.f.b.a.a();
      paramString.b((Cursor)localObject);
    }
    for (;;)
    {
      ((Cursor)localObject).close();
      GMTrace.o(11192013684736L, 83387);
      return paramString;
      w.d("MicroMsg.ExdeviceRankChampionStg", "hy: no record");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\b\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */