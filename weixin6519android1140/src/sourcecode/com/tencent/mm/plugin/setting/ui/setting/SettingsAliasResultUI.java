package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.RegByMobileSetPwdUI;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class SettingsAliasResultUI
  extends MMActivity
{
  private String fsF;
  private TextView hqI;
  private TextView oIH;
  private Button oII;
  private ImageView oIJ;
  private boolean oIK;
  
  public SettingsAliasResultUI()
  {
    GMTrace.i(4611318480896L, 34357);
    GMTrace.o(4611318480896L, 34357);
  }
  
  protected final void MP()
  {
    GMTrace.i(4611989569536L, 34362);
    oM(R.l.dJb);
    this.hqI = ((TextView)findViewById(R.h.bti));
    this.oIH = ((TextView)findViewById(R.h.bdO));
    this.oII = ((Button)findViewById(R.h.ccx));
    this.oIJ = ((ImageView)findViewById(R.h.bSn));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4599373103104L, 34268);
        SettingsAliasResultUI.this.finish();
        GMTrace.o(4599373103104L, 34268);
        return true;
      }
    });
    this.oIH.setText(this.fsF);
    if (!this.oIK)
    {
      this.oII.setVisibility(0);
      this.hqI.setText(getString(R.l.dJg));
    }
    for (;;)
    {
      this.oII.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4691312246784L, 34953);
          paramAnonymousView = new Intent(SettingsAliasResultUI.this.vKB.vKW, RegByMobileSetPwdUI.class);
          paramAnonymousView.putExtra("kintent_hint", SettingsAliasResultUI.this.getString(R.l.dRE));
          SettingsAliasResultUI.this.startActivityForResult(paramAnonymousView, 0);
          GMTrace.o(4691312246784L, 34953);
        }
      });
      GMTrace.o(4611989569536L, 34362);
      return;
      this.oII.setVisibility(8);
      this.hqI.setText(getString(R.l.dJh));
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4611586916352L, 34359);
    int i = R.i.cGb;
    GMTrace.o(4611586916352L, 34359);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4612123787264L, 34363);
    if (paramInt2 == -1) {
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(4612123787264L, 34363);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4611452698624L, 34358);
    super.onCreate(paramBundle);
    at.AR();
    this.fsF = ((String)c.xh().get(42, null));
    this.oIK = Boolean.valueOf(getIntent().getBooleanExtra("has_pwd", true)).booleanValue();
    MP();
    GMTrace.o(4611452698624L, 34358);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4611855351808L, 34361);
    super.onDestroy();
    GMTrace.o(4611855351808L, 34361);
  }
  
  public void onPause()
  {
    GMTrace.i(4611721134080L, 34360);
    super.onPause();
    GMTrace.o(4611721134080L, 34360);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsAliasResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */