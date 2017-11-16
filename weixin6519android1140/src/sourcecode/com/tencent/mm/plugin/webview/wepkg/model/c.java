package com.tencent.mm.plugin.webview.wepkg.model;

import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;

public abstract class c
{
  public final WeakReference<Object> rXZ;
  
  public c()
  {
    GMTrace.i(15181098778624L, 113108);
    this.rXZ = null;
    GMTrace.o(15181098778624L, 113108);
  }
  
  public c(Object paramObject)
  {
    GMTrace.i(15181232996352L, 113109);
    this.rXZ = new WeakReference(paramObject);
    GMTrace.o(15181232996352L, 113109);
  }
  
  public abstract void m(Message paramMessage);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */