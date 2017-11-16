package com.qq.wx.voice.embed.recognizer;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

final class g
{
  public c aDv;
  Handler aDw = new h(this);
  
  public final void a(int paramInt)
  {
    Message localMessage = this.aDw.obtainMessage(100);
    Bundle localBundle = new Bundle();
    localBundle.putInt("errorCode", paramInt);
    localMessage.setData(localBundle);
    this.aDw.sendMessage(localMessage);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\qq\wx\voice\embed\recognizer\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */