package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ui.base.preference.CheckPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.TextButtonPreference;
import com.tencent.mm.ui.base.preference.f;

public class UnfamiliarContactUI
  extends MMPreference
{
  private boolean oFV;
  private boolean oFW;
  private boolean oFX;
  
  public UnfamiliarContactUI()
  {
    GMTrace.i(18377762406400L, 136925);
    GMTrace.o(18377762406400L, 136925);
  }
  
  protected final void MP()
  {
    GMTrace.i(18378299277312L, 136929);
    super.MP();
    oM(R.l.ebe);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18379238801408L, 136936);
        UnfamiliarContactUI.this.finish();
        GMTrace.o(18379238801408L, 136936);
        return true;
      }
    });
    ((CheckPreference)this.wky.VG("settings_half_year_not_chat")).wjr = 0;
    ((CheckPreference)this.wky.VG("settings_has_not_same_chatroom")).wjr = 0;
    ((CheckPreference)this.wky.VG("settings_half_year_not_response")).wjr = 0;
    ((TextButtonPreference)this.wky.VG("settings_next_step")).setEnabled(false);
    this.wky.notifyDataSetChanged();
    GMTrace.o(18378299277312L, 136929);
  }
  
  public final int QI()
  {
    GMTrace.i(18378030841856L, 136927);
    int i = R.o.epA;
    GMTrace.o(18378030841856L, 136927);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = false;
    GMTrace.i(18378165059584L, 136928);
    CheckPreference localCheckPreference;
    boolean bool1;
    if ((paramPreference instanceof CheckPreference))
    {
      localCheckPreference = (CheckPreference)paramPreference;
      if (paramPreference.hiu.equals("settings_half_year_not_chat")) {
        if (!this.oFV)
        {
          bool1 = true;
          localCheckPreference.sdM = bool1;
          if (this.oFV) {
            break label129;
          }
          bool1 = true;
          label60:
          this.oFV = bool1;
          label65:
          paramPreference = (TextButtonPreference)paramf.VG("settings_next_step");
          if ((!this.oFV) && (!this.oFX))
          {
            bool1 = bool2;
            if (!this.oFW) {}
          }
          else
          {
            bool1 = true;
          }
          paramPreference.setEnabled(bool1);
        }
      }
    }
    for (;;)
    {
      paramf.notifyDataSetChanged();
      GMTrace.o(18378165059584L, 136928);
      return true;
      bool1 = false;
      break;
      label129:
      bool1 = false;
      break label60;
      if (paramPreference.hiu.equals("settings_has_not_same_chatroom"))
      {
        if (!this.oFX)
        {
          bool1 = true;
          label155:
          localCheckPreference.sdM = bool1;
          if (this.oFX) {
            break label183;
          }
        }
        label183:
        for (bool1 = true;; bool1 = false)
        {
          this.oFX = bool1;
          break;
          bool1 = false;
          break label155;
        }
      }
      if (!paramPreference.hiu.equals("settings_half_year_not_response")) {
        break label65;
      }
      if (!this.oFW)
      {
        bool1 = true;
        label209:
        localCheckPreference.sdM = bool1;
        if (this.oFW) {
          break label237;
        }
      }
      label237:
      for (bool1 = true;; bool1 = false)
      {
        this.oFW = bool1;
        break;
        bool1 = false;
        break label209;
      }
      if (paramPreference.hiu.equals("settings_next_step"))
      {
        paramPreference = new Intent(this, UnfamiliarContactDetailUI.class);
        paramPreference.putExtra("half_year_not_chat", this.oFV);
        paramPreference.putExtra("half_year_not_response", this.oFW);
        paramPreference.putExtra("has_not_same_chatroom", this.oFX);
        startActivityForResult(paramPreference, 291);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18377896624128L, 136926);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(18377896624128L, 136926);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(18378433495040L, 136930);
    if (paramInt == 4)
    {
      onBackPressed();
      GMTrace.o(18378433495040L, 136930);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(18378433495040L, 136930);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\UnfamiliarContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */