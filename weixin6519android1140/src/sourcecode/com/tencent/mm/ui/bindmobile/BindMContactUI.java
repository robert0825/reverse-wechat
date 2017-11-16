package com.tencent.mm.ui.bindmobile;

import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.friend.i;
import com.tencent.mm.ui.friend.i.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.Map;

public class BindMContactUI
  extends MMWizardActivity
{
  private String countryCode;
  private String eMW;
  private int fromScene;
  private String gLy;
  private boolean iZm;
  private LinearLayout vRL;
  private TextView vRM;
  private String vRP;
  private EditText vUV;
  private TextView vUW;
  private i vUX;
  private CheckBox vVb;
  private boolean vVm;
  private boolean vVo;
  private boolean wnb;
  private TextView wnl;
  private LinearLayout wnm;
  private boolean wnn;
  
  public BindMContactUI()
  {
    GMTrace.i(3129957416960L, 23320);
    this.gLy = null;
    this.countryCode = null;
    this.vRP = null;
    this.vVm = false;
    this.wnb = false;
    this.vVo = false;
    this.wnn = false;
    this.iZm = false;
    this.fromScene = 0;
    GMTrace.o(3129957416960L, 23320);
  }
  
  private void cbk()
  {
    GMTrace.i(3130494287872L, 23324);
    if ((this.vVm) || (this.wnb))
    {
      vMN.clear();
      Bh(1);
      GMTrace.o(3130494287872L, 23324);
      return;
    }
    int i;
    if (this.wnn)
    {
      i = R.l.cZu;
      if (!this.wnn) {
        break label101;
      }
    }
    label101:
    for (int j = R.l.cZw;; j = R.l.cZv)
    {
      h.a(this, i, j, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3101369040896L, 23107);
          BindMContactUI.a(BindMContactUI.this);
          GMTrace.o(3101369040896L, 23107);
        }
      }, null);
      GMTrace.o(3130494287872L, 23324);
      return;
      i = R.l.cZt;
      break;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(3130628505600L, 23325);
    this.vVm = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.wnb = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.vVo = getIntent().getBooleanExtra("BIND_FOR_QQ_REG", false);
    this.wnn = getIntent().getBooleanExtra("is_bind_for_change_mobile", false);
    this.iZm = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.fromScene = getIntent().getIntExtra("bind_scene", 0);
    w.i("MicroMsg.BindMContactUI", "bindScene:%d", new Object[] { Integer.valueOf(this.fromScene) });
    this.vUV = ((EditText)findViewById(R.h.bgU));
    this.vRL = ((LinearLayout)findViewById(R.h.bsh));
    this.vRM = ((TextView)findViewById(R.h.bsj));
    this.vUW = ((TextView)findViewById(R.h.bsf));
    this.vVb = ((CheckBox)findViewById(R.h.bgR));
    this.wnm = ((LinearLayout)findViewById(R.h.bgS));
    this.wnl = ((TextView)findViewById(R.h.ccE));
    String str1;
    if (this.wnn)
    {
      at.AR();
      String str2 = (String)com.tencent.mm.y.c.xh().get(6, null);
      if (!bg.nm(str2))
      {
        if (!str2.startsWith("+")) {
          break label517;
        }
        str1 = an.AL(str2);
        str2 = str2.substring(str1.length() + 1);
        new an();
        str1 = an.formatNumber(str1, str2);
        this.wnl.setText(getString(R.l.cZi, new Object[] { str1 }));
      }
    }
    if ((this.gLy != null) && (!this.gLy.equals(""))) {
      this.vRM.setText(this.gLy);
    }
    if ((this.countryCode != null) && (!this.countryCode.equals(""))) {
      this.vUW.setText("+" + this.countryCode);
    }
    if ((this.vRP != null) && (!this.vRP.equals("")))
    {
      this.vUV.setText(this.vRP);
      this.vUV.setSelection(this.vRP.length());
    }
    for (;;)
    {
      if (com.tencent.mm.ap.b.Jw())
      {
        this.wnm.setVisibility(4);
        this.vVb.setChecked(true);
      }
      a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(3125125578752L, 23284);
          BindMContactUI.a(BindMContactUI.this, BindMContactUI.d(BindMContactUI.this).getText().toString().trim() + bg.AT(BindMContactUI.b(BindMContactUI.this).getText().toString()));
          if ((!com.tencent.mm.pluginsdk.a.NT(BindMContactUI.e(BindMContactUI.this))) || (bg.AT(BindMContactUI.b(BindMContactUI.this).getText().toString()).length() <= 0))
          {
            h.h(BindMContactUI.this, R.l.cZD, R.l.cUG);
            GMTrace.o(3125125578752L, 23284);
            return true;
          }
          w.i("MicroMsg.BindMContactUI", "do next, send sms to self");
          BindMContactUI.b(BindMContactUI.this, BindMContactUI.e(BindMContactUI.this));
          GMTrace.o(3125125578752L, 23284);
          return true;
        }
      });
      this.vUV.requestFocus();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(3123783401472L, 23274);
          BindMContactUI.f(BindMContactUI.this);
          GMTrace.o(3123783401472L, 23274);
          return true;
        }
      });
      this.vRL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3127407280128L, 23301);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("country_name", BindMContactUI.g(BindMContactUI.this));
          paramAnonymousView.putExtra("couttry_code", BindMContactUI.c(BindMContactUI.this));
          com.tencent.mm.plugin.c.a.hnH.b(paramAnonymousView, BindMContactUI.this);
          GMTrace.o(3127407280128L, 23301);
        }
      });
      GMTrace.o(3130628505600L, 23325);
      return;
      label517:
      str1 = "86";
      break;
      at.xB().a(new af.a()
      {
        String jPF;
        
        public final boolean Dj()
        {
          GMTrace.i(3123380748288L, 23271);
          this.jPF = com.tencent.mm.modelsimple.c.y(BindMContactUI.this, BindMContactUI.c(BindMContactUI.this));
          GMTrace.o(3123380748288L, 23271);
          return true;
        }
        
        public final boolean Dk()
        {
          GMTrace.i(3123246530560L, 23270);
          if (bg.nm(BindMContactUI.b(BindMContactUI.this).getText().trim()))
          {
            if (bg.nm(this.jPF)) {
              break label93;
            }
            BindMContactUI.b(BindMContactUI.this).setText(this.jPF);
            BindMContactUI.b(BindMContactUI.this).setSelection(this.jPF.length());
          }
          for (;;)
          {
            GMTrace.o(3123246530560L, 23270);
            return true;
            label93:
            BindMContactUI.b(BindMContactUI.this).setText("");
          }
        }
        
        public final String toString()
        {
          GMTrace.i(3123514966016L, 23272);
          String str = super.toString() + "|initView";
          GMTrace.o(3123514966016L, 23272);
          return str;
        }
      });
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3130896941056L, 23327);
    int i = R.i.cqc;
    GMTrace.o(3130896941056L, 23327);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(3130762723328L, 23326);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    }
    for (;;)
    {
      GMTrace.o(3130762723328L, 23326);
      return;
      this.gLy = bg.aq(paramIntent.getStringExtra("country_name"), "");
      this.countryCode = bg.aq(paramIntent.getStringExtra("couttry_code"), "");
      if (!this.gLy.equals("")) {
        this.vRM.setText(this.gLy);
      }
      if (!this.countryCode.equals("")) {
        this.vUW.setText("+" + this.countryCode);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3130091634688L, 23321);
    super.onCreate(paramBundle);
    oM(R.l.cZH);
    this.gLy = bg.aq(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bg.aq(getIntent().getStringExtra("couttry_code"), "");
    this.vRP = bg.aq(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    MP();
    GMTrace.o(3130091634688L, 23321);
  }
  
  public void onDestroy()
  {
    GMTrace.i(3130225852416L, 23322);
    super.onDestroy();
    if (this.vUX != null)
    {
      getContentResolver().unregisterContentObserver(this.vUX);
      this.vUX.recycle();
    }
    GMTrace.o(3130225852416L, 23322);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(3130360070144L, 23323);
    if (paramInt == 4)
    {
      cbk();
      GMTrace.o(3130360070144L, 23323);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(3130360070144L, 23323);
    return bool;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(3131031158784L, 23328);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.BindMContactUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        GMTrace.o(3131031158784L, 23328);
        return;
      }
    }
    w.i("MicroMsg.BindMContactUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(3131031158784L, 23328);
      return;
      if ((paramArrayOfInt[0] == 0) && (this.vUX != null)) {
        this.vUX.bYZ();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindmobile\BindMContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */