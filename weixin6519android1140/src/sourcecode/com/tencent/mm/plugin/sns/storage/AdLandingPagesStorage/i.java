package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.database.Cursor;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.plugin.sns.storage.d;
import com.tencent.mm.plugin.sns.storage.x;
import com.tencent.mm.protocal.c.abr;
import com.tencent.mm.protocal.c.abs;
import com.tencent.mm.protocal.c.vv;
import com.tencent.mm.protocal.c.vw;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class i
{
  private static final i pLT;
  public Map<Long, String> lpv;
  public d pLU;
  public x pLV;
  public Map<String, String> pLW;
  
  static
  {
    GMTrace.i(16641790312448L, 123991);
    pLT = new i();
    GMTrace.o(16641790312448L, 123991);
  }
  
  private i()
  {
    GMTrace.i(16641656094720L, 123990);
    this.pLU = com.tencent.mm.plugin.sns.model.ae.bje();
    this.lpv = new HashMap();
    this.pLV = com.tencent.mm.plugin.sns.model.ae.bjf();
    this.pLW = new HashMap();
    HandlerThread localHandlerThread = e.SV("OpenCanvasMgr");
    localHandlerThread.start();
    new com.tencent.mm.sdk.platformtools.ae(localHandlerThread.getLooper()).postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16642461401088L, 123996);
        i locali = i.this;
        com.tencent.mm.sdk.platformtools.w.i("OpenCanvasMgr", "clearing old canvasInfo cache");
        Cursor localCursor = locali.pLU.Mx();
        if (localCursor != null)
        {
          long l = System.currentTimeMillis();
          Object localObject;
          while (localCursor.moveToNext())
          {
            localObject = new com.tencent.mm.plugin.sns.storage.c();
            ((com.tencent.mm.plugin.sns.storage.c)localObject).b(localCursor);
            if (((com.tencent.mm.plugin.sns.storage.c)localObject).field_createTime < l - 777600000L)
            {
              com.tencent.mm.sdk.platformtools.w.i("OpenCanvasMgr", "ad canvas eliminate %d " + ((com.tencent.mm.plugin.sns.storage.c)localObject).field_canvasId);
              locali.pLU.a((com.tencent.mm.sdk.e.c)localObject, new String[0]);
            }
          }
          localCursor.close();
          localCursor = locali.pLV.Mx();
          if (localCursor != null)
          {
            l = System.currentTimeMillis();
            while (localCursor.moveToNext())
            {
              localObject = new com.tencent.mm.plugin.sns.storage.w();
              ((com.tencent.mm.plugin.sns.storage.w)localObject).b(localCursor);
              if (((com.tencent.mm.plugin.sns.storage.w)localObject).field_createTime < l - 777600000L)
              {
                com.tencent.mm.sdk.platformtools.w.i("OpenCanvasMgr", "ux canvas eliminate %d " + ((com.tencent.mm.plugin.sns.storage.w)localObject).field_canvasId);
                locali.pLV.a((com.tencent.mm.sdk.e.c)localObject, new String[0]);
              }
            }
            localCursor.close();
          }
        }
        GMTrace.o(16642461401088L, 123996);
      }
    }, 5000L);
    GMTrace.o(16641656094720L, 123990);
  }
  
  public static i bly()
  {
    GMTrace.i(16641521876992L, 123989);
    i locali = pLT;
    GMTrace.o(16641521876992L, 123989);
    return locali;
  }
  
  public final String P(final String paramString, final int paramInt1, int paramInt2)
  {
    GMTrace.i(20837302272000L, 155250);
    com.tencent.mm.sdk.platformtools.w.i("OpenCanvasMgr", "open pageId %s, preLoad %d", new Object[] { paramString, Integer.valueOf(paramInt1) });
    if (bg.nm(paramString))
    {
      GMTrace.o(20837302272000L, 155250);
      return "";
    }
    final Object localObject1 = "";
    if (paramInt2 != 1)
    {
      if (!this.pLW.containsKey(paramString)) {
        break label101;
      }
      localObject1 = (String)this.pLW.get(paramString);
    }
    while (paramInt1 != 1)
    {
      GMTrace.o(20837302272000L, 155250);
      return (String)localObject1;
      label101:
      localObject1 = new com.tencent.mm.plugin.sns.storage.w();
      ((com.tencent.mm.plugin.sns.storage.w)localObject1).field_canvasId = paramString;
      this.pLV.b((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
      if (!TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.w)localObject1).field_canvasXml))
      {
        this.pLW.put(paramString, ((com.tencent.mm.plugin.sns.storage.w)localObject1).field_canvasXml);
        localObject1 = ((com.tencent.mm.plugin.sns.storage.w)localObject1).field_canvasXml;
      }
      else
      {
        localObject1 = "";
      }
    }
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject1 = new com.tencent.mm.plugin.sns.storage.w();
      ((com.tencent.mm.plugin.sns.storage.w)localObject1).field_canvasId = paramString;
      Object localObject2 = new b.a();
      ((b.a)localObject2).gtF = new abr();
      ((b.a)localObject2).gtG = new abs();
      ((b.a)localObject2).uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_getofficialcanvasinfo";
      ((b.a)localObject2).gtE = 1890;
      localObject2 = ((b.a)localObject2).DA();
      ((abr)((com.tencent.mm.ad.b)localObject2).gtC.gtK).usk = paramString;
      u.a((com.tencent.mm.ad.b)localObject2, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(20837033836544L, 155248);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            com.tencent.mm.sdk.platformtools.w.e("OpenCanvasMgr", "cgi fail pageid %s,preLoad %d, errType %d,errCode %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            GMTrace.o(20837033836544L, 155248);
            return 0;
          }
          paramAnonymousString = ((abs)paramAnonymousb.gtD.gtK).usl.bNS();
          com.tencent.mm.sdk.platformtools.w.i("OpenCanvasMgr", "getCanvasInfo pageid %s ,xml %s", new Object[] { paramString, paramAnonymousString });
          if (!TextUtils.isEmpty(paramAnonymousString))
          {
            i.this.pLW.put(paramString, paramAnonymousString);
            localObject1.field_canvasXml = paramAnonymousString;
            i.this.pLV.a(localObject1);
          }
          GMTrace.o(20837033836544L, 155248);
          return 0;
        }
      });
      GMTrace.o(20837302272000L, 155250);
      return "";
    }
    GMTrace.o(20837302272000L, 155250);
    return (String)localObject1;
  }
  
  public final String e(final long paramLong, int paramInt1, int paramInt2)
  {
    GMTrace.i(18581639135232L, 138444);
    com.tencent.mm.sdk.platformtools.w.i("OpenCanvasMgr", "open pageId %d, preLoad %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1) });
    if (paramLong <= 0L)
    {
      GMTrace.o(18581639135232L, 138444);
      return "";
    }
    final Object localObject1 = "";
    if (paramInt2 != 1)
    {
      if (!this.lpv.containsKey(Long.valueOf(paramLong))) {
        break label110;
      }
      localObject1 = (String)this.lpv.get(Long.valueOf(paramLong));
    }
    while (paramInt1 != 1)
    {
      GMTrace.o(18581639135232L, 138444);
      return (String)localObject1;
      label110:
      localObject1 = new com.tencent.mm.plugin.sns.storage.c();
      ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasId = paramLong;
      this.pLU.b((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
      if (!TextUtils.isEmpty(((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasXml))
      {
        this.lpv.put(Long.valueOf(paramLong), ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasXml);
        localObject1 = ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasXml;
      }
      else
      {
        localObject1 = "";
      }
    }
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject1 = new com.tencent.mm.plugin.sns.storage.c();
      ((com.tencent.mm.plugin.sns.storage.c)localObject1).field_canvasId = paramLong;
      Object localObject2 = new b.a();
      ((b.a)localObject2).gtF = new vv();
      ((b.a)localObject2).gtG = new vw();
      ((b.a)localObject2).uri = "/cgi-bin/mmoc-bin/adplayinfo/get_adcanvasinfo";
      ((b.a)localObject2).gtE = 1286;
      localObject2 = ((b.a)localObject2).DA();
      ((vv)((com.tencent.mm.ad.b)localObject2).gtC.gtK).uot = paramLong;
      u.a((com.tencent.mm.ad.b)localObject2, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(16641387659264L, 123988);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            com.tencent.mm.sdk.platformtools.w.e("OpenCanvasMgr", "cgi fail page id %d,preLoad %d, errType %d,errCode %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localObject1), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            GMTrace.o(16641387659264L, 123988);
            return 0;
          }
          paramAnonymousString = (vw)paramAnonymousb.gtD.gtK;
          com.tencent.mm.sdk.platformtools.w.i("OpenCanvasMgr", "getCanvasInfo pageid %d ,xml %s", new Object[] { Long.valueOf(paramLong), paramAnonymousString.uou });
          if (!TextUtils.isEmpty(paramAnonymousString.uou))
          {
            i.this.lpv.put(Long.valueOf(paramLong), paramAnonymousString.uou);
            this.pMa.field_canvasXml = paramAnonymousString.uou;
            i.this.pLU.a(this.pMa);
          }
          GMTrace.o(16641387659264L, 123988);
          return 0;
        }
      });
      GMTrace.o(18581639135232L, 138444);
      return "";
    }
    GMTrace.o(18581639135232L, 138444);
    return (String)localObject1;
  }
  
  public final void o(long paramLong, String paramString)
  {
    GMTrace.i(18581773352960L, 138445);
    if ((!TextUtils.isEmpty(paramString)) && (paramLong > 0L))
    {
      this.lpv.put(Long.valueOf(paramLong), paramString);
      com.tencent.mm.plugin.sns.storage.c localc = new com.tencent.mm.plugin.sns.storage.c();
      localc.field_canvasId = paramLong;
      localc.field_canvasXml = paramString;
      this.pLU.a(localc);
    }
    GMTrace.o(18581773352960L, 138445);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */