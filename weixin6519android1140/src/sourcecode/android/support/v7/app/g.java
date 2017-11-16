package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.view.ai;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.f.a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.Window.Callback;
import android.widget.PopupWindow;
import java.util.Calendar;

class g
  extends f
{
  private static m FU;
  private int FV = -100;
  private boolean FW;
  boolean FX = true;
  
  g(Context paramContext, Window paramWindow, c paramc)
  {
    super(paramContext, paramWindow, paramc);
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }
  
  int at(int paramInt)
  {
    Location localLocation1 = null;
    Object localObject;
    m.a locala;
    boolean bool;
    switch (paramInt)
    {
    default: 
      return paramInt;
    case 0: 
      if (FU == null) {
        FU = new m(this.mContext.getApplicationContext());
      }
      localObject = FU;
      locala = m.Hh;
      if (m.a(locala))
      {
        bool = locala.Hj;
        if (bool) {
          return 2;
        }
      }
      else
      {
        if (android.support.v4.content.e.d(((m)localObject).mContext, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
          break label223;
        }
      }
      break;
    }
    label188:
    label223:
    for (Location localLocation2 = ((m)localObject).p("network");; localLocation2 = null)
    {
      if (android.support.v4.content.e.d(((m)localObject).mContext, "android.permission.ACCESS_FINE_LOCATION") == 0) {
        localLocation1 = ((m)localObject).p("gps");
      }
      if ((localLocation1 != null) && (localLocation2 != null))
      {
        localObject = localLocation2;
        if (localLocation1.getTime() > localLocation2.getTime()) {
          localObject = localLocation1;
        }
      }
      for (;;)
      {
        if (localObject == null) {
          break label188;
        }
        m.b((Location)localObject);
        bool = locala.Hj;
        break;
        localObject = localLocation2;
        if (localLocation1 != null) {
          localObject = localLocation1;
        }
      }
      paramInt = Calendar.getInstance().get(11);
      if ((paramInt < 6) || (paramInt >= 22))
      {
        bool = true;
        break;
      }
      bool = false;
      break;
      return 1;
      return -1;
    }
  }
  
  public final boolean cR()
  {
    this.FW = true;
    Resources localResources;
    Configuration localConfiguration;
    int j;
    if (this.FV == -100)
    {
      i = d.FH;
      i = at(i);
      if (i == -1) {
        break label116;
      }
      localResources = this.mContext.getResources();
      localConfiguration = localResources.getConfiguration();
      j = localConfiguration.uiMode;
      if (i != 2) {
        break label108;
      }
    }
    label108:
    for (int i = 32;; i = 16)
    {
      if ((j & 0x30) == i) {
        break label114;
      }
      localConfiguration = new Configuration(localConfiguration);
      localConfiguration.uiMode = (i | localConfiguration.uiMode & 0xFFFFFFCF);
      localResources.updateConfiguration(localConfiguration, null);
      return true;
      i = this.FV;
      break;
    }
    label114:
    return false;
    label116:
    return false;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((paramBundle != null) && (this.FV == -100)) {
      this.FV = paramBundle.getInt("appcompat:local_night_mode", -100);
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.FV != -100) {
      paramBundle.putInt("appcompat:local_night_mode", this.FV);
    }
  }
  
  class a
    extends e.a
  {
    a(Window.Callback paramCallback)
    {
      super(paramCallback);
    }
    
    final ActionMode a(ActionMode.Callback paramCallback)
    {
      f.a locala = new f.a(g.this.mContext, paramCallback);
      g localg = g.this;
      if (localg.Ge != null) {
        localg.Ge.finish();
      }
      AppCompatDelegateImplV7.b localb1 = new AppCompatDelegateImplV7.b(localg, locala);
      paramCallback = localg.cO();
      if (paramCallback != null) {
        localg.Ge = paramCallback.a(localb1);
      }
      label345:
      boolean bool;
      if (localg.Ge == null)
      {
        localg.cW();
        if (localg.Ge != null) {
          localg.Ge.finish();
        }
        AppCompatDelegateImplV7.b localb2 = new AppCompatDelegateImplV7.b(localg, localb1);
        Object localObject;
        if (localg.Gf == null)
        {
          if (!localg.FQ) {
            break label545;
          }
          localObject = new TypedValue();
          paramCallback = localg.mContext.getTheme();
          paramCallback.resolveAttribute(a.a.actionBarTheme, (TypedValue)localObject, true);
          if (((TypedValue)localObject).resourceId == 0) {
            break label536;
          }
          Resources.Theme localTheme = localg.mContext.getResources().newTheme();
          localTheme.setTo(paramCallback);
          localTheme.applyStyle(((TypedValue)localObject).resourceId, true);
          paramCallback = new android.support.v7.view.d(localg.mContext, 0);
          paramCallback.getTheme().setTo(localTheme);
          localg.Gf = new ActionBarContextView(paramCallback);
          localg.Gg = new PopupWindow(paramCallback, null, a.a.actionModePopupWindowStyle);
          android.support.v4.widget.m.a(localg.Gg, 2);
          localg.Gg.setContentView(localg.Gf);
          localg.Gg.setWidth(-1);
          paramCallback.getTheme().resolveAttribute(a.a.actionBarSize, (TypedValue)localObject, true);
          int i = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject).data, paramCallback.getResources().getDisplayMetrics());
          localg.Gf.ay(i);
          localg.Gg.setHeight(-2);
          localg.Gh = new AppCompatDelegateImplV7.5(localg);
        }
        if (localg.Gf != null)
        {
          localg.cW();
          localg.Gf.dN();
          paramCallback = localg.Gf.getContext();
          localObject = localg.Gf;
          if (localg.Gg != null) {
            break label591;
          }
          bool = true;
          label392:
          paramCallback = new android.support.v7.view.e(paramCallback, (ActionBarContextView)localObject, localb2, bool);
          if (!localb1.a(paramCallback, paramCallback.getMenu())) {
            break label596;
          }
          paramCallback.invalidate();
          localg.Gf.c(paramCallback);
          localg.Ge = paramCallback;
          z.d(localg.Gf, 0.0F);
          localg.Gi = z.V(localg.Gf).p(1.0F);
          localg.Gi.a(new AppCompatDelegateImplV7.6(localg));
          if (localg.Gg != null) {
            localg.Et.getDecorView().post(localg.Gh);
          }
        }
      }
      for (;;)
      {
        localg.Ge = localg.Ge;
        paramCallback = localg.Ge;
        if (paramCallback == null) {
          break label605;
        }
        return locala.b(paramCallback);
        label536:
        paramCallback = localg.mContext;
        break;
        label545:
        paramCallback = (ViewStubCompat)localg.Gk.findViewById(a.f.action_mode_bar_stub);
        if (paramCallback == null) {
          break label345;
        }
        paramCallback.CJ = LayoutInflater.from(localg.cU());
        localg.Gf = ((ActionBarContextView)paramCallback.inflate());
        break label345;
        label591:
        bool = false;
        break label392;
        label596:
        localg.Ge = null;
      }
      label605:
      return null;
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      if (g.this.FX) {
        return a(paramCallback);
      }
      return super.onWindowStartingActionMode(paramCallback);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */