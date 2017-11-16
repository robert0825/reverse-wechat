package com.tencent.mm.plugin.scanner.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.nf;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;

public final class m
  extends c<nf>
  implements b.a
{
  private boolean lAS;
  private d otE;
  private p otF;
  
  public m()
  {
    GMTrace.i(20666711539712L, 153979);
    this.otE = null;
    this.lAS = false;
    this.otF = null;
    this.vhf = nf.class.getName().hashCode();
    GMTrace.o(20666711539712L, 153979);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(20667114192896L, 153982);
    GMTrace.o(20667114192896L, 153982);
  }
  
  public final void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    GMTrace.i(20666845757440L, 153980);
    w.i("MicroMsg.RecogQBarInYUVListener", "hy: on decode success. result type: %d, result: %s, codeType: %d, codeVersion: %d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.otF != null) {
      this.otF.D(paramString, paramInt2, paramInt3);
    }
    this.lAS = false;
    GMTrace.o(20666845757440L, 153980);
  }
  
  public final void bct()
  {
    GMTrace.i(20666979975168L, 153981);
    w.i("MicroMsg.RecogQBarInYUVListener", "hy: on qrcode decode failed");
    if (this.otF != null) {
      this.otF.D("", -2, -1);
    }
    this.lAS = false;
    GMTrace.o(20666979975168L, 153981);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */