package com.tencent.mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.lang.reflect.Method;

public enum ad
{
  static final Class iOm;
  
  static
  {
    GMTrace.i(10054250004480L, 74910);
    iOn = new ad[0];
    Object localObject = null;
    try
    {
      Class localClass = Class.forName("android.view.inputmethod.ComposingText");
      localObject = localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrand.InputUtil", "class for ComposingText e = %s", new Object[] { localClassNotFoundException });
      }
    }
    iOm = (Class)localObject;
    GMTrace.o(10054250004480L, 74910);
  }
  
  static boolean aT(Object paramObject)
  {
    GMTrace.i(19867713404928L, 148026);
    boolean bool = iOm.isInstance(paramObject);
    GMTrace.o(19867713404928L, 148026);
    return bool;
  }
  
  static InputMethodManager cb(View paramView)
  {
    GMTrace.i(18273743667200L, 136150);
    if (paramView != null)
    {
      Context localContext = paramView.getContext();
      paramView = localContext;
      if (localContext != null) {}
    }
    else
    {
      paramView = ab.getContext();
    }
    paramView = (InputMethodManager)paramView.getSystemService("input_method");
    GMTrace.o(18273743667200L, 136150);
    return paramView;
  }
  
  public static boolean d(Boolean paramBoolean)
  {
    GMTrace.i(10054115786752L, 74909);
    if ((paramBoolean != null) && (paramBoolean.booleanValue()))
    {
      GMTrace.o(10054115786752L, 74909);
      return true;
    }
    GMTrace.o(10054115786752L, 74909);
    return false;
  }
  
  static Spannable s(CharSequence paramCharSequence)
  {
    GMTrace.i(18273609449472L, 136149);
    if (paramCharSequence == null) {
      paramCharSequence = "";
    }
    for (;;)
    {
      if ((paramCharSequence instanceof Spannable))
      {
        paramCharSequence = (Spannable)paramCharSequence;
        GMTrace.o(18273609449472L, 136149);
        return paramCharSequence;
      }
      paramCharSequence = new SpannableStringBuilder(paramCharSequence);
      GMTrace.o(18273609449472L, 136149);
      return paramCharSequence;
    }
  }
  
  static boolean t(CharSequence paramCharSequence)
  {
    GMTrace.i(19867579187200L, 148025);
    if ((paramCharSequence instanceof Spanned))
    {
      paramCharSequence = (Spanned)paramCharSequence;
      paramCharSequence = paramCharSequence.getSpans(0, paramCharSequence.length(), iOm);
      if ((paramCharSequence != null) && (paramCharSequence.length > 0))
      {
        GMTrace.o(19867579187200L, 148025);
        return true;
      }
      GMTrace.o(19867579187200L, 148025);
      return false;
    }
    GMTrace.o(19867579187200L, 148025);
    return false;
  }
  
  static enum a
  {
    static
    {
      GMTrace.i(14317541916672L, 106674);
      iOo = new a[0];
      GMTrace.o(14317541916672L, 106674);
    }
    
    static void a(Activity paramActivity, View paramView)
    {
      GMTrace.i(14317273481216L, 106672);
      if (!adl())
      {
        GMTrace.o(14317273481216L, 106672);
        return;
      }
      if (paramActivity.getResources().getConfiguration().orientation == 2)
      {
        GMTrace.o(14317273481216L, 106672);
        return;
      }
      paramActivity.getWindow().setFlags(1024, 1024);
      paramActivity.getWindow().addFlags(2048);
      paramView.setPadding(0, e.dH(paramActivity), 0, 0);
      GMTrace.o(14317273481216L, 106672);
    }
    
    private static boolean adl()
    {
      GMTrace.i(14317407698944L, 106673);
      try
      {
        boolean bool = ((Boolean)Class.forName("android.os.Build").getMethod("hasSmartBar", new Class[0]).invoke(null, new Object[0])).booleanValue();
        GMTrace.o(14317407698944L, 106673);
        return bool;
      }
      catch (Exception localException)
      {
        if (Build.DEVICE.equals("mx2"))
        {
          GMTrace.o(14317407698944L, 106673);
          return true;
        }
        if ((Build.DEVICE.equals("mx")) || (Build.DEVICE.equals("m9")))
        {
          GMTrace.o(14317407698944L, 106673);
          return false;
        }
        GMTrace.o(14317407698944L, 106673);
      }
      return false;
    }
  }
  
  static enum b
  {
    static
    {
      GMTrace.i(14318481440768L, 106681);
      iOp = new b[0];
      GMTrace.o(14318481440768L, 106681);
    }
    
    static int a(EditText paramEditText, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(18844974317568L, 140406);
      if (paramEditText == null)
      {
        GMTrace.o(18844974317568L, 140406);
        return -1;
      }
      int j = paramEditText.getPaddingTop();
      Layout localLayout = paramEditText.getLayout();
      if (localLayout == null)
      {
        GMTrace.o(18844974317568L, 140406);
        return -1;
      }
      Editable localEditable = paramEditText.getEditableText();
      if (localEditable == null)
      {
        GMTrace.o(18844974317568L, 140406);
        return -1;
      }
      paramEditText = paramEditText.getPaint();
      if (paramEditText == null)
      {
        GMTrace.o(18844974317568L, 140406);
        return -1;
      }
      Rect localRect = new Rect();
      int i = 0;
      while (i < localLayout.getLineCount())
      {
        localLayout.getLineBounds(i, localRect);
        int k = localRect.height() + j;
        if (k >= paramFloat2)
        {
          int m = localLayout.getLineStart(i);
          int n = localLayout.getLineEnd(i);
          Object localObject = (RelativeSizeSpan[])localEditable.getSpans(m, n, RelativeSizeSpan.class);
          float f2 = 1.0F;
          float f1 = f2;
          if (localObject != null)
          {
            int i1 = localObject.length;
            j = 0;
            f1 = f2;
            while (j < i1)
            {
              f1 = localObject[j].getSizeChange();
              j += 1;
            }
          }
          localObject = localEditable.subSequence(m, n).toString();
          float[] arrayOfFloat = new float[((String)localObject).length()];
          paramEditText.getTextWidths((String)localObject, arrayOfFloat);
          f2 = 0.0F;
          j = 0;
          while (j < ((String)localObject).length())
          {
            f2 += arrayOfFloat[j] * f1;
            if ((f2 >= paramFloat1) || (j == ((String)localObject).length() - 1))
            {
              GMTrace.o(18844974317568L, 140406);
              return m + j;
            }
            j += 1;
          }
        }
        i += 1;
        j = k;
      }
      GMTrace.o(18844974317568L, 140406);
      return -1;
    }
    
    static void c(EditText paramEditText)
    {
      GMTrace.i(14318213005312L, 106679);
      if (paramEditText == null)
      {
        GMTrace.o(14318213005312L, 106679);
        return;
      }
      ad.cb(paramEditText).hideSoftInputFromInputMethod(paramEditText.getWindowToken(), 2);
      GMTrace.o(14318213005312L, 106679);
    }
    
    static void setNoSystemInputOnEditText(EditText paramEditText)
    {
      GMTrace.i(14318347223040L, 106680);
      if (paramEditText == null)
      {
        GMTrace.o(14318347223040L, 106680);
        return;
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramEditText.setShowSoftInputOnFocus(false);
        GMTrace.o(14318347223040L, 106680);
        return;
      }
      try
      {
        Method localMethod1 = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { Boolean.TYPE });
        localMethod1.setAccessible(true);
        localMethod1.invoke(paramEditText, new Object[] { Boolean.valueOf(false) });
        localMethod1.setAccessible(false);
        GMTrace.o(14318347223040L, 106680);
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        w.i("MicroMsg.AppBrand.InputUtil.EditTextUtil", "setNoSystemInputOnEditText, setShowSoftInputOnFocus no such method, api level = %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        try
        {
          Method localMethod2 = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
          localMethod2.setAccessible(true);
          localMethod2.invoke(paramEditText, new Object[] { Boolean.valueOf(false) });
          localMethod2.setAccessible(false);
          GMTrace.o(14318347223040L, 106680);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.AppBrand.InputUtil.EditTextUtil", "setNoSystemInputOnEditText, reflect method [setSoftInputShownOnFocus], exp = %s", new Object[] { bg.f(localException) });
          if ((paramEditText.getContext() != null) && ((paramEditText.getContext() instanceof MMActivity))) {
            ((MMActivity)paramEditText.getContext()).db(paramEditText);
          }
          GMTrace.o(14318347223040L, 106680);
          return;
        }
      }
      catch (Exception paramEditText)
      {
        w.e("MicroMsg.AppBrand.InputUtil.EditTextUtil", "setNoSystemInputOnEditText, reflect method [setShowSoftInputOnFocus], exp = %s", new Object[] { bg.f(paramEditText) });
        GMTrace.o(14318347223040L, 106680);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */