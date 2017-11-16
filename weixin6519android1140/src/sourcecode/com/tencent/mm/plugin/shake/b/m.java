package com.tencent.mm.plugin.shake.b;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bc.l;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.g.a.my;
import com.tencent.mm.g.a.ov;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.shake.d.a.o;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ar.a;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Map;

public final class m
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private as.a gnp;
  private com.tencent.mm.sdk.b.c jMK;
  public com.tencent.mm.sdk.platformtools.ae mHandler;
  private com.tencent.mm.sdk.b.c nqi;
  private ar.a ntA;
  private e oMC;
  private g oMD;
  private com.tencent.mm.plugin.shake.c.a.f oME;
  private com.tencent.mm.plugin.shake.c.a.d oMF;
  private o oMG;
  private n oMH;
  com.tencent.mm.pluginsdk.e.d oMI;
  private bt.a oMJ;
  private com.tencent.mm.sdk.b.c oMK;
  private bt.a oML;
  private bt.a oMM;
  
  static
  {
    GMTrace.i(6513720557568L, 48531);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("SHAKEITEM_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6508620283904L, 48493);
        String[] arrayOfString = e.fTX;
        GMTrace.o(6508620283904L, 48493);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("SHAKEMSG_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6507143888896L, 48482);
        String[] arrayOfString = g.fTX;
        GMTrace.o(6507143888896L, 48482);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("SHAKETVHISTORY_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6503654227968L, 48456);
        String[] arrayOfString = o.fTX;
        GMTrace.o(6503654227968L, 48456);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("SHAKENEWYEARFRIENDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(6513988993024L, 48533);
        String[] arrayOfString = k.fTX;
        GMTrace.o(6513988993024L, 48533);
        return arrayOfString;
      }
    });
    GMTrace.o(6513720557568L, 48531);
  }
  
  public m()
  {
    GMTrace.i(6511304638464L, 48513);
    this.mHandler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.oMH = new n();
    this.oMI = new com.tencent.mm.pluginsdk.e.d()
    {
      public final j aGn()
      {
        GMTrace.i(6515733823488L, 48546);
        g localg = m.bfl();
        GMTrace.o(6515733823488L, 48546);
        return localg;
      }
      
      public final b zO(String paramAnonymousString)
      {
        GMTrace.i(6515599605760L, 48545);
        ov localov = new ov();
        localov.eTM.eBq = paramAnonymousString;
        GMTrace.o(6515599605760L, 48545);
        return localov;
      }
    };
    this.jMK = new com.tencent.mm.sdk.b.c() {};
    this.oMJ = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(6507412324352L, 48484);
        m.bfj();
        if (m.bfo() != 0)
        {
          m.bfj();
          m.bfo();
          Object localObject = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
          w.v("MicroMsg.ShakeMsgMgr", "func[onResvMsg] content:" + (String)localObject);
          if (bg.nm((String)localObject))
          {
            w.d("MicroMsg.ShakeMsgMgr", "func[onResvMsg] Msg content empty");
            GMTrace.o(6507412324352L, 48484);
            return;
          }
          localObject = bh.q((String)localObject, "sysmsg");
          int i = bg.getInt((String)((Map)localObject).get(".sysmsg.shake.$type"), 0);
          switch (i)
          {
          default: 
            w.d("MicroMsg.ShakeMsgMgr", "Unrecognized type :" + i);
            GMTrace.o(6507412324352L, 48484);
            return;
          }
          f localf = new f();
          i = bg.getInt((String)((Map)localObject).get(".sysmsg.shake.shaketv.msgtype"), 0);
          if (i == 0)
          {
            localf.field_type = 1;
            localf.field_subtype = i;
            localf.field_svrid = paramAnonymousa.gtM.tQd;
            localf.field_createtime = bg.Pu();
            localf.field_tag = ((String)((Map)localObject).get(".sysmsg.shake.shaketv.jumpurl"));
            localf.field_status = 0;
            localf.field_title = ((String)((Map)localObject).get(".sysmsg.shake.shaketv.title"));
            localf.field_thumburl = ((String)((Map)localObject).get(".sysmsg.shake.shaketv.iconurl"));
            localf.field_desc = ((String)((Map)localObject).get(".sysmsg.shake.shaketv.desc"));
            localf.field_reserved1 = bg.nl((String)((Map)localObject).get(".sysmsg.shake.shaketv.pid"));
            m.bfl().a(localf);
            GMTrace.o(6507412324352L, 48484);
            return;
          }
          w.w("MicroMsg.ShakeMsgMgr", "Unknown subType:" + i);
          GMTrace.o(6507412324352L, 48484);
          return;
        }
        w.w("MicroMsg.SubCoreShake", "func[onRecieveMsg] getShakeMsgMgr null");
        GMTrace.o(6507412324352L, 48484);
      }
    };
    this.ntA = new ar.a()
    {
      public final void a(ar paramAnonymousar, x paramAnonymousx)
      {
        GMTrace.i(6514794299392L, 48539);
        if ((paramAnonymousar != null) && (paramAnonymousx != null) && (paramAnonymousx.uZ())) {
          m.bfk().Gn(paramAnonymousx.field_username);
        }
        GMTrace.o(6514794299392L, 48539);
      }
    };
    this.gnp = new as.a()
    {
      public final void a(com.tencent.mm.storage.ae paramAnonymousae, as paramAnonymousas)
      {
        GMTrace.i(6504191098880L, 48460);
        if ((paramAnonymousae != null) && (s.gg(paramAnonymousae.field_username))) {
          paramAnonymousae.setUsername("");
        }
        GMTrace.o(6504191098880L, 48460);
      }
    };
    this.oMK = new com.tencent.mm.sdk.b.c() {};
    this.oML = new bt.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(6516270694400L, 48550);
        final String str = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        if ((str == null) || (str.length() == 0))
        {
          w.e("MicroMsg.SubCoreShake", "onReceiveMsg, ShakeCardEntranceMsg msgContent is null");
          GMTrace.o(6516270694400L, 48550);
          return;
        }
        m.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6502043615232L, 48444);
            m.bfp().e(str, paramAnonymousa.gtM.tQd, 0);
            GMTrace.o(6502043615232L, 48444);
          }
        });
        GMTrace.o(6516270694400L, 48550);
      }
    };
    this.oMM = new bt.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(6505935929344L, 48473);
        final String str = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        if ((str == null) || (str.length() == 0))
        {
          w.e("MicroMsg.SubCoreShake", "onReceiveMsg, ShakeCardRedDotMsg msgContent is null");
          GMTrace.o(6505935929344L, 48473);
          return;
        }
        m.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6508351848448L, 48491);
            m.bfp().e(str, paramAnonymousa.gtM.tQd, 1);
            GMTrace.o(6508351848448L, 48491);
          }
        });
        GMTrace.o(6505935929344L, 48473);
      }
    };
    this.nqi = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6511304638464L, 48513);
  }
  
  public static m bfj()
  {
    GMTrace.i(6511438856192L, 48514);
    m localm2 = (m)at.AK().gZ("plugin.shake");
    m localm1 = localm2;
    if (localm2 == null)
    {
      localm1 = new m();
      at.AK().a("plugin.shake", localm1);
    }
    GMTrace.o(6511438856192L, 48514);
    return localm1;
  }
  
  public static e bfk()
  {
    GMTrace.i(6511573073920L, 48515);
    com.tencent.mm.kernel.h.xw().wG();
    if (bfj().oMC == null)
    {
      localObject = bfj();
      at.AR();
      ((m)localObject).oMC = new e(com.tencent.mm.y.c.yH());
    }
    Object localObject = bfj().oMC;
    GMTrace.o(6511573073920L, 48515);
    return (e)localObject;
  }
  
  public static g bfl()
  {
    GMTrace.i(6511707291648L, 48516);
    com.tencent.mm.kernel.h.xw().wG();
    if (bfj().oMD == null)
    {
      localObject = bfj();
      at.AR();
      ((m)localObject).oMD = new g(com.tencent.mm.y.c.yH());
    }
    Object localObject = bfj().oMD;
    GMTrace.o(6511707291648L, 48516);
    return (g)localObject;
  }
  
  public static o bfm()
  {
    GMTrace.i(6511841509376L, 48517);
    com.tencent.mm.kernel.h.xw().wG();
    if (bfj().oMG == null)
    {
      localObject = bfj();
      at.AR();
      ((m)localObject).oMG = new o(com.tencent.mm.y.c.yH());
    }
    Object localObject = bfj().oMG;
    GMTrace.o(6511841509376L, 48517);
    return (o)localObject;
  }
  
  public static void bfn()
  {
    GMTrace.i(6512378380288L, 48521);
    bfk().bfb();
    l.MN().MH();
    GMTrace.o(6512378380288L, 48521);
  }
  
  public static int bfo()
  {
    GMTrace.i(6512781033472L, 48524);
    com.tencent.mm.kernel.h.xw().wG();
    int i = i.oMr;
    GMTrace.o(6512781033472L, 48524);
    return i;
  }
  
  public static com.tencent.mm.plugin.shake.c.a.f bfp()
  {
    GMTrace.i(6513183686656L, 48527);
    com.tencent.mm.kernel.h.xw().wG();
    if (bfj().oME == null) {
      bfj().oME = new com.tencent.mm.plugin.shake.c.a.f();
    }
    com.tencent.mm.plugin.shake.c.a.f localf = bfj().oME;
    GMTrace.o(6513183686656L, 48527);
    return localf;
  }
  
  public static com.tencent.mm.plugin.shake.c.a.d bfq()
  {
    GMTrace.i(6513317904384L, 48528);
    com.tencent.mm.kernel.h.xw().wG();
    if (bfj().oMF == null) {
      bfj().oMF = new com.tencent.mm.plugin.shake.c.a.d();
    }
    com.tencent.mm.plugin.shake.c.a.d locald = bfj().oMF;
    GMTrace.o(6513317904384L, 48528);
    return locald;
  }
  
  public static String dv(String paramString1, String paramString2)
  {
    GMTrace.i(6513049468928L, 48526);
    if ((at.AU()) && (!bg.nm(paramString1)))
    {
      at.AR();
      paramString1 = String.format("%s/Sk%s_%s", new Object[] { com.tencent.mm.y.c.zd(), paramString2, com.tencent.mm.a.g.n(paramString1.getBytes()) });
      GMTrace.o(6513049468928L, 48526);
      return paramString1;
    }
    GMTrace.o(6513049468928L, 48526);
    return "";
  }
  
  public static String km(String paramString)
  {
    GMTrace.i(6512915251200L, 48525);
    if (at.AU())
    {
      at.AR();
      paramString = String.format("%s/Sk_%s", new Object[] { com.tencent.mm.y.c.zd(), com.tencent.mm.a.g.n(paramString.getBytes()) });
      GMTrace.o(6512915251200L, 48525);
      return paramString;
    }
    GMTrace.o(6512915251200L, 48525);
    return "";
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6512512598016L, 48522);
    com.tencent.mm.pluginsdk.p.a.tlY = new h();
    at.AR();
    com.tencent.mm.y.c.yP().b(this.gnp);
    com.tencent.mm.sdk.b.a.vgX.b(this.jMK);
    com.tencent.mm.sdk.b.a.vgX.b(this.oMK);
    com.tencent.mm.sdk.b.a.vgX.b(this.oMH);
    com.tencent.mm.sdk.b.a.vgX.b(this.nqi);
    at.AR();
    com.tencent.mm.y.c.yK().a(this.ntA);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6502312050688L, 48446);
        if (!at.AU())
        {
          GMTrace.o(6502312050688L, 48446);
          return;
        }
        at.AR();
        bg.d(com.tencent.mm.y.c.zd(), "Sk", 604800000L);
        GMTrace.o(6502312050688L, 48446);
      }
      
      public final String toString()
      {
        GMTrace.i(6502446268416L, 48447);
        String str = super.toString() + "|onAccountPostReset";
        GMTrace.o(6502446268416L, 48447);
        return str;
      }
    });
    at.getSysCmdMsgExtension().a("shake", this.oMJ, true);
    at.getSysCmdMsgExtension().a("ShakeCardEntrance", this.oML, true);
    at.getSysCmdMsgExtension().a("ShakeCardRedDot", this.oMM, true);
    this.oME = null;
    this.oMF = null;
    GMTrace.o(6512512598016L, 48522);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(6512646815744L, 48523);
    GMTrace.o(6512646815744L, 48523);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6512244162560L, 48520);
    if ((paramInt & 0x100) != 0) {
      bfn();
    }
    GMTrace.o(6512244162560L, 48520);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6511975727104L, 48518);
    at.AR();
    com.tencent.mm.y.c.yP().c(this.gnp);
    com.tencent.mm.sdk.b.a.vgX.c(this.jMK);
    com.tencent.mm.sdk.b.a.vgX.c(this.oMK);
    com.tencent.mm.sdk.b.a.vgX.c(this.oMH);
    com.tencent.mm.sdk.b.a.vgX.c(this.nqi);
    at.AR();
    com.tencent.mm.y.c.yK().b(this.ntA);
    at.getSysCmdMsgExtension().b("shake", this.oMJ, true);
    at.getSysCmdMsgExtension().b("ShakeCardEntrance", this.oML, true);
    at.getSysCmdMsgExtension().b("ShakeCardRedDot", this.oMM, true);
    com.tencent.mm.pluginsdk.p.a.tlY = null;
    GMTrace.o(6511975727104L, 48518);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(6512109944832L, 48519);
    HashMap localHashMap = fIv;
    GMTrace.o(6512109944832L, 48519);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\shake\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */