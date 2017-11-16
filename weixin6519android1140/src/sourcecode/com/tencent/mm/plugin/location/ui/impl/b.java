package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.p.a;
import com.tencent.mm.sdk.platformtools.w;

public abstract class b
  extends a
{
  public Activity activity;
  protected float jqu;
  protected float lUn;
  protected com.tencent.mm.plugin.p.d mzz;
  protected int type;
  
  public b(Activity paramActivity)
  {
    GMTrace.i(9703002210304L, 72293);
    this.type = 0;
    this.lUn = 0.0F;
    this.jqu = 0.0F;
    this.activity = paramActivity;
    GMTrace.o(9703002210304L, 72293);
  }
  
  protected final void aLo()
  {
    GMTrace.i(9704881258496L, 72307);
    InputMethodManager localInputMethodManager = (InputMethodManager)this.activity.getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(9704881258496L, 72307);
      return;
    }
    Object localObject = this.activity.getCurrentFocus();
    if (localObject == null)
    {
      GMTrace.o(9704881258496L, 72307);
      return;
    }
    localObject = ((View)localObject).getWindowToken();
    if (localObject == null)
    {
      GMTrace.o(9704881258496L, 72307);
      return;
    }
    localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
    GMTrace.o(9704881258496L, 72307);
  }
  
  public final boolean aLp()
  {
    GMTrace.i(9704344387584L, 72303);
    GMTrace.o(9704344387584L, 72303);
    return false;
  }
  
  public abstract com.tencent.mm.plugin.p.d aLq();
  
  public void aLr()
  {
    GMTrace.i(9704075952128L, 72301);
    GMTrace.o(9704075952128L, 72301);
  }
  
  public final void aLs()
  {
    GMTrace.i(18047184142336L, 134462);
    InputMethodManager localInputMethodManager = (InputMethodManager)this.activity.getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(18047184142336L, 134462);
      return;
    }
    View localView = this.activity.getCurrentFocus();
    if (localView == null)
    {
      GMTrace.o(18047184142336L, 134462);
      return;
    }
    if (localView.getWindowToken() == null)
    {
      GMTrace.o(18047184142336L, 134462);
      return;
    }
    localInputMethodManager.toggleSoftInput(0, 2);
    GMTrace.o(18047184142336L, 134462);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(9704210169856L, 72302);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.MMBaseMapUI", "dispatchKeyEvent");
      this.activity.finish();
      GMTrace.o(9704210169856L, 72302);
      return true;
    }
    GMTrace.o(9704210169856L, 72302);
    return false;
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(9703941734400L, 72300);
    GMTrace.o(9703941734400L, 72300);
    return false;
  }
  
  public final View findViewById(int paramInt)
  {
    GMTrace.i(9703539081216L, 72297);
    View localView = this.activity.findViewById(paramInt);
    GMTrace.o(9703539081216L, 72297);
    return localView;
  }
  
  public abstract int getLayoutId();
  
  public final String getString(int paramInt)
  {
    GMTrace.i(9703673298944L, 72298);
    String str = this.activity.getString(paramInt);
    GMTrace.o(9703673298944L, 72298);
    return str;
  }
  
  public final void onBackPressed()
  {
    GMTrace.i(9703807516672L, 72299);
    GMTrace.o(9703807516672L, 72299);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9703136428032L, 72294);
    this.activity.requestWindowFeature(1);
    this.activity.setContentView(getLayoutId());
    this.type = this.activity.getIntent().getIntExtra("map_view_type", 0);
    w.i("MicroMsg.MMBaseMapUI", "init oncreate type %d", new Object[] { Integer.valueOf(this.type) });
    ((FrameLayout)findViewById(R.h.bLZ)).addView(d.cK(this.activity));
    this.mzz = aLq();
    this.mzz.setMapViewOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9698841460736L, 72262);
        int i = paramAnonymousMotionEvent.getAction();
        w.i("MicroMsg.MMBaseMapUI", "map action " + i);
        switch (i)
        {
        }
        for (;;)
        {
          GMTrace.o(9698841460736L, 72262);
          return false;
          b.this.lUn = paramAnonymousMotionEvent.getX();
          b.this.jqu = paramAnonymousMotionEvent.getY();
          continue;
          if ((Math.abs(paramAnonymousMotionEvent.getX() - b.this.lUn) > 10.0F) || (Math.abs(paramAnonymousMotionEvent.getY() - b.this.jqu) > 10.0F)) {
            b.this.aLr();
          }
        }
      }
    });
    GMTrace.o(9703136428032L, 72294);
  }
  
  public void onDestroy()
  {
    GMTrace.i(9704747040768L, 72306);
    GMTrace.o(9704747040768L, 72306);
  }
  
  public void onPause()
  {
    GMTrace.i(9704612823040L, 72305);
    GMTrace.o(9704612823040L, 72305);
  }
  
  public void onResume()
  {
    GMTrace.i(9704478605312L, 72304);
    GMTrace.o(9704478605312L, 72304);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */