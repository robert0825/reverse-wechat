package com.tencent.xweb.x5.a.a.a.a;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import org.xwalk.core.Log;

public class b
{
  public a yoS;
  
  public void computeScroll(View paramView)
  {
    if (this.yoS != null) {
      this.yoS.super_computeScroll(paramView);
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    if (this.yoS != null) {
      return this.yoS.super_dispatchTouchEvent(paramMotionEvent, paramView);
    }
    Log.e("ProxyWebViewClientExtension", "mSuperProvider Is null");
    return false;
  }
  
  public void hasDiscardCurrentPage(boolean paramBoolean) {}
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    if (this.yoS != null) {
      return this.yoS.super_onInterceptTouchEvent(paramMotionEvent, paramView);
    }
    Log.e("ProxyWebViewClientExtension", "mSuperProvider Is null");
    return false;
  }
  
  public Object onMiscCallBack(String paramString, Bundle paramBundle)
  {
    if (this.yoS != null) {
      return this.yoS.super_onMiscCallBack(paramString, paramBundle);
    }
    return null;
  }
  
  public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, View paramView)
  {
    if (this.yoS != null) {
      this.yoS.super_onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2, paramView);
    }
    Log.e("ProxyWebViewClientExtension", "mSuperProvider Is null");
  }
  
  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
  {
    if (this.yoS != null) {
      this.yoS.super_onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
    }
    Log.e("ProxyWebViewClientExtension", "mSuperProvider Is null");
  }
  
  public boolean onShowLongClickPopupMenu()
  {
    if (this.yoS != null) {
      return this.yoS.super_onShowLongClickPopupMenu();
    }
    Log.e("ProxyWebViewClientExtension", "mSuperProvider Is null");
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent, View paramView)
  {
    if (this.yoS != null) {
      return this.yoS.super_onTouchEvent(paramMotionEvent, paramView);
    }
    Log.e("ProxyWebViewClientExtension", "mSuperProvider Is null");
    return false;
  }
  
  public boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, View paramView)
  {
    if (this.yoS != null) {
      return this.yoS.super_overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean, paramView);
    }
    Log.e("ProxyWebViewClientExtension", "mSuperProvider Is null");
    return false;
  }
  
  public boolean shouldDiscardCurrentPage()
  {
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\x5\a\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */