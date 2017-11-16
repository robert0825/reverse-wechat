package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.f.b.a.c;
import com.tencent.mm.plugin.exdevice.f.b.b;
import com.tencent.mm.protocal.c.uk;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class a
  extends i<c>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(11194295386112L, 83404);
    fTX = new String[] { i.a(c.fTp, "HardDeviceRankFollowInfo") };
    GMTrace.o(11194295386112L, 83404);
  }
  
  public a(e parame)
  {
    super(parame, c.fTp, "HardDeviceRankFollowInfo", null);
    GMTrace.i(11193221644288L, 83396);
    this.fTZ = parame;
    parame.eZ("HardDeviceRankFollowInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankFollowRankIdAppNameIndex ON HardDeviceRankFollowInfo ( rankID, appusername )");
    GMTrace.o(11193221644288L, 83396);
  }
  
  private boolean a(c paramc)
  {
    boolean bool2 = false;
    GMTrace.i(11194026950656L, 83402);
    if (paramc != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      c localc = a(new b(paramc.field_rankID, paramc.field_appusername, paramc.field_username));
      if (localc == null) {
        break label114;
      }
      localc.field_step = paramc.field_step;
      c(localc, new String[] { "rankID", "appusername", "username" });
      w.d("MicroMsg.ExdeviceFollowInfoStg", "ap: update success");
    }
    label114:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label119;
      }
      GMTrace.o(11194026950656L, 83402);
      return true;
      bool1 = false;
      break;
    }
    label119:
    boolean bool1 = bool2;
    if (paramc != null) {
      bool1 = true;
    }
    Assert.assertTrue(bool1);
    b(paramc);
    w.d("MicroMsg.ExdeviceFollowInfoStg", "ap: insert success");
    GMTrace.o(11194026950656L, 83402);
    return true;
  }
  
  public final c a(b paramb)
  {
    GMTrace.i(11193355862016L, 83397);
    Object localObject = String.format("select *, rowid from %s where %s = ? and %s = ? and %s = ? limit 1", new Object[] { "HardDeviceRankFollowInfo", "rankID", "username", "appusername" });
    localObject = this.fTZ.a((String)localObject, new String[] { bg.aq(paramb.kCc, ""), bg.aq(paramb.username, ""), bg.aq(paramb.appName, "") }, 2);
    if (localObject == null)
    {
      w.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get no follow in DB");
      GMTrace.o(11193355862016L, 83397);
      return null;
    }
    paramb = null;
    if (((Cursor)localObject).moveToFirst())
    {
      paramb = new c();
      paramb.b((Cursor)localObject);
    }
    for (;;)
    {
      ((Cursor)localObject).close();
      GMTrace.o(11193355862016L, 83397);
      return paramb;
      w.d("MicroMsg.ExdeviceFollowInfoStg", "ap: no record");
    }
  }
  
  public final void a(ArrayList<uk> paramArrayList, String paramString1, String paramString2)
  {
    GMTrace.i(11193758515200L, 83400);
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        uk localuk = (uk)paramArrayList.next();
        c localc = new c();
        localc.field_rankID = paramString1;
        localc.field_step = localuk.hZC;
        localc.field_username = localuk.username;
        localc.field_appusername = paramString2;
        a(localc);
      }
    }
    GMTrace.o(11193758515200L, 83400);
  }
  
  public final ArrayList<c> auf()
  {
    GMTrace.i(11193624297472L, 83399);
    Object localObject = String.format("select *, rowid from %s where %s= ? and %s = ? order by rowid asc", new Object[] { "HardDeviceRankFollowInfo", "rankID", "appusername" });
    Cursor localCursor = this.fTZ.a((String)localObject, new String[] { "hardcode_rank_id", "hardcode_app_name" }, 2);
    if (localCursor == null)
    {
      w.e("MicroMsg.ExdeviceFollowInfoStg", "ap: Get follows not in DB");
      GMTrace.o(11193624297472L, 83399);
      return null;
    }
    localObject = null;
    if (localCursor.moveToFirst())
    {
      localObject = new ArrayList();
      do
      {
        c localc = new c();
        localc.b(localCursor);
        w.d("MicroMsg.ExdeviceFollowInfoStg", "follow info: rowid: %s, info: %s", new Object[] { Integer.valueOf(localCursor.getColumnIndex("rowid")), localc.toString() });
        ((ArrayList)localObject).add(localc);
      } while (localCursor.moveToNext());
      w.d("MicroMsg.ExdeviceFollowInfoStg", "getAllFollowItem: %d, %s", new Object[] { Integer.valueOf(((ArrayList)localObject).size()), ((ArrayList)localObject).toString() });
    }
    for (;;)
    {
      localCursor.close();
      GMTrace.o(11193624297472L, 83399);
      return (ArrayList<c>)localObject;
      w.d("MicroMsg.ExdeviceFollowInfoStg", "ap: no record");
    }
  }
  
  public final void av(List<c> paramList)
  {
    GMTrace.i(11193892732928L, 83401);
    if ((bg.nm("hardcode_rank_id")) || (bg.nm("hardcode_app_name"))) {
      w.e("MicroMsg.ExdeviceFollowInfoStg", "ap: delete follows,params is null");
    }
    while (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        c localc = (c)paramList.next();
        localc.field_rankID = "hardcode_rank_id";
        localc.field_appusername = "hardcode_app_name";
        a(localc);
      }
      w.d("MicroMsg.ExdeviceFollowInfoStg", "ap: delete rankId: %s %s count %d", new Object[] { "hardcode_rank_id", "hardcode_app_name", Integer.valueOf(this.fTZ.delete("HardDeviceRankFollowInfo", "rankID=? and appusername=?", new String[] { "hardcode_rank_id", "hardcode_app_name" })) });
    }
    GMTrace.o(11193892732928L, 83401);
  }
  
  public final boolean wN(String paramString)
  {
    GMTrace.i(11193490079744L, 83398);
    String str = String.format("select * from %s where %s=? and %s=? and %s=? limit 1", new Object[] { "HardDeviceRankFollowInfo", "rankID", "appusername", "username" });
    paramString = this.fTZ.a(str, new String[] { bg.aq("hardcode_rank_id", ""), bg.aq("hardcode_app_name", ""), bg.aq(paramString, "") }, 2);
    if (paramString == null)
    {
      w.e("MicroMsg.ExdeviceFollowInfoStg", "ap: check follow not in DB");
      GMTrace.o(11193490079744L, 83398);
      return false;
    }
    boolean bool = paramString.moveToFirst();
    paramString.close();
    w.d("MicroMsg.ExdeviceFollowInfoStg", "checkUserIsFollow %s", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(11193490079744L, 83398);
    return bool;
  }
  
  public final boolean wO(String paramString)
  {
    GMTrace.i(11194161168384L, 83403);
    paramString = a(new b("hardcode_rank_id", "hardcode_app_name", paramString));
    if (paramString != null)
    {
      a(paramString, new String[] { "rankID", "appusername", "username" });
      w.d("MicroMsg.ExdeviceFollowInfoStg", "ap: update success");
      GMTrace.o(11194161168384L, 83403);
      return true;
    }
    GMTrace.o(11194161168384L, 83403);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\b\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */