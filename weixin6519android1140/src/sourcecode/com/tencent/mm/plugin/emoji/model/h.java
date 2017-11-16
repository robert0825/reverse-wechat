package com.tencent.mm.plugin.emoji.model;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a.b.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.plugin.emoji.e.j.1;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager.ConnectivityReceiver;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.e.a;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.storage.emotion.r;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.view.SmileyPanelImpl;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class h
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private c kkI;
  private com.tencent.mm.plugin.emoji.e.a kkJ;
  private com.tencent.mm.plugin.emoji.e.g kkK;
  private i kkL;
  private f kkM;
  private d kkN;
  private com.tencent.mm.plugin.emoji.sync.a<com.tencent.mm.plugin.emoji.sync.d> kkO;
  private com.tencent.mm.plugin.emoji.e.h kkP;
  private com.tencent.mm.plugin.emoji.e.b kkQ;
  private com.tencent.mm.plugin.emoji.e.l kkR;
  private com.tencent.mm.plugin.emoji.e.j kkS;
  private com.tencent.mm.ao.a.a kkT;
  private b kkU;
  
  static
  {
    GMTrace.i(11316701954048L, 84316);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("EMOJIINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11304756576256L, 84227);
        String[] arrayOfString = com.tencent.mm.storage.emotion.d.fTX;
        GMTrace.o(11304756576256L, 84227);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("EMOJIGROUPINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11307172495360L, 84245);
        String[] arrayOfString = com.tencent.mm.storage.emotion.a.fTX;
        GMTrace.o(11307172495360L, 84245);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("EMOJIINFODESC_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11306904059904L, 84243);
        String[] arrayOfString = com.tencent.mm.storage.emotion.c.fTX;
        GMTrace.o(11306904059904L, 84243);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("EMOTIONDETAIL_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11317238824960L, 84320);
        String[] arrayOfString = com.tencent.mm.storage.emotion.j.fTX;
        GMTrace.o(11317238824960L, 84320);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("GETEMOTIONLISTCACHE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11305561882624L, 84233);
        String[] arrayOfString = p.fTX;
        GMTrace.o(11305561882624L, 84233);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("EmotionRewardINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11308246237184L, 84253);
        String[] arrayOfString = com.tencent.mm.storage.emotion.l.fTX;
        GMTrace.o(11308246237184L, 84253);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("EmotionDesignerInfoStorage_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11309588414464L, 84263);
        String[] arrayOfString = com.tencent.mm.storage.emotion.h.fTX;
        GMTrace.o(11309588414464L, 84263);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("EmotionRewardTipStorage_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11316970389504L, 84318);
        String[] arrayOfString = com.tencent.mm.storage.emotion.n.fTX;
        GMTrace.o(11316970389504L, 84318);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("SmileyInfoStorage_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11305293447168L, 84231);
        String[] arrayOfString = r.fTX;
        GMTrace.o(11305293447168L, 84231);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("SmileyPanelConfigInfoStorage_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11308514672640L, 84255);
        String[] arrayOfString = com.tencent.mm.storage.emotion.t.fTX;
        GMTrace.o(11308514672640L, 84255);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("EmojiDescMapStorage".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11319252090880L, 84335);
        String[] arrayOfString = com.tencent.mm.storage.emotion.f.fTX;
        GMTrace.o(11319252090880L, 84335);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("DELETE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(16373757509632L, 121994);
        GMTrace.o(16373757509632L, 121994);
        return new String[] { "DROP TABLE IF EXISTS EmotionDetail ", "DROP TABLE IF EXISTS EmojiSummaryInfo", "DROP TABLE IF EXISTS RewardMagicInfo" };
      }
    });
    GMTrace.o(11316701954048L, 84316);
  }
  
  public h()
  {
    GMTrace.i(11314286034944L, 84298);
    ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).setEmojiMgrProvider(new com.tencent.mm.plugin.emoji.b.b()
    {
      public final com.tencent.mm.pluginsdk.c.d aqq()
      {
        GMTrace.i(16374294380544L, 121998);
        com.tencent.mm.plugin.emoji.e.g localg = h.arh();
        GMTrace.o(16374294380544L, 121998);
        return localg;
      }
    });
    GMTrace.o(11314286034944L, 84298);
  }
  
  public static com.tencent.mm.ao.a.a aqJ()
  {
    GMTrace.i(11314554470400L, 84300);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkT == null)
    {
      localObject = new b.a(ab.getContext());
      ((b.a)localObject).gKs = new com.tencent.mm.plugin.emoji.d.a();
      ((b.a)localObject).gKq = new com.tencent.mm.view.d.a();
      localObject = ((b.a)localObject).Jm();
      are().kkT = new com.tencent.mm.ao.a.a((com.tencent.mm.ao.a.a.b)localObject);
    }
    Object localObject = are().kkT;
    GMTrace.o(11314554470400L, 84300);
    return (com.tencent.mm.ao.a.a)localObject;
  }
  
  private static h are()
  {
    GMTrace.i(11314420252672L, 84299);
    h localh2 = (h)at.AK().gZ("plugin.emoji");
    h localh1 = localh2;
    if (localh2 == null)
    {
      localh1 = localh2;
      if (localh2 != null) {}
    }
    try
    {
      localh1 = new h();
      at.AK().a("plugin.emoji", localh1);
      GMTrace.o(11314420252672L, 84299);
      return localh1;
    }
    finally {}
  }
  
  public static c arf()
  {
    GMTrace.i(11314688688128L, 84301);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkI == null) {
      are().kkI = new c();
    }
    c localc = are().kkI;
    GMTrace.o(11314688688128L, 84301);
    return localc;
  }
  
  public static com.tencent.mm.plugin.emoji.e.a arg()
  {
    GMTrace.i(11314822905856L, 84302);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkJ == null) {
      are().kkJ = new com.tencent.mm.plugin.emoji.e.a();
    }
    com.tencent.mm.plugin.emoji.e.a locala = are().kkJ;
    GMTrace.o(11314822905856L, 84302);
    return locala;
  }
  
  public static com.tencent.mm.plugin.emoji.e.g arh()
  {
    GMTrace.i(11314957123584L, 84303);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkK == null) {
      are().kkK = new com.tencent.mm.plugin.emoji.e.g();
    }
    com.tencent.mm.plugin.emoji.e.g localg = are().kkK;
    GMTrace.o(11314957123584L, 84303);
    return localg;
  }
  
  public static com.tencent.mm.plugin.emoji.sync.a<com.tencent.mm.plugin.emoji.sync.d> ari()
  {
    GMTrace.i(11315091341312L, 84304);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkO == null) {
      are().kkO = new com.tencent.mm.plugin.emoji.sync.a();
    }
    com.tencent.mm.plugin.emoji.sync.a locala = are().kkO;
    GMTrace.o(11315091341312L, 84304);
    return locala;
  }
  
  private static com.tencent.mm.plugin.emoji.e.h arj()
  {
    GMTrace.i(11315225559040L, 84305);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkP == null) {
      are().kkP = new com.tencent.mm.plugin.emoji.e.h();
    }
    com.tencent.mm.plugin.emoji.e.h localh = are().kkP;
    GMTrace.o(11315225559040L, 84305);
    return localh;
  }
  
  private static com.tencent.mm.plugin.emoji.e.b ark()
  {
    GMTrace.i(11315359776768L, 84306);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkQ == null) {
      are().kkQ = new com.tencent.mm.plugin.emoji.e.b();
    }
    com.tencent.mm.plugin.emoji.e.b localb = are().kkQ;
    GMTrace.o(11315359776768L, 84306);
    return localb;
  }
  
  public static com.tencent.mm.plugin.emoji.e.l arl()
  {
    GMTrace.i(11315493994496L, 84307);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkR == null) {
      are().kkR = new com.tencent.mm.plugin.emoji.e.l();
    }
    com.tencent.mm.plugin.emoji.e.l locall = are().kkR;
    GMTrace.o(11315493994496L, 84307);
    return locall;
  }
  
  public static com.tencent.mm.plugin.emoji.e.j arm()
  {
    GMTrace.i(11315628212224L, 84308);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkS == null) {
      are().kkS = new com.tencent.mm.plugin.emoji.e.j();
    }
    com.tencent.mm.plugin.emoji.e.j localj = are().kkS;
    GMTrace.o(11315628212224L, 84308);
    return localj;
  }
  
  public static d arn()
  {
    GMTrace.i(11316433518592L, 84314);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkN == null) {
      are().kkN = new d();
    }
    d locald = are().kkN;
    GMTrace.o(11316433518592L, 84314);
    return locald;
  }
  
  public static b aro()
  {
    GMTrace.i(11316567736320L, 84315);
    com.tencent.mm.kernel.h.xw().wG();
    if (are().kkU == null) {
      are().kkU = new b();
    }
    b localb = are().kkU;
    GMTrace.o(11316567736320L, 84315);
    return localb;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(11316165083136L, 84312);
    w.i("MicroMsg.emoji.SubCoreEmoji", "[onAccountPostReset]");
    com.tencent.mm.pluginsdk.ui.chat.e.tAM = new e.b()
    {
      public final ChatFooterPanel ci(Context paramAnonymousContext)
      {
        GMTrace.i(16374025945088L, 121996);
        paramAnonymousContext = new SmileyPanelImpl(paramAnonymousContext);
        GMTrace.o(16374025945088L, 121996);
        return paramAnonymousContext;
      }
    };
    com.tencent.mm.pluginsdk.ui.chat.e.tAN = new e.a() {};
    ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).setEmojiMgr();
    Object localObject1 = arj();
    at.getSysCmdMsgExtension().a("emotionstore", ((com.tencent.mm.plugin.emoji.e.h)localObject1).kiv, true);
    at.getSysCmdMsgExtension().a("NewRecommendEmotion", ((com.tencent.mm.plugin.emoji.e.h)localObject1).kiw, true);
    at.getSysCmdMsgExtension().a("EmojiBackup", ((com.tencent.mm.plugin.emoji.e.h)localObject1).kix, true);
    at.getSysCmdMsgExtension().a("EmotionBackup", ((com.tencent.mm.plugin.emoji.e.h)localObject1).kix, true);
    localObject1 = ark();
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).khT);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).khX);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).khY);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).khZ);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).kia);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).kib);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).kic);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).kid);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).kie);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).khU);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).khV);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).kif);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).kig);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.b)localObject1).khW);
    localObject1 = arl();
    ((com.tencent.mm.plugin.emoji.e.l)localObject1).kjy.c(((com.tencent.mm.plugin.emoji.e.l)localObject1).kjR);
    ((com.tencent.mm.plugin.emoji.e.l)localObject1).kjz.c(((com.tencent.mm.plugin.emoji.e.l)localObject1).kjP);
    ((com.tencent.mm.plugin.emoji.e.l)localObject1).kjA.c(((com.tencent.mm.plugin.emoji.e.l)localObject1).kjQ);
    com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.emoji.e.l)localObject1).kjS);
    arg();
    localObject1 = arm();
    Object localObject2 = com.tencent.mm.k.g.ut().getValue("EmotionRewardTipsLimit");
    long l;
    if (!bg.nm((String)localObject2))
    {
      w.i("MicroMsg.emoji.EmojiRewardTipMgr", "updateConfig dynamic config %s", new Object[] { localObject2 });
      localObject2 = ((String)localObject2).split(",");
      if ((localObject2 != null) && (localObject2.length == 3))
      {
        if (bg.getInt(localObject2[0], 0) != 0) {
          break label736;
        }
        l = 863913600000L;
        ((com.tencent.mm.plugin.emoji.e.j)localObject1).kjd = l;
        ((com.tencent.mm.plugin.emoji.e.j)localObject1).kje = (bg.getInt(localObject2[1], 20) - 1);
        ((com.tencent.mm.plugin.emoji.e.j)localObject1).jtJ = (bg.getInt(localObject2[2], 80) - 1);
      }
    }
    boolean bool2 = com.tencent.mm.plugin.emoji.e.n.aqR();
    at.AR();
    boolean bool3 = ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vqn, Boolean.valueOf(true))).booleanValue();
    if ((bool2) && (bool3)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      ((com.tencent.mm.plugin.emoji.e.j)localObject1).kjc = bool1;
      w.i("MicroMsg.emoji.EmojiRewardTipMgr", "init RewardTipMgr RewardTipEnable:%b isEnableRewardTip:%b isTipsEnable:%b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.emoji.e.j)localObject1).kjc), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      at.xB().A(new j.1((com.tencent.mm.plugin.emoji.e.j)localObject1));
      localObject1 = ari().kmc;
      w.d("MicroMsg.BKGLoader.BKGLoaderManager", "bkg attach");
      com.tencent.mm.sdk.b.a.vgX.b(((BKGLoaderManager)localObject1).kmI);
      com.tencent.mm.sdk.b.a.vgX.b(((BKGLoaderManager)localObject1).kmJ);
      localObject2 = new IntentFilter();
      ((IntentFilter)localObject2).addAction("android.net.conn.CONNECTIVITY_CHANGE");
      ((BKGLoaderManager)localObject1).kmD = new BKGLoaderManager.ConnectivityReceiver((BKGLoaderManager)localObject1);
      ab.getContext().registerReceiver(((BKGLoaderManager)localObject1).kmD, (IntentFilter)localObject2);
      w.i("MicroMsg.emoji.SubCoreEmoji", "[oneliang]initCore");
      arl().aqP();
      this.kkL = new i();
      this.kkM = new f();
      com.tencent.mm.aj.a.bt(paramBoolean);
      localObject1 = aro();
      at.wS().a(697, (com.tencent.mm.ad.e)localObject1);
      com.tencent.mm.bt.f.bRB().bRD();
      com.tencent.mm.bt.e.bRA().adn();
      GMTrace.o(11316165083136L, 84312);
      return;
      label736:
      l = bg.getInt(localObject2[0], 0) * 86400000L;
      break;
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(11316299300864L, 84313);
    GMTrace.o(11316299300864L, 84313);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(11316030865408L, 84311);
    GMTrace.o(11316030865408L, 84311);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(11315762429952L, 84309);
    Object localObject = arj();
    at.getSysCmdMsgExtension().b("emotionstore", ((com.tencent.mm.plugin.emoji.e.h)localObject).kiv, true);
    at.getSysCmdMsgExtension().b("NewRecommendEmotion", ((com.tencent.mm.plugin.emoji.e.h)localObject).kiw, true);
    at.getSysCmdMsgExtension().b("EmojiBackup", ((com.tencent.mm.plugin.emoji.e.h)localObject).kix, true);
    at.getSysCmdMsgExtension().b("EmotionBackup", ((com.tencent.mm.plugin.emoji.e.h)localObject).kix, true);
    localObject = ark();
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).khT);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).khX);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).khY);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).khZ);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).kia);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).kib);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).kic);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).kid);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).kie);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).khU);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).khV);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).kif);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).kig);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.b)localObject).khW);
    localObject = arl();
    ((com.tencent.mm.plugin.emoji.e.l)localObject).kjy.j(((com.tencent.mm.plugin.emoji.e.l)localObject).kjR);
    ((com.tencent.mm.plugin.emoji.e.l)localObject).kjz.j(((com.tencent.mm.plugin.emoji.e.l)localObject).kjP);
    ((com.tencent.mm.plugin.emoji.e.l)localObject).kjA.j(((com.tencent.mm.plugin.emoji.e.l)localObject).kjQ);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.emoji.e.l)localObject).kjS);
    if (com.tencent.mm.plugin.emoji.e.l.kjN != null)
    {
      com.tencent.mm.plugin.emoji.e.l.kjN.clear();
      com.tencent.mm.plugin.emoji.e.l.kjN = null;
    }
    if (com.tencent.mm.plugin.emoji.e.l.kjO != null)
    {
      com.tencent.mm.plugin.emoji.e.l.kjO.clear();
      com.tencent.mm.plugin.emoji.e.l.kjO = null;
    }
    arg().clear();
    ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).removeEmojiMgr();
    localObject = arf();
    at.wS().b(175, (com.tencent.mm.ad.e)localObject);
    ((c)localObject).kkg.clear();
    ((c)localObject).kke.clear();
    ((c)localObject).kkj.clear();
    localObject = arm();
    ((com.tencent.mm.plugin.emoji.e.j)localObject).kjf = null;
    if (((com.tencent.mm.plugin.emoji.e.j)localObject).kjg != null) {
      ((com.tencent.mm.plugin.emoji.e.j)localObject).kjg.clear();
    }
    localObject = ari().kmc;
    w.d("MicroMsg.BKGLoader.BKGLoaderManager", "bkg detach");
    if (((BKGLoaderManager)localObject).kmz != null) {
      ((BKGLoaderManager)localObject).kmz.clear();
    }
    if (((BKGLoaderManager)localObject).kmA != null) {
      ((BKGLoaderManager)localObject).kmA.clear();
    }
    if (((BKGLoaderManager)localObject).kmB != null) {
      ((BKGLoaderManager)localObject).kmB.clear();
    }
    ((BKGLoaderManager)localObject).kmp = false;
    com.tencent.mm.sdk.b.a.vgX.c(((BKGLoaderManager)localObject).kmI);
    com.tencent.mm.sdk.b.a.vgX.c(((BKGLoaderManager)localObject).kmJ);
    if (((BKGLoaderManager)localObject).kmD != null)
    {
      ab.getContext().unregisterReceiver(((BKGLoaderManager)localObject).kmD);
      ((BKGLoaderManager)localObject).kmD = null;
    }
    if (this.kkL != null)
    {
      localObject = this.kkL;
      com.tencent.mm.sdk.b.a.vgX.c(((i)localObject).kkZ);
      com.tencent.mm.sdk.b.a.vgX.c(((i)localObject).kla);
    }
    if (this.kkM != null)
    {
      localObject = this.kkM;
      ((f)localObject).kkt.clear();
      arf().kki = null;
      ((f)localObject).kku.dead();
    }
    if (this.kkT != null) {
      this.kkT.detach();
    }
    localObject = aro();
    at.wS().b(697, (com.tencent.mm.ad.e)localObject);
    GMTrace.o(11315762429952L, 84309);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(11315896647680L, 84310);
    HashMap localHashMap = fIv;
    GMTrace.o(11315896647680L, 84310);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */