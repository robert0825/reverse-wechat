package com.tencent.mm.bc;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;

public final class g
  extends i<f>
{
  public static final String[] fTX;
  private static final String[] gZJ;
  e fTZ;
  
  static
  {
    GMTrace.i(1419084038144L, 10573);
    fTX = new String[] { i.a(f.fTp, "fmessage_msginfo") };
    gZJ = new String[] { "CREATE INDEX IF NOT EXISTS  fmessageTalkerIndex ON fmessage_msginfo ( talker )" };
    GMTrace.o(1419084038144L, 10573);
  }
  
  public g(e parame)
  {
    super(parame, f.fTp, "fmessage_msginfo", gZJ);
    GMTrace.i(1418010296320L, 10565);
    this.fTZ = parame;
    GMTrace.o(1418010296320L, 10565);
  }
  
  public final f[] K(String paramString, int paramInt)
  {
    GMTrace.i(1418547167232L, 10569);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.FMessageMsgInfoStorage", "getLastRecvFMsg fail, talker is null");
      GMTrace.o(1418547167232L, 10569);
      return null;
    }
    paramString = "select * from fmessage_msginfo where isSend != 1 and talker = '" + bg.nk(paramString) + "' order by createTime DESC limit " + paramInt;
    paramString = this.fTZ.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      f localf = new f();
      localf.b(paramString);
      localArrayList.add(localf);
    }
    paramString.close();
    paramString = (f[])localArrayList.toArray(new f[localArrayList.size()]);
    GMTrace.o(1418547167232L, 10569);
    return paramString;
  }
  
  public final ArrayList<f> MD()
  {
    GMTrace.i(1418815602688L, 10571);
    w.d("MicroMsg.FMessageMsgInfoStorage", "getFMsgByType, type = 0");
    ArrayList localArrayList = new ArrayList();
    Object localObject = "select *, rowid from fmessage_msginfo where type = 0";
    localObject = this.fTZ.a((String)localObject, null, 2);
    while (((Cursor)localObject).moveToNext())
    {
      f localf = new f();
      localf.b((Cursor)localObject);
      localArrayList.add(localf);
    }
    ((Cursor)localObject).close();
    w.d("MicroMsg.FMessageMsgInfoStorage", "getFMsgByType, size = " + localArrayList.size());
    GMTrace.o(1418815602688L, 10571);
    return localArrayList;
  }
  
  public final boolean a(f paramf)
  {
    GMTrace.i(1418681384960L, 10570);
    if (paramf == null)
    {
      w.e("MicroMsg.FMessageMsgInfoStorage", "insert fail, fmsgInfo is null");
      GMTrace.o(1418681384960L, 10570);
      return false;
    }
    if (super.b(paramf))
    {
      SS(paramf.vmr);
      GMTrace.o(1418681384960L, 10570);
      return true;
    }
    GMTrace.o(1418681384960L, 10570);
    return false;
  }
  
  public final f[] lN(String paramString)
  {
    GMTrace.i(1418144514048L, 10566);
    w.d("MicroMsg.FMessageMsgInfoStorage", "getLastFMessageMsgInfo");
    paramString = "select *, rowid from fmessage_msginfo  where talker = '" + bg.nk(paramString) + "' order by createTime DESC limit 3";
    paramString = this.fTZ.a(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      f localf = new f();
      localf.b(paramString);
      localArrayList.add(localf);
    }
    paramString.close();
    paramString = (f[])localArrayList.toArray(new f[localArrayList.size()]);
    GMTrace.o(1418144514048L, 10566);
    return paramString;
  }
  
  public final f lO(String paramString)
  {
    GMTrace.i(1418278731776L, 10567);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.FMessageMsgInfoStorage", "getLastFMsg fail, talker is null");
      GMTrace.o(1418278731776L, 10567);
      return null;
    }
    paramString = "select * from fmessage_msginfo where talker = '" + bg.nk(paramString) + "' order by createTime DESC limit 1";
    paramString = this.fTZ.a(paramString, null, 2);
    f localf = new f();
    if (paramString.moveToFirst()) {
      localf.b(paramString);
    }
    paramString.close();
    GMTrace.o(1418278731776L, 10567);
    return localf;
  }
  
  public final f lP(String paramString)
  {
    GMTrace.i(1418412949504L, 10568);
    paramString = K(paramString, 1);
    if ((paramString != null) && (paramString.length > 0))
    {
      paramString = paramString[0];
      GMTrace.o(1418412949504L, 10568);
      return paramString;
    }
    GMTrace.o(1418412949504L, 10568);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */