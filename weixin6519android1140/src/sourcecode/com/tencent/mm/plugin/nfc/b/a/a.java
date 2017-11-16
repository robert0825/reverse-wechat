package com.tencent.mm.plugin.nfc.b.a;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.nfc.b.b
{
  private static a nxk;
  private Set<String> nxl;
  public d nxm;
  
  static
  {
    GMTrace.i(8961986134016L, 66772);
    nxk = null;
    GMTrace.o(8961986134016L, 66772);
  }
  
  public a()
  {
    GMTrace.i(8960912392192L, 66764);
    this.nxm = null;
    GMTrace.o(8960912392192L, 66764);
  }
  
  private boolean a(com.tencent.mm.plugin.nfc.b.a parama)
  {
    GMTrace.i(8961315045376L, 66767);
    if (this.nxm == null)
    {
      w.e("MicroMsg.ApduEngine", "[NFC]ApduEngine not ready !");
      throw new IllegalStateException("ApduEngine not ready !");
    }
    if ((parama == null) || (parama.nxg == null))
    {
      w.e("MicroMsg.ApduEngine", "[NFC]apdu is null !");
      throw new IllegalArgumentException("apdu is null !");
    }
    w.i("MicroMsg.ApduEngine", "[NFC][" + parama.name + "] do cmd : " + parama.nxg.toString());
    Object localObject = parama.nxg;
    parama.nxh = this.nxm.a((com.tencent.mm.plugin.nfc.a.a)localObject);
    localObject = parama.nxh;
    int i = ((com.tencent.mm.plugin.nfc.a.c)localObject).aUc();
    if ((short)(((com.tencent.mm.plugin.nfc.a.c)localObject).aUd() | i << 8) == 36864) {}
    for (i = 1; i != 0; i = 0)
    {
      w.i("MicroMsg.ApduEngine", "[NFC][" + parama.name + "] result==> OK : " + parama.nxh.toString());
      GMTrace.o(8961315045376L, 66767);
      return true;
    }
    w.e("MicroMsg.ApduEngine", "[NFC][" + parama.name + "] result==> fail : " + parama.nxh.toString());
    GMTrace.o(8961315045376L, 66767);
    return false;
  }
  
  public static a aUe()
  {
    GMTrace.i(8960778174464L, 66763);
    if (nxk == null) {
      nxk = new a();
    }
    a locala = nxk;
    GMTrace.o(8960778174464L, 66763);
    return locala;
  }
  
  public final com.tencent.mm.plugin.nfc.a.c a(com.tencent.mm.plugin.nfc.a.a parama)
  {
    GMTrace.i(8961180827648L, 66766);
    parama = new com.tencent.mm.plugin.nfc.b.a(1, "def", parama);
    a(parama);
    parama = parama.nxh;
    GMTrace.o(8961180827648L, 66766);
    return parama;
  }
  
  public final boolean a(Tag paramTag)
  {
    GMTrace.i(8961046609920L, 66765);
    super.a(paramTag);
    this.nxl = new HashSet();
    String[] arrayOfString = paramTag.getTechList();
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = arrayOfString[i];
      w.d("MicroMsg.ApduEngine", "[NFC]tech : " + str);
      this.nxl.add(str);
      i += 1;
    }
    try
    {
      if ((this.nxm != null) && (this.nxm.isConnected())) {
        this.nxm.close();
      }
      if (this.nxl.contains(IsoDep.class.getName()))
      {
        this.nxm = new b(paramTag);
        GMTrace.o(8961046609920L, 66765);
        return true;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ApduEngine", localIOException, "", new Object[0]);
        w.e("MicroMsg.ApduEngine", localIOException.toString());
      }
      if (this.nxl.contains(NfcA.class.getName()))
      {
        this.nxm = new c(paramTag);
        GMTrace.o(8961046609920L, 66765);
        return true;
      }
      w.i("MicroMsg.ApduEngine", "[NFC]ApduEngine not support this tag");
      GMTrace.o(8961046609920L, 66765);
    }
    return false;
  }
  
  public final boolean a(List<com.tencent.mm.plugin.nfc.b.a> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(8961449263104L, 66768);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      boolean bool = a((com.tencent.mm.plugin.nfc.b.a)paramList.next());
      if ((!bool) && (paramBoolean1))
      {
        GMTrace.o(8961449263104L, 66768);
        return false;
      }
      if ((bool) && (paramBoolean2))
      {
        GMTrace.o(8961449263104L, 66768);
        return false;
      }
    }
    GMTrace.o(8961449263104L, 66768);
    return true;
  }
  
  public final int cU(Context paramContext)
  {
    GMTrace.i(8961583480832L, 66769);
    paramContext = NfcAdapter.getDefaultAdapter(paramContext);
    if (paramContext == null)
    {
      w.i("MicroMsg.ApduEngine", "[NFC] No nfc chip !");
      GMTrace.o(8961583480832L, 66769);
      return 0;
    }
    if (!paramContext.isEnabled())
    {
      GMTrace.o(8961583480832L, 66769);
      return 1;
    }
    if (this.nxm == null)
    {
      GMTrace.o(8961583480832L, 66769);
      return 4;
    }
    try
    {
      if (this.nxm != null)
      {
        boolean bool = this.nxm.isConnected();
        if (bool)
        {
          GMTrace.o(8961583480832L, 66769);
          return 3;
        }
      }
      GMTrace.o(8961583480832L, 66769);
      return 2;
    }
    catch (IOException paramContext)
    {
      w.e("MicroMsg.ApduEngine", "[NFC] IOException : " + paramContext.toString());
      GMTrace.o(8961583480832L, 66769);
    }
    return 2;
  }
  
  public final int cV(Context paramContext)
  {
    GMTrace.i(8961717698560L, 66770);
    int i = cU(paramContext);
    if ((i != 3) && (i != 2))
    {
      GMTrace.o(8961717698560L, 66770);
      return i;
    }
    try
    {
      if (this.nxm != null)
      {
        this.nxm.connect();
        boolean bool = this.nxm.isConnected();
        if (bool)
        {
          GMTrace.o(8961717698560L, 66770);
          return 3;
        }
      }
      GMTrace.o(8961717698560L, 66770);
      return 2;
    }
    catch (IOException paramContext)
    {
      w.e("MicroMsg.ApduEngine", "[NFC] IOException : " + paramContext.toString());
      GMTrace.o(8961717698560L, 66770);
    }
    return 2;
  }
  
  public final String getInfo()
  {
    GMTrace.i(8961851916288L, 66771);
    if (this.nxi == null)
    {
      w.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: tag null");
      GMTrace.o(8961851916288L, 66771);
      return null;
    }
    long l = bg.Pv();
    JSONObject localJSONObject = new JSONObject();
    w.d("MicroMsg.ApduEngine", "lo-nfc-getInfo: mTechList = " + this.nxl.size());
    Iterator localIterator = this.nxl.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      w.d("MicroMsg.ApduEngine", "lo-nfc-getInfo: tech = " + str);
      Object localObject2;
      for (;;)
      {
        try
        {
          if (!str.equals(NfcA.class.getName())) {
            break label273;
          }
          localObject2 = NfcA.get(this.nxi);
          if (localObject2 == null)
          {
            w.w("MicroMsg.ApduEngineNfcA", "lo-nfc-getInfoJsonObject: get nfcA null");
            str = null;
            localJSONObject.put(NfcA.class.getSimpleName(), str);
          }
        }
        catch (JSONException localJSONException)
        {
          w.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: exp:+" + localJSONException.getLocalizedMessage());
          localObject1 = localJSONObject.toString();
          GMTrace.o(8961851916288L, 66771);
          return (String)localObject1;
        }
        localObject1 = new JSONObject();
        ((JSONObject)localObject1).put("atqa", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(((NfcA)localObject2).getAtqa()));
        ((JSONObject)localObject1).put("sak", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(com.tencent.mm.plugin.nfc.c.a.b(((NfcA)localObject2).getSak())));
      }
      label273:
      if (((String)localObject1).equals(IsoDep.class.getName()))
      {
        localObject2 = IsoDep.get(this.nxi);
        if (localObject2 == null)
        {
          w.w("MicroMsg.ApduEngineIsoDep", "lo-nfc-getInfoJsonObject: get IsoDep null");
          localObject1 = null;
        }
        for (;;)
        {
          localJSONObject.put(IsoDep.class.getSimpleName(), localObject1);
          break;
          localObject1 = new JSONObject();
          ((JSONObject)localObject1).put("hiLayerResponse", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(((IsoDep)localObject2).getHiLayerResponse()));
          ((JSONObject)localObject1).put("historicalBytes", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(((IsoDep)localObject2).getHistoricalBytes()));
        }
      }
    }
    w.v("MicroMsg.ApduEngine", "lo-nfc-getInfo: cost=" + (bg.Pv() - l));
    w.v("MicroMsg.ApduEngine", "lo-nfc-getInfo: res=" + localJSONObject.toString());
    Object localObject1 = localJSONObject.toString();
    GMTrace.o(8961851916288L, 66771);
    return (String)localObject1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */