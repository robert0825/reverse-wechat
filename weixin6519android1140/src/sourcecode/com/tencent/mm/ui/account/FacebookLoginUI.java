package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.g.a.c.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;

public class FacebookLoginUI
  extends MMPreference
  implements com.tencent.mm.ad.e
{
  private String eVw;
  private DialogInterface.OnCancelListener iKE;
  private String osl;
  private com.tencent.mm.sdk.b.c vPG;
  private com.tencent.mm.ui.g.a.c vPP;
  private String vPQ;
  private u vPR;
  private b vPS;
  boolean vPT;
  private ProgressDialog vPl;
  
  public FacebookLoginUI()
  {
    GMTrace.i(2693615583232L, 20069);
    this.vPQ = "";
    this.eVw = "";
    this.vPG = new com.tencent.mm.sdk.b.c() {};
    this.vPT = true;
    GMTrace.o(2693615583232L, 20069);
  }
  
  private void bYs()
  {
    GMTrace.i(2694555107328L, 20076);
    try
    {
      if (this.vPP != null) {
        this.vPP.fC(this);
      }
      com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",L14," + at.eK("L14") + ",1");
      this.vPP = new com.tencent.mm.ui.g.a.c("290293790992170");
      this.vPP.a(this, FacebookAuthUI.vPD, new a());
      g.ork.a(582L, 5L, 1L, false);
      GMTrace.o(2694555107328L, 20076);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FacebookLoginUI", localException, "", new Object[0]);
      }
    }
  }
  
  private void goBack()
  {
    GMTrace.i(2694420889600L, 20075);
    com.tencent.mm.plugin.c.b.nz(this.osl);
    finish();
    GMTrace.o(2694420889600L, 20075);
  }
  
  protected final void MP()
  {
    GMTrace.i(2694823542784L, 20078);
    this.vPP = new com.tencent.mm.ui.g.a.c("290293790992170");
    this.iKE = new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2710258581504L, 20193);
        if (FacebookLoginUI.b(FacebookLoginUI.this) != null) {
          at.wS().c(FacebookLoginUI.b(FacebookLoginUI.this));
        }
        GMTrace.o(2710258581504L, 20193);
      }
    };
    bYs();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2683146600448L, 19991);
        FacebookLoginUI.c(FacebookLoginUI.this);
        GMTrace.o(2683146600448L, 19991);
        return true;
      }
    });
    GMTrace.o(2694823542784L, 20078);
  }
  
  public final int QI()
  {
    GMTrace.i(2695091978240L, 20080);
    int i = R.o.eoR;
    GMTrace.o(2695091978240L, 20080);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2694689325056L, 20077);
    w.i("MicroMsg.FacebookLoginUI", "dkwt onSceneEnd: hash:%d type:%d [%d,%d,%s]", new Object[] { Integer.valueOf(paramk.hashCode()), Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.vPl != null)
    {
      this.vPl.dismiss();
      this.vPl = null;
    }
    if (!bg.bx(this))
    {
      GMTrace.o(2694689325056L, 20077);
      return;
    }
    if (!(paramk instanceof u))
    {
      GMTrace.o(2694689325056L, 20077);
      return;
    }
    this.eVw = ((u)paramk).Lu();
    int j = 0;
    int i = j;
    if (paramk.getType() == 701)
    {
      i = j;
      if (paramInt1 == 4) {
        if (paramInt2 != -16)
        {
          i = j;
          if (paramInt2 != -17) {}
        }
        else
        {
          i = 1;
          at.wS().a(new bf(new bf.a()
          {
            public final void a(com.tencent.mm.network.e paramAnonymouse)
            {
              GMTrace.i(2709721710592L, 20189);
              if (paramAnonymouse == null)
              {
                GMTrace.o(2709721710592L, 20189);
                return;
              }
              paramAnonymouse = paramAnonymouse.DY();
              at.AR();
              int i = com.tencent.mm.y.c.ww();
              paramAnonymouse.i(new byte[0], i);
              GMTrace.o(2709721710592L, 20189);
            }
          }), 0);
        }
      }
    }
    if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
    {
      at.unhold();
      com.tencent.mm.platformtools.m.nh("");
      com.tencent.mm.modelsimple.d.bk(this);
      com.tencent.mm.platformtools.m.a(this, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2725290967040L, 20305);
          at.AR();
          int i;
          Intent localIntent1;
          if (bg.a((Integer)com.tencent.mm.y.c.xh().get(65833, null), 0) > 0)
          {
            i = 1;
            if (i == 0) {
              break label117;
            }
            localIntent1 = com.tencent.mm.plugin.c.a.hnH.ao(FacebookLoginUI.this);
            localIntent1.addFlags(67108864);
            Intent localIntent2 = new Intent(FacebookLoginUI.this.vKB.vKW, BindMContactIntroUI.class);
            localIntent2.putExtra("key_upload_scene", 1);
            MMWizardActivity.b(FacebookLoginUI.this, localIntent2, localIntent1);
          }
          for (;;)
          {
            FacebookLoginUI.this.finish();
            GMTrace.o(2725290967040L, 20305);
            return;
            i = 0;
            break;
            label117:
            localIntent1 = com.tencent.mm.plugin.c.a.hnH.ao(FacebookLoginUI.this);
            localIntent1.addFlags(67108864);
            FacebookLoginUI.this.startActivity(localIntent1);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + FacebookLoginUI.this.getClass().getName() + ",L14," + at.eK("L14") + ",4");
          }
        }
      }, false, 2);
      GMTrace.o(2694689325056L, 20077);
      return;
    }
    if (paramInt2 == -106)
    {
      com.tencent.mm.platformtools.m.b(this, paramString, 0);
      GMTrace.o(2694689325056L, 20077);
      return;
    }
    if (paramInt2 == 65319)
    {
      com.tencent.mm.platformtools.m.a(this, com.tencent.mm.pluginsdk.a.a.a((u)paramk), paramInt2);
      GMTrace.o(2694689325056L, 20077);
      return;
    }
    Object localObject;
    if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
    {
      if (this.vPS == null) {
        this.vPS = new b()
        {
          public final k a(k paramAnonymousk, String paramAnonymousString)
          {
            GMTrace.i(2696836808704L, 20093);
            paramAnonymousk = new u("facebook@wechat_auth", FacebookLoginUI.a(FacebookLoginUI.this), ((u)paramAnonymousk).Lv(), paramAnonymousString, ((u)paramAnonymousk).HQ(), ((u)paramAnonymousk).Lw(), 0, "", true, false);
            GMTrace.o(2696836808704L, 20093);
            return paramAnonymousk;
          }
        };
      }
      paramString = this.vPS;
      localObject = ((u)paramk).HP();
      paramString.vPe = paramk;
      if (paramString.vMf == null)
      {
        paramString.vMf = SecurityImage.a.a(this, R.l.dRU, 0, (byte[])localObject, "", "", new b.1(paramString, this), null, new b.2(paramString), paramString);
        GMTrace.o(2694689325056L, 20077);
        return;
      }
      paramString.vMf.a(0, (byte[])localObject, "", "");
      GMTrace.o(2694689325056L, 20077);
      return;
    }
    if (paramInt1 == 4) {}
    switch (paramInt2)
    {
    default: 
      if (com.tencent.mm.plugin.c.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString)) {
        i = 1;
      }
      break;
    }
    while (i != 0)
    {
      GMTrace.o(2694689325056L, 20077);
      return;
      if (at.wS().DN() == 5)
      {
        h.h(this, R.l.dLj, R.l.dLi);
        i = 1;
      }
      else
      {
        h.h(this, R.l.dqu, R.l.dHa);
        i = 1;
        continue;
        h.h(this, R.l.dGZ, R.l.dHa);
        i = 1;
        continue;
        h.h(this.vKB.vKW, R.l.dRN, R.l.cUG);
        i = 1;
        continue;
        com.tencent.mm.platformtools.m.bw(this.vKB.vKW);
        i = 1;
        continue;
        h.h(this.vKB.vKW, R.l.dsF, R.l.cUG);
        i = 1;
        continue;
        h.h(this.vKB.vKW, R.l.dsG, R.l.cUG);
        i = 1;
        continue;
        if (com.tencent.mm.protocal.d.tJF)
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", this.eVw);
          ((Intent)localObject).putExtra("showShare", false);
          ((Intent)localObject).putExtra("show_bottom", false);
          ((Intent)localObject).putExtra("needRedirect", false);
          ((Intent)localObject).putExtra("neverGetA8Key", true);
          ((Intent)localObject).putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          ((Intent)localObject).putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          com.tencent.mm.plugin.c.a.hnH.j((Intent)localObject, this);
        }
        i = 1;
        continue;
        i = 0;
      }
    }
    if (paramk.getType() == 701)
    {
      paramString = com.tencent.mm.h.a.dH(paramString);
      if ((paramString != null) && (paramString.a(this, null, null)))
      {
        GMTrace.o(2694689325056L, 20077);
        return;
      }
    }
    Toast.makeText(this, getString(R.l.dws, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(2694689325056L, 20077);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(2695226195968L, 20081);
    paramf = paramPreference.hiu;
    if (paramf == null)
    {
      w.e("MicroMsg.FacebookLoginUI", "onPreferenceTreeClick, key is null");
      GMTrace.o(2695226195968L, 20081);
      return true;
    }
    if (paramf.equals("facebook_auth_bind_btn"))
    {
      bYs();
      GMTrace.o(2695226195968L, 20081);
      return true;
    }
    GMTrace.o(2695226195968L, 20081);
    return false;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    GMTrace.i(2694957760512L, 20079);
    boolean bool;
    String str;
    int j;
    if (paramIntent == null)
    {
      bool = true;
      w.i("MicroMsg.FacebookLoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 != -1) || (paramInt1 != 1024) || (paramIntent == null)) {
        break label177;
      }
      str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
      j = paramIntent.getIntExtra("KVoiceHelpCode", 0);
      bool = bg.nm(str);
      if (!bg.nm(str)) {
        break label167;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.FacebookLoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
      if (j != 65319) {
        break label177;
      }
      bYs();
      GMTrace.o(2694957760512L, 20079);
      return;
      bool = false;
      break;
      label167:
      i = str.length();
    }
    label177:
    this.vPP.e(paramInt1, paramInt2, paramIntent);
    GMTrace.o(2694957760512L, 20079);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2693749800960L, 20070);
    super.onCreate(paramBundle);
    oM(R.l.app_name);
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.osl = com.tencent.mm.plugin.c.b.Qu();
    MP();
    at.wS().a(701, this);
    GMTrace.o(2693749800960L, 20070);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2693884018688L, 20071);
    super.onDestroy();
    at.wS().b(701, this);
    GMTrace.o(2693884018688L, 20071);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2694286671872L, 20074);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(2694286671872L, 20074);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2694286671872L, 20074);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(2694152454144L, 20073);
    super.onPause();
    com.tencent.mm.sdk.b.a.vgX.c(this.vPG);
    com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",L100_200_FB," + at.eK("L100_200_FB") + ",2");
    GMTrace.o(2694152454144L, 20073);
  }
  
  protected void onResume()
  {
    GMTrace.i(2694018236416L, 20072);
    com.tencent.mm.sdk.b.a.vgX.b(this.vPG);
    super.onResume();
    com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",L100_200_FB," + at.eK("L100_200_FB") + ",1");
    com.tencent.mm.plugin.c.b.ny("L100_200_FB");
    GMTrace.o(2694018236416L, 20072);
  }
  
  private final class a
    implements c.a
  {
    public a()
    {
      GMTrace.i(2737907433472L, 20399);
      GMTrace.o(2737907433472L, 20399);
    }
    
    public final void a(com.tencent.mm.ui.g.a.b paramb)
    {
      GMTrace.i(2738310086656L, 20402);
      w.d("MicroMsg.FacebookLoginUI", "onError:" + paramb.getMessage());
      h.b(FacebookLoginUI.this, paramb.getMessage(), FacebookLoginUI.this.getString(R.l.djk), true);
      FacebookLoginUI.ls(false);
      com.tencent.mm.plugin.c.b.nA(at.wN() + "," + FacebookLoginUI.this.getClass().getName() + ",L14," + at.eK("L14") + ",2");
      g.ork.a(582L, 8L, 1L, false);
      GMTrace.o(2738310086656L, 20402);
    }
    
    public final void a(com.tencent.mm.ui.g.a.d paramd)
    {
      GMTrace.i(2738175868928L, 20401);
      w.d("MicroMsg.FacebookLoginUI", "onFacebookError:" + paramd.xbb);
      h.b(FacebookLoginUI.this, paramd.getMessage(), FacebookLoginUI.this.getString(R.l.djk), true);
      FacebookLoginUI.ls(false);
      com.tencent.mm.plugin.c.b.nA(at.wN() + "," + FacebookLoginUI.this.getClass().getName() + ",L14," + at.eK("L14") + ",2");
      g.ork.a(582L, 7L, 1L, false);
      GMTrace.o(2738175868928L, 20401);
    }
    
    public final void m(Bundle paramBundle)
    {
      GMTrace.i(2738041651200L, 20400);
      paramBundle = FacebookLoginUI.this.getString(R.l.cUG);
      String str = FacebookLoginUI.this.getString(R.l.dsp);
      FacebookLoginUI.a(FacebookLoginUI.this, ProgressDialog.show(FacebookLoginUI.this, paramBundle, str, true));
      FacebookLoginUI.e(FacebookLoginUI.this).setOnCancelListener(FacebookLoginUI.d(FacebookLoginUI.this));
      FacebookLoginUI.a(FacebookLoginUI.this, FacebookLoginUI.f(FacebookLoginUI.this).wlZ);
      w.i("MicroMsg.FacebookLoginUI", "dkwt Ready to Facebook auth user[%s] token[%d][%s]", new Object[] { "facebook@wechat_auth", Integer.valueOf(FacebookLoginUI.a(FacebookLoginUI.this).length()), FacebookLoginUI.a(FacebookLoginUI.this).substring(0, 4) });
      FacebookLoginUI.a(FacebookLoginUI.this, new u("facebook@wechat_auth", FacebookLoginUI.a(FacebookLoginUI.this), 0, "", "", "", 0, "", true, false));
      at.wS().a(FacebookLoginUI.b(FacebookLoginUI.this), 0);
      FacebookLoginUI.ls(true);
      com.tencent.mm.plugin.c.b.nA(at.wN() + "," + FacebookLoginUI.this.getClass().getName() + ",L14," + at.eK("L14") + ",2");
      g.ork.a(582L, 6L, 1L, false);
      GMTrace.o(2738041651200L, 20400);
    }
    
    public final void onCancel()
    {
      GMTrace.i(2738444304384L, 20403);
      w.d("MicroMsg.FacebookLoginUI", "onCancel");
      FacebookLoginUI.ls(false);
      com.tencent.mm.plugin.c.b.nA(at.wN() + "," + FacebookLoginUI.this.getClass().getName() + ",L14," + at.eK("L14") + ",2");
      g.ork.a(582L, 9L, 1L, false);
      GMTrace.o(2738444304384L, 20403);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\FacebookLoginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */