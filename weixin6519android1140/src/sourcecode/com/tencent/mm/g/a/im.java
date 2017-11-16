package com.tencent.mm.g.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.g.c;
import com.tencent.mm.sdk.b.b;

public final class im
  extends b
{
  public a eLS;
  public b eLT;
  
  public im()
  {
    this((byte)0);
    GMTrace.i(4205175635968L, 31331);
    GMTrace.o(4205175635968L, 31331);
  }
  
  private im(byte paramByte)
  {
    GMTrace.i(4205309853696L, 31332);
    this.eLS = new a();
    this.eLT = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4205309853696L, 31332);
  }
  
  public static final class a
  {
    public String appId;
    public Context context;
    public Bundle eDm;
    public WXMediaMessage eLU;
    public g.c eLV;
    public int showType;
    
    public a()
    {
      GMTrace.i(4249870139392L, 31664);
      GMTrace.o(4249870139392L, 31664);
    }
  }
  
  public static final class b
  {
    public boolean eLW;
    
    public b()
    {
      GMTrace.i(15355447607296L, 114407);
      GMTrace.o(15355447607296L, 114407);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\im.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */