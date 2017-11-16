package com.tencent.mm.ui.account.bind;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class BindMobileStatusUI
  extends MMWizardActivity
{
  private SharedPreferences ghC;
  private Button jgH;
  @SuppressLint({"UseSparseArrays"})
  private HashMap<Integer, Integer> jqC;
  private int status;
  private ImageView vUG;
  private TextView vUH;
  private TextView vUI;
  private ImageView vUJ;
  private ImageView vUK;
  private Boolean vUL;
  private Boolean vUM;
  private RelativeLayout vUN;
  private RelativeLayout vUO;
  private BindWordingContent vUP;
  private int vUQ;
  private boolean vUR;
  private boolean vUS;
  private SparseArray<String> vUT;
  
  public BindMobileStatusUI()
  {
    GMTrace.i(2558189895680L, 19060);
    this.vUL = Boolean.valueOf(true);
    this.vUM = Boolean.valueOf(true);
    this.jqC = new HashMap();
    this.vUT = new SparseArray(3);
    GMTrace.o(2558189895680L, 19060);
  }
  
  public static void c(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool2 = false;
    int j = 1;
    GMTrace.i(2559129419776L, 19067);
    paramContext = paramContext.getSharedPreferences(paramContext.getPackageName() + "_preferences", 0);
    Object localObject = paramContext.edit();
    boolean bool1;
    if (!paramBoolean1)
    {
      bool1 = true;
      ((SharedPreferences.Editor)localObject).putBoolean("settings_find_me_by_mobile", bool1).commit();
      paramContext = paramContext.edit();
      bool1 = bool2;
      if (!paramBoolean2) {
        bool1 = true;
      }
      paramContext.putBoolean("settings_recommend_mobilefriends_to_me", bool1).commit();
      i = q.zI();
      if (!paramBoolean1) {
        break label271;
      }
      i |= 0x200;
      label123:
      if (!paramBoolean2) {
        break label280;
      }
      i |= 0x100;
      label133:
      at.AR();
      c.xh().set(7, Integer.valueOf(i));
      paramContext = new uu();
      paramContext.umY = 8;
      if (!paramBoolean2) {
        break label289;
      }
      i = 1;
      label169:
      paramContext.umZ = i;
      at.AR();
      c.yJ().b(new e.a(23, paramContext));
      localObject = new uu();
      ((uu)localObject).umY = 7;
      if (!paramBoolean1) {
        break label294;
      }
    }
    label271:
    label280:
    label289:
    label294:
    for (int i = j;; i = 2)
    {
      paramContext.umZ = i;
      at.AR();
      c.yJ().b(new e.a(23, (com.tencent.mm.bm.a)localObject));
      com.tencent.mm.plugin.c.a.hnI.pr();
      GMTrace.o(2559129419776L, 19067);
      return;
      bool1 = false;
      break;
      i &= 0xFDFF;
      break label123;
      i &= 0xFEFF;
      break label133;
      i = 2;
      break label169;
    }
  }
  
  private boolean e(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(2558726766592L, 19064);
    w.d("MicroMsg.BindMobileStatusUI", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    label68:
    String str;
    Boolean localBoolean;
    if (paramBoolean)
    {
      this.status |= paramInt1;
      if (!paramBoolean) {
        break label200;
      }
      paramInt1 = 1;
      this.jqC.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      str = (String)this.vUT.get(paramInt2);
      if ((this.ghC != null) && (str != null) && (str.length() > 0))
      {
        localBoolean = Boolean.valueOf(paramBoolean);
        if ((paramInt2 == 8) || (paramInt2 == 7)) {
          if (paramBoolean) {
            break label205;
          }
        }
      }
    }
    label200:
    label205:
    for (paramBoolean = true;; paramBoolean = false)
    {
      localBoolean = Boolean.valueOf(paramBoolean);
      this.ghC.edit().putBoolean(str, localBoolean.booleanValue()).commit();
      GMTrace.o(2558726766592L, 19064);
      return true;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
      paramInt1 = 2;
      break label68;
    }
  }
  
  protected final void MP()
  {
    boolean bool2 = true;
    GMTrace.i(2558860984320L, 19065);
    this.vUG = ((ImageView)findViewById(R.h.bgO));
    this.vUI = ((TextView)findViewById(R.h.bgM));
    this.vUH = ((TextView)findViewById(R.h.bgL));
    this.jgH = ((Button)findViewById(R.h.bgN));
    this.vUJ = ((ImageView)findViewById(R.h.bhk));
    this.vUK = ((ImageView)findViewById(R.h.bhj));
    this.vUN = ((RelativeLayout)findViewById(R.h.bgI));
    this.vUO = ((RelativeLayout)findViewById(R.h.bgJ));
    switch (this.vUQ)
    {
    default: 
      if (this.vUP != null) {}
      switch (this.vUP.gTy.intValue())
      {
      case 0: 
      case 1: 
      default: 
        label192:
        this.jgH.setVisibility(8);
        a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(2566108741632L, 19119);
            BindMobileStatusUI.a(BindMobileStatusUI.this);
            GMTrace.o(2566108741632L, 19119);
            return false;
          }
        });
        if ((m.Ho() == m.a.gDm) || (m.Ho() == m.a.gDn))
        {
          this.vUG.setImageResource(R.g.aUe);
          at.AR();
          String str = (String)c.xh().get(6, null);
          if ((str == null) || (str.equals("")))
          {
            at.AR();
            c.xh().get(4097, null);
          }
        }
        break;
      }
      break;
    }
    for (;;)
    {
      this.vUJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          boolean bool2 = true;
          GMTrace.i(2562753298432L, 19094);
          paramAnonymousView = BindMobileStatusUI.this;
          if (!BindMobileStatusUI.b(BindMobileStatusUI.this).booleanValue())
          {
            bool1 = true;
            BindMobileStatusUI.a(paramAnonymousView, Boolean.valueOf(bool1));
            if (!BindMobileStatusUI.b(BindMobileStatusUI.this).booleanValue()) {
              break label112;
            }
            BindMobileStatusUI.c(BindMobileStatusUI.this).setImageResource(R.k.cLt);
            label66:
            paramAnonymousView = BindMobileStatusUI.this;
            if (BindMobileStatusUI.b(BindMobileStatusUI.this).booleanValue()) {
              break label128;
            }
          }
          label112:
          label128:
          for (boolean bool1 = bool2;; bool1 = false)
          {
            BindMobileStatusUI.a(paramAnonymousView, bool1, 512, 8);
            GMTrace.o(2562753298432L, 19094);
            return;
            bool1 = false;
            break;
            BindMobileStatusUI.c(BindMobileStatusUI.this).setImageResource(R.k.cLu);
            break label66;
          }
        }
      });
      this.vUK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          boolean bool2 = true;
          GMTrace.i(2560605814784L, 19078);
          paramAnonymousView = BindMobileStatusUI.this;
          if (!BindMobileStatusUI.d(BindMobileStatusUI.this).booleanValue())
          {
            bool1 = true;
            BindMobileStatusUI.b(paramAnonymousView, Boolean.valueOf(bool1));
            if (!BindMobileStatusUI.d(BindMobileStatusUI.this).booleanValue()) {
              break label138;
            }
            BindMobileStatusUI.e(BindMobileStatusUI.this).setImageResource(R.k.cLt);
            label66:
            paramAnonymousView = BindMobileStatusUI.this;
            if (BindMobileStatusUI.d(BindMobileStatusUI.this).booleanValue()) {
              break label154;
            }
          }
          label138:
          label154:
          for (boolean bool1 = bool2;; bool1 = false)
          {
            BindMobileStatusUI.a(paramAnonymousView, bool1, 256, 7);
            if (!BindMobileStatusUI.d(BindMobileStatusUI.this).booleanValue()) {
              BindMobileStatusUI.a(BindMobileStatusUI.this, false, 2097152, 32);
            }
            GMTrace.o(2560605814784L, 19078);
            return;
            bool1 = false;
            break;
            BindMobileStatusUI.e(BindMobileStatusUI.this).setImageResource(R.k.cLu);
            break label66;
          }
        }
      });
      this.jgH.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2561947992064L, 19088);
          BindMobileStatusUI.f(BindMobileStatusUI.this);
          GMTrace.o(2561947992064L, 19088);
        }
      });
      GMTrace.o(2558860984320L, 19065);
      return;
      this.vUN.setVisibility(8);
      this.vUO.setVisibility(8);
      if (!this.vUR)
      {
        bool1 = true;
        label377:
        e(bool1, 512, 8);
        if (this.vUS) {
          break label416;
        }
      }
      label416:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        e(bool1, 256, 7);
        break;
        bool1 = false;
        break label377;
      }
      this.vUN.setVisibility(0);
      this.vUN.setBackgroundResource(R.g.aUg);
      this.vUO.setVisibility(8);
      break;
      this.vUH.setVisibility(8);
      break label192;
      this.vUG.setImageResource(R.g.aUb);
      this.vUH.setVisibility(8);
      this.vUI.setText(getString(R.l.cZd));
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2558458331136L, 19062);
    int i = R.i.cpX;
    GMTrace.o(2558458331136L, 19062);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2558324113408L, 19061);
    super.onCreate(paramBundle);
    this.ghC = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.status = q.zI();
    this.vUT.put(8, "settings_find_me_by_mobile");
    this.vUT.put(7, "settings_recommend_mobilefriends_to_me");
    this.vUT.put(32, "settings_autoadd_mobilefriends");
    e(false, 512, 8);
    e(false, 256, 7);
    oM(R.l.cZI);
    this.vUP = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.vUQ = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.vUR = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
    this.vUS = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
    MP();
    GMTrace.o(2558324113408L, 19061);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2558995202048L, 19066);
    if (paramInt == 4)
    {
      Bh(1);
      GMTrace.o(2558995202048L, 19066);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2558995202048L, 19066);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(2558592548864L, 19063);
    at.AR();
    c.xh().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.jqC.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new uu();
      ((uu)localObject).umY = i;
      ((uu)localObject).umZ = j;
      at.AR();
      c.yJ().b(new e.a(23, (com.tencent.mm.bm.a)localObject));
      w.d("MicroMsg.BindMobileStatusUI", "switch  " + i + " " + j);
    }
    this.jqC.clear();
    super.onPause();
    GMTrace.o(2558592548864L, 19063);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\account\bind\BindMobileStatusUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */