package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.base.i;
import com.tencent.xweb.WebView;
import com.tencent.xweb.e;

public class d
  extends com.tencent.xweb.h
{
  private Activity eNu;
  private int lJW;
  
  public d(MMWebViewWithJsApi paramMMWebViewWithJsApi)
  {
    GMTrace.i(12089259196416L, 90072);
    this.lJW = 0;
    this.eNu = ((Activity)paramMMWebViewWithJsApi.getContext());
    GMTrace.o(12089259196416L, 90072);
  }
  
  public final boolean a(WebView paramWebView, String paramString1, String paramString2, final e parame)
  {
    GMTrace.i(19458349334528L, 144976);
    this.lJW += 1;
    if (this.lJW > 2) {}
    for (i locali = com.tencent.mm.ui.base.h.a(this.eNu, paramString2, "", this.eNu.getString(R.l.els), this.eNu.getString(R.l.cTM), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12064026263552L, 89884);
            parame.cancel();
            if (paramAnonymousDialogInterface != null) {
              paramAnonymousDialogInterface.dismiss();
            }
            d.this.onClose();
            GMTrace.o(12064026263552L, 89884);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12087782801408L, 90061);
            parame.confirm();
            GMTrace.o(12087782801408L, 90061);
          }
        }, R.e.aOm); locali != null; locali = com.tencent.mm.ui.base.h.a(this.eNu, paramString2, "", this.eNu.getString(R.l.cTM), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12088856543232L, 90069);
            parame.confirm();
            GMTrace.o(12088856543232L, 90069);
          }
        }))
    {
      locali.setCanceledOnTouchOutside(false);
      locali.lx(false);
      GMTrace.o(19458349334528L, 144976);
      return true;
    }
    boolean bool = super.a(paramWebView, paramString1, paramString2, parame);
    GMTrace.o(19458349334528L, 144976);
    return bool;
  }
  
  public final boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, com.tencent.xweb.d paramd)
  {
    GMTrace.i(19458617769984L, 144978);
    boolean bool = super.a(paramWebView, paramString1, paramString2, paramString3, paramd);
    GMTrace.o(19458617769984L, 144978);
    return bool;
  }
  
  public final boolean b(WebView paramWebView, String paramString1, String paramString2, final e parame)
  {
    GMTrace.i(19458483552256L, 144977);
    this.lJW += 1;
    if (this.lJW > 2) {}
    for (i locali = com.tencent.mm.ui.base.h.a(this.eNu, paramString2, "", this.eNu.getString(R.l.els), this.eNu.getString(R.l.cTM), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12060805038080L, 89860);
            parame.cancel();
            if (paramAnonymousDialogInterface != null) {
              paramAnonymousDialogInterface.dismiss();
            }
            d.this.onClose();
            GMTrace.o(12060805038080L, 89860);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12071676674048L, 89941);
            parame.confirm();
            GMTrace.o(12071676674048L, 89941);
          }
        }, R.e.aMX); locali != null; locali = com.tencent.mm.ui.base.h.a(this.eNu, false, paramString2, "", this.eNu.getString(R.l.cTM), this.eNu.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12071139803136L, 89937);
            parame.confirm();
            GMTrace.o(12071139803136L, 89937);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(12093017292800L, 90100);
            parame.cancel();
            GMTrace.o(12093017292800L, 90100);
          }
        }))
    {
      locali.setCancelable(false);
      locali.setCanceledOnTouchOutside(false);
      GMTrace.o(19458483552256L, 144977);
      return true;
    }
    boolean bool = super.b(paramWebView, paramString1, paramString2, parame);
    GMTrace.o(19458483552256L, 144977);
    return bool;
  }
  
  public void c(WebView paramWebView, String paramString)
  {
    GMTrace.i(19458080899072L, 144974);
    super.c(paramWebView, paramString);
    GMTrace.o(19458080899072L, 144974);
  }
  
  public void onClose()
  {
    GMTrace.i(21042789613568L, 156781);
    this.eNu.finish();
    GMTrace.o(21042789613568L, 156781);
  }
  
  public final void onGeolocationPermissionsShowPrompt(final String paramString, final GeolocationPermissions.Callback paramCallback)
  {
    GMTrace.i(19458215116800L, 144975);
    com.tencent.mm.ui.base.h.a(this.eNu, false, this.eNu.getString(R.l.elx, new Object[] { paramString }), this.eNu.getString(R.l.ely), this.eNu.getString(R.l.cTM), this.eNu.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12069663408128L, 89926);
        paramCallback.invoke(paramString, true, true);
        GMTrace.o(12069663408128L, 89926);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12088319672320L, 90065);
        paramCallback.invoke(paramString, false, false);
        GMTrace.o(12088319672320L, 90065);
      }
    });
    GMTrace.o(19458215116800L, 144975);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */