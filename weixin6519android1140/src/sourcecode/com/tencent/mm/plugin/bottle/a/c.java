package com.tencent.mm.plugin.bottle.a;

import android.content.Context;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.k;
import com.tencent.mm.y.r;

public final class c
{
  private static int joU;
  private static int joV;
  
  static
  {
    GMTrace.i(7594173267968L, 56581);
    joU = 1;
    joV = 1;
    GMTrace.o(7594173267968L, 56581);
  }
  
  public static String a(Context paramContext, x paramx)
  {
    GMTrace.i(7593904832512L, 56579);
    if (paramx == null)
    {
      paramContext = paramContext.getString(R.l.dbw);
      GMTrace.o(7593904832512L, 56579);
      return paramContext;
    }
    if (RegionCodeDecoder.Uu(paramx.getCountryCode()))
    {
      paramContext = paramx.getCity();
      if (!bg.nm(paramContext))
      {
        GMTrace.o(7593904832512L, 56579);
        return paramContext;
      }
      paramContext = r.fu(paramx.getProvince());
      if (!bg.nm(paramContext))
      {
        GMTrace.o(7593904832512L, 56579);
        return paramContext;
      }
      RegionCodeDecoder.bUl();
      paramContext = RegionCodeDecoder.getLocName(paramx.getCountryCode());
      GMTrace.o(7593904832512L, 56579);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.dbw);
    GMTrace.o(7593904832512L, 56579);
    return paramContext;
  }
  
  public static int ahr()
  {
    GMTrace.i(7592696872960L, 56570);
    int i = joU;
    GMTrace.o(7592696872960L, 56570);
    return i;
  }
  
  public static int ahs()
  {
    GMTrace.i(7592831090688L, 56571);
    int i = joV;
    GMTrace.o(7592831090688L, 56571);
    return i;
  }
  
  public static int aht()
  {
    GMTrace.i(7593233743872L, 56574);
    int i = k.zB();
    GMTrace.o(7593233743872L, 56574);
    return i;
  }
  
  public static void ahu()
  {
    GMTrace.i(7593770614784L, 56578);
    b localb = i.ahz();
    long l = bg.Pv() - 7776000000L;
    Object localObject = "select distinct content , msgtype from bottleinfo1 where bottleinfo1.createtime < " + l;
    Cursor localCursor = localb.goN.a((String)localObject, null, 0);
    int j = localCursor.getCount();
    if (j > 0)
    {
      String[] arrayOfString = new String[j];
      i = 0;
      localObject = arrayOfString;
      if (i < j)
      {
        localCursor.moveToPosition(i);
        if (localCursor.getInt(1) == 3) {
          arrayOfString[i] = localCursor.getString(0);
        }
        for (;;)
        {
          i += 1;
          break;
          arrayOfString[i] = null;
        }
      }
    }
    else
    {
      localObject = null;
    }
    localCursor.close();
    if (j > 0) {
      localb.goN.delete("bottleinfo1", "createtime< ?", new String[] { String.valueOf(l) });
    }
    if (localObject == null)
    {
      GMTrace.o(7593770614784L, 56578);
      return;
    }
    int i = 0;
    while (i < localObject.length)
    {
      w.d("MicroMsg.BottleLogic", "delete path:" + com.tencent.mm.modelvoice.q.getFullPath(localObject[i]));
      if (!bg.nm(com.tencent.mm.modelvoice.q.getFullPath(localObject[i]))) {
        com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.modelvoice.q.getFullPath(localObject[i]));
      }
      i += 1;
    }
    GMTrace.o(7593770614784L, 56578);
  }
  
  public static String b(Context paramContext, x paramx)
  {
    GMTrace.i(7594039050240L, 56580);
    if (paramx == null)
    {
      paramContext = paramContext.getString(R.l.dbw);
      GMTrace.o(7594039050240L, 56580);
      return paramContext;
    }
    String str = r.fu(paramx.getProvince());
    Object localObject = str;
    if (RegionCodeDecoder.Uu(paramx.getCountryCode()))
    {
      if (!bg.nm(paramx.getCity())) {
        break label116;
      }
      localObject = new StringBuilder();
      RegionCodeDecoder.bUl();
    }
    label116:
    for (localObject = RegionCodeDecoder.getLocName(paramx.getCountryCode()) + str; bg.nm((String)localObject); localObject = str + paramx.getCity())
    {
      paramContext = paramContext.getString(R.l.dbw);
      GMTrace.o(7594039050240L, 56580);
      return paramContext;
    }
    GMTrace.o(7594039050240L, 56580);
    return (String)localObject;
  }
  
  public static void lc(int paramInt)
  {
    GMTrace.i(7592965308416L, 56572);
    joU = paramInt;
    GMTrace.o(7592965308416L, 56572);
  }
  
  public static void ld(int paramInt)
  {
    GMTrace.i(7593099526144L, 56573);
    joV = paramInt;
    GMTrace.o(7593099526144L, 56573);
  }
  
  public static int le(int paramInt)
  {
    GMTrace.i(7593367961600L, 56575);
    switch (paramInt)
    {
    default: 
      GMTrace.o(7593367961600L, 56575);
      return -1;
    case 1: 
      GMTrace.o(7593367961600L, 56575);
      return 1;
    case 2: 
      GMTrace.o(7593367961600L, 56575);
      return 3;
    case 3: 
      GMTrace.o(7593367961600L, 56575);
      return 34;
    }
    GMTrace.o(7593367961600L, 56575);
    return 43;
  }
  
  public static String tC(String paramString)
  {
    GMTrace.i(7593502179328L, 56576);
    if (bg.nm(paramString))
    {
      GMTrace.o(7593502179328L, 56576);
      return null;
    }
    paramString = paramString.split("@bottle:");
    if ((paramString == null) || (paramString.length < 2))
    {
      GMTrace.o(7593502179328L, 56576);
      return null;
    }
    paramString = paramString[1];
    GMTrace.o(7593502179328L, 56576);
    return paramString;
  }
  
  public static void tD(String paramString)
  {
    a locala = null;
    GMTrace.i(7593636397056L, 56577);
    com.tencent.mm.plugin.bottle.a.hnI.pr();
    at.AR();
    if (com.tencent.mm.y.c.yM().Cp(paramString) != 1)
    {
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    at.AR();
    au localau = com.tencent.mm.y.c.yM().Ca(paramString);
    if ((localau == null) || (!localau.field_talker.equals(paramString)))
    {
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    Object localObject1 = tC(paramString);
    if (bg.nm((String)localObject1))
    {
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    Object localObject2 = i.ahz();
    String str = "select bottleinfo1.parentclientid,bottleinfo1.childcount,bottleinfo1.bottleid,bottleinfo1.bottletype,bottleinfo1.msgtype,bottleinfo1.voicelen,bottleinfo1.content,bottleinfo1.createtime,bottleinfo1.reserved1,bottleinfo1.reserved2,bottleinfo1.reserved3,bottleinfo1.reserved4 from bottleinfo1   where bottleinfo1.bottleid = \"" + bg.nk((String)localObject1) + "\"";
    localObject2 = ((b)localObject2).goN.a(str, null, 0);
    if (localObject2 == null) {
      locala = null;
    }
    while ((locala == null) || (!locala.ahq().equals(localObject1)))
    {
      GMTrace.o(7593636397056L, 56577);
      return;
      if (((Cursor)localObject2).moveToFirst())
      {
        locala = new a();
        locala.joO = ((Cursor)localObject2).getString(0);
        locala.joP = ((Cursor)localObject2).getInt(1);
        locala.joQ = ((Cursor)localObject2).getString(2);
        locala.joR = ((Cursor)localObject2).getInt(3);
        locala.msgType = ((Cursor)localObject2).getInt(4);
        locala.joS = ((Cursor)localObject2).getInt(5);
        locala.content = ((Cursor)localObject2).getString(6);
        locala.joT = ((Cursor)localObject2).getLong(7);
        locala.goJ = ((Cursor)localObject2).getInt(8);
        locala.gDs = ((Cursor)localObject2).getInt(9);
        locala.goL = ((Cursor)localObject2).getString(10);
        locala.goM = ((Cursor)localObject2).getString(11);
      }
      ((Cursor)localObject2).close();
    }
    if (locala.joR != 1)
    {
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    localObject1 = new au();
    ((au)localObject1).db(paramString);
    if (localau.field_createTime <= locala.joT) {}
    for (long l = localau.field_createTime - 1L;; l = locala.joT)
    {
      ((au)localObject1).E(l);
      ((au)localObject1).setType(le(locala.msgType));
      ((au)localObject1).dB(2);
      ((au)localObject1).dC(1);
      if (((ce)localObject1).field_type != 34) {
        break label589;
      }
      ((au)localObject1).setContent(n.b(com.tencent.mm.y.q.zE(), locala.joS, false));
      paramString = locala.rc() + bg.Pv();
      if (j.eR(com.tencent.mm.modelvoice.q.getFullPath(locala.rc()), com.tencent.mm.modelvoice.q.getFullPath(paramString))) {
        break;
      }
      w.e("MicroMsg.BottleLogic", "Copy Bottle Voice File Failed :" + locala.rc());
      GMTrace.o(7593636397056L, 56577);
      return;
    }
    ((au)localObject1).dc(paramString);
    for (;;)
    {
      at.AR();
      com.tencent.mm.y.c.yM().P((au)localObject1);
      GMTrace.o(7593636397056L, 56577);
      return;
      label589:
      ((au)localObject1).setContent(locala.rc());
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */