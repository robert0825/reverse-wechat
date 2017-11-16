package com.tencent.mm.plugin.ipcall.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ay;
import com.tencent.mm.g.a.ba;
import com.tencent.mm.g.a.ic;
import com.tencent.mm.g.a.id;
import com.tencent.mm.g.a.ql;
import com.tencent.mm.g.a.rn;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.b.a;
import com.tencent.mm.plugin.ipcall.a.g.j;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import java.util.HashMap;
import java.util.Map;

public final class i
  implements aq
{
  private static i mje;
  private static HashMap<Integer, g.d> mjx;
  private bt.a mjA;
  private g mjf;
  private com.tencent.mm.plugin.ipcall.a.c.a mjg;
  private com.tencent.mm.plugin.ipcall.a.c.b mjh;
  private com.tencent.mm.plugin.ipcall.a.b.b mji;
  private f mjj;
  private com.tencent.mm.plugin.ipcall.c mjk;
  private com.tencent.mm.plugin.ipcall.a.g.d mjl;
  private l mjm;
  private j mjn;
  private com.tencent.mm.plugin.ipcall.a.g.h mjo;
  private com.tencent.mm.plugin.voip.video.h mjp;
  private com.tencent.mm.plugin.voip.video.d mjq;
  public Context mjr;
  public long mjs;
  private com.tencent.mm.sdk.b.c mjt;
  private com.tencent.mm.sdk.b.c mju;
  private com.tencent.mm.sdk.b.c mjv;
  private com.tencent.mm.sdk.b.c mjw;
  private bt.a mjy;
  private bt.a mjz;
  
  static
  {
    GMTrace.i(11613994221568L, 86531);
    mje = null;
    HashMap localHashMap = new HashMap();
    mjx = localHashMap;
    localHashMap.put(Integer.valueOf("IPCallAddressItem".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(15065805750272L, 112249);
        String[] arrayOfString = com.tencent.mm.plugin.ipcall.a.g.d.fTX;
        GMTrace.o(15065805750272L, 112249);
        return arrayOfString;
      }
    });
    mjx.put(Integer.valueOf("IPCallRecord".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(15065537314816L, 112247);
        String[] arrayOfString = l.fTX;
        GMTrace.o(15065537314816L, 112247);
        return arrayOfString;
      }
    });
    mjx.put(Integer.valueOf("IPCallPopularCountry".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11566078492672L, 86174);
        String[] arrayOfString = j.fTX;
        GMTrace.o(11566078492672L, 86174);
        return arrayOfString;
      }
    });
    mjx.put(Integer.valueOf("IPCallMsg".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(11600035577856L, 86427);
        String[] arrayOfString = com.tencent.mm.plugin.ipcall.a.g.h.fTX;
        GMTrace.o(11600035577856L, 86427);
        return arrayOfString;
      }
    });
    GMTrace.o(11613994221568L, 86531);
  }
  
  public i()
  {
    GMTrace.i(11610907213824L, 86508);
    this.mjf = new g();
    this.mjg = new com.tencent.mm.plugin.ipcall.a.c.a();
    this.mjh = new com.tencent.mm.plugin.ipcall.a.c.b();
    this.mji = new com.tencent.mm.plugin.ipcall.a.b.b();
    this.mjj = new f();
    this.mjk = new com.tencent.mm.plugin.ipcall.c();
    this.mjt = new com.tencent.mm.sdk.b.c() {};
    this.mju = new com.tencent.mm.sdk.b.c() {};
    this.mjv = new com.tencent.mm.sdk.b.c() {};
    this.mjw = new com.tencent.mm.sdk.b.c() {};
    this.mjy = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(15067953233920L, 112265);
        w.i("MicroMsg.SubCoreIPCall", "WeChatOut onRecieveMsg");
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
        {
          w.e("MicroMsg.SubCoreIPCall", "WeChatOut onReceiveMsg, msgContent is null");
          GMTrace.o(15067953233920L, 112265);
          return;
        }
        Object localObject = bh.q(paramAnonymousa, "sysmsg");
        if (localObject == null)
        {
          w.e("MicroMsg.SubCoreIPCall", "WeChatOut onReceiveMsg, values is null");
          GMTrace.o(15067953233920L, 112265);
          return;
        }
        int i;
        if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountRedDotType"))
        {
          i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.AccountRedDotType"), -1);
          w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountRedDotType: %d", new Object[] { Integer.valueOf(i) });
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vrZ, Integer.valueOf(i));
        }
        for (;;)
        {
          int j;
          if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AcctRD"))
          {
            j = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.AcctRD"), 0);
            w.i("MicroMsg.SubCoreIPCall", "WeChatOut AcctRD: %d", new Object[] { Integer.valueOf(j) });
            if (j != 0)
            {
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vrY, Boolean.valueOf(true));
              com.tencent.mm.plugin.report.service.g.ork.i(13254, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(-1), Integer.valueOf(-1) });
            }
          }
          else
          {
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.TabRD"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.TabRD"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut TabRD: %d", new Object[] { Integer.valueOf(i) });
              if (i == 0) {
                break label1298;
              }
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsl, Boolean.valueOf(true));
              com.tencent.mm.plugin.report.service.g.ork.i(13254, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
            }
            label394:
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.RechargeRD"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.RechargeRD"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut RechargeRD: %d", new Object[] { Integer.valueOf(i) });
              if (i == 0) {
                break label1318;
              }
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsf, Boolean.valueOf(true));
              com.tencent.mm.plugin.report.service.g.ork.i(13254, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
            }
            label518:
            String str;
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.RechargeWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.RechargeWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut RechargeWording: %s", new Object[] { str });
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vse, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.PackagePurchaseWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.PackagePurchaseWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut PackagePurchaseWording: %s", new Object[] { str });
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsg, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.AccountWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountWording: %s", new Object[] { str });
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsa, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.RechargeWordingVersion"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.RechargeWordingVersion"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut RechargeWordingVersion: %d", new Object[] { Integer.valueOf(i) });
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsp, Integer.valueOf(i));
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.TabWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.TabWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut TabWording: %s", new Object[] { str });
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsk, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountActivityWording"))
            {
              str = (String)((Map)localObject).get(".sysmsg.WeChatOut.AccountActivityWording");
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountActivityWording: %s", new Object[] { str });
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsb, str);
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountActivityWordingClearType"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.AccountActivityWordingClearType"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountActivityWordingClearType : %d", new Object[] { Integer.valueOf(i) });
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsc, Integer.valueOf(i));
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.AccountActivityWordingVersion"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.AccountActivityWordingVersion"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountActivityWordingVersion: %d", new Object[] { Integer.valueOf(i) });
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsd, Integer.valueOf(i));
            }
            if (((Map)localObject).containsKey(".sysmsg.WeChatOut.TabRedDotType"))
            {
              i = bg.getInt((String)((Map)localObject).get(".sysmsg.WeChatOut.TabRedDotType"), 0);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut TabRedDotType: %d", new Object[] { Integer.valueOf(i) });
              com.tencent.mm.plugin.report.service.g.ork.i(13254, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(i) });
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsm, Integer.valueOf(i));
            }
            i = paramAnonymousa.indexOf("<ActivityInfo>");
            j = paramAnonymousa.indexOf("</ActivityInfo>");
            if ((i > 0) && (j > 0) && (j > i))
            {
              paramAnonymousa = paramAnonymousa.substring(i, j + 15);
              w.i("MicroMsg.SubCoreIPCall", "WeChatOut ActivityInfo: %s", new Object[] { paramAnonymousa });
              localObject = com.tencent.mm.plugin.ipcall.a.g.a.Ai(paramAnonymousa);
              if ((localObject == null) || (!bg.nm(((com.tencent.mm.plugin.ipcall.a.g.a)localObject).eBt)) || (!bg.nm(((com.tencent.mm.plugin.ipcall.a.g.a)localObject).lPj))) {
                break label1338;
              }
              w.i("MicroMsg.SubCoreIPCall", "clear activity");
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsy, Boolean.valueOf(false));
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsz, "");
            }
          }
          for (;;)
          {
            com.tencent.mm.sdk.b.a.vgX.m(new id());
            com.tencent.mm.sdk.b.a.vgX.m(new rn());
            GMTrace.o(15067953233920L, 112265);
            return;
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vrY, Boolean.valueOf(false));
            break;
            label1298:
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vsl, Boolean.valueOf(false));
            break label394;
            label1318:
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vsf, Boolean.valueOf(false));
            break label518;
            label1338:
            if (localObject != null)
            {
              if (!bg.nm(((com.tencent.mm.plugin.ipcall.a.g.a)localObject).mmM)) {
                com.tencent.mm.ao.n.IY().a(((com.tencent.mm.plugin.ipcall.a.g.a)localObject).mmM, null);
              }
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsy, Boolean.valueOf(true));
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vsz, paramAnonymousa);
            }
          }
          i = -1;
        }
      }
    };
    this.mjz = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(15065268879360L, 112245);
        w.i("MicroMsg.SubCoreIPCall", "WeChatOutMsg onRecieveMsg");
        Object localObject = paramAnonymousa.gtM;
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
        {
          w.e("MicroMsg.SubCoreIPCall", "WeChatOutMsg onReceiveMsg, msgContent is null");
          GMTrace.o(15065268879360L, 112245);
          return;
        }
        paramAnonymousa = bh.q(paramAnonymousa, "sysmsg");
        if (paramAnonymousa == null)
        {
          w.e("MicroMsg.SubCoreIPCall", "WeChatOutMsg onReceiveMsg, values is null");
          GMTrace.o(15065268879360L, 112245);
          return;
        }
        com.tencent.mm.plugin.ipcall.a.g.h localh = i.aIx();
        long l = ((bu)localObject).tPV;
        int i;
        if (paramAnonymousa != null)
        {
          localObject = new com.tencent.mm.plugin.ipcall.a.g.g();
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_svrId = l;
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.Title"));
          if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title == null) {
            ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title = "";
          }
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.Content"));
          if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content == null) {
            ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content = "";
          }
          i = bg.getInt((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.MsgType"), 0);
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_msgType = i;
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_pushTime = bg.getLong((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.PushTime"), 0L);
          ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl = ((String)paramAnonymousa.get(".sysmsg.WeChatOutMsg.DescUrl"));
          if (((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl == null) {
            ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl = "";
          }
          w.i("MicroMsg.IPCallMsgStorage", "insertNewXml svrId:%s,title:%s,content:%s,msgType:%s,pushTime:%s,descUrl=%s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_svrId, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_title, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_content, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_msgType, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_pushTime, ((com.tencent.mm.plugin.ipcall.a.g.g)localObject).field_descUrl });
          localh.b((com.tencent.mm.sdk.e.c)localObject);
        }
        for (;;)
        {
          if (i != -1)
          {
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vso, Integer.valueOf(i));
          }
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsn, Boolean.valueOf(true));
          com.tencent.mm.plugin.report.service.g.ork.i(13254, new Object[] { Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(i), Integer.valueOf(-1) });
          GMTrace.o(15065268879360L, 112245);
          return;
          i = -1;
        }
      }
    };
    this.mjA = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(15066074185728L, 112251);
        w.i("MicroMsg.SubCoreIPCall", "WCONotify onRecieveMsg");
        paramAnonymousa = com.tencent.mm.platformtools.n.a(paramAnonymousa.gtM.tPY);
        if ((paramAnonymousa == null) || (paramAnonymousa.length() == 0))
        {
          w.e("MicroMsg.SubCoreIPCall", "WCONotify onReceiveMsg, msgContent is null");
          GMTrace.o(15066074185728L, 112251);
          return;
        }
        paramAnonymousa = bh.q(paramAnonymousa, "sysmsg");
        if (paramAnonymousa == null)
        {
          w.e("MicroMsg.SubCoreIPCall", "WCONotify onReceiveMsg, values is null");
          GMTrace.o(15066074185728L, 112251);
          return;
        }
        if (paramAnonymousa.containsKey(".sysmsg.WCONotify.NotifyGetBalance"))
        {
          int i = bg.getInt((String)paramAnonymousa.get(".sysmsg.WCONotify.NotifyGetBalance"), 0);
          w.i("MicroMsg.SubCoreIPCall", "WCONotify NotifyGetBalance: %d", new Object[] { Integer.valueOf(i) });
          if (i > 0)
          {
            paramAnonymousa = new com.tencent.mm.plugin.ipcall.a.d.g(2);
            at.wS().a(paramAnonymousa, 0);
          }
        }
        GMTrace.o(15066074185728L, 112251);
      }
    };
    GMTrace.o(11610907213824L, 86508);
  }
  
  public static i aIn()
  {
    GMTrace.i(11611041431552L, 86509);
    if (mje == null)
    {
      mje = new i();
      at.AK().a("plugin.ipcall", mje);
    }
    i locali = mje;
    GMTrace.o(11611041431552L, 86509);
    return locali;
  }
  
  public static g aIo()
  {
    GMTrace.i(11611175649280L, 86510);
    g localg = aIn().mjf;
    GMTrace.o(11611175649280L, 86510);
    return localg;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.c.a aIp()
  {
    GMTrace.i(11611309867008L, 86511);
    com.tencent.mm.plugin.ipcall.a.c.a locala = aIn().mjg;
    GMTrace.o(11611309867008L, 86511);
    return locala;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.c.b aIq()
  {
    GMTrace.i(11611444084736L, 86512);
    com.tencent.mm.plugin.ipcall.a.c.b localb = aIn().mjh;
    GMTrace.o(11611444084736L, 86512);
    return localb;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.b.b aIr()
  {
    GMTrace.i(11611578302464L, 86513);
    com.tencent.mm.plugin.ipcall.a.b.b localb = aIn().mji;
    GMTrace.o(11611578302464L, 86513);
    return localb;
  }
  
  public static f aIs()
  {
    GMTrace.i(11611712520192L, 86514);
    f localf = aIn().mjj;
    GMTrace.o(11611712520192L, 86514);
    return localf;
  }
  
  public static com.tencent.mm.plugin.ipcall.c aIt()
  {
    GMTrace.i(11611846737920L, 86515);
    com.tencent.mm.plugin.ipcall.c localc = aIn().mjk;
    GMTrace.o(11611846737920L, 86515);
    return localc;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.g.d aIu()
  {
    GMTrace.i(11611980955648L, 86516);
    com.tencent.mm.kernel.h.xw().wG();
    if (aIn().mjl == null)
    {
      localObject = aIn();
      at.AR();
      ((i)localObject).mjl = new com.tencent.mm.plugin.ipcall.a.g.d(com.tencent.mm.y.c.yH());
    }
    Object localObject = aIn().mjl;
    GMTrace.o(11611980955648L, 86516);
    return (com.tencent.mm.plugin.ipcall.a.g.d)localObject;
  }
  
  public static l aIv()
  {
    GMTrace.i(11612115173376L, 86517);
    com.tencent.mm.kernel.h.xw().wG();
    if (aIn().mjm == null)
    {
      localObject = aIn();
      at.AR();
      ((i)localObject).mjm = new l(com.tencent.mm.y.c.yH());
    }
    Object localObject = aIn().mjm;
    GMTrace.o(11612115173376L, 86517);
    return (l)localObject;
  }
  
  public static j aIw()
  {
    GMTrace.i(11612249391104L, 86518);
    com.tencent.mm.kernel.h.xw().wG();
    if (aIn().mjn == null)
    {
      localObject = aIn();
      at.AR();
      ((i)localObject).mjn = new j(com.tencent.mm.y.c.yH());
    }
    Object localObject = aIn().mjn;
    GMTrace.o(11612249391104L, 86518);
    return (j)localObject;
  }
  
  public static com.tencent.mm.plugin.ipcall.a.g.h aIx()
  {
    GMTrace.i(11612383608832L, 86519);
    com.tencent.mm.kernel.h.xw().wG();
    if (aIn().mjo == null)
    {
      localObject = aIn();
      at.AR();
      ((i)localObject).mjo = new com.tencent.mm.plugin.ipcall.a.g.h(com.tencent.mm.y.c.yH());
    }
    Object localObject = aIn().mjo;
    GMTrace.o(11612383608832L, 86519);
    return (com.tencent.mm.plugin.ipcall.a.g.h)localObject;
  }
  
  public static com.tencent.mm.plugin.voip.video.h aIy()
  {
    GMTrace.i(11612517826560L, 86520);
    if (aIn().mjp == null) {
      aIn().mjp = new com.tencent.mm.plugin.voip.video.h(ab.getContext());
    }
    com.tencent.mm.plugin.voip.video.h localh = aIn().mjp;
    GMTrace.o(11612517826560L, 86520);
    return localh;
  }
  
  public static com.tencent.mm.plugin.voip.video.d aIz()
  {
    GMTrace.i(11612652044288L, 86521);
    if (aIn().mjq == null) {
      aIn().mjq = new com.tencent.mm.plugin.voip.video.d(ab.getContext());
    }
    com.tencent.mm.plugin.voip.video.d locald = aIn().mjq;
    GMTrace.o(11612652044288L, 86521);
    return locald;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(11613054697472L, 86524);
    Object localObject = this.mjf;
    ((g)localObject).miQ.init();
    ((g)localObject).miR.init();
    ((g)localObject).miS.init();
    ((g)localObject).miT.init();
    ((g)localObject).miU.init();
    ((g)localObject).miV.init();
    ((g)localObject).miW.init();
    ((g)localObject).miX.init();
    ((g)localObject).miQ.mjC = ((a.a)localObject);
    ((g)localObject).miS.mjC = ((a.a)localObject);
    ((g)localObject).miT.mjC = ((a.a)localObject);
    ((g)localObject).miV.mjC = ((a.a)localObject);
    ((g)localObject).miX.mjC = ((a.a)localObject);
    ((g)localObject).miR.mjD = ((b.a)localObject);
    ((g)localObject).miU.mjD = ((b.a)localObject);
    at.a(((g)localObject).mjb);
    b.init();
    localObject = d.aIe();
    com.tencent.mm.sdk.b.a.vgX.b(((d)localObject).miD);
    localObject = e.aIh();
    com.tencent.mm.sdk.b.a.vgX.b(((e)localObject).htd);
    at.getSysCmdMsgExtension().a("WeChatOut", this.mjy, true);
    at.getSysCmdMsgExtension().a("WeChatOutMsg", this.mjz, true);
    at.getSysCmdMsgExtension().a("WCONotify", this.mjA, true);
    com.tencent.mm.sdk.b.a.vgX.b(this.mjt);
    com.tencent.mm.sdk.b.a.vgX.b(this.mju);
    com.tencent.mm.sdk.b.a.vgX.b(this.mjv);
    com.tencent.mm.sdk.b.a.vgX.b(this.mjw);
    GMTrace.o(11613054697472L, 86524);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(11613188915200L, 86525);
    GMTrace.o(11613188915200L, 86525);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(11612920479744L, 86523);
    GMTrace.o(11612920479744L, 86523);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(11613323132928L, 86526);
    if (this.mjj.aIi()) {
      this.mjk.co(0, 0);
    }
    Object localObject = this.mjf;
    ((g)localObject).miQ.destroy();
    ((g)localObject).miR.destroy();
    ((g)localObject).miS.destroy();
    ((g)localObject).miT.destroy();
    ((g)localObject).miU.destroy();
    ((g)localObject).miW.destroy();
    at.b(((g)localObject).mjb);
    b.release();
    localObject = d.aIe();
    at.wS().b(159, (com.tencent.mm.ad.e)localObject);
    at.wS().b(160, (com.tencent.mm.ad.e)localObject);
    com.tencent.mm.sdk.b.a.vgX.c(((d)localObject).miD);
    localObject = e.aIh();
    com.tencent.mm.sdk.b.a.vgX.c(((e)localObject).htd);
    at.getSysCmdMsgExtension().b("WeChatOut", this.mjy, true);
    at.getSysCmdMsgExtension().b("WeChatOutMsg", this.mjz, true);
    at.getSysCmdMsgExtension().b("WCONotify", this.mjA, true);
    com.tencent.mm.sdk.b.a.vgX.c(this.mjt);
    com.tencent.mm.sdk.b.a.vgX.c(this.mju);
    com.tencent.mm.sdk.b.a.vgX.c(this.mjv);
    com.tencent.mm.sdk.b.a.vgX.c(this.mjw);
    GMTrace.o(11613323132928L, 86526);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(11612786262016L, 86522);
    HashMap localHashMap = mjx;
    GMTrace.o(11612786262016L, 86522);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */