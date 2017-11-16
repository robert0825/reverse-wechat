package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.gv;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Req;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Resp;
import com.tencent.mm.plugin.webview.model.u;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.protocal.c.aqt;
import com.tencent.mm.protocal.c.bad;
import com.tencent.mm.protocal.c.baf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;

public final class SDKOAuthUI
  extends MMActivity
  implements e
{
  private String hyD;
  private r ihl;
  private SendAuth.Req rJj;
  private aj rJk;
  private a rJl;
  private boolean rJm;
  
  public SDKOAuthUI()
  {
    GMTrace.i(18095234088960L, 134820);
    GMTrace.o(18095234088960L, 134820);
  }
  
  private void Mb(String paramString)
  {
    String str1 = null;
    GMTrace.i(18096307830784L, 134828);
    w.i("MicroMsg.SdkOAuthUI", "dealWithLoginCallback url : %s", new Object[] { paramString });
    String str2 = Md(this.hyD);
    if (bg.nm(str2))
    {
      w.e("MicroMsg.SdkOAuthUI", "dealWithLoginCallback pkg nil");
      GMTrace.o(18096307830784L, 134828);
      return;
    }
    SendAuth.Resp localResp = new SendAuth.Resp();
    localResp.transaction = this.rJj.transaction;
    localResp.lang = bDJ();
    localResp.country = getCountry();
    if (!bg.nm(paramString)) {}
    for (Uri localUri = Uri.parse(paramString);; localUri = null)
    {
      if (localUri != null)
      {
        str1 = localUri.getQueryParameter("code");
        localResp.state = localUri.getQueryParameter("state");
        localResp.errStr = localUri.getQueryParameter("reason");
      }
      if (bg.nm(str1)) {
        localResp.errCode = -1;
      }
      for (;;)
      {
        localResp.url = paramString;
        w.i("MicroMsg.SdkOAuthUI", "dealWithLoginCallback, pkg:%s code:%s errCode:%d state:%s", new Object[] { str2, localResp.code, Integer.valueOf(localResp.errCode), localResp.state });
        a(str2, localResp);
        finish();
        GMTrace.o(18096307830784L, 134828);
        return;
        if (str1.toLowerCase().equals("authdeny"))
        {
          localResp.errCode = -4;
        }
        else
        {
          localResp.errCode = 0;
          localResp.code = str1;
        }
      }
    }
  }
  
  private void Mc(final String paramString)
  {
    GMTrace.i(18096710483968L, 134831);
    h.a(this, paramString, getString(R.l.ekD), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18093220823040L, 134805);
        SDKOAuthUI.b(SDKOAuthUI.this, paramString);
        GMTrace.o(18093220823040L, 134805);
      }
    });
    GMTrace.o(18096710483968L, 134831);
  }
  
  private static String Md(String paramString)
  {
    GMTrace.i(18097515790336L, 134837);
    Object localObject = null;
    f localf = com.tencent.mm.pluginsdk.model.app.g.aP(paramString, false);
    if (localf != null) {}
    for (paramString = localf.field_packageName;; paramString = (String)localObject)
    {
      GMTrace.o(18097515790336L, 134837);
      return paramString;
      w.w("MicroMsg.SdkOAuthUI", "dealWithCancel getAppInfo null; appid: %s", new Object[] { paramString });
    }
  }
  
  private void a(String paramString, SendAuth.Resp paramResp)
  {
    GMTrace.i(18096576266240L, 134830);
    if (this.rJm)
    {
      w.i("MicroMsg.SdkOAuthUI", "doCallback has callback");
      GMTrace.o(18096576266240L, 134830);
      return;
    }
    if (bg.nm(paramString))
    {
      GMTrace.o(18096576266240L, 134830);
      return;
    }
    this.rJm = true;
    Bundle localBundle = new Bundle();
    paramResp.toBundle(localBundle);
    p.ag(localBundle);
    paramResp = new MMessageActV2.Args();
    paramResp.targetPkgName = paramString;
    paramResp.bundle = localBundle;
    MMessageActV2.send(this, paramResp);
    GMTrace.o(18096576266240L, 134830);
  }
  
  private void bDG()
  {
    GMTrace.i(18096442048512L, 134829);
    w.i("MicroMsg.SdkOAuthUI", "dealWithCancel");
    if (this.rJj == null)
    {
      GMTrace.o(18096442048512L, 134829);
      return;
    }
    String str1 = Md(this.hyD);
    String str2 = this.hyD;
    String str3 = this.rJj.state;
    if (this.rJl == null) {}
    for (Object localObject = null;; localObject = this.rJl.bDK())
    {
      localObject = new u(2, str2, str3, str1, (LinkedList)localObject);
      at.wS().a((k)localObject, 0);
      localObject = new SendAuth.Resp();
      ((SendAuth.Resp)localObject).transaction = this.rJj.transaction;
      ((SendAuth.Resp)localObject).errCode = -2;
      ((SendAuth.Resp)localObject).lang = bDJ();
      ((SendAuth.Resp)localObject).country = getCountry();
      a(str1, (SendAuth.Resp)localObject);
      GMTrace.o(18096442048512L, 134829);
      return;
    }
  }
  
  private void bDH()
  {
    GMTrace.i(18096844701696L, 134832);
    if ((this.ihl != null) && (!this.ihl.isShowing()))
    {
      this.ihl.show();
      GMTrace.o(18096844701696L, 134832);
      return;
    }
    this.ihl = h.a(this, getString(R.l.dNh), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(18103018717184L, 134878);
        try
        {
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(18103018717184L, 134878);
          return;
        }
        catch (Exception paramAnonymousDialogInterface)
        {
          w.e("MicroMsg.SdkOAuthUI", "showProgressDlg onCancel exp: %s ", new Object[] { paramAnonymousDialogInterface.getLocalizedMessage() });
          GMTrace.o(18103018717184L, 134878);
        }
      }
    });
    GMTrace.o(18096844701696L, 134832);
  }
  
  private void bDI()
  {
    GMTrace.i(18096978919424L, 134833);
    if (this.ihl == null)
    {
      GMTrace.o(18096978919424L, 134833);
      return;
    }
    this.ihl.dismiss();
    GMTrace.o(18096978919424L, 134833);
  }
  
  private String bDJ()
  {
    GMTrace.i(18097247354880L, 134835);
    String str = v.d(getSharedPreferences(ab.bPU(), 0));
    GMTrace.o(18097247354880L, 134835);
    return str;
  }
  
  private static String getCountry()
  {
    GMTrace.i(18097381572608L, 134836);
    at.AR();
    String str = bg.aq((String)c.xh().get(274436, null), null);
    GMTrace.o(18097381572608L, 134836);
    return str;
  }
  
  private boolean xN(int paramInt)
  {
    GMTrace.i(18097113137152L, 134834);
    if ((paramInt == 1) || (paramInt == 2) || (paramInt == 7) || (paramInt == 8))
    {
      w.e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, errType = " + paramInt);
      GMTrace.o(18097113137152L, 134834);
      return false;
    }
    if (!am.isConnected(this))
    {
      w.e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, not connected");
      GMTrace.o(18097113137152L, 134834);
      return false;
    }
    GMTrace.o(18097113137152L, 134834);
    return true;
  }
  
  public final void Zp()
  {
    GMTrace.i(18096039395328L, 134826);
    super.Zp();
    bDG();
    GMTrace.o(18096039395328L, 134826);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(18097650008064L, 134838);
    if ((paramk instanceof com.tencent.mm.plugin.webview.model.t))
    {
      w.i("MicroMsg.SdkOAuthUI", "onSDKOauthAuthorizeEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      bDI();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (baf)((com.tencent.mm.plugin.webview.model.t)paramk).fUa.gtD.gtK;
        if ((paramString.uGV) || (paramString.uGW))
        {
          w.i("MicroMsg.SdkOAuthUI", "onSDKOauthAuthorizeEnd direct login");
          Mb(paramString.ubQ);
          GMTrace.o(18097650008064L, 134838);
          return;
        }
        paramk = (ImageView)findViewById(R.h.ben);
        TextView localTextView = (TextView)findViewById(R.h.bes);
        ListView localListView = (ListView)findViewById(R.h.bfd);
        Button localButton = (Button)findViewById(R.h.bLq);
        c.a locala = new c.a();
        locala.gKR = R.k.cNd;
        com.tencent.mm.ao.n.Jd().a(paramString.uGU, paramk, locala.Jn());
        localTextView.setText(paramString.gjJ);
        this.rJl = new a(this, paramString.uGT);
        localListView.setAdapter(this.rJl);
        localButton.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18160463904768L, 135306);
            if (paramString.uGX)
            {
              SDKOAuthUI.a(SDKOAuthUI.this, SDKOAuthUI.b(SDKOAuthUI.this), SDKOAuthUI.c(SDKOAuthUI.this).state, SDKOAuthUI.Me(SDKOAuthUI.b(SDKOAuthUI.this)), SDKOAuthUI.d(SDKOAuthUI.this).bDK());
              GMTrace.o(18160463904768L, 135306);
              return;
            }
            SDKOAuthUI.a(SDKOAuthUI.this, paramString.ubQ);
            GMTrace.o(18160463904768L, 135306);
          }
        });
        findViewById(R.h.bZf).setVisibility(0);
        GMTrace.o(18097650008064L, 134838);
        return;
      }
      if (!xN(paramInt1))
      {
        Mc(getString(R.l.ekE));
        GMTrace.o(18097650008064L, 134838);
        return;
      }
      Mc(paramString);
      GMTrace.o(18097650008064L, 134838);
      return;
    }
    if ((paramk instanceof u))
    {
      w.i("MicroMsg.SdkOAuthUI", "onSDKOauthAuthorizeConfirmEnd errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (this.rJk != null) {
        this.rJk.stopTimer();
      }
      bDI();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Mb(((bad)((u)paramk).fUa.gtD.gtK).ubQ);
        GMTrace.o(18097650008064L, 134838);
        return;
      }
      if (!xN(paramInt1))
      {
        Mc(getString(R.l.ekE));
        GMTrace.o(18097650008064L, 134838);
        return;
      }
      Mc(paramString);
    }
    GMTrace.o(18097650008064L, 134838);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18095905177600L, 134825);
    int i = R.i.cFq;
    GMTrace.o(18095905177600L, 134825);
    return i;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18095368306688L, 134821);
    super.onCreate(paramBundle);
    sq(getString(R.l.ekL));
    Ve(getString(R.l.dVZ));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18171738193920L, 135390);
        SDKOAuthUI.a(SDKOAuthUI.this);
        SDKOAuthUI.this.finish();
        GMTrace.o(18171738193920L, 135390);
        return true;
      }
    });
    if (!at.AU())
    {
      w.e("MicroMsg.SdkOAuthUI", "start, hasSetUin fail");
      Toast.makeText(this, R.l.cQg, 1).show();
      GMTrace.o(18095368306688L, 134821);
      return;
    }
    this.rJm = false;
    paramBundle = getIntent().getExtras();
    String str1 = paramBundle.getString("_mmessage_content");
    if (bg.nm(str1))
    {
      w.e("MicroMsg.SdkOAuthUI", "init content is nil");
      GMTrace.o(18095368306688L, 134821);
      return;
    }
    this.hyD = Uri.parse(str1).getQueryParameter("appid");
    str1 = this.hyD;
    Object localObject = com.tencent.mm.pluginsdk.model.app.g.aP(str1, false);
    if ((localObject != null) && (bg.nm(((f)localObject).field_openId)))
    {
      w.i("MicroMsg.SdkOAuthUI", "checkGetAppSetting appId: %s ", new Object[] { str1 });
      localObject = new gv();
      ((gv)localObject).eJY.appId = str1;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
    this.rJj = new SendAuth.Req(paramBundle);
    str1 = this.hyD;
    localObject = this.rJj.scope;
    String str2 = this.rJj.state;
    String str3 = Md(this.hyD);
    w.i("MicroMsg.SdkOAuthUI", "doSDKOauthAuthorize appid: %s", new Object[] { str1 });
    bDH();
    if (bg.nm(str3)) {}
    for (paramBundle = null;; paramBundle = com.tencent.mm.a.g.n(p.aQ(this, str3)[0].toByteArray()))
    {
      paramBundle = new com.tencent.mm.plugin.webview.model.t(str1, (String)localObject, str2, str3, paramBundle);
      at.wS().a(paramBundle, 0);
      GMTrace.o(18095368306688L, 134821);
      return;
    }
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(18095770959872L, 134824);
    super.onDestroy();
    if (this.ihl != null) {
      this.ihl.dismiss();
    }
    if (this.rJk != null) {
      this.rJk.stopTimer();
    }
    GMTrace.o(18095770959872L, 134824);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(18096173613056L, 134827);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      bDG();
      finish();
      GMTrace.o(18096173613056L, 134827);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(18096173613056L, 134827);
    return bool;
  }
  
  protected final void onPause()
  {
    GMTrace.i(18095636742144L, 134823);
    super.onPause();
    at.wS().b(1388, this);
    at.wS().b(1346, this);
    GMTrace.o(18095636742144L, 134823);
  }
  
  protected final void onResume()
  {
    GMTrace.i(18095502524416L, 134822);
    super.onResume();
    at.wS().a(1346, this);
    at.wS().a(1388, this);
    GMTrace.o(18095502524416L, 134822);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private LayoutInflater CJ;
    private LinkedList<aqt> rJp;
    
    public a(Context paramContext, LinkedList<aqt> paramLinkedList)
    {
      GMTrace.i(18094294564864L, 134813);
      this.CJ = LayoutInflater.from(paramContext);
      this.rJp = paramLinkedList;
      GMTrace.o(18094294564864L, 134813);
    }
    
    private aqt xO(int paramInt)
    {
      GMTrace.i(18094697218048L, 134816);
      aqt localaqt = (aqt)this.rJp.get(paramInt);
      GMTrace.o(18094697218048L, 134816);
      return localaqt;
    }
    
    public final LinkedList<String> bDK()
    {
      GMTrace.i(18094428782592L, 134814);
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      while (i < this.rJp.size())
      {
        aqt localaqt = (aqt)this.rJp.get(i);
        if ((localaqt.uGY == 2) || (localaqt.uGY == 3)) {
          localLinkedList.add(localaqt.scope);
        }
        i += 1;
      }
      GMTrace.o(18094428782592L, 134814);
      return localLinkedList;
    }
    
    public final int getCount()
    {
      GMTrace.i(18094563000320L, 134815);
      if (this.rJp == null)
      {
        GMTrace.o(18094563000320L, 134815);
        return 0;
      }
      int i = this.rJp.size();
      GMTrace.o(18094563000320L, 134815);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(18094831435776L, 134817);
      long l = paramInt;
      GMTrace.o(18094831435776L, 134817);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(18094965653504L, 134818);
      if ((this.rJp == null) || (this.rJp.size() <= 0))
      {
        GMTrace.o(18094965653504L, 134818);
        return null;
      }
      final aqt localaqt = xO(paramInt);
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = this.CJ.inflate(R.i.cFp, null, false);
        paramViewGroup.iJg = ((ImageView)paramView.findViewById(R.h.bed));
        paramViewGroup.iJh = ((TextView)paramView.findViewById(R.h.bec));
        paramView.setTag(paramViewGroup);
        if (localaqt.uGY != 1) {
          break label177;
        }
        paramViewGroup.iJg.setImageResource(R.k.cMV);
      }
      for (;;)
      {
        paramViewGroup.iJh.setText(localaqt.desc);
        final ImageView localImageView = paramViewGroup.iJg;
        paramViewGroup.iJg.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18101408104448L, 134866);
            if (localaqt.uGY == 2)
            {
              localImageView.setImageResource(R.k.cMV);
              localaqt.uGY = 1;
              GMTrace.o(18101408104448L, 134866);
              return;
            }
            if (localaqt.uGY == 1)
            {
              localImageView.setImageResource(R.k.cMT);
              localaqt.uGY = 2;
            }
            GMTrace.o(18101408104448L, 134866);
          }
        });
        GMTrace.o(18094965653504L, 134818);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label177:
        if (localaqt.uGY == 3) {
          paramViewGroup.iJg.setImageResource(R.k.cMU);
        } else {
          paramViewGroup.iJg.setImageResource(R.k.cMT);
        }
      }
    }
    
    private static final class a
    {
      ImageView iJg;
      TextView iJh;
      
      public a()
      {
        GMTrace.i(18102347628544L, 134873);
        GMTrace.o(18102347628544L, 134873);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\SDKOAuthUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */