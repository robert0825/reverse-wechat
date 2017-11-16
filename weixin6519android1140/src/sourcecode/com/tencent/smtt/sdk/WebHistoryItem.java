package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import com.tencent.smtt.export.external.interfaces.IX5WebHistoryItem;

public class WebHistoryItem
{
  private IX5WebHistoryItem xXa = null;
  private android.webkit.WebHistoryItem xXb = null;
  
  static WebHistoryItem a(android.webkit.WebHistoryItem paramWebHistoryItem)
  {
    if (paramWebHistoryItem == null) {
      return null;
    }
    WebHistoryItem localWebHistoryItem = new WebHistoryItem();
    localWebHistoryItem.xXb = paramWebHistoryItem;
    return localWebHistoryItem;
  }
  
  static WebHistoryItem a(IX5WebHistoryItem paramIX5WebHistoryItem)
  {
    if (paramIX5WebHistoryItem == null) {
      return null;
    }
    WebHistoryItem localWebHistoryItem = new WebHistoryItem();
    localWebHistoryItem.xXa = paramIX5WebHistoryItem;
    return localWebHistoryItem;
  }
  
  public Bitmap getFavicon()
  {
    if (this.xXa != null) {
      return this.xXa.getFavicon();
    }
    return this.xXb.getFavicon();
  }
  
  public String getOriginalUrl()
  {
    if (this.xXa != null) {
      return this.xXa.getOriginalUrl();
    }
    return this.xXb.getOriginalUrl();
  }
  
  public String getTitle()
  {
    if (this.xXa != null) {
      return this.xXa.getTitle();
    }
    return this.xXb.getTitle();
  }
  
  public String getUrl()
  {
    if (this.xXa != null) {
      return this.xXa.getUrl();
    }
    return this.xXb.getUrl();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\WebHistoryItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */