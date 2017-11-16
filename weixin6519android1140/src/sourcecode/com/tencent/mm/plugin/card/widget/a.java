package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class a
  implements g
{
  protected LayoutInflater CJ;
  private final String TAG;
  protected View.OnClickListener hwh;
  protected View jLI;
  protected ImageView jLJ;
  protected TextView jLK;
  protected b jwZ;
  protected Context mContext;
  
  public a(Context paramContext)
  {
    GMTrace.i(4884317339648L, 36391);
    this.TAG = "MicroMsg.CardWidgetCouponBase";
    this.mContext = paramContext;
    GMTrace.o(4884317339648L, 36391);
  }
  
  private void anc()
  {
    GMTrace.i(4884719992832L, 36394);
    if ((this.jwZ == null) || (this.jwZ.ajv() == null))
    {
      w.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
      GMTrace.o(4884719992832L, 36394);
      return;
    }
    int i;
    if (!bg.nm(this.jwZ.ajv().jxH))
    {
      i = this.mContext.getResources().getDimensionPixelSize(R.f.aRg);
      if ((!this.jwZ.aja()) || (!this.jwZ.ajd())) {
        break label191;
      }
      i = this.mContext.getResources().getDimensionPixelSize(R.f.aRe);
    }
    for (;;)
    {
      if (i > 0) {
        m.a(this.jLJ, this.jwZ.ajv().jxH, i, R.g.aYg, true);
      }
      if (!bg.nm(this.jwZ.ajv().jyT)) {
        this.jLK.setText(this.jwZ.ajv().jyT);
      }
      anf();
      GMTrace.o(4884719992832L, 36394);
      return;
      label191:
      if ((this.jwZ.aja()) && (this.jwZ.ajc())) {
        i = this.mContext.getResources().getDimensionPixelSize(R.f.aRt);
      } else if ((this.jwZ.aja()) && (this.jwZ.aje())) {
        i = this.mContext.getResources().getDimensionPixelSize(R.f.aRz);
      } else if (this.jwZ.ajg()) {
        i = 0;
      }
    }
  }
  
  public void a(ShapeDrawable paramShapeDrawable)
  {
    GMTrace.i(4885793734656L, 36402);
    GMTrace.o(4885793734656L, 36402);
  }
  
  public final View anb()
  {
    GMTrace.i(4884585775104L, 36393);
    if ((this.jwZ == null) || (this.jwZ.ajv() == null))
    {
      w.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
      GMTrace.o(4884585775104L, 36393);
      return null;
    }
    this.CJ = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    Object localObject = this.CJ;
    int i;
    if (!this.jwZ.ajd()) {
      if (this.jwZ.aje()) {
        i = R.i.crG;
      }
    }
    for (;;)
    {
      this.jLI = ((LayoutInflater)localObject).inflate(i, null);
      this.jLJ = ((ImageView)this.jLI.findViewById(R.h.bep));
      this.jLK = ((TextView)this.jLI.findViewById(R.h.app_name));
      ane();
      anc();
      localObject = this.jLI;
      GMTrace.o(4884585775104L, 36393);
      return (View)localObject;
      if (this.jwZ.ajc()) {
        i = R.i.crm;
      } else if (this.jwZ.ajf()) {
        i = R.i.cqT;
      } else if (this.jwZ.ajg()) {
        i = R.i.cre;
      } else {
        i = R.i.cqQ;
      }
    }
  }
  
  protected final View and()
  {
    GMTrace.i(4884854210560L, 36395);
    View localView = this.jLI;
    GMTrace.o(4884854210560L, 36395);
    return localView;
  }
  
  protected abstract void ane();
  
  protected abstract void anf();
  
  public void dA(boolean paramBoolean)
  {
    GMTrace.i(4885256863744L, 36398);
    GMTrace.o(4885256863744L, 36398);
  }
  
  public void dB(boolean paramBoolean)
  {
    GMTrace.i(4885927952384L, 36403);
    GMTrace.o(4885927952384L, 36403);
  }
  
  public final void f(b paramb)
  {
    GMTrace.i(4885659516928L, 36401);
    this.jwZ = paramb;
    anc();
    GMTrace.o(4885659516928L, 36401);
  }
  
  public final void k(b paramb)
  {
    GMTrace.i(4884451557376L, 36392);
    this.jwZ = paramb;
    GMTrace.o(4884451557376L, 36392);
  }
  
  public void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4886062170112L, 36404);
    GMTrace.o(4886062170112L, 36404);
  }
  
  public void lY(int paramInt)
  {
    GMTrace.i(4885122646016L, 36397);
    GMTrace.o(4885122646016L, 36397);
  }
  
  public final void release()
  {
    GMTrace.i(4884988428288L, 36396);
    this.hwh = null;
    this.mContext = null;
    GMTrace.o(4884988428288L, 36396);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(4886196387840L, 36405);
    this.hwh = paramOnClickListener;
    GMTrace.o(4886196387840L, 36405);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */