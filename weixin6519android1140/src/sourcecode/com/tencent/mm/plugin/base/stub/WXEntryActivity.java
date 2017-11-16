package com.tencent.mm.plugin.base.stub;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.i;
import com.tencent.mm.modelsimple.ai;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.appbrand.k.b;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.c.bdv;
import com.tencent.mm.protocal.c.bjv;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.t.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.Map;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXEntryActivity
  extends AutoLoginActivity
  implements com.tencent.mm.ad.e
{
  private String appId;
  private String authority;
  private String content;
  private ProgressDialog htG;
  private int jje;
  private String tF;
  private Uri uri;
  
  public WXEntryActivity()
  {
    GMTrace.i(12843025956864L, 95688);
    GMTrace.o(12843025956864L, 95688);
  }
  
  private void agR()
  {
    GMTrace.i(12844905005056L, 95702);
    ReportUtil.a(this, ReportUtil.b(s.ah(getIntent()), -2));
    finish();
    GMTrace.o(12844905005056L, 95702);
  }
  
  private void agS()
  {
    GMTrace.i(12845039222784L, 95703);
    ReportUtil.a(this, ReportUtil.b(s.ah(getIntent()), -6));
    finish();
    GMTrace.o(12845039222784L, 95703);
  }
  
  private static boolean checkSumConsistent(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(12844368134144L, 95698);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length == 0) || (paramArrayOfByte2 == null) || (paramArrayOfByte2.length == 0))
    {
      w.e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, invalid arguments");
      GMTrace.o(12844368134144L, 95698);
      return false;
    }
    if (paramArrayOfByte1.length != paramArrayOfByte2.length)
    {
      w.e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, length is different");
      GMTrace.o(12844368134144L, 95698);
      return false;
    }
    int i = 0;
    while (i < paramArrayOfByte1.length)
    {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i])
      {
        GMTrace.o(12844368134144L, 95698);
        return false;
      }
      i += 1;
    }
    GMTrace.o(12844368134144L, 95698);
    return true;
  }
  
  private void goBack()
  {
    GMTrace.i(12844770787328L, 95701);
    View localView = findViewById(R.h.bZT);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      agS();
      GMTrace.o(12844770787328L, 95701);
      return;
    }
    agR();
    GMTrace.o(12844770787328L, 95701);
  }
  
  private boolean h(k paramk)
  {
    GMTrace.i(12843831263232L, 95694);
    Object localObject = getIntent();
    int i = s.h(getIntent().getExtras(), "_wxapi_command_type");
    w.i("MicroMsg.WXEntryActivity", "dealRequest, cmd = %d, authority = %s", new Object[] { Integer.valueOf(i), this.authority });
    if (("sendreq".equals(this.authority)) || ("sendresp".equals(this.authority)))
    {
      if (!at.AU())
      {
        w.w("MicroMsg.WXEntryActivity", "accHasReady not ready, do nothing");
        GMTrace.o(12843831263232L, 95694);
        return false;
      }
      f localf = com.tencent.mm.pluginsdk.model.app.g.aP(this.appId, true);
      if (localf == null)
      {
        w.w("MicroMsg.WXEntryActivity", "app not reg, do nothing");
        GMTrace.o(12843831263232L, 95694);
        return false;
      }
      if (!com.tencent.mm.pluginsdk.model.app.p.b(this, localf, this.tF))
      {
        w.e("MicroMsg.WXEntryActivity", "send fail, check app fail, force to get app info from server again : %s", new Object[] { this.appId });
        an.aWx().Ov(this.appId);
        agS();
        a(this, localf, this.tF, i);
        GMTrace.o(12843831263232L, 95694);
        return false;
      }
      SendMessageToWX.Req localReq = new SendMessageToWX.Req(((Intent)localObject).getExtras());
      if (localReq.scene == 2)
      {
        paramk = new Intent();
        paramk.addFlags(268435456).addFlags(67108864);
        paramk.putExtras(((Intent)localObject).getExtras());
        if ((localReq.message != null) && (localReq.message.getType() == 5))
        {
          w.d("MicroMsg.WXEntryActivity", "report(11954), appId : %s", new Object[] { localf.field_appId });
          localObject = u.gy("app_" + localf.field_appId);
          u.Av().p((String)localObject, true).o("prePublishId", "app_" + localf.field_appId);
          paramk.putExtra("reportSessionId", (String)localObject);
        }
        d.b(this, "favorite", ".ui.FavOpenApiEntry", paramk);
        GMTrace.o(12843831263232L, 95694);
        return true;
      }
      if ((paramk != null) && (localReq.message != null) && (localReq.message.getType() == 7))
      {
        paramk = ((ai)paramk).LM();
        if ((paramk != null) && (paramk.uUK != null) && (!t.nm(paramk.uUK.url)))
        {
          w.i("MicroMsg.WXEntryActivity", "change appextend to Webpage,url :%s", new Object[] { paramk.uUK.url });
          localReq.message.mediaObject = new WXWebpageObject(paramk.uUK.url);
          paramk = new Bundle();
          localReq.toBundle(paramk);
          ((Intent)localObject).putExtras(paramk);
        }
      }
      startActivity(new Intent(this, UIEntryStub.class).addFlags(268435456).addFlags(67108864).putExtras(((Intent)localObject).getExtras()));
      GMTrace.o(12843831263232L, 95694);
      return true;
    }
    w.e("MicroMsg.WXEntryActivity", "unknown authority, should never reached, authority=" + this.authority);
    GMTrace.o(12843831263232L, 95694);
    return false;
  }
  
  private static boolean kT(int paramInt)
  {
    GMTrace.i(12844099698688L, 95696);
    if (paramInt >= 553713665)
    {
      GMTrace.o(12844099698688L, 95696);
      return true;
    }
    GMTrace.o(12844099698688L, 95696);
    return false;
  }
  
  private static byte[] o(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(12844233916416L, 95697);
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString1 != null) {
      localStringBuffer.append(paramString1);
    }
    localStringBuffer.append(paramInt);
    localStringBuffer.append(paramString2);
    localStringBuffer.append("mMcShCsTr");
    paramString1 = com.tencent.mm.a.g.n(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    GMTrace.o(12844233916416L, 95697);
    return paramString1;
  }
  
  private static String tx(String paramString)
  {
    GMTrace.i(12843697045504L, 95693);
    if (t.nm(paramString))
    {
      GMTrace.o(12843697045504L, 95693);
      return "";
    }
    try
    {
      String str = URLEncoder.encode(paramString);
      GMTrace.o(12843697045504L, 95693);
      return str;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.WXEntryActivity", "urlEncode fail, str = %s, ex = %s", new Object[] { paramString, localException.getMessage() });
      GMTrace.o(12843697045504L, 95693);
    }
    return paramString;
  }
  
  private boolean z(Intent paramIntent)
  {
    GMTrace.i(12843294392320L, 95690);
    this.jje = s.a(paramIntent, "_mmessage_sdkVersion", 0);
    this.content = s.i(paramIntent, "_mmessage_content");
    if (this.content != null)
    {
      this.uri = Uri.parse(this.content);
      this.authority = this.uri.getAuthority();
      try
      {
        this.appId = this.uri.getQueryParameter("appid");
        this.tF = s.i(paramIntent, "_mmessage_appPackage");
        GMTrace.o(12843294392320L, 95690);
        return true;
      }
      catch (Exception paramIntent)
      {
        w.e("MicroMsg.WXEntryActivity", "init: %s", new Object[] { paramIntent.toString() });
        GMTrace.o(12843294392320L, 95690);
        return false;
      }
    }
    GMTrace.o(12843294392320L, 95690);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12844502351872L, 95699);
    w.i("MicroMsg.WXEntryActivity", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    at.wS().b(1200, this);
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (ai)paramk;
      if (paramString.LM() == null) {
        break label533;
      }
    }
    label533:
    for (paramInt1 = paramString.LM().version;; paramInt1 = 0)
    {
      w.i("MicroMsg.WXEntryActivity", "server appversion = %d", new Object[] { Integer.valueOf(paramInt1) });
      paramString = com.tencent.mm.pluginsdk.model.app.g.aP(this.appId, false);
      if (paramString == null)
      {
        w.e("MicroMsg.WXEntryActivity", "null appinfo");
        a.a.aWD().Eu(this.appId);
      }
      for (;;)
      {
        h(paramk);
        finish();
        GMTrace.o(12844502351872L, 95699);
        return;
        paramInt2 = paramString.field_appVersion;
        w.i("MicroMsg.WXEntryActivity", "local appversion = %d", new Object[] { Integer.valueOf(paramInt2) });
        if (paramInt2 < paramInt1) {
          a.a.aWD().Eu(this.appId);
        }
      }
      if (t.a.a(this, paramInt1, paramInt2, null, 4))
      {
        w.i("MicroMsg.WXEntryActivity", "mm error processor process this errcode");
        finish();
        GMTrace.o(12844502351872L, 95699);
        return;
      }
      if (com.tencent.mm.kernel.a.wF())
      {
        w.w("MicroMsg.WXEntryActivity", "account is hold, do finish");
        finish();
        GMTrace.o(12844502351872L, 95699);
        return;
      }
      findViewById(R.h.bZT).setVisibility(0);
      oM(R.l.ecE);
      TextView localTextView = (TextView)findViewById(R.h.cet);
      if (!t.nm(paramString))
      {
        paramk = paramString;
        if (paramString.startsWith("autoauth_errmsg_")) {
          paramk = paramString.substring(16);
        }
        paramString = paramk;
        if (paramk.startsWith("<e>"))
        {
          Map localMap = bh.q(paramk, "e");
          paramString = paramk;
          if (localMap != null)
          {
            paramString = paramk;
            if (!t.nm((String)localMap.get(".e.Content"))) {
              paramString = (String)localMap.get(".e.Content");
            }
          }
        }
        localTextView.setText(getString(R.l.ecF, new Object[] { paramString }));
      }
      paramString = (Button)findViewById(R.h.bfw);
      paramk = com.tencent.mm.pluginsdk.model.app.g.m(this, this.appId);
      w.i("MicroMsg.WXEntryActivity", "appName = %s", new Object[] { paramk });
      if (!t.nm(paramk)) {
        paramString.setText(getString(R.l.ecC) + paramk);
      }
      for (;;)
      {
        paramString.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(12833764933632L, 95619);
            WXEntryActivity.c(WXEntryActivity.this);
            WXEntryActivity.this.finish();
            GMTrace.o(12833764933632L, 95619);
          }
        });
        GMTrace.o(12844502351872L, 95699);
        return;
        paramString.setText(R.l.ecC);
      }
    }
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    GMTrace.i(12843562827776L, 95692);
    w.d("MicroMsg.WXEntryActivity", "postLogin, loginResult = " + parama);
    z(paramIntent);
    int i;
    switch (4.jjk[parama.ordinal()])
    {
    default: 
      w.e("MicroMsg.WXEntryActivity", "postLogin, unknown login result = " + parama);
      finish();
      GMTrace.o(12843562827776L, 95692);
      return;
    case 1: 
      if ((getIntent() == null) || (getIntent().getExtras() == null))
      {
        w.e("MicroMsg.WXEntryActivity", "checkCanShare fail, invalid intent/extras");
        finish();
        GMTrace.o(12843562827776L, 95692);
        return;
      }
      i = s.h(getIntent().getExtras(), "_wxapi_command_type");
      w.i("MicroMsg.WXEntryActivity", "checkCanShare, cmd = %d", new Object[] { Integer.valueOf(i) });
      if (i == 1)
      {
        w.i("MicroMsg.WXEntryActivity", "it is auth, just dealrequest");
        h(null);
        finish();
        GMTrace.o(12843562827776L, 95692);
        return;
      }
      paramIntent = new SendMessageToWX.Req(getIntent().getExtras());
      parama = paramIntent.message;
      if (parama == null)
      {
        w.e("MicroMsg.WXEntryActivity", "wxmsg is null, how could it be?, directly deal request");
        h(null);
        finish();
        GMTrace.o(12843562827776L, 95692);
        return;
      }
      if (parama.getType() == 36) {
        paramIntent.scene = 0;
      }
      if (paramIntent.scene == 2) {
        i = 3;
      }
      break;
    }
    for (;;)
    {
      if (parama.getType() == 1)
      {
        paramIntent = (WXTextObject)parama.mediaObject;
        parama = String.format("weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s", new Object[] { this.appId, Integer.valueOf(i), tx(paramIntent.text), "", parama.getType() });
      }
      for (;;)
      {
        this.htG = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(12835912417280L, 95635);
            WXEntryActivity.b(WXEntryActivity.this);
            WXEntryActivity.this.finish();
            GMTrace.o(12835912417280L, 95635);
          }
        });
        at.wS().a(1200, this);
        parama = new ai(parama, 1, new LinkedList());
        at.wS().a(parama, 0);
        GMTrace.o(12843562827776L, 95692);
        return;
        if (paramIntent.scene == 1)
        {
          i = 2;
          break;
        }
        if (paramIntent.scene != 0) {
          break label810;
        }
        i = 1;
        break;
        if (parama.getType() == 5)
        {
          paramIntent = (WXWebpageObject)parama.mediaObject;
          parama = String.format("weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s", new Object[] { this.appId, Integer.valueOf(i), tx(parama.description), tx(paramIntent.webpageUrl), parama.getType() });
        }
        else if (parama.getType() == 36)
        {
          paramIntent = (WXMiniProgramObject)parama.mediaObject;
          ((b)com.tencent.mm.kernel.h.h(b.class)).a(paramIntent.userName, null);
          parama = String.format("weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s&appbrandusername=%s&appbrandpath=%s", new Object[] { this.appId, Integer.valueOf(i), tx(parama.description), tx(paramIntent.webpageUrl), parama.getType(), paramIntent.userName, tx(paramIntent.path) });
        }
        else
        {
          parama = String.format("weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s", new Object[] { this.appId, Integer.valueOf(i), tx(parama.description), "", parama.getType() });
        }
      }
      agR();
      w.e("MicroMsg.WXEntryActivity", "postLogin fail, loginResult = " + parama);
      break;
      ReportUtil.a(this, ReportUtil.b(s.ah(getIntent()), -1));
      finish();
      w.e("MicroMsg.WXEntryActivity", "postLogin fail, loginResult = " + parama);
      break;
      label810:
      i = 0;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12843965480960L, 95695);
    int i = R.i.cFr;
    GMTrace.o(12843965480960L, 95695);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12843160174592L, 95689);
    s.b(getIntent(), "key_auto_login_wizard_exit", true);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12827725135872L, 95574);
        WXEntryActivity.a(WXEntryActivity.this);
        GMTrace.o(12827725135872L, 95574);
        return false;
      }
    });
    GMTrace.o(12843160174592L, 95689);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12845173440512L, 95704);
    super.onDestroy();
    at.wS().b(1200, this);
    GMTrace.o(12845173440512L, 95704);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12844636569600L, 95700);
    if ((paramKeyEvent.getRepeatCount() == 0) && (paramKeyEvent.getKeyCode() == 4))
    {
      w.i("MicroMsg.WXEntryActivity", "user click back button");
      goBack();
      GMTrace.o(12844636569600L, 95700);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12844636569600L, 95700);
    return bool;
  }
  
  protected final boolean y(Intent paramIntent)
  {
    GMTrace.i(12843428610048L, 95691);
    if (!z(paramIntent))
    {
      w.e("MicroMsg.WXEntryActivity", "Init failed");
      finish();
      GMTrace.o(12843428610048L, 95691);
      return false;
    }
    if ((!at.AU()) || (at.wF()))
    {
      w.w("MicroMsg.WXEntryActivity", "preLogin not login, save the appid : %s", new Object[] { this.appId });
      com.tencent.mm.pluginsdk.model.app.p.OD(this.appId);
    }
    if (!kT(this.jje))
    {
      w.e("MicroMsg.WXEntryActivity", "sdk version is not supported, sdkVersion = " + this.jje);
      finish();
      GMTrace.o(12843428610048L, 95691);
      return false;
    }
    if (this.uri == null)
    {
      w.e("MicroMsg.WXEntryActivity", "check appid failed, null content");
      finish();
      GMTrace.o(12843428610048L, 95691);
      return false;
    }
    w.i("MicroMsg.WXEntryActivity", "preLogin, appId = " + this.appId);
    if (t.nm(this.appId))
    {
      w.e("MicroMsg.WXEntryActivity", "invalid appid, ignore");
      finish();
      GMTrace.o(12843428610048L, 95691);
      return false;
    }
    w.i("MicroMsg.WXEntryActivity", "preLogin, pkg = " + this.tF);
    if (t.nm(this.tF))
    {
      w.e("MicroMsg.WXEntryActivity", "unknown package, ignore");
      finish();
      GMTrace.o(12843428610048L, 95691);
      return false;
    }
    if (!checkSumConsistent(s.j(paramIntent, "_mmessage_checksum"), o(this.content, this.jje, this.tF)))
    {
      w.e("MicroMsg.WXEntryActivity", "checksum fail");
      finish();
      GMTrace.o(12843428610048L, 95691);
      return false;
    }
    GMTrace.o(12843428610048L, 95691);
    return true;
  }
  
  @JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public static class EntryReceiver
    extends BroadcastReceiver
  {
    private static ae handler;
    private String appId;
    private String appName;
    private Context context;
    private long jjD;
    private int jje;
    private String tF;
    
    public EntryReceiver()
    {
      GMTrace.i(12838865207296L, 95657);
      GMTrace.o(12838865207296L, 95657);
    }
    
    public void onReceive(final Context paramContext, final Intent paramIntent)
    {
      GMTrace.i(12838999425024L, 95658);
      if ((paramContext == null) || (paramIntent == null))
      {
        GMTrace.o(12838999425024L, 95658);
        return;
      }
      d.bNA();
      if (handler == null)
      {
        HandlerThread localHandlerThread = com.tencent.mm.sdk.f.e.SV("WXEntryReceiver");
        localHandlerThread.start();
        handler = new ae(localHandlerThread.getLooper());
      }
      if (!com.tencent.mm.kernel.h.xz().fZy.fZU)
      {
        com.tencent.mm.kernel.h.xz().a(new com.tencent.mm.kernel.api.h()
        {
          public final void as(boolean paramAnonymousBoolean)
          {
            GMTrace.i(19113141338112L, 142404);
            GMTrace.o(19113141338112L, 142404);
          }
          
          public final void pe()
          {
            GMTrace.i(19113007120384L, 142403);
            com.tencent.mm.kernel.h.xz().b(this);
            WXEntryActivity.EntryReceiver.a(WXEntryActivity.EntryReceiver.this, paramContext, paramIntent);
            GMTrace.o(19113007120384L, 142403);
          }
        });
        GMTrace.o(12838999425024L, 95658);
        return;
      }
      handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(21052453289984L, 156853);
          long l = System.currentTimeMillis();
          WXEntryActivity.EntryReceiver.a(WXEntryActivity.EntryReceiver.this, paramContext, paramIntent);
          w.i("MicroMsg.WXEntryActivity", "cost:%s", new Object[] { System.currentTimeMillis() - l });
          GMTrace.o(21052453289984L, 156853);
        }
      });
      GMTrace.o(12838999425024L, 95658);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\base\stub\WXEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */