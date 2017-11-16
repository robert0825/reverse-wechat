package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.webkit.WebSettings.LayoutAlgorithm;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;
import com.tencent.xweb.n;

public class HtmlTextView2
  extends MMWebView
{
  private n nIX;
  
  public HtmlTextView2(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(ab.getContext(), paramAttributeSet);
    GMTrace.i(6022215237632L, 44869);
    this.nIX = new n()
    {
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19563441815552L, 145759);
        w.d("test", paramAnonymousString);
        GMTrace.o(19563441815552L, 145759);
        return true;
      }
    };
    MP();
    GMTrace.o(6022215237632L, 44869);
  }
  
  public HtmlTextView2(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(ab.getContext(), paramAttributeSet, paramInt);
    GMTrace.i(6022081019904L, 44868);
    this.nIX = new n()
    {
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19563441815552L, 145759);
        w.d("test", paramAnonymousString);
        GMTrace.o(19563441815552L, 145759);
        return true;
      }
    };
    MP();
    GMTrace.o(6022081019904L, 44868);
  }
  
  private void MP()
  {
    GMTrace.i(6022349455360L, 44870);
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(6026107551744L, 44898);
        if (paramAnonymousMotionEvent.getAction() == 2)
        {
          GMTrace.o(6026107551744L, 44898);
          return true;
        }
        GMTrace.o(6026107551744L, 44898);
        return false;
      }
    });
    setVerticalScrollBarEnabled(false);
    getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
    getSettings().setDefaultTextEncodingName("utf-8");
    GMTrace.o(6022349455360L, 44870);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\product\ui\HtmlTextView2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */