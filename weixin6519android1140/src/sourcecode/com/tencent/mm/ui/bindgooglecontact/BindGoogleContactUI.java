package com.tencent.mm.ui.bindgooglecontact;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.webkit.ConsoleMessage;
import android.widget.TextView;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.an.a;
import com.tencent.mm.an.a.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.mm.y.at;
import com.tencent.xweb.WebView;
import com.tencent.xweb.b;
import com.tencent.xweb.l;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public class BindGoogleContactUI
  extends MMActivity
  implements e
{
  private boolean guN;
  private boolean iZm;
  private int ipN;
  private ProgressDialog kgz;
  private TextView maG;
  private boolean wlJ;
  String wlL;
  private WebView wlR;
  private boolean wlS;
  private String wlT;
  String wlU;
  String wlV;
  private a wlW;
  
  public BindGoogleContactUI()
  {
    GMTrace.i(1670608060416L, 12447);
    this.wlJ = false;
    this.wlS = false;
    this.guN = false;
    this.iZm = false;
    GMTrace.o(1670608060416L, 12447);
  }
  
  private void Cw(int paramInt)
  {
    GMTrace.i(1671950237696L, 12457);
    this.wlW = new a(a.a.gGa, this.wlL, paramInt);
    at.wS().a(this.wlW, 0);
    w.i("MicroMsg.GoogleContact.BindGoogleContactUI", "doScene mAppToken:%s, mWebToke:%s", new Object[] { this.wlT, this.wlU });
    GMTrace.o(1671950237696L, 12457);
  }
  
  private void ar()
  {
    GMTrace.i(1671010713600L, 12450);
    if (this.wlJ)
    {
      this.wlR.setVisibility(8);
      asd();
      startActivityForResult(new Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT"), 1003);
      GMTrace.o(1671010713600L, 12450);
      return;
    }
    this.maG.setVisibility(4);
    this.wlR.setVisibility(0);
    cbe();
    GMTrace.o(1671010713600L, 12450);
  }
  
  private void asd()
  {
    GMTrace.i(1672487108608L, 12461);
    if ((this.kgz == null) || (!this.kgz.isShowing()))
    {
      getString(R.l.cUG);
      this.kgz = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(1677587382272L, 12499);
          BindGoogleContactUI.f(BindGoogleContactUI.this);
          if (BindGoogleContactUI.g(BindGoogleContactUI.this) != null) {
            at.wS().c(BindGoogleContactUI.g(BindGoogleContactUI.this));
          }
          GMTrace.o(1677587382272L, 12499);
        }
      });
    }
    GMTrace.o(1672487108608L, 12461);
  }
  
  private void cbe()
  {
    GMTrace.i(1671816019968L, 12456);
    asd();
    this.wlR.getSettings().setJavaScriptEnabled(true);
    this.wlR.setWebViewClient(new com.tencent.xweb.n()
    {
      public final void a(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19162936115200L, 142775);
        w.d("MicroMsg.GoogleContact.BindGoogleContactUI", "onPageFinished URL:" + paramAnonymousString);
        if ((BindGoogleContactUI.a(BindGoogleContactUI.this) != null) && (BindGoogleContactUI.a(BindGoogleContactUI.this).getVisibility() != 0))
        {
          BindGoogleContactUI.a(BindGoogleContactUI.this).setVisibility(0);
          if (BindGoogleContactUI.b(BindGoogleContactUI.this) != null) {
            BindGoogleContactUI.b(BindGoogleContactUI.this).setVisibility(4);
          }
        }
        BindGoogleContactUI.c(BindGoogleContactUI.this);
        if (paramAnonymousWebView != null)
        {
          paramAnonymousWebView = paramAnonymousWebView.getTitle();
          w.d("MicroMsg.GoogleContact.BindGoogleContactUI", "title:%s", new Object[] { paramAnonymousWebView });
          if (!TextUtils.isEmpty(paramAnonymousWebView))
          {
            if (paramAnonymousWebView.toLowerCase().contains("success"))
            {
              if (BindGoogleContactUI.a(BindGoogleContactUI.this) != null) {
                BindGoogleContactUI.a(BindGoogleContactUI.this).setVisibility(4);
              }
              s.a(BindGoogleContactUI.a(BindGoogleContactUI.this), "weixin://private/googlegetcode", "document.getElementById('code').value");
              GMTrace.o(19162936115200L, 142775);
              return;
            }
            if (paramAnonymousWebView.toLowerCase().contains("error")) {
              w.w("MicroMsg.GoogleContact.BindGoogleContactUI", "failed." + paramAnonymousWebView.substring(paramAnonymousWebView.indexOf("=")));
            }
          }
        }
        GMTrace.o(19162936115200L, 142775);
      }
      
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19163070332928L, 142776);
        w.d("MicroMsg.GoogleContact.BindGoogleContactUI", "shouldOverrideUrlLoading, url = %s", new Object[] { paramAnonymousString });
        if (paramAnonymousString.toLowerCase().startsWith("weixin://private/googlegetcode"))
        {
          BindGoogleContactUI.a(BindGoogleContactUI.this, paramAnonymousString);
          GMTrace.o(19163070332928L, 142776);
          return true;
        }
        boolean bool = super.b(paramAnonymousWebView, paramAnonymousString);
        GMTrace.o(19163070332928L, 142776);
        return bool;
      }
    });
    this.wlR.setWebChromeClient(new com.tencent.xweb.h()
    {
      public final boolean onConsoleMessage(ConsoleMessage paramAnonymousConsoleMessage)
      {
        GMTrace.i(19163338768384L, 142778);
        if (paramAnonymousConsoleMessage != null) {}
        for (String str = paramAnonymousConsoleMessage.message();; str = null)
        {
          str = s.PO(str);
          if (!str.toLowerCase().startsWith("weixin://private/googlegetcode")) {
            break;
          }
          BindGoogleContactUI.a(BindGoogleContactUI.this, str);
          GMTrace.o(19163338768384L, 142778);
          return true;
        }
        boolean bool = super.onConsoleMessage(paramAnonymousConsoleMessage);
        GMTrace.o(19163338768384L, 142778);
        return bool;
      }
    });
    WebView localWebView = this.wlR;
    w.i("MicroMsg.GoogleContactLogic", "getRequestCodeUrl:%s", new Object[] { "https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com" });
    localWebView.loadUrl("https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com");
    GMTrace.o(1671816019968L, 12456);
  }
  
  private void cbg()
  {
    GMTrace.i(1672352890880L, 12460);
    try
    {
      com.tencent.xweb.c.io(this);
      b.crS().removeAllCookie();
      GMTrace.o(1672352890880L, 12460);
      return;
    }
    catch (Exception localException)
    {
      w.d("Google Login", "Clear cookie failed");
      GMTrace.o(1672352890880L, 12460);
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(1671413366784L, 12453);
    oM(R.l.dAV);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1679063777280L, 12510);
        BindGoogleContactUI.this.finish();
        GMTrace.o(1679063777280L, 12510);
        return true;
      }
    });
    this.wlR = MMWebView.a.j(this, R.h.bFm);
    this.maG = ((TextView)findViewById(R.h.empty));
    GMTrace.o(1671413366784L, 12453);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1671681802240L, 12455);
    paramk = paramString;
    if (TextUtils.isEmpty(paramString)) {
      paramk = "";
    }
    w.i("MicroMsg.GoogleContact.BindGoogleContactUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramk });
    abl();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.wlJ)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(208903, this.wlL);
        at.AR();
        com.tencent.mm.y.c.xh().set(208901, this.wlT);
      }
      for (;;)
      {
        at.AR();
        com.tencent.mm.y.c.xh().kL(true);
        paramString = new Intent(this, GoogleFriendUI.class);
        paramString.putExtra("enter_scene", this.ipN);
        startActivity(paramString);
        finish();
        if (this.iZm) {
          g.ork.i(11002, new Object[] { Integer.valueOf(6), Integer.valueOf(5) });
        }
        GMTrace.o(1671681802240L, 12455);
        return;
        at.AR();
        com.tencent.mm.y.c.xh().set(208903, this.wlL);
        at.AR();
        com.tencent.mm.y.c.xh().set(208902, this.wlU);
        at.AR();
        com.tencent.mm.y.c.xh().set(208904, this.wlV);
      }
    }
    if (paramInt2 == a.gFV)
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dBc), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1680674390016L, 12522);
          BindGoogleContactUI.a(BindGoogleContactUI.this, a.gFU);
          GMTrace.o(1680674390016L, 12522);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1680137519104L, 12518);
          BindGoogleContactUI.d(BindGoogleContactUI.this);
          BindGoogleContactUI.e(BindGoogleContactUI.this);
          GMTrace.o(1680137519104L, 12518);
        }
      });
      GMTrace.o(1671681802240L, 12455);
      return;
    }
    cbf();
    GMTrace.o(1671681802240L, 12455);
  }
  
  final void abl()
  {
    GMTrace.i(1672621326336L, 12462);
    if ((this.kgz != null) && (this.kgz.isShowing())) {
      this.kgz.dismiss();
    }
    GMTrace.o(1672621326336L, 12462);
  }
  
  final void cU(String paramString, int paramInt)
  {
    GMTrace.i(1672084455424L, 12458);
    this.wlL = paramString;
    Cw(paramInt);
    GMTrace.o(1672084455424L, 12458);
  }
  
  final void cbf()
  {
    GMTrace.i(1672218673152L, 12459);
    if (this.wlR != null) {
      this.wlR.setVisibility(4);
    }
    if (this.maG != null) {
      this.maG.setVisibility(0);
    }
    if (!am.isConnected(this)) {}
    for (String str = getString(R.l.dBe);; str = getString(R.l.dAW))
    {
      this.maG.setText(str);
      GMTrace.o(1672218673152L, 12459);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1670742278144L, 12448);
    int i = R.i.cpZ;
    GMTrace.o(1670742278144L, 12448);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(1671547584512L, 12454);
    w.i("MicroMsg.GoogleContact.BindGoogleContactUI", "requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1)
    {
      switch (paramInt1)
      {
      }
      for (;;)
      {
        GMTrace.o(1671547584512L, 12454);
        return;
        this.wlJ = paramIntent.getBooleanExtra("gpservices", false);
        ar();
        GMTrace.o(1671547584512L, 12454);
        return;
        paramInt1 = paramIntent.getIntExtra("error_code", -1);
        w.i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d ", new Object[] { Integer.valueOf(paramInt1) });
        if (paramInt1 == 0)
        {
          this.wlL = paramIntent.getStringExtra("account");
          if (this.guN)
          {
            abl();
            GMTrace.o(1671547584512L, 12454);
            return;
          }
          w.d("MicroMsg.GoogleContact.BindGoogleContactUI", "startAcitivtyForGetToken");
          paramIntent = new Intent("com.tencent.mm.gms.ACTION_GET_TOKEN");
          paramIntent.putExtra("gmail", this.wlL);
          paramIntent.putExtra("scope", "oauth2:https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds");
          startActivityForResult(paramIntent, 1004);
          GMTrace.o(1671547584512L, 12454);
          return;
        }
        abl();
        cbf();
        GMTrace.o(1671547584512L, 12454);
        return;
        paramInt1 = paramIntent.getIntExtra("error_code", -1);
        w.i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d errorMsg:%s", new Object[] { Integer.valueOf(paramInt1), paramIntent.getStringExtra("error_msg") });
        if (paramInt1 == 0)
        {
          this.wlT = paramIntent.getStringExtra("token");
          Cw(a.gFT);
          GMTrace.o(1671547584512L, 12454);
          return;
        }
        abl();
        cbf();
      }
    }
    if (paramInt1 == 1005)
    {
      this.wlJ = paramIntent.getBooleanExtra("gpservices", false);
      ar();
      GMTrace.o(1671547584512L, 12454);
      return;
    }
    abl();
    cbf();
    GMTrace.o(1671547584512L, 12454);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1670876495872L, 12449);
    super.onCreate(paramBundle);
    this.ipN = getIntent().getIntExtra("enter_scene", 0);
    this.iZm = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.wlJ = com.tencent.mm.modelfriend.n.bd(this);
    at.AR();
    this.wlL = ((String)com.tencent.mm.y.c.xh().get(208903, null));
    MP();
    if (this.wlJ)
    {
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 1005);
      GMTrace.o(1670876495872L, 12449);
      return;
    }
    ar();
    GMTrace.o(1670876495872L, 12449);
  }
  
  protected void onPause()
  {
    GMTrace.i(1671279149056L, 12452);
    super.onPause();
    at.wS().b(487, this);
    GMTrace.o(1671279149056L, 12452);
  }
  
  protected void onResume()
  {
    GMTrace.i(1671144931328L, 12451);
    super.onResume();
    at.wS().a(487, this);
    at.AR();
    this.wlS = ((Boolean)com.tencent.mm.y.c.xh().get(208905, Boolean.valueOf(false))).booleanValue();
    if (this.wlS)
    {
      cbg();
      this.wlS = false;
      at.AR();
      com.tencent.mm.y.c.xh().set(208905, Boolean.valueOf(false));
    }
    GMTrace.o(1671144931328L, 12451);
  }
  
  final class a
    extends AsyncTask<Void, Void, Void>
  {
    private String wlZ;
    private String wma;
    private boolean wmb;
    
    public a(String paramString)
    {
      GMTrace.i(1680808607744L, 12523);
      this.wlZ = paramString;
      GMTrace.o(1680808607744L, 12523);
    }
    
    /* Error */
    private Void aHf()
    {
      // Byte code:
      //   0: ldc2_w 49
      //   3: sipush 12525
      //   6: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: ldc 52
      //   11: ldc 54
      //   13: invokestatic 59	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   16: aload_0
      //   17: getfield 32	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$a:wlZ	Ljava/lang/String;
      //   20: astore_3
      //   21: ldc 61
      //   23: astore_2
      //   24: new 63	java/net/URL
      //   27: dup
      //   28: new 65	java/lang/StringBuilder
      //   31: dup
      //   32: ldc 67
      //   34: invokespecial 70	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   37: aload_3
      //   38: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   41: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   44: invokespecial 79	java/net/URL:<init>	(Ljava/lang/String;)V
      //   47: invokevirtual 83	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   50: checkcast 85	java/net/HttpURLConnection
      //   53: astore_3
      //   54: aload_3
      //   55: ldc 87
      //   57: ldc 89
      //   59: invokevirtual 92	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   62: aload_3
      //   63: ldc 94
      //   65: invokevirtual 97	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   68: aload_3
      //   69: sipush 20000
      //   72: invokevirtual 101	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   75: aload_3
      //   76: sipush 20000
      //   79: invokevirtual 104	java/net/HttpURLConnection:setReadTimeout	(I)V
      //   82: aload_3
      //   83: invokevirtual 108	java/net/HttpURLConnection:getResponseCode	()I
      //   86: istore_1
      //   87: ldc 52
      //   89: new 65	java/lang/StringBuilder
      //   92: dup
      //   93: ldc 110
      //   95: invokespecial 70	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   98: iload_1
      //   99: invokevirtual 113	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   102: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   105: invokestatic 116	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   108: sipush 200
      //   111: iload_1
      //   112: if_icmpne +110 -> 222
      //   115: new 118	java/lang/StringBuffer
      //   118: dup
      //   119: invokespecial 119	java/lang/StringBuffer:<init>	()V
      //   122: astore_2
      //   123: new 121	java/io/BufferedReader
      //   126: dup
      //   127: new 123	java/io/InputStreamReader
      //   130: dup
      //   131: aload_3
      //   132: invokevirtual 127	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   135: ldc 89
      //   137: invokespecial 130	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
      //   140: invokespecial 133	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
      //   143: astore 4
      //   145: aload 4
      //   147: invokevirtual 136	java/io/BufferedReader:readLine	()Ljava/lang/String;
      //   150: astore 5
      //   152: aload 5
      //   154: ifnull +43 -> 197
      //   157: aload_2
      //   158: aload 5
      //   160: invokevirtual 139	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   163: pop
      //   164: goto -19 -> 145
      //   167: astore_2
      //   168: ldc 52
      //   170: ldc -115
      //   172: iconst_1
      //   173: anewarray 143	java/lang/Object
      //   176: dup
      //   177: iconst_0
      //   178: aload_2
      //   179: invokevirtual 146	java/net/MalformedURLException:getMessage	()Ljava/lang/String;
      //   182: aastore
      //   183: invokestatic 149	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   186: ldc2_w 49
      //   189: sipush 12525
      //   192: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   195: aconst_null
      //   196: areturn
      //   197: aload 4
      //   199: invokevirtual 152	java/io/BufferedReader:close	()V
      //   202: aload_2
      //   203: invokevirtual 153	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   206: astore_2
      //   207: ldc 52
      //   209: ldc -101
      //   211: iconst_1
      //   212: anewarray 143	java/lang/Object
      //   215: dup
      //   216: iconst_0
      //   217: aload_2
      //   218: aastore
      //   219: invokestatic 157	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   222: aload_3
      //   223: invokevirtual 160	java/net/HttpURLConnection:disconnect	()V
      //   226: aload_0
      //   227: new 162	org/json/JSONObject
      //   230: dup
      //   231: aload_2
      //   232: invokespecial 163	org/json/JSONObject:<init>	(Ljava/lang/String;)V
      //   235: ldc -91
      //   237: invokevirtual 169	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
      //   240: putfield 171	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$a:wma	Ljava/lang/String;
      //   243: aload_0
      //   244: getfield 171	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$a:wma	Ljava/lang/String;
      //   247: invokestatic 177	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
      //   250: ifne -64 -> 186
      //   253: aload_0
      //   254: iconst_1
      //   255: putfield 179	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$a:wmb	Z
      //   258: goto -72 -> 186
      //   261: astore_2
      //   262: ldc 52
      //   264: ldc -75
      //   266: iconst_1
      //   267: anewarray 143	java/lang/Object
      //   270: dup
      //   271: iconst_0
      //   272: aload_2
      //   273: invokevirtual 182	java/net/ProtocolException:getMessage	()Ljava/lang/String;
      //   276: aastore
      //   277: invokestatic 149	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   280: goto -94 -> 186
      //   283: astore_2
      //   284: ldc 52
      //   286: ldc -72
      //   288: iconst_1
      //   289: anewarray 143	java/lang/Object
      //   292: dup
      //   293: iconst_0
      //   294: aload_2
      //   295: invokevirtual 185	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
      //   298: aastore
      //   299: invokestatic 149	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   302: goto -116 -> 186
      //   305: astore_2
      //   306: ldc 52
      //   308: ldc -69
      //   310: iconst_1
      //   311: anewarray 143	java/lang/Object
      //   314: dup
      //   315: iconst_0
      //   316: aload_2
      //   317: invokevirtual 188	java/io/IOException:getMessage	()Ljava/lang/String;
      //   320: aastore
      //   321: invokestatic 149	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   324: goto -138 -> 186
      //   327: astore_2
      //   328: ldc 52
      //   330: aload_2
      //   331: ldc 61
      //   333: iconst_0
      //   334: anewarray 143	java/lang/Object
      //   337: invokestatic 192	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   340: goto -154 -> 186
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	343	0	this	a
      //   86	27	1	i	int
      //   23	135	2	localObject1	Object
      //   167	36	2	localMalformedURLException	java.net.MalformedURLException
      //   206	26	2	str1	String
      //   261	12	2	localProtocolException	java.net.ProtocolException
      //   283	12	2	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
      //   305	12	2	localIOException	java.io.IOException
      //   327	4	2	localJSONException	org.json.JSONException
      //   20	203	3	localObject2	Object
      //   143	55	4	localBufferedReader	java.io.BufferedReader
      //   150	9	5	str2	String
      // Exception table:
      //   from	to	target	type
      //   16	21	167	java/net/MalformedURLException
      //   24	108	167	java/net/MalformedURLException
      //   115	145	167	java/net/MalformedURLException
      //   145	152	167	java/net/MalformedURLException
      //   157	164	167	java/net/MalformedURLException
      //   197	222	167	java/net/MalformedURLException
      //   222	258	167	java/net/MalformedURLException
      //   16	21	261	java/net/ProtocolException
      //   24	108	261	java/net/ProtocolException
      //   115	145	261	java/net/ProtocolException
      //   145	152	261	java/net/ProtocolException
      //   157	164	261	java/net/ProtocolException
      //   197	222	261	java/net/ProtocolException
      //   222	258	261	java/net/ProtocolException
      //   16	21	283	java/io/UnsupportedEncodingException
      //   24	108	283	java/io/UnsupportedEncodingException
      //   115	145	283	java/io/UnsupportedEncodingException
      //   145	152	283	java/io/UnsupportedEncodingException
      //   157	164	283	java/io/UnsupportedEncodingException
      //   197	222	283	java/io/UnsupportedEncodingException
      //   222	258	283	java/io/UnsupportedEncodingException
      //   16	21	305	java/io/IOException
      //   24	108	305	java/io/IOException
      //   115	145	305	java/io/IOException
      //   145	152	305	java/io/IOException
      //   157	164	305	java/io/IOException
      //   197	222	305	java/io/IOException
      //   222	258	305	java/io/IOException
      //   16	21	327	org/json/JSONException
      //   24	108	327	org/json/JSONException
      //   115	145	327	org/json/JSONException
      //   145	152	327	org/json/JSONException
      //   157	164	327	org/json/JSONException
      //   197	222	327	org/json/JSONException
      //   222	258	327	org/json/JSONException
    }
    
    protected final void onPreExecute()
    {
      GMTrace.i(1680942825472L, 12524);
      super.onPreExecute();
      w.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
      this.wmb = false;
      GMTrace.o(1680942825472L, 12524);
    }
  }
  
  final class b
    extends AsyncTask<Void, Void, Void>
  {
    private boolean eFN;
    private String wlZ;
    private String wmc;
    private String wmd;
    
    public b(String paramString)
    {
      GMTrace.i(1669668536320L, 12440);
      this.wmc = paramString;
      GMTrace.o(1669668536320L, 12440);
    }
    
    /* Error */
    private Void aHf()
    {
      // Byte code:
      //   0: ldc2_w 48
      //   3: sipush 12442
      //   6: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: aload_0
      //   10: getfield 33	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$b:wmc	Ljava/lang/String;
      //   13: astore 4
      //   15: ldc 51
      //   17: astore_2
      //   18: new 53	java/net/URL
      //   21: dup
      //   22: ldc 55
      //   24: invokespecial 58	java/net/URL:<init>	(Ljava/lang/String;)V
      //   27: invokevirtual 62	java/net/URL:openConnection	()Ljava/net/URLConnection;
      //   30: checkcast 64	java/net/HttpURLConnection
      //   33: astore_3
      //   34: aload_3
      //   35: ldc 66
      //   37: ldc 68
      //   39: invokevirtual 72	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   42: aload_3
      //   43: ldc 74
      //   45: ldc 76
      //   47: invokevirtual 72	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   50: aload_3
      //   51: ldc 78
      //   53: invokevirtual 81	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
      //   56: aload_3
      //   57: sipush 20000
      //   60: invokevirtual 85	java/net/HttpURLConnection:setConnectTimeout	(I)V
      //   63: aload_3
      //   64: sipush 20000
      //   67: invokevirtual 88	java/net/HttpURLConnection:setReadTimeout	(I)V
      //   70: aload_3
      //   71: iconst_1
      //   72: invokevirtual 92	java/net/HttpURLConnection:setDoInput	(Z)V
      //   75: aload_3
      //   76: iconst_1
      //   77: invokevirtual 95	java/net/HttpURLConnection:setDoOutput	(Z)V
      //   80: new 97	java/util/ArrayList
      //   83: dup
      //   84: invokespecial 98	java/util/ArrayList:<init>	()V
      //   87: astore 5
      //   89: aload 5
      //   91: new 100	org/apache/http/message/BasicNameValuePair
      //   94: dup
      //   95: ldc 102
      //   97: aload 4
      //   99: invokespecial 104	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   102: invokeinterface 110 2 0
      //   107: pop
      //   108: aload 5
      //   110: new 100	org/apache/http/message/BasicNameValuePair
      //   113: dup
      //   114: ldc 112
      //   116: ldc 114
      //   118: invokespecial 104	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   121: invokeinterface 110 2 0
      //   126: pop
      //   127: aload 5
      //   129: new 100	org/apache/http/message/BasicNameValuePair
      //   132: dup
      //   133: ldc 116
      //   135: ldc 118
      //   137: invokespecial 104	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   140: invokeinterface 110 2 0
      //   145: pop
      //   146: aload 5
      //   148: new 100	org/apache/http/message/BasicNameValuePair
      //   151: dup
      //   152: ldc 120
      //   154: ldc 122
      //   156: invokespecial 104	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   159: invokeinterface 110 2 0
      //   164: pop
      //   165: aload 5
      //   167: new 100	org/apache/http/message/BasicNameValuePair
      //   170: dup
      //   171: ldc 124
      //   173: ldc 126
      //   175: invokespecial 104	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   178: invokeinterface 110 2 0
      //   183: pop
      //   184: aload 5
      //   186: invokestatic 132	com/tencent/mm/modelfriend/n:G	(Ljava/util/List;)Ljava/lang/String;
      //   189: astore 4
      //   191: ldc -122
      //   193: ldc -120
      //   195: iconst_1
      //   196: anewarray 138	java/lang/Object
      //   199: dup
      //   200: iconst_0
      //   201: aload 4
      //   203: aastore
      //   204: invokestatic 143	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   207: aload_3
      //   208: ldc -111
      //   210: aload 4
      //   212: invokevirtual 151	java/lang/String:getBytes	()[B
      //   215: arraylength
      //   216: invokestatic 155	java/lang/String:valueOf	(I)Ljava/lang/String;
      //   219: invokevirtual 72	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   222: new 157	java/io/BufferedWriter
      //   225: dup
      //   226: new 159	java/io/OutputStreamWriter
      //   229: dup
      //   230: aload_3
      //   231: invokevirtual 163	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
      //   234: ldc 68
      //   236: invokespecial 166	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/lang/String;)V
      //   239: invokespecial 169	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
      //   242: astore 5
      //   244: aload 5
      //   246: aload 4
      //   248: invokevirtual 172	java/io/BufferedWriter:write	(Ljava/lang/String;)V
      //   251: aload 5
      //   253: invokevirtual 175	java/io/BufferedWriter:flush	()V
      //   256: aload 5
      //   258: invokevirtual 178	java/io/BufferedWriter:close	()V
      //   261: aload_3
      //   262: invokevirtual 182	java/net/HttpURLConnection:getResponseCode	()I
      //   265: istore_1
      //   266: ldc -122
      //   268: new 184	java/lang/StringBuilder
      //   271: dup
      //   272: ldc -70
      //   274: invokespecial 187	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   277: iload_1
      //   278: invokevirtual 191	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
      //   281: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   284: invokestatic 198	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   287: sipush 200
      //   290: iload_1
      //   291: if_icmpne +116 -> 407
      //   294: new 200	java/lang/StringBuffer
      //   297: dup
      //   298: invokespecial 201	java/lang/StringBuffer:<init>	()V
      //   301: astore_2
      //   302: new 203	java/io/BufferedReader
      //   305: dup
      //   306: new 205	java/io/InputStreamReader
      //   309: dup
      //   310: aload_3
      //   311: invokevirtual 209	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
      //   314: ldc 68
      //   316: invokespecial 212	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
      //   319: invokespecial 215	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
      //   322: astore 4
      //   324: aload 4
      //   326: invokevirtual 218	java/io/BufferedReader:readLine	()Ljava/lang/String;
      //   329: astore 5
      //   331: aload 5
      //   333: ifnull +49 -> 382
      //   336: aload_2
      //   337: aload 5
      //   339: invokevirtual 221	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
      //   342: pop
      //   343: goto -19 -> 324
      //   346: astore_2
      //   347: ldc -122
      //   349: new 184	java/lang/StringBuilder
      //   352: dup
      //   353: ldc -33
      //   355: invokespecial 187	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   358: aload_2
      //   359: invokevirtual 226	java/net/MalformedURLException:getMessage	()Ljava/lang/String;
      //   362: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   365: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   368: invokestatic 198	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   371: ldc2_w 48
      //   374: sipush 12442
      //   377: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   380: aconst_null
      //   381: areturn
      //   382: aload 4
      //   384: invokevirtual 230	java/io/BufferedReader:close	()V
      //   387: aload_2
      //   388: invokevirtual 231	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   391: astore_2
      //   392: ldc -122
      //   394: ldc -23
      //   396: iconst_1
      //   397: anewarray 138	java/lang/Object
      //   400: dup
      //   401: iconst_0
      //   402: aload_2
      //   403: aastore
      //   404: invokestatic 143	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   407: aload_3
      //   408: invokevirtual 236	java/net/HttpURLConnection:disconnect	()V
      //   411: aload_0
      //   412: new 238	org/json/JSONObject
      //   415: dup
      //   416: aload_2
      //   417: invokespecial 239	org/json/JSONObject:<init>	(Ljava/lang/String;)V
      //   420: ldc -15
      //   422: invokevirtual 245	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
      //   425: putfield 247	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$b:wlZ	Ljava/lang/String;
      //   428: aload_0
      //   429: new 238	org/json/JSONObject
      //   432: dup
      //   433: aload_2
      //   434: invokespecial 239	org/json/JSONObject:<init>	(Ljava/lang/String;)V
      //   437: ldc -7
      //   439: invokevirtual 245	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
      //   442: putfield 251	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$b:wmd	Ljava/lang/String;
      //   445: ldc -122
      //   447: ldc -3
      //   449: iconst_1
      //   450: anewarray 138	java/lang/Object
      //   453: dup
      //   454: iconst_0
      //   455: aload_2
      //   456: aastore
      //   457: invokestatic 143	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   460: ldc -122
      //   462: ldc -1
      //   464: iconst_1
      //   465: anewarray 138	java/lang/Object
      //   468: dup
      //   469: iconst_0
      //   470: aload_0
      //   471: getfield 247	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$b:wlZ	Ljava/lang/String;
      //   474: aastore
      //   475: invokestatic 143	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   478: ldc -122
      //   480: ldc_w 257
      //   483: iconst_1
      //   484: anewarray 138	java/lang/Object
      //   487: dup
      //   488: iconst_0
      //   489: aload_0
      //   490: getfield 251	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$b:wmd	Ljava/lang/String;
      //   493: aastore
      //   494: invokestatic 143	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   497: aload_0
      //   498: iconst_1
      //   499: putfield 259	com/tencent/mm/ui/bindgooglecontact/BindGoogleContactUI$b:eFN	Z
      //   502: goto -131 -> 371
      //   505: astore_2
      //   506: ldc -122
      //   508: new 184	java/lang/StringBuilder
      //   511: dup
      //   512: ldc_w 261
      //   515: invokespecial 187	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   518: aload_2
      //   519: invokevirtual 262	java/net/ProtocolException:getMessage	()Ljava/lang/String;
      //   522: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   525: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   528: invokestatic 198	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   531: goto -160 -> 371
      //   534: astore_2
      //   535: ldc -122
      //   537: new 184	java/lang/StringBuilder
      //   540: dup
      //   541: ldc_w 264
      //   544: invokespecial 187	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   547: aload_2
      //   548: invokevirtual 265	java/io/IOException:getMessage	()Ljava/lang/String;
      //   551: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   554: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   557: invokestatic 198	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   560: goto -189 -> 371
      //   563: astore_2
      //   564: ldc -122
      //   566: new 184	java/lang/StringBuilder
      //   569: dup
      //   570: ldc_w 267
      //   573: invokespecial 187	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   576: aload_2
      //   577: invokevirtual 268	org/json/JSONException:getMessage	()Ljava/lang/String;
      //   580: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   583: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   586: invokestatic 198	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   589: goto -218 -> 371
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	592	0	this	b
      //   265	27	1	i	int
      //   17	320	2	localObject1	Object
      //   346	42	2	localMalformedURLException	java.net.MalformedURLException
      //   391	65	2	str	String
      //   505	14	2	localProtocolException	java.net.ProtocolException
      //   534	14	2	localIOException	java.io.IOException
      //   563	14	2	localJSONException	org.json.JSONException
      //   33	375	3	localHttpURLConnection	java.net.HttpURLConnection
      //   13	370	4	localObject2	Object
      //   87	251	5	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   9	15	346	java/net/MalformedURLException
      //   18	287	346	java/net/MalformedURLException
      //   294	324	346	java/net/MalformedURLException
      //   324	331	346	java/net/MalformedURLException
      //   336	343	346	java/net/MalformedURLException
      //   382	407	346	java/net/MalformedURLException
      //   407	502	346	java/net/MalformedURLException
      //   9	15	505	java/net/ProtocolException
      //   18	287	505	java/net/ProtocolException
      //   294	324	505	java/net/ProtocolException
      //   324	331	505	java/net/ProtocolException
      //   336	343	505	java/net/ProtocolException
      //   382	407	505	java/net/ProtocolException
      //   407	502	505	java/net/ProtocolException
      //   9	15	534	java/io/IOException
      //   18	287	534	java/io/IOException
      //   294	324	534	java/io/IOException
      //   324	331	534	java/io/IOException
      //   336	343	534	java/io/IOException
      //   382	407	534	java/io/IOException
      //   407	502	534	java/io/IOException
      //   9	15	563	org/json/JSONException
      //   18	287	563	org/json/JSONException
      //   294	324	563	org/json/JSONException
      //   324	331	563	org/json/JSONException
      //   336	343	563	org/json/JSONException
      //   382	407	563	org/json/JSONException
      //   407	502	563	org/json/JSONException
    }
    
    protected final void onPreExecute()
    {
      GMTrace.i(1669802754048L, 12441);
      super.onPreExecute();
      w.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
      this.wlZ = "";
      this.wmd = "";
      this.eFN = false;
      GMTrace.o(1669802754048L, 12441);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\bindgooglecontact\BindGoogleContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */