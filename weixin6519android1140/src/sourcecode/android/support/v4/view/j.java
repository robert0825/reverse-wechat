package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import java.lang.reflect.Field;

final class j
{
  private static Field wr;
  private static boolean ws;
  
  static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    if (!ws) {}
    try
    {
      Field localField = LayoutInflater.class.getDeclaredField("mFactory2");
      wr = localField;
      localField.setAccessible(true);
      ws = true;
      if (wr == null) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        try
        {
          wr.set(paramLayoutInflater, paramFactory2);
          return;
        }
        catch (IllegalAccessException paramFactory2)
        {
          new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ").append(paramLayoutInflater).append("; inflation may have unexpected results.");
        }
        localNoSuchFieldException = localNoSuchFieldException;
        new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ").append(LayoutInflater.class.getName()).append("; inflation may have unexpected results.");
      }
    }
  }
  
  static final class a
    extends i.a
    implements LayoutInflater.Factory2
  {
    a(k paramk)
    {
      super();
    }
    
    public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      return this.wq.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */