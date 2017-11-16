package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public final class c
  extends Preference
{
  Bitmap gsp;
  View.OnClickListener mOnClickListener;
  private View mView;
  private TextView nCc;
  private ImageView nGF;
  String nGG;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6648206721024L, 49533);
    this.mView = null;
    this.nGG = "";
    this.gsp = null;
    setLayoutResource(a.g.sNq);
    GMTrace.o(6648206721024L, 49533);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6648340938752L, 49534);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6648340938752L, 49534);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6648475156480L, 49535);
    super.onBindView(paramView);
    this.nCc = ((TextView)paramView.findViewById(a.f.sBb));
    this.nGF = ((ImageView)paramView.findViewById(a.f.sBa));
    this.nCc.setText(this.nGG);
    this.nGF.setImageBitmap(this.gsp);
    this.nGF.setOnClickListener(this.mOnClickListener);
    if ((this.nGG != null) && (this.nGG.length() > 48)) {
      this.nCc.setTextSize(0, a.V(this.mContext, a.d.aQo));
    }
    GMTrace.o(6648475156480L, 49535);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */