package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

final class v
{
  private static final class a
    extends SingleLineTransformationMethod
  {
    private Locale xn;
    
    public a(Context paramContext)
    {
      this.xn = paramContext.getResources().getConfiguration().locale;
    }
    
    public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
    {
      paramCharSequence = super.getTransformation(paramCharSequence, paramView);
      if (paramCharSequence != null) {
        return paramCharSequence.toString().toUpperCase(this.xn);
      }
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */