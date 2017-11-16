package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.HandlerThread;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView.t;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.config.t;
import com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic.AppBrandOnOpReportStartEvent;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.b;
import com.tencent.mm.plugin.appbrand.widget.WxaBindBizInfoView;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.s;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class AppBrandProfileUI
  extends DrawStatusBarActivity
  implements View.OnClickListener, j.a
{
  private String iAx;
  private t iAz;
  private long iBn;
  private LinearLayout iBo;
  private TableLayout iBp;
  private ImageView iBq;
  private TextView iBr;
  private TextView iBs;
  private TextView iBt;
  private View iBu;
  private View iBv;
  private TextView iBw;
  private a iBx;
  private WxaExposedParams iBy;
  private f iBz;
  
  public AppBrandProfileUI()
  {
    GMTrace.i(10488712790016L, 78147);
    this.iBn = 0L;
    GMTrace.o(10488712790016L, 78147);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, WxaExposedParams paramWxaExposedParams)
  {
    GMTrace.i(18193481465856L, 135552);
    if (bg.nm(paramString1))
    {
      GMTrace.o(18193481465856L, 135552);
      return;
    }
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramContext = new Intent(localContext, AppBrandProfileUI.class).putExtra("key_username", paramString1).putExtra("key_from_scene", 3).putExtra("key_scene_note", paramString2).putExtra("key_can_swipe_back", true).putExtra("key_scene_exposed_params", paramWxaExposedParams);
    if (paramWxaExposedParams != null)
    {
      paramString1 = new Bundle();
      paramString1.putInt("stat_scene", 6);
      paramString1.putString("stat_app_id", paramWxaExposedParams.appId);
      paramString1.putString("stat_url", paramWxaExposedParams.ePf);
      paramContext.putExtra("_stat_obj", paramString1);
    }
    if (!(localContext instanceof Activity)) {
      paramContext.addFlags(268435456);
    }
    localContext.startActivity(paramContext);
    GMTrace.o(18193481465856L, 135552);
  }
  
  private void a(TableLayout paramTableLayout)
  {
    GMTrace.i(19700075462656L, 146777);
    if (paramTableLayout == null)
    {
      GMTrace.o(19700075462656L, 146777);
      return;
    }
    int j = getResources().getDisplayMetrics().widthPixels;
    int k = paramTableLayout.getChildCount();
    int i = 0;
    while (i < k)
    {
      Object localObject = paramTableLayout.getChildAt(i);
      if ((localObject instanceof TableRow))
      {
        localObject = (TableRow)localObject;
        if (((TableRow)localObject).getChildCount() > 1)
        {
          View localView = ((TableRow)localObject).getChildAt(0);
          if ((localView != null) && ((localView instanceof TextView)))
          {
            int m = j / 2;
            int n = ((TableRow)localObject).getPaddingLeft();
            ((TextView)localView).setMaxWidth(m - n);
          }
        }
      }
      i += 1;
    }
    GMTrace.o(19700075462656L, 146777);
  }
  
  private void b(int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(14297006604288L, 106521);
    if (this.iAz == null) {}
    for (String str1 = null; bg.nm(str1); str1 = this.iAz.appId)
    {
      GMTrace.o(14297006604288L, 106521);
      return;
    }
    int i = getIntent().getIntExtra("key_from_scene", 3);
    String str2 = bg.nl(getIntent().getStringExtra("key_scene_note"));
    w.d("MicroMsg.AppBrandProfileUI", "stev report(%s), appId %s, scene %s, sceneNote %s, eventId %s, result %s", new Object[] { Integer.valueOf(13919), str1, Integer.valueOf(i), str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g.ork.i(13919, new Object[] { str1, Integer.valueOf(i), str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong) });
    GMTrace.o(14297006604288L, 106521);
  }
  
  private void bv(int paramInt1, int paramInt2)
  {
    GMTrace.i(10489920749568L, 78156);
    b(paramInt1, paramInt2, bg.Pu());
    GMTrace.o(10489920749568L, 78156);
  }
  
  private void cx(boolean paramBoolean)
  {
    GMTrace.i(10489786531840L, 78155);
    if (this.iBv == null)
    {
      GMTrace.o(10489786531840L, 78155);
      return;
    }
    if (paramBoolean)
    {
      this.iBv.setVisibility(8);
      GMTrace.o(10489786531840L, 78155);
      return;
    }
    this.iBv.setVisibility(0);
    this.iBv.setOnClickListener(this);
    GMTrace.o(10489786531840L, 78155);
  }
  
  private void cy(final boolean paramBoolean)
  {
    GMTrace.i(10490323402752L, 78159);
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10547768590336L, 78587);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10541460357120L, 78540);
            AppBrandProfileUI.a(AppBrandProfileUI.this, this.iBB, this.iBE);
            if ((AppBrandProfileUI.6.this.iBD) && (!AppBrandProfileUI.this.isFinishing()) && (!AppBrandProfileUI.this.vKD)) {
              q.UC().a(AppBrandProfileUI.this, com.tencent.mm.plugin.appbrand.o.d.xB().ngv.getLooper());
            }
            GMTrace.o(10541460357120L, 78540);
          }
        });
        if (paramBoolean)
        {
          r.pD(AppBrandProfileUI.d(AppBrandProfileUI.this));
          AppBrandProfileUI.a(AppBrandProfileUI.this, 1, 1);
        }
        GMTrace.o(10547768590336L, 78587);
      }
    }, "AppBrandProfile");
    GMTrace.o(10490323402752L, 78159);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(10490457620480L, 78160);
    if ((paraml.iqq == 3) && ((paraml.obj instanceof String)) && (!bg.nm(this.iAx)) && (this.iAx.equals((String)paraml.obj))) {
      cy(false);
    }
    GMTrace.o(10490457620480L, 78160);
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(10489518096384L, 78153);
    super.bH(paramView);
    ScrollView localScrollView = new ScrollView(this);
    localScrollView.setBackgroundResource(o.c.hAb);
    this.iBo = new LinearLayout(this);
    this.iBo.setOrientation(1);
    localScrollView.addView(this.iBo, new FrameLayout.LayoutParams(-1, -2));
    ((FrameLayout)paramView).addView(localScrollView);
    GMTrace.o(10489518096384L, 78153);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10488981225472L, 78149);
    GMTrace.o(10488981225472L, 78149);
    return -1;
  }
  
  public final void onBackPressed()
  {
    GMTrace.i(10489249660928L, 78151);
    super.onBackPressed();
    bv(6, 1);
    GMTrace.o(10489249660928L, 78151);
  }
  
  public final void onClick(final View paramView)
  {
    GMTrace.i(10490189185024L, 78158);
    if (paramView.getId() == o.f.hCl)
    {
      if ((this.iAz != null) && (!bg.nm(this.iAz.appId)))
      {
        com.tencent.mm.bj.d.b(this.vKB.vKW, "webview", ".ui.tools.WebViewUI", new Intent().putExtra("rawUrl", com.tencent.mm.plugin.appbrand.l.og(this.iAz.appId)).putExtra("forceHideShare", true));
        bv(2, 1);
        GMTrace.o(10490189185024L, 78158);
      }
    }
    else
    {
      final Object localObject;
      if (paramView.getId() == o.f.hCk)
      {
        if (this.iAz != null)
        {
          paramView = getIntent().getBundleExtra("_stat_obj");
          localObject = new AppBrandStatObject();
          ((AppBrandStatObject)localObject).scene = 1024;
          ((AppBrandStatObject)localObject).eVi = b.e(((AppBrandStatObject)localObject).scene, paramView);
          ((AppBrandStatObject)localObject).eVj = b.f(((AppBrandStatObject)localObject).scene, paramView);
          AppBrandLaunchProxyUI.a(this, this.iAz.username, null, 0, -1, (AppBrandStatObject)localObject, null);
          bv(4, 1);
          GMTrace.o(10490189185024L, 78158);
        }
      }
      else if (paramView.getId() == o.f.hCq)
      {
        localObject = q.pq(this.iAx);
        if (localObject == null)
        {
          w.w("MicroMsg.AppBrandProfileUI", "attrs is null.");
          GMTrace.o(10490189185024L, 78158);
          return;
        }
        HashMap localHashMap = new HashMap();
        localHashMap.put("desc", "");
        localHashMap.put("type", Integer.valueOf(1));
        localHashMap.put("title", ((t)localObject).eCQ);
        localHashMap.put("img_url", ((t)localObject).hSb);
        Intent localIntent = new Intent();
        localIntent.putExtra("Select_Conv_Type", 3);
        localIntent.putExtra("mutil_select_is_ret", true);
        localIntent.putExtra("select_is_ret", true);
        localIntent.putExtra("scene_from", 3);
        localIntent.putExtra("appbrand_params", localHashMap);
        localIntent.putExtra("Retr_Msg_Type", 2);
        com.tencent.mm.bj.d.a((MMActivity)paramView.getContext(), ".ui.transmit.SelectConversationUI", localIntent, 1, new MMActivity.a()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
          {
            GMTrace.i(10499718643712L, 78229);
            if (paramAnonymousInt1 == 1)
            {
              if (paramAnonymousInt2 == -1)
              {
                if (paramAnonymousIntent == null) {}
                for (Object localObject1 = null; (localObject1 == null) || (((String)localObject1).length() == 0); localObject1 = paramAnonymousIntent.getStringExtra("Select_Conv_User"))
                {
                  w.i("MicroMsg.AppBrandProfileUI", "mmOnActivityResult fail, toUser is null");
                  GMTrace.o(10499718643712L, 78229);
                  return;
                }
                w.i("MicroMsg.AppBrandProfileUI", "result success toUser : %s ", new Object[] { localObject1 });
                paramAnonymousIntent = paramAnonymousIntent.getStringExtra("custom_send_text");
                String str1 = localObject.appId;
                Object localObject2 = u.gy("wxapp_" + str1);
                u.Av().p((String)localObject2, true).o("prePublishId", "wxapp_" + str1);
                localObject2 = new f.a();
                ((f.a)localObject2).title = localObject.eCQ;
                ((f.a)localObject2).type = 33;
                ((f.a)localObject2).gkR = AppBrandProfileUI.d(AppBrandProfileUI.this);
                ((f.a)localObject2).gkS = str1;
                ((f.a)localObject2).gkT = 1;
                ((f.a)localObject2).eTu = ("wxapp_" + str1);
                ((f.a)localObject2).thumburl = localObject.hSb;
                ((f.a)localObject2).url = com.tencent.mm.plugin.appbrand.l.oh(str1);
                ((f.a)localObject2).eTo = AppBrandProfileUI.d(AppBrandProfileUI.this);
                ((f.a)localObject2).eTp = localObject.eCQ;
                localObject1 = bg.g(((String)localObject1).split(",")).iterator();
                if (((Iterator)localObject1).hasNext())
                {
                  String str2 = (String)((Iterator)localObject1).next();
                  ((com.tencent.mm.plugin.appbrand.compat.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).a((f.a)localObject2, str1, localObject.eCQ, str2, null);
                  if (!bg.nm(paramAnonymousIntent))
                  {
                    ol localol = new ol();
                    localol.eTx.eTy = str2;
                    localol.eTx.content = paramAnonymousIntent;
                    localol.eTx.type = s.go(str2);
                    localol.eTx.flags = 0;
                    com.tencent.mm.sdk.b.a.vgX.m(localol);
                  }
                  if (str2.endsWith("@chatroom")) {}
                  for (paramAnonymousInt1 = 9;; paramAnonymousInt1 = 8)
                  {
                    AppBrandProfileUI.a(AppBrandProfileUI.this, paramAnonymousInt1, bg.Pu());
                    break;
                  }
                }
                com.tencent.mm.ui.base.h.bm(paramView.getContext(), paramView.getContext().getResources().getString(o.i.cUy));
                GMTrace.o(10499718643712L, 78229);
              }
            }
            else {
              AppBrandProfileUI.a(AppBrandProfileUI.this, 8, 2);
            }
            GMTrace.o(10499718643712L, 78229);
          }
        });
      }
    }
    GMTrace.o(10490189185024L, 78158);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10489383878656L, 78152);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_username");
    this.iAx = paramBundle;
    if (bg.nm(paramBundle))
    {
      finish();
      GMTrace.o(10489383878656L, 78152);
      return;
    }
    j.d(this.vKB.hqF, -1, true);
    this.iBy = ((WxaExposedParams)getIntent().getParcelableExtra("key_scene_exposed_params"));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10512066674688L, 78321);
        AppBrandProfileUI.this.onBackPressed();
        GMTrace.o(10512066674688L, 78321);
        return true;
      }
    }, o.e.hAv);
    a(0, o.i.ggi, o.h.hDV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10502134562816L, 78247);
        AppBrandProfileUI.a(AppBrandProfileUI.this);
        GMTrace.o(10502134562816L, 78247);
        return true;
      }
    });
    cN().cO().setBackgroundDrawable(new ColorDrawable(-1));
    bXp();
    Object localObject = LayoutInflater.from(this);
    paramBundle = ((LayoutInflater)localObject).inflate(o.g.hDa, this.iBo, true);
    localObject = ((LayoutInflater)localObject).inflate(o.g.hCZ, this.iBo, true);
    this.iBp = ((TableLayout)paramBundle.findViewById(o.f.hCr));
    a(this.iBp);
    this.iBq = ((ImageView)paramBundle.findViewById(o.f.bUj));
    this.iBr = ((TextView)paramBundle.findViewById(o.f.hCn));
    this.iBs = ((TextView)paramBundle.findViewById(o.f.hCj));
    this.iBt = ((TextView)paramBundle.findViewById(o.f.hCp));
    this.iBu = paramBundle.findViewById(o.f.hCo);
    this.iBx = new a(paramBundle.findViewById(o.f.hCi));
    this.iBv = paramBundle.findViewById(o.f.hCl);
    this.iBw = ((TextView)this.iBv.findViewById(o.f.hCm));
    cx(true);
    paramBundle.setClickable(false);
    paramBundle.setLongClickable(false);
    ((View)localObject).setClickable(false);
    ((View)localObject).setLongClickable(false);
    paramBundle = ((View)localObject).findViewById(o.f.hCk);
    localObject = ((View)localObject).findViewById(o.f.hCq);
    paramBundle.setOnClickListener(this);
    ((View)localObject).setOnClickListener(this);
    cy(true);
    GMTrace.o(10489383878656L, 78152);
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(10490054967296L, 78157);
    super.onDestroy();
    q.UC().j(this);
    GMTrace.o(10490054967296L, 78157);
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(10489115443200L, 78150);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (!bg.nm(this.iAx)) {
      q.UC().j(this);
    }
    paramIntent = getIntent().getStringExtra("key_username");
    this.iAx = paramIntent;
    if (bg.nm(paramIntent))
    {
      finish();
      GMTrace.o(10489115443200L, 78150);
      return;
    }
    cy(true);
    GMTrace.o(10489115443200L, 78150);
  }
  
  protected final void onResume()
  {
    GMTrace.i(10489652314112L, 78154);
    super.onResume();
    if (this.vMl != null) {
      this.vMl.mEnable = getIntent().getBooleanExtra("key_can_swipe_back", true);
    }
    GMTrace.o(10489652314112L, 78154);
  }
  
  private final class a
    extends RecyclerView.t
    implements View.OnClickListener
  {
    String hyD;
    WxaBindBizInfoView iBG;
    
    a(View paramView)
    {
      super();
      GMTrace.i(10547231719424L, 78583);
      this.iBG = ((WxaBindBizInfoView)paramView.findViewById(o.f.hCh));
      paramView.setOnClickListener(this);
      GMTrace.o(10547231719424L, 78583);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(10547365937152L, 78584);
      paramView = this.iBG.iKn;
      if ((paramView == null) || (paramView.isEmpty()))
      {
        w.i("MicroMsg.AppBrandProfileUI", "deal onBindBizInfo click failed, bindBizInfoList is null or nil.");
        GMTrace.o(10547365937152L, 78584);
        return;
      }
      if (paramView.size() == 1)
      {
        paramView = (WxaAttributes.WxaEntryInfo)paramView.get(0);
        com.tencent.mm.bj.d.b(this.UU.getContext(), "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView.username).putExtra("key_start_biz_profile_from_app_brand_profile", true).putExtra("force_get_contact", true));
        AppBrandProfileUI.a(AppBrandProfileUI.this, 3, 1);
        GMTrace.o(10547365937152L, 78584);
        return;
      }
      Intent localIntent = new Intent(AppBrandProfileUI.this.vKB.vKW, WxaBindBizInfoUI.class);
      localIntent.putExtra("app_id", this.hyD);
      localIntent.putParcelableArrayListExtra("wxa_entry_info_list", new ArrayList(paramView));
      AppBrandProfileUI.this.vKB.vKW.startActivity(localIntent);
      GMTrace.o(10547365937152L, 78584);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */