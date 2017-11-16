package com.tencent.mm.plugin.sns.ui.a;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.ui.AsyncTextView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ap;
import com.tencent.mm.plugin.sns.ui.ar;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.List;

public final class b
  extends a
{
  private int pYX;
  
  public b()
  {
    GMTrace.i(8524302123008L, 63511);
    this.pYX = 103;
    GMTrace.o(8524302123008L, 63511);
  }
  
  public final void a(a.c paramc, int paramInt1, ay paramay, biz parambiz, int paramInt2, av paramav)
  {
    GMTrace.i(8524570558464L, 63513);
    Object localObject = paramay.pSl;
    if (paramc.qme != null)
    {
      if ((!paramay.qhI) || (paramc.pmB.uRe == null) || (paramc.pmB.uRe.uRG <= 0)) {
        break label254;
      }
      paramc.qme.setBackgroundResource(i.e.oXF);
    }
    int i;
    boolean bool;
    for (;;)
    {
      TagImageView localTagImageView = paramc.qlx.vk(0);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localTagImageView);
      ap localap = new ap();
      localap.eHy = ((String)localObject);
      localap.index = 0;
      localap.qaR = localArrayList;
      localap.pYh = this.pYh;
      if (localTagImageView != null) {
        localTagImageView.setTag(localap);
      }
      localObject = paramay.qii;
      paramc.pMp = ((anv)localObject);
      if (localObject == null) {
        break label482;
      }
      if (!q.zE().equals(parambiz.jhi)) {
        break;
      }
      paramc.qlx.setVisibility(0);
      paramav = paramav.pYM;
      paramc = paramc.qlx;
      paramay = paramay.pSl;
      i = this.mActivity.hashCode();
      bool = this.pYh;
      localObject = an.bTm();
      ((an)localObject).time = parambiz.nFd;
      paramav.a(paramc, parambiz, paramay, i, paramInt2, paramInt1, bool, (an)localObject, true);
      GMTrace.o(8524570558464L, 63513);
      return;
      label254:
      paramc.qme.setBackgroundResource(i.e.oXE);
    }
    if (paramay.qhL)
    {
      paramc.qlx.setVisibility(0);
      paramav = paramav.pYM;
      paramc = paramc.qlx;
      paramay = paramay.pSl;
      i = this.mActivity.hashCode();
      bool = this.pYh;
      localObject = an.bTm();
      ((an)localObject).time = parambiz.nFd;
      paramav.a(paramc, parambiz, paramay, i, paramInt2, paramInt1, bool, (an)localObject, false);
      GMTrace.o(8524570558464L, 63513);
      return;
    }
    if (((anv)localObject).eYn == 0)
    {
      paramc.qlx.setVisibility(0);
      paramav = paramav.pYM;
      paramc = paramc.qlx;
      paramay = paramay.pSl;
      i = this.mActivity.hashCode();
      bool = this.pYh;
      localObject = an.bTm();
      ((an)localObject).time = parambiz.nFd;
      paramav.a(paramc, parambiz, paramay, i, paramInt2, paramInt1, bool, (an)localObject, true);
      GMTrace.o(8524570558464L, 63513);
      return;
    }
    w.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo.hbStatus is " + ((anv)localObject).eYn);
    GMTrace.o(8524570558464L, 63513);
    return;
    label482:
    w.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo is null " + paramay.pSl);
    GMTrace.o(8524570558464L, 63513);
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8524436340736L, 63512);
    paramc.qlq.setImageResource(i.e.oXO);
    paramc.qkX.setTextColor(-2730427);
    if (paramc.qlf != null)
    {
      paramc.qlf.setLayoutResource(i.g.pfJ);
      if (!paramc.qlg) {
        paramc.qlx = ((PhotosContent)paramc.qlf.inflate());
      }
    }
    for (paramc.qlg = true;; paramc.qlg = true)
    {
      w.i("MiroMsg.HBRewardTimeLineItem", "viewtype " + this.jHw);
      TagImageView localTagImageView = (TagImageView)paramc.qlx.findViewById(ar.qcT[0]);
      paramc.qlx.a(localTagImageView);
      localTagImageView.setOnClickListener(this.pyk.pxE.pTd);
      GMTrace.o(8524436340736L, 63512);
      return;
      paramc.qlx = ((PhotosContent)paramc.lFh.findViewById(i.f.paN));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */