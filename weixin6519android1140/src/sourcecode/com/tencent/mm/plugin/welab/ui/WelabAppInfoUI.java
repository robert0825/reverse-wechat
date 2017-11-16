package com.tencent.mm.plugin.welab.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.t;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.plugin.welab.a.a;
import com.tencent.mm.plugin.welab.a.b;
import com.tencent.mm.plugin.welab.a.c;
import com.tencent.mm.plugin.welab.a.d;
import com.tencent.mm.plugin.welab.e;
import com.tencent.mm.plugin.welab.g;
import com.tencent.mm.plugin.welab.ui.widget.WelabRoundCornerImageView;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.akz;
import com.tencent.mm.protocal.c.ala;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WelabAppInfoUI
  extends MMActivity
{
  private String eSd;
  private TextView hqi;
  private Button lhH;
  private TextView nNG;
  private com.tencent.mm.plugin.welab.c.a.a saS;
  private int saT;
  private boolean saU;
  private WelabRoundCornerImageView saV;
  private RecyclerView saW;
  private View saX;
  private View saY;
  private MMSwitchBtn saZ;
  private TextView sba;
  private View sbb;
  private View sbc;
  private a sbd;
  private View.OnClickListener sbe;
  
  public WelabAppInfoUI()
  {
    GMTrace.i(17486959345664L, 130288);
    this.sbe = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17491656966144L, 130323);
        Object localObject = paramAnonymousView.getTag().toString();
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("nowUrl", (String)localObject);
        paramAnonymousView.putExtra("urlList", (String[])((WelabAppInfoUI.a)WelabAppInfoUI.e(WelabAppInfoUI.this).fl()).jYO.toArray(new String[0]));
        localObject = WelabAppInfoUI.this;
        Intent localIntent = new Intent();
        localIntent.putExtras(paramAnonymousView.getExtras());
        if (paramAnonymousView.getFlags() != 0) {
          localIntent.addFlags(paramAnonymousView.getFlags());
        }
        com.tencent.mm.bj.d.b((Context)localObject, "subapp", ".ui.gallery.GestureGalleryUI", localIntent);
        GMTrace.o(17491656966144L, 130323);
      }
    };
    GMTrace.o(17486959345664L, 130288);
  }
  
  private String bGF()
  {
    GMTrace.i(17487764652032L, 130294);
    String str = "switch_" + this.saS.field_LabsAppId;
    GMTrace.o(17487764652032L, 130294);
    return str;
  }
  
  private void bGG()
  {
    GMTrace.i(17487898869760L, 130295);
    Object localObject2 = this.saS.Ns("field_ImgUrl_android");
    Object localObject1 = localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      localObject1 = this.saS.Ns("field_ImgUrl");
    }
    localObject1 = g.No((String)localObject1);
    localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext()) {
      if (TextUtils.isEmpty((String)((Iterator)localObject2).next())) {
        ((Iterator)localObject2).remove();
      }
    }
    if (((List)localObject1).isEmpty())
    {
      this.saW.setVisibility(8);
      GMTrace.o(17487898869760L, 130295);
      return;
    }
    this.saW.setVisibility(0);
    this.sbd.jYO = ((List)localObject1);
    this.sbd.TS.notifyChanged();
    GMTrace.o(17487898869760L, 130295);
  }
  
  protected final void MP()
  {
    GMTrace.i(17487361998848L, 130291);
    super.MP();
    if (this.saS == null)
    {
      w.e("WelabAppInfoUI", "info is null");
      GMTrace.o(17487361998848L, 130291);
      return;
    }
    bXp();
    AX(8);
    if (Build.VERSION.SDK_INT >= 21)
    {
      Window localWindow = getWindow();
      localWindow.clearFlags(201326592);
      localWindow.addFlags(Integer.MIN_VALUE);
      localWindow.setStatusBarColor(getResources().getColor(a.a.sal));
    }
    if (cN().cO() != null) {
      cN().cO().getCustomView().setBackgroundColor(getResources().getColor(a.a.sal));
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(17491925401600L, 130325);
        WelabAppInfoUI.this.aLo();
        WelabAppInfoUI.this.finish();
        GMTrace.o(17491925401600L, 130325);
        return true;
      }
    });
    this.saV = ((WelabRoundCornerImageView)findViewById(a.b.sam));
    this.hqi = ((TextView)findViewById(a.b.title));
    this.nNG = ((TextView)findViewById(a.b.summary));
    this.saW = ((RecyclerView)findViewById(a.b.saq));
    this.saX = findViewById(a.b.san);
    this.lhH = ((Button)findViewById(a.b.bSs));
    this.saY = findViewById(a.b.sao);
    this.saZ = ((MMSwitchBtn)findViewById(a.b.checkbox));
    this.sba = ((TextView)findViewById(a.b.say));
    this.sbb = findViewById(a.b.sax);
    this.sbc = findViewById(a.b.sau);
    this.saW.a(new LinearLayoutManager(0, false));
    this.saW.setOverScrollMode(2);
    this.sbd = new a();
    this.saW.a(this.sbd);
    GMTrace.o(17487361998848L, 130291);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(17487227781120L, 130290);
    int i = a.c.saC;
    GMTrace.o(17487227781120L, 130290);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool = true;
    GMTrace.i(17487093563392L, 130289);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.eSd = paramBundle.getStringExtra("para_appid");
      this.saS = com.tencent.mm.plugin.welab.b.bGu().Nl(this.eSd);
      this.saT = this.saS.field_Switch;
      if (getIntent().getIntExtra("para_from_with_red_point", 0) != 1) {
        break label107;
      }
    }
    for (;;)
    {
      this.saU = bool;
      MP();
      e.o(this.eSd, 2, this.saU);
      GMTrace.o(17487093563392L, 130289);
      return;
      label107:
      bool = false;
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(17487496216576L, 130292);
    super.onPause();
    Object localObject;
    if (this.saT != this.saS.field_Switch)
    {
      com.tencent.mm.plugin.welab.b.bGu().saK.c(this.saS, new String[0]);
      localObject = new ala();
      akz localakz = new akz();
      localakz.uAb = bg.Sy(this.saS.field_expId);
      localakz.uAc = this.saS.field_LabsAppId;
      if (this.saS.field_Switch != 2) {
        break label182;
      }
      i = 1;
      localakz.und = i;
      ((ala)localObject).fMv.add(localakz);
      localObject = new e.a(207, (com.tencent.mm.bm.a)localObject);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b((e.b)localObject);
      localObject = this.eSd;
      if (this.saS.field_Switch != 2) {
        break label187;
      }
    }
    label182:
    label187:
    for (int i = 4;; i = 5)
    {
      e.o((String)localObject, i, this.saU);
      GMTrace.o(17487496216576L, 130292);
      return;
      i = 2;
      break;
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(17487630434304L, 130293);
    super.onResume();
    Object localObject;
    if ((this.saS.bGE()) && (this.saS.field_Type == 1))
    {
      this.saX.setVisibility(0);
      this.sba.setText(getResources().getString(a.d.saH) + this.saS.Ns("field_Title"));
      localObject = getSharedPreferences(getPackageName() + "_preferences", 0);
      this.saZ.setEnabled(true);
      if (this.saS.field_Switch == 2)
      {
        ((SharedPreferences)localObject).edit().putBoolean(bGF(), true).commit();
        this.saZ.mK(true);
        this.saZ.xrE = new MMSwitchBtn.a()
        {
          public final void cc(boolean paramAnonymousBoolean)
          {
            GMTrace.i(17490851659776L, 130317);
            if (WelabAppInfoUI.a(WelabAppInfoUI.this).field_Switch == 2)
            {
              WelabAppInfoUI.a(WelabAppInfoUI.this).field_Switch = 1;
              GMTrace.o(17490851659776L, 130317);
              return;
            }
            if (WelabAppInfoUI.a(WelabAppInfoUI.this).field_Switch == 1) {
              WelabAppInfoUI.a(WelabAppInfoUI.this).field_Switch = 2;
            }
            GMTrace.o(17490851659776L, 130317);
          }
        };
        label178:
        if (!this.saS.bGE()) {
          break label460;
        }
        this.lhH.setText(getResources().getString(a.d.saF) + this.saS.Ns("field_Title"));
        if (this.saS.field_Type == 1) {
          break label460;
        }
        this.lhH.setVisibility(0);
        this.lhH.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17491120095232L, 130319);
            w.i("WelabAppInfoUI", "open func " + WelabAppInfoUI.b(WelabAppInfoUI.this));
            paramAnonymousView = com.tencent.mm.plugin.welab.b.bGu();
            WelabAppInfoUI localWelabAppInfoUI = WelabAppInfoUI.this;
            String str = WelabAppInfoUI.b(WelabAppInfoUI.this);
            com.tencent.mm.plugin.welab.a.a.b localb = (com.tencent.mm.plugin.welab.a.a.b)paramAnonymousView.saL.get(str);
            if (localb != null)
            {
              w.i("WelabMgr", "use custome opener to open " + str);
              localb.c(localWelabAppInfoUI, str);
            }
            for (;;)
            {
              e.o(WelabAppInfoUI.b(WelabAppInfoUI.this), 7, WelabAppInfoUI.c(WelabAppInfoUI.this));
              GMTrace.o(17491120095232L, 130319);
              return;
              w.i("WelabMgr", "use default opener open " + str);
              if (paramAnonymousView.Nl(str).field_Type == 2)
              {
                if (paramAnonymousView.saM != null) {
                  paramAnonymousView.saM.c(localWelabAppInfoUI, str);
                } else {
                  w.e("WelabMgr", "defaultWeAppOpener is null!");
                }
              }
              else {
                w.e("WelabMgr", "can not find opener for " + str);
              }
            }
          }
        });
        label265:
        localObject = this.hqi;
        com.tencent.mm.plugin.welab.b.bGu();
        ((TextView)localObject).setText(com.tencent.mm.plugin.welab.b.a(this.saS));
        this.nNG.setText(this.saS.Ns("field_Introduce"));
        if (!this.saS.bGE()) {
          break label472;
        }
        this.saY.setVisibility(0);
        this.saY.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17489241047040L, 130305);
            try
            {
              com.tencent.mm.kernel.h.xw();
              int i = com.tencent.mm.kernel.a.ww();
              paramAnonymousView = URLEncoder.encode(com.tencent.mm.protocal.d.tJA, "utf-8");
              Object localObject = URLEncoder.encode(bg.bQP(), "utf-8");
              String str1 = URLEncoder.encode(p.sZ(), "utf-8");
              String str2 = URLEncoder.encode(com.tencent.mm.protocal.d.tJv, "utf-8");
              String str3 = URLEncoder.encode(com.tencent.mm.protocal.d.tJw, "utf-8");
              String str4 = URLEncoder.encode(com.tencent.mm.protocal.d.tJx, "utf-8");
              com.tencent.mm.kernel.h.xw();
              String str5 = URLEncoder.encode(com.tencent.mm.kernel.a.wN(), "utf-8");
              String str6 = URLEncoder.encode(bg.eF(ab.getContext()), "utf-8");
              paramAnonymousView = new StringBuilder("&uin=").append(i).append("&deviceName=").append(paramAnonymousView).append("&timeZone=").append((String)localObject).append("&imei=").append(str1).append("&deviceBrand=").append(str2).append("&deviceModel=").append(str3).append("&ostype=").append(str4).append("&clientSeqID=").append(str5).append("&signature=").append(str6).append("&scene=");
              if (bg.nm("")) {}
              for (i = 0;; i = 1)
              {
                paramAnonymousView = i;
                paramAnonymousView = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index" + "&from=" + URLEncoder.encode(new StringBuilder().append(WelabAppInfoUI.a(WelabAppInfoUI.this).field_expId).append("|").append(WelabAppInfoUI.b(WelabAppInfoUI.this)).toString()) + "&version=" + com.tencent.mm.protocal.d.tJC + "&lang=" + v.eq(ab.getContext()) + "&" + bg.nl("") + paramAnonymousView;
                paramAnonymousView = paramAnonymousView + "#/comment/4134";
                localObject = new Intent();
                ((Intent)localObject).putExtra("showShare", false);
                ((Intent)localObject).putExtra("rawUrl", paramAnonymousView);
                ((Intent)localObject).putExtra("title", "意见反馈");
                ((Intent)localObject).putExtra("neverGetA8Key", true);
                ((Intent)localObject).putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
                ((Intent)localObject).putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
                com.tencent.mm.bj.d.b(WelabAppInfoUI.this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
                GMTrace.o(17489241047040L, 130305);
                return;
              }
              return;
            }
            catch (UnsupportedEncodingException paramAnonymousView)
            {
              w.e("WelabAppInfoUI", "[oneliang]UnsupportedEncodingException:%s", new Object[] { paramAnonymousView.getMessage() });
              GMTrace.o(17489241047040L, 130305);
            }
          }
        });
        label335:
        if (!this.saS.bGE()) {
          break label484;
        }
        this.sbb.setVisibility(8);
        this.sbc.setVisibility(0);
      }
    }
    for (;;)
    {
      bGG();
      this.saV.sbq = 0.5F;
      localObject = com.tencent.mm.ao.a.a.Jk();
      com.tencent.mm.plugin.welab.b.bGu();
      ((com.tencent.mm.ao.a.a)localObject).a(com.tencent.mm.plugin.welab.b.b(this.saS), this.saV, com.tencent.mm.plugin.welab.b.bGu().rBn);
      GMTrace.o(17487630434304L, 130293);
      return;
      ((SharedPreferences)localObject).edit().putBoolean(bGF(), false).commit();
      this.saZ.mK(false);
      break;
      this.saX.setVisibility(8);
      break label178;
      label460:
      this.lhH.setVisibility(8);
      break label265;
      label472:
      this.saY.setVisibility(8);
      break label335;
      label484:
      this.sbb.setVisibility(0);
      this.sbc.setVisibility(8);
    }
  }
  
  private final class a
    extends RecyclerView.a<WelabAppInfoUI.b>
  {
    public List<String> jYO;
    
    public a()
    {
      GMTrace.i(17485751386112L, 130279);
      GMTrace.o(17485751386112L, 130279);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(17485885603840L, 130280);
      int i = this.jYO.size();
      GMTrace.o(17485885603840L, 130280);
      return i;
    }
  }
  
  private final class b
    extends RecyclerView.t
  {
    public ImageView sbg;
    
    public b(View paramView)
    {
      super();
      GMTrace.i(17488704176128L, 130301);
      GMTrace.o(17488704176128L, 130301);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\ui\WelabAppInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */