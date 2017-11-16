package com.tencent.mm.al;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;

public final class b
  extends j
{
  public static final String[] fTX;
  g goN;
  
  static
  {
    GMTrace.i(4089077301248L, 30466);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS getcontactinfov2 ( username text  PRIMARY KEY , inserttime long  , type int  , lastgettime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
    GMTrace.o(4089077301248L, 30466);
  }
  
  public b(g paramg)
  {
    GMTrace.i(4088808865792L, 30464);
    this.goN = paramg;
    GMTrace.o(4088808865792L, 30464);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(15353165905920L, 114390);
    parama.eQl = -1;
    ContentValues localContentValues = new ContentValues();
    if ((parama.eQl & 0x1) != 0) {
      localContentValues.put("username", parama.getUsername());
    }
    if ((parama.eQl & 0x2) != 0) {
      localContentValues.put("inserttime", Long.valueOf(parama.gFw));
    }
    if ((parama.eQl & 0x4) != 0) {
      localContentValues.put("type", Integer.valueOf(parama.type));
    }
    if ((parama.eQl & 0x8) != 0) {
      localContentValues.put("lastgettime", Integer.valueOf(parama.gFx));
    }
    if ((parama.eQl & 0x10) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(parama.goJ));
    }
    if ((parama.eQl & 0x20) != 0) {
      localContentValues.put("reserved2", Integer.valueOf(parama.gDs));
    }
    if ((parama.eQl & 0x40) != 0) {
      localContentValues.put("reserved3", parama.BB());
    }
    if ((parama.eQl & 0x80) != 0) {
      localContentValues.put("reserved4", parama.Iw());
    }
    if ((int)this.goN.replace("getcontactinfov2", "username", localContentValues) != -1)
    {
      SS(parama.getUsername());
      GMTrace.o(15353165905920L, 114390);
      return true;
    }
    GMTrace.o(15353165905920L, 114390);
    return false;
  }
  
  public final boolean jW(String paramString)
  {
    GMTrace.i(4088943083520L, 30465);
    if (this.goN.delete("getcontactinfov2", "username= ?", new String[] { paramString }) > 0)
    {
      SS(paramString);
      GMTrace.o(4088943083520L, 30465);
      return true;
    }
    GMTrace.o(4088943083520L, 30465);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\al\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */