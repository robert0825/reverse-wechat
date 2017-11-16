package com.tencent.mm.plugin.webview.ui.tools;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.http.SslCertificate;
import android.net.http.SslCertificate.DName;
import android.net.http.SslError;
import android.util.Base64;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.xweb.WebView;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@JgClassChecked(author=20, fComment="checked", lastDate="20141210", reviewer=20, vComment={com.jg.EType.HTTPSCHECK})
public final class b
{
  Context context;
  private final SimpleDateFormat okV;
  public WebView rIF;
  public Map<String, List<com.tencent.xweb.g>> rIG;
  public Map<String, Boolean> rIH;
  
  public b(Context paramContext, WebView paramWebView)
  {
    GMTrace.i(19394327478272L, 144499);
    this.okV = new SimpleDateFormat("yyyy-MM-dd HH:mmZ", Locale.getDefault());
    this.context = paramContext;
    this.rIF = paramWebView;
    this.rIG = new HashMap();
    this.rIH = new HashMap();
    GMTrace.o(19394327478272L, 144499);
  }
  
  @TargetApi(14)
  private String a(String paramString, SslError paramSslError)
  {
    GMTrace.i(19394595913728L, 144501);
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<sslerror>");
      localStringBuilder.append("<primaryerror>");
      Object localObject;
      if (paramSslError == null)
      {
        localObject = "-1";
        localStringBuilder.append(localObject);
        localStringBuilder.append("</primaryerror>");
        localStringBuilder.append("<clienttime>");
        localStringBuilder.append(Base64.encodeToString(this.okV.format(new Date()).getBytes(), 0));
        localStringBuilder.append("</clienttime>");
        localStringBuilder.append("<currenturl>");
        if (!bg.nm(paramString)) {
          localStringBuilder.append(bg.Sw(paramString));
        }
        localStringBuilder.append("</currenturl>");
        if (paramSslError != null) {
          break label352;
        }
      }
      label352:
      for (paramString = null;; paramString = paramSslError.getCertificate())
      {
        if (paramString != null)
        {
          paramSslError = paramString.getIssuedBy();
          if (paramSslError != null)
          {
            localStringBuilder.append("<issuedby>");
            if (paramSslError.getDName() != null) {
              localStringBuilder.append(Base64.encodeToString(paramSslError.getDName().getBytes(), 0));
            }
            localStringBuilder.append("</issuedby>");
          }
          paramSslError = paramString.getIssuedTo();
          if (paramSslError != null)
          {
            localStringBuilder.append("<issuedto>");
            if (paramSslError.getDName() != null) {
              localStringBuilder.append(Base64.encodeToString(paramSslError.getDName().getBytes(), 0));
            }
            localStringBuilder.append("</issuedto>");
          }
          paramSslError = paramString.getValidNotAfter();
          if (paramSslError != null)
          {
            localStringBuilder.append("<getvalidnotafter>");
            localStringBuilder.append(Base64.encodeToString(paramSslError.getBytes(), 0));
            localStringBuilder.append("</getvalidnotafter>");
          }
          paramString = paramString.getValidNotBefore();
          if (paramString != null)
          {
            localStringBuilder.append("<getvalidnotbefore>");
            localStringBuilder.append(Base64.encodeToString(paramString.getBytes(), 0));
            localStringBuilder.append("</getvalidnotbefore>");
          }
        }
        localStringBuilder.append("</sslerror>");
        paramString = localStringBuilder.toString();
        GMTrace.o(19394595913728L, 144501);
        return paramString;
        localObject = Integer.valueOf(paramSslError.getPrimaryError());
        break;
      }
      return "";
    }
    catch (Exception paramString)
    {
      w.w("MicroMsg.WebView.MMSslErrorHandler", "buildXml ex = %s", new Object[] { paramString.getMessage() });
      GMTrace.o(19394595913728L, 144501);
    }
  }
  
  public final void a(final String paramString, com.tencent.xweb.g paramg, SslError paramSslError)
  {
    GMTrace.i(19394461696000L, 144500);
    w.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError, currentUrl = %s", new Object[] { paramString });
    if (this.rIF == null)
    {
      w.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError fail, has been detached");
      GMTrace.o(19394461696000L, 144500);
      return;
    }
    if (bg.nm(paramString))
    {
      paramg.cancel();
      GMTrace.o(19394461696000L, 144500);
      return;
    }
    URL localURL;
    try
    {
      localURL = new URL(paramString);
      if ((!localURL.getHost().endsWith(".qq.com")) && (!localURL.getHost().endsWith(".linkedin.com"))) {
        break label449;
      }
      localObject = (Boolean)this.rIH.get(paramString);
      if (localObject == null) {
        break label214;
      }
      w.v("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError, already selected = %b", new Object[] { localObject });
      if (((Boolean)localObject).booleanValue())
      {
        paramg.proceed();
        GMTrace.o(19394461696000L, 144500);
        return;
      }
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.WebView.MMSslErrorHandler", "create url fail : " + paramString.getLocalizedMessage());
      GMTrace.o(19394461696000L, 144500);
      return;
    }
    paramg.cancel();
    GMTrace.o(19394461696000L, 144500);
    return;
    label214:
    Object localObject = (List)this.rIG.get(paramString);
    if ((localObject == null) || (((List)localObject).size() == 0))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("1");
      ((StringBuilder)localObject).append(",");
      ((StringBuilder)localObject).append(a(paramString, paramSslError));
      paramSslError = ((StringBuilder)localObject).toString();
      w.i("MicroMsg.WebView.MMSslErrorHandler", "reportWebViewSslError, value = %s", new Object[] { paramSslError });
      com.tencent.mm.plugin.report.service.g.ork.A(11098, paramSslError);
      paramSslError = new ArrayList();
      paramSslError.add(paramg);
      this.rIG.put(paramString, paramSslError);
      h.a(this.context, false, this.context.getString(R.l.eld, new Object[] { localURL.getHost() }), this.context.getString(R.l.ele), this.context.getString(R.l.cSo), this.context.getString(R.l.cRO), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12265487073280L, 91385);
          paramAnonymousDialogInterface = (List)b.this.rIG.get(paramString);
          if (paramAnonymousDialogInterface == null)
          {
            w.e("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, continue selected, list should not be null");
            GMTrace.o(12265487073280L, 91385);
            return;
          }
          b.this.rIH.put(paramString, Boolean.valueOf(true));
          w.i("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, continue selected, list size = %d", new Object[] { Integer.valueOf(paramAnonymousDialogInterface.size()) });
          Iterator localIterator = paramAnonymousDialogInterface.iterator();
          while (localIterator.hasNext()) {
            ((com.tencent.xweb.g)localIterator.next()).proceed();
          }
          paramAnonymousDialogInterface.clear();
          GMTrace.o(12265487073280L, 91385);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12271124217856L, 91427);
          paramAnonymousDialogInterface = (List)b.this.rIG.get(paramString);
          if (paramAnonymousDialogInterface == null)
          {
            w.e("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, cancel selected, list should not be null");
            GMTrace.o(12271124217856L, 91427);
            return;
          }
          b.this.rIH.put(paramString, Boolean.valueOf(false));
          w.i("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, cancel selected, list size = %d", new Object[] { Integer.valueOf(paramAnonymousDialogInterface.size()) });
          Iterator localIterator = paramAnonymousDialogInterface.iterator();
          while (localIterator.hasNext()) {
            ((com.tencent.xweb.g)localIterator.next()).cancel();
          }
          paramAnonymousDialogInterface.clear();
          b.this.rIF.clearSslPreferences();
          GMTrace.o(12271124217856L, 91427);
        }
      });
      GMTrace.o(19394461696000L, 144500);
      return;
    }
    ((List)localObject).add(paramg);
    GMTrace.o(19394461696000L, 144500);
    return;
    label449:
    w.d("MicroMsg.WebView.MMSslErrorHandler", "host = " + localURL.getHost() + ", but it not end with '.qq.com' or '.linkedin.com'");
    paramg.cancel();
    GMTrace.o(19394461696000L, 144500);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */