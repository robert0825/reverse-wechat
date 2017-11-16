package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankRemitSelectArriveTimeUI
  extends MMPreference
{
  private f htU;
  private List<Preference> olA;
  private int olB;
  private List<EnterTimeParcel> olz;
  
  public BankRemitSelectArriveTimeUI()
  {
    GMTrace.i(20927093932032L, 155919);
    GMTrace.o(20927093932032L, 155919);
  }
  
  protected final void MP()
  {
    GMTrace.i(20927362367488L, 155921);
    this.htU = this.wky;
    if ((this.olz != null) && (this.olz.size() > 0))
    {
      this.olA = new ArrayList();
      int i = 0;
      if (i < this.olz.size())
      {
        EnterTimeParcel localEnterTimeParcel = (EnterTimeParcel)this.olz.get(i);
        w.d("MicroMsg.BankRemitSelectArriveTimeUI", "enter scene: %d", new Object[] { Integer.valueOf(localEnterTimeParcel.ojr) });
        Preference localPreference = new Preference(this);
        localPreference.setLayoutResource(a.g.sLH);
        localPreference.wlc = false;
        localPreference.setKey(localEnterTimeParcel.ojr);
        localPreference.setTitle(localEnterTimeParcel.ojs);
        if (localEnterTimeParcel.ojr == this.olB) {
          localPreference.setWidgetLayoutResource(a.g.cCf);
        }
        for (;;)
        {
          if (localEnterTimeParcel.oju == 0)
          {
            if (!bg.nm(localEnterTimeParcel.ojt)) {
              localPreference.setSummary(localEnterTimeParcel.ojt);
            }
            localPreference.setEnabled(false);
          }
          localPreference.getExtras().putParcelable("arrive_time", localEnterTimeParcel);
          this.htU.a(localPreference);
          this.olA.add(localPreference);
          i += 1;
          break;
          localPreference.setWidgetLayoutResource(a.g.cCg);
        }
      }
    }
    GMTrace.o(20927362367488L, 155921);
  }
  
  public final int QI()
  {
    GMTrace.i(20927496585216L, 155922);
    int i = a.g.sLI;
    GMTrace.o(20927496585216L, 155922);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(20927630802944L, 155923);
    paramf = this.olA.iterator();
    while (paramf.hasNext())
    {
      Preference localPreference = (Preference)paramf.next();
      if (localPreference == paramPreference) {
        localPreference.setWidgetLayoutResource(a.g.cCf);
      } else {
        localPreference.setWidgetLayoutResource(a.g.cCg);
      }
    }
    this.htU.notifyDataSetChanged();
    paramf = (EnterTimeParcel)paramPreference.getExtras().getParcelable("arrive_time");
    if (paramf == null)
    {
      w.i("MicroMsg.BankRemitSelectArriveTimeUI", "is header");
      GMTrace.o(20927630802944L, 155923);
      return false;
    }
    paramPreference = new Intent();
    paramPreference.putExtra("key_enter_time_scene", paramf.ojr);
    setResult(-1, paramPreference);
    finish();
    GMTrace.o(20927630802944L, 155923);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20927228149760L, 155920);
    super.onCreate(paramBundle);
    cN().cO().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.sma)));
    paramBundle = cN().cO().getCustomView();
    if (paramBundle != null)
    {
      View localView = paramBundle.findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.black));
      }
      paramBundle = paramBundle.findViewById(16908308);
      if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
        ((TextView)paramBundle).setTextColor(getResources().getColor(a.c.black));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(Integer.MIN_VALUE);
      paramBundle.setStatusBarColor(getResources().getColor(a.c.sma));
    }
    BankRemitBaseUI.H(this);
    this.vKB.hqF.setFitsSystemWindows(true);
    oM(a.i.sRY);
    this.olz = getIntent().getParcelableArrayListExtra("key_arrive_time_parcel_list");
    this.olB = getIntent().getIntExtra("key_select_arrive_time", -1);
    MP();
    findViewById(16908298).setBackgroundColor(getResources().getColor(a.c.sma));
    a(0, a.h.sQC, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20931791552512L, 155954);
        w.d("MicroMsg.BankRemitSelectArriveTimeUI", "help click");
        GMTrace.o(20931791552512L, 155954);
        return false;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(20901189910528L, 155726);
        BankRemitSelectArriveTimeUI.this.finish();
        GMTrace.o(20901189910528L, 155726);
        return false;
      }
    }, a.h.cJD);
    GMTrace.o(20927228149760L, 155920);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitSelectArriveTimeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */