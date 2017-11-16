package com.tencent.mm.ui.widget.picker;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.c;

public enum b
{
  static
  {
    GMTrace.i(18774912663552L, 139884);
    xus = new b[0];
    GMTrace.o(18774912663552L, 139884);
  }
  
  public static void a(NumberPicker paramNumberPicker, Drawable paramDrawable)
  {
    GMTrace.i(18774241574912L, 139879);
    if (paramNumberPicker != null) {}
    try
    {
      new c(paramNumberPicker, "mSelectionDivider", null).set(paramDrawable);
      GMTrace.o(18774241574912L, 139879);
      return;
    }
    catch (Exception paramNumberPicker)
    {
      GMTrace.o(18774241574912L, 139879);
    }
  }
  
  public static EditText b(NumberPicker paramNumberPicker)
  {
    GMTrace.i(18774375792640L, 139880);
    if (paramNumberPicker == null)
    {
      GMTrace.o(18774375792640L, 139880);
      return null;
    }
    try
    {
      paramNumberPicker = (EditText)new c(paramNumberPicker, "mInputText", null).get();
      GMTrace.o(18774375792640L, 139880);
      return paramNumberPicker;
    }
    catch (Exception paramNumberPicker)
    {
      GMTrace.o(18774375792640L, 139880);
    }
    return null;
  }
  
  public static void c(NumberPicker paramNumberPicker)
  {
    GMTrace.i(18774510010368L, 139881);
    if (paramNumberPicker == null)
    {
      GMTrace.o(18774510010368L, 139881);
      return;
    }
    try
    {
      paramNumberPicker = (EditText)new c(paramNumberPicker, "mInputText", null).get();
      if (paramNumberPicker != null)
      {
        paramNumberPicker.setClickable(false);
        paramNumberPicker.setFocusable(false);
        paramNumberPicker.setFocusableInTouchMode(false);
      }
      GMTrace.o(18774510010368L, 139881);
      return;
    }
    catch (Exception paramNumberPicker)
    {
      GMTrace.o(18774510010368L, 139881);
    }
  }
  
  public static void d(NumberPicker paramNumberPicker)
  {
    GMTrace.i(18774644228096L, 139882);
    if (paramNumberPicker == null)
    {
      GMTrace.o(18774644228096L, 139882);
      return;
    }
    try
    {
      paramNumberPicker = (EditText)new c(paramNumberPicker, "mInputText", null).get();
      if (paramNumberPicker != null) {
        paramNumberPicker.setFilters(new InputFilter[0]);
      }
      GMTrace.o(18774644228096L, 139882);
      return;
    }
    catch (Exception paramNumberPicker)
    {
      GMTrace.o(18774644228096L, 139882);
    }
  }
  
  public static void e(NumberPicker paramNumberPicker)
  {
    GMTrace.i(18774778445824L, 139883);
    if (paramNumberPicker == null)
    {
      GMTrace.o(18774778445824L, 139883);
      return;
    }
    try
    {
      Runnable localRunnable = (Runnable)new c(paramNumberPicker, "mSetSelectionCommand", null).get();
      if (localRunnable != null) {
        paramNumberPicker.removeCallbacks(localRunnable);
      }
      GMTrace.o(18774778445824L, 139883);
      return;
    }
    catch (Exception paramNumberPicker)
    {
      GMTrace.o(18774778445824L, 139883);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\widget\picker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */