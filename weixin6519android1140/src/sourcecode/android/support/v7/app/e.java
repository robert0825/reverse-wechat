package android.support.v7.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.view.g;
import android.support.v7.view.i;
import android.support.v7.view.menu.f;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;

abstract class e
  extends d
{
  final Window Et;
  final Window.Callback FJ;
  final Window.Callback FK;
  final c FL;
  ActionBar FM;
  boolean FN;
  boolean FO;
  boolean FP;
  boolean FQ;
  boolean FR;
  boolean FS;
  MenuInflater ib;
  final Context mContext;
  CharSequence tX;
  
  e(Context paramContext, Window paramWindow, c paramc)
  {
    this.mContext = paramContext;
    this.Et = paramWindow;
    this.FL = paramc;
    this.FJ = this.Et.getCallback();
    if ((this.FJ instanceof a)) {
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    this.FK = a(this.FJ);
    this.Et.setCallback(this.FK);
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }
  
  abstract void ar(int paramInt);
  
  abstract boolean as(int paramInt);
  
  public final ActionBar cO()
  {
    cT();
    return this.FM;
  }
  
  public boolean cR()
  {
    return false;
  }
  
  abstract void cT();
  
  final Context cU()
  {
    Context localContext = null;
    Object localObject = cO();
    if (localObject != null) {
      localContext = ((ActionBar)localObject).getThemedContext();
    }
    localObject = localContext;
    if (localContext == null) {
      localObject = this.mContext;
    }
    return (Context)localObject;
  }
  
  abstract boolean dispatchKeyEvent(KeyEvent paramKeyEvent);
  
  abstract void f(CharSequence paramCharSequence);
  
  public final MenuInflater getMenuInflater()
  {
    if (this.ib == null)
    {
      cT();
      if (this.FM == null) {
        break label43;
      }
    }
    label43:
    for (Context localContext = this.FM.getThemedContext();; localContext = this.mContext)
    {
      this.ib = new g(localContext);
      return this.ib;
    }
  }
  
  public void onDestroy()
  {
    this.FS = true;
  }
  
  abstract boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent);
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.tX = paramCharSequence;
    f(paramCharSequence);
  }
  
  class a
    extends i
  {
    a(Window.Callback paramCallback)
    {
      super();
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      return (e.this.dispatchKeyEvent(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
    }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
    {
      return (super.dispatchKeyShortcutEvent(paramKeyEvent)) || (e.this.onKeyShortcut(paramKeyEvent.getKeyCode(), paramKeyEvent));
    }
    
    public void onContentChanged() {}
    
    public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
    {
      if ((paramInt == 0) && (!(paramMenu instanceof f))) {
        return false;
      }
      return super.onCreatePanelMenu(paramInt, paramMenu);
    }
    
    public boolean onMenuOpened(int paramInt, Menu paramMenu)
    {
      super.onMenuOpened(paramInt, paramMenu);
      e.this.as(paramInt);
      return true;
    }
    
    public void onPanelClosed(int paramInt, Menu paramMenu)
    {
      super.onPanelClosed(paramInt, paramMenu);
      e.this.ar(paramInt);
    }
    
    public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      f localf;
      boolean bool1;
      if ((paramMenu instanceof f))
      {
        localf = (f)paramMenu;
        if ((paramInt != 0) || (localf != null)) {
          break label34;
        }
        bool1 = false;
      }
      label34:
      boolean bool2;
      do
      {
        return bool1;
        localf = null;
        break;
        if (localf != null) {
          localf.KA = true;
        }
        bool2 = super.onPreparePanel(paramInt, paramView, paramMenu);
        bool1 = bool2;
      } while (localf == null);
      localf.KA = false;
      return bool2;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\app\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */