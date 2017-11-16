package com.tencent.mm.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bj;

@Deprecated
public class LoginSelectorUI
  extends MMActivity
  implements View.OnClickListener
{
  private View mHl;
  private TextView vRf;
  
  public LoginSelectorUI()
  {
    GMTrace.i(2777233227776L, 20692);
    GMTrace.o(2777233227776L, 20692);
  }
  
  protected final void MP()
  {
    GMTrace.i(2777770098688L, 20696);
    Button localButton1 = (Button)findViewById(R.h.cbD);
    Button localButton2 = (Button)findViewById(R.h.cbM);
    this.vRf = ((TextView)findViewById(R.h.cbz));
    this.mHl = findViewById(R.h.cbA);
    localButton1.setOnClickListener(this);
    localButton2.setOnClickListener(this);
    this.vRf.setText(v.g(this.vKB.vKW, R.c.aMp, R.l.cTr));
    this.mHl.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2734417772544L, 20373);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("not_auth_setting", true);
        a.hnH.r(paramAnonymousView, LoginSelectorUI.this.vKB.vKW);
        GMTrace.o(2734417772544L, 20373);
      }
    });
    if (f.vhu)
    {
      a.hnI.e(this);
      GMTrace.o(2777770098688L, 20696);
      return;
    }
    a.hnI.al(this);
    GMTrace.o(2777770098688L, 20696);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2777501663232L, 20694);
    int i = R.i.cFH;
    GMTrace.o(2777501663232L, 20694);
    return i;
  }
  
  public void onClick(View paramView)
  {
    int i = 1;
    GMTrace.i(2778038534144L, 20698);
    if (R.h.cbD == paramView.getId())
    {
      paramView = new Intent(this, MobileInputUI.class);
      paramView.putExtra("mobile_input_purpose", 1);
      startActivity(paramView);
      GMTrace.o(2778038534144L, 20698);
      return;
    }
    if (R.h.cbM == paramView.getId())
    {
      if (d.tJF)
      {
        paramView = getString(R.l.dmb, new Object[] { "0x" + Integer.toHexString(d.tJC), v.bPK() });
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramView);
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("show_bottom", false);
        localIntent.putExtra("needRedirect", false);
        localIntent.putExtra("neverGetA8Key", true);
        localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
        localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
        a.hnH.j(localIntent, this);
        GMTrace.o(2778038534144L, 20698);
        return;
      }
      if (bj.BC().BD() > 0) {}
      while (i == 0)
      {
        paramView = new Intent(this, MobileInputUI.class);
        paramView.putExtra("mobile_input_purpose", 2);
        startActivity(paramView);
        GMTrace.o(2778038534144L, 20698);
        return;
        i = 0;
      }
      paramView = new Intent(this, RegByMobileRegAIOUI.class);
      paramView.putExtra("login_type", 0);
      startActivity(paramView);
    }
    GMTrace.o(2778038534144L, 20698);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2777367445504L, 20693);
    super.onCreate(paramBundle);
    AU(8);
    a.hnI.pu();
    at.wO();
    MP();
    GMTrace.o(2777367445504L, 20693);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2777904316416L, 20697);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      Intent localIntent = a.hnH.ao(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
      b.fm(this);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2777904316416L, 20697);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(2777635880960L, 20695);
    super.onResume();
    at.wO();
    GMTrace.o(2777635880960L, 20695);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\account\LoginSelectorUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */