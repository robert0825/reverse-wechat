package android.support.v7.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.am;
import android.support.v4.app.am.a;
import android.support.v4.app.u;
import android.support.v4.view.g;
import android.support.v7.widget.ar;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public class AppCompatActivity
  extends FragmentActivity
  implements am.a, c
{
  private d FE;
  private int FF = 0;
  private boolean FG;
  private Resources mResources;
  
  private boolean cM()
  {
    int i = 0;
    Object localObject1 = u.a(this);
    am localam;
    if (localObject1 != null) {
      if (u.a(this, (Intent)localObject1))
      {
        localam = am.k(this);
        if (!(this instanceof am.a)) {
          break label283;
        }
      }
    }
    label283:
    Object localObject2;
    for (localObject1 = ((am.a)this).bo();; localObject2 = null)
    {
      if (localObject1 == null) {
        localObject1 = u.a(this);
      }
      for (;;)
      {
        if (localObject1 != null)
        {
          ComponentName localComponentName = ((Intent)localObject1).getComponent();
          localObject3 = localComponentName;
          if (localComponentName == null) {
            localObject3 = ((Intent)localObject1).resolveActivity(localam.sz.getPackageManager());
          }
          localam.a((ComponentName)localObject3);
          localam.sy.add(localObject1);
        }
        if (localam.sy.isEmpty()) {
          throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        localObject1 = (Intent[])localam.sy.toArray(new Intent[localam.sy.size()]);
        localObject1[0] = new Intent(localObject1[0]).addFlags(268484608);
        Object localObject3 = localam.sz;
        int j = Build.VERSION.SDK_INT;
        if (j >= 16)
        {
          ((Context)localObject3).startActivities((Intent[])localObject1, null);
          i = 1;
          if (i == 0)
          {
            localObject1 = new Intent(localObject1[(localObject1.length - 1)]);
            ((Intent)localObject1).addFlags(268435456);
            localam.sz.startActivity((Intent)localObject1);
          }
        }
        for (;;)
        {
          try
          {
            if (Build.VERSION.SDK_INT >= 16)
            {
              finishAffinity();
              return true;
              if (j < 11) {
                break;
              }
              ((Context)localObject3).startActivities((Intent[])localObject1);
              i = 1;
              break;
            }
            finish();
            continue;
          }
          catch (IllegalStateException localIllegalStateException)
          {
            finish();
            continue;
          }
          u.b(this, localIllegalStateException);
        }
        return false;
      }
    }
  }
  
  public void aQ()
  {
    cN().invalidateOptionsMenu();
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    cN().addContentView(paramView, paramLayoutParams);
  }
  
  public final boolean aq(int paramInt)
  {
    return cN().requestWindowFeature(paramInt);
  }
  
  public final Intent bo()
  {
    return u.a(this);
  }
  
  public final d cN()
  {
    if (this.FE == null) {
      this.FE = d.a(this, this);
    }
    return this.FE;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((g.a(paramKeyEvent, 4096)) && (paramKeyEvent.getUnicodeChar(paramKeyEvent.getMetaState() & 0x8FFF) == 60))
    {
      int i = paramKeyEvent.getAction();
      if (i == 0)
      {
        ActionBar localActionBar = cN().cO();
        if ((localActionBar != null) && (localActionBar.isShowing()) && (localActionBar.requestFocus()))
        {
          this.FG = true;
          return true;
        }
      }
      else if ((i == 1) && (this.FG))
      {
        this.FG = false;
        return true;
      }
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public View findViewById(int paramInt)
  {
    return cN().findViewById(paramInt);
  }
  
  public MenuInflater getMenuInflater()
  {
    return cN().getMenuInflater();
  }
  
  public Resources getResources()
  {
    if ((this.mResources == null) && (ar.hb())) {
      this.mResources = new ar(this, super.getResources());
    }
    if (this.mResources == null) {
      return super.getResources();
    }
    return this.mResources;
  }
  
  public void invalidateOptionsMenu()
  {
    cN().invalidateOptionsMenu();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    cN().onConfigurationChanged(paramConfiguration);
    if (this.mResources != null)
    {
      DisplayMetrics localDisplayMetrics = super.getResources().getDisplayMetrics();
      this.mResources.updateConfiguration(paramConfiguration, localDisplayMetrics);
    }
  }
  
  public void onContentChanged() {}
  
  public void onCreate(Bundle paramBundle)
  {
    d locald = cN();
    locald.cQ();
    locald.onCreate(paramBundle);
    if ((locald.cR()) && (this.FF != 0))
    {
      if (Build.VERSION.SDK_INT < 23) {
        break label55;
      }
      onApplyThemeResource(getTheme(), this.FF, false);
    }
    for (;;)
    {
      super.onCreate(paramBundle);
      return;
      label55:
      setTheme(this.FF);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    cN().onDestroy();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    ActionBar localActionBar = cN().cO();
    if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((localActionBar.getDisplayOptions() & 0x4) != 0)) {
      return cM();
    }
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    cN().cP();
  }
  
  protected void onPostResume()
  {
    super.onPostResume();
    cN().onPostResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    cN().onSaveInstanceState(paramBundle);
  }
  
  public void onStop()
  {
    super.onStop();
    cN().onStop();
  }
  
  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    cN().setTitle(paramCharSequence);
  }
  
  public void setContentView(int paramInt)
  {
    cN().setContentView(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    cN().setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    cN().setContentView(paramView, paramLayoutParams);
  }
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    this.FF = paramInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\AppCompatActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */