package com.tencent.mm.plugin.appbrand.widget.picker;

import android.text.Editable;
import android.text.Editable.Factory;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.c;

final class j
{
  static void a(NumberPicker paramNumberPicker)
  {
    GMTrace.i(20751402926080L, 154610);
    if (paramNumberPicker == null)
    {
      GMTrace.o(20751402926080L, 154610);
      return;
    }
    try
    {
      paramNumberPicker = (EditText)new c(paramNumberPicker, "mInputText", null).get();
      if (paramNumberPicker != null) {
        paramNumberPicker.setEditableFactory(new Editable.Factory()
        {
          public final Editable newEditable(CharSequence paramAnonymousCharSequence)
          {
            GMTrace.i(20751268708352L, 154609);
            paramAnonymousCharSequence = new SpannableStringBuilder(paramAnonymousCharSequence)
            {
              public final void setSpan(Object paramAnonymous2Object, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
              {
                GMTrace.i(20751000272896L, 154607);
                try
                {
                  super.setSpan(paramAnonymous2Object, paramAnonymous2Int1, paramAnonymous2Int2, paramAnonymous2Int3);
                  GMTrace.o(20751000272896L, 154607);
                  return;
                }
                catch (Exception paramAnonymous2Object)
                {
                  GMTrace.o(20751000272896L, 154607);
                }
              }
            };
            GMTrace.o(20751268708352L, 154609);
            return paramAnonymousCharSequence;
          }
        });
      }
      GMTrace.o(20751402926080L, 154610);
      return;
    }
    catch (Exception paramNumberPicker)
    {
      GMTrace.o(20751402926080L, 154610);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */