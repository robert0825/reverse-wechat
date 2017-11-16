package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.input.b.c;
import com.tencent.mm.plugin.appbrand.widget.input.b.g;
import com.tencent.mm.plugin.appbrand.widget.input.b.h;
import com.tencent.mm.sdk.platformtools.bg;

 enum a
{
  static
  {
    GMTrace.i(10070624567296L, 75032);
    iKT = new a[0];
    GMTrace.o(10070624567296L, 75032);
  }
  
  static <Input extends EditText,  extends y> void a(Input paramInput, h paramh)
  {
    GMTrace.i(18287970746368L, 136256);
    if ((paramInput == null) || (paramh == null))
    {
      GMTrace.o(18287970746368L, 136256);
      return;
    }
    if ((paramh.iQu != null) && (paramh.iQu.intValue() != paramInput.getTextSize())) {
      paramInput.setTextSize(paramh.iQu.intValue());
    }
    if (paramh.iQt != null) {
      paramInput.setTextColor(paramh.iQt.intValue());
    }
    if ((paramh.iQs != null) && ((paramInput.getBackground() == null) || (!(paramInput.getBackground() instanceof ColorDrawable)) || (((ColorDrawable)paramInput.getBackground()).getColor() != paramh.iQs.intValue()))) {
      paramInput.setBackground(new ColorDrawable(paramh.iQs.intValue()));
    }
    Object localObject;
    if (!bg.nm(paramh.iQy))
    {
      localObject = new SpannableStringBuilder(paramh.iQy);
      int i = paramh.iQy.length();
      ((SpannableStringBuilder)localObject).setSpan(new StyleSpan(c.sW(paramh.iQz).style), 0, i, 18);
      if (paramh.iQB != null) {
        ((SpannableStringBuilder)localObject).setSpan(new ForegroundColorSpan(paramh.iQB.intValue()), 0, i, 18);
      }
      if (paramh.iQA != null) {
        ((SpannableStringBuilder)localObject).setSpan(new AbsoluteSizeSpan(paramh.iQA.intValue(), false), 0, i, 18);
      }
      paramInput.setHint((CharSequence)localObject);
    }
    if (paramh.iQw != null)
    {
      localObject = Typeface.create("sans-serif", c.sW(paramh.iQw).style);
      if (localObject != null) {
        paramInput.setTypeface((Typeface)localObject);
      }
    }
    g.sX(paramh.iQr).a((y)paramInput);
    if ((paramh.iQD != null) && (paramh.iQD.booleanValue())) {
      paramInput.setVisibility(8);
    }
    for (;;)
    {
      if ((paramh.iQH != null) && (paramh.iQH.booleanValue())) {
        ((y)paramInput).cT(true);
      }
      GMTrace.o(18287970746368L, 136256);
      return;
      paramInput.setVisibility(0);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */