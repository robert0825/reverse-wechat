package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.f.b.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import junit.framework.Assert;

public final class d
  extends i<com.tencent.mm.plugin.exdevice.f.b.a.d>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(11193087426560L, 83395);
    fTX = new String[] { i.a(com.tencent.mm.plugin.exdevice.f.b.a.d.fTp, "HardDeviceRankInfo") };
    GMTrace.o(11193087426560L, 83395);
  }
  
  public d(e parame)
  {
    super(parame, com.tencent.mm.plugin.exdevice.f.b.a.d.fTp, "HardDeviceRankInfo", null);
    GMTrace.i(11192416337920L, 83390);
    this.fTZ = parame;
    parame.eZ("HardDeviceRankInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankInfoRankIdAppNameIndex ON HardDeviceRankInfo ( rankID, appusername )");
    GMTrace.o(11192416337920L, 83390);
  }
  
  public final com.tencent.mm.plugin.exdevice.f.b.a.d a(com.tencent.mm.plugin.exdevice.f.b.d paramd)
  {
    GMTrace.i(11192550555648L, 83391);
    Object localObject = String.format("select *, rowid from %s where %s = ? and %s = ? limit 1", new Object[] { "HardDeviceRankInfo", "rankID", "username" });
    localObject = this.fTZ.a((String)localObject, new String[] { bg.aq(paramd.kCc, ""), bg.aq(paramd.username, "") }, 2);
    if (localObject == null)
    {
      w.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
      GMTrace.o(11192550555648L, 83391);
      return null;
    }
    paramd = null;
    if (((Cursor)localObject).moveToFirst())
    {
      paramd = new com.tencent.mm.plugin.exdevice.f.b.a.d();
      paramd.b((Cursor)localObject);
    }
    for (;;)
    {
      ((Cursor)localObject).close();
      GMTrace.o(11192550555648L, 83391);
      return paramd;
      w.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
    }
  }
  
  public final boolean a(com.tencent.mm.plugin.exdevice.f.b.a.d paramd, boolean paramBoolean)
  {
    GMTrace.i(11192818991104L, 83393);
    if (b(paramd, paramBoolean))
    {
      GMTrace.o(11192818991104L, 83393);
      return true;
    }
    if (paramd != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      b(paramd);
      w.d("MicroMsg.ExdeviceRankInfoStg", "hy: insert success");
      if (paramBoolean) {
        ad.aua().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(paramd.field_rankID, paramd.field_appusername, paramd.field_username));
      }
      GMTrace.o(11192818991104L, 83393);
      return true;
    }
  }
  
  public final boolean b(com.tencent.mm.plugin.exdevice.f.b.a.d paramd, boolean paramBoolean)
  {
    GMTrace.i(11192953208832L, 83394);
    if (paramd != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      com.tencent.mm.plugin.exdevice.f.b.a.d locald = a(new com.tencent.mm.plugin.exdevice.f.b.d(paramd.field_rankID, paramd.field_appusername, paramd.field_username));
      if (locald == null) {
        break;
      }
      locald.field_likecount = paramd.field_likecount;
      locald.field_selfLikeState = paramd.field_selfLikeState;
      c(locald, new String[] { "rankID", "username" });
      w.d("MicroMsg.ExdeviceRankInfoStg", "hy: update success");
      if (paramBoolean) {
        ad.aua().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(paramd.field_rankID, paramd.field_appusername, paramd.field_username));
      }
      GMTrace.o(11192953208832L, 83394);
      return true;
    }
    GMTrace.o(11192953208832L, 83394);
    return false;
  }
  
  public final void d(String paramString, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList)
  {
    GMTrace.i(11192684773376L, 83392);
    if ((bg.nm(paramString)) || (paramArrayList == null))
    {
      w.w("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo failed, rank id is null or nil or data is null.");
      GMTrace.o(11192684773376L, 83392);
      return;
    }
    w.i("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo, rankId(%s) , size(%d).", new Object[] { paramString, Integer.valueOf(paramArrayList.size()) });
    int i = 0;
    while (i < paramArrayList.size())
    {
      a((com.tencent.mm.plugin.exdevice.f.b.a.d)paramArrayList.get(i), false);
      i += 1;
    }
    ad.aua().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(paramString, null, null));
    GMTrace.o(11192684773376L, 83392);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\b\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */