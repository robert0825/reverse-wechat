package com.tencent.mm.ui.g.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.k;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;
import com.tencent.xweb.n;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class f
  extends k
{
  static final float[] xbc;
  static final float[] xbd;
  static final FrameLayout.LayoutParams xbe;
  private MMWebView inX;
  private String mUrl;
  private c.a xbf;
  private ProgressDialog xbg;
  private ImageView xbh;
  private FrameLayout xbi;
  
  static
  {
    GMTrace.i(2911853608960L, 21695);
    xbc = new float[] { 20.0F, 60.0F };
    xbd = new float[] { 40.0F, 60.0F };
    xbe = new FrameLayout.LayoutParams(-1, -1);
    GMTrace.o(2911853608960L, 21695);
  }
  
  public f(Context paramContext, String paramString, c.a parama)
  {
    super(paramContext, 16973840);
    GMTrace.i(2910779867136L, 21687);
    this.mUrl = paramString;
    this.xbf = parama;
    GMTrace.o(2910779867136L, 21687);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2910914084864L, 21688);
    super.onCreate(paramBundle);
    this.xbg = new ProgressDialog(getContext());
    this.xbg.requestWindowFeature(1);
    this.xbg.setMessage(getContext().getString(a.h.kca));
    requestWindowFeature(1);
    this.xbi = new FrameLayout(getContext());
    this.xbh = new ImageView(getContext());
    this.xbh.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2908498165760L, 21670);
        f.a(f.this).onCancel();
        f.this.dismiss();
        GMTrace.o(2908498165760L, 21670);
      }
    });
    paramBundle = getContext().getResources().getDrawable(a.d.kbo);
    this.xbh.setImageDrawable(paramBundle);
    this.xbh.setVisibility(4);
    int i = this.xbh.getDrawable().getIntrinsicWidth() / 2;
    paramBundle = new LinearLayout(getContext());
    this.inX = MMWebView.a.cb(getContext());
    this.inX.setVerticalScrollBarEnabled(false);
    this.inX.setHorizontalScrollBarEnabled(false);
    this.inX.setWebViewClient(new a());
    this.inX.getSettings().setJavaScriptEnabled(true);
    this.inX.loadUrl(this.mUrl);
    this.inX.setLayoutParams(xbe);
    this.inX.setVisibility(4);
    paramBundle.setPadding(i, i, i, i);
    paramBundle.addView(this.inX);
    this.xbi.addView(paramBundle);
    this.xbi.addView(this.xbh, new ViewGroup.LayoutParams(-2, -2));
    addContentView(this.xbi, new ViewGroup.LayoutParams(-1, -1));
    GMTrace.o(2910914084864L, 21688);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2911048302592L, 21689);
    if (paramInt == 4)
    {
      this.xbf.onCancel();
      dismiss();
      GMTrace.o(2911048302592L, 21689);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2911048302592L, 21689);
    return bool;
  }
  
  private final class a
    extends n
  {
    public boolean xbk;
    
    public a()
    {
      GMTrace.i(2907155988480L, 21660);
      this.xbk = true;
      GMTrace.o(2907155988480L, 21660);
    }
    
    public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      GMTrace.i(20282580402176L, 151117);
      super.a(paramWebView, paramInt, paramString1, paramString2);
      this.xbk = false;
      f.a(f.this).a(new b(paramString1, paramInt, paramString2));
      try
      {
        f.this.dismiss();
        f.b(f.this).dismiss();
        GMTrace.o(20282580402176L, 151117);
        return;
      }
      catch (Exception paramWebView)
      {
        w.printErrStackTrace("MicroMsg.FbDialog", paramWebView, "", new Object[0]);
        GMTrace.o(20282580402176L, 151117);
      }
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(20282848837632L, 151119);
      super.a(paramWebView, paramString);
      this.xbk = false;
      try
      {
        f.b(f.this).dismiss();
        f.c(f.this).setBackgroundColor(0);
        f.d(f.this).setVisibility(0);
        f.e(f.this).setVisibility(0);
        GMTrace.o(20282848837632L, 151119);
        return;
      }
      catch (Exception paramWebView)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FbDialog", paramWebView, "", new Object[0]);
        }
      }
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(20282714619904L, 151118);
      w.d("Facebook-WebView", "Webview loading URL: " + paramString);
      super.b(paramWebView, paramString, paramBitmap);
      try
      {
        f.b(f.this).show();
        f.b(f.this).setOnDismissListener(new DialogInterface.OnDismissListener()
        {
          public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(2910377213952L, 21684);
            if ((f.a.this.xbk) && (f.this != null))
            {
              f.a(f.this).onCancel();
              f.this.dismiss();
            }
            GMTrace.o(2910377213952L, 21684);
          }
        });
        GMTrace.o(20282714619904L, 151118);
        return;
      }
      catch (Exception paramWebView)
      {
        w.printErrStackTrace("MicroMsg.FbDialog", paramWebView, "", new Object[0]);
        GMTrace.o(20282714619904L, 151118);
      }
    }
    
    public final boolean b(WebView paramWebView, String paramString)
    {
      GMTrace.i(20282446184448L, 151116);
      w.d("Facebook-WebView", "Redirect URL: " + paramString);
      if (paramString.startsWith("fbconnect://success"))
      {
        Bundle localBundle = e.WJ(paramString);
        paramString = localBundle.getString("error");
        paramWebView = paramString;
        if (paramString == null) {
          paramWebView = localBundle.getString("error_type");
        }
        if (paramWebView == null) {
          f.a(f.this).m(localBundle);
        }
        for (;;)
        {
          f.this.dismiss();
          GMTrace.o(20282446184448L, 151116);
          return true;
          if ((paramWebView.equals("access_denied")) || (paramWebView.equals("OAuthAccessDeniedException"))) {
            f.a(f.this).onCancel();
          } else {
            f.a(f.this).a(new d(paramWebView));
          }
        }
      }
      if (paramString.startsWith("fbconnect://cancel"))
      {
        f.a(f.this).onCancel();
        try
        {
          f.this.dismiss();
          GMTrace.o(20282446184448L, 151116);
          return true;
        }
        catch (Exception paramWebView)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FbDialog", paramWebView, "", new Object[0]);
          }
        }
      }
      if (paramString.contains("touch"))
      {
        GMTrace.o(20282446184448L, 151116);
        return false;
      }
      f.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
      GMTrace.o(20282446184448L, 151116);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\g\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */