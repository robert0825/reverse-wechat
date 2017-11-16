package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.AsyncNormalTextView;
import com.tencent.mm.plugin.sns.ui.ak;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.j;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;
import java.util.LinkedList;

public final class g
  extends a
{
  private int mScreenHeight;
  private int mScreenWidth;
  private b.e qmm;
  
  public g()
  {
    GMTrace.i(8522825728000L, 63500);
    this.qmm = new b.e()
    {
      public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
      {
        GMTrace.i(8517993889792L, 63464);
        GMTrace.o(8517993889792L, 63464);
      }
    };
    GMTrace.o(8522825728000L, 63500);
  }
  
  public final void a(a.c paramc, int paramInt1, ay paramay, biz parambiz, int paramInt2, final av paramav)
  {
    GMTrace.i(8523094163456L, 63502);
    anu localanu;
    m localm;
    label160:
    com.tencent.mm.plugin.sns.model.g localg;
    boolean bool;
    label308:
    Object localObject1;
    Object localObject2;
    if ((parambiz.uUc != null) && (parambiz.uUc.ueW.size() > 0))
    {
      localanu = (anu)parambiz.uUc.ueW.get(0);
      w.v("MicroMsg.VideoTimeLineItem", "videoTImeline %d ", new Object[] { Integer.valueOf(paramInt1) });
      localm = ae.bjd().Ir(paramc.eUg);
      if ((!paramay.pOL) || (localanu == null)) {
        break label819;
      }
      final long l = paramay.qhs;
      paramc.qlW.oUt.a(new b.e()
      {
        public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
        {
          GMTrace.i(8518664978432L, 63469);
          if (paramAnonymousInt != -1)
          {
            if ((paramav == null) || (paramav.qgA == null) || (paramav.qgA.pOY == null))
            {
              GMTrace.o(8518664978432L, 63469);
              return;
            }
            paramav.qgA.pOY.dn(l);
          }
          GMTrace.o(8518664978432L, 63469);
        }
      });
      if (!paramav.qgA.pOY.jdMethod_do(l)) {
        paramc.qlW.oUt.a(new b.f()
        {
          public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, long paramAnonymousLong)
          {
            GMTrace.i(8519872937984L, 63478);
            if ((paramav == null) || (paramav.qgA == null) || (paramav.qgA.pOY == null))
            {
              GMTrace.o(8519872937984L, 63478);
              return;
            }
            int i = (int)paramAnonymousb.bgw();
            paramav.qgA.pOY.t(l, bg.Pw());
            paramav.qgA.pOY.u(l, i);
            paramav.qgA.pOY.s(l, l);
            this.qmq.qlW.oUt.a(null);
            GMTrace.o(8519872937984L, 63478);
          }
        });
      }
      paramc.qlW.a(parambiz, paramInt1, paramay.pSl, paramay.pOL);
      paramc.qlW.pIu.setVisibility(8);
      localg = ae.bja();
      if ((parambiz.uUc == null) || (parambiz.uUc.ueW.size() <= 0)) {
        break label1983;
      }
      l = System.nanoTime();
      bool = com.tencent.mm.plugin.sns.model.g.t(localanu);
      w.i("MicroMsg.VideoTimeLineItem", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.nanoTime() - l) });
      if (bool) {
        break label1162;
      }
      if (!localg.w(localanu)) {
        break label872;
      }
      paramc.qlW.pIr.setVisibility(8);
      paramc.qlW.pWE.setVisibility(0);
      paramc.qlW.pWE.cjf();
      localObject1 = com.tencent.mm.modelsns.e.a(paramc.qlX, paramc.qlW.oUt.bgm(), paramay.pOL);
      if (!paramay.pOL) {
        break label2066;
      }
      localObject2 = paramay.oWL.blz();
      paramInt2 = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
      if ((localObject2 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDs != 1) || (!paramc.qlV)) {
        break label1543;
      }
      paramInt2 = paramInt2 - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 28);
      localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * localanu.uCR.uDF / localanu.uCR.uDE)));
    }
    label471:
    label720:
    label743:
    label819:
    label872:
    label1026:
    label1162:
    label1541:
    label1543:
    label1952:
    label1958:
    label1983:
    label2026:
    label2066:
    for (;;)
    {
      paramInt2 = ((Integer)((Pair)localObject1).first).intValue();
      int i = ((Integer)((Pair)localObject1).second).intValue();
      paramc.qlW.oUt.cV(paramInt2, i);
      localObject1 = paramc.qlW.pWF.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = paramInt2;
      ((ViewGroup.LayoutParams)localObject1).height = i;
      paramc.qlW.pWF.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramc.qlW.oUt.bo(paramc.qlW);
      localObject1 = paramc.qlW.oUt;
      paramInt2 = this.mActivity.hashCode();
      localObject2 = an.bTm();
      ((an)localObject2).time = parambiz.nFd;
      localg.a(localm, localanu, (com.tencent.mm.plugin.sight.decode.a.a)localObject1, paramInt2, paramInt1, (an)localObject2, paramay.pOL);
      paramc.qlW.pWD.setTag(paramc.qlW);
      paramc.qmi.setTag(paramc.qlW);
      paramc.qmj.setTag(paramc.qlW);
      parambiz = am.dE(ae.getAccSnsPath(), localanu.mmR);
      localObject1 = i.j(localanu);
      if (FileOp.aZ(parambiz + (String)localObject1))
      {
        paramav.qgA.pOY.d(paramay.qhs, 0, true);
        if (!paramay.pOL) {
          break label1958;
        }
        if (ae.bja().b(localm, null) != 5) {
          break label1952;
        }
        bool = true;
        paramav.qgA.pOY.k(paramay.qhs, bool);
      }
      for (;;)
      {
        if ((localm == null) || (localm.bke())) {
          break label2026;
        }
        paramav.juL.c(paramc.qlW.pWD, paramav.pxE.qmL, paramav.pxE.qmv);
        GMTrace.o(8523094163456L, 63502);
        return;
        localanu = null;
        break;
        paramc.qlW.pWF.setVisibility(8);
        paramc.qlW.oUt.bgp();
        paramc.qlW.oUt.a(null);
        paramc.qlW.oUt.a(null);
        break label160;
        if ((paramay.pOL) && (localg.b(localm, null) == 5))
        {
          localg.z(localanu);
          paramc.qlW.pIr.setVisibility(8);
          paramc.qlW.pWE.setVisibility(0);
          paramc.qlW.pWE.cjf();
          break label308;
        }
        if ((localg.prm.containsKey(localanu.mmR)) && (((Integer)localg.prm.get(localanu.mmR)).intValue() == 4)) {}
        for (paramInt2 = 1;; paramInt2 = 0)
        {
          if (paramInt2 == 0) {
            break label1026;
          }
          paramc.qlW.pWE.setVisibility(8);
          paramc.qlW.pIr.setImageResource(i.e.ban);
          paramc.qlW.pIr.setVisibility(0);
          break;
        }
        localg.x(localanu);
        paramc.qlW.pIr.setVisibility(0);
        paramc.qlW.pWE.setVisibility(8);
        paramc.qlW.pIr.setImageDrawable(com.tencent.mm.br.a.b(this.mActivity, i.i.cOK));
        paramc.qlW.pIr.setContentDescription(this.mActivity.getString(i.j.pie));
        if ((!paramay.pOL) && (localg.a(localm, null) == 4))
        {
          paramc.qlW.pIu.setVisibility(0);
          break label308;
        }
        if ((!paramay.pOL) || (localg.b(localm, null) != 4)) {
          break label308;
        }
        paramc.qlW.pIu.setVisibility(0);
        break label308;
        if (localg.u(localanu))
        {
          paramc.qlW.pIr.setVisibility(0);
          paramc.qlW.pWE.setVisibility(8);
          paramc.qlW.pIr.setImageDrawable(com.tencent.mm.br.a.b(this.mActivity, i.i.cOK));
          paramc.qlW.pIr.setContentDescription(this.mActivity.getString(i.j.pie));
        }
        for (;;)
        {
          if (!paramc.qlW.oUt.bgn()) {
            break label1541;
          }
          w.d("MicroMsg.VideoTimeLineItem", "play video error " + localanu.mmR + " " + localanu.lPM + " " + localanu.uCO + " " + paramInt1);
          localg.x(localanu);
          paramc.qlW.pIr.setVisibility(0);
          paramc.qlW.pWE.setVisibility(8);
          paramc.qlW.pIr.setImageDrawable(com.tencent.mm.br.a.b(this.mActivity, i.i.cOK));
          paramc.qlW.pIr.setContentDescription(this.mActivity.getString(i.j.pie));
          break;
          if (localg.v(localanu))
          {
            paramc.qlW.pIr.setVisibility(8);
            paramc.qlW.pWE.setVisibility(8);
          }
          else if ((paramay.pOL) && (localg.b(localm, null) <= 5))
          {
            paramc.qlW.pIr.setVisibility(8);
            paramc.qlW.pWE.setVisibility(8);
          }
          else
          {
            localg.x(localanu);
            paramc.qlW.pIr.setVisibility(0);
            paramc.qlW.pWE.setVisibility(8);
            paramc.qlW.pIr.setImageDrawable(com.tencent.mm.br.a.b(this.mActivity, i.i.cOK));
            paramc.qlW.pIr.setContentDescription(this.mActivity.getString(i.j.pie));
          }
        }
        break label308;
        if ((localObject2 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi <= 0.0F) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj <= 0.0F)) {
          break label2066;
        }
        float f3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDk, ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDl);
        float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDk, ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDl);
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDh == 0)
        {
          float f1 = f3;
          if (f3 >= paramInt2 - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12))
          {
            f1 = paramInt2 - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
            f2 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj * f1 / ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi);
          }
          localObject1 = Pair.create(Integer.valueOf((int)f1), Integer.valueOf((int)f2));
          break label471;
        }
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDh == 1)
        {
          paramInt2 = paramInt2 - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
          localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj / ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi)));
          paramc.qla.setLayoutParams(new LinearLayout.LayoutParams(paramInt2, -2));
          break label471;
        }
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDh != 2) {
          break label2066;
        }
        paramInt2 = paramInt2 - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
        localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj / ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi)));
        paramc.qla.setLayoutParams(new LinearLayout.LayoutParams(paramInt2, -2));
        break label471;
        paramav.qgA.pOY.d(paramay.qhs, 0, false);
        break label720;
        bool = false;
        break label743;
        if (ae.bja().a(localm, null) == 5)
        {
          bool = true;
          break label743;
        }
        bool = false;
        break label743;
        paramay = paramc.qlW.oUt;
        localg.a(paramay, "", -1, this.mActivity.hashCode());
        paramay.D(null);
        paramay.ar(null, false);
      }
      paramav.juL.c(paramc.qlW.pWD, paramav.pxE.qmM, paramav.pxE.qmv);
      GMTrace.o(8523094163456L, 63502);
      return;
    }
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8522959945728L, 63501);
    Object localObject = new DisplayMetrics();
    this.mActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.mScreenWidth = ((DisplayMetrics)localObject).widthPixels;
    this.mScreenHeight = ((DisplayMetrics)localObject).heightPixels;
    if (paramc.qlf != null)
    {
      paramc.qlf.setLayoutResource(i.g.pdk);
      paramc.qlU = ((ViewStub)paramc.lFh.findViewById(i.f.paR));
      if (!paramc.qlV) {
        paramc.qlW.pWC = paramc.qlU.inflate();
      }
    }
    for (paramc.qlV = true;; paramc.qlV = true)
    {
      paramc.qlW.pWD = paramc.qlW.pWC.findViewById(i.f.bne);
      paramc.qlW.oUt = ((com.tencent.mm.plugin.sight.decode.a.a)paramc.qlW.pWC.findViewById(i.f.image));
      paramc.qlW.pWD.setOnClickListener(this.pyk.pxE.qmS);
      paramc.qlW.pIr = ((ImageView)paramc.qlW.pWC.findViewById(i.f.cfI));
      paramc.qlW.pWE = ((MMPinProgressBtn)paramc.qlW.pWC.findViewById(i.f.progress));
      paramc.qlW.pWF = ((TextView)paramc.qlW.pWC.findViewById(i.f.paB));
      paramc.qlW.pIu = ((TextView)paramc.qlW.pWC.findViewById(i.f.paC));
      com.tencent.mm.kernel.h.xz();
      if (((Boolean)com.tencent.mm.kernel.h.xy().xh().get(344065, Boolean.valueOf(false))).booleanValue())
      {
        localObject = (TextView)((ViewStub)paramc.qlW.pWC.findViewById(i.f.pbW)).inflate();
        paramc.qlW.oUt.h((TextView)localObject);
      }
      GMTrace.o(8522959945728L, 63501);
      return;
      paramc.qlW.pWC = paramc.lFh.findViewById(i.f.pdk);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */