package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.v.a.h;

public abstract class i
  extends u
{
  public SharedPreferences ghC;
  public boolean lbr;
  public ListView mqO;
  public boolean qzl;
  public h wky;
  
  public i()
  {
    GMTrace.i(3214783021056L, 23952);
    this.lbr = false;
    this.qzl = false;
    GMTrace.o(3214783021056L, 23952);
  }
  
  public static boolean caZ()
  {
    GMTrace.i(3215722545152L, 23959);
    GMTrace.o(3215722545152L, 23959);
    return false;
  }
  
  public abstract int QI();
  
  public abstract boolean a(f paramf, Preference paramPreference);
  
  protected final int getLayoutId()
  {
    GMTrace.i(3214917238784L, 23953);
    int i = a.h.gfw;
    GMTrace.o(3214917238784L, 23953);
    return i;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    GMTrace.i(3215185674240L, 23955);
    super.onActivityCreated(paramBundle);
    this.ghC = Vc(bWQ().getPackageName() + "_preferences");
    this.wky = new h(this.vKB.vKW, this.ghC);
    this.mqO = ((ListView)findViewById(16908298));
    this.wky.b(new Preference.a()
    {
      public final boolean a(Preference paramAnonymousPreference, Object paramAnonymousObject)
      {
        GMTrace.i(3204850909184L, 23878);
        if ((!i.this.qzl) && (paramAnonymousPreference.isEnabled()) && (paramAnonymousPreference.wla))
        {
          i.this.qzl = true;
          if (!(paramAnonymousPreference instanceof CheckBoxPreference)) {
            break label180;
          }
          paramAnonymousObject = (CheckBoxPreference)paramAnonymousPreference;
          ((CheckBoxPreference)paramAnonymousObject).sdM = ((CheckBoxPreference)paramAnonymousObject).isChecked();
          if (((Preference)paramAnonymousObject).wlc) {
            i.this.ghC.edit().putBoolean(paramAnonymousPreference.hiu, ((CheckBoxPreference)paramAnonymousObject).isChecked()).commit();
          }
          i.this.lbr = true;
        }
        label180:
        for (int i = 1;; i = 0)
        {
          if (paramAnonymousPreference.hiu != null) {
            i.this.a(i.this.wky, paramAnonymousPreference);
          }
          if (i != 0) {
            i.this.wky.notifyDataSetChanged();
          }
          i.this.qzl = false;
          if (i != 0)
          {
            GMTrace.o(3204850909184L, 23878);
            return true;
          }
          GMTrace.o(3204850909184L, 23878);
          return false;
        }
      }
    });
    int i = QI();
    if (i != -1) {
      this.wky.addPreferencesFromResource(i);
    }
    this.mqO.setAdapter(this.wky);
    this.mqO.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(final AdapterView<?> paramAnonymousAdapterView, final View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(3218943770624L, 23983);
        if (paramAnonymousInt < i.this.mqO.getHeaderViewsCount())
        {
          GMTrace.o(3218943770624L, 23983);
          return;
        }
        int i = i.this.mqO.getHeaderViewsCount();
        paramAnonymousAdapterView = (Preference)i.this.wky.getItem(paramAnonymousInt - i);
        if ((paramAnonymousAdapterView.isEnabled()) && (paramAnonymousAdapterView.wla))
        {
          if ((paramAnonymousAdapterView instanceof CheckBoxPreference))
          {
            GMTrace.o(3218943770624L, 23983);
            return;
          }
          if ((paramAnonymousAdapterView instanceof DialogPreference))
          {
            paramAnonymousView = (DialogPreference)paramAnonymousAdapterView;
            paramAnonymousView.showDialog();
            paramAnonymousView.wjy = new DialogPreference.a()
            {
              public final void caW()
              {
                GMTrace.i(3211427577856L, 23927);
                i.this.lbr = true;
                if (paramAnonymousView.wlc) {
                  i.this.ghC.edit().putString(paramAnonymousAdapterView.hiu, paramAnonymousView.getValue()).commit();
                }
                i.this.wky.notifyDataSetChanged();
                GMTrace.o(3211427577856L, 23927);
              }
            };
          }
          if ((paramAnonymousAdapterView instanceof EditPreference))
          {
            paramAnonymousView = (EditPreference)paramAnonymousAdapterView;
            paramAnonymousView.showDialog();
            paramAnonymousView.wjA = new EditPreference.a()
            {
              public final void caW()
              {
                GMTrace.i(3235720986624L, 24108);
                i.this.lbr = true;
                if (paramAnonymousView.wlc) {
                  i.this.ghC.edit().putString(paramAnonymousAdapterView.hiu, paramAnonymousView.value).commit();
                }
                i.this.wky.notifyDataSetChanged();
                GMTrace.o(3235720986624L, 24108);
              }
            };
          }
          if (paramAnonymousAdapterView.hiu != null) {
            i.this.a(i.this.wky, paramAnonymousAdapterView);
          }
        }
        GMTrace.o(3218943770624L, 23983);
      }
    });
    this.mqO.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(3202300772352L, 23859);
        if (paramAnonymousInt < i.this.mqO.getHeaderViewsCount())
        {
          GMTrace.o(3202300772352L, 23859);
          return false;
        }
        int i = i.this.mqO.getHeaderViewsCount();
        i.this.wky.getItem(paramAnonymousInt - i);
        paramAnonymousAdapterView = i.this.wky;
        paramAnonymousAdapterView = i.this.mqO;
        boolean bool = i.caZ();
        GMTrace.o(3202300772352L, 23859);
        return bool;
      }
    });
    GMTrace.o(3215185674240L, 23955);
  }
  
  public final boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    GMTrace.i(3215319891968L, 23956);
    boolean bool = super.onContextItemSelected(paramMenuItem);
    GMTrace.o(3215319891968L, 23956);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(3215051456512L, 23954);
    super.onResume();
    this.wky.notifyDataSetChanged();
    GMTrace.o(3215051456512L, 23954);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */