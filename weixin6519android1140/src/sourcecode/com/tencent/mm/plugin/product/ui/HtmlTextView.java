package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.af.a;
import java.net.URL;
import org.xml.sax.XMLReader;

public class HtmlTextView
  extends TextView
{
  Html.ImageGetter nIS;
  Html.TagHandler nIT;
  
  public HtmlTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6036442316800L, 44975);
    this.nIS = new Html.ImageGetter()
    {
      public final Drawable getDrawable(String paramAnonymousString)
      {
        GMTrace.i(6003827408896L, 44732);
        try
        {
          paramAnonymousString = Drawable.createFromStream(new URL(paramAnonymousString).openStream(), "");
          if (paramAnonymousString != null) {
            paramAnonymousString.setBounds(0, 0, paramAnonymousString.getIntrinsicWidth(), paramAnonymousString.getIntrinsicHeight());
          }
          GMTrace.o(6003827408896L, 44732);
          return paramAnonymousString;
        }
        catch (Exception paramAnonymousString)
        {
          GMTrace.o(6003827408896L, 44732);
        }
        return null;
      }
    };
    this.nIT = new Html.TagHandler()
    {
      private static Object a(Editable paramAnonymousEditable, Class paramAnonymousClass)
      {
        GMTrace.i(6019530883072L, 44849);
        paramAnonymousClass = paramAnonymousEditable.getSpans(0, paramAnonymousEditable.length(), paramAnonymousClass);
        if (paramAnonymousClass.length == 0)
        {
          GMTrace.o(6019530883072L, 44849);
          return null;
        }
        int i = paramAnonymousClass.length;
        while (i > 0)
        {
          if (paramAnonymousEditable.getSpanFlags(paramAnonymousClass[(i - 1)]) == 17)
          {
            paramAnonymousEditable = paramAnonymousClass[(i - 1)];
            GMTrace.o(6019530883072L, 44849);
            return paramAnonymousEditable;
          }
          i -= 1;
        }
        GMTrace.o(6019530883072L, 44849);
        return null;
      }
      
      public final void handleTag(boolean paramAnonymousBoolean, String paramAnonymousString, Editable paramAnonymousEditable, XMLReader paramAnonymousXMLReader)
      {
        GMTrace.i(6019396665344L, 44848);
        if ((paramAnonymousString.equalsIgnoreCase("strike")) || (paramAnonymousString.equals("s")))
        {
          int i = paramAnonymousEditable.length();
          if (paramAnonymousBoolean)
          {
            paramAnonymousEditable.setSpan(new StrikethroughSpan(), i, i, 17);
            GMTrace.o(6019396665344L, 44848);
            return;
          }
          paramAnonymousString = a(paramAnonymousEditable, StrikethroughSpan.class);
          int j = paramAnonymousEditable.getSpanStart(paramAnonymousString);
          paramAnonymousEditable.removeSpan(paramAnonymousString);
          if (j != i) {
            paramAnonymousEditable.setSpan(new StrikethroughSpan(), j, i, 33);
          }
        }
        GMTrace.o(6019396665344L, 44848);
      }
    };
    GMTrace.o(6036442316800L, 44975);
  }
  
  public HtmlTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6036308099072L, 44974);
    this.nIS = new Html.ImageGetter()
    {
      public final Drawable getDrawable(String paramAnonymousString)
      {
        GMTrace.i(6003827408896L, 44732);
        try
        {
          paramAnonymousString = Drawable.createFromStream(new URL(paramAnonymousString).openStream(), "");
          if (paramAnonymousString != null) {
            paramAnonymousString.setBounds(0, 0, paramAnonymousString.getIntrinsicWidth(), paramAnonymousString.getIntrinsicHeight());
          }
          GMTrace.o(6003827408896L, 44732);
          return paramAnonymousString;
        }
        catch (Exception paramAnonymousString)
        {
          GMTrace.o(6003827408896L, 44732);
        }
        return null;
      }
    };
    this.nIT = new Html.TagHandler()
    {
      private static Object a(Editable paramAnonymousEditable, Class paramAnonymousClass)
      {
        GMTrace.i(6019530883072L, 44849);
        paramAnonymousClass = paramAnonymousEditable.getSpans(0, paramAnonymousEditable.length(), paramAnonymousClass);
        if (paramAnonymousClass.length == 0)
        {
          GMTrace.o(6019530883072L, 44849);
          return null;
        }
        int i = paramAnonymousClass.length;
        while (i > 0)
        {
          if (paramAnonymousEditable.getSpanFlags(paramAnonymousClass[(i - 1)]) == 17)
          {
            paramAnonymousEditable = paramAnonymousClass[(i - 1)];
            GMTrace.o(6019530883072L, 44849);
            return paramAnonymousEditable;
          }
          i -= 1;
        }
        GMTrace.o(6019530883072L, 44849);
        return null;
      }
      
      public final void handleTag(boolean paramAnonymousBoolean, String paramAnonymousString, Editable paramAnonymousEditable, XMLReader paramAnonymousXMLReader)
      {
        GMTrace.i(6019396665344L, 44848);
        if ((paramAnonymousString.equalsIgnoreCase("strike")) || (paramAnonymousString.equals("s")))
        {
          int i = paramAnonymousEditable.length();
          if (paramAnonymousBoolean)
          {
            paramAnonymousEditable.setSpan(new StrikethroughSpan(), i, i, 17);
            GMTrace.o(6019396665344L, 44848);
            return;
          }
          paramAnonymousString = a(paramAnonymousEditable, StrikethroughSpan.class);
          int j = paramAnonymousEditable.getSpanStart(paramAnonymousString);
          paramAnonymousEditable.removeSpan(paramAnonymousString);
          if (j != i) {
            paramAnonymousEditable.setSpan(new StrikethroughSpan(), j, i, 33);
          }
        }
        GMTrace.o(6019396665344L, 44848);
      }
    };
    GMTrace.o(6036308099072L, 44974);
  }
  
  public final void setText(final String paramString)
  {
    GMTrace.i(6036576534528L, 44976);
    h.xB().a(new af.a()
    {
      private volatile Spanned nIU;
      
      public final boolean Dj()
      {
        GMTrace.i(6003290537984L, 44728);
        this.nIU = HtmlTextView.a(HtmlTextView.this, paramString);
        GMTrace.o(6003290537984L, 44728);
        return true;
      }
      
      public final boolean Dk()
      {
        GMTrace.i(6003424755712L, 44729);
        HtmlTextView.a(HtmlTextView.this, this.nIU, TextView.BufferType.SPANNABLE);
        HtmlTextView.this.setMovementMethod(LinkMovementMethod.getInstance());
        GMTrace.o(6003424755712L, 44729);
        return true;
      }
      
      public final String toString()
      {
        GMTrace.i(6003558973440L, 44730);
        String str = super.toString() + "|setText";
        GMTrace.o(6003558973440L, 44730);
        return str;
      }
    });
    GMTrace.o(6036576534528L, 44976);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\HtmlTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */