package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class FreeWifiIntroductionUI
  extends MMActivity
{
  private int cfz;
  private Button lsq;
  private Button ltK;
  private Button ltL;
  private CheckBox ltM;
  
  public FreeWifiIntroductionUI()
  {
    GMTrace.i(7201720631296L, 53657);
    GMTrace.o(7201720631296L, 53657);
  }
  
  protected final void MP()
  {
    GMTrace.i(7201989066752L, 53659);
    this.ltK = ((Button)findViewById(R.h.brX));
    this.ltM = ((CheckBox)findViewById(R.h.bdu));
    this.lsq = ((Button)findViewById(R.h.bGd));
    this.ltL = ((Button)findViewById(R.h.cjB));
    this.cfz = getIntent().getIntExtra("free_wifi_source", 1);
    if (this.cfz == 3)
    {
      oM(R.l.dIK);
      ((TextView)findViewById(R.h.bBy)).setText(R.l.dII);
      ((TextView)findViewById(R.h.bBt)).setText(R.l.dIH);
      this.lsq.setVisibility(8);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7203331244032L, 53669);
          FreeWifiIntroductionUI.this.finish();
          GMTrace.o(7203331244032L, 53669);
          return false;
        }
      });
      this.ltK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7170582118400L, 53425);
          at.AR();
          c.xh().set(303104, Integer.valueOf(1));
          paramAnonymousView = FreeWifiIntroductionUI.this.getIntent();
          paramAnonymousView.setClass(FreeWifiIntroductionUI.this, FreeWifiEntryUI.class);
          FreeWifiIntroductionUI.this.startActivity(paramAnonymousView);
          FreeWifiIntroductionUI.this.finish();
          GMTrace.o(7170582118400L, 53425);
        }
      });
      this.ltM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
      {
        public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
        {
          GMTrace.i(7174474432512L, 53454);
          if (paramAnonymousBoolean)
          {
            FreeWifiIntroductionUI.a(FreeWifiIntroductionUI.this).setEnabled(true);
            GMTrace.o(7174474432512L, 53454);
            return;
          }
          FreeWifiIntroductionUI.a(FreeWifiIntroductionUI.this).setEnabled(false);
          GMTrace.o(7174474432512L, 53454);
        }
      });
      this.ltL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7169508376576L, 53417);
          if (FreeWifiIntroductionUI.b(FreeWifiIntroductionUI.this) == 3) {}
          for (paramAnonymousView = FreeWifiIntroductionUI.this.getString(R.l.dIJ);; paramAnonymousView = FreeWifiIntroductionUI.this.getString(R.l.dxY))
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", paramAnonymousView);
            localIntent.putExtra("showShare", false);
            localIntent.putExtra("show_bottom", false);
            d.b(FreeWifiIntroductionUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
            GMTrace.o(7169508376576L, 53417);
            return;
          }
        }
      });
      this.lsq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7157428781056L, 53327);
          paramAnonymousView = FreeWifiIntroductionUI.this.getString(R.l.dxL);
          Intent localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramAnonymousView);
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("show_bottom", false);
          d.b(FreeWifiIntroductionUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
          GMTrace.o(7157428781056L, 53327);
        }
      });
      GMTrace.o(7201989066752L, 53659);
      return;
      oM(R.l.dyb);
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(7202123284480L, 53660);
    GMTrace.o(7202123284480L, 53660);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7202257502208L, 53661);
    int i = R.i.cxt;
    GMTrace.o(7202257502208L, 53661);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7201854849024L, 53658);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(7201854849024L, 53658);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiIntroductionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */