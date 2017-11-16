package com.tencent.mm.ui.account.bind;

import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ap.b;
import com.tencent.mm.ap.b.a;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.friend.i;
import com.tencent.mm.ui.friend.i.a;

public class BindMobileUI
  extends MMWizardActivity
{
  private String countryCode;
  private String eMW;
  private String gLy;
  private TextView ikm;
  private LinearLayout vRL;
  private TextView vRM;
  private String vRP;
  private BindWordingContent vUP;
  private int vUQ;
  private EditText vUV;
  private TextView vUW;
  private i vUX;
  private Button vUY;
  private TextView vUZ;
  private TextView vVa;
  private CheckBox vVb;
  private CheckBox vVc;
  private LinearLayout vVd;
  private ImageView vVe;
  private boolean vVf;
  
  public BindMobileUI()
  {
    GMTrace.i(2554566017024L, 19033);
    this.gLy = null;
    this.countryCode = null;
    this.vRP = null;
    GMTrace.o(2554566017024L, 19033);
  }
  
  protected final void MP()
  {
    GMTrace.i(2555102887936L, 19037);
    this.vUV = ((EditText)findViewById(R.h.bgU));
    this.vRL = ((LinearLayout)findViewById(R.h.bsh));
    this.vRM = ((TextView)findViewById(R.h.bsj));
    this.vUW = ((TextView)findViewById(R.h.bsf));
    this.ikm = ((TextView)findViewById(R.h.bgY));
    this.vUY = ((Button)findViewById(R.h.bgG));
    this.vUZ = ((TextView)findViewById(R.h.bgV));
    this.ikm.setText(getString(R.l.cZE));
    this.vVa = ((TextView)findViewById(R.h.bgH));
    this.vVd = ((LinearLayout)findViewById(R.h.bgX));
    this.vVc = ((CheckBox)findViewById(R.h.bgQ));
    this.vVb = ((CheckBox)findViewById(R.h.bgP));
    this.vVe = ((ImageView)findViewById(R.h.bgT));
    if (this.vUP != null)
    {
      if ((this.vUP.title != null) && (this.vUP.title.length() > 0)) {
        this.ikm.setText(this.vUP.title);
      }
      if ((this.vUP.content != null) && (this.vUP.content.length() > 0)) {
        this.vVa.setText(this.vUP.content);
      }
    }
    switch (this.vUP.gTy.intValue())
    {
    default: 
      switch (this.vUQ)
      {
      default: 
        label336:
        if ((bg.nm(this.gLy)) && (bg.nm(this.countryCode))) {}
        break;
      }
      break;
    }
    for (;;)
    {
      if ((this.gLy != null) && (!this.gLy.equals(""))) {
        this.vRM.setText(this.gLy);
      }
      if ((this.countryCode != null) && (!this.countryCode.equals(""))) {
        this.vUW.setText("+" + this.countryCode);
      }
      if ((this.vRP != null) && (!this.vRP.equals(""))) {
        this.vUV.setText(this.vRP);
      }
      this.vUY.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2560874250240L, 19080);
          if ((BindMobileUI.a(BindMobileUI.this).getText().toString() == null) || (BindMobileUI.a(BindMobileUI.this).getText().toString().length() == 0))
          {
            Toast.makeText(BindMobileUI.this, BindMobileUI.this.getString(R.l.cZp), 0).show();
            GMTrace.o(2560874250240L, 19080);
            return;
          }
          BindMobileUI.b(BindMobileUI.this, BindMobileUI.b(BindMobileUI.this).getText().toString().trim() + bg.AT(BindMobileUI.a(BindMobileUI.this).getText().toString()));
          BindMobileUI.c(BindMobileUI.this, BindMobileUI.c(BindMobileUI.this));
          GMTrace.o(2560874250240L, 19080);
        }
      });
      this.vUZ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2565840306176L, 19117);
          BindMobileUI.d(BindMobileUI.this);
          GMTrace.o(2565840306176L, 19117);
        }
      });
      if (this.vVf)
      {
        oM(R.l.cZe);
        this.vVe.setVisibility(8);
        this.ikm.setText(R.l.cZx);
        this.vVd.setVisibility(8);
        this.vVc.setVisibility(8);
        this.vVc.setChecked(false);
        this.vVb.setVisibility(0);
        this.vVb.setChecked(false);
        this.vVa.setVisibility(8);
        this.vVa.setText(getString(R.l.cZf));
        this.vUZ.setVisibility(8);
        this.vUY.setText(R.l.cZe);
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(2562484862976L, 19092);
            BindMobileUI.e(BindMobileUI.this);
            GMTrace.o(2562484862976L, 19092);
            return true;
          }
        });
      }
      this.vRL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2565571870720L, 19115);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("country_name", BindMobileUI.f(BindMobileUI.this));
          paramAnonymousView.putExtra("couttry_code", BindMobileUI.g(BindMobileUI.this));
          a.hnH.b(paramAnonymousView, BindMobileUI.this);
          GMTrace.o(2565571870720L, 19115);
        }
      });
      this.vRL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2562216427520L, 19090);
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("country_name", BindMobileUI.f(BindMobileUI.this));
          paramAnonymousView.putExtra("couttry_code", BindMobileUI.g(BindMobileUI.this));
          a.hnH.b(paramAnonymousView, BindMobileUI.this);
          GMTrace.o(2562216427520L, 19090);
        }
      });
      GMTrace.o(2555102887936L, 19037);
      return;
      this.vVe.setImageResource(R.g.aUc);
      break;
      this.vVe.setImageResource(R.g.aUf);
      break;
      this.vVe.setImageResource(R.g.aUd);
      break;
      this.vVd.setVisibility(0);
      this.vVc.setVisibility(0);
      this.vVa.setVisibility(8);
      break label336;
      this.vVd.setVisibility(8);
      this.vVc.setVisibility(8);
      this.vVa.setVisibility(0);
      break label336;
      Object localObject = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      w.d("MicroMsg.BindMContactUI", "tm.getSimCountryIso()" + (String)localObject);
      if (bg.nm((String)localObject))
      {
        w.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
      }
      else
      {
        localObject = b.h(this, (String)localObject, getString(R.l.bsf));
        if (localObject == null)
        {
          w.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
        }
        else
        {
          this.gLy = ((b.a)localObject).gLy;
          this.countryCode = ((b.a)localObject).gLx;
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2555371323392L, 19039);
    int i = R.i.cpW;
    GMTrace.o(2555371323392L, 19039);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(2555237105664L, 19038);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    }
    for (;;)
    {
      GMTrace.o(2555237105664L, 19038);
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
    GMTrace.i(2554700234752L, 19034);
    super.onCreate(paramBundle);
    oM(R.l.cZF);
    this.gLy = bg.aq(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bg.aq(getIntent().getStringExtra("couttry_code"), "");
    this.vRP = bg.aq(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.vUP = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.vUQ = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.vVf = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
    MP();
    GMTrace.o(2554700234752L, 19034);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2554834452480L, 19035);
    super.onDestroy();
    if (this.vUX != null)
    {
      getContentResolver().unregisterContentObserver(this.vUX);
      this.vUX.recycle();
    }
    GMTrace.o(2554834452480L, 19035);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2554968670208L, 19036);
    if (paramInt == 4)
    {
      Bh(1);
      GMTrace.o(2554968670208L, 19036);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2554968670208L, 19036);
    return bool;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(2555505541120L, 19040);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.BindMContactUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        GMTrace.o(2555505541120L, 19040);
        return;
      }
    }
    w.i("MicroMsg.BindMContactUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(2555505541120L, 19040);
      return;
      if ((paramArrayOfInt[0] == 0) && (this.vUX != null)) {
        this.vUX.bYZ();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\account\bind\BindMobileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */