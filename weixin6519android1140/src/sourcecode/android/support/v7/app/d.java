package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class d
{
  static int FH = -1;
  private static boolean FI = false;
  
  public static d a(Activity paramActivity, c paramc)
  {
    return a(paramActivity, paramActivity.getWindow(), paramc);
  }
  
  public static d a(Dialog paramDialog, c paramc)
  {
    return a(paramDialog.getContext(), paramDialog.getWindow(), paramc);
  }
  
  private static d a(Context paramContext, Window paramWindow, c paramc)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      return new h(paramContext, paramWindow, paramc);
    }
    if (i >= 14) {
      return new g(paramContext, paramWindow, paramc);
    }
    if (i >= 11) {
      return new f(paramContext, paramWindow, paramc);
    }
    return new AppCompatDelegateImplV7(paramContext, paramWindow, paramc);
  }
  
  public static boolean cS()
  {
    return FI;
  }
  
  public abstract void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract ActionBar cO();
  
  public abstract void cP();
  
  public abstract void cQ();
  
  public abstract boolean cR();
  
  public abstract View findViewById(int paramInt);
  
  public abstract MenuInflater getMenuInflater();
  
  public abstract void invalidateOptionsMenu();
  
  public abstract void onConfigurationChanged(Configuration paramConfiguration);
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract void onDestroy();
  
  public abstract void onPostResume();
  
  public abstract void onSaveInstanceState(Bundle paramBundle);
  
  public abstract void onStop();
  
  public abstract boolean requestWindowFeature(int paramInt);
  
  public abstract void setContentView(int paramInt);
  
  public abstract void setContentView(View paramView);
  
  public abstract void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void setTitle(CharSequence paramCharSequence);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */