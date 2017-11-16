package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ao;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.d;
import com.tencent.mm.ui.p;

public class SnsSettingIntroduceUI
  extends MMActivity
{
  private Button qfi;
  private Button qfj;
  private Intent qfk;
  
  public SnsSettingIntroduceUI()
  {
    GMTrace.i(8708046192640L, 64880);
    GMTrace.o(8708046192640L, 64880);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8708583063552L, 64884);
    int i = i.g.pgg;
    GMTrace.o(8708583063552L, 64884);
    return i;
  }
  
  @TargetApi(17)
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8708314628096L, 64882);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    this.vKB.bXF();
    this.qfk = getIntent();
    this.qfi = ((Button)findViewById(i.f.bfv));
    this.qfi.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8364985679872L, 62324);
        g.ork.i(14090, new Object[] { Integer.valueOf(3) });
        d.b(SnsSettingIntroduceUI.this, "sns", ".ui.En_424b8e16", SnsSettingIntroduceUI.a(SnsSettingIntroduceUI.this));
        SnsSettingIntroduceUI.this.finish();
        SnsSettingIntroduceUI.this.overridePendingTransition(0, 0);
        GMTrace.o(8364985679872L, 62324);
      }
    });
    g.ork.i(14090, new Object[] { Integer.valueOf(1) });
    this.qfj = ((Button)findViewById(i.f.bFs));
    this.qfj.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8577720778752L, 63909);
        paramAnonymousView = new ao();
        paramAnonymousView.eBL.index = 3;
        a.vgX.m(paramAnonymousView);
        paramAnonymousView = new Intent();
        d.b(SnsSettingIntroduceUI.this.vKB.vKW, "setting", ".ui.setting.SettingsUI", paramAnonymousView);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("enter_scene", e.d.vGH);
        d.b(SnsSettingIntroduceUI.this.vKB.vKW, "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymousView);
        g.ork.i(14090, new Object[] { Integer.valueOf(2) });
        SnsSettingIntroduceUI.this.finish();
        GMTrace.o(8577720778752L, 63909);
      }
    });
    GMTrace.o(8708314628096L, 64882);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8708180410368L, 64881);
    super.onDestroy();
    GMTrace.o(8708180410368L, 64881);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(8708448845824L, 64883);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      finish();
      g.ork.i(14090, new Object[] { Integer.valueOf(3) });
      GMTrace.o(8708448845824L, 64883);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(8708448845824L, 64883);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsSettingIntroduceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */