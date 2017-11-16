package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class MailAddrProfileUI
  extends MMPreference
{
  private f htU;
  private String mwD;
  private boolean nWL;
  private String name;
  
  public MailAddrProfileUI()
  {
    GMTrace.i(5546279174144L, 41323);
    GMTrace.o(5546279174144L, 41323);
  }
  
  protected final void MP()
  {
    GMTrace.i(5546681827328L, 41326);
    oM(R.l.dDo);
    this.htU = this.wky;
    ((KeyValuePreference)this.htU.VG("mail_receiver_info_name")).setSummary(this.name);
    ((KeyValuePreference)this.htU.VG("mail_receiver_info_addr")).setSummary(getIntent().getStringExtra("addr"));
    Preference localPreference = this.htU.VG("mail_compose_btn");
    if (!this.nWL) {
      this.htU.c(localPreference);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5563861696512L, 41454);
        MailAddrProfileUI.this.aLo();
        MailAddrProfileUI.this.finish();
        GMTrace.o(5563861696512L, 41454);
        return true;
      }
    });
    GMTrace.o(5546681827328L, 41326);
  }
  
  public final int QI()
  {
    GMTrace.i(5546413391872L, 41324);
    int i = R.o.eoW;
    GMTrace.o(5546413391872L, 41324);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(5546816045056L, 41327);
    if (paramPreference.hiu.equals("mail_compose_btn"))
    {
      paramf = new Intent(this, ComposeUI.class);
      paramf.putExtra("composeType", 4);
      paramf.putExtra("toList", new String[] { this.name + " " + this.mwD });
      startActivity(paramf);
      finish();
    }
    GMTrace.o(5546816045056L, 41327);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5546547609600L, 41325);
    super.onCreate(paramBundle);
    this.name = getIntent().getStringExtra("name");
    this.mwD = getIntent().getStringExtra("addr");
    this.nWL = getIntent().getBooleanExtra("can_compose", false);
    MP();
    GMTrace.o(5546547609600L, 41325);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\MailAddrProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */