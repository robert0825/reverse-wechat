package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class SwitchPhoneItemView
  extends RelativeLayout
{
  private TextView rqx;
  private TextView rqy;
  ImageView rqz;
  
  public SwitchPhoneItemView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6964692123648L, 51891);
    cm(paramContext);
    GMTrace.o(6964692123648L, 51891);
  }
  
  public SwitchPhoneItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6964826341376L, 51892);
    cm(paramContext);
    GMTrace.o(6964826341376L, 51892);
  }
  
  public SwitchPhoneItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6964960559104L, 51893);
    cm(paramContext);
    GMTrace.o(6964960559104L, 51893);
  }
  
  private void cm(Context paramContext)
  {
    GMTrace.i(6965094776832L, 51894);
    paramContext = inflate(paramContext, a.g.sQk, this);
    this.rqx = ((TextView)paramContext.findViewById(a.f.sEq));
    this.rqy = ((TextView)paramContext.findViewById(a.f.sEn));
    this.rqz = ((ImageView)paramContext.findViewById(a.f.sEm));
    GMTrace.o(6965094776832L, 51894);
  }
  
  public final void a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    GMTrace.i(6965228994560L, 51895);
    if (!bg.L(paramCharSequence1))
    {
      CharSequence localCharSequence = paramCharSequence1;
      if (paramCharSequence1.toString().startsWith("86"))
      {
        w.i("SwitchPhoneItemView", "cut 86 prefix");
        localCharSequence = paramCharSequence1.subSequence(2, paramCharSequence1.length());
      }
      this.rqx.setText(localCharSequence);
    }
    while (!bg.L(paramCharSequence2))
    {
      this.rqy.setMaxLines(2);
      this.rqy.setSelected(true);
      this.rqy.setEllipsize(TextUtils.TruncateAt.MIDDLE);
      this.rqy.setText(paramCharSequence2);
      this.rqy.setMovementMethod(LinkMovementMethod.getInstance());
      GMTrace.o(6965228994560L, 51895);
      return;
      this.rqx.setVisibility(8);
    }
    this.rqy.setVisibility(8);
    GMTrace.o(6965228994560L, 51895);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\view\SwitchPhoneItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */