package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

abstract class e
  extends Activity
{
  abstract View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet);
  
  void aE()
  {
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    if ((Build.VERSION.SDK_INT < 11) && (getLayoutInflater().getFactory() == null)) {
      getLayoutInflater().setFactory(this);
    }
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView2 = a(null, paramString, paramContext, paramAttributeSet);
    View localView1 = localView2;
    if (localView2 == null) {
      localView1 = super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    return localView1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */