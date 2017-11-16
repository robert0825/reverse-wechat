package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.sharecard.model.r;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.e.d;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;

public final class x
  extends i
{
  MMActivity iPC;
  private boolean jKJ;
  private View jKK;
  private View jKL;
  private ImageView jKM;
  private TextView jKN;
  private TextView jKO;
  private ImageView jKP;
  public View jKQ;
  private LinearLayout jKR;
  private View.OnClickListener jKS;
  
  public x()
  {
    GMTrace.i(4991154651136L, 37187);
    this.jKJ = false;
    this.jKS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4999207714816L, 37247);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        Object localObject = x.this.jKl.alv();
        x.this.jKl.alx();
        paramAnonymousView = (r)paramAnonymousView.getTag();
        if (paramAnonymousView == null)
        {
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        if ((paramAnonymousView.jBt == null) || (paramAnonymousView.jBt.isEmpty()))
        {
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        if ((paramAnonymousView.jBs != null) && (paramAnonymousView.jBs.equals(((com.tencent.mm.plugin.card.base.b)localObject).ajB())))
        {
          x.this.jKQ.setVisibility(8);
          x.this.jKl.akN();
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        if ((TextUtils.isEmpty(paramAnonymousView.jBs)) && (TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject).ajB())))
        {
          x.this.jKQ.setVisibility(8);
          x.this.jKl.akN();
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        localObject = com.tencent.mm.plugin.card.sharecard.a.b.ud(paramAnonymousView.jxF);
        int k;
        if ((localObject != null) && (((ArrayList)localObject).size() > 0))
        {
          int j = 0;
          int i = 0;
          k = i;
          if (j < ((ArrayList)localObject).size())
          {
            r localr = (r)((ArrayList)localObject).get(j);
            if (((localr.jBs != null) && (localr.jBs.equals(paramAnonymousView.jBs))) || ((TextUtils.isEmpty(localr.jBs)) && (TextUtils.isEmpty(paramAnonymousView.jBs))))
            {
              localr.jBu = true;
              if (!localr.jBv)
              {
                localr.jBv = true;
                i = 1;
              }
              ((ArrayList)localObject).set(j, localr);
            }
            for (;;)
            {
              j += 1;
              break;
              localr.jBu = false;
              ((ArrayList)localObject).set(j, localr);
            }
          }
        }
        else
        {
          k = 0;
        }
        paramAnonymousView = (String)paramAnonymousView.jBt.get(0);
        paramAnonymousView = al.akv().uk(paramAnonymousView);
        if (paramAnonymousView != null) {
          x.this.jKl.d(paramAnonymousView);
        }
        if ((k != 0) && (x.this.jKl.alB() != null)) {
          x.this.jKl.alB().alo();
        }
        x.this.jKQ.setVisibility(8);
        GMTrace.o(4999207714816L, 37247);
      }
    };
    GMTrace.o(4991154651136L, 37187);
  }
  
  public final void MP()
  {
    GMTrace.i(4991288868864L, 37188);
    this.jKK = findViewById(R.h.ceA);
    this.jKL = findViewById(R.h.ceB);
    this.jKM = ((ImageView)findViewById(R.h.ceu));
    this.jKN = ((TextView)findViewById(R.h.cev));
    this.jKO = ((TextView)findViewById(R.h.cex));
    this.jKP = ((ImageView)findViewById(R.h.cew));
    this.jKK.setVisibility(8);
    this.jKQ = findViewById(R.h.cey);
    this.jKR = ((LinearLayout)findViewById(R.h.cez));
    this.jKQ.setVisibility(8);
    this.iPC = this.jKl.aly();
    GMTrace.o(4991288868864L, 37188);
  }
  
  public final void amM()
  {
    GMTrace.i(4991557304320L, 37190);
    this.jKK.setVisibility(8);
    GMTrace.o(4991557304320L, 37190);
  }
  
  public final void update()
  {
    GMTrace.i(4991423086592L, 37189);
    Object localObject4 = this.jKl.alv();
    Object localObject3 = com.tencent.mm.plugin.card.sharecard.a.b.ud(((com.tencent.mm.plugin.card.base.b)localObject4).ajA());
    Object localObject1 = this.jKl.alA();
    Object localObject2;
    Object localObject5;
    Object localObject6;
    label357:
    label445:
    label542:
    int i;
    if (((g)localObject1).amv())
    {
      this.jKK.setVisibility(0);
      if (com.tencent.mm.plugin.card.sharecard.a.b.uc(((com.tencent.mm.plugin.card.base.b)localObject4).ajA()) > 1) {
        this.jKL.setOnClickListener(this.jKl.alz());
      }
      for (;;)
      {
        localObject4 = this.jKl.alv();
        if (!this.jKl.alw()) {
          break;
        }
        this.jKM.setVisibility(8);
        this.jKN.setVisibility(8);
        this.jKO.setVisibility(0);
        this.jKP.setImageResource(R.g.aUY);
        this.jKO.setText(this.iPC.getString(R.l.ddI));
        if (!this.jKl.alw()) {
          break label895;
        }
        this.jKQ.setVisibility(0);
        if ((this.jKR.getChildCount() != 0) || (localObject3 == null)) {
          break label765;
        }
        localObject1 = (LayoutInflater)this.iPC.getSystemService("layout_inflater");
        localObject2 = ((ArrayList)localObject3).iterator();
        for (;;)
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label744;
          }
          localObject3 = (r)((Iterator)localObject2).next();
          localObject4 = ((LayoutInflater)localObject1).inflate(R.i.cGy, this.jKR, false);
          Object localObject7 = (ImageView)((View)localObject4).findViewById(R.h.cjC);
          localObject5 = (TextView)((View)localObject4).findViewById(R.h.cjH);
          localObject6 = (TextView)((View)localObject4).findViewById(R.h.cen);
          if (!TextUtils.isEmpty(((r)localObject3).jBs))
          {
            a.b.a((ImageView)localObject7, ((r)localObject3).jBs);
            localObject7 = l.uG(((r)localObject3).jBs);
            if (TextUtils.isEmpty((CharSequence)localObject7)) {
              break;
            }
            ((TextView)localObject5).setText(h.g(this.iPC, (CharSequence)localObject7, this.iPC.getResources().getDimensionPixelOffset(R.f.aQR)));
          }
          ((TextView)localObject6).setText("x " + ((r)localObject3).cen);
          ((View)localObject4).setTag(localObject3);
          ((View)localObject4).setOnClickListener(this.jKS);
          localObject5 = (ImageView)((View)localObject4).findViewById(R.h.cjE);
          localObject6 = (ImageView)((View)localObject4).findViewById(R.h.cjD);
          if (!((r)localObject3).jBu) {
            break label727;
          }
          ((ImageView)localObject5).setVisibility(0);
          ((ImageView)localObject6).setVisibility(0);
          this.jKR.addView((View)localObject4);
        }
        this.jKP.setVisibility(8);
        this.jKQ.setVisibility(8);
        this.jKR.removeAllViews();
        this.jKl.alx();
      }
      this.jKM.setVisibility(0);
      this.jKN.setVisibility(0);
      this.jKO.setVisibility(8);
      if (com.tencent.mm.plugin.card.sharecard.a.b.uc(((com.tencent.mm.plugin.card.base.b)localObject4).ajA()) <= 1)
      {
        this.jKP.setVisibility(8);
        if ((localObject3 == null) || (((ArrayList)localObject3).size() <= 0)) {
          break label1087;
        }
        i = 0;
        label557:
        if (i >= ((ArrayList)localObject3).size()) {
          break label1087;
        }
        localObject1 = (r)((ArrayList)localObject3).get(i);
        if (!((r)localObject1).jBu) {
          break label709;
        }
      }
    }
    label709:
    label727:
    label744:
    label765:
    label895:
    label1082:
    label1087:
    for (localObject1 = ((r)localObject1).jBs;; localObject1 = "")
    {
      localObject2 = localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject2 = localObject1;
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject4).ajB())) {
          localObject2 = ((com.tencent.mm.plugin.card.base.b)localObject4).ajB();
        }
      }
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        break;
      }
      a.b.a(this.jKM, (String)localObject2);
      localObject1 = this.iPC.getString(R.l.ddM, new Object[] { l.uG((String)localObject2) });
      this.jKN.setText(h.g(this.iPC, (CharSequence)localObject1, this.iPC.getResources().getDimensionPixelOffset(R.f.aQF)));
      break;
      this.jKP.setVisibility(0);
      this.jKP.setImageResource(R.g.aUX);
      break label542;
      i += 1;
      break label557;
      ((TextView)localObject5).setText("");
      break label357;
      ((ImageView)localObject5).setVisibility(8);
      ((ImageView)localObject6).setVisibility(8);
      break label445;
      this.jKR.invalidate();
      this.jKJ = true;
      GMTrace.o(4991423086592L, 37189);
      return;
      i = 0;
      if (i < this.jKR.getChildCount())
      {
        localObject2 = this.jKR.getChildAt(i);
        if ((localObject3 == null) || (((ArrayList)localObject3).size() < this.jKR.getChildCount())) {
          break label1082;
        }
      }
      for (localObject1 = (r)((ArrayList)localObject3).get(i);; localObject1 = null)
      {
        localObject4 = (ImageView)((View)localObject2).findViewById(R.h.cjE);
        localObject2 = (ImageView)((View)localObject2).findViewById(R.h.cjD);
        if ((localObject1 != null) && (((r)localObject1).jBu))
        {
          ((ImageView)localObject4).setVisibility(0);
          ((ImageView)localObject2).setVisibility(0);
        }
        for (;;)
        {
          i += 1;
          break;
          ((ImageView)localObject4).setVisibility(8);
          ((ImageView)localObject2).setVisibility(8);
        }
        this.jKR.invalidate();
        break;
        this.jKQ.setVisibility(8);
        this.jKR.removeAllViews();
        break;
        if (!((g)localObject1).amv())
        {
          this.jKK.setVisibility(0);
          this.jKM.setVisibility(0);
          this.jKN.setVisibility(0);
          this.jKO.setVisibility(8);
          this.jKP.setVisibility(8);
          localObject2 = "";
          localObject1 = localObject2;
          if (TextUtils.isEmpty(""))
          {
            localObject1 = localObject2;
            if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject4).ajB())) {
              localObject1 = ((com.tencent.mm.plugin.card.base.b)localObject4).ajB();
            }
          }
          if (!TextUtils.isEmpty((CharSequence)localObject1))
          {
            a.b.a(this.jKM, (String)localObject1);
            localObject1 = this.iPC.getString(R.l.ddM, new Object[] { l.uG((String)localObject1) });
            this.jKN.setText(h.g(this.iPC, (CharSequence)localObject1, this.iPC.getResources().getDimensionPixelOffset(R.f.aQF)));
          }
          this.jKJ = true;
        }
        GMTrace.o(4991423086592L, 37189);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */