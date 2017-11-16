package com.tencent.mm.plugin.welab.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.welab.a.a;
import com.tencent.mm.plugin.welab.a.b;
import com.tencent.mm.plugin.welab.a.c;
import com.tencent.mm.plugin.welab.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WelabMainUI
  extends MMActivity
{
  private boolean saU;
  private LinearLayout sbh;
  private LinearLayout sbi;
  private LinearLayout sbj;
  private LinearLayout sbk;
  private View sbl;
  private View sbm;
  private Comparator<com.tencent.mm.plugin.welab.c.a.a> sbn;
  private View.OnClickListener sbo;
  
  public WelabMainUI()
  {
    GMTrace.i(17489375264768L, 130306);
    this.saU = false;
    this.sbn = new Comparator() {};
    this.sbo = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17491388530688L, 130321);
        paramAnonymousView = paramAnonymousView.getTag();
        Object localObject;
        if ((paramAnonymousView instanceof com.tencent.mm.plugin.welab.c.a.a))
        {
          paramAnonymousView = (com.tencent.mm.plugin.welab.c.a.a)paramAnonymousView;
          localObject = new Intent();
          ((Intent)localObject).putExtra("para_appid", paramAnonymousView.field_LabsAppId);
          if (!com.tencent.mm.plugin.welab.d.b.bGI().e(paramAnonymousView)) {
            break label194;
          }
        }
        label194:
        for (int i = 1;; i = 0)
        {
          ((Intent)localObject).putExtra("para_from_with_red_point", i);
          ((Intent)localObject).setClass(WelabMainUI.this, WelabAppInfoUI.class);
          WelabMainUI.this.startActivity((Intent)localObject);
          localObject = com.tencent.mm.plugin.welab.d.b.bGI();
          String str = paramAnonymousView.field_LabsAppId;
          ((com.tencent.mm.plugin.welab.d.b)localObject).saP.put(str, Integer.valueOf(1));
          ((com.tencent.mm.plugin.welab.d.b)localObject).tag = (((com.tencent.mm.plugin.welab.d.b)localObject).tag + "&" + str + "=1");
          h.xy().xh().a(w.a.vxX, ((com.tencent.mm.plugin.welab.d.b)localObject).tag);
          com.tencent.mm.plugin.welab.d.b.bGJ();
          w.i("MicroMsg.WelabMainUI", "click " + paramAnonymousView);
          GMTrace.o(17491388530688L, 130321);
          return;
        }
      }
    };
    GMTrace.o(17489375264768L, 130306);
  }
  
  private void a(com.tencent.mm.plugin.welab.c.a.a parama, LinearLayout paramLinearLayout)
  {
    GMTrace.i(17490314788864L, 130313);
    LinearLayout localLinearLayout = (LinearLayout)getLayoutInflater().inflate(a.c.saB, paramLinearLayout, false);
    ImageView localImageView1 = (ImageView)localLinearLayout.findViewById(a.b.saz);
    ImageView localImageView2 = (ImageView)localLinearLayout.findViewById(a.b.sam);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(a.b.title);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(a.b.summary);
    if (com.tencent.mm.plugin.welab.d.b.bGI().e(parama)) {
      localImageView1.setVisibility(0);
    }
    for (;;)
    {
      com.tencent.mm.ao.a.a.Jk().a(parama.Ns("field_ThumbUrl"), localImageView2, com.tencent.mm.plugin.welab.b.bGu().rBn);
      com.tencent.mm.plugin.welab.b.bGu();
      localTextView1.setText(com.tencent.mm.plugin.welab.b.a(parama));
      localTextView2.setText(parama.Ns("field_Desc"));
      localLinearLayout.setTag(parama);
      localLinearLayout.setOnClickListener(this.sbo);
      paramLinearLayout.addView(localLinearLayout);
      GMTrace.o(17490314788864L, 130313);
      return;
      localImageView1.setVisibility(8);
    }
  }
  
  private void bGH()
  {
    GMTrace.i(17490180571136L, 130312);
    Object localObject = com.tencent.mm.plugin.welab.b.bGu().saK.bGD();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.welab.c.a.a locala = (com.tencent.mm.plugin.welab.c.a.a)localIterator.next();
      if (System.currentTimeMillis() / 1000L - locala.field_endtime >= 2592000L)
      {
        localIterator.remove();
        com.tencent.mm.plugin.welab.b.bGu().saK.a(locala, new String[0]);
      }
      else if ((locala.bBM()) && (locala.field_Switch != 3))
      {
        locala.field_Switch = 3;
        com.tencent.mm.plugin.welab.b.bGu().saK.c(locala, new String[0]);
      }
      else if (locala.field_Switch != 3)
      {
        localIterator.remove();
      }
    }
    if (((List)localObject).isEmpty())
    {
      this.sbi.setVisibility(8);
      GMTrace.o(17490180571136L, 130312);
      return;
    }
    this.sbi.setVisibility(0);
    Collections.sort((List)localObject, this.sbn);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      a((com.tencent.mm.plugin.welab.c.a.a)((Iterator)localObject).next(), this.sbk);
    }
    w.d("MicroMsg.WelabMainUI", "get online app count " + this.sbk.getChildCount());
    GMTrace.o(17490180571136L, 130312);
  }
  
  protected final void MP()
  {
    GMTrace.i(17489777917952L, 130309);
    oM(a.d.saG);
    int i = a.a.white;
    Object localObject = this.vKB;
    if (((p)localObject).vLc != null) {
      ((p)localObject).vLc.setBackgroundColor(i);
    }
    bXp();
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = getWindow();
      ((Window)localObject).clearFlags(201326592);
      ((Window)localObject).addFlags(Integer.MIN_VALUE);
      ((Window)localObject).setStatusBarColor(getResources().getColor(a.a.sal));
    }
    if (cN().cO() != null) {
      cN().cO().getCustomView().setBackgroundColor(getResources().getColor(a.a.sal));
    }
    this.sbh = ((LinearLayout)findViewById(a.b.sas));
    this.sbj = ((LinearLayout)findViewById(a.b.sat));
    this.sbi = ((LinearLayout)findViewById(a.b.sav));
    this.sbk = ((LinearLayout)findViewById(a.b.saw));
    this.sbl = findViewById(a.b.dOA);
    this.sbm = findViewById(a.b.sar);
    this.sbl.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17486825127936L, 130287);
        Intent localIntent = new Intent();
        localIntent.putExtra("title", paramAnonymousView.getResources().getString(a.d.saI));
        localIntent.putExtra("rawUrl", WelabMainUI.this.vKB.vKW.getString(a.d.saE, new Object[] { v.bPK(), Integer.valueOf(com.tencent.mm.protocal.d.tJC) }));
        localIntent.putExtra("showShare", false);
        com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
        GMTrace.o(17486825127936L, 130287);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(17490583224320L, 130315);
        WelabMainUI.this.aLo();
        WelabMainUI.this.finish();
        GMTrace.o(17490583224320L, 130315);
        return true;
      }
    });
    GMTrace.o(17489777917952L, 130309);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(17489643700224L, 130308);
    int i = a.c.saD;
    GMTrace.o(17489643700224L, 130308);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    GMTrace.i(17489509482496L, 130307);
    super.onCreate(paramBundle);
    if (getIntent() != null)
    {
      if (getIntent().getIntExtra("para_from_with_red_point", 0) == 1) {
        bool = true;
      }
      this.saU = bool;
    }
    MP();
    com.tencent.mm.plugin.welab.d.b.bGI();
    ab.bPV().edit().putBoolean("key_has_enter_welab", true).commit();
    com.tencent.mm.plugin.welab.d.b.bGJ();
    com.tencent.mm.plugin.welab.e.o("", 1, this.saU);
    GMTrace.o(17489509482496L, 130307);
  }
  
  public void onPause()
  {
    GMTrace.i(17490046353408L, 130311);
    super.onPause();
    GMTrace.o(17490046353408L, 130311);
  }
  
  public void onResume()
  {
    GMTrace.i(17489912135680L, 130310);
    super.onResume();
    this.sbj.removeAllViews();
    this.sbk.removeAllViews();
    Object localObject = com.tencent.mm.plugin.welab.b.bGu().bGv();
    if ((localObject == null) || (((List)localObject).isEmpty())) {
      this.sbh.setVisibility(8);
    }
    for (;;)
    {
      bGH();
      if ((this.sbh.getVisibility() == 0) || (this.sbi.getVisibility() == 0)) {
        break;
      }
      this.sbm.setVisibility(0);
      GMTrace.o(17489912135680L, 130310);
      return;
      this.sbh.setVisibility(0);
      Collections.sort((List)localObject, this.sbn);
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        a((com.tencent.mm.plugin.welab.c.a.a)((Iterator)localObject).next(), this.sbj);
      }
      w.d("MicroMsg.WelabMainUI", "get online app count " + this.sbj.getChildCount());
    }
    this.sbm.setVisibility(8);
    GMTrace.o(17489912135680L, 130310);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\ui\WelabMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */