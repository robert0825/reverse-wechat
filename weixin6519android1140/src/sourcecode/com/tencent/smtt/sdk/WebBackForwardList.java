package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.interfaces.IX5WebBackForwardList;

public class WebBackForwardList
{
  private IX5WebBackForwardList xWY = null;
  private android.webkit.WebBackForwardList xWZ = null;
  
  static WebBackForwardList a(android.webkit.WebBackForwardList paramWebBackForwardList)
  {
    if (paramWebBackForwardList == null) {
      return null;
    }
    WebBackForwardList localWebBackForwardList = new WebBackForwardList();
    localWebBackForwardList.xWZ = paramWebBackForwardList;
    return localWebBackForwardList;
  }
  
  static WebBackForwardList a(IX5WebBackForwardList paramIX5WebBackForwardList)
  {
    if (paramIX5WebBackForwardList == null) {
      return null;
    }
    WebBackForwardList localWebBackForwardList = new WebBackForwardList();
    localWebBackForwardList.xWY = paramIX5WebBackForwardList;
    return localWebBackForwardList;
  }
  
  public int getCurrentIndex()
  {
    if (this.xWY != null) {
      return this.xWY.getCurrentIndex();
    }
    return this.xWZ.getCurrentIndex();
  }
  
  public WebHistoryItem getCurrentItem()
  {
    if (this.xWY != null) {
      return WebHistoryItem.a(this.xWY.getCurrentItem());
    }
    return WebHistoryItem.a(this.xWZ.getCurrentItem());
  }
  
  public WebHistoryItem getItemAtIndex(int paramInt)
  {
    if (this.xWY != null) {
      return WebHistoryItem.a(this.xWY.getItemAtIndex(paramInt));
    }
    return WebHistoryItem.a(this.xWZ.getItemAtIndex(paramInt));
  }
  
  public int getSize()
  {
    if (this.xWY != null) {
      return this.xWY.getSize();
    }
    return this.xWZ.getSize();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\WebBackForwardList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */