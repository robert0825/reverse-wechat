package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.card.b.a.a;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem;
import com.tencent.mm.plugin.card.model.CardGiftInfo.AccepterItem;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.t;
import com.tencent.mm.plugin.card.model.z;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bhb;
import com.tencent.mm.protocal.c.jv;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CardGiftReceiveUI
  extends MMActivity
  implements View.OnClickListener, com.tencent.mm.ad.e
{
  private int gjH;
  private String gjI;
  private r hsU;
  private CardGiftInfo jFE;
  private ProgressBar jFI;
  private ae jFJ;
  private ScrollView jFU;
  private LinearLayout jFV;
  private ImageView jFW;
  private TextView jFX;
  private TextView jFY;
  private ImageView jFZ;
  private TextView jGA;
  private ListView jGB;
  private RelativeLayout jGC;
  private TextView jGD;
  private TextView jGE;
  private View jGF;
  a.a jGG;
  private ImageView jGa;
  private LinearLayout jGb;
  private RelativeLayout jGc;
  private RelativeLayout jGd;
  private TextView jGe;
  private ImageView jGf;
  private TextView jGg;
  private TextView jGh;
  private TextView jGi;
  private ImageView jGj;
  private ImageView jGk;
  private View jGl;
  private TextView jGm;
  private LinearLayout jGn;
  private ListView jGo;
  private RelativeLayout jGp;
  private LinearLayout jGq;
  private ImageView jGr;
  private TextView jGs;
  private LinearLayout jGt;
  private TextView jGu;
  private RelativeLayout jGv;
  private RelativeLayout jGw;
  private ImageView jGx;
  private ImageView jGy;
  private TextView jGz;
  
  public CardGiftReceiveUI()
  {
    GMTrace.i(5022830034944L, 37423);
    this.hsU = null;
    this.jFJ = new ae(Looper.getMainLooper());
    this.jGG = new a.a()
    {
      public final void aH(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(17262010433536L, 128612);
        if (CardGiftReceiveUI.b(CardGiftReceiveUI.this) == null)
        {
          w.e("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress cardGiftInfo is null return!");
          GMTrace.o(17262010433536L, 128612);
          return;
        }
        if ((!bg.nm(paramAnonymousString)) && (!bg.nm(CardGiftReceiveUI.b(CardGiftReceiveUI.this).jyb)) && (paramAnonymousString.equals(CardGiftReceiveUI.b(CardGiftReceiveUI.this).jyb)))
        {
          w.i("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress fromUserContentVideoUrl return!");
          GMTrace.o(17262010433536L, 128612);
          return;
        }
        CardGiftReceiveUI.g(CardGiftReceiveUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17260802473984L, 128603);
            if (CardGiftReceiveUI.f(CardGiftReceiveUI.this).getVisibility() != 0) {
              CardGiftReceiveUI.f(CardGiftReceiveUI.this).setVisibility(0);
            }
            GMTrace.o(17260802473984L, 128603);
          }
        });
        GMTrace.o(17262010433536L, 128612);
      }
      
      public final void bF(final String paramAnonymousString1, final String paramAnonymousString2)
      {
        GMTrace.i(17262278868992L, 128614);
        w.i("MicroMsg.CardGiftReceiveUI", "CDN  download success! fieldId:" + paramAnonymousString1);
        if (CardGiftReceiveUI.b(CardGiftReceiveUI.this) == null)
        {
          w.e("MicroMsg.CardGiftReceiveUI", "CDN  download cardGiftInfo is null return!");
          GMTrace.o(17262278868992L, 128614);
          return;
        }
        if ((!bg.nm(paramAnonymousString1)) && (!bg.nm(CardGiftReceiveUI.b(CardGiftReceiveUI.this).jyb)) && (paramAnonymousString1.equals(CardGiftReceiveUI.b(CardGiftReceiveUI.this).jyb)))
        {
          w.i("MicroMsg.CardGiftReceiveUI", "CDN  download fromUserContentVideoUrl! return");
          GMTrace.o(17262278868992L, 128614);
          return;
        }
        CardGiftReceiveUI.g(CardGiftReceiveUI.this).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17258252337152L, 128584);
            if (CardGiftReceiveUI.f(CardGiftReceiveUI.this).getVisibility() != 8) {
              CardGiftReceiveUI.f(CardGiftReceiveUI.this).setVisibility(8);
            }
            if ((!bg.nm(paramAnonymousString1)) && (!bg.nm(CardGiftReceiveUI.b(CardGiftReceiveUI.this).jyc)) && (paramAnonymousString1.equals(CardGiftReceiveUI.b(CardGiftReceiveUI.this).jyc))) {
              CardGiftReceiveUI.h(CardGiftReceiveUI.this).setVisibility(0);
            }
            Bitmap localBitmap;
            for (;;)
            {
              localBitmap = j.nf(paramAnonymousString2);
              if (localBitmap != null) {
                break;
              }
              CardGiftReceiveUI.i(CardGiftReceiveUI.this).setImageResource(R.k.cLY);
              GMTrace.o(17258252337152L, 128584);
              return;
              CardGiftReceiveUI.h(CardGiftReceiveUI.this).setVisibility(8);
            }
            CardGiftReceiveUI.i(CardGiftReceiveUI.this).setImageBitmap(localBitmap);
            GMTrace.o(17258252337152L, 128584);
          }
        });
        GMTrace.o(17262278868992L, 128614);
      }
      
      public final void fail(String paramAnonymousString)
      {
        GMTrace.i(17262144651264L, 128613);
        w.e("MicroMsg.CardGiftReceiveUI", "CDN download pic failure! fieldId:" + paramAnonymousString);
        GMTrace.o(17262144651264L, 128613);
      }
    };
    GMTrace.o(5022830034944L, 37423);
  }
  
  private void G(LinkedList<CardGiftInfo.AcceptedCardItem> paramLinkedList)
  {
    GMTrace.i(17259460296704L, 128593);
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      CardGiftInfo.AcceptedCardItem localAcceptedCardItem = (CardGiftInfo.AcceptedCardItem)paramLinkedList.next();
      View localView = View.inflate(this, R.i.cqV, null);
      TextView localTextView1 = (TextView)localView.findViewById(R.h.ciC);
      TextView localTextView2 = (TextView)localView.findViewById(R.h.ciB);
      localTextView1.setText(localAcceptedCardItem.jyH);
      localTextView2.setText(localAcceptedCardItem.jyI + this.vKB.vKW.getString(R.l.dcH));
      this.jGn.addView(localView);
    }
    GMTrace.o(17259460296704L, 128593);
  }
  
  private void a(ImageView paramImageView)
  {
    GMTrace.i(17259191861248L, 128591);
    if (!bg.nm(this.jFE.jxY))
    {
      int i = com.tencent.mm.br.a.fromDPToPix(this, 20);
      Object localObject = new c.a();
      ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
      com.tencent.mm.ao.n.Je();
      ((c.a)localObject).gKX = null;
      ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(this.jFE.jxY);
      ((c.a)localObject).gKC = true;
      ((c.a)localObject).gKZ = true;
      ((c.a)localObject).gLa = 3.0F;
      ((c.a)localObject).gKA = true;
      ((c.a)localObject).gKJ = i;
      ((c.a)localObject).gKI = i;
      ((c.a)localObject).gKS = new ColorDrawable(l.uD("#CCCCCC"));
      localObject = ((c.a)localObject).Jn();
      com.tencent.mm.ao.n.Jd().a(this.jFE.jxY, paramImageView, (c)localObject);
      GMTrace.o(17259191861248L, 128591);
      return;
    }
    w.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is null");
    GMTrace.o(17259191861248L, 128591);
  }
  
  private void akN()
  {
    GMTrace.i(5023366905856L, 37427);
    if (this.jFE == null)
    {
      w.e("MicroMsg.CardGiftReceiveUI", "doUpdate due to cardGiftInfo is null!");
      GMTrace.o(5023366905856L, 37427);
      return;
    }
    w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descLayoutMode:%d", new Object[] { Integer.valueOf(this.jFE.jyr) });
    Object localObject;
    if ((this.jFE.jyr != 1) && (this.jFE.jyr == 2))
    {
      this.jGb.setVisibility(8);
      this.jFV.setVisibility(0);
      this.jFX.setText(this.jFE.jyp);
      this.jFY.setText(this.jFE.jyi + "     " + this.jFE.jyj + this.vKB.vKW.getString(R.l.dcH));
      if (!bg.nm(this.jFE.jyq))
      {
        this.jFW.setVisibility(0);
        localObject = new c.a();
        ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
        com.tencent.mm.ao.n.Je();
        ((c.a)localObject).gKX = null;
        ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(this.jFE.jyq);
        ((c.a)localObject).gKC = true;
        ((c.a)localObject).gKA = true;
        localObject = ((c.a)localObject).Jn();
        com.tencent.mm.ao.n.Jd().a(this.jFE.jyq, this.jFW, (c)localObject);
        if (bg.nm(this.jFE.jyt)) {
          break label796;
        }
        this.jFX.setTextColor(bg.aL(this.jFE.jyt, getResources().getColor(R.e.black)));
        label305:
        if (bg.nm(this.jFE.jyu)) {
          break label808;
        }
        this.jFY.setTextColor(bg.aL(this.jFE.jyu, getResources().getColor(R.e.black)));
        label345:
        if (bg.nm(this.jFE.jyh)) {
          break label820;
        }
        localObject = new c.a();
        ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
        com.tencent.mm.ao.n.Je();
        ((c.a)localObject).gKX = null;
        ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(this.jFE.jyh);
        ((c.a)localObject).gKZ = true;
        ((c.a)localObject).gKC = true;
        ((c.a)localObject).gKA = true;
        ((c.a)localObject).gKS = new ColorDrawable(l.uD("#CCCCCC"));
        localObject = ((c.a)localObject).Jn();
        com.tencent.mm.ao.n.Jd().a(this.jFE.jyh, this.jGa, (c)localObject);
        label451:
        if (bg.nm(this.jFE.jyg)) {
          break label832;
        }
        localObject = new c.a();
        ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
        com.tencent.mm.ao.n.Je();
        ((c.a)localObject).gKX = null;
        ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(this.jFE.jyg);
        ((c.a)localObject).gKC = true;
        ((c.a)localObject).gKA = true;
        ((c.a)localObject).gKS = new ColorDrawable(l.uD("#CCCCCC"));
        ((c.a)localObject).gKZ = true;
        ((c.a)localObject).gLa = com.tencent.mm.br.a.fromDPToPix(this, 8);
        localObject = ((c.a)localObject).Jn();
        com.tencent.mm.ao.n.Jd().a(this.jFE.jyg, this.jFZ, (c)localObject);
        label568:
        if (this.jFE.jyE != 1) {
          break label1597;
        }
        this.jGq.setVisibility(0);
        this.jGt.setVisibility(8);
        this.jGp.setVisibility(8);
        this.jGs.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, this.jFE.eRY, this.jGs.getTextSize()));
        a(this.jGr);
        label638:
        akY();
        if (this.jFE.jyC.size() <= 0) {
          break label1897;
        }
        this.jGC.setVisibility(0);
        this.jGB.setVisibility(0);
        localObject = new a();
        this.jGB.setAdapter((ListAdapter)localObject);
        b(this.jGB);
        if (!bg.nm(this.jFE.jyD))
        {
          this.jGA.setVisibility(0);
          this.jGA.setText(this.jFE.jyD);
        }
      }
    }
    for (;;)
    {
      if ((bg.nm(this.jFE.jyx)) && (bg.nm(this.jFE.jyk))) {
        break label1959;
      }
      this.jFU.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          GMTrace.i(4970619338752L, 37034);
          int i = com.tencent.mm.br.a.fromDPToPix(CardGiftReceiveUI.this.vKB.vKW, 67);
          int j = CardGiftReceiveUI.a(CardGiftReceiveUI.this).getChildAt(0).getHeight() + i;
          int k = CardGiftReceiveUI.this.getWindow().findViewById(16908290).getHeight();
          w.i("MicroMsg.CardGiftReceiveUI", "bottomHeight: %d  totalViewHeight:%d  screenHeight:%d ", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
          CardGiftReceiveUI.a(CardGiftReceiveUI.this).setFillViewport(true);
          if (j > k) {
            CardGiftReceiveUI.a(CardGiftReceiveUI.this, true);
          }
          for (;;)
          {
            CardGiftReceiveUI.a(CardGiftReceiveUI.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            GMTrace.o(4970619338752L, 37034);
            return;
            CardGiftReceiveUI.a(CardGiftReceiveUI.this, false);
          }
        }
      });
      GMTrace.o(5023366905856L, 37427);
      return;
      this.jFW.setVisibility(8);
      break;
      label796:
      w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
      break label305;
      label808:
      w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
      break label345;
      label820:
      w.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
      break label451;
      label832:
      w.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
      break label568;
      this.jFV.setVisibility(8);
      this.jGb.setVisibility(0);
      this.jGg.setText(this.jFE.jyi);
      if (this.jFE.jyE == 1)
      {
        this.jGj.setAlpha(0.5F);
        this.jGh.setVisibility(8);
        this.jGi.setVisibility(8);
        this.jGd.setVisibility(8);
        this.jGc.setVisibility(8);
        label932:
        if (bg.nm(this.jFE.jyq)) {
          break label1507;
        }
        this.jGf.setVisibility(0);
        localObject = new c.a();
        ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
        com.tencent.mm.ao.n.Je();
        ((c.a)localObject).gKX = null;
        ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(this.jFE.jyq);
        ((c.a)localObject).gKC = true;
        ((c.a)localObject).gKA = true;
        localObject = ((c.a)localObject).Jn();
        com.tencent.mm.ao.n.Jd().a(this.jFE.jyq, this.jGf, (c)localObject);
        label1024:
        if (bg.nm(this.jFE.jyp)) {
          break label1540;
        }
        this.jGe.setVisibility(0);
        this.jGe.setText(this.jFE.jyp);
        if (bg.nm(this.jFE.jyt)) {
          break label1528;
        }
        this.jGe.setTextColor(bg.aL(this.jFE.jyt, getResources().getColor(R.e.black)));
        label1099:
        if (bg.nm(this.jFE.jyu)) {
          break label1561;
        }
        this.jGg.setTextColor(bg.aL(this.jFE.jyu, getResources().getColor(R.e.black)));
        label1139:
        if (bg.nm(this.jFE.jyh)) {
          break label1573;
        }
        localObject = new c.a();
        ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
        com.tencent.mm.ao.n.Je();
        ((c.a)localObject).gKX = null;
        ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(this.jFE.jyh);
        ((c.a)localObject).gKZ = true;
        ((c.a)localObject).gKC = true;
        ((c.a)localObject).gKA = true;
        ((c.a)localObject).gKS = new ColorDrawable(l.uD("#CCCCCC"));
        localObject = ((c.a)localObject).Jn();
        com.tencent.mm.ao.n.Jd().a(this.jFE.jyh, this.jGk, (c)localObject);
      }
      for (;;)
      {
        if (bg.nm(this.jFE.jyg)) {
          break label1585;
        }
        localObject = new c.a();
        ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
        com.tencent.mm.ao.n.Je();
        ((c.a)localObject).gKX = null;
        ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(this.jFE.jyg);
        ((c.a)localObject).gKC = true;
        ((c.a)localObject).gKA = true;
        ((c.a)localObject).gKS = new ColorDrawable(l.uD("#CCCCCC"));
        ((c.a)localObject).gKZ = true;
        ((c.a)localObject).gLa = com.tencent.mm.br.a.fromDPToPix(this, 8);
        localObject = ((c.a)localObject).Jn();
        com.tencent.mm.ao.n.Jd().a(this.jFE.jyg, this.jGj, (c)localObject);
        break;
        this.jGh.setVisibility(0);
        this.jGi.setVisibility(0);
        this.jGd.setVisibility(0);
        this.jGc.setVisibility(0);
        this.jGh.setText(this.jFE.jyj);
        this.jGi.setText(R.l.dcH);
        if (bg.nm(this.jFE.jyj))
        {
          this.jGh.setVisibility(8);
          this.jGi.setVisibility(8);
        }
        if (!bg.nm(this.jFE.jyv))
        {
          this.jGh.setTextColor(bg.aL(this.jFE.jyv, getResources().getColor(R.e.black)));
          break label932;
        }
        w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardPriceTitleColor is empty");
        break label932;
        label1507:
        this.jGf.setVisibility(8);
        w.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        break label1024;
        label1528:
        w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
        break label1099;
        label1540:
        this.jGe.setVisibility(8);
        w.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        break label1099;
        label1561:
        w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
        break label1139;
        label1573:
        w.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
      }
      label1585:
      w.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
      break label568;
      label1597:
      this.jGq.setVisibility(8);
      this.jGt.setVisibility(0);
      this.jGp.setVisibility(0);
      a(this.jGy);
      this.jGz.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, this.jFE.eRY, this.jGz.getTextSize()));
      if (((!bg.nm(this.jFE.jya)) && (!"undefined".equals(this.jFE.jya))) || ((!bg.nm(this.jFE.jyb)) && (!"undefined".equals(this.jFE.jyb))))
      {
        this.jGv.setVisibility(0);
        label1721:
        if ((this.jFE == null) || (bg.nm(this.jFE.jya))) {
          break label1873;
        }
        com.tencent.mm.plugin.card.b.a.f(this.jFE.jya, this.jFE.jyd, this.jFE.jym, 2);
        label1766:
        if ((this.jFE == null) || (bg.nm(this.jFE.jyc))) {
          break label1885;
        }
        com.tencent.mm.plugin.card.b.a.f(this.jFE.jyc, this.jFE.jyf, this.jFE.jyo, 2);
      }
      for (;;)
      {
        if (bg.nm(this.jFE.jxZ)) {
          break label1895;
        }
        this.jGu.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, this.jFE.jxZ, this.jGu.getTextSize()));
        break;
        this.jGv.setVisibility(8);
        w.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is empty");
        break label1721;
        label1873:
        w.e("MicroMsg.CardGiftReceiveUI", "fromUserContentPicUrl is null");
        break label1766;
        label1885:
        w.e("MicroMsg.CardGiftReceiveUI", "fromUserContentThumbPicUrl is null");
      }
      label1895:
      break label638;
      label1897:
      this.jGC.setVisibility(0);
      this.jGB.setVisibility(0);
      this.jGA.setVisibility(0);
      if (!bg.nm(this.jFE.jyD))
      {
        this.jGA.setVisibility(0);
        this.jGA.setText(this.jFE.jyD);
      }
    }
    label1959:
    this.jFU.setFillViewport(true);
    GMTrace.o(5023366905856L, 37427);
  }
  
  private void akY()
  {
    int i = 0;
    GMTrace.i(17259326078976L, 128592);
    if (this.jFE.jyB.size() > 0)
    {
      this.jGl.setVisibility(0);
      this.jGo.setVisibility(8);
      if (this.jFE.jyB.size() <= 2)
      {
        this.jGm.setVisibility(8);
        G(this.jFE.jyB);
        GMTrace.o(17259326078976L, 128592);
        return;
      }
      Object localObject = new LinkedList();
      ((LinkedList)localObject).add(this.jFE.jyB.get(0));
      ((LinkedList)localObject).add(this.jFE.jyB.get(1));
      G((LinkedList)localObject);
      this.jGm.setVisibility(0);
      this.jGm.setOnClickListener(this);
      localObject = new LinkedList();
      while (i < this.jFE.jyB.size())
      {
        if ((i != 0) && (i != 1)) {
          ((LinkedList)localObject).add(this.jFE.jyB.get(i));
        }
        i += 1;
      }
      localObject = new c((LinkedList)localObject);
      this.jGo.setAdapter((ListAdapter)localObject);
      b(this.jGo);
      GMTrace.o(17259326078976L, 128592);
      return;
    }
    this.jGl.setVisibility(8);
    this.jGm.setVisibility(8);
    this.jGo.setVisibility(8);
    GMTrace.o(17259326078976L, 128592);
  }
  
  private static void b(ListView paramListView)
  {
    GMTrace.i(17259594514432L, 128594);
    ListAdapter localListAdapter = paramListView.getAdapter();
    if (localListAdapter == null)
    {
      GMTrace.o(17259594514432L, 128594);
      return;
    }
    int k = localListAdapter.getCount();
    int i = 0;
    int j = 0;
    while (i < k)
    {
      localObject = localListAdapter.getView(i, null, paramListView);
      ((View)localObject).measure(0, 0);
      j += ((View)localObject).getMeasuredHeight();
      i += 1;
    }
    Object localObject = paramListView.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject).height = (paramListView.getDividerHeight() * (localListAdapter.getCount() - 1) + j);
    paramListView.setLayoutParams((ViewGroup.LayoutParams)localObject);
    GMTrace.o(17259594514432L, 128594);
  }
  
  private int y(int paramInt)
  {
    GMTrace.i(17259057643520L, 128590);
    paramInt = com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, paramInt);
    GMTrace.o(17259057643520L, 128590);
    return paramInt;
  }
  
  protected final void MP()
  {
    GMTrace.i(5023501123584L, 37428);
    this.jFU = ((ScrollView)findViewById(R.h.bkl));
    this.jFV = ((LinearLayout)findViewById(R.h.blN));
    this.jFW = ((ImageView)findViewById(R.h.bJn));
    this.jFX = ((TextView)findViewById(R.h.ciU));
    this.jFY = ((TextView)findViewById(R.h.ciT));
    this.jFZ = ((ImageView)findViewById(R.h.bJl));
    this.jGa = ((ImageView)findViewById(R.h.bJm));
    this.jFZ.setOnClickListener(this);
    this.jGb = ((LinearLayout)findViewById(R.h.blM));
    this.jGc = ((RelativeLayout)findViewById(R.h.bgq));
    this.jGd = ((RelativeLayout)findViewById(R.h.bgs));
    this.jGe = ((TextView)findViewById(R.h.ciF));
    this.jGg = ((TextView)findViewById(R.h.ciS));
    this.jGf = ((ImageView)findViewById(R.h.bJk));
    this.jGh = ((TextView)findViewById(R.h.ciW));
    this.jGi = ((TextView)findViewById(R.h.ciX));
    this.jGj = ((ImageView)findViewById(R.h.bJf));
    this.jGk = ((ImageView)findViewById(R.h.bJg));
    this.jGj.setOnClickListener(this);
    this.jGl = findViewById(R.h.bkM);
    this.jGm = ((TextView)findViewById(R.h.ciV));
    this.jGn = ((LinearLayout)findViewById(R.h.bkL));
    this.jGo = ((ListView)findViewById(R.h.bkN));
    this.jGp = ((RelativeLayout)findViewById(R.h.bka));
    this.jGq = ((LinearLayout)findViewById(R.h.bFr));
    this.jGr = ((ImageView)findViewById(R.h.bJi));
    this.jGs = ((TextView)findViewById(R.h.ciL));
    this.jGt = ((LinearLayout)findViewById(R.h.bFq));
    this.jGy = ((ImageView)findViewById(R.h.bJh));
    this.jGz = ((TextView)findViewById(R.h.ciK));
    this.jGu = ((TextView)findViewById(R.h.ciJ));
    this.jGv = ((RelativeLayout)findViewById(R.h.bky));
    this.jGw = ((RelativeLayout)findViewById(R.h.bHi));
    this.jGx = ((ImageView)findViewById(R.h.ciM));
    this.jGv.setOnClickListener(this);
    this.jGw.setOnClickListener(this);
    this.jGA = ((TextView)findViewById(R.h.cix));
    this.jGB = ((ListView)findViewById(R.h.bcx));
    this.jGC = ((RelativeLayout)findViewById(R.h.bjZ));
    this.jFI = ((ProgressBar)findViewById(R.h.bGS));
    com.tencent.mm.plugin.card.b.m.b(this, false);
    sq("");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5022695817216L, 37422);
        CardGiftReceiveUI.this.finish();
        GMTrace.o(5022695817216L, 37422);
        return true;
      }
    });
    GMTrace.o(5023501123584L, 37428);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5023635341312L, 37429);
    if ((this.hsU != null) && (this.hsU.isShowing())) {
      this.hsU.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof z))
      {
        w.i("MicroMsg.CardGiftReceiveUI", "card gift info cgi success!");
        this.jFE = ((z)paramk).jzJ;
        akN();
        GMTrace.o(5023635341312L, 37429);
        return;
      }
      if ((paramk instanceof t))
      {
        paramString = new Intent(this, CardDetailUI.class);
        Object localObject = ((t)paramk).jzN;
        if ((localObject == null) || (((LinkedList)localObject).size() == 0))
        {
          w.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardinfo list  size is null or empty!");
          GMTrace.o(5023635341312L, 37429);
          return;
        }
        paramk = (com.tencent.mm.plugin.card.base.b)((LinkedList)localObject).get(0);
        if ((paramk == null) || (!(paramk instanceof CardInfo)))
        {
          w.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardInfo  is null!");
          GMTrace.o(5023635341312L, 37429);
          return;
        }
        ArrayList localArrayList = new ArrayList();
        localObject = ((LinkedList)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localArrayList.add((CardInfo)((Iterator)localObject).next());
        }
        paramString.putExtra("key_card_info", (CardInfo)paramk);
        paramString.putExtra("key_previous_scene", 27);
        paramString.putExtra("key_from_scene", 27);
        paramString.putExtra("key_from_appbrand_type", paramString.getIntExtra("key_from_appbrand_type", 0));
        paramString.putExtra("key_card_git_info", this.jFE);
        startActivity(paramString);
        GMTrace.o(5023635341312L, 37429);
      }
    }
    else
    {
      if ((paramk instanceof z))
      {
        w.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        d.a(this, paramString, true);
        GMTrace.o(5023635341312L, 37429);
        return;
      }
      if ((paramk instanceof t))
      {
        w.e("MicroMsg.CardGiftReceiveUI", ", NetSceneBatchGetCardItemByTpInfo onSceneEnd fail return!  errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        GMTrace.o(5023635341312L, 37429);
        return;
      }
    }
    GMTrace.o(5023635341312L, 37429);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5022964252672L, 37424);
    int i = R.i.cqZ;
    GMTrace.o(5022964252672L, 37424);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(5023769559040L, 37430);
    if (paramView.getId() == R.h.bHi)
    {
      if (!bg.nm(this.jFE.jyb))
      {
        paramView = new Intent(this, CardGiftVideoUI.class);
        paramView.putExtra("key_gift_into", this.jFE);
        paramView.putExtra("key_is_mute", false);
        startActivity(paramView);
        overridePendingTransition(0, 0);
        g.ork.i(13866, new Object[] { Integer.valueOf(3), this.gjI, o.getString(this.gjH) });
        GMTrace.o(5023769559040L, 37430);
      }
    }
    else if (paramView.getId() == R.h.bky)
    {
      if (this.jFI.getVisibility() == 0)
      {
        GMTrace.o(5023769559040L, 37430);
        return;
      }
      if (!bg.nm(this.jFE.jya))
      {
        paramView = new Intent(this, CardGiftImageUI.class);
        paramView.putExtra("key_gift_into", this.jFE);
        startActivity(paramView);
        overridePendingTransition(0, 0);
        g.ork.i(13866, new Object[] { Integer.valueOf(4), this.gjI, o.getString(this.gjH) });
        GMTrace.o(5023769559040L, 37430);
      }
    }
    else if (paramView.getId() == R.h.ciH)
    {
      if ((this.jFE != null) && (this.jFE.jyl))
      {
        g.ork.i(13866, new Object[] { Integer.valueOf(7), this.gjI, o.getString(this.gjH) });
        paramView = new Intent(this, CardHomePageUI.class);
        paramView.putExtra("key_home_page_from_scene", 2);
        startActivity(paramView);
        finish();
        overridePendingTransition(0, 0);
        GMTrace.o(5023769559040L, 37430);
      }
    }
    else if (paramView.getId() == R.h.ciI)
    {
      if ((!TextUtils.isEmpty(this.jFE.jyF)) && (!TextUtils.isEmpty(this.jFE.jyG)))
      {
        int i = getIntent().getIntExtra("key_from_appbrand_type", 0);
        com.tencent.mm.plugin.card.b.b.c(this.jFE.jyw, this.jFE.jyF, this.jFE.jyG, 1062, i);
        g.ork.i(13866, new Object[] { Integer.valueOf(8), this.gjI, o.getString(this.gjH) });
        GMTrace.o(5023769559040L, 37430);
        return;
      }
      if (!bg.nm(this.jFE.jyy))
      {
        com.tencent.mm.plugin.card.b.b.a(this, this.jFE.jyy, 0);
        g.ork.i(13866, new Object[] { Integer.valueOf(8), this.gjI, o.getString(this.gjH) });
        GMTrace.o(5023769559040L, 37430);
      }
    }
    else
    {
      if ((paramView.getId() == R.h.bJf) || (paramView.getId() == R.h.bJl))
      {
        if ((!bg.nm(this.jFE.jyz)) && (!bg.nm(this.jFE.jyA)))
        {
          paramView = new LinkedList();
          Object localObject = new jv();
          ((jv)localObject).jxF = this.jFE.jyz;
          ((jv)localObject).code = this.jFE.jyA;
          paramView.add(localObject);
          localObject = getIntent().getStringExtra("key_template_id");
          bhb localbhb = new bhb();
          localbhb.uSV = ((String)localObject);
          w.i("MicroMsg.CardGiftReceiveUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { localObject });
          paramView = new t(paramView, localbhb, 27);
          at.wS().a(paramView, 0);
          g.ork.i(13866, new Object[] { Integer.valueOf(9), this.gjI, o.getString(this.gjH) });
          GMTrace.o(5023769559040L, 37430);
          return;
        }
        w.e("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.userCardId is null");
        GMTrace.o(5023769559040L, 37430);
        return;
      }
      if (paramView.getId() == R.h.ciV)
      {
        if (this.jGo.getVisibility() == 0)
        {
          this.jGo.setVisibility(8);
          this.jGm.setText("查看全部");
          GMTrace.o(5023769559040L, 37430);
          return;
        }
        this.jGo.setVisibility(0);
        this.jGm.setText("收起");
      }
    }
    GMTrace.o(5023769559040L, 37430);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5023098470400L, 37425);
    super.onCreate(paramBundle);
    this.gjI = getIntent().getStringExtra("key_order_id");
    this.gjH = getIntent().getIntExtra("key_biz_uin", -1);
    this.jFE = ((CardGiftInfo)getIntent().getParcelableExtra("key_gift_into"));
    w.i("MicroMsg.CardGiftReceiveUI", "onCreate, orderId:%s, bizUin:%s", new Object[] { this.gjI, Integer.valueOf(this.gjH) });
    MP();
    at.wS().a(1165, this);
    at.wS().a(699, this);
    com.tencent.mm.plugin.card.b.a.a(this.jGG);
    if (this.jFE == null)
    {
      w.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo is null, sync GiftCard from serve");
      if (this.gjH == -1)
      {
        w.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, bizUin is -1, fail!");
        GMTrace.o(5023098470400L, 37425);
        return;
      }
      if (this.gjI == null) {
        w.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, orderId is null, fail");
      }
      w.e("MicroMsg.CardGiftReceiveUI", "doNetSceneGetCardGiftInfo");
      paramBundle = new z(this.gjH, this.gjI);
      at.wS().a(paramBundle, 0);
      this.hsU = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.bKJ), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(4960955662336L, 36962);
          if ((CardGiftReceiveUI.c(CardGiftReceiveUI.this) != null) && (CardGiftReceiveUI.c(CardGiftReceiveUI.this).isShowing())) {
            CardGiftReceiveUI.c(CardGiftReceiveUI.this).dismiss();
          }
          if ((CardGiftReceiveUI.d(CardGiftReceiveUI.this).getVisibility() == 8) || (CardGiftReceiveUI.e(CardGiftReceiveUI.this).getVisibility() == 4))
          {
            w.i("MicroMsg.CardGiftReceiveUI", "user cancel & finish");
            CardGiftReceiveUI.this.finish();
          }
          GMTrace.o(4960955662336L, 36962);
        }
      });
      if (this.hsU != null) {
        this.hsU.show();
      }
      GMTrace.o(5023098470400L, 37425);
      return;
    }
    akN();
    GMTrace.o(5023098470400L, 37425);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5023232688128L, 37426);
    super.onDestroy();
    at.wS().b(1165, this);
    at.wS().b(699, this);
    com.tencent.mm.plugin.card.b.a.b(this.jGG);
    GMTrace.o(5023232688128L, 37426);
  }
  
  final class a
    extends BaseAdapter
  {
    a()
    {
      GMTrace.i(17261205127168L, 128606);
      GMTrace.o(17261205127168L, 128606);
    }
    
    public final int getCount()
    {
      GMTrace.i(17261339344896L, 128607);
      int i = CardGiftReceiveUI.b(CardGiftReceiveUI.this).jyC.size();
      GMTrace.o(17261339344896L, 128607);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(17261473562624L, 128608);
      long l = paramInt;
      GMTrace.o(17261473562624L, 128608);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(17261607780352L, 128609);
      CardGiftInfo.AccepterItem localAccepterItem = (CardGiftInfo.AccepterItem)CardGiftReceiveUI.b(CardGiftReceiveUI.this).jyC.get(paramInt);
      ImageView localImageView;
      String str;
      if (paramView == null)
      {
        paramView = View.inflate(CardGiftReceiveUI.this, R.i.cqW, null);
        paramViewGroup = new CardGiftReceiveUI.b(CardGiftReceiveUI.this);
        paramViewGroup.jGJ = ((ImageView)paramView.findViewById(R.h.bHh));
        paramViewGroup.jGK = ((TextView)paramView.findViewById(R.h.ciy));
        paramViewGroup.ikm = ((TextView)paramView.findViewById(R.h.ciA));
        paramViewGroup.jGL = ((TextView)paramView.findViewById(R.h.ciz));
        paramView.setTag(paramViewGroup);
        if (localAccepterItem != null) {
          if (localAccepterItem.jyK != null)
          {
            localImageView = paramViewGroup.jGJ;
            str = localAccepterItem.jyK;
            paramInt = R.g.aYg;
            if ((localImageView != null) && (!TextUtils.isEmpty(str))) {
              break label248;
            }
          }
        }
      }
      for (;;)
      {
        paramViewGroup.jGK.setText(localAccepterItem.jyJ);
        paramViewGroup.ikm.setText(localAccepterItem.jyH);
        paramViewGroup.jGL.setText(localAccepterItem.jyI + CardGiftReceiveUI.this.vKB.vKW.getString(R.l.dcH));
        GMTrace.o(17261607780352L, 128609);
        return paramView;
        paramViewGroup = (CardGiftReceiveUI.b)paramView.getTag();
        break;
        label248:
        if (!TextUtils.isEmpty(str))
        {
          Object localObject = new c.a();
          ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
          com.tencent.mm.ao.n.Je();
          ((c.a)localObject).gKX = null;
          ((c.a)localObject).gKE = com.tencent.mm.plugin.card.model.m.tZ(str);
          ((c.a)localObject).gKC = true;
          ((c.a)localObject).gKZ = true;
          ((c.a)localObject).gLa = 3.0F;
          ((c.a)localObject).gKA = true;
          ((c.a)localObject).gKJ = 34;
          ((c.a)localObject).gKI = 34;
          ((c.a)localObject).gKR = paramInt;
          localObject = ((c.a)localObject).Jn();
          com.tencent.mm.ao.n.Jd().a(str, localImageView, (c)localObject);
        }
        else
        {
          localImageView.setImageResource(paramInt);
        }
      }
    }
  }
  
  final class b
  {
    public TextView ikm;
    public ImageView jGJ;
    public TextView jGK;
    public TextView jGL;
    
    b()
    {
      GMTrace.i(17260534038528L, 128601);
      GMTrace.o(17260534038528L, 128601);
    }
  }
  
  final class c
    extends BaseAdapter
  {
    private LinkedList<CardGiftInfo.AcceptedCardItem> jGM;
    
    c()
    {
      GMTrace.i(17257312813056L, 128577);
      LinkedList localLinkedList;
      this.jGM = localLinkedList;
      GMTrace.o(17257312813056L, 128577);
    }
    
    private CardGiftInfo.AcceptedCardItem lR(int paramInt)
    {
      GMTrace.i(17257581248512L, 128579);
      CardGiftInfo.AcceptedCardItem localAcceptedCardItem = (CardGiftInfo.AcceptedCardItem)this.jGM.get(paramInt);
      GMTrace.o(17257581248512L, 128579);
      return localAcceptedCardItem;
    }
    
    public final int getCount()
    {
      GMTrace.i(17257447030784L, 128578);
      int i = this.jGM.size();
      GMTrace.o(17257447030784L, 128578);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(17257715466240L, 128580);
      long l = paramInt;
      GMTrace.o(17257715466240L, 128580);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(17257849683968L, 128581);
      CardGiftInfo.AcceptedCardItem localAcceptedCardItem = lR(paramInt);
      View localView;
      if (paramView == null)
      {
        localView = View.inflate(CardGiftReceiveUI.this, R.i.cqV, null);
        paramView = new CardGiftReceiveUI.d(CardGiftReceiveUI.this);
        paramView.ikm = ((TextView)localView.findViewById(R.h.ciC));
        paramView.jGL = ((TextView)localView.findViewById(R.h.ciB));
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      for (;;)
      {
        paramViewGroup.ikm.setText(localAcceptedCardItem.jyH);
        paramViewGroup.jGL.setText(localAcceptedCardItem.jyI + CardGiftReceiveUI.this.vKB.vKW.getString(R.l.dcH));
        GMTrace.o(17257849683968L, 128581);
        return localView;
        paramViewGroup = (CardGiftReceiveUI.d)paramView.getTag();
        localView = paramView;
      }
    }
  }
  
  final class d
  {
    public TextView ikm;
    public TextView jGL;
    
    d()
    {
      GMTrace.i(17258386554880L, 128585);
      GMTrace.o(17258386554880L, 128585);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardGiftReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */