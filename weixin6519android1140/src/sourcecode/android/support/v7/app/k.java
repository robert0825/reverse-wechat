package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.z;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.support.v7.widget.u;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import java.util.ArrayList;

final class k
  extends ActionBar
{
  public u GX;
  public Window.Callback GY;
  private boolean GZ;
  private boolean Ha;
  private ArrayList<Object> Hb;
  private final Runnable Hc;
  
  private void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = this.GX.getDisplayOptions();
    this.GX.setDisplayOptions(i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  public final void cI()
  {
    setDisplayOptions(0, 2);
  }
  
  public final void cJ()
  {
    setDisplayOptions(0, 8);
  }
  
  public final void cK()
  {
    setDisplayOptions(16, 16);
  }
  
  public final boolean cL()
  {
    this.GX.eH().removeCallbacks(this.Hc);
    z.a(this.GX.eH(), this.Hc);
    return true;
  }
  
  public final boolean collapseActionView()
  {
    if (this.GX.hasExpandedActionView())
    {
      this.GX.collapseActionView();
      return true;
    }
    return false;
  }
  
  public final void e(CharSequence paramCharSequence)
  {
    this.GX.e(paramCharSequence);
  }
  
  public final View getCustomView()
  {
    return this.GX.getCustomView();
  }
  
  public final int getDisplayOptions()
  {
    return this.GX.getDisplayOptions();
  }
  
  public final int getHeight()
  {
    return this.GX.getHeight();
  }
  
  public final Context getThemedContext()
  {
    return this.GX.getContext();
  }
  
  public final CharSequence getTitle()
  {
    return this.GX.getTitle();
  }
  
  public final void hide()
  {
    this.GX.setVisibility(8);
  }
  
  public final boolean isShowing()
  {
    return this.GX.getVisibility() == 0;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  final void onDestroy()
  {
    this.GX.eH().removeCallbacks(this.Hc);
  }
  
  public final boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    if (!this.GZ)
    {
      this.GX.a(new a(), new b());
      this.GZ = true;
    }
    Menu localMenu = this.GX.getMenu();
    int i;
    if (localMenu != null)
    {
      if (paramKeyEvent == null) {
        break label98;
      }
      i = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
        break label103;
      }
    }
    label98:
    label103:
    for (boolean bool = true;; bool = false)
    {
      localMenu.setQwertyMode(bool);
      localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      return true;
      i = -1;
      break;
    }
  }
  
  public final boolean requestFocus()
  {
    ViewGroup localViewGroup = this.GX.eH();
    if ((localViewGroup != null) && (!localViewGroup.hasFocus()))
    {
      localViewGroup.requestFocus();
      return true;
    }
    return false;
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.GX.setBackgroundDrawable(paramDrawable);
  }
  
  public final void setCustomView(int paramInt)
  {
    setCustomView(LayoutInflater.from(this.GX.getContext()).inflate(paramInt, this.GX.eH(), false));
  }
  
  public final void setCustomView(View paramView)
  {
    ActionBar.LayoutParams localLayoutParams = new ActionBar.LayoutParams(-2, -2);
    if (paramView != null) {
      paramView.setLayoutParams(localLayoutParams);
    }
    this.GX.setCustomView(paramView);
  }
  
  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      setDisplayOptions(i, 4);
      return;
    }
  }
  
  public final void setDisplayOptions(int paramInt)
  {
    setDisplayOptions(paramInt, -1);
  }
  
  public final void setElevation(float paramFloat)
  {
    z.g(this.GX.eH(), paramFloat);
  }
  
  public final void setIcon(int paramInt)
  {
    this.GX.setIcon(paramInt);
  }
  
  public final void setLogo(Drawable paramDrawable)
  {
    this.GX.setLogo(paramDrawable);
  }
  
  public final void show()
  {
    this.GX.setVisibility(0);
  }
  
  public final void w(boolean paramBoolean) {}
  
  public final void x(boolean paramBoolean) {}
  
  public final void y(boolean paramBoolean)
  {
    if (paramBoolean == this.Ha) {}
    for (;;)
    {
      return;
      this.Ha = paramBoolean;
      int j = this.Hb.size();
      int i = 0;
      while (i < j)
      {
        this.Hb.get(i);
        i += 1;
      }
    }
  }
  
  private final class a
    implements l.a
  {
    private boolean Go;
    
    public a() {}
    
    public final void a(f paramf, boolean paramBoolean)
    {
      if (this.Go) {
        return;
      }
      this.Go = true;
      k.this.GX.dismissPopupMenus();
      if (k.this.GY != null) {
        k.this.GY.onPanelClosed(108, paramf);
      }
      this.Go = false;
    }
    
    public final boolean d(f paramf)
    {
      if (k.this.GY != null)
      {
        k.this.GY.onMenuOpened(108, paramf);
        return true;
      }
      return false;
    }
  }
  
  private final class b
    implements f.a
  {
    public b() {}
    
    public final boolean a(f paramf, MenuItem paramMenuItem)
    {
      return false;
    }
    
    public final void b(f paramf)
    {
      if (k.this.GY != null)
      {
        if (!k.this.GX.isOverflowMenuShowing()) {
          break label41;
        }
        k.this.GY.onPanelClosed(108, paramf);
      }
      label41:
      while (!k.this.GY.onPreparePanel(0, null, paramf)) {
        return;
      }
      k.this.GY.onMenuOpened(108, paramf);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */