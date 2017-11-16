package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a;
import com.tencent.mm.ao.a.a.c;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.plugin.order.a.b;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;

public final class d
  extends Preference
{
  String kEt;
  String mName;
  View.OnClickListener mOnClickListener;
  private View mView;
  
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6642435358720L, 49490);
    this.mView = null;
    setLayoutResource(a.g.sNr);
    GMTrace.o(6642435358720L, 49490);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6642569576448L, 49491);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6642569576448L, 49491);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6642703794176L, 49492);
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(a.f.sBd);
    TextView localTextView = (TextView)paramView.findViewById(a.f.sBe);
    localImageView.setImageBitmap(null);
    if (!bg.nm(this.kEt))
    {
      Object localObject = new c.a();
      b.aWE();
      ((c.a)localObject).gKF = b.aLR();
      ((c.a)localObject).gKC = true;
      ((c.a)localObject).gKY = true;
      ((c.a)localObject).gKZ = true;
      localObject = ((c.a)localObject).Jn();
      n.Jd().a(this.kEt, localImageView, (c)localObject);
    }
    localTextView.setText(this.mName);
    paramView.findViewById(a.f.sBc).setOnClickListener(this.mOnClickListener);
    GMTrace.o(6642703794176L, 49492);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\ui\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */