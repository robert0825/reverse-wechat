package com.tencent.mm.plugin.nfc.b.a;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.nfc.a.a;
import com.tencent.mm.plugin.nfc.a.c;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  implements d
{
  private IsoDep nxn;
  
  public b(Tag paramTag)
  {
    GMTrace.i(8962120351744L, 66773);
    if (paramTag == null)
    {
      w.e("MicroMsg.ApduEngineIsoDep", "[NFC]tag is null");
      throw new IllegalStateException("tag is null");
    }
    this.nxn = IsoDep.get(paramTag);
    GMTrace.o(8962120351744L, 66773);
  }
  
  public final c a(a parama)
  {
    GMTrace.i(8962791440384L, 66778);
    if (this.nxn == null)
    {
      w.e("MicroMsg.ApduEngineIsoDep", "[NFC]IsoDep is null");
      throw new IllegalStateException("IsoDep is null");
    }
    connect();
    Object localObject = null;
    a locala = parama;
    parama = (a)localObject;
    c localc;
    for (;;)
    {
      localc = new c(this.nxn.transceive(locala.getBytes()));
      localObject = parama;
      if (localc.nwX.length != 0)
      {
        if (localc.nwX.length - 2 <= 0) {
          localObject = localc;
        }
      }
      else
      {
        label86:
        GMTrace.o(8962791440384L, 66778);
        return (c)localObject;
      }
      if (localc.aUc() != 108) {
        break;
      }
      locala.rP(localc.aUd());
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
      locala = new a((byte[])com.tencent.mm.plugin.nfc.a.b.nxf.clone());
      break;
      parama.a(localc);
    }
  }
  
  public final boolean aUf()
  {
    GMTrace.i(8962657222656L, 66777);
    close();
    connect();
    GMTrace.o(8962657222656L, 66777);
    return true;
  }
  
  public final void close()
  {
    GMTrace.i(8962388787200L, 66775);
    if (this.nxn.isConnected()) {
      this.nxn.close();
    }
    GMTrace.o(8962388787200L, 66775);
  }
  
  public final boolean connect()
  {
    GMTrace.i(8962254569472L, 66774);
    if (!this.nxn.isConnected()) {
      this.nxn.connect();
    }
    GMTrace.o(8962254569472L, 66774);
    return true;
  }
  
  public final boolean isConnected()
  {
    GMTrace.i(8962523004928L, 66776);
    boolean bool = this.nxn.isConnected();
    GMTrace.o(8962523004928L, 66776);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */