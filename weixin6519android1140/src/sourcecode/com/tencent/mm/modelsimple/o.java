package com.tencent.mm.modelsimple;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.ai;
import com.tencent.mm.g.a.ai.b;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.zp;
import com.tencent.mm.protocal.c.zq;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.account.DisasterUI;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Map;

public final class o
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static Map<String, Long> gTZ;
  private static Map<String, String> gUa;
  public boolean eKg;
  private com.tencent.mm.ad.e fUd;
  private final com.tencent.mm.ad.b gTY;
  public c<com.tencent.mm.g.a.a> gUb;
  
  static
  {
    GMTrace.i(1358551842816L, 10122);
    gTZ = new HashMap();
    GMTrace.o(1358551842816L, 10122);
  }
  
  public o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(1357075447808L, 10111);
    this.eKg = false;
    b.a locala = new b.a();
    locala.gtF = new zp();
    locala.gtG = new zq();
    locala.uri = "/cgi-bin/micromsg-bin/getdisasterinfo";
    locala.gtE = 775;
    locala.gtH = 0;
    locala.gtI = 0;
    this.gTY = locala.DA();
    this.gTY.eWP = 1;
    ((zp)this.gTY.gtC.gtK).eKf = paramInt;
    this.eKg = paramBoolean;
    Lm();
    w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo noticeid[%d], manualauthSucc[%b], stack[%s]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.eKg), bg.bQW() });
    GMTrace.o(1357075447808L, 10111);
  }
  
  private void C(final String paramString, final boolean paramBoolean)
  {
    GMTrace.i(1357478100992L, 10114);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1350767214592L, 10064);
        int i;
        final Object localObject1;
        String str;
        int j;
        final Object localObject2;
        if (paramString == null)
        {
          i = -1;
          w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo broadcastEvent content len[%d], cache[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(paramBoolean) });
          localObject1 = new ai();
          ((ai)localObject1).eBo.type = 5;
          ((ai)localObject1).eBo.eBq = paramString;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          str = ((ai)localObject1).eBp.eBv;
          i = ((ai)localObject1).eBp.position;
          j = ((ai)localObject1).eBp.eBs;
          w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd event.result.Actionp[%d] noticeId[%s], position[%d], manualauthSucc[%b], noticeidTickMap[%s]", new Object[] { Integer.valueOf(j), str, Integer.valueOf(i), Boolean.valueOf(o.this.eKg), o.gTZ });
          if ((i != 1) || (j != 6)) {
            break label369;
          }
          if (paramBoolean) {
            o.am(str, paramString);
          }
          if (!o.this.eKg) {
            break label316;
          }
          localObject2 = ((ai)localObject1).eBp.desc;
          localObject1 = ((ai)localObject1).eBp.url;
          w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony after init[%b]", new Object[] { Boolean.valueOf(ab.bPR()) });
          if (o.this.gUb == null) {
            o.this.gUb = new c() {};
          }
          com.tencent.mm.sdk.b.a.vgX.b(o.this.gUb);
        }
        for (;;)
        {
          o.gTZ.put(str, Long.valueOf(bg.Pw()));
          GMTrace.o(1350767214592L, 10064);
          return;
          i = paramString.length();
          break;
          label316:
          localObject2 = new iu();
          ((iu)localObject2).eMu.content = ((ai)localObject1).eBp.desc;
          ((iu)localObject2).eMu.url = ((ai)localObject1).eBp.url;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        }
        label369:
        if (j == 2)
        {
          if (paramBoolean) {
            o.am(str, paramString);
          }
          o.gTZ.put(str, Long.valueOf(bg.Pw()));
        }
        GMTrace.o(1350767214592L, 10064);
      }
    });
    GMTrace.o(1357478100992L, 10114);
  }
  
  private void Lm()
  {
    for (;;)
    {
      int i;
      Object localObject4;
      try
      {
        GMTrace.i(1357612318720L, 10115);
        if (gUa != null) {
          break label374;
        }
        w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap");
        gUa = new HashMap();
        SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("disaster_pref", 4);
        Object localObject1 = localSharedPreferences.getString("disaster_new_noticeid_list_key", "");
        if (bg.nm((String)localObject1)) {
          break label356;
        }
        String[] arrayOfString1 = ((String)localObject1).split(";");
        if ((arrayOfString1 == null) || (arrayOfString1.length <= 0)) {
          break label356;
        }
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        int j = arrayOfString1.length;
        i = 0;
        String str1 = "";
        if (i < j)
        {
          String[] arrayOfString2 = arrayOfString1[i].split(",");
          localObject1 = str1;
          localObject4 = str1;
          try
          {
            if (bg.getLong(arrayOfString2[0], 0L) <= 0L) {
              break label386;
            }
            localObject1 = str1;
            if (bg.aG(bg.getLong(arrayOfString2[1], 0L)) < 86400L)
            {
              localObject1 = str1;
              String str2 = localSharedPreferences.getString(arrayOfString2[0], "");
              localObject1 = str1;
              localObject4 = str1;
              if (!bg.nm(str2))
              {
                localObject1 = str1;
                localObject4 = str1 + arrayOfString2[0] + "," + arrayOfString2[1] + ";";
                localObject1 = localObject4;
                gUa.put(arrayOfString2[0], str2);
              }
            }
            else
            {
              localObject1 = str1;
              localEditor.remove(arrayOfString2[0]).commit();
              localObject4 = str1;
            }
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap error:%s", new Object[] { localException.getMessage() });
            localObject4 = localObject1;
          }
        }
        localEditor.putString("disaster_new_noticeid_list_key", localException).commit();
      }
      finally {}
      w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap newNoticeIdList[%s], noticeidTickMap[%s]", new Object[] { localException, gTZ });
      label356:
      w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz loadNoticeContentMap noticeContentMap done noticeContentMap[%s]", new Object[] { gUa });
      label374:
      GMTrace.o(1357612318720L, 10115);
      return;
      label386:
      i += 1;
      Object localObject3 = localObject4;
    }
  }
  
  public static void am(String paramString1, String paramString2)
  {
    GMTrace.i(16012577603584L, 119303);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("disaster_pref", 4);
    Object localObject2 = localSharedPreferences.getString("disaster_new_noticeid_list_key", "");
    Object localObject1 = localObject2;
    if (!bg.nm((String)localObject2)) {
      localObject1 = (String)localObject2 + ";";
    }
    localObject1 = (String)localObject1 + paramString1 + "," + bg.Pu();
    localObject2 = localSharedPreferences.edit();
    ((SharedPreferences.Editor)localObject2).putString(paramString1, paramString2);
    ((SharedPreferences.Editor)localObject2).putString("disaster_new_noticeid_list_key", (String)localObject1);
    ((SharedPreferences.Editor)localObject2).commit();
    gUa.put(paramString1, paramString2);
    w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz saveDisasterNotice newNoticeIdList[%s], noticeId[%s], content[%s]", new Object[] { localSharedPreferences.getString("disaster_new_noticeid_list_key", ""), paramString1, localSharedPreferences.getString(paramString1, "") });
    GMTrace.o(16012577603584L, 119303);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1357343883264L, 10113);
    zp localzp = (zp)this.gTY.gtC.gtK;
    long l = bg.a((Long)gTZ.get(localzp.eKf), 0L);
    w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene noticeid[%d], tick[%d], noticeidTickMap[%s]", new Object[] { Integer.valueOf(localzp.eKf), Long.valueOf(l), gTZ });
    if ((l != 0L) && (bg.aI(l) < 1800000L))
    {
      w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene disasterTick within half an hour, drop it [%s]", new Object[] { Integer.valueOf(localzp.eKf) });
      GMTrace.o(1357343883264L, 10113);
      return -1;
    }
    String str = bg.aq((String)gUa.get(localzp.eKf), "");
    if (!bg.nm(str))
    {
      w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo doScene found cache[%d, %s]", new Object[] { Integer.valueOf(localzp.eKf), str });
      C(str, false);
      GMTrace.o(1357343883264L, 10113);
      return -1;
    }
    this.fUd = parame1;
    int i = a(parame, this.gTY, this);
    GMTrace.o(1357343883264L, 10113);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1357746536448L, 10116);
    w.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      C(((zq)this.gTY.gtD.gtK).content, true);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1357746536448L, 10116);
  }
  
  public final int getType()
  {
    GMTrace.i(1357209665536L, 10112);
    GMTrace.o(1357209665536L, 10112);
    return 775;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */