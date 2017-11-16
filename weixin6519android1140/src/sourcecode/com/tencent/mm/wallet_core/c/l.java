package com.tencent.mm.wallet_core.c;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;

public abstract class l
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public String fXf;
  public int gRb;
  private int kwO;
  private long rsj;
  public long sessionId;
  public Bundle ui;
  
  public l()
  {
    GMTrace.i(1455322824704L, 10843);
    this.kwO = 0;
    this.fXf = "";
    this.sessionId = 0L;
    this.gRb = 0;
    GMTrace.o(1455322824704L, 10843);
  }
  
  public final int a(e parame, q paramq, com.tencent.mm.network.k paramk)
  {
    GMTrace.i(1455859695616L, 10847);
    this.rsj = System.currentTimeMillis();
    int i = super.a(parame, paramq, paramk);
    GMTrace.o(1455859695616L, 10847);
    return i;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1455725477888L, 10846);
    long l1 = System.currentTimeMillis() - this.rsj;
    Object localObject = "";
    paramArrayOfByte = "";
    this.kwO = aMh();
    long l2 = System.currentTimeMillis();
    if (this.ui != null)
    {
      String str1 = this.ui.getString("key_TransId");
      String str2 = this.ui.getString("key_reqKey");
      if (this.sessionId == 0L) {
        this.sessionId = this.ui.getLong("key_SessionId", 0L);
      }
      paramArrayOfByte = str2;
      localObject = str1;
      if (this.gRb == 0)
      {
        this.gRb = this.ui.getInt("key_scene");
        localObject = str1;
        paramArrayOfByte = str2;
      }
    }
    g.ork.i(11170, new Object[] { Integer.valueOf(getType()), Integer.valueOf(this.kwO), Long.valueOf(l1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(am.getNetType(ab.getContext())), this.fXf, localObject, paramArrayOfByte, Long.valueOf(this.sessionId), Long.valueOf(l2) });
    p.a(getType(), aMh(), paramInt2, paramInt3, l1, this.gRb, this.fXf);
    e(paramInt2, paramInt3, paramString, paramq);
    GMTrace.o(1455725477888L, 10846);
  }
  
  public int aMh()
  {
    GMTrace.i(1455457042432L, 10844);
    GMTrace.o(1455457042432L, 10844);
    return -1;
  }
  
  public abstract void e(int paramInt1, int paramInt2, String paramString, q paramq);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */