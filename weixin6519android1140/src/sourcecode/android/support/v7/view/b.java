package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b
{
  Object It;
  boolean Iu;
  
  public abstract void finish();
  
  public abstract View getCustomView();
  
  public abstract Menu getMenu();
  
  public abstract MenuInflater getMenuInflater();
  
  public abstract CharSequence getSubtitle();
  
  public abstract CharSequence getTitle();
  
  public abstract void invalidate();
  
  public boolean isTitleOptional()
  {
    return false;
  }
  
  public abstract void setCustomView(View paramView);
  
  public abstract void setSubtitle(int paramInt);
  
  public abstract void setSubtitle(CharSequence paramCharSequence);
  
  public abstract void setTitle(int paramInt);
  
  public abstract void setTitle(CharSequence paramCharSequence);
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    this.Iu = paramBoolean;
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
    
    public abstract boolean a(b paramb, Menu paramMenu);
    
    public abstract boolean a(b paramb, MenuItem paramMenuItem);
    
    public abstract boolean b(b paramb, Menu paramMenu);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */