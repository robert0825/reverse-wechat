package com.qq.wx.voice.embed.recognizer;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

final class h
  extends Handler
{
  h(g paramg) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 100: 
      int i = paramMessage.getData().getInt("errorCode");
      this.aDt.aDv.cR(i);
      return;
    }
    paramMessage = (a)paramMessage.obj;
    this.aDt.aDv.a(paramMessage);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\qq\wx\voice\embed\recognizer\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */