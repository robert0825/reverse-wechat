package com.tencent.mm.plugin.setting.ui.setting;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.k.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p.b;

public class SettingsRingtoneUI
  extends MMActivity
  implements AdapterView.OnItemClickListener, Runnable
{
  private Cursor AE;
  private ae mHandler;
  private RingtoneManager oJS;
  LayoutInflater oJT;
  private int oJU;
  private int oJV;
  private Ringtone oJW;
  
  public SettingsRingtoneUI()
  {
    GMTrace.i(4717216268288L, 35146);
    this.oJU = -1;
    this.oJV = -1;
    GMTrace.o(4717216268288L, 35146);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4717484703744L, 35148);
    int i = R.i.cGg;
    GMTrace.o(4717484703744L, 35148);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4717350486016L, 35147);
    super.onCreate(paramBundle);
    this.mHandler = new ae();
    this.oJT = LayoutInflater.from(this);
    this.oJS = new RingtoneManager(this);
    this.oJS.setType(2);
    setVolumeControlStream(5);
    this.oJW = RingtoneManager.getRingtone(this, RingtoneManager.getDefaultUri(2));
    oM(R.l.dZF);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4615076577280L, 34385);
        SettingsRingtoneUI.this.aLo();
        SettingsRingtoneUI.this.finish();
        GMTrace.o(4615076577280L, 34385);
        return true;
      }
    });
    a(0, getString(R.l.dZb), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4607157731328L, 34326);
        SharedPreferences.Editor localEditor = SettingsRingtoneUI.this.getSharedPreferences(ab.bPU(), 0).edit();
        if (SettingsRingtoneUI.a(SettingsRingtoneUI.this) != 0)
        {
          Object localObject = SettingsRingtoneUI.a(SettingsRingtoneUI.this, SettingsRingtoneUI.a(SettingsRingtoneUI.this));
          w.d("RingtonePickerActivity", "set ringtone to " + localObject);
          if (localObject != null)
          {
            paramAnonymousMenuItem = ((Uri)localObject).toString();
            localObject = SettingsRingtoneUI.a(SettingsRingtoneUI.this, (Uri)localObject);
            localEditor.putString("settings.ringtone.name", (String)localObject);
            w.d("RingtonePickerActivity", "ringtone name: " + (String)localObject);
          }
        }
        for (;;)
        {
          localEditor.commit();
          f.dU(paramAnonymousMenuItem);
          SettingsRingtoneUI.this.finish();
          GMTrace.o(4607157731328L, 34326);
          return true;
          paramAnonymousMenuItem = f.fSD;
          localEditor.putString("settings.ringtone.name", SettingsRingtoneUI.this.getString(R.l.dZE));
          w.d("RingtonePickerActivity", "set ringtone follow system");
          continue;
          paramAnonymousMenuItem = f.fSD;
          localEditor.putString("settings.ringtone.name", SettingsRingtoneUI.this.getString(R.l.dZE));
          w.d("RingtonePickerActivity", "set ringtone follow system");
        }
      }
    }, p.b.vLG);
    paramBundle = (ListView)findViewById(R.h.cde);
    Object localObject = new View(this);
    int i = getResources().getDimensionPixelSize(R.f.aQq);
    ((View)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, i));
    View localView = new View(this);
    localView.setLayoutParams(new AbsListView.LayoutParams(-1, i));
    ((View)localObject).setClickable(false);
    localView.setClickable(false);
    paramBundle.addHeaderView((View)localObject);
    paramBundle.addFooterView(localView);
    this.AE = this.oJS.getCursor();
    paramBundle.setAdapter(new a(this.AE));
    paramBundle.setItemsCanFocus(false);
    paramBundle.setOnItemClickListener(this);
    localObject = f.tO();
    if (localObject != f.fSD)
    {
      localObject = Uri.parse((String)localObject);
      i = this.oJS.getRingtonePosition((Uri)localObject);
      if (i >= 0)
      {
        i += 2;
        this.oJU = i;
        if (this.oJU == 1)
        {
          getSharedPreferences(ab.bPU(), 0).edit().putString("settings.ringtone.name", getString(R.l.dZE)).commit();
          w.d("RingtonePickerActivity", "set ringtone follow system");
        }
        this.oJV = (this.oJU - 1);
      }
    }
    for (;;)
    {
      paramBundle.setItemChecked(this.oJU, true);
      paramBundle.setSelection(this.oJU);
      GMTrace.o(4717350486016L, 35147);
      return;
      i = 1;
      break;
      this.oJU = 1;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4718021574656L, 35152);
    this.mHandler.removeCallbacks(this);
    if ((this.AE != null) && (!this.AE.isClosed()))
    {
      this.AE.close();
      this.AE = null;
    }
    super.onDestroy();
    GMTrace.o(4718021574656L, 35152);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(4717618921472L, 35149);
    this.mHandler.removeCallbacks(this);
    this.oJV = (paramInt - 1);
    this.mHandler.postDelayed(this, 300L);
    GMTrace.o(4717618921472L, 35149);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(4718155792384L, 35153);
    if ((paramInt == 24) || (paramInt == 25))
    {
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      GMTrace.o(4718155792384L, 35153);
      return bool;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(4718155792384L, 35153);
    return bool;
  }
  
  protected void onStop()
  {
    GMTrace.i(4717887356928L, 35151);
    this.oJS.stopPreviousRingtone();
    super.onStop();
    GMTrace.o(4717887356928L, 35151);
  }
  
  public void run()
  {
    GMTrace.i(4717753139200L, 35150);
    if (isFinishing())
    {
      GMTrace.o(4717753139200L, 35150);
      return;
    }
    if (this.oJV == 0) {}
    for (Ringtone localRingtone = this.oJW;; localRingtone = this.oJS.getRingtone(this.oJV - 1))
    {
      if (localRingtone == null) {
        break label88;
      }
      try
      {
        localRingtone.play();
        GMTrace.o(4717753139200L, 35150);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("RingtonePickerActivity", localException, "play ringtone error", new Object[0]);
      }
    }
    label88:
    GMTrace.o(4717753139200L, 35150);
  }
  
  private final class a
    extends BaseAdapter
  {
    int count;
    Cursor eGt;
    int padding;
    
    public a(Cursor paramCursor)
    {
      GMTrace.i(4594407047168L, 34231);
      this.count = 0;
      this.padding = 0;
      this.eGt = paramCursor;
      this.count = (paramCursor.getCount() + 1);
      w.d("RingtonePickerActivity", "count = " + this.count);
      this.padding = SettingsRingtoneUI.this.getResources().getDimensionPixelSize(R.f.aQE);
      GMTrace.o(4594407047168L, 34231);
    }
    
    private String iH(int paramInt)
    {
      GMTrace.i(4594809700352L, 34234);
      if ((this.eGt.isClosed()) || (!this.eGt.moveToPosition(paramInt - 1)))
      {
        GMTrace.o(4594809700352L, 34234);
        return "";
      }
      String str = this.eGt.getString(this.eGt.getColumnIndex("title"));
      GMTrace.o(4594809700352L, 34234);
      return str;
    }
    
    public final int getCount()
    {
      GMTrace.i(4594675482624L, 34233);
      int i = this.count;
      GMTrace.o(4594675482624L, 34233);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(4594943918080L, 34235);
      long l = paramInt;
      GMTrace.o(4594943918080L, 34235);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(4594541264896L, 34232);
      paramView = (CheckedTextView)SettingsRingtoneUI.this.oJT.inflate(R.i.select_dialog_singlechoice, null);
      if (paramInt == 0)
      {
        paramView.setBackgroundResource(R.g.aVO);
        paramView.setText(R.l.dZE);
      }
      for (;;)
      {
        paramView.setPadding(this.padding, 0, this.padding, 0);
        paramView.setCheckMarkDrawable(R.g.aZz);
        GMTrace.o(4594541264896L, 34232);
        return paramView;
        paramView.setBackgroundResource(R.g.aVO);
        paramView.setText(iH(paramInt));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsRingtoneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */