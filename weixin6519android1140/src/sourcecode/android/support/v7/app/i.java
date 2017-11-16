package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class i
  extends Dialog
  implements c
{
  private d FE;
  
  public i(Context paramContext, int paramInt)
  {
    super(paramContext, i);
    cN().onCreate(null);
    cN().cR();
  }
  
  private d cN()
  {
    if (this.FE == null) {
      this.FE = d.a(this, this);
    }
    return this.FE;
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    cN().addContentView(paramView, paramLayoutParams);
  }
  
  public final boolean cY()
  {
    return cN().requestWindowFeature(1);
  }
  
  public View findViewById(int paramInt)
  {
    return cN().findViewById(paramInt);
  }
  
  public void invalidateOptionsMenu()
  {
    cN().invalidateOptionsMenu();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    cN().cQ();
    super.onCreate(paramBundle);
    cN().onCreate(paramBundle);
  }
  
  protected void onStop()
  {
    super.onStop();
    cN().onStop();
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
  
  public void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    cN().setTitle(getContext().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    cN().setTitle(paramCharSequence);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */