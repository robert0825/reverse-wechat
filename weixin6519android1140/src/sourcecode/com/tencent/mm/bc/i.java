package com.tencent.mm.bc;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.g.b.bz;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.d;
import java.util.ArrayList;

public final class i
  extends com.tencent.mm.sdk.e.i<h>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(1415997030400L, 10550);
    fTX = new String[] { com.tencent.mm.sdk.e.i.a(h.fTp, "LBSVerifyMessage") };
    GMTrace.o(1415997030400L, 10550);
  }
  
  public i(e parame)
  {
    super(parame, h.fTp, "LBSVerifyMessage", bz.eZt);
    GMTrace.i(1413849546752L, 10534);
    this.fTZ = parame;
    GMTrace.o(1413849546752L, 10534);
  }
  
  public static long lV(String paramString)
  {
    Object localObject = null;
    GMTrace.i(1415728594944L, 10548);
    long l2 = 0L;
    long l1 = l2;
    Cursor localCursor;
    if (paramString != null)
    {
      paramString = l.MM();
      localCursor = paramString.fTZ.a("SELECT * FROM " + paramString.getTableName() + " ORDER BY createtime DESC LIMIT 1", null, 2);
      if (localCursor != null) {
        break label103;
      }
      paramString = (String)localObject;
    }
    for (;;)
    {
      l1 = l2;
      if (paramString != null) {
        l1 = paramString.field_createtime + 1L;
      }
      l2 = bg.Pu();
      if (l1 <= l2) {
        break;
      }
      GMTrace.o(1415728594944L, 10548);
      return l1;
      label103:
      if (!localCursor.moveToFirst())
      {
        localCursor.close();
        paramString = (String)localObject;
      }
      else
      {
        paramString = new h();
        paramString.b(localCursor);
        localCursor.close();
      }
    }
    GMTrace.o(1415728594944L, 10548);
    return l2;
  }
  
  public final h[] L(String paramString, int paramInt)
  {
    GMTrace.i(1415594377216L, 10547);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.LBSVerifyMessageStorage", "getLastRecvLbsMsg fail, talker is null");
      GMTrace.o(1415594377216L, 10547);
      return null;
    }
    paramString = "select * from LBSVerifyMessage where isSend = 0 and (sayhiuser = '" + bg.nk(paramString) + "' or sayhiencryptuser = '" + bg.nk(paramString) + "') order by createTime DESC limit " + paramInt;
    paramString = this.fTZ.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      h localh = new h();
      localh.b(paramString);
      localArrayList.add(localh);
    }
    paramString.close();
    paramString = (h[])localArrayList.toArray(new h[localArrayList.size()]);
    GMTrace.o(1415594377216L, 10547);
    return paramString;
  }
  
  public final int ME()
  {
    GMTrace.i(1413983764480L, 10535);
    Cursor localCursor = this.fTZ.a("select count(*) from " + getTableName() + " where status != 4", null, 2);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      GMTrace.o(1413983764480L, 10535);
      return 0;
    }
    int i = localCursor.getInt(0);
    localCursor.close();
    GMTrace.o(1413983764480L, 10535);
    return i;
  }
  
  public final h MF()
  {
    GMTrace.i(1414252199936L, 10537);
    Cursor localCursor = this.fTZ.a("SELECT * FROM " + getTableName() + " where status != 4 ORDER BY createtime DESC LIMIT 1", null, 2);
    if (localCursor == null)
    {
      GMTrace.o(1414252199936L, 10537);
      return null;
    }
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      GMTrace.o(1414252199936L, 10537);
      return null;
    }
    h localh = new h();
    localh.b(localCursor);
    localCursor.close();
    GMTrace.o(1414252199936L, 10537);
    return localh;
  }
  
  public final void MG()
  {
    GMTrace.i(1414386417664L, 10538);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("status", Integer.valueOf(4));
    if (this.fTZ.update(getTableName(), localContentValues, "status!=? ", new String[] { "4" }) != 0) {
      doNotify();
    }
    GMTrace.o(1414386417664L, 10538);
  }
  
  public final void MH()
  {
    GMTrace.i(1414789070848L, 10541);
    this.fTZ.delete(getTableName(), null, null);
    GMTrace.o(1414789070848L, 10541);
  }
  
  public final void a(bu parambu, au.d paramd)
  {
    GMTrace.i(1414923288576L, 10542);
    w.d("MicroMsg.LBSVerifyMessageStorage", "saveToVerifyStg, cmdAM, status = " + parambu.jhA + ", id = " + parambu.tQd);
    h localh = new h();
    localh.field_content = n.a(parambu.tPY);
    localh.field_createtime = bg.Pu();
    localh.field_imgpath = "";
    localh.field_sayhicontent = paramd.content;
    localh.field_sayhiuser = paramd.rAP;
    localh.field_scene = paramd.scene;
    if (parambu.jhA > 3) {}
    for (int i = parambu.jhA;; i = 3)
    {
      localh.field_status = i;
      localh.field_svrid = parambu.tQd;
      localh.field_talker = n.a(parambu.tPW);
      localh.field_type = parambu.lQc;
      localh.field_isSend = 0;
      localh.field_sayhiencryptuser = paramd.vBE;
      localh.field_ticket = paramd.nLA;
      localh.field_flag = 1;
      a(localh);
      b.y(localh.field_sayhiencryptuser, 3);
      GMTrace.o(1414923288576L, 10542);
      return;
    }
  }
  
  public final boolean a(h paramh)
  {
    GMTrace.i(1415057506304L, 10543);
    if (paramh == null)
    {
      w.e("MicroMsg.LBSVerifyMessageStorage", "insert fail, lbsMsg is null");
      GMTrace.o(1415057506304L, 10543);
      return false;
    }
    if (super.b(paramh))
    {
      SS(paramh.vmr);
      GMTrace.o(1415057506304L, 10543);
      return true;
    }
    GMTrace.o(1415057506304L, 10543);
    return false;
  }
  
  public final int getCount()
  {
    int i = 0;
    GMTrace.i(1414117982208L, 10536);
    Cursor localCursor = this.fTZ.a("select count(*) from " + getTableName(), null, 2);
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    GMTrace.o(1414117982208L, 10536);
    return i;
  }
  
  public final void lQ(String paramString)
  {
    GMTrace.i(1414520635392L, 10539);
    paramString = "svrid = '" + paramString + "'";
    int i = this.fTZ.delete(getTableName(), paramString, null);
    if (i > 0) {
      doNotify();
    }
    w.i("MicroMsg.LBSVerifyMessageStorage", "delBySvrId = " + i);
    GMTrace.o(1414520635392L, 10539);
  }
  
  public final void lR(String paramString)
  {
    GMTrace.i(1414654853120L, 10540);
    paramString = "sayhiuser = '" + paramString + "' or sayhiencryptuser='" + paramString + "'";
    int i = this.fTZ.delete(getTableName(), paramString, null);
    if (i > 0) {
      doNotify();
    }
    w.i("MicroMsg.LBSVerifyMessageStorage", "delByUserName = " + i);
    GMTrace.o(1414654853120L, 10540);
  }
  
  public final h[] lS(String paramString)
  {
    GMTrace.i(1415191724032L, 10544);
    w.d("MicroMsg.LBSVerifyMessageStorage", "getLastLBSVerifyMessage");
    paramString = "select *, rowid from LBSVerifyMessage  where sayhiuser = '" + bg.nk(paramString) + "' or sayhiencryptuser = '" + bg.nk(paramString) + "' order by createtime DESC limit 3";
    paramString = this.fTZ.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      h localh = new h();
      localh.b(paramString);
      localArrayList.add(localh);
    }
    paramString.close();
    paramString = (h[])localArrayList.toArray(new h[localArrayList.size()]);
    GMTrace.o(1415191724032L, 10544);
    return paramString;
  }
  
  public final h lT(String paramString)
  {
    Object localObject = null;
    GMTrace.i(1415325941760L, 10545);
    w.d("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage");
    paramString = "select *, rowid from LBSVerifyMessage  where (sayhiuser = '" + bg.nk(paramString) + "' or sayhiencryptuser = '" + bg.nk(paramString) + "') and flag=1 order by createtime DESC limit 1";
    Cursor localCursor = this.fTZ.a(paramString, null, 2);
    if (localCursor.moveToFirst())
    {
      paramString = new h();
      paramString.b(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      GMTrace.o(1415325941760L, 10545);
      return paramString;
      w.i("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage, cursor count = 0");
      paramString = (String)localObject;
    }
  }
  
  public final h lU(String paramString)
  {
    GMTrace.i(1415460159488L, 10546);
    paramString = L(paramString, 1);
    if (paramString != null)
    {
      paramString = paramString[0];
      GMTrace.o(1415460159488L, 10546);
      return paramString;
    }
    GMTrace.o(1415460159488L, 10546);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */