package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.k;

public class MallProductItemView
  extends LinearLayout
{
  private TextView izE;
  private Object mData;
  private String mTitle;
  private int mType;
  private String nGO;
  private int nJN;
  private TextView nJe;
  private ImageView nJf;
  
  public MallProductItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6005438021632L, 44744);
    GMTrace.o(6005438021632L, 44744);
  }
  
  public MallProductItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6005303803904L, 44743);
    this.nJN = 1;
    this.mType = 0;
    this.mData = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.tjl, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(a.k.tjo, 0);
    if (paramInt != 0) {
      this.mTitle = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(a.k.tjn, 0);
    if (paramInt != 0) {
      this.nGO = paramContext.getString(paramInt);
    }
    this.nJN = paramAttributeSet.getInt(a.k.tjm, 1);
    paramAttributeSet.recycle();
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.sNW, this, true);
    this.izE = ((TextView)paramContext.findViewById(a.f.chT));
    this.nJe = ((TextView)paramContext.findViewById(a.f.sHq));
    this.nJf = ((ImageView)paramContext.findViewById(a.f.svZ));
    this.izE.setText(this.mTitle);
    this.nJe.setText(this.nGO);
    this.nJe.setLines(this.nJN);
    GMTrace.o(6005303803904L, 44743);
  }
  
  public final void EI(String paramString)
  {
    GMTrace.i(6005572239360L, 44745);
    this.nGO = paramString;
    this.nJe.setText(this.nGO);
    GMTrace.o(6005572239360L, 44745);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\MallProductItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */