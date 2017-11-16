package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class LuckyMoneyAutoScrollView
  extends RelativeLayout
  implements LuckyMoneyAutoScrollItem.b
{
  private View hqF;
  private Context mContext;
  private RelativeLayout mMH;
  private RelativeLayout mMI;
  private RelativeLayout mMJ;
  LuckyMoneyAutoScrollItem mMK;
  LuckyMoneyAutoScrollItem mML;
  LuckyMoneyAutoScrollItem mMM;
  ImageView mMN;
  ImageView mMO;
  ImageView mMP;
  private String mMQ;
  private String mMR;
  private String mMS;
  boolean mMT;
  private a mMU;
  
  public LuckyMoneyAutoScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(9854131372032L, 73419);
    GMTrace.o(9854131372032L, 73419);
  }
  
  public LuckyMoneyAutoScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9853997154304L, 73418);
    this.mMQ = "0";
    this.mMR = "0";
    this.mMS = "0";
    this.mMT = false;
    this.mContext = paramContext;
    paramContext = LayoutInflater.from(this.mContext).inflate(a.g.sMG, this);
    this.hqF = paramContext;
    this.mMK = ((LuckyMoneyAutoScrollItem)paramContext.findViewById(a.f.spM));
    this.mML = ((LuckyMoneyAutoScrollItem)paramContext.findViewById(a.f.spN));
    this.mMM = ((LuckyMoneyAutoScrollItem)paramContext.findViewById(a.f.spO));
    this.mMN = ((ImageView)paramContext.findViewById(a.f.sHy));
    this.mMO = ((ImageView)paramContext.findViewById(a.f.sHz));
    this.mMP = ((ImageView)paramContext.findViewById(a.f.sHA));
    this.mMH = ((RelativeLayout)paramContext.findViewById(a.f.swm));
    this.mMI = ((RelativeLayout)paramContext.findViewById(a.f.swn));
    this.mMJ = ((RelativeLayout)paramContext.findViewById(a.f.swo));
    GMTrace.o(9853997154304L, 73418);
  }
  
  public final void BE(String paramString)
  {
    GMTrace.i(9854265589760L, 73420);
    w.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: setting text: %s", new Object[] { paramString });
    this.mMQ = paramString.substring(0, 1);
    this.mMR = paramString.substring(2, 3);
    this.mMS = paramString.substring(3, 4);
    this.mMK.mMx = bg.getInt(this.mMQ, 0);
    this.mML.mMx = bg.getInt(this.mMR, 0);
    this.mMM.mMx = bg.getInt(this.mMS, 0);
    this.mMN.setImageResource(((Integer)LuckyMoneyAutoScrollItem.mMB.get(bg.getInt(this.mMQ, 0))).intValue());
    this.mMO.setImageResource(((Integer)LuckyMoneyAutoScrollItem.mMB.get(bg.getInt(this.mMR, 0))).intValue());
    this.mMP.setImageResource(((Integer)LuckyMoneyAutoScrollItem.mMB.get(bg.getInt(this.mMS, 0))).intValue());
    this.mMN.setVisibility(4);
    this.mMO.setVisibility(4);
    this.mMP.setVisibility(4);
    this.mMK.mMA = this;
    this.mML.mMA = this;
    this.mMM.mMA = this;
    w.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: first: %s, second :%s, third: %s", new Object[] { this.mMQ, this.mMR, this.mMS });
    GMTrace.o(9854265589760L, 73420);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(9854399807488L, 73421);
    this.mMU = parama;
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9802591764480L, 73035);
        LuckyMoneyAutoScrollView.a(LuckyMoneyAutoScrollView.this).aMx();
        LuckyMoneyAutoScrollView.b(LuckyMoneyAutoScrollView.this).aMx();
        LuckyMoneyAutoScrollView.c(LuckyMoneyAutoScrollView.this).aMx();
        GMTrace.o(9802591764480L, 73035);
      }
    });
    GMTrace.o(9854399807488L, 73421);
  }
  
  public final void aMy()
  {
    GMTrace.i(9854534025216L, 73422);
    if (!this.mMT)
    {
      this.mMT = true;
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9867553144832L, 73519);
          LuckyMoneyAutoScrollView.a(LuckyMoneyAutoScrollView.this).setVisibility(8);
          LuckyMoneyAutoScrollView.b(LuckyMoneyAutoScrollView.this).setVisibility(8);
          LuckyMoneyAutoScrollView.c(LuckyMoneyAutoScrollView.this).setVisibility(8);
          LuckyMoneyAutoScrollView.d(LuckyMoneyAutoScrollView.this).setVisibility(0);
          LuckyMoneyAutoScrollView.e(LuckyMoneyAutoScrollView.this).setVisibility(0);
          LuckyMoneyAutoScrollView.f(LuckyMoneyAutoScrollView.this).setVisibility(0);
          if (LuckyMoneyAutoScrollView.g(LuckyMoneyAutoScrollView.this) != null) {
            LuckyMoneyAutoScrollView.g(LuckyMoneyAutoScrollView.this).aMz();
          }
          GMTrace.o(9867553144832L, 73519);
        }
      });
    }
    GMTrace.o(9854534025216L, 73422);
  }
  
  public final void cr(int paramInt1, int paramInt2)
  {
    GMTrace.i(9854668242944L, 73423);
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.hqF.getLayoutParams();
      localLayoutParams.height = paramInt2;
      this.hqF.setLayoutParams(localLayoutParams);
      this.hqF.invalidate();
      localLayoutParams = (LinearLayout.LayoutParams)this.mMH.getLayoutParams();
      localLayoutParams.height = paramInt2;
      localLayoutParams.width = paramInt1;
      this.mMH.setLayoutParams(localLayoutParams);
      this.mMH.invalidate();
      localLayoutParams = (LinearLayout.LayoutParams)this.mMI.getLayoutParams();
      localLayoutParams.height = paramInt2;
      localLayoutParams.width = paramInt1;
      this.mMI.setLayoutParams(localLayoutParams);
      this.mMI.invalidate();
      localLayoutParams = (LinearLayout.LayoutParams)this.mMJ.getLayoutParams();
      localLayoutParams.height = paramInt2;
      localLayoutParams.width = paramInt1;
      localLayoutParams.leftMargin = 0;
      this.mMJ.setLayoutParams(localLayoutParams);
      this.mMJ.invalidate();
    }
    GMTrace.o(9854668242944L, 73423);
  }
  
  public static abstract interface a
  {
    public abstract void aMz();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\LuckyMoneyAutoScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */