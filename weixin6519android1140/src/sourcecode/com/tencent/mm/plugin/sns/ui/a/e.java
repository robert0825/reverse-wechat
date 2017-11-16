package com.tencent.mm.plugin.sns.ui.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ar;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.widget.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public final class e
  extends a
{
  private int pYW;
  private int pYX;
  public MaskImageView qmk;
  
  public e()
  {
    GMTrace.i(8523765252096L, 63507);
    this.pYX = 103;
    GMTrace.o(8523765252096L, 63507);
  }
  
  @TargetApi(16)
  public final void a(a.c paramc, int paramInt1, ay paramay, biz parambiz, int paramInt2, av paramav)
  {
    GMTrace.i(8524033687552L, 63509);
    paramc.qlx.setVisibility(0);
    boolean bool;
    label66:
    LinkedList localLinkedList;
    int i;
    final Object localObject2;
    if (parambiz.uUb == null)
    {
      localObject1 = null;
      if (!bg.nm((String)localObject1))
      {
        if (!paramav.qgM.containsKey(localObject1)) {
          break label421;
        }
        bool = ((Boolean)paramav.qgM.get(localObject1)).booleanValue();
        if (bool) {
          com.tencent.mm.plugin.sns.c.a.hnI.a(this.mActivity, (String)localObject1, parambiz.jhi, parambiz.uUg, paramay.qhs);
        }
      }
      localLinkedList = new LinkedList();
      i = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
      if ((!paramay.pOL) || (paramInt2 != 2)) {
        break label742;
      }
      localObject2 = paramay.oWL.blz();
      if ((localObject2 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDs != 1) || (paramc.qlx.vk(0) == null)) {
        break label461;
      }
      if ((parambiz.uUc == null) || (parambiz.uUc.ueW.size() <= 0)) {
        break label455;
      }
    }
    float f1;
    float f2;
    int j;
    label421:
    label455:
    for (final Object localObject1 = (anu)parambiz.uUc.ueW.get(0);; localObject1 = null)
    {
      f1 = ((anu)localObject1).uCR.uDE;
      f2 = ((anu)localObject1).uCR.uDF;
      i = i - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 28);
      j = (int)(f2 * i / f1);
      localObject1 = new anw();
      ((anw)localObject1).uDE = i;
      ((anw)localObject1).uDF = j;
      ((anw)localObject1).uDG = (((anw)localObject1).uDE * ((anw)localObject1).uDF);
      localLinkedList.add(localObject1);
      i = 0;
      while (i < ar.qcP[paramInt2])
      {
        localObject1 = (TagImageView)paramc.qlx.findViewById(ar.qcT[i]);
        paramav.juL.c((View)localObject1, paramav.pxE.qmM, paramav.pxE.qmv);
        i += 1;
      }
      localObject1 = parambiz.uUb.mmR;
      break;
      bool = com.tencent.mm.plugin.sns.c.a.hnI.bJ((String)localObject1);
      paramav.qgM.put(localObject1, Boolean.valueOf(bool));
      bool = true;
      break label66;
    }
    label461:
    if ((localObject2 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi > 0.0F) && (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj > 0.0F))
    {
      f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDk, ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDl);
      f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDk, ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDl);
      if (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDh != 0) {
        break label850;
      }
      localObject1 = new anw();
      ((anw)localObject1).uDE = f2;
      ((anw)localObject1).uDF = f1;
      if (f2 >= i - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12))
      {
        ((anw)localObject1).uDE = (i - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12));
        ((anw)localObject1).uDF = ((int)(((anw)localObject1).uDE * ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj / ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi));
      }
      ((anw)localObject1).uDG = (((anw)localObject1).uDE * ((anw)localObject1).uDF);
      localLinkedList.add(localObject1);
    }
    for (;;)
    {
      if (!bg.nm(((com.tencent.mm.plugin.sns.storage.b)localObject2).pDn))
      {
        localObject1 = paramc.qlx;
        final TagImageView localTagImageView = paramc.qlx.vk(0);
        d.a("adId", ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDn, false, 41, 0, new d.a()
        {
          public final void Ih(String paramAnonymousString)
          {
            GMTrace.i(8519604502528L, 63476);
            e.this.qmk = ((MaskImageView)localObject1.findViewById(i.f.pbu));
            if (e.this.qmk != null)
            {
              e.this.qmk.setVisibility(0);
              paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
              e.this.qmk.setImageBitmap(paramAnonymousString);
              float f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2.pDo, 1, localObject2.pDk, localObject2.pDl);
              float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2.pDp, 1, localObject2.pDk, localObject2.pDl);
              float f3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2.pDq, 1, localObject2.pDk, localObject2.pDl);
              float f4 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(localObject2.pDr, 1, localObject2.pDk, localObject2.pDl);
              paramAnonymousString = new FrameLayout.LayoutParams((int)f1, (int)f2);
              paramAnonymousString.setMargins((int)(localTagImageView.getRight() - f3 - f1), (int)(localTagImageView.getBottom() - f4 - f2), 0, 0);
              e.this.qmk.setLayoutParams(paramAnonymousString);
            }
            GMTrace.o(8519604502528L, 63476);
          }
          
          public final void bkK()
          {
            GMTrace.i(8519336067072L, 63474);
            GMTrace.o(8519336067072L, 63474);
          }
          
          public final void bkL()
          {
            GMTrace.i(8519470284800L, 63475);
            GMTrace.o(8519470284800L, 63475);
          }
        });
      }
      label742:
      paramav = paramav.pYM;
      localObject1 = paramc.qlx;
      paramay = paramay.pSl;
      i = this.mActivity.hashCode();
      bool = this.pYh;
      localObject2 = an.bTm();
      ((an)localObject2).time = parambiz.nFd;
      paramav.a((PhotosContent)localObject1, parambiz, paramay, i, paramInt2, paramInt1, bool, (an)localObject2, localLinkedList);
      paramc.qmi.setTag(paramc.qlx.vk(0));
      paramc.qmj.setTag(paramc.qlx.vk(0));
      GMTrace.o(8524033687552L, 63509);
      return;
      label850:
      if (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDh == 1)
      {
        i = i - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
        j = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj / ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi);
        localObject1 = new anw();
        if (i > 0) {
          f2 = i;
        }
        ((anw)localObject1).uDE = f2;
        if (j > 0) {
          f1 = j;
        }
        for (;;)
        {
          ((anw)localObject1).uDF = f1;
          ((anw)localObject1).uDG = (((anw)localObject1).uDE * ((anw)localObject1).uDF);
          localLinkedList.add(localObject1);
          break;
        }
      }
      if (((com.tencent.mm.plugin.sns.storage.b)localObject2).pDh == 2)
      {
        i = i - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.br.a.fromDPToPix(this.mActivity, 12);
        j = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDj / ((com.tencent.mm.plugin.sns.storage.b)localObject2).pDi);
        localObject1 = new anw();
        if (i > 0) {
          f2 = i;
        }
        ((anw)localObject1).uDE = f2;
        if (j > 0) {
          f1 = j;
        }
        ((anw)localObject1).uDF = f1;
        ((anw)localObject1).uDG = (((anw)localObject1).uDE * ((anw)localObject1).uDF);
        localLinkedList.add(localObject1);
      }
    }
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8523899469824L, 63508);
    Object localObject = new DisplayMetrics();
    this.mActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    w.i("MiroMsg.PhotoTimeLineItem", "viewtype " + this.jHw);
    this.pYW = ae.bjl();
    if (paramc.qlf != null) {
      if (this.jHw == 2)
      {
        paramc.qlf.setLayoutResource(i.g.pgx);
        if (!paramc.qlg) {
          paramc.qlx = ((PhotosContent)paramc.qlf.inflate());
        }
      }
    }
    for (paramc.qlg = true;; paramc.qlg = true)
    {
      paramc.qlx.pVg.clear();
      int i = 0;
      while (i < ar.qcP[this.jHw])
      {
        localObject = (TagImageView)paramc.qlx.findViewById(ar.qcT[i]);
        paramc.qlx.a((TagImageView)localObject);
        ((TagImageView)localObject).setOnClickListener(this.pyk.pxE.pTd);
        this.pyk.juL.c((View)localObject, this.pyk.pxE.qmJ, this.pyk.pxE.qmv);
        i += 1;
      }
      if (this.jHw == 3)
      {
        paramc.qlf.setLayoutResource(i.g.pgu);
        break;
      }
      if (this.jHw == 4)
      {
        paramc.qlf.setLayoutResource(i.g.pgv);
        break;
      }
      if (this.jHw == 5)
      {
        paramc.qlf.setLayoutResource(i.g.pgw);
        break;
      }
      w.e("MiroMsg.PhotoTimeLineItem", "error viewtyoe in photo item  " + this.jHw);
      break;
      paramc.qlx = ((PhotosContent)paramc.lFh.findViewById(i.f.pby));
    }
    paramc.qlx.vj(this.pYW);
    GMTrace.o(8523899469824L, 63508);
  }
  
  public static final class a
    extends a.c
  {
    public a()
    {
      GMTrace.i(8523631034368L, 63506);
      GMTrace.o(8523631034368L, 63506);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */