package com.tencent.mm.plugin.webview.modeltools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.bw;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.g.a.ij;
import com.tencent.mm.g.a.kt;
import com.tencent.mm.g.a.tl;
import com.tencent.mm.g.a.tm;
import com.tencent.mm.g.a.tm.a;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.webview.fts.c.a;
import com.tencent.mm.plugin.webview.fts.c.b;
import com.tencent.mm.plugin.webview.model.ac;
import com.tencent.mm.plugin.webview.model.ad;
import com.tencent.mm.plugin.webview.model.af;
import com.tencent.mm.plugin.webview.model.ah;
import com.tencent.mm.plugin.webview.model.al;
import com.tencent.mm.plugin.webview.modelcache.k;
import com.tencent.mm.plugin.webview.modelcache.q.a;
import com.tencent.mm.pluginsdk.ui.tools.j;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.t;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f
  implements aq
{
  private static final HashMap<Integer, g.d> fIv;
  com.tencent.mm.sdk.b.c hPq;
  private bt.a jiF;
  private com.tencent.mm.network.n lqE;
  private ac rGO;
  private ad rGP;
  private com.tencent.mm.plugin.webview.model.ab rGQ;
  private i rGR;
  private com.tencent.mm.plugin.webview.model.d rGS;
  private af rGT;
  private com.tencent.mm.plugin.webview.fts.c rGU;
  private com.tencent.mm.plugin.webview.fts.d rGV;
  private com.tencent.mm.plugin.webview.fts.e rGW;
  private com.tencent.mm.plugin.webview.b.a rGX;
  private final com.tencent.mm.plugin.webview.modelcache.n rGY;
  private com.tencent.mm.plugin.webview.wepkg.utils.c rGZ;
  com.tencent.mm.sdk.b.c rHa;
  final com.tencent.mm.sdk.b.c<tl> rHb;
  com.tencent.mm.sdk.b.c rHc;
  com.tencent.mm.sdk.b.c rHd;
  com.tencent.mm.sdk.b.c rHe;
  com.tencent.mm.sdk.b.c rHf;
  private com.tencent.mm.sdk.b.c rHg;
  
  static
  {
    GMTrace.i(11986985287680L, 89310);
    Object localObject = new HashMap();
    fIv = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("WebViewHostsFilterTable".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11987522158592L, 89314);
        String[] arrayOfString = i.fTX;
        GMTrace.o(11987522158592L, 89314);
        return arrayOfString;
      }
    });
    localObject = new LinkedList();
    ((List)localObject).add(com.tencent.mm.plugin.webview.modelcache.a.bCG());
    ((List)localObject).addAll(k.bCI());
    ((List)localObject).add(com.tencent.mm.plugin.webview.modelcache.h.bCG());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.webview.modelcache.d.a locala = (com.tencent.mm.plugin.webview.modelcache.d.a)((Iterator)localObject).next();
      fIv.put(Integer.valueOf(locala.id), locala);
    }
    fIv.put(Integer.valueOf("WEBVIEW_JSLOG_BLOCK_LIST_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11981348143104L, 89268);
        String[] arrayOfString = com.tencent.mm.plugin.webview.model.d.fTX;
        GMTrace.o(11981348143104L, 89268);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WEBVIEW_LOCAL_DATA".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11977858482176L, 89242);
        String[] arrayOfString = af.fTX;
        GMTrace.o(11977858482176L, 89242);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("CHECK_WEPKG_VERSION".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11988998553600L, 89325);
        String[] arrayOfString = com.tencent.mm.plugin.webview.wepkg.a.d.fTX;
        GMTrace.o(11988998553600L, 89325);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WEPKG_PRELOAD_FILES".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(15106071068672L, 112549);
        String[] arrayOfString = com.tencent.mm.plugin.webview.wepkg.a.b.fTX;
        GMTrace.o(15106071068672L, 112549);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("WEBVIEW_DATA".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(19381174140928L, 144401);
        String[] arrayOfString = com.tencent.mm.plugin.webview.c.c.fTX;
        GMTrace.o(19381174140928L, 144401);
        return arrayOfString;
      }
    });
    GMTrace.o(11986985287680L, 89310);
  }
  
  public f()
  {
    GMTrace.i(11984837804032L, 89294);
    this.rGY = new com.tencent.mm.plugin.webview.modelcache.n();
    this.rGZ = new com.tencent.mm.plugin.webview.wepkg.utils.c();
    this.jiF = new bt.a()
    {
      public final void a(com.tencent.mm.ad.d.a paramAnonymousa)
      {
        GMTrace.i(19381308358656L, 144402);
        new Thread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19382382100480L, 144410);
            w.d("MicroMsg.SubCoreTools", "webview hijack sysMsgListener");
            Map localMap = bh.q(this.hJZ, "sysmsg");
            long l = bg.getLong((String)localMap.get(".sysmsg.hijackconfig.expiretime"), Long.MAX_VALUE);
            int i = 0;
            String str1 = ".sysmsg.hijackconfig.domainlist.domain";
            if (i > 0) {
              str1 = ".sysmsg.hijackconfig.domainlist.domain" + i;
            }
            for (;;)
            {
              i += 1;
              String str2 = (String)localMap.get(str1);
              if (!bg.nm(str2))
              {
                h localh = new h();
                localh.field_expireTime = l;
                localh.field_host = str2;
                this.rHi.b(localh);
                break;
              }
              GMTrace.o(19382382100480L, 144410);
              return;
            }
          }
        }).start();
        GMTrace.o(19381308358656L, 144402);
      }
    };
    this.rHa = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(tm paramAnonymoustm)
      {
        GMTrace.i(19382113665024L, 144408);
        Object localObject;
        if ((paramAnonymoustm instanceof tm))
        {
          String str3 = com.tencent.mm.y.q.zE();
          ArrayList localArrayList = new ArrayList();
          localArrayList.add(paramAnonymoustm.eZa.eZb);
          localArrayList.add(paramAnonymoustm.eZa.eZc);
          localArrayList.add(paramAnonymoustm.eZa.eZd);
          localArrayList.add(paramAnonymoustm.eZa.eZe);
          localArrayList.add(paramAnonymoustm.eZa.url);
          localArrayList.add(paramAnonymoustm.eZa.eZf);
          localArrayList.add(paramAnonymoustm.eZa.eZg);
          localArrayList.add(paramAnonymoustm.eZa.eZh);
          localArrayList.add(paramAnonymoustm.eZa.eZi);
          localArrayList.add(paramAnonymoustm.eZa.eZj);
          localArrayList.add(str3);
          localArrayList.add(paramAnonymoustm.eZa.eZk);
          localArrayList.add(paramAnonymoustm.eZa.eZl);
          PString localPString = new PString();
          String str4 = ((com.tencent.mm.plugin.sns.b.i)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.sns.b.i.class)).a(paramAnonymoustm.eZa.eZm, localPString);
          localArrayList.add(str4);
          localArrayList.add("");
          localArrayList.add("");
          localArrayList.add("");
          int i = t.H(paramAnonymoustm.eZa.eZd, paramAnonymoustm.eZa.eZe);
          int j = t.H(str3, paramAnonymoustm.eZa.eZg);
          localArrayList.add(String.valueOf(i));
          localArrayList.add(String.valueOf(j));
          localObject = paramAnonymoustm.eZa.eZn;
          try
          {
            str1 = URLEncoder.encode((String)localObject, "UTF-8");
            localObject = str1;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              String str1;
              String str5;
              String str6;
              String str7;
              String str8;
              int k;
              String str9;
              String str10;
              int m;
              int n;
              int i1;
              w.printErrStackTrace("MicroMsg.SubCoreTools", localException, "", new Object[0]);
              continue;
              localObject = paramAnonymoustm.eZa.url.replace(",", "!");
              continue;
              String str2 = paramAnonymoustm.eZa.eZl.replace(",", "!");
            }
          }
          localArrayList.add(localObject);
          localArrayList.add(localPString.value);
          str5 = paramAnonymoustm.eZa.eZb;
          str6 = paramAnonymoustm.eZa.eZc;
          str7 = paramAnonymoustm.eZa.eZd;
          str8 = paramAnonymoustm.eZa.eZe;
          if (paramAnonymoustm.eZa.url == null)
          {
            localObject = paramAnonymoustm.eZa.url;
            k = paramAnonymoustm.eZa.eZf;
            str9 = paramAnonymoustm.eZa.eZg;
            str10 = paramAnonymoustm.eZa.eZh;
            m = paramAnonymoustm.eZa.eZi;
            n = paramAnonymoustm.eZa.eZj;
            i1 = paramAnonymoustm.eZa.eZk;
            if (paramAnonymoustm.eZa.eZl != null) {
              break label788;
            }
            str1 = paramAnonymoustm.eZa.eZl;
            w.d("MicroMsg.SubCoreTools", "report(11954) : prePublishId : %s, curPublishId : %s, preUsername : %s, preChatName : %s, url : %s, preMsgIndex : %s, curChatName : %s, curChatTitle : %s, curChatMemberCount : %s, sendAppMsgScene : %s, curUserName : %s, getA8KeyScene : %s, referUrl : %s. : statExtStr:%s(%s), preChatType:%d, curChatType:%d, webViewTitle:%s, sourceAppId:%s", new Object[] { str5, str6, str7, str8, localObject, Integer.valueOf(k), str9, str10, Integer.valueOf(m), Integer.valueOf(n), str3, Integer.valueOf(i1), str1, paramAnonymoustm.eZa.eZm, str4, Integer.valueOf(i), Integer.valueOf(j), paramAnonymoustm.eZa.eZn, localPString.value });
            if (paramAnonymoustm.eZa.eZo != 2) {
              com.tencent.mm.plugin.report.service.g.ork.d(11954, localArrayList);
            }
            GMTrace.o(19382113665024L, 144408);
            return true;
          }
        }
        label788:
        GMTrace.o(19382113665024L, 144408);
        return false;
      }
    };
    this.rHb = new com.tencent.mm.sdk.b.c() {};
    this.rHc = new com.tencent.mm.sdk.b.c() {};
    this.hPq = new com.tencent.mm.sdk.b.c() {};
    this.rHd = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(ck paramAnonymousck)
      {
        GMTrace.i(19381711011840L, 144405);
        String str1;
        if ((paramAnonymousck instanceof ck))
        {
          paramAnonymousck = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
          str1 = com.tencent.mm.k.g.ut().getValue("WebviewDownloadTbs");
          String str2 = com.tencent.mm.k.g.ut().getValue("WebviewEnableTbs");
          w.i("MicroMsg.SubCoreTools", "updateWebViewDynamicConfig, tbsDownload = %s, tbsEnable = %s, tbsSupportedVerSec = %s", new Object[] { str1, str2, com.tencent.mm.k.g.ut().getValue("WebviewSupportedTbsVersionSection") });
          if (str1 != null) {
            paramAnonymousck.putString("tbs_download", str1);
          }
          paramAnonymousck.apply();
          if (("1".equals(str1)) && ("1".equals(str2))) {
            j.nU(1);
          }
          if (str1 == null) {}
        }
        try
        {
          if ("0".equals(str1))
          {
            w.i("MicroMsg.SubCoreTools", "tbs download disable, reset tbssdk in sandbox");
            paramAnonymousck = new Intent();
            paramAnonymousck.setComponent(new ComponentName(com.tencent.mm.sdk.platformtools.ab.getPackageName(), "com.tencent.mm.booter.MMReceivers$SandBoxProcessReceiver"));
            com.tencent.mm.sdk.platformtools.ab.getContext().sendBroadcast(paramAnonymousck);
          }
          GMTrace.o(19381711011840L, 144405);
          return false;
        }
        catch (Exception paramAnonymousck)
        {
          for (;;)
          {
            w.w("MicroMsg.SubCoreTools", "sendbroadcast ,ex = %s", new Object[] { paramAnonymousck.getMessage() });
          }
        }
      }
    };
    this.rHe = new com.tencent.mm.sdk.b.c() {};
    this.rHf = new com.tencent.mm.sdk.b.c() {};
    this.rHg = new com.tencent.mm.sdk.b.c() {};
    this.lqE = new n.a()
    {
      private final byte[] fJa;
      
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(19381979447296L, 144407);
        synchronized (this.fJa)
        {
          if (am.getNetType(com.tencent.mm.sdk.platformtools.ab.getContext()) == 0)
          {
            ah.bCp().setNetWorkState(1);
            GMTrace.o(19381979447296L, 144407);
            return;
          }
          ah.bCp().setNetWorkState(2);
        }
      }
    };
    GMTrace.o(11984837804032L, 89294);
  }
  
  public static f bCQ()
  {
    GMTrace.i(11984972021760L, 89295);
    f localf2 = (f)at.AK().gZ("plugin.webview");
    f localf1 = localf2;
    if (localf2 == null)
    {
      localf1 = new f();
      w.e("MicroMsg.SubCoreTools", "new SubCoreTools add to subCore:%d", new Object[] { Integer.valueOf(localf1.hashCode()) });
      at.AK().a("plugin.webview", localf1);
    }
    GMTrace.o(11984972021760L, 89295);
    return localf1;
  }
  
  public static com.tencent.mm.plugin.webview.b.a bCR()
  {
    GMTrace.i(11985106239488L, 89296);
    if (bCQ().rGX == null) {
      bCQ().rGX = new com.tencent.mm.plugin.webview.b.a();
    }
    com.tencent.mm.plugin.webview.b.a locala = bCQ().rGX;
    GMTrace.o(11985106239488L, 89296);
    return locala;
  }
  
  public static com.tencent.mm.plugin.webview.fts.d bCS()
  {
    GMTrace.i(15623614627840L, 116405);
    if (bCQ().rGV == null) {
      bCQ().rGV = new com.tencent.mm.plugin.webview.fts.d();
    }
    com.tencent.mm.plugin.webview.fts.d locald = bCQ().rGV;
    GMTrace.o(15623614627840L, 116405);
    return locald;
  }
  
  public static com.tencent.mm.plugin.webview.fts.e bCT()
  {
    GMTrace.i(11985240457216L, 89297);
    if (bCQ().rGW == null) {
      bCQ().rGW = new com.tencent.mm.plugin.webview.fts.e();
    }
    com.tencent.mm.plugin.webview.fts.e locale = bCQ().rGW;
    GMTrace.o(11985240457216L, 89297);
    return locale;
  }
  
  public static com.tencent.mm.plugin.webview.fts.c bCU()
  {
    GMTrace.i(11985374674944L, 89298);
    if (bCQ().rGU == null) {
      bCQ().rGU = new com.tencent.mm.plugin.webview.fts.c();
    }
    com.tencent.mm.plugin.webview.fts.c localc = bCQ().rGU;
    GMTrace.o(11985374674944L, 89298);
    return localc;
  }
  
  public static ac bCV()
  {
    GMTrace.i(11985643110400L, 89300);
    if (bCQ().rGO == null) {
      bCQ().rGO = new ac();
    }
    ac localac = bCQ().rGO;
    GMTrace.o(11985643110400L, 89300);
    return localac;
  }
  
  public static ad bCW()
  {
    GMTrace.i(11985777328128L, 89301);
    if (bCQ().rGP == null) {
      bCQ().rGP = ad.bCn();
    }
    ad localad = bCQ().rGP;
    GMTrace.o(11985777328128L, 89301);
    return localad;
  }
  
  public static i bCX()
  {
    GMTrace.i(11985911545856L, 89302);
    if (bCQ().rGR == null)
    {
      localObject = bCQ();
      at.AR();
      ((f)localObject).rGR = new i(com.tencent.mm.y.c.yH());
    }
    Object localObject = bCQ().rGR;
    GMTrace.o(11985911545856L, 89302);
    return (i)localObject;
  }
  
  public static com.tencent.mm.plugin.webview.model.d bCY()
  {
    GMTrace.i(11986045763584L, 89303);
    if (bCQ().rGS == null)
    {
      localObject = bCQ();
      at.AR();
      ((f)localObject).rGS = new com.tencent.mm.plugin.webview.model.d(com.tencent.mm.y.c.yH());
    }
    Object localObject = bCQ().rGS;
    GMTrace.o(11986045763584L, 89303);
    return (com.tencent.mm.plugin.webview.model.d)localObject;
  }
  
  public static af bCZ()
  {
    GMTrace.i(11986179981312L, 89304);
    if (bCQ().rGT == null)
    {
      localObject = bCQ();
      at.AR();
      ((f)localObject).rGT = new af(com.tencent.mm.y.c.yH());
    }
    Object localObject = bCQ().rGT;
    GMTrace.o(11986179981312L, 89304);
    return (af)localObject;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(11986716852224L, 89308);
    w.i("MicroMsg.SubCoreTools", "onAccountPostReset hc:%d", new Object[] { Integer.valueOf(hashCode()) });
    if ((f)at.AK().gZ("plugin.webview") == null)
    {
      localObject = new f();
      at.AK().a("plugin.webview", (aq)localObject);
      w.e("MicroMsg.SubCoreTools", "getCore, should not be here:%d", new Object[] { Integer.valueOf(localObject.hashCode()) });
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.rHc);
    com.tencent.mm.sdk.b.a.vgX.b(this.rHd);
    com.tencent.mm.sdk.b.a.vgX.b(this.rHe);
    com.tencent.mm.sdk.b.a.vgX.b(this.rHf);
    com.tencent.mm.sdk.b.a.vgX.b(this.rHa);
    com.tencent.mm.sdk.b.a.vgX.b(this.hPq);
    com.tencent.mm.sdk.b.a.vgX.b(this.rHg);
    at.getSysCmdMsgExtension().a("hijackconfig", this.jiF, true);
    at.a(this.lqE);
    Object localObject = this.rGY;
    com.tencent.mm.plugin.webview.modelcache.n.bCK();
    com.tencent.mm.plugin.webview.modelcache.q localq = q.a.rGn;
    com.tencent.mm.sdk.b.a.vgX.b(localq.rFY);
    com.tencent.mm.sdk.b.a.vgX.b(localq.rFZ);
    at.getSysCmdMsgExtension().a("webcache", ((com.tencent.mm.plugin.webview.modelcache.n)localObject).rFQ, true);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.modelcache.n)localObject).rFR);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.modelcache.n)localObject).rFS);
    localObject = this.rGZ;
    w.i("MicroMsg.Wepkg.WepkgListener", "wepkg start listen");
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.wepkg.utils.c)localObject).rZr);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.wepkg.utils.c)localObject).rZs);
    com.tencent.mm.plugin.webview.wepkg.b.a.aFc();
    localObject = com.tencent.mm.sdk.platformtools.ab.getContext();
    if (localObject != null) {}
    for (;;)
    {
      try
      {
        localObject = ((Context)localObject).getSharedPreferences("we_pkg_sp", 4);
        if (localObject != null) {
          continue;
        }
        w.e("MicroMsg.Wepkg.WepkgListener", "sp is null");
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.Wepkg.WepkgListener", localException.getMessage());
        continue;
      }
      com.tencent.mm.plugin.ad.c.oRx.a(new al());
      this.rHb.bPu();
      GMTrace.o(11986716852224L, 89308);
      return;
      if (((SharedPreferences)localObject).getBoolean("disable_we_pkg", false))
      {
        w.i("MicroMsg.Wepkg.WepkgListener", "enable wepkg");
        ((SharedPreferences)localObject).edit().putBoolean("disable_we_pkg", false).commit();
      }
      ((SharedPreferences)localObject).edit().putInt("white_screen_times", 0).commit();
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(11986851069952L, 89309);
    com.tencent.mm.plugin.webview.modelcache.n.bCK();
    GMTrace.o(11986851069952L, 89309);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(11986582634496L, 89307);
    GMTrace.o(11986582634496L, 89307);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(11986314199040L, 89305);
    w.i("MicroMsg.SubCoreTools", "onAccountRelease hc:%d", new Object[] { Integer.valueOf(hashCode()) });
    com.tencent.mm.sdk.b.a.vgX.c(this.rHc);
    com.tencent.mm.sdk.b.a.vgX.c(this.rHd);
    com.tencent.mm.sdk.b.a.vgX.c(this.rHe);
    com.tencent.mm.sdk.b.a.vgX.c(this.rHf);
    com.tencent.mm.sdk.b.a.vgX.c(this.rHa);
    com.tencent.mm.sdk.b.a.vgX.c(this.hPq);
    com.tencent.mm.sdk.b.a.vgX.c(this.rHg);
    at.b(this.lqE);
    Object localObject2;
    if (this.rGQ != null)
    {
      localObject1 = this.rGQ;
      if (((com.tencent.mm.plugin.webview.model.ab)localObject1).rEz != null)
      {
        com.tencent.mm.plugin.downloader.model.f.apJ();
        com.tencent.mm.plugin.downloader.model.c.b(((com.tencent.mm.plugin.webview.model.ab)localObject1).rEz);
      }
      if ((((com.tencent.mm.plugin.webview.model.ab)localObject1).rEA != null) && (((com.tencent.mm.plugin.webview.model.ab)localObject1).rEA.size() > 0))
      {
        localObject1 = ((com.tencent.mm.plugin.webview.model.ab)localObject1).rEA.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Long)((Iterator)localObject1).next();
          w.i("MicroMsg.WebViewAutoDownloader", "remove download task : %d", new Object[] { localObject2 });
          com.tencent.mm.plugin.downloader.model.f.apJ().bf(((Long)localObject2).longValue());
        }
      }
    }
    if (this.rGW != null)
    {
      localObject1 = this.rGW;
      com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.webview.fts.e)localObject1).ian);
      ((com.tencent.mm.plugin.webview.fts.e)localObject1).bBJ();
      this.rGW = null;
    }
    if (this.rGU != null)
    {
      localObject1 = this.rGU;
      localObject2 = ((com.tencent.mm.plugin.webview.fts.c)localObject1).rBP;
      if (((c.a)localObject2).rBS != null) {
        at.wS().c(((c.a)localObject2).rBS);
      }
      if (((c.a)localObject2).rBU != null) {
        ((c.a)localObject2).rBU.mFj = true;
      }
      localObject2 = ((com.tencent.mm.plugin.webview.fts.c)localObject1).rBQ;
      if (((c.b)localObject2).rBX != null) {
        at.wS().b(((c.b)localObject2).rBX.getType(), ((c.b)localObject2).rBR);
      }
      if (((com.tencent.mm.plugin.webview.fts.c)localObject1).lwZ != null)
      {
        ((l)com.tencent.mm.kernel.h.j(l.class)).cancelSearchTask(((com.tencent.mm.plugin.webview.fts.c)localObject1).lwZ);
        ((com.tencent.mm.plugin.webview.fts.c)localObject1).lwZ = null;
      }
      this.rGU = null;
    }
    if (this.rGV != null)
    {
      localObject1 = this.rGV;
      ((com.tencent.mm.plugin.webview.fts.d)localObject1).ppA.dead();
      ((com.tencent.mm.plugin.webview.fts.d)localObject1).rCe.dead();
      com.tencent.mm.ac.n.Di().j((j.a)localObject1);
      this.rGV = null;
    }
    at.getSysCmdMsgExtension().b("hijackconfig", this.jiF, true);
    if (this.rGS != null) {
      this.rGS.bCc();
    }
    Object localObject1 = this.rGY;
    at.getSysCmdMsgExtension().b("webcache", ((com.tencent.mm.plugin.webview.modelcache.n)localObject1).rFQ, true);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.webview.modelcache.n)localObject1).rFR);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.webview.modelcache.n)localObject1).rFS);
    localObject1 = q.a.rGn;
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.webview.modelcache.q)localObject1).rFY);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.webview.modelcache.q)localObject1).rFZ);
    ((com.tencent.mm.plugin.webview.modelcache.q)localObject1).release(true);
    localObject1 = this.rGZ;
    w.i("MicroMsg.Wepkg.WepkgListener", "wepkg stop listen");
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.webview.wepkg.utils.c)localObject1).rZr);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.webview.wepkg.utils.c)localObject1).rZs);
    com.tencent.mm.plugin.webview.wepkg.b.a.aFd();
    com.tencent.mm.plugin.webview.wepkg.utils.d.abA();
    this.rHb.dead();
    GMTrace.o(11986314199040L, 89305);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(11986448416768L, 89306);
    HashMap localHashMap = fIv;
    GMTrace.o(11986448416768L, 89306);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */