package com.tencent.mm.plugin.wallet.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.k;

public class WalletItemView
  extends LinearLayout
{
  private TextView izE;
  private Object mData;
  private String mTitle;
  private int mType;
  private String nGO;
  private int nJN;
  private TextView nJe;
  
  public WalletItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(7736175624192L, 57639);
    GMTrace.o(7736175624192L, 57639);
  }
  
  public WalletItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7736041406464L, 57638);
    this.nJN = 1;
    this.mType = 0;
    this.mData = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.tjT, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(a.k.tjW, 0);
    if (paramInt != 0) {
      this.mTitle = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(a.k.tjV, 0);
    if (paramInt != 0) {
      this.nGO = paramContext.getString(paramInt);
    }
    this.nJN = paramAttributeSet.getInt(a.k.tjU, 1);
    paramAttributeSet.recycle();
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.sPw, this, true);
    this.izE = ((TextView)paramContext.findViewById(a.f.chT));
    this.nJe = ((TextView)paramContext.findViewById(a.f.sHq));
    if (this.izE != null) {
      this.izE.setText(this.mTitle);
    }
    if (this.nJe != null)
    {
      this.nJe.setText(this.nGO);
      this.nJe.setLines(this.nJN);
    }
    GMTrace.o(7736041406464L, 57638);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\wallet\ui\WalletItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */