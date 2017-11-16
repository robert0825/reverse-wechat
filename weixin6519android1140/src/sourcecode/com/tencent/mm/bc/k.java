package com.tencent.mm.bc;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.d;
import java.util.ArrayList;

public final class k
  extends i<j>
{
  public static final String[] eZt;
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(1420963086336L, 10587);
    fTX = new String[] { i.a(j.fTp, "shakeverifymessage") };
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS  shakeverifymessage_unread_index ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_statusIndex ON shakeverifymessage ( status )", "CREATE INDEX IF NOT EXISTS shakeverifymessage_createtimeIndex ON shakeverifymessage ( createtime )" };
    GMTrace.o(1420963086336L, 10587);
  }
  
  public k(e parame)
  {
    super(parame, j.fTp, "shakeverifymessage", eZt);
    GMTrace.i(1419218255872L, 10574);
    this.fTZ = parame;
    GMTrace.o(1419218255872L, 10574);
  }
  
  public static long lV(String paramString)
  {
    GMTrace.i(1420694650880L, 10585);
    long l2 = 0L;
    long l1 = l2;
    if (paramString != null)
    {
      paramString = l.MN().MI();
      l1 = l2;
      if (paramString != null) {
        l1 = paramString.field_createtime + 1L;
      }
    }
    l2 = bg.Pu();
    if (l1 > l2)
    {
      GMTrace.o(1420694650880L, 10585);
      return l1;
    }
    GMTrace.o(1420694650880L, 10585);
    return l2;
  }
  
  public final j[] M(String paramString, int paramInt)
  {
    GMTrace.i(1420426215424L, 10583);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.ShakeVerifyMessageStorage", "getLastRecvShakeMsg fail, talker is null");
      GMTrace.o(1420426215424L, 10583);
      return null;
    }
    paramString = "select * from ShakeVerifyMessage where isSend = 0 and sayhiuser = '" + bg.nk(paramString) + "' order by createTime DESC limit " + paramInt;
    paramString = this.fTZ.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      j localj = new j();
      localj.b(paramString);
      localArrayList.add(localj);
    }
    paramString.close();
    if (localArrayList.size() == 0)
    {
      GMTrace.o(1420426215424L, 10583);
      return null;
    }
    paramString = (j[])localArrayList.toArray(new j[localArrayList.size()]);
    GMTrace.o(1420426215424L, 10583);
    return paramString;
  }
  
  public final int ME()
  {
    GMTrace.i(1419352473600L, 10575);
    Cursor localCursor = this.fTZ.a("select count(*) from " + getTableName() + " where status != 4", null, 2);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      GMTrace.o(1419352473600L, 10575);
      return 0;
    }
    int i = localCursor.getInt(0);
    localCursor.close();
    if (i > 0)
    {
      GMTrace.o(1419352473600L, 10575);
      return i;
    }
    GMTrace.o(1419352473600L, 10575);
    return 0;
  }
  
  public final void MH()
  {
    GMTrace.i(1419889344512L, 10579);
    this.fTZ.delete(getTableName(), null, null);
    GMTrace.o(1419889344512L, 10579);
  }
  
  public final j MI()
  {
    GMTrace.i(1419620909056L, 10577);
    Cursor localCursor = this.fTZ.a("SELECT * FROM " + getTableName() + " ORDER BY createtime DESC LIMIT 1", null, 2);
    if (localCursor == null)
    {
      GMTrace.o(1419620909056L, 10577);
      return null;
    }
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      GMTrace.o(1419620909056L, 10577);
      return null;
    }
    j localj = new j();
    localj.b(localCursor);
    localCursor.close();
    GMTrace.o(1419620909056L, 10577);
    return localj;
  }
  
  public final void a(bu parambu, au.d paramd)
  {
    GMTrace.i(1420023562240L, 10580);
    w.d("MicroMsg.ShakeVerifyMessageStorage", "saveToVerifyStg, cmdAM, status = " + parambu.jhA + ", id = " + parambu.tQd);
    j localj = new j();
    localj.field_content = n.a(parambu.tPY);
    localj.field_createtime = bg.Pu();
    localj.field_imgpath = "";
    localj.field_sayhicontent = paramd.content;
    localj.field_sayhiuser = paramd.rAP;
    localj.field_scene = paramd.scene;
    if (parambu.jhA > 3) {}
    for (int i = parambu.jhA;; i = 3)
    {
      localj.field_status = i;
      localj.field_svrid = parambu.tQd;
      localj.field_talker = n.a(parambu.tPW);
      localj.field_type = parambu.lQc;
      localj.field_isSend = 0;
      a(localj);
      b.y(localj.field_sayhiuser, 3);
      GMTrace.o(1420023562240L, 10580);
      return;
    }
  }
  
  public final boolean a(j paramj)
  {
    GMTrace.i(1420157779968L, 10581);
    if (paramj == null)
    {
      w.e("MicroMsg.ShakeVerifyMessageStorage", "insert fail, shakeMsg is null");
      GMTrace.o(1420157779968L, 10581);
      return false;
    }
    if (super.b(paramj))
    {
      SS(paramj.vmr);
      GMTrace.o(1420157779968L, 10581);
      return true;
    }
    GMTrace.o(1420157779968L, 10581);
    return false;
  }
  
  public final int getCount()
  {
    GMTrace.i(1419486691328L, 10576);
    Cursor localCursor = this.fTZ.a("select count(*) from " + getTableName(), null, 2);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      GMTrace.o(1419486691328L, 10576);
      return 0;
    }
    int i = localCursor.getInt(0);
    localCursor.close();
    if (i > 0)
    {
      GMTrace.o(1419486691328L, 10576);
      return i;
    }
    GMTrace.o(1419486691328L, 10576);
    return 0;
  }
  
  public final void lQ(String paramString)
  {
    GMTrace.i(1419755126784L, 10578);
    paramString = "svrid = '" + paramString + "'";
    int i = this.fTZ.delete(getTableName(), paramString, null);
    if (i > 0) {
      doNotify();
    }
    w.i("MicroMsg.ShakeVerifyMessageStorage", "delBySvrId = " + i);
    GMTrace.o(1419755126784L, 10578);
  }
  
  public final j lW(String paramString)
  {
    GMTrace.i(1420291997696L, 10582);
    paramString = M(paramString, 1);
    if (paramString != null)
    {
      paramString = paramString[0];
      GMTrace.o(1420291997696L, 10582);
      return paramString;
    }
    GMTrace.o(1420291997696L, 10582);
    return null;
  }
  
  public final j[] lX(String paramString)
  {
    GMTrace.i(1420560433152L, 10584);
    w.d("MicroMsg.ShakeVerifyMessageStorage", "getLastShakeVerifyMessage");
    paramString = "select *, rowid from ShakeVerifyMessage  where sayhiuser = '" + bg.nk(paramString) + "' order by createtime DESC limit 3";
    paramString = this.fTZ.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      j localj = new j();
      localj.b(paramString);
      localArrayList.add(localj);
    }
    paramString.close();
    if (localArrayList.size() == 0)
    {
      GMTrace.o(1420560433152L, 10584);
      return null;
    }
    paramString = (j[])localArrayList.toArray(new j[localArrayList.size()]);
    GMTrace.o(1420560433152L, 10584);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */