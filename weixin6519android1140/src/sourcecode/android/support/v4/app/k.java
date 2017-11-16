package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.e.j;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public abstract class k<E>
  extends i
{
  final Activity mActivity;
  final Context mContext;
  final Handler mHandler;
  t oO;
  boolean oP;
  boolean oQ;
  final m ox = new m();
  final int pr;
  j<String, s> ps;
  boolean pt;
  
  private k(Activity paramActivity, Context paramContext, Handler paramHandler)
  {
    this.mActivity = paramActivity;
    this.mContext = paramContext;
    this.mHandler = paramHandler;
    this.pr = 0;
  }
  
  k(FragmentActivity paramFragmentActivity)
  {
    this(paramFragmentActivity, paramFragmentActivity, paramFragmentActivity.mHandler);
  }
  
  final t a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.ps == null) {
      this.ps = new j();
    }
    t localt = (t)this.ps.get(paramString);
    if (localt == null)
    {
      if (paramBoolean2)
      {
        localt = new t(paramString, this, paramBoolean1);
        this.ps.put(paramString, localt);
      }
      return localt;
    }
    localt.oy = this;
    return localt;
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public boolean aS()
  {
    return true;
  }
  
  public void aT() {}
  
  final j<String, s> aU()
  {
    int j = 0;
    int k;
    if (this.ps != null)
    {
      int m = this.ps.size();
      t[] arrayOft = new t[m];
      int i = m - 1;
      while (i >= 0)
      {
        arrayOft[i] = ((t)this.ps.valueAt(i));
        i -= 1;
      }
      i = 0;
      k = i;
      if (j < m)
      {
        t localt = arrayOft[j];
        if (localt.oF) {
          i = 1;
        }
        for (;;)
        {
          j += 1;
          break;
          localt.bi();
          this.ps.remove(localt.ok);
        }
      }
    }
    else
    {
      k = 0;
    }
    if (k != 0) {
      return this.ps;
    }
    return null;
  }
  
  public void b(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (paramInt != -1) {
      throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
    this.mContext.startActivity(paramIntent);
  }
  
  final void k(String paramString)
  {
    if (this.ps != null)
    {
      t localt = (t)this.ps.get(paramString);
      if ((localt != null) && (!localt.oF))
      {
        localt.bi();
        this.ps.remove(paramString);
      }
    }
  }
  
  public View onFindViewById(int paramInt)
  {
    return null;
  }
  
  public LayoutInflater onGetLayoutInflater()
  {
    return (LayoutInflater)this.mContext.getSystemService("layout_inflater");
  }
  
  public int onGetWindowAnimations()
  {
    return this.pr;
  }
  
  public boolean onHasView()
  {
    return true;
  }
  
  public boolean onHasWindowAnimations()
  {
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */