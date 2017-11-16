package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.protocal.c.amc;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bf;
import com.tencent.mm.protocal.c.bfd;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.protocal.c.tf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.vending.d.b.a;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class aw
  extends com.tencent.mm.vending.a.b<ay, com.tencent.mm.plugin.sns.storage.m>
{
  private boolean DEBUG;
  ar goW;
  volatile String kNA;
  Context mContext;
  String pQl;
  volatile String pWe;
  av qgS;
  private int qgT;
  private com.tencent.mm.l.a qgU;
  private boolean qgV;
  volatile boolean qgW;
  byte[] qgX;
  protected HashMap<String, String> qgY;
  public HashMap<String, Boolean> qgZ;
  private String qha;
  private String qhb;
  
  public aw()
  {
    super(new com.tencent.mm.plugin.sns.storage.m());
    GMTrace.i(8661069987840L, 64530);
    this.DEBUG = false;
    this.qgT = ((int)(System.currentTimeMillis() / 1000L));
    this.qgV = false;
    this.qgW = false;
    this.kNA = "";
    this.pWe = "";
    this.qgX = new byte[0];
    this.qgY = new HashMap();
    this.qgZ = new HashMap();
    this.qha = "";
    this.qhb = "";
    cjU();
    GMTrace.o(8661069987840L, 64530);
  }
  
  private void a(int paramInt, ay paramay)
  {
    GMTrace.i(8661875294208L, 64536);
    Object localObject1 = paramay.oWK.uQT;
    com.tencent.mm.kiss.widget.textview.a.a locala = com.tencent.mm.plugin.sns.ui.widget.a.bqp().bqq();
    paramay.qho = new com.tencent.mm.plugin.sns.data.d();
    if (this.DEBUG) {
      w.d("MicroMsg.SnsTimeLineVendingSide", "debug:renderSnsComment position " + paramInt + " commentInfoList: " + ((List)localObject1).size() + " commentData:" + paramay.qho.ppg.size());
    }
    Iterator localIterator = ((List)localObject1).iterator();
    bew localbew;
    com.tencent.mm.kiss.widget.textview.c localc;
    Context localContext;
    Object localObject3;
    Object localObject2;
    String str;
    if (localIterator.hasNext())
    {
      localbew = (bew)localIterator.next();
      localc = com.tencent.mm.kiss.widget.textview.c.gaW;
      localContext = this.mContext;
      localObject3 = paramay.oWL.field_userName;
      localObject2 = com.tencent.mm.plugin.sns.ui.widget.b.a(localbew);
      str = localbew.nIp;
      localObject1 = null;
      if (!bg.nm((String)localObject3))
      {
        com.tencent.mm.kernel.h.xz();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TC((String)localObject3);
      }
      if (localbew.uQr == 1)
      {
        if (localObject1 == null) {
          break label818;
        }
        if (localObject1 == null)
        {
          localObject1 = localObject3;
          label222:
          localObject2 = (String)localObject2 + localContext.getString(i.j.piE);
          localObject1 = (String)localObject2 + (String)localObject1;
        }
      }
    }
    for (;;)
    {
      localObject1 = "" + (String)localObject1 + ": ";
      localObject1 = (String)localObject1 + str;
      if (locala != null)
      {
        localObject2 = (com.tencent.mm.kiss.widget.textview.b)localc.gaX.get(Integer.valueOf(com.tencent.mm.kiss.widget.textview.c.a(locala)));
        if (localObject2 != null)
        {
          localObject1 = (LinkedList)((com.tencent.mm.kiss.widget.textview.b)localObject2).gaV.get(((CharSequence)localObject1).toString());
          if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0)) {
            paramInt = 0;
          }
        }
      }
      for (;;)
      {
        if (paramInt == 0) {
          break label555;
        }
        localObject1 = com.tencent.mm.plugin.sns.ui.widget.b.a(this.mContext, localbew, this.qgS, paramay.oWL.field_type, paramay.oWL.field_userName);
        paramay.qho.a(localbew, (CharSequence)localObject1);
        break;
        localObject1 = ((x)localObject1).vk();
        break label222;
        if (bg.nm(localbew.uQG)) {
          break label818;
        }
        localObject1 = ae.biR().TD(localbew.uQG);
        if (localObject1 == null) {}
        for (localObject1 = localbew.uQG;; localObject1 = ((com.tencent.mm.l.a)localObject1).vk())
        {
          localObject2 = (String)localObject2 + localContext.getString(i.j.pku);
          localObject1 = (String)localObject2 + (String)localObject1;
          break;
        }
        paramInt = 1;
        continue;
        paramInt = 0;
      }
      label555:
      localObject1 = com.tencent.mm.plugin.sns.ui.widget.b.a(this.mContext, localbew, this.qgS, paramay.oWL.field_type, paramay.oWL.field_userName);
      paramay.qho.a(localbew, (CharSequence)localObject1);
      localObject2 = com.tencent.mm.plugin.sns.ui.widget.a.bqp();
      if (((com.tencent.mm.plugin.sns.ui.widget.a)localObject2).qoE <= 0)
      {
        localObject3 = new DisplayMetrics();
        ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay().getMetrics((DisplayMetrics)localObject3);
        paramInt = ((DisplayMetrics)localObject3).widthPixels;
        int i = (int)(ab.getResources().getDimension(i.d.aQE) + ab.getResources().getDimension(i.d.aQE));
        int j = (int)ab.getResources().getDimension(i.d.oXq);
        int k = (int)ab.getResources().getDimension(i.d.aQE);
        ((com.tencent.mm.plugin.sns.ui.widget.a)localObject2).qoE = (paramInt - j - i - k);
        w.i("MicroMsg.SnsCommentPreloadTextViewConfig", "screenWidth " + paramInt + " textViewWidth " + ((com.tencent.mm.plugin.sns.ui.widget.a)localObject2).qoE + " padding: " + i + " marginLeft: " + j + " thisviewPadding: " + k);
      }
      paramInt = ((com.tencent.mm.plugin.sns.ui.widget.a)localObject2).qoE;
      if (paramInt <= 0) {
        break;
      }
      localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject1, paramInt, locala).xO();
      com.tencent.mm.kiss.widget.textview.c.gaW.a(locala, (com.tencent.mm.kiss.widget.textview.f)localObject1);
      break;
      GMTrace.o(8661875294208L, 64536);
      return;
      label818:
      localObject1 = localObject2;
    }
  }
  
  private String f(biz parambiz)
  {
    GMTrace.i(8661606858752L, 64534);
    if (parambiz.uUc.ueV == 26)
    {
      parambiz = this.mContext.getString(i.j.dsQ);
      GMTrace.o(8661606858752L, 64534);
      return parambiz;
    }
    if (parambiz.uUb == null)
    {
      GMTrace.o(8661606858752L, 64534);
      return "";
    }
    if (bg.nm(parambiz.uUb.mmR))
    {
      GMTrace.o(8661606858752L, 64534);
      return "";
    }
    if (this.qgY.containsKey(parambiz.uUb.mmR))
    {
      parambiz = (String)this.qgY.get(parambiz.uUb.mmR);
      GMTrace.o(8661606858752L, 64534);
      return parambiz;
    }
    int i = bg.getInt(parambiz.uUb.jhO, 0);
    String str = com.tencent.mm.pluginsdk.model.app.g.a(this.mContext, com.tencent.mm.pluginsdk.model.app.g.cB(parambiz.uUb.mmR, i), null);
    if (bg.nm(str))
    {
      GMTrace.o(8661606858752L, 64534);
      return str;
    }
    this.qgY.put(parambiz.uUb.mmR, str);
    GMTrace.o(8661606858752L, 64534);
    return str;
  }
  
  private static boolean g(biz parambiz)
  {
    GMTrace.i(8661741076480L, 64535);
    if (bg.nm(parambiz.uUd))
    {
      GMTrace.o(8661741076480L, 64535);
      return true;
    }
    if ((al.a.bjD() & 0x2) <= 0)
    {
      GMTrace.o(8661741076480L, 64535);
      return true;
    }
    GMTrace.o(8661741076480L, 64535);
    return false;
  }
  
  private ay vy(int paramInt)
  {
    GMTrace.i(8661472641024L, 64533);
    if (paramInt < 0)
    {
      GMTrace.o(8661472641024L, 64533);
      return null;
    }
    w.i("MicroMsg.SnsTimeLineVendingSide", "resolveAsynchronous %s", new Object[] { Integer.valueOf(paramInt) });
    long l2 = System.currentTimeMillis();
    ay localay = new ay();
    com.tencent.mm.plugin.sns.storage.m localm = (com.tencent.mm.plugin.sns.storage.m)super.getItem(paramInt);
    if (localm == null)
    {
      w.printErrStackTrace("MicroMsg.SnsTimeLineVendingSide", new Throwable(), "mSnsInfo is null, index %s, count %s, why?", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mCount) });
      GMTrace.o(8661472641024L, 64533);
      return localay;
    }
    biz localbiz = localm.blD();
    bfh localbfh = ai.n(localm);
    int j = av.d(localbiz);
    localay.Zc = j;
    localay.qhs = localm.field_snsId;
    localay.qhw = localm.field_likeFlag;
    localay.qhx = localm.blU();
    localay.qhy = localm.bmh();
    localay.oWL = localm;
    localay.oWP = localbiz;
    localay.oWK = localbfh;
    Object localObject1 = localay.oWP.uTZ;
    Object localObject2 = this.mContext;
    com.tencent.mm.plugin.sns.ui.widget.c.bqr();
    localObject2 = com.tencent.mm.plugin.sns.ui.widget.d.a((Context)localObject2, (String)localObject1, com.tencent.mm.plugin.sns.ui.widget.c.getTextSize());
    localay.qhp = ((CharSequence)localObject2);
    int i = com.tencent.mm.plugin.sns.ui.widget.c.bqr().bqt();
    Object localObject3;
    if (paramInt < this.qgS.getCount())
    {
      localObject3 = (com.tencent.mm.plugin.sns.storage.m)super.getItem(paramInt);
      if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject3).uX(32)))
      {
        localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject3).blz();
        if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).pDh == 1)) {
          i = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.br.a.fromDPToPix(this.mContext, 50) - com.tencent.mm.br.a.fromDPToPix(this.mContext, 50) - com.tencent.mm.br.a.fromDPToPix(this.mContext, 12) - com.tencent.mm.br.a.fromDPToPix(this.mContext, 12);
        }
      }
    }
    for (;;)
    {
      if (this.DEBUG) {
        w.d("MicroMsg.SnsTimeLineVendingSide", "debug:renderSnsPostDesc position " + paramInt + " viewWidth: " + i + " desc:" + (String)localObject1);
      }
      localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject2, i, com.tencent.mm.plugin.sns.ui.widget.c.bqr().bqq()).xO();
      com.tencent.mm.kiss.widget.textview.c.gaW.a(com.tencent.mm.plugin.sns.ui.widget.c.bqr().bqq(), (com.tencent.mm.kiss.widget.textview.f)localObject1);
      if (((com.tencent.mm.kiss.widget.textview.f)localObject1).gbB.getLineCount() > 6)
      {
        localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject2, i, com.tencent.mm.plugin.sns.ui.widget.c.bqr().bqs()).xO();
        com.tencent.mm.kiss.widget.textview.c.gaW.a(com.tencent.mm.plugin.sns.ui.widget.c.bqr().bqs(), (com.tencent.mm.kiss.widget.textview.f)localObject1);
      }
      a(paramInt, localay);
      Object localObject4;
      if (localay.oWL.uX(32))
      {
        ae.bja().b(localm, null);
        f(localay.oWP);
        localObject4 = localm.field_userName;
        localObject1 = this.goW.TD((String)localObject4);
        if (localObject4 != null)
        {
          if (!((String)localObject4).equals(this.pQl)) {
            break label2849;
          }
          if (this.qgU != null) {
            break label1261;
          }
          this.qgU = ((com.tencent.mm.l.a)localObject1);
        }
      }
      label587:
      label596:
      label704:
      label888:
      label895:
      label947:
      label961:
      label987:
      label1079:
      label1080:
      label1169:
      label1261:
      label1280:
      label1301:
      label1307:
      label1318:
      label1329:
      label1408:
      label1421:
      label1431:
      label1447:
      label1551:
      label1595:
      label1665:
      label1671:
      label1784:
      label1856:
      label1908:
      label1921:
      label1931:
      label2131:
      label2182:
      label2340:
      label2349:
      label2368:
      label2406:
      label2612:
      label2849:
      for (;;)
      {
        Object localObject5;
        boolean bool1;
        boolean bool2;
        if (localObject1 == null)
        {
          localObject2 = localObject4;
          localObject3 = localObject2;
          if (localm.uX(32))
          {
            localObject3 = localObject2;
            if (bg.nm((String)localObject2))
            {
              localObject5 = localm.blz();
              localObject3 = localObject2;
              if (localObject5 != null)
              {
                localObject3 = localObject2;
                if (!bg.nm(((com.tencent.mm.plugin.sns.storage.b)localObject5).eCQ)) {
                  localObject3 = ((com.tencent.mm.plugin.sns.storage.b)localObject5).eCQ;
                }
              }
            }
          }
          localay.iAx = ((String)localObject4);
          localay.qhG = ((String)localObject3);
          localay.pOL = localm.uX(32);
          localay.pSl = localm.blY();
          if (localObject1 != null) {
            break label1280;
          }
          bool1 = true;
          localay.qhH = bool1;
          localay.qhq = ((com.tencent.mm.l.a)localObject1);
          localay.qhr = localm.blE();
          localay.qht = localbiz.uTZ;
          localay.qhu = localbiz.uUe;
          localay.qhv = localm.field_createTime;
          localay.qhz = az.e(this.mContext, localay.qhv * 1000L);
          localay.qhJ = false;
          if ((j == 11) && (!q.zE().equals(localbiz.jhi)) && (localbfh.uRe != null) && (localbfh.uRe.uRG != 0))
          {
            localay.qhK = localbfh.uRe.uRG;
            localay.qhJ = true;
          }
          if (!localay.pOL) {
            break label1307;
          }
          localObject1 = localm.blB();
          if (localObject1 != null)
          {
            localay.qhM = ((com.tencent.mm.plugin.sns.storage.a)localObject1).pCj;
            if (bg.nm(((com.tencent.mm.plugin.sns.storage.a)localObject1).pCk)) {
              break label1301;
            }
            bool1 = true;
            localay.qhN = bool1;
          }
          localObject1 = f(localbiz);
          if ((!com.tencent.mm.plugin.sns.c.a.hnI.bI((String)localObject1)) || (!g(localbiz))) {
            break label1595;
          }
          localay.qhO = true;
          bool2 = true;
          bool1 = true;
          if (localbiz.uUb != null) {
            break label1447;
          }
          bool1 = false;
          localay.mAppName = ((String)localObject1);
          localay.qhQ = bool1;
          if ((localay.iAx == null) || (!localay.iAx.equals(this.pQl))) {
            break label1665;
          }
          bool1 = true;
          localay.qhI = bool1;
          localay.qhU = localm.bma();
          localay.qhV = localm.blQ().uDt;
          localay.qhW = false;
          if ((localbfh != null) && (localay.qhI))
          {
            i = localbfh.uEI;
            if ((i == 3) || (i == 5)) {
              localay.qhW = true;
            }
          }
          if (localbfh == null) {
            break label2406;
          }
          if (localbfh.uQW.size() > 0) {
            break label1671;
          }
          localay.qhX = false;
          break label1856;
          if ((localbfh.uRe == null) || (!q.zE().equals(localbiz.jhi)) || (localbfh.uRe.uRG <= 0)) {
            break label1931;
          }
          localay.qic = (com.tencent.mm.plugin.sns.lucky.a.m.b(localm, localbfh) * 1.0D);
          localay.qib = localbfh.uRe.uRG;
          localay.qia = true;
          localObject2 = new b.a();
          localObject3 = localbfh.uRe.uRH.iterator();
          if (!((Iterator)localObject3).hasNext()) {
            break label1921;
          }
          localObject4 = (bfd)((Iterator)localObject3).next();
          localObject1 = this.goW.TD(((bfd)localObject4).tRz);
          if (localObject1 == null) {
            break label1908;
          }
        }
        for (localObject1 = bg.nl(((com.tencent.mm.l.a)localObject1).vk());; localObject1 = bg.nl(((bfd)localObject4).tRz))
        {
          ((b.a)localObject2).s(new com.tencent.mm.vending.j.a[] { com.tencent.mm.vending.j.a.w(((bfd)localObject4).tRz, localObject1) });
          break label1169;
          ae.bja().a(localm, null);
          break;
          localObject1 = this.qgU;
          break label587;
          localObject2 = ((com.tencent.mm.l.a)localObject1).vk();
          break label596;
          if ((int)((com.tencent.mm.l.a)localObject1).fTq == 0)
          {
            bool1 = true;
            break label704;
          }
          bool1 = false;
          break label704;
          bool1 = false;
          break label888;
          if (localbiz.uUa == null)
          {
            localObject1 = null;
            if (localbiz.uUa != null) {
              break label1408;
            }
            localObject2 = null;
            if (bg.nm((String)localObject2)) {
              break label1431;
            }
            if ((localm.field_snsId != 0L) || (bg.nm((String)localObject1))) {
              break label1421;
            }
          }
          for (localay.qhM = ((String)localObject1 + "·" + (String)localObject2);; localay.qhM = ((String)localObject2))
          {
            localay.qhN = true;
            break;
            localObject1 = localbiz.uUa.gCz;
            break label1318;
            localObject2 = localbiz.uUa.mzo;
            break label1329;
          }
          localay.qhM = ((String)localObject1);
          localay.qhN = false;
          break label895;
          if (this.qgZ.containsKey(localbiz.uUb.mmR))
          {
            bool1 = bool2;
            if (((Boolean)this.qgZ.get(localbiz.uUb.mmR)).booleanValue()) {
              break label1551;
            }
            bool1 = false;
            break label947;
          }
          if (com.tencent.mm.pluginsdk.model.app.g.bJ(localbiz.uUb.mmR)) {
            if (localbiz.uUb.tQG == 0)
            {
              bool2 = false;
              bool1 = false;
            }
          }
          for (;;)
          {
            this.qgZ.put(localbiz.uUb.mmR, Boolean.valueOf(bool2));
            break;
            bool2 = true;
            bool1 = true;
            continue;
            boolean bool3 = com.tencent.mm.pluginsdk.model.app.g.Or(localbiz.uUb.mmR);
            bool2 = bool3;
            if (!bool3)
            {
              bool1 = false;
              bool2 = bool3;
            }
          }
          if ((!bg.nm(localbiz.uUd)) && (g(localbiz)))
          {
            localay.mAppName = ((String)localObject1);
            localay.qhP = true;
            localay.qhS = localbiz.tws;
            localay.qhR = localbiz.uUd;
            break label961;
          }
          localay.qhO = false;
          localay.qhP = false;
          break label961;
          bool1 = false;
          break label987;
          if (this.pQl.equals(localbfh.tRz))
          {
            localay.qhX = true;
            localObject2 = new StringBuffer();
            localObject3 = localbfh.uQW.iterator();
            i = 0;
            if (((Iterator)localObject3).hasNext())
            {
              localObject1 = (bew)((Iterator)localObject3).next();
              if (i == 0)
              {
                i = 1;
                ((StringBuffer)localObject2).append("  ");
              }
              for (;;)
              {
                if (((bew)localObject1).uBf == null) {
                  break label1784;
                }
                ((StringBuffer)localObject2).append(((bew)localObject1).uBf);
                break;
                ((StringBuffer)localObject2).append(",  ");
              }
              localObject4 = this.goW.TD(((bew)localObject1).tRz);
              if (localObject4 == null) {}
              for (localObject1 = ((bew)localObject1).tRz;; localObject1 = ((com.tencent.mm.l.a)localObject4).vk())
              {
                ((StringBuffer)localObject2).append((String)localObject1);
                break;
              }
            }
            localay.qhY = ((StringBuffer)localObject2).toString();
            break label1080;
          }
          localObject1 = localbfh.uQW.iterator();
          if (!((Iterator)localObject1).hasNext()) {
            break label1080;
          }
          localObject2 = (bew)((Iterator)localObject1).next();
          if (!this.pQl.equals(((bew)localObject2).tRz)) {
            break label1079;
          }
          localay.qhX = true;
          localay.qhZ = true;
          break label1080;
        }
        localay.qid = ((b.a)localObject2).ckf();
        if (localbfh.uQQ.size() > 0)
        {
          localObject2 = new b.a();
          localObject3 = localbfh.uQQ.iterator();
          if (((Iterator)localObject3).hasNext())
          {
            localObject4 = (bew)((Iterator)localObject3).next();
            localObject1 = this.goW.TD(((bew)localObject4).tRz);
            if (localObject1 != null) {}
            for (localObject1 = bg.nl(((com.tencent.mm.l.a)localObject1).vk());; localObject1 = bg.nl(((bew)localObject4).tRz))
            {
              ((b.a)localObject2).s(new com.tencent.mm.vending.j.a[] { com.tencent.mm.vending.j.a.w(((bew)localObject4).tRz, localObject1) });
              break;
            }
          }
          localay.qie = ((b.a)localObject2).ckf();
        }
        if (localbfh.uQT.size() > 0)
        {
          localObject2 = new b.a();
          localObject3 = localbfh.uQT.iterator();
          if (((Iterator)localObject3).hasNext())
          {
            localObject5 = (bew)((Iterator)localObject3).next();
            long l1;
            if (((bew)localObject5).uQm != 0)
            {
              l1 = ((bew)localObject5).uQm;
              localObject4 = ((bew)localObject5).tRz;
              if (!((bew)localObject5).tRz.equals(this.pQl)) {
                break label2349;
              }
              if (this.qgU != null) {
                break label2340;
              }
              localObject1 = this.goW.TD(((bew)localObject5).tRz);
              this.qgU = ((com.tencent.mm.l.a)localObject1);
              if (localObject1 == null) {
                break label2368;
              }
              localObject1 = ((com.tencent.mm.l.a)localObject1).vk();
            }
            for (;;)
            {
              String str = ((bew)localObject5).nIp;
              localObject5 = (CharSequence)localay.qho.ppg.get(((bew)localObject5).uQm + "-" + ((bew)localObject5).uQp + "-" + ((bew)localObject5).nIp);
              com.tencent.mm.vending.j.f localf = new com.tencent.mm.vending.j.f();
              localf.xyT = new Object[] { Long.valueOf(l1), localObject4, localObject1, str, localObject5 };
              ((b.a)localObject2).s(new com.tencent.mm.vending.j.a[] { (com.tencent.mm.vending.j.f)localf });
              break;
              l1 = ((bew)localObject5).uQp;
              break label2131;
              localObject1 = this.qgU;
              break label2182;
              localObject1 = this.goW.TD(((bew)localObject5).tRz);
              break label2182;
              if (((bew)localObject5).uBf != null) {
                localObject1 = ((bew)localObject5).uBf;
              } else {
                localObject1 = ((bew)localObject5).tRz;
              }
            }
          }
          localay.qif = ((b.a)localObject2).ckf();
        }
        ag.a(this.mContext, localay, localbiz.pwN);
        if (localay.pOL)
        {
          localay.qhA = localm.blB();
          localay.qhB = localm.blz();
          localObject1 = localm.blz();
          if (localObject1 != null)
          {
            localObject1 = ((com.tencent.mm.plugin.sns.storage.b)localObject1).pCG;
            localay.qhC = ((String)localObject1);
          }
        }
        else if (localay.pOL)
        {
          localObject3 = localay.qhA;
          if (localay.qhA.pCl != com.tencent.mm.plugin.sns.storage.a.pBX) {
            break label2612;
          }
          localay.qhD = ((com.tencent.mm.plugin.sns.storage.a)localObject3).pCm;
        }
        for (;;)
        {
          localObject1 = localm.blQ();
          localay.qii = ((anv)localObject1);
          if ((localObject1 != null) && (!q.zE().equals(localbiz.jhi)) && (com.tencent.mm.plugin.sns.lucky.a.m.a(localm, localbfh))) {
            localay.qhL = true;
          }
          w.d("MicroMsg.SnsTimeLineVendingSide", "SnsTimeLineVendingStruct resolve %s %s ms", new Object[] { Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis() - l2) });
          GMTrace.o(8661472641024L, 64533);
          return localay;
          localObject1 = "";
          break;
          if ((((com.tencent.mm.plugin.sns.storage.a)localObject3).pCl == com.tencent.mm.plugin.sns.storage.a.pBY) && (!bg.nm(((com.tencent.mm.plugin.sns.storage.a)localObject3).pCm)))
          {
            localObject2 = "";
            localObject4 = ((com.tencent.mm.plugin.sns.storage.a)localObject3).pCo.iterator();
            if (((Iterator)localObject4).hasNext())
            {
              localObject5 = (String)((Iterator)localObject4).next();
              localObject1 = ae.biR().TD((String)localObject5);
              if (localObject1 != null)
              {
                localObject1 = ((com.tencent.mm.l.a)localObject1).vk();
                if (!bg.nm((String)localObject1)) {
                  localObject1 = (String)localObject2 + (String)localObject1;
                }
              }
              for (;;)
              {
                localObject2 = localObject1;
                if (((com.tencent.mm.plugin.sns.storage.a)localObject3).pCo.getLast() == localObject5) {
                  break;
                }
                localObject2 = (String)localObject1 + ",";
                break;
                localObject1 = (String)localObject2 + (String)localObject5;
                continue;
                localObject1 = (String)localObject2 + (String)localObject5;
              }
            }
            localay.qhF = ((String)localObject2);
            localay.qhE = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject3).pCm, new Object[] { localObject2 });
          }
        }
      }
    }
  }
  
  protected final Cursor bpF()
  {
    GMTrace.i(8662009511936L, 64537);
    if (!this.qgV) {}
    label858:
    label878:
    label883:
    label953:
    label977:
    label1017:
    label1101:
    label1191:
    for (;;)
    {
      int k;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      synchronized (this.qgX)
      {
        this.kNA = q(0L, this.kNA);
        this.qgV = true;
        k = ae.bjd().IF(this.kNA);
        w.i("MicroMsg.SnsTimeLineVendingSide", "create time sql %s to %s getLimitSeq() %s", new Object[] { Integer.valueOf(this.qgT), Integer.valueOf(k), this.kNA });
        if (this.qgT == k) {
          break label1017;
        }
        ??? = ae.bjg();
        i = this.qgT;
        Object localObject2 = "select *,rowid from AdSnsInfo  where createTime > " + k + " and createTime <= " + i;
        localObject2 = (String)localObject2 + " order by  createTime desc";
        w.d("MicroMsg.AdSnsInfoStorage", "getAdInTime " + (String)localObject2);
        ??? = ((com.tencent.mm.plugin.sns.storage.f)???).fTZ.rawQuery((String)localObject2, null);
        if ((??? == null) || (!((Cursor)???).moveToFirst())) {
          break label977;
        }
        localObject2 = new LinkedList();
        localObject4 = new com.tencent.mm.plugin.sns.storage.e();
        ((com.tencent.mm.plugin.sns.storage.e)localObject4).b((Cursor)???);
        localObject5 = ((com.tencent.mm.plugin.sns.storage.e)localObject4).blF();
        localObject6 = new StringBuilder("ad xml ");
        Object localObject7 = ((com.tencent.mm.plugin.sns.storage.m)localObject5).bmj();
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append(((com.tencent.mm.plugin.sns.storage.m)localObject5).field_stringSeq);
        localStringBuffer.append(((com.tencent.mm.plugin.sns.storage.e)localObject7).field_adxml);
        localStringBuffer.append(" <createtime " + ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_createTime + ">");
        localStringBuffer.append(" <exposuretime " + ((com.tencent.mm.plugin.sns.storage.e)localObject7).field_exposureTime + ">");
        localStringBuffer.append(" <adcreatetime " + ((com.tencent.mm.plugin.sns.storage.e)localObject7).field_createAdTime + "> ");
        localStringBuffer.append(((com.tencent.mm.plugin.sns.storage.e)localObject7).blD().uTZ);
        w.d("MicroMsg.SnsTimeLineVendingSide", localStringBuffer.toString());
        l1 = 21600L;
        localObject6 = ((com.tencent.mm.plugin.sns.storage.m)localObject5).blB();
        i = ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_createTime;
        if ((((com.tencent.mm.plugin.sns.storage.e)localObject4).field_localFlag & 0x80) > 0)
        {
          bool = true;
          if (localObject6 == null) {
            break label1191;
          }
          if (!bool) {
            break label858;
          }
          l1 = 60L * ((com.tencent.mm.plugin.sns.storage.a)localObject6).pCb;
          i = ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_exposureTime;
          long l2 = bg.aG(i);
          if (l2 < l1) {
            break label883;
          }
          localObject6 = ai.n((com.tencent.mm.plugin.sns.storage.m)localObject5);
          if (((com.tencent.mm.plugin.sns.storage.m)localObject5).field_likeFlag == 0)
          {
            localObject6 = ((bfh)localObject6).uQT.iterator();
            if (!((Iterator)localObject6).hasNext()) {
              break label878;
            }
            localObject7 = (bew)((Iterator)localObject6).next();
            if ((localObject7 == null) || (bg.nm(((bew)localObject7).tRz)) || (!((bew)localObject7).tRz.equals(this.pQl))) {
              continue;
            }
          }
          j = 1;
          if (j != 0) {
            break label883;
          }
          ae.bjg().delete(((com.tencent.mm.plugin.sns.storage.m)localObject5).field_snsId);
          w.i("MicroMsg.SnsTimeLineVendingSide", "~~addelete the item " + ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_snsId + " exposureTime: " + l1 + " field_createTime: " + ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_createTime + " checktime: " + l2 + " gettime: " + i + " isexposure " + bool + " exposureTime " + ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_exposureTime + " adCreateTIme:" + ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_createAdTime);
          if (!bool) {
            ((LinkedList)localObject2).add(localObject4);
          }
          if (((Cursor)???).moveToNext()) {
            continue;
          }
          if (((LinkedList)localObject2).size() <= 0) {
            break label977;
          }
          localObject4 = new LinkedList();
          localObject2 = ((LinkedList)localObject2).iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break label953;
          }
          localObject5 = (com.tencent.mm.plugin.sns.storage.e)((Iterator)localObject2).next();
          localObject6 = new bf();
          ((bf)localObject6).tPx = 13298;
          ((bf)localObject6).tPy = new com.tencent.mm.bm.b(((com.tencent.mm.plugin.sns.storage.e)localObject5).blB().pyc.getBytes());
          ((bf)localObject6).tPz = (System.currentTimeMillis() / 1000L);
          ((LinkedList)localObject4).add(localObject6);
        }
      }
      boolean bool = false;
      continue;
      long l1 = 60L * ((com.tencent.mm.plugin.sns.storage.a)localObject6).pCa;
      int i = ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_createAdTime;
      continue;
      int j = 0;
      continue;
      l1 = ((com.tencent.mm.plugin.sns.storage.m)localObject5).field_snsId;
      w.i("MicroMsg.SnsTimeLineVendingSide", "try to update snsid " + l1);
      if (com.tencent.mm.plugin.sns.model.l.dy(l1))
      {
        localObject4 = new com.tencent.mm.plugin.sns.model.l(l1, 1);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a((com.tencent.mm.ad.k)localObject4, 0);
        continue;
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.sns.model.k((LinkedList)localObject4), 0);
        if (??? != null)
        {
          w.d("MicroMsg.SnsTimeLineVendingSide", "test for adcount " + ((Cursor)???).getCount());
          ((Cursor)???).close();
        }
        this.qgT = k;
        ??? = ae.bjd().bS(this.kNA, k);
        w.d("MicroMsg.SnsTimeLineVendingSide", "onCursorResetFinish");
        com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.ha(500);
        if (localb.LN())
        {
          i = this.mCount;
          if (i != 0) {
            break label1101;
          }
          localb.hd(0).hd(0).hd(0);
          localb.LR();
        }
        for (;;)
        {
          GMTrace.o(8662009511936L, 64537);
          return (Cursor)???;
          localObject4 = i.g((com.tencent.mm.plugin.sns.storage.m)getItem(1));
          localObject5 = i.g((com.tencent.mm.plugin.sns.storage.m)getItem(i - 1));
          if ((!((String)localObject4).equals(this.qha)) || (!((String)localObject5).equals(this.qhb)))
          {
            this.qha = ((String)localObject4);
            this.qhb = ((String)localObject5);
            localb.hd(i).lu((String)localObject4).lu((String)localObject5);
            localb.LR();
          }
        }
      }
    }
  }
  
  public final void bpp()
  {
    GMTrace.i(8661204205568L, 64531);
    looperCheckForVending();
    long l;
    if (this.mCount == 0)
    {
      l = 0L;
      this.qgW = true;
    }
    for (;;)
    {
      synchronized (this.qgX)
      {
        this.kNA = q(l, this.kNA);
        GMTrace.o(8661204205568L, 64531);
        return;
        int i = this.mCount - 1;
        int j = 0;
        ??? = (com.tencent.mm.plugin.sns.storage.m)getItem(i);
        if ((??? != null) && (!((com.tencent.mm.plugin.sns.storage.m)???).uX(32)) && (((com.tencent.mm.plugin.sns.storage.m)???).field_snsId != 0L))
        {
          l = ((com.tencent.mm.plugin.sns.storage.m)???).field_snsId;
          w.i("MicroMsg.SnsTimeLineVendingSide", "get list last not ad item %s %s", new Object[] { Long.valueOf(l), ((com.tencent.mm.plugin.sns.storage.m)???).field_stringSeq });
          break;
        }
        j += 1;
        i -= 1;
        if ((i < 0) || (j > 500)) {
          l = 0L;
        }
      }
    }
  }
  
  public final void destroyAsynchronous()
  {
    GMTrace.i(8662143729664L, 64538);
    super.destroyAsynchronous();
    com.tencent.mm.kiss.widget.textview.c.gaW.xN();
    this.qgZ.clear();
    GMTrace.o(8662143729664L, 64538);
  }
  
  String q(long paramLong, String paramString)
  {
    GMTrace.i(8661338423296L, 64532);
    w.d("MicroMsg.SnsTimeLineVendingSide", "updateLitmitSeq %s %s", new Object[] { Integer.valueOf(ae.biT().bjC()), paramString });
    Object localObject = ae.bjd();
    int i;
    String str;
    if (paramString.equals(""))
    {
      i = ae.biT().bjC() / 2;
      localObject = i.du(((com.tencent.mm.plugin.sns.storage.n)localObject).e(paramLong, i, false));
      str = this.pWe;
      if (!str.equals("")) {
        break label140;
      }
      paramString = (String)localObject;
    }
    for (;;)
    {
      localObject = ae.bjh().Iw("@__weixintimtline").blP();
      if (((tf)localObject).ujh != 0L) {
        break label159;
      }
      GMTrace.o(8661338423296L, 64532);
      return paramString;
      i = ae.biT().bjC();
      break;
      label140:
      paramString = (String)localObject;
      if (((String)localObject).compareTo(str) >= 0) {
        paramString = str;
      }
    }
    label159:
    localObject = i.du(((tf)localObject).ujh);
    if (paramString.equals(""))
    {
      GMTrace.o(8661338423296L, 64532);
      return (String)localObject;
    }
    if (((String)localObject).compareTo(paramString) > 0)
    {
      GMTrace.o(8661338423296L, 64532);
      return (String)localObject;
    }
    GMTrace.o(8661338423296L, 64532);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */