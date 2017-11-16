package com.tencent.mm.af;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class i
  extends com.tencent.mm.sdk.e.i<g>
{
  public static final String[] fTX;
  public com.tencent.mm.sdk.e.e fTZ;
  
  static
  {
    GMTrace.i(4530519408640L, 33755);
    fTX = new String[] { com.tencent.mm.sdk.e.i.a(g.fTp, "BizKF") };
    GMTrace.o(4530519408640L, 33755);
  }
  
  public i(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, g.fTp, "BizKF", null);
    GMTrace.i(4529579884544L, 33748);
    this.fTZ = parame;
    parame.eZ("BizKF", "CREATE INDEX IF NOT EXISTS BizKFAppIdUsernameIndex ON BizKF ( brandUsername )");
    parame.eZ("BizKF", "CREATE INDEX IF NOT EXISTS BizKFOpenIdIndex ON BizKF ( openId )");
    GMTrace.o(4529579884544L, 33748);
  }
  
  public static boolean a(g paramg)
  {
    GMTrace.i(4529848320000L, 33750);
    if (paramg != null)
    {
      if (System.currentTimeMillis() - paramg.field_updateTime >= 86400000L)
      {
        GMTrace.o(4529848320000L, 33750);
        return true;
      }
      GMTrace.o(4529848320000L, 33750);
      return false;
    }
    GMTrace.o(4529848320000L, 33750);
    return false;
  }
  
  private boolean b(g paramg)
  {
    GMTrace.i(4529982537728L, 33751);
    if ((paramg == null) || (bg.nm(paramg.field_openId)) || (bg.nm(paramg.field_brandUsername)))
    {
      w.w("MicroMsg.BizKFStorage", "wrong argument");
      GMTrace.o(4529982537728L, 33751);
      return false;
    }
    ContentValues localContentValues = paramg.qL();
    if (this.fTZ.replace("BizKF", g.fTp.vms, localContentValues) > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.BizKFStorage", "replace: openId=%s, brandUsername=%s, ret=%s ", new Object[] { paramg.field_openId, paramg.field_brandUsername, Boolean.valueOf(bool) });
      GMTrace.o(4529982537728L, 33751);
      return bool;
    }
  }
  
  public final int d(LinkedList<g> paramLinkedList)
  {
    GMTrace.i(4530250973184L, 33753);
    if (paramLinkedList.size() <= 0)
    {
      w.e("MicroMsg.BizKFStorage", "null kfs");
      GMTrace.o(4530250973184L, 33753);
      return 0;
    }
    if ((this.fTZ instanceof com.tencent.mm.bu.g)) {}
    for (long l = ((com.tencent.mm.bu.g)this.fTZ).cE(Thread.currentThread().getId());; l = 0L)
    {
      paramLinkedList = paramLinkedList.iterator();
      int i = 0;
      if (paramLinkedList.hasNext())
      {
        g localg = (g)paramLinkedList.next();
        if ((localg == null) || (!b(localg))) {
          break label156;
        }
        i += 1;
      }
      label156:
      for (;;)
      {
        break;
        if ((this.fTZ instanceof com.tencent.mm.bu.g)) {
          h.xy().fYV.aL(l);
        }
        w.i("MicroMsg.BizKFStorage", "insertOrUpdateBizKFs %d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(4530250973184L, 33753);
        return i;
      }
    }
  }
  
  public final g iT(String paramString)
  {
    GMTrace.i(4529714102272L, 33749);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(4529714102272L, 33749);
      return null;
    }
    Cursor localCursor = this.fTZ.a("BizKF", null, "openId=?", new String[] { paramString }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      w.w("MicroMsg.BizKFStorage", "get null with openId:" + paramString);
      localCursor.close();
      GMTrace.o(4529714102272L, 33749);
      return null;
    }
    paramString = new g();
    paramString.b(localCursor);
    localCursor.close();
    GMTrace.o(4529714102272L, 33749);
    return paramString;
  }
  
  public final g iU(String paramString)
  {
    GMTrace.i(4530116755456L, 33752);
    if (bg.nm(paramString))
    {
      GMTrace.o(4530116755456L, 33752);
      return null;
    }
    Cursor localCursor = this.fTZ.a("BizKF", null, "brandUsername = ? order by kfType desc ", new String[] { paramString }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      w.w("MicroMsg.BizKFStorage", "get null with brandUsername:" + paramString);
      localCursor.close();
      GMTrace.o(4530116755456L, 33752);
      return null;
    }
    paramString = new g();
    paramString.b(localCursor);
    localCursor.close();
    GMTrace.o(4530116755456L, 33752);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */