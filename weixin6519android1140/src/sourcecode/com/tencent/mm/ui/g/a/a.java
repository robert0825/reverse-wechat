package com.tencent.mm.ui.g.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public final class a
{
  c xaI;
  
  public a(c paramc)
  {
    GMTrace.i(2911987826688L, 21696);
    this.xaI = paramc;
    GMTrace.o(2911987826688L, 21696);
  }
  
  public static abstract interface a
  {
    public abstract void Vo(String paramString);
    
    public abstract void a(FileNotFoundException paramFileNotFoundException);
    
    public abstract void a(IOException paramIOException);
    
    public abstract void a(MalformedURLException paramMalformedURLException);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\g\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */