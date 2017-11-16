package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.r;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.widget.h;
import java.util.LinkedList;

public final class c
  extends a
{
  public c()
  {
    GMTrace.i(8522020421632L, 63494);
    GMTrace.o(8522020421632L, 63494);
  }
  
  public final void a(a.c paramc, int paramInt1, ay paramay, biz parambiz, int paramInt2, av paramav)
  {
    GMTrace.i(8522288857088L, 63496);
    String str = paramay.pSl;
    if (!parambiz.uUc.ueW.isEmpty())
    {
      paramc.qli.position = paramInt1;
      paramc.qet.setVisibility(0);
      paramay = (anu)parambiz.uUc.ueW.get(0);
      Object localObject1 = ae.bja();
      Object localObject2 = paramc.qli;
      paramInt1 = i.i.cJd;
      paramInt2 = this.mActivity.hashCode();
      an localan = an.bTm();
      localan.time = parambiz.nFd;
      ((g)localObject1).b(paramay, (View)localObject2, paramInt1, paramInt2, localan);
      paramc.pOP.setPressed(false);
      localObject1 = parambiz.mmR;
      if (com.tencent.mm.at.b.JQ())
      {
        localObject2 = com.tencent.mm.at.b.JS();
        if ((localObject2 != null) && (com.tencent.mm.at.b.d((apv)localObject2)) && (((String)localObject1).equals(((apv)localObject2).ucY)))
        {
          paramInt1 = 1;
          if (paramInt1 == 0) {
            break label359;
          }
          paramc.pOP.setImageResource(i.e.aYe);
          label180:
          paramc.qli.setTag(new r(parambiz, str));
          paramc.qli.setOnClickListener(paramav.pYU.qjU);
          paramc.qet.setTag(new r(parambiz, str));
          paramav.juL.c(paramc.qet, paramav.pxE.qmK, paramav.pxE.qmv);
          paramc.qet.setOnClickListener(paramav.pYU.qeg);
          parambiz = paramay.lPj;
          if (com.tencent.mm.sdk.platformtools.bg.nm(parambiz)) {
            break label372;
          }
          paramc.qlj.setVisibility(0);
          paramc.qlj.setText(parambiz);
        }
      }
      for (;;)
      {
        paramay = paramay.eBt;
        if (com.tencent.mm.sdk.platformtools.bg.nm(paramay)) {
          break label383;
        }
        paramc.hqi.setVisibility(0);
        paramay = new SpannableString(paramay);
        paramc.hqi.setText(paramay, TextView.BufferType.SPANNABLE);
        GMTrace.o(8522288857088L, 63496);
        return;
        paramInt1 = 0;
        break;
        label359:
        paramc.pOP.setImageResource(i.e.aYf);
        break label180;
        label372:
        paramc.qlj.setVisibility(4);
      }
      label383:
      paramc.hqi.setVisibility(8);
      GMTrace.o(8522288857088L, 63496);
      return;
    }
    paramc.qet.setVisibility(8);
    GMTrace.o(8522288857088L, 63496);
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8522154639360L, 63495);
    if (paramc.qlf != null)
    {
      paramc.qlf.setLayoutResource(i.g.pfT);
      paramc.qlP = ((ViewStub)paramc.lFh.findViewById(i.f.paR));
      if ((!paramc.qlQ) && (paramc.qlP != null)) {
        paramc.qlR = paramc.qlP.inflate();
      }
    }
    for (paramc.qlQ = true;; paramc.qlQ = true)
    {
      paramc.qet = paramc.qlR;
      paramc.qet.findViewById(i.f.state).setOnTouchListener(this.pyk.pSw);
      paramc.qli = ((TagImageView)paramc.qet.findViewById(i.f.paQ));
      paramc.pOP = ((ImageView)paramc.qet.findViewById(i.f.state));
      paramc.qlj = ((TextView)paramc.qet.findViewById(i.f.pbK));
      paramc.hqi = ((TextView)paramc.qet.findViewById(i.f.pep));
      paramc.hqi.setTextColor(this.mActivity.getResources().getColor(i.c.aPa));
      paramc.hqi.setMaxLines(1);
      i.b(paramc.qli, this.mActivity);
      GMTrace.o(8522154639360L, 63495);
      return;
      paramc.qlR = paramc.lFh.findViewById(i.f.pbt);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */