package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.r;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.widget.h;
import java.util.LinkedList;

public final class d
  extends a
{
  public d()
  {
    GMTrace.i(8518128107520L, 63465);
    GMTrace.o(8518128107520L, 63465);
  }
  
  public final void a(a.c paramc, int paramInt1, ay paramay, biz parambiz, int paramInt2, av paramav)
  {
    GMTrace.i(8518396542976L, 63467);
    paramc.qli.position = paramInt1;
    Object localObject1 = paramay.pSl;
    Object localObject2 = paramay.oWL;
    paramInt1 = 0;
    int i;
    if (paramay.pOL)
    {
      if (((m)localObject2).blz().pDs == 2)
      {
        paramInt1 = 1;
        paramc.qet.setTag(paramc);
        paramc.qet.setOnClickListener(paramav.pxE.qnd);
      }
      i = 0;
    }
    for (;;)
    {
      label109:
      int j;
      if (paramInt1 != 0)
      {
        paramav.juL.c(paramc.qet, paramav.pxE.qmN, paramav.pxE.qmv);
        if (parambiz.uUc.ueV != 9) {
          break label1290;
        }
        j = 1;
        label125:
        if (j == 0) {
          break label1310;
        }
        paramay = av.Jp(parambiz.uUc.lPM);
        label142:
        if ((parambiz.uUc.ueV != 9) && (parambiz.uUc.ueV != 14) && (parambiz.uUc.ueV != 12) && (parambiz.uUc.ueV != 13) && (paramInt1 == 0)) {
          break label1809;
        }
        paramay = parambiz.uUc.lPj;
      }
      label392:
      label443:
      label1290:
      label1310:
      label1693:
      label1705:
      label1729:
      label1747:
      label1809:
      for (;;)
      {
        paramav = parambiz.uUc.eBt;
        if ((paramav != null) && (paramav.length() > 40)) {
          paramav = paramav.substring(0, 40) + "...";
        }
        for (;;)
        {
          paramc.pOP.setVisibility(8);
          TagImageView localTagImageView;
          an localan;
          if (!parambiz.uUc.ueW.isEmpty())
          {
            paramc.qli.setVisibility(0);
            localObject1 = (anu)parambiz.uUc.ueW.get(0);
            if (parambiz.uUc.ueV == 15)
            {
              paramc.pOP.setImageResource(i.e.aYf);
              paramc.pOP.setVisibility(0);
              localObject2 = ae.bja();
              localTagImageView = paramc.qli;
              paramInt1 = i.i.cJo;
              j = this.mActivity.hashCode();
              localan = an.bTm();
              localan.time = parambiz.nFd;
              ((g)localObject2).b((anu)localObject1, localTagImageView, paramInt1, j, localan);
              if (parambiz.uUc.ueV == 15)
              {
                paramay = "";
                paramav = this.mActivity.getString(i.j.pjj);
              }
              if (com.tencent.mm.sdk.platformtools.bg.nm(paramay)) {
                break label1693;
              }
              paramc.qlj.setVisibility(0);
              paramc.qlj.setText(paramay);
              if (com.tencent.mm.sdk.platformtools.bg.nm(paramav)) {
                break label1747;
              }
              if (paramc.qlj.getVisibility() != 8) {
                break label1705;
              }
              if (paramc.qlk != 2) {
                paramc.hqi.setMaxLines(2);
              }
            }
          }
          for (paramc.qlk = 2;; paramc.qlk = 1)
          {
            paramc.hqi.setVisibility(0);
            if (i == 0) {
              break label1729;
            }
            paramc.hqi.setText(i.a(paramav, this.mActivity, paramc.hqi));
            GMTrace.o(8518396542976L, 63467);
            return;
            if (parambiz.uUc.ueV == 9)
            {
              if (parambiz.uUc.ueW.size() <= 0) {
                break label1812;
              }
              paramc.qet.setTag(new r(parambiz, (String)localObject1));
              paramc.qet.setOnClickListener(paramav.pYU.qjO);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambiz.uUc.ueV == 10)
            {
              if (parambiz.uUc.ueW.size() <= 0) {
                break label1812;
              }
              paramc.qet.setTag(new r(parambiz, (String)localObject1));
              paramc.qet.setOnClickListener(paramav.pYU.qjQ);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambiz.uUc.ueV == 17)
            {
              if (parambiz.uUc.ueW.size() <= 0) {
                break label1812;
              }
              paramc.qet.setTag(new r(parambiz, (String)localObject1));
              paramc.qet.setOnClickListener(paramav.pYU.qjR);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambiz.uUc.ueV == 22)
            {
              if (parambiz.uUc.ueW.size() <= 0) {
                break label1812;
              }
              paramc.qet.setTag(new r(parambiz, (String)localObject1));
              paramc.qet.setOnClickListener(paramav.pYU.qjS);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambiz.uUc.ueV == 23)
            {
              if (parambiz.uUc.ueW.size() <= 0) {
                break label1812;
              }
              paramc.qet.setTag(new r(parambiz, (String)localObject1));
              paramc.qet.setOnClickListener(paramav.pYU.qjT);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambiz.uUc.ueV == 14)
            {
              if (parambiz.uUc.ueW.size() <= 0) {
                break label1812;
              }
              paramc.qet.setTag(new r(parambiz, (String)localObject1));
              paramc.qet.setOnClickListener(paramav.pYU.qjP);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambiz.uUc.ueV == 12)
            {
              if (parambiz.uUc.ueW.size() <= 0) {
                break label1812;
              }
              paramc.qet.setTag(new r(parambiz, (String)localObject1));
              paramc.qet.setOnClickListener(paramav.pYU.qjX);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambiz.uUc.ueV == 13)
            {
              if (parambiz.uUc.ueW.size() > 0)
              {
                paramc.qet.setTag(new r(parambiz, (String)localObject1));
                paramc.qet.setOnClickListener(paramav.pYU.qjY);
                i = 0;
                paramInt1 = 0;
                break;
              }
              paramc.qet.setOnClickListener(null);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambiz.uUc.ueV == 15)
            {
              if (parambiz.uUc.ueW.size() <= 0) {
                break label1812;
              }
              paramc.qet.setTag(new r(parambiz, (String)localObject1));
              paramc.qet.setOnClickListener(paramav.pxE.qmT);
              i = 0;
              paramInt1 = 0;
              break;
            }
            if (parambiz.uUc.ueV == 26)
            {
              paramc.qet.setTag(new r(parambiz, (String)localObject1));
              paramc.qet.setOnClickListener(paramav.pYU.qjZ);
              i = 0;
              paramInt1 = 0;
              break;
            }
            paramc.qet.setTag(new r(parambiz, (String)localObject1));
            paramc.qet.setOnClickListener(paramav.pYU.qeg);
            if ((parambiz.giA & 0x1) <= 0) {
              break label1812;
            }
            i = 1;
            paramInt1 = 0;
            break;
            paramav.juL.c(paramc.qet, paramav.pxE.qmK, paramav.pxE.qmv);
            break label109;
            if ((al.a.bjD() & 0x1) <= 0)
            {
              j = 1;
              break label125;
            }
            j = 0;
            break label125;
            paramay = "";
            break label142;
            if (parambiz.uUc.ueV == 5)
            {
              paramav = ((anu)localObject1).eBt;
              paramc.pOP.setImageResource(i.e.bbo);
              paramc.pOP.setVisibility(0);
              localObject2 = ae.bja();
              localTagImageView = paramc.qli;
              paramInt1 = i.i.cJo;
              j = this.mActivity.hashCode();
              localan = an.bTm();
              localan.time = parambiz.nFd;
              ((g)localObject2).b((anu)localObject1, localTagImageView, paramInt1, j, localan);
              break label392;
            }
            if (parambiz.uUc.ueV == 18)
            {
              paramc.pOP.setVisibility(0);
              paramc.pOP.setImageResource(i.e.bbo);
              paramc.qli.setVisibility(0);
              localObject2 = ae.bja();
              localTagImageView = paramc.qli;
              paramInt1 = i.i.cJo;
              j = this.mActivity.hashCode();
              localan = an.bTm();
              localan.time = parambiz.nFd;
              ((g)localObject2).b((anu)localObject1, localTagImageView, paramInt1, j, localan);
              break label392;
            }
            localObject2 = ae.bja();
            localTagImageView = paramc.qli;
            paramInt1 = this.mActivity.hashCode();
            localan = an.bTm();
            localan.time = parambiz.nFd;
            ((g)localObject2).b((anu)localObject1, localTagImageView, paramInt1, localan);
            break label392;
            if (parambiz.uUc.ueV == 18)
            {
              paramc.pOP.setVisibility(0);
              paramc.pOP.setImageResource(i.e.bbo);
              paramc.qli.setVisibility(0);
              ae.bja().b(paramc.qli, -1, i.i.cJo, this.mActivity.hashCode());
              break label392;
            }
            if (parambiz.uUc.ueV == 26)
            {
              paramc.qli.setVisibility(0);
              ae.bja().b(paramc.qli, -1, i.i.phj, this.mActivity.hashCode());
              break label392;
            }
            paramc.qli.setVisibility(0);
            ae.bja().b(paramc.qli, -1, i.i.cJr, this.mActivity.hashCode());
            break label392;
            paramc.qlj.setVisibility(8);
            break label443;
            if (paramc.qlk != 1) {
              paramc.hqi.setMaxLines(1);
            }
          }
          paramc.hqi.setText(paramav);
          GMTrace.o(8518396542976L, 63467);
          return;
          if (paramInt2 == 1)
          {
            paramc.hqi.setText(av.Jp(parambiz.uUc.lPM));
            paramc.hqi.setVisibility(0);
            GMTrace.o(8518396542976L, 63467);
            return;
          }
          paramc.hqi.setVisibility(8);
          GMTrace.o(8518396542976L, 63467);
          return;
        }
      }
      label1812:
      i = 0;
      paramInt1 = 0;
    }
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8518262325248L, 63466);
    if ((paramc.qlf != null) && (paramc.qlf.getParent() != null))
    {
      paramc.qlf.setLayoutResource(i.g.pfT);
      if (!paramc.qlQ) {
        paramc.qlR = paramc.qlf.inflate();
      }
    }
    for (paramc.qlQ = true;; paramc.qlQ = true)
    {
      paramc.qet = paramc.qlR;
      paramc.qli = ((TagImageView)paramc.qet.findViewById(i.f.paQ));
      paramc.pOP = ((ImageView)paramc.qet.findViewById(i.f.state));
      paramc.qlj = ((TextView)paramc.qet.findViewById(i.f.pbK));
      paramc.hqi = ((TextView)paramc.qet.findViewById(i.f.pep));
      paramc.hqi.setTextColor(this.mActivity.getResources().getColor(i.c.black));
      i.b(paramc.qli, this.mActivity);
      GMTrace.o(8518262325248L, 63466);
      return;
      paramc.qlR = paramc.lFh.findViewById(i.f.pbt);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */