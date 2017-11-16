package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

final class i
{
  static class a
    implements LayoutInflater.Factory
  {
    final k wq;
    
    a(k paramk)
    {
      this.wq = paramk;
    }
    
    public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      return this.wq.onCreateView(null, paramString, paramContext, paramAttributeSet);
    }
    
    public String toString()
    {
      return getClass().getName() + "{" + this.wq + "}";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */