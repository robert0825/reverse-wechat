package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.b.h;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.tools.h.a;
import com.tencent.mm.ui.widget.i;
import java.lang.ref.WeakReference;

public abstract class b<Input extends EditText,  extends y>
  extends i
  implements x
{
  public z iKU;
  final String iKV;
  public final WeakReference<AppBrandPageView> iKW;
  public final View.OnFocusChangeListener iKX;
  private final c.a iKY;
  
  b(String paramString, AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(10096931241984L, 75228);
    this.iKX = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(10101494644736L, 75262);
        b.this.cK(paramAnonymousBoolean);
        if (paramAnonymousBoolean)
        {
          m.a((AppBrandPageView)b.this.iKW.get(), (y)b.this.ace());
          ((y)b.this.ace()).sU(b.this.acd());
          m.a(b.this.acd(), b.this);
        }
        GMTrace.o(10101494644736L, 75262);
      }
    };
    this.iKY = new n.a()
    {
      public final void ack()
      {
        GMTrace.i(10048344424448L, 74866);
        if (b.this.ace() != null) {
          b.this.b(b.this.ace().getEditableText());
        }
        GMTrace.o(10048344424448L, 74866);
      }
    };
    this.iKV = paramString;
    this.iKW = new WeakReference(paramAppBrandPageView);
    GMTrace.o(10096931241984L, 75228);
  }
  
  final void a(Editable paramEditable)
  {
    GMTrace.i(18283273125888L, 136221);
    z localz;
    if (this.iKU != null)
    {
      localz = this.iKU;
      if (paramEditable != null) {
        break label50;
      }
    }
    label50:
    for (String str = "";; str = paramEditable.toString())
    {
      localz.a(str, Selection.getSelectionEnd(paramEditable), z.a.iNO);
      GMTrace.o(18283273125888L, 136221);
      return;
    }
  }
  
  public final boolean a(h paramh)
  {
    GMTrace.i(17284156358656L, 128777);
    paramh = b(paramh);
    if (paramh == null)
    {
      GMTrace.o(17284156358656L, 128777);
      return false;
    }
    if (paramh.iQx == null) {
      paramh.iQx = Integer.valueOf(140);
    }
    while (ace() == null)
    {
      GMTrace.o(17284156358656L, 128777);
      return false;
      if (paramh.iQx.intValue() <= 0) {
        paramh.iQx = Integer.valueOf(Integer.MAX_VALUE);
      }
    }
    paramh = n.a(ace()).Ea(paramh.iQx.intValue());
    paramh.xkl = false;
    paramh.iMz = h.a.xht;
    paramh.a(this.iKY);
    GMTrace.o(17284156358656L, 128777);
    return true;
  }
  
  public abstract String acd();
  
  public abstract Input ace();
  
  public abstract Rect acf();
  
  public final boolean acg()
  {
    GMTrace.i(17637954289664L, 131413);
    boolean bool = aci();
    GMTrace.o(17637954289664L, 131413);
    return bool;
  }
  
  public final Input ach()
  {
    GMTrace.i(18283138908160L, 136220);
    EditText localEditText = ace();
    GMTrace.o(18283138908160L, 136220);
    return localEditText;
  }
  
  public final boolean aci()
  {
    GMTrace.i(17638222725120L, 131415);
    EditText localEditText = ace();
    if (localEditText == null)
    {
      GMTrace.o(17638222725120L, 131415);
      return false;
    }
    ((y)localEditText).b(this.iKX);
    localEditText.removeTextChangedListener(this);
    ((y)localEditText).destroy();
    Object localObject = (AppBrandPageView)this.iKW.get();
    if (localObject == null)
    {
      GMTrace.o(17638222725120L, 131415);
      return false;
    }
    localObject = ((AppBrandPageView)localObject).ivi;
    if (localObject == null)
    {
      GMTrace.o(17638222725120L, 131415);
      return false;
    }
    ((e)localObject).bP(localEditText);
    GMTrace.o(17638222725120L, 131415);
    return true;
  }
  
  public final Editable acj()
  {
    GMTrace.i(18283675779072L, 136224);
    if (ace() == null)
    {
      GMTrace.o(18283675779072L, 136224);
      return null;
    }
    Editable localEditable = ace().getEditableText();
    GMTrace.o(18283675779072L, 136224);
    return localEditable;
  }
  
  public final void afterTextChanged(Editable paramEditable)
  {
    GMTrace.i(10097736548352L, 75234);
    b(paramEditable);
    GMTrace.o(10097736548352L, 75234);
  }
  
  protected abstract h b(h paramh);
  
  public final void b(Editable paramEditable)
  {
    GMTrace.i(18283407343616L, 136222);
    z localz;
    if (this.iKU != null)
    {
      localz = this.iKU;
      if (paramEditable != null) {
        break label50;
      }
    }
    label50:
    for (String str = "";; str = paramEditable.toString())
    {
      localz.a(str, Selection.getSelectionEnd(paramEditable), z.a.iNQ);
      GMTrace.o(18283407343616L, 136222);
      return;
    }
  }
  
  public final void b(String paramString, Integer paramInteger)
  {
    GMTrace.i(19869189799936L, 148037);
    sP(paramString);
    if (paramInteger == null) {}
    for (int i = -1;; i = paramInteger.intValue())
    {
      jX(i);
      GMTrace.o(19869189799936L, 148037);
      return;
    }
  }
  
  protected abstract boolean cK(boolean paramBoolean);
  
  public final boolean g(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(17638356942848L, 131416);
    if ((paramAppBrandPageView != null) && (paramAppBrandPageView == this.iKW.get()))
    {
      GMTrace.o(17638356942848L, 131416);
      return true;
    }
    GMTrace.o(17638356942848L, 131416);
    return false;
  }
  
  public abstract boolean jW(int paramInt);
  
  protected final void jX(int paramInt)
  {
    GMTrace.i(19869324017664L, 148038);
    if (paramInt <= -2)
    {
      GMTrace.o(19869324017664L, 148038);
      return;
    }
    if (ace() == null)
    {
      GMTrace.o(19869324017664L, 148038);
      return;
    }
    int i = paramInt;
    if (-1 == paramInt) {
      i = ace().getEditableText().length();
    }
    ace().setSelection(i);
    GMTrace.o(19869324017664L, 148038);
  }
  
  public abstract boolean sP(String paramString);
  
  public static enum a
  {
    static
    {
      GMTrace.i(10093307363328L, 75201);
      iLa = new a[0];
      GMTrace.o(10093307363328L, 75201);
    }
    
    public static b a(String paramString, AppBrandPageView paramAppBrandPageView)
    {
      GMTrace.i(10093173145600L, 75200);
      if (("digit".equalsIgnoreCase(paramString)) || ("idcard".equalsIgnoreCase(paramString)) || ("number".equalsIgnoreCase(paramString)))
      {
        paramString = new c(paramString, paramAppBrandPageView);
        GMTrace.o(10093173145600L, 75200);
        return paramString;
      }
      GMTrace.o(10093173145600L, 75200);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */