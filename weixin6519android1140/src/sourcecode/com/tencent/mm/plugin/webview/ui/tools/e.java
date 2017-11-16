package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.vk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.WebView;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  private WebView rIF;
  private Map<String, a> rJO;
  private JsapiPermissionWrapper rJP;
  private GeneralControlWrapper rJQ;
  private final JsapiPermissionWrapper rJR;
  private final GeneralControlWrapper rJS;
  private int[] rJT;
  private int[] rJU;
  
  public e(Activity paramActivity, WebView paramWebView)
  {
    GMTrace.i(19460496818176L, 144992);
    this.rJR = new JsapiPermissionWrapper(2);
    this.rJS = GeneralControlWrapper.tJN;
    this.rJP = ((JsapiPermissionWrapper)paramActivity.getIntent().getParcelableExtra("hardcode_jspermission"));
    if ((r.hke == null) || (r.hke.length() == 0))
    {
      w.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission is null");
      this.rJQ = ((GeneralControlWrapper)paramActivity.getIntent().getParcelableExtra("hardcode_general_ctrl"));
      if ((r.hkf != null) && (r.hkf.length() != 0)) {
        break label392;
      }
      w.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, Test.generalCtrl is null");
    }
    for (;;)
    {
      w.i("MicroMsg.WebViewPermission", "edw <init> hardcodeJsPerm = " + this.rJP + ", hardcodeGenCtrl = " + this.rJQ);
      this.rIF = paramWebView;
      this.rJO = new HashMap();
      this.rJT = paramActivity.getIntent().getIntArrayExtra("jsapi_blacklist");
      this.rJU = paramActivity.getIntent().getIntArrayExtra("jsapi_whitelist");
      if ((this.rJT != null) && (this.rJT.length > 0) && (this.rJP != null))
      {
        w.i("MicroMsg.WebViewPermission", "albie: setBlacklist jsapi(%s).", new Object[] { this.rJT });
        this.rJP.o(this.rJT);
      }
      if ((this.rJU != null) && (this.rJU.length > 0) && (this.rJP != null))
      {
        w.i("MicroMsg.WebViewPermission", "albie: setWhitelist jsapi(%s).", new Object[] { this.rJU });
        this.rJP.p(this.rJU);
      }
      GMTrace.o(19460496818176L, 144992);
      return;
      int i;
      try
      {
        i = bg.getInt(r.hke, 0);
        if (i < 0) {
          w.w("MicroMsg.WebViewPermission", "setHardcodeJsPermission, Test.jsapiPermission wrong");
        }
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.WebViewPermission", "setHardcodeJsPermission, parse jsapi fail, ex = " + localException1.getMessage());
        this.rJP = null;
      }
      for (;;)
      {
        w.i("MicroMsg.WebViewPermission", "setHardcodeJsPermission, hardcodeJsPerm = " + this.rJP);
        break;
        this.rJP = new JsapiPermissionWrapper(i);
      }
      try
      {
        label392:
        i = bg.getInt(r.hkf, 0);
        w.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, permission = %d", new Object[] { Integer.valueOf(i) });
        vk localvk = new vk();
        localvk.unG = i;
        this.rJQ = new GeneralControlWrapper(localvk);
        w.i("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl, hardcodeGenCtrl = " + this.rJQ);
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.e("MicroMsg.WebViewPermission", "setHardcodeGeneralCtrl fail, ex = %s", new Object[] { localException2.getMessage() });
          this.rJQ = null;
        }
      }
    }
  }
  
  private static String zB(String paramString)
  {
    GMTrace.i(12319845253120L, 91790);
    int i = paramString.indexOf("#");
    if (i < 0)
    {
      GMTrace.o(12319845253120L, 91790);
      return paramString;
    }
    paramString = paramString.substring(0, i);
    GMTrace.o(12319845253120L, 91790);
    return paramString;
  }
  
  public final JsapiPermissionWrapper Mf(String paramString)
  {
    GMTrace.i(12319576817664L, 91788);
    if (this.rJP != null)
    {
      w.i("MicroMsg.WebViewPermission", "getJsPerm, return hardcodeJsPerm = " + this.rJP);
      paramString = this.rJP;
      GMTrace.o(12319576817664L, 91788);
      return paramString;
    }
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.WebViewPermission", "getJsPerm fail, url = " + paramString);
      paramString = this.rJR;
      GMTrace.o(12319576817664L, 91788);
      return paramString;
    }
    paramString = zB(paramString);
    if (this.rJO == null)
    {
      w.e("MicroMsg.WebViewPermission", "getJsPerm fail, permMap is null");
      paramString = this.rJR;
      GMTrace.o(12319576817664L, 91788);
      return paramString;
    }
    paramString = (a)this.rJO.get(paramString);
    if (paramString == null)
    {
      paramString = this.rJR;
      GMTrace.o(12319576817664L, 91788);
      return paramString;
    }
    paramString = paramString.rJV;
    GMTrace.o(12319576817664L, 91788);
    return paramString;
  }
  
  public final void b(String paramString, JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
  {
    GMTrace.i(12319174164480L, 91785);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.WebViewPermission", "update fail, url is null");
      GMTrace.o(12319174164480L, 91785);
      return;
    }
    String str = zB(paramString);
    paramString = paramJsapiPermissionWrapper;
    if (paramJsapiPermissionWrapper == null) {
      paramString = this.rJR;
    }
    paramJsapiPermissionWrapper = paramGeneralControlWrapper;
    if (paramGeneralControlWrapper == null) {
      paramJsapiPermissionWrapper = this.rJS;
    }
    if ((this.rJT != null) && (this.rJT.length > 0))
    {
      w.i("MicroMsg.WebViewPermission", "albie: update setBlacklist jsapi(%s).", new Object[] { this.rJT });
      paramString.o(this.rJT);
    }
    if ((this.rJU != null) && (this.rJU.length > 0))
    {
      w.i("MicroMsg.WebViewPermission", "albie: update setWhitelist jsapi(%s).", new Object[] { this.rJU });
      paramString.p(this.rJU);
    }
    w.i("MicroMsg.WebViewPermission", "edw update, jsPerm = " + paramString + ", genCtrl = " + paramJsapiPermissionWrapper + ", url = " + str);
    this.rJO.put(str, new a(paramString, paramJsapiPermissionWrapper));
    GMTrace.o(12319174164480L, 91785);
  }
  
  public final JsapiPermissionWrapper bDM()
  {
    GMTrace.i(12319442599936L, 91787);
    if (this.rJP != null)
    {
      w.i("MicroMsg.WebViewPermission", "getJsPerm, return hardcodeJsPerm = " + this.rJP);
      localObject = this.rJP;
      GMTrace.o(12319442599936L, 91787);
      return (JsapiPermissionWrapper)localObject;
    }
    if (this.rIF == null) {}
    for (Object localObject = null;; localObject = this.rIF.getUrl())
    {
      localObject = Mf((String)localObject);
      GMTrace.o(12319442599936L, 91787);
      return (JsapiPermissionWrapper)localObject;
    }
  }
  
  public final GeneralControlWrapper bDN()
  {
    Object localObject = null;
    GMTrace.i(12319711035392L, 91789);
    if (this.rJQ != null)
    {
      w.i("MicroMsg.WebViewPermission", "getGenCtrl, return hardcodeGenCtrl = " + this.rJQ);
      localObject = this.rJQ;
      GMTrace.o(12319711035392L, 91789);
      return (GeneralControlWrapper)localObject;
    }
    String str;
    if (this.rIF != null)
    {
      str = this.rIF.getUrl();
      if (!bg.nm(str)) {}
    }
    for (localObject = str;; localObject = null)
    {
      w.e("MicroMsg.WebViewPermission", "getGenCtrl fail, url = " + (String)localObject);
      localObject = this.rJS;
      GMTrace.o(12319711035392L, 91789);
      return (GeneralControlWrapper)localObject;
      str = zB(str);
      a locala = (a)this.rJO.get(str);
      StringBuilder localStringBuilder = new StringBuilder("edw getGenCtrl, genCtrl = ");
      if (locala == null) {}
      for (;;)
      {
        w.i("MicroMsg.WebViewPermission", localObject + ", url = " + str);
        if (locala != null) {
          break;
        }
        localObject = this.rJS;
        GMTrace.o(12319711035392L, 91789);
        return (GeneralControlWrapper)localObject;
        localObject = locala.rJW;
      }
      localObject = locala.rJW;
      GMTrace.o(12319711035392L, 91789);
      return (GeneralControlWrapper)localObject;
    }
  }
  
  public final void detach()
  {
    GMTrace.i(16914520735744L, 126023);
    w.i("MicroMsg.WebViewPermission", "detach");
    this.rJO.clear();
    this.rJO = null;
    this.rIF = null;
    GMTrace.o(16914520735744L, 126023);
  }
  
  public final boolean has(String paramString)
  {
    GMTrace.i(12319308382208L, 91786);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.WebViewPermission", "has fail, url is null");
      GMTrace.o(12319308382208L, 91786);
      return false;
    }
    paramString = zB(paramString);
    paramString = (a)this.rJO.get(paramString);
    if ((paramString != null) && (paramString.rJV != this.rJR) && (paramString.rJW != this.rJS))
    {
      GMTrace.o(12319308382208L, 91786);
      return true;
    }
    GMTrace.o(12319308382208L, 91786);
    return false;
  }
  
  private static final class a
  {
    public JsapiPermissionWrapper rJV;
    public GeneralControlWrapper rJW;
    
    public a(JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
    {
      GMTrace.i(12267500339200L, 91400);
      this.rJV = paramJsapiPermissionWrapper;
      this.rJW = paramGeneralControlWrapper;
      GMTrace.o(12267500339200L, 91400);
    }
    
    public final String toString()
    {
      GMTrace.i(12267634556928L, 91401);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Permission: jsPerm = ");
      ((StringBuilder)localObject).append(this.rJV);
      ((StringBuilder)localObject).append(", genCtrl = ");
      ((StringBuilder)localObject).append(this.rJW);
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(12267634556928L, 91401);
      return (String)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */