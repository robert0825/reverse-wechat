package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.protocal.c.bmp;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
  extends a
{
  private final String TAG;
  protected TextView ikm;
  private boolean jJI;
  protected TextView jLL;
  protected TextView jLM;
  protected Button jLN;
  protected LinearLayout jLO;
  protected TextView jLP;
  protected ImageView jLQ;
  protected View jLR;
  protected ImageView jLS;
  
  public b(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4888075436032L, 36419);
    this.TAG = "MicroMsg.CardWidgetCommon";
    this.jJI = false;
    GMTrace.o(4888075436032L, 36419);
  }
  
  private void ang()
  {
    GMTrace.i(4888478089216L, 36422);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.jLO.getLayoutParams();
    if (this.jwZ.aja())
    {
      this.jLJ.setVisibility(0);
      this.jLQ.setVisibility(8);
      localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aRd);
    }
    for (;;)
    {
      this.jLO.setLayoutParams(localLayoutParams);
      GMTrace.o(4888478089216L, 36422);
      return;
      if ((this.jwZ.ajb()) && (this.jJI))
      {
        this.jLJ.setVisibility(8);
        this.jLQ.setVisibility(8);
        localLayoutParams.topMargin = 0;
      }
      else if (this.jwZ.ajb())
      {
        this.jLJ.setVisibility(0);
        this.jLQ.setVisibility(8);
        localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aRd);
      }
    }
  }
  
  private void anh()
  {
    GMTrace.i(4888746524672L, 36424);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.jLN.getLayoutParams();
    if ((this.jwZ.ajw().tZn != null) && (!TextUtils.isEmpty(this.jwZ.ajw().tZn.jxJ))) {
      localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aQE);
    }
    for (;;)
    {
      this.jLN.setLayoutParams(localLayoutParams);
      GMTrace.o(4888746524672L, 36424);
      return;
      if ((this.jwZ.ajw().tZo != null) && (!TextUtils.isEmpty(this.jwZ.ajw().tZo.jxI))) {
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aQE);
      } else if ((this.jwZ.ajv().tZI != null) && (this.jwZ.ajv().tZI.size() > 0)) {
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aQE);
      } else {
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aQr);
      }
    }
  }
  
  protected final void ane()
  {
    GMTrace.i(4888209653760L, 36420);
    this.ikm = ((TextView)this.jLI.findViewById(R.h.blL));
    this.jLL = ((TextView)this.jLI.findViewById(R.h.blF));
    this.jLM = ((TextView)this.jLI.findViewById(R.h.bjg));
    this.jLN = ((Button)this.jLI.findViewById(R.h.bjG));
    this.jLO = ((LinearLayout)this.jLI.findViewById(R.h.coD));
    this.jLQ = ((ImageView)this.jLO.findViewById(R.h.bex));
    this.jLR = this.jLI.findViewById(R.h.bjm);
    this.jLS = ((ImageView)this.jLI.findViewById(R.h.bjB));
    this.jLP = ((TextView)this.jLI.findViewById(R.h.bkZ));
    GMTrace.o(4888209653760L, 36420);
  }
  
  protected final void anf()
  {
    GMTrace.i(4888343871488L, 36421);
    np localnp1;
    Object localObject1;
    if ((this.jwZ.ajv().tZI != null) && (this.jwZ.ajv().tZI.size() > 0))
    {
      localnp1 = (np)this.jwZ.ajv().tZI.get(0);
      if (!bg.nm(localnp1.title)) {
        this.ikm.setText(localnp1.title);
      }
      if (!bg.nm(localnp1.jxI))
      {
        this.jLL.setText(localnp1.jxI);
        this.jLL.setVisibility(0);
        localObject1 = (LinearLayout.LayoutParams)this.jLL.getLayoutParams();
        if (bg.nm(localnp1.jxJ)) {
          break label249;
        }
        this.jLM.setText(localnp1.jxJ);
        this.jLM.setVisibility(0);
        ((LinearLayout.LayoutParams)localObject1).bottomMargin = 0;
        label156:
        this.jLL.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.jLL.invalidate();
      }
    }
    else
    {
      if ((this.jLN != null) && (this.jLS != null)) {
        break label278;
      }
      w.e("MicroMsg.CardWidgetCommon", "consumeBtn == null || mCardCodeImg == null");
    }
    for (;;)
    {
      ang();
      this.jLO.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.g.aVf));
      anh();
      this.jLI.invalidate();
      GMTrace.o(4888343871488L, 36421);
      return;
      this.jLL.setVisibility(8);
      break;
      label249:
      this.jLM.setVisibility(8);
      ((LinearLayout.LayoutParams)localObject1).bottomMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aQr);
      break label156;
      label278:
      if (this.jwZ.ajw() == null)
      {
        w.e("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo() == null");
        this.jLN.setVisibility(8);
        this.jLS.setVisibility(8);
      }
      else
      {
        if (this.jwZ.ajw().tZn != null)
        {
          w.i("MicroMsg.CardWidgetCommon", "operate_field.title is " + this.jwZ.ajw().tZn.title);
          w.d("MicroMsg.CardWidgetCommon", "operate_field.url is " + this.jwZ.ajw().tZn.url);
          w.i("MicroMsg.CardWidgetCommon", "operate_field.aux_title is " + this.jwZ.ajw().tZn.jxJ);
        }
        localnp1 = this.jwZ.ajw().tZo;
        if (localnp1 != null)
        {
          w.i("MicroMsg.CardWidgetCommon", "limit_field.title is " + localnp1.title);
          w.i("MicroMsg.CardWidgetCommon", "limit_field.show_flag is " + localnp1.uaJ);
          w.i("MicroMsg.CardWidgetCommon", "limit_field.aux_title is " + localnp1.jxJ);
        }
        Object localObject2 = this.jwZ.ajv().uab;
        localObject1 = (LinearLayout)this.jLO.findViewById(R.h.bjP);
        if ((localObject2 != null) && (!bg.cc(((bmp)localObject2).uWB)))
        {
          ((LinearLayout)localObject1).setVisibility(0);
          ((LinearLayout)localObject1).removeAllViews();
          localObject2 = ((bmp)localObject2).uWB.iterator();
        }
        while (((Iterator)localObject2).hasNext())
        {
          np localnp2 = (np)((Iterator)localObject2).next();
          View localView = LayoutInflater.from(this.mContext).inflate(R.i.cqR, null);
          TextView localTextView1 = (TextView)localView.findViewById(R.h.bjS);
          TextView localTextView2 = (TextView)localView.findViewById(R.h.bjO);
          localTextView1.setText(localnp2.title);
          localTextView2.setText(localnp2.jxI);
          ((LinearLayout)localObject1).addView(localView);
          continue;
          ((LinearLayout)localObject1).setVisibility(8);
        }
        if ((localnp1 != null) && (!TextUtils.isEmpty(localnp1.title)) && (localnp1.uaJ != 0L) && (this.jwZ.ajr()))
        {
          this.jLN.setClickable(false);
          this.jLN.setVisibility(0);
          this.jLN.setTextColor(this.mContext.getResources().getColor(R.e.aPs));
          this.jLN.setText(localnp1.title);
          if ((localnp1 != null) && (!TextUtils.isEmpty(localnp1.jxI)))
          {
            this.jLP.setText(localnp1.jxI);
            this.jLP.setVisibility(0);
          }
          for (;;)
          {
            this.jLS.setVisibility(8);
            if ((localnp1.uaJ & 0x2) <= 0L) {
              break label895;
            }
            this.jLN.setBackgroundDrawable(l.v(this.mContext, l.aL(this.jwZ.ajv().gjg, 150)));
            this.jLP.setTextColor(l.uD(this.jwZ.ajv().gjg));
            break;
            this.jLP.setVisibility(8);
          }
          label895:
          if ((localnp1.uaJ & 0x4) > 0L)
          {
            this.jLN.setBackgroundDrawable(l.v(this.mContext, this.mContext.getResources().getColor(R.e.aOj)));
            this.jLP.setTextColor(this.mContext.getResources().getColor(R.e.aOB));
          }
          else
          {
            this.jLN.setBackgroundDrawable(l.v(this.mContext, l.uD(this.jwZ.ajv().gjg)));
            this.jLP.setTextColor(this.mContext.getResources().getColor(R.e.aOB));
          }
        }
        else if ((this.jwZ.ajw().tZn != null) && (!TextUtils.isEmpty(this.jwZ.ajw().tZn.title)) && (!TextUtils.isEmpty(this.jwZ.ajw().tZn.url)) && (this.jwZ.ajr()))
        {
          this.jLN.setClickable(true);
          this.jLN.setVisibility(0);
          this.jLN.setBackgroundDrawable(l.v(this.mContext, l.uD(this.jwZ.ajv().gjg)));
          this.jLN.setTextColor(this.mContext.getResources().getColorStateList(R.e.aPs));
          this.jLN.setText(this.jwZ.ajw().tZn.title);
          if ((this.jwZ.ajw().tZn != null) && (!TextUtils.isEmpty(this.jwZ.ajw().tZn.jxJ)))
          {
            this.jLP.setTextColor(this.mContext.getResources().getColor(R.e.aOB));
            this.jLP.setText(this.jwZ.ajw().tZn.jxJ);
            this.jLP.setVisibility(0);
          }
          for (;;)
          {
            if (TextUtils.isEmpty(this.jwZ.ajw().code)) {
              break label1293;
            }
            this.jLS.setVisibility(0);
            break;
            this.jLP.setVisibility(8);
          }
          label1293:
          this.jLS.setVisibility(8);
        }
        else if ((!TextUtils.isEmpty(this.jwZ.ajw().code)) && (this.jwZ.ajr()))
        {
          w.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().code is valid");
          this.jLS.setVisibility(8);
          this.jLP.setVisibility(8);
          this.jLN.setClickable(true);
          this.jLN.setVisibility(0);
          this.jLN.setBackgroundDrawable(l.v(this.mContext, l.uD(this.jwZ.ajv().gjg)));
          this.jLN.setTextColor(this.mContext.getResources().getColorStateList(R.e.aPs));
          this.jLN.setText(R.l.ddY);
        }
        else if (!this.jwZ.ajr())
        {
          w.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().status is " + this.jwZ.ajw().status);
          this.jLS.setVisibility(8);
          this.jLP.setVisibility(8);
          this.jLN.setClickable(true);
          this.jLN.setVisibility(0);
          this.jLN.setTextColor(this.mContext.getResources().getColor(R.e.aNR));
          this.jLN.setBackgroundDrawable(l.v(this.mContext, this.mContext.getResources().getColor(R.e.aNc)));
          if (!TextUtils.isEmpty(this.jwZ.ajv().uag)) {
            this.jLN.setText(this.jwZ.ajv().uag);
          } else {
            m.b(this.jLN, this.jwZ.ajw().status);
          }
        }
        else
        {
          w.i("MicroMsg.CardWidgetCommon", "operate_field and code is empty!");
          this.jLN.setVisibility(8);
          this.jLP.setVisibility(8);
          this.jLS.setVisibility(8);
        }
      }
    }
  }
  
  public final void ani()
  {
    GMTrace.i(4889149177856L, 36427);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.jLO.getLayoutParams();
    if (this.jwZ.ajb())
    {
      this.jLJ.setVisibility(0);
      localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aRd);
    }
    this.jLO.setLayoutParams(localLayoutParams);
    this.jLO.invalidate();
    GMTrace.o(4889149177856L, 36427);
  }
  
  public final void dB(boolean paramBoolean)
  {
    GMTrace.i(4889283395584L, 36428);
    this.jJI = paramBoolean;
    if (paramBoolean)
    {
      this.jLR.setVisibility(0);
      GMTrace.o(4889283395584L, 36428);
      return;
    }
    this.jLR.setVisibility(8);
    GMTrace.o(4889283395584L, 36428);
  }
  
  public final void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4889014960128L, 36426);
    if (this.jLN != null)
    {
      np localnp = this.jwZ.ajw().tZo;
      if ((localnp != null) && (!TextUtils.isEmpty(localnp.title)) && (localnp.uaJ != 0L) && (this.jwZ.ajr()))
      {
        this.jLN.setClickable(false);
        this.jLN.setVisibility(0);
        this.jLS.setVisibility(8);
        GMTrace.o(4889014960128L, 36426);
        return;
      }
      if ((this.jwZ.ajw().tZn != null) && (!TextUtils.isEmpty(this.jwZ.ajw().tZn.title)) && (!TextUtils.isEmpty(this.jwZ.ajw().tZn.url)) && (this.jwZ.ajr()))
      {
        this.jLN.setVisibility(0);
        this.jLN.setEnabled(true);
        if ((!TextUtils.isEmpty(this.jwZ.ajw().code)) && (this.jwZ.ajw().tZf != 0))
        {
          this.jLS.setVisibility(0);
          GMTrace.o(4889014960128L, 36426);
          return;
        }
        this.jLS.setVisibility(8);
        GMTrace.o(4889014960128L, 36426);
        return;
      }
      if ((paramBoolean1) && (!TextUtils.isEmpty(this.jwZ.ajw().code)) && (this.jwZ.ajr()))
      {
        this.jLN.setVisibility(0);
        this.jLN.setEnabled(paramBoolean2);
        this.jLS.setVisibility(8);
        GMTrace.o(4889014960128L, 36426);
        return;
      }
      if ((paramBoolean1) && (!this.jwZ.ajr()))
      {
        this.jLN.setVisibility(0);
        this.jLN.setEnabled(false);
        this.jLS.setVisibility(8);
        GMTrace.o(4889014960128L, 36426);
        return;
      }
      this.jLN.setVisibility(8);
      this.jLS.setVisibility(8);
    }
    GMTrace.o(4889014960128L, 36426);
  }
  
  public final void lY(int paramInt)
  {
    GMTrace.i(4888612306944L, 36423);
    this.jLO.setBackgroundResource(paramInt);
    this.jLQ.setVisibility(8);
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramInt == 0)
    {
      localLayoutParams = (RelativeLayout.LayoutParams)this.jLO.getLayoutParams();
      if (this.jwZ.aja())
      {
        this.jLJ.setVisibility(8);
        localLayoutParams.topMargin = 0;
        this.jLQ.setVisibility(0);
        int i = this.mContext.getResources().getDimensionPixelSize(R.f.aQZ);
        m.a(this.jLQ, this.jwZ.ajv().jxH, i, R.g.aYg, false);
        this.jLO.setLayoutParams(localLayoutParams);
        this.jLO.invalidate();
        label128:
        anh();
        localLayoutParams = (RelativeLayout.LayoutParams)this.jLR.getLayoutParams();
        if (paramInt != 0) {
          break label232;
        }
        localLayoutParams.leftMargin = 0;
      }
    }
    for (localLayoutParams.rightMargin = 0;; localLayoutParams.rightMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aPC))
    {
      this.jLR.setLayoutParams(localLayoutParams);
      this.jLR.invalidate();
      this.jLI.invalidate();
      GMTrace.o(4888612306944L, 36423);
      return;
      if ((!this.jwZ.ajb()) || (!this.jJI)) {
        break;
      }
      this.jLJ.setVisibility(8);
      localLayoutParams.topMargin = 0;
      break;
      ang();
      break label128;
      label232:
      localLayoutParams.leftMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aPC);
    }
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(4888880742400L, 36425);
    super.setOnClickListener(paramOnClickListener);
    if (this.jLN != null) {
      this.jLN.setOnClickListener(paramOnClickListener);
    }
    if (this.jLS != null) {
      this.jLS.setOnClickListener(paramOnClickListener);
    }
    GMTrace.o(4888880742400L, 36425);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */