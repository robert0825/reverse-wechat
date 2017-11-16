package com.tencent.mm.plugin.nfc_open.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.plugin.nfc.a.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.c.aql;
import com.tencent.mm.protocal.c.jl;
import com.tencent.mm.protocal.c.nj;
import com.tencent.mm.protocal.c.oh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NfcWebViewUI
  extends WebViewUI
{
  private String nxx;
  private boolean nxy;
  private com.tencent.mm.plugin.nfc_open.a.a nxz;
  
  public NfcWebViewUI()
  {
    GMTrace.i(12479832784896L, 92982);
    this.nxx = null;
    this.nxy = false;
    this.nxz = new com.tencent.mm.plugin.nfc_open.a.a();
    GMTrace.o(12479832784896L, 92982);
  }
  
  private String DV(String paramString)
  {
    GMTrace.i(12481174962176L, 92992);
    w.i("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl start");
    this.nxx = "";
    try
    {
      paramString = paramString.split(" ");
      if ((paramString != null) && (paramString.length > 1))
      {
        i = 0;
        boolean bool1 = false;
        boolean bool2;
        for (;;)
        {
          bool2 = bool1;
          if (i >= paramString.length - 1) {
            break;
          }
          String str1 = paramString[i];
          String str2 = paramString[(i + 1)];
          w.d("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl cmd = " + str1 + " anwser = " + str2);
          bool1 = a(new com.tencent.mm.plugin.nfc.a.a(com.tencent.mm.plugin.nfc.c.a.hexStringToByteArray(str1)), str2);
          bool2 = bool1;
          if (!bool1) {
            break;
          }
          i = i + 1 + 1;
        }
        if (bool2)
        {
          this.nxx = paramString[(paramString.length - 1)];
          w.d("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl tempurl = " + this.nxx);
          paramString = this.nxx;
          GMTrace.o(12481174962176L, 92992);
          return paramString;
        }
      }
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("MicroMsg.NfcWebViewUI", paramString, "", new Object[0]);
      w.e("MicroMsg.NfcWebViewUI", "[NFC] Debug get nfc card type exception!" + paramString.toString());
      int i = com.tencent.mm.plugin.nfc.b.a.a.aUe().cU(this.vKB.vKW);
      w.e("MicroMsg.NfcWebViewUI", "isConnect:" + i);
      this.nxx = rQ(1);
      paramString = this.nxx;
      GMTrace.o(12481174962176L, 92992);
      return paramString;
    }
    paramString = this.nxx;
    GMTrace.o(12481174962176L, 92992);
    return paramString;
  }
  
  private String DW(String paramString)
  {
    GMTrace.i(12481309179904L, 92993);
    w.i("MicroMsg.NfcWebViewUI", "nfc-getCommonNfcCardGuideUrl start");
    int i = 0;
    this.nxx = "";
    final Object localObject1 = new aql();
    if (!bg.nm(paramString)) {}
    for (;;)
    {
      int k;
      try
      {
        ((aql)localObject1).aD(paramString.getBytes("ISO-8859-1"));
        if (((aql)localObject1).ufh != null)
        {
          int m = 0;
          if (m < ((aql)localObject1).ufh.size())
          {
            paramString = (jl)((aql)localObject1).ufh.get(m);
            Object localObject2 = com.tencent.mm.plugin.nfc.b.a.a.aUe();
            if (((com.tencent.mm.plugin.nfc.b.a.a)localObject2).nxm != null) {
              ((com.tencent.mm.plugin.nfc.b.a.a)localObject2).nxm.aUf();
            }
            k = i;
            if (paramString != null)
            {
              k = i;
              if (!bg.nm(paramString.tMl))
              {
                k = i;
                if (!bg.cc(paramString.tYV))
                {
                  k = 0;
                  if (k >= paramString.tYV.size()) {
                    break label611;
                  }
                  if (bg.cc(((oh)paramString.tYV.get(k)).ufk)) {
                    break label584;
                  }
                  j = 0;
                  if (j >= ((oh)paramString.tYV.get(k)).ufk.size()) {
                    break label581;
                  }
                  if ((((oh)paramString.tYV.get(k)).ufk.get(j) == null) || (bg.nm(((nj)((oh)paramString.tYV.get(k)).ufk.get(j)).ueh)) || (bg.nm(((nj)((oh)paramString.tYV.get(k)).ufk.get(j)).mIY))) {
                    break label578;
                  }
                  localObject2 = ((nj)((oh)paramString.tYV.get(k)).ufk.get(j)).ueh;
                  String str = ((nj)((oh)paramString.tYV.get(k)).ufk.get(j)).mIY;
                  w.d("MicroMsg.NfcWebViewUI", "nfc-getCommonNfcCardGuideUrl cmd = " + (String)localObject2 + " anwser = " + str);
                  if (!a(new com.tencent.mm.plugin.nfc.a.a(com.tencent.mm.plugin.nfc.c.a.hexStringToByteArray((String)localObject2)), str)) {
                    break label594;
                  }
                  i = 1;
                  break label587;
                  k = j;
                  if (j != 0)
                  {
                    localObject1 = paramString.tMl;
                    w.i("MicroMsg.NfcWebViewUI", "doCardTypeReport start");
                    com.tencent.mm.sdk.f.e.post(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(12479698567168L, 92981);
                        g.ork.i(12794, new Object[] { localObject1, Integer.valueOf(0) });
                        w.d("MicroMsg.NfcWebViewUI", "doCardTypeReport url = " + localObject1);
                        GMTrace.o(12479698567168L, 92981);
                      }
                    }, getClass().getName());
                    paramString = paramString.tMl;
                    GMTrace.o(12481309179904L, 92993);
                    return paramString;
                  }
                }
              }
            }
            m += 1;
            i = k;
            continue;
          }
        }
        paramString = this.nxx;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.NfcWebViewUI", paramString, "", new Object[0]);
        w.e("MicroMsg.NfcWebViewUI", "[NFC] Common get nfc card type exception!" + paramString.toString());
        i = com.tencent.mm.plugin.nfc.b.a.a.aUe().cU(this.vKB.vKW);
        w.e("MicroMsg.NfcWebViewUI", "isConnect:" + i);
        this.nxx = rQ(1);
        paramString = this.nxx;
        GMTrace.o(12481309179904L, 92993);
        return paramString;
      }
      GMTrace.o(12481309179904L, 92993);
      return paramString;
      label578:
      break label587;
      label581:
      break label596;
      label584:
      break label602;
      label587:
      j += 1;
      continue;
      label594:
      i = 0;
      label596:
      int j = i;
      if (i == 0)
      {
        label602:
        k += 1;
        continue;
        label611:
        j = i;
      }
    }
  }
  
  private static boolean R(Intent paramIntent)
  {
    GMTrace.i(12481846050816L, 92997);
    if (paramIntent == null)
    {
      w.e("MicroMsg.NfcWebViewUI", "intent is null");
      GMTrace.o(12481846050816L, 92997);
      return true;
    }
    Iterator localIterator = paramIntent.getExtras().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str != null) && (!str.startsWith("android.nfc")))
      {
        w.e("MicroMsg.NfcWebViewUI", "extra wrong key = " + str);
        localIterator.remove();
      }
    }
    paramIntent = paramIntent.getParcelableExtra("android.nfc.extra.TAG");
    if ((paramIntent != null) && ((paramIntent instanceof Tag))) {}
    for (paramIntent = (Tag)paramIntent;; paramIntent = null)
    {
      if (paramIntent == null)
      {
        w.e("MicroMsg.NfcWebViewUI", "tag is null");
        GMTrace.o(12481846050816L, 92997);
        return true;
      }
      GMTrace.o(12481846050816L, 92997);
      return false;
    }
  }
  
  private void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    GMTrace.i(12480638091264L, 92988);
    switch (3.jjk[parama.ordinal()])
    {
    default: 
      finish();
      GMTrace.o(12480638091264L, 92988);
      return;
    }
    parama = paramIntent.getParcelableExtra("android.nfc.extra.TAG");
    if ((parama != null) && ((parama instanceof Tag))) {}
    for (parama = (Tag)parama;; parama = null)
    {
      if (parama == null)
      {
        w.e("MicroMsg.NfcWebViewUI", "[NFC]tag is null");
        GMTrace.o(12480638091264L, 92988);
        return;
      }
      try
      {
        com.tencent.mm.plugin.nfc.b.a.a.aUe().a(parama);
        int i = com.tencent.mm.plugin.nfc.b.a.a.aUe().cV(this.vKB.vKW);
        w.i("MicroMsg.NfcWebViewUI", "[NFC] connect status : " + i);
        GMTrace.o(12480638091264L, 92988);
        return;
      }
      catch (Exception parama)
      {
        w.e("MicroMsg.NfcWebViewUI", "exp protect");
        GMTrace.o(12480638091264L, 92988);
        return;
      }
    }
  }
  
  private static boolean a(com.tencent.mm.plugin.nfc.a.a parama, String paramString)
  {
    GMTrace.i(12481443397632L, 92994);
    w.i("MicroMsg.NfcWebViewUI", "nfc-doCmd start");
    parama = com.tencent.mm.plugin.nfc.b.a.a.aUe().a(parama).toString();
    if (!bg.nm(parama))
    {
      w.d("MicroMsg.NfcWebViewUI", "nfc-judge mAnwser = " + bg.nl(paramString) + " resp = " + bg.nl(parama));
      if (!Pattern.compile(paramString, 2).matcher(parama).find()) {}
    }
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(12481443397632L, 92994);
      return true;
    }
    GMTrace.o(12481443397632L, 92994);
    return false;
  }
  
  private boolean aUi()
  {
    GMTrace.i(12480503873536L, 92987);
    try
    {
      if (this.ioh.bDv())
      {
        w.w("MicroMsg.NfcWebViewUI", "not login");
        Intent localIntent = new Intent(this, getClass());
        localIntent.putExtras(getIntent());
        localIntent.addFlags(67108864);
        this.ioh.aa(localIntent);
        GMTrace.o(12480503873536L, 92987);
        return true;
      }
    }
    catch (RemoteException localRemoteException)
    {
      w.printErrStackTrace("MicroMsg.NfcWebViewUI", localRemoteException, "", new Object[0]);
      GMTrace.o(12480503873536L, 92987);
      return true;
    }
    GMTrace.o(12480503873536L, 92987);
    return false;
  }
  
  private String aUj()
  {
    Object localObject1 = null;
    GMTrace.i(12481040744448L, 92991);
    w.i("MicroMsg.NfcWebViewUI", "nfc-getNfcCpuCardGuideUrl start");
    for (;;)
    {
      try
      {
        localObject2 = this.ioh.d(4006, null);
        if (localObject2 == null)
        {
          w.i("MicroMsg.NfcWebViewUI", "nfc-getNfcCpuCardGuideUrl data is null");
          GMTrace.o(12481040744448L, 92991);
          return null;
        }
        ((Bundle)localObject2).setClassLoader(getClass().getClassLoader());
        str = ((Bundle)localObject2).getString("debugConfig");
        localObject2 = ((Bundle)localObject2).getString("config");
        if (str == null) {
          continue;
        }
        str = DV(str);
        localObject1 = str;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2;
        String str;
        w.e("MicroMsg.NfcWebViewUI", localRemoteException.toString());
        w.printErrStackTrace("MicroMsg.NfcWebViewUI", localRemoteException, "", new Object[0]);
        continue;
      }
      w.i("MicroMsg.NfcWebViewUI", "nfc-getNfcCpuCardGuideUrl targetUrl=" + bg.nl((String)localObject1));
      GMTrace.o(12481040744448L, 92991);
      return (String)localObject1;
      str = DW((String)localObject2);
      localObject1 = str;
    }
  }
  
  private void aUk()
  {
    GMTrace.i(12481711833088L, 92996);
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    com.tencent.mm.bj.d.a(this, "com.tencent.mm.ui.LauncherUI", localIntent);
    finish();
    overridePendingTransition(R.a.aLj, R.a.aLD);
    w.i("MicroMsg.NfcWebViewUI", "lo-nfc-setBackBtn:back click after login");
    GMTrace.o(12481711833088L, 92996);
  }
  
  private static String rQ(int paramInt)
  {
    GMTrace.i(12480906526720L, 92990);
    StringBuilder localStringBuilder = new StringBuilder("https://support.weixin.qq.com/security/readtemplate?t=bus_recharge/index_error");
    localStringBuilder.append("&type=").append(paramInt);
    String str;
    if ((!f.vhv) && (v.bPK().equals("zh_CN"))) {
      str = "zh_CN";
    }
    for (;;)
    {
      localStringBuilder.append("&lang=").append(str);
      str = localStringBuilder.toString();
      GMTrace.o(12480906526720L, 92990);
      return str;
      if (v.bPI()) {
        str = "zh_TW";
      } else {
        str = "en";
      }
    }
  }
  
  protected final void aaO()
  {
    GMTrace.i(12480235438080L, 92985);
    if (aUi())
    {
      finish();
      w.w("MicroMsg.NfcWebViewUI", "not login, go to SimpleLogin");
      GMTrace.o(12480235438080L, 92985);
      return;
    }
    super.aaO();
    a(AutoLoginActivity.a.tsG, getIntent());
    GMTrace.o(12480235438080L, 92985);
  }
  
  protected final void gu(boolean paramBoolean)
  {
    GMTrace.i(12480772308992L, 92989);
    if (this.ioh == null)
    {
      w.e("MicroMsg.NfcWebViewUI", "[NFC] invoker is null");
      GMTrace.o(12480772308992L, 92989);
      return;
    }
    a(AutoLoginActivity.a.tsG, getIntent());
    Object localObject1 = aUj();
    Object localObject2 = this.eVw;
    if ((paramBoolean) && (!bg.nm(this.eVw)) && (!this.eVw.startsWith("https://support.weixin.qq.com/security/readtemplate?t=bus_recharge/index_error"))) {
      for (;;)
      {
        try
        {
          paramBoolean = bg.nm((String)localObject1);
          if (paramBoolean) {
            continue;
          }
        }
        catch (RemoteException localRemoteException)
        {
          int i;
          w.printErrStackTrace("MicroMsg.NfcWebViewUI", localRemoteException, "", new Object[0]);
          continue;
        }
        try
        {
          localObject2 = Uri.parse((String)localObject1);
          localObject1 = Uri.parse(this.eVw);
          localObject2 = ((Uri)localObject2).getHost();
          localObject1 = ((Uri)localObject1).getHost();
          w.i("MicroMsg.NfcWebViewUI", "targetHost=" + (String)localObject2 + ", curHost=" + (String)localObject1);
          paramBoolean = ((String)localObject2).equals(localObject1);
          if (paramBoolean)
          {
            i = 1;
            if (i != 0) {
              this.rEM.m(4007, new Bundle());
            }
            w.i("MicroMsg.NfcWebViewUI", "[NFC]new intent not guide the page");
            GMTrace.o(12480772308992L, 92989);
            return;
          }
        }
        catch (Exception localException) {}
        i = 0;
      }
    }
    this.eVw = localRemoteException;
    if (bg.nm(this.eVw))
    {
      this.eVw = rQ(0);
      w.e("MicroMsg.NfcWebViewUI", "[NFC] url not found! not support this card ?");
    }
    getIntent().putExtra("rawUrl", this.eVw);
    if (!this.eVw.equals(localObject2))
    {
      w.i("MicroMsg.NfcWebViewUI", "lo-nfc-dealwithNFC: onNewIntent load:" + this.eVw);
      this.nXD.loadUrl(this.eVw);
    }
    GMTrace.o(12480772308992L, 92989);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(12481577615360L, 92995);
    if (this.nxy)
    {
      aUk();
      GMTrace.o(12481577615360L, 92995);
      return;
    }
    super.onBackPressed();
    GMTrace.o(12481577615360L, 92995);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12479967002624L, 92983);
    Intent localIntent = getIntent();
    if (R(localIntent))
    {
      w.e("MicroMsg.NfcWebViewUI", "onCreate judgeIllegalCall finish");
      localIntent.putExtra("key_trust_url", false);
      super.onCreate(paramBundle);
      finish();
      GMTrace.o(12479967002624L, 92983);
      return;
    }
    localIntent.putExtra("key_trust_url", false);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.vgX.b(this.nxz);
    com.tencent.mm.bj.d.bNA();
    w.i("MicroMsg.NfcWebViewUI", "onCreate, intent action = " + localIntent.getAction());
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12479430131712L, 92979);
        if (NfcWebViewUI.a(NfcWebViewUI.this)) {
          NfcWebViewUI.b(NfcWebViewUI.this);
        }
        for (;;)
        {
          GMTrace.o(12479430131712L, 92979);
          return true;
          NfcWebViewUI.this.finish();
        }
      }
    });
    getIntent().putExtra("showShare", false);
    jy(false);
    GMTrace.o(12479967002624L, 92983);
  }
  
  @TargetApi(11)
  protected void onDestroy()
  {
    GMTrace.i(12480101220352L, 92984);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.vgX.c(this.nxz);
    GMTrace.o(12480101220352L, 92984);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(12480369655808L, 92986);
    if (R(paramIntent))
    {
      w.e("MicroMsg.NfcWebViewUI", "onNewIntent judgeIllegalCall finish");
      GMTrace.o(12480369655808L, 92986);
      return;
    }
    paramIntent.putExtra("key_trust_url", false);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    int i = s.a(paramIntent, "wizard_activity_result_code", Integer.MAX_VALUE);
    w.i("MicroMsg.NfcWebViewUI", "onNewIntent, resultCode = " + i);
    if (i != Integer.MAX_VALUE) {
      this.nxy = true;
    }
    switch (i)
    {
    default: 
    case -1: 
    case 1: 
      for (;;)
      {
        gu(true);
        w.i("Foreground dispatch", "Discovered tag with intent: " + paramIntent);
        GMTrace.o(12480369655808L, 92986);
        return;
        a(AutoLoginActivity.a.tsG, paramIntent);
        continue;
        a(AutoLoginActivity.a.tsI, paramIntent);
      }
    }
    aUi();
    GMTrace.o(12480369655808L, 92986);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\nfc_open\ui\NfcWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */