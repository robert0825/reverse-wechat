package com.tencent.mm.plugin.sns.lucky.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI;
import com.tencent.mm.plugin.sns.ui.TouchImageView;
import com.tencent.mm.plugin.sns.ui.b.b;
import com.tencent.mm.plugin.sns.ui.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.bfd;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfw;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public class SnsDetailLuckyHeader
  extends LinearLayout
{
  private View koX;
  private TextView pqx;
  private LinearLayout pqy;
  private LinearLayout pqz;
  
  public SnsDetailLuckyHeader(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8848840589312L, 65929);
    this.koX = null;
    init();
    GMTrace.o(8848840589312L, 65929);
  }
  
  public SnsDetailLuckyHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8848974807040L, 65930);
    this.koX = null;
    init();
    GMTrace.o(8848974807040L, 65930);
  }
  
  public SnsDetailLuckyHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8848706371584L, 65928);
    this.koX = null;
    init();
    GMTrace.o(8848706371584L, 65928);
  }
  
  private void init()
  {
    GMTrace.i(8849109024768L, 65931);
    Object localObject = View.inflate(getContext(), i.g.peS, this);
    this.koX = ((View)localObject).findViewById(i.f.oZM);
    this.pqx = ((TextView)((View)localObject).findViewById(i.f.oZv));
    this.pqy = ((LinearLayout)((View)localObject).findViewById(i.f.oZw));
    BackwardSupportUtil.b.a(getContext(), 2.0F);
    localObject = new AbsListView.LayoutParams(-1, 1);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setBackgroundResource(i.e.oYs);
    localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.pqz = localLinearLayout;
    GMTrace.o(8849109024768L, 65931);
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.m paramm, b paramb)
  {
    GMTrace.i(8849377460224L, 65933);
    Object localObject2 = ai.n(paramm);
    Object localObject1 = ((bfh)localObject2).uRe;
    if ((localObject1 == null) || (((bfw)localObject1).uRH.size() == 0))
    {
      setVisibility(8);
      GMTrace.o(8849377460224L, 65933);
      return;
    }
    setVisibility(0);
    double d = com.tencent.mm.plugin.sns.lucky.a.m.b(paramm, (bfh)localObject2);
    localObject2 = getContext().getString(i.j.pjX, new Object[] { Integer.valueOf(((bfh)localObject2).uRe.uRG), bg.r(d * 1.0D / 100.0D) });
    this.pqx.setText((CharSequence)localObject2);
    this.koX.setTag(paramm);
    this.koX.setOnClickListener(paramb.qmH);
    paramm = ((bfw)localObject1).uRH;
    boolean bool = ((bfw)localObject1).uRH.isEmpty();
    int k = BackwardSupportUtil.b.a(getContext(), 32.0F);
    int m = BackwardSupportUtil.b.a(getContext(), 6.0F);
    int i = BackwardSupportUtil.b.a(getContext(), 10.0F);
    int j = BackwardSupportUtil.b.a(getContext(), 17.0F);
    int n;
    float f;
    if (this.pqy != null)
    {
      n = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getWidth();
      f = getResources().getDimension(i.d.aQE);
      w.d("MicroMsg.SnsDetailLuckyHeader", "guess size %d %f", new Object[] { Integer.valueOf(n), Float.valueOf(f) });
      f = n - f * 2.0F;
      if (paramm.size() > 0) {
        break label340;
      }
      if (this.pqy.getParent() != null) {
        this.pqy.setVisibility(8);
      }
      this.pqy.removeAllViews();
      this.pqy.setVisibility(8);
      paramm = this.pqy;
      i = 8;
    }
    for (;;)
    {
      paramm.setVisibility(i);
      GMTrace.o(8849377460224L, 65933);
      return;
      label340:
      this.pqy.getParent();
      this.pqy.removeAllViews();
      this.pqy.setVisibility(0);
      this.pqy.setPadding(0, m, 0, m);
      localObject1 = new ImageView(getContext());
      ((ImageView)localObject1).setImageResource(i.i.phg);
      ((ImageView)localObject1).setPadding(i, j, i, 0);
      localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).gravity = 49;
      ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((ImageView)localObject1).setClickable(false);
      ((ImageView)localObject1).setFocusable(false);
      this.pqy.addView((View)localObject1);
      n = a.fromDPToPix(getContext(), SnsCommentDetailUI.pYY);
      j = (int)(f - n) / (m + k);
      i = j;
      if ((int)(f - n) % (m + k) > k) {
        i = j + 1;
      }
      w.d("MicroMsg.SnsDetailLuckyHeader", "guess size %d", new Object[] { Integer.valueOf(i) });
      localObject1 = new i(getContext());
      ((i)localObject1).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      ((i)localObject1).pOW = i;
      i = 0;
      while (i < paramm.size())
      {
        localObject2 = (bfd)paramm.get(i);
        TouchImageView localTouchImageView = new TouchImageView(getContext());
        localTouchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        localTouchImageView.setImageResource(i.e.oXI);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(k, k);
        localLayoutParams.setMargins(0, m, m, 0);
        localTouchImageView.setLayoutParams(localLayoutParams);
        localTouchImageView.setTag(((bfd)localObject2).tRz);
        a.b.b(localTouchImageView, ((bfd)localObject2).tRz, true);
        localTouchImageView.setOnClickListener(paramb.qmw);
        ((i)localObject1).addView(localTouchImageView);
        i += 1;
      }
      this.pqy.addView((View)localObject1);
      paramm = this.pqz;
      if (bool) {
        i = 8;
      } else {
        i = 0;
      }
    }
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(8849243242496L, 65932);
    super.setVisibility(paramInt);
    if (this.koX != null) {
      this.koX.setVisibility(paramInt);
    }
    GMTrace.o(8849243242496L, 65932);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\lucky\view\SnsDetailLuckyHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */