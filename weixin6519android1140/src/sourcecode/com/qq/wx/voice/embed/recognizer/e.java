package com.qq.wx.voice.embed.recognizer;

import android.os.Handler;

public final class e
{
  public Grammar aDs = null;
  g aDt = new g();
  public byte[] aDu = null;
  public boolean d = false;
  public boolean e = false;
  
  public final int a(c paramc, byte[] paramArrayOfByte)
  {
    int i = 65234;
    if (!this.d) {
      i = 65232;
    }
    while (!this.e) {
      return i;
    }
    this.aDt.aDv = paramc;
    this.aDu = paramArrayOfByte;
    if (this.aDu == null) {
      return 65235;
    }
    try
    {
      new Thread(new a()).start();
      return 0;
    }
    catch (Exception paramc) {}
    return 65234;
  }
  
  private final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      if (e.this.aDs.begin() != 0)
      {
        e.this.aDt.a(-102);
        return;
      }
      if (e.this.aDs.recognize(e.this.aDu, e.this.aDu.length) != 0)
      {
        e.this.aDt.a(-103);
        return;
      }
      if (e.this.aDs.end() != 0)
      {
        e.this.aDt.a(-104);
        return;
      }
      a locala = new a();
      if (e.this.aDs.getResult(locala) != 0) {
        e.this.aDt.a(-105);
      }
      g localg = e.this.aDt;
      localg.aDw.sendMessage(localg.aDw.obtainMessage(200, locala));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\qq\wx\voice\embed\recognizer\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */