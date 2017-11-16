package com.tencent.mm.plugin.nfc.b.a;

import android.nfc.Tag;
import android.nfc.tech.NfcA;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.nfc.a.a;
import com.tencent.mm.plugin.nfc.a.b;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements d
{
  private NfcA nxo;
  
  public c(Tag paramTag)
  {
    GMTrace.i(8963596746752L, 66784);
    this.nxo = NfcA.get(paramTag);
    GMTrace.o(8963596746752L, 66784);
  }
  
  public final com.tencent.mm.plugin.nfc.a.c a(a parama)
  {
    GMTrace.i(8963730964480L, 66785);
    if (this.nxo == null)
    {
      w.e("MicroMsg.ApduEngineNfcA", "[NFC]NfcA is null");
      throw new IllegalStateException("NfcA is null");
    }
    connect();
    Object localObject = null;
    a locala = parama;
    parama = (a)localObject;
    com.tencent.mm.plugin.nfc.a.c localc = new com.tencent.mm.plugin.nfc.a.c(this.nxo.transceive(locala.getBytes()));
    localObject = parama;
    if (localc.nwX.length != 0)
    {
      if (localc.nwX.length - 2 >= 0) {
        break label96;
      }
      localObject = localc;
    }
    for (;;)
    {
      label86:
      GMTrace.o(8963730964480L, 66785);
      return (com.tencent.mm.plugin.nfc.a.c)localObject;
      label96:
      if (localc.aUc() == 108)
      {
        locala.rP(localc.aUd());
        break;
      }
      if (parama == null) {
        parama = localc;
      }
      for (;;)
      {
        localObject = parama;
        if (localc.aUc() != 97) {
          break label86;
        }
        if (localc.aUd() == 0) {
          break label170;
        }
        locala = new a((byte[])b.nxf.clone());
        break;
        parama.a(localc);
      }
      label170:
      parama.nwX[(parama.nwX.length - 1)] = -112;
      localObject = parama;
    }
  }
  
  public final boolean aUf()
  {
    GMTrace.i(8964267835392L, 66789);
    close();
    connect();
    GMTrace.o(8964267835392L, 66789);
    return true;
  }
  
  public final void close()
  {
    GMTrace.i(8963999399936L, 66787);
    if (this.nxo.isConnected()) {
      this.nxo.close();
    }
    GMTrace.o(8963999399936L, 66787);
  }
  
  public final boolean connect()
  {
    GMTrace.i(8963865182208L, 66786);
    if (!this.nxo.isConnected()) {
      this.nxo.connect();
    }
    GMTrace.o(8963865182208L, 66786);
    return true;
  }
  
  public final boolean isConnected()
  {
    GMTrace.i(8964133617664L, 66788);
    boolean bool = this.nxo.isConnected();
    GMTrace.o(8964133617664L, 66788);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */