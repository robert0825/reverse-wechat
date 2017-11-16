package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountAgreementUI
  extends MMActivity
{
  public SettingDeleteAccountAgreementUI()
  {
    GMTrace.i(4713189736448L, 35116);
    GMTrace.o(4713189736448L, 35116);
  }
  
  protected final void MP()
  {
    GMTrace.i(4713592389632L, 35119);
    final TextView localTextView = (TextView)findViewById(R.h.bQR);
    localTextView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4711310688256L, 35102);
        SettingDeleteAccountAgreementUI.this.startActivity(new Intent(SettingDeleteAccountAgreementUI.this, SettingDeleteAccountInputPassUI.class));
        GMTrace.o(4711310688256L, 35102);
      }
    });
    final CheckedTextView localCheckedTextView = (CheckedTextView)findViewById(R.h.bdx);
    localCheckedTextView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4612660658176L, 34367);
        localTextView.setEnabled(localCheckedTextView.isChecked());
        GMTrace.o(4612660658176L, 34367);
      }
    });
    localTextView.setEnabled(localCheckedTextView.isChecked());
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4630914269184L, 34503);
        SettingDeleteAccountAgreementUI.this.aLo();
        SettingDeleteAccountAgreementUI.this.finish();
        GMTrace.o(4630914269184L, 34503);
        return true;
      }
    });
    GMTrace.o(4713592389632L, 35119);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4713323954176L, 35117);
    int i = R.i.cFX;
    GMTrace.o(4713323954176L, 35117);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4713458171904L, 35118);
    super.onCreate(paramBundle);
    oM(R.l.dXM);
    MP();
    GMTrace.o(4713458171904L, 35118);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingDeleteAccountAgreementUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */