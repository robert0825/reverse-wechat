package com.tencent.mm.plugin.p;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;

public abstract class a
{
  public a()
  {
    GMTrace.i(10715943403520L, 79840);
    GMTrace.o(10715943403520L, 79840);
  }
  
  public abstract boolean aLp();
  
  public abstract boolean dispatchKeyEvent(KeyEvent paramKeyEvent);
  
  public abstract boolean dispatchTouchEvent(MotionEvent paramMotionEvent);
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10717151363072L, 79849);
    GMTrace.o(10717151363072L, 79849);
  }
  
  public abstract void onBackPressed();
  
  public abstract void onCreate(Bundle paramBundle);
  
  public abstract void onDestroy();
  
  public abstract void onPause();
  
  public abstract void onResume();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\p\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */