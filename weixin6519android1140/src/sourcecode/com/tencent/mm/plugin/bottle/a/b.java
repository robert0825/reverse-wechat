package com.tencent.mm.plugin.bottle.a;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;

public final class b
  extends j
{
  public static final String[] fTX;
  public g goN;
  
  static
  {
    GMTrace.i(7598602452992L, 56614);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS bottleinfo1 ( parentclientid text  , childcount int  , bottleid text  PRIMARY KEY , bottletype int  , msgtype int  , voicelen int  , content text  , createtime long  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
    GMTrace.o(7598602452992L, 56614);
  }
  
  public b(g paramg)
  {
    GMTrace.i(7598334017536L, 56612);
    this.goN = paramg;
    GMTrace.o(7598334017536L, 56612);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(7598468235264L, 56613);
    parama.eQl = -1;
    ContentValues localContentValues = new ContentValues();
    String str;
    if ((parama.eQl & 0x1) != 0)
    {
      if (parama.joO == null)
      {
        str = "";
        localContentValues.put("parentclientid", str);
      }
    }
    else
    {
      if ((parama.eQl & 0x2) != 0) {
        localContentValues.put("childcount", Integer.valueOf(parama.joP));
      }
      if ((parama.eQl & 0x4) != 0) {
        localContentValues.put("bottleid", parama.ahq());
      }
      if ((parama.eQl & 0x8) != 0) {
        localContentValues.put("bottletype", Integer.valueOf(parama.joR));
      }
      if ((parama.eQl & 0x10) != 0) {
        localContentValues.put("msgtype", Integer.valueOf(parama.msgType));
      }
      if ((parama.eQl & 0x20) != 0) {
        localContentValues.put("voicelen", Integer.valueOf(parama.joS));
      }
      if ((parama.eQl & 0x40) != 0) {
        localContentValues.put("content", parama.rc());
      }
      if ((parama.eQl & 0x80) != 0) {
        localContentValues.put("createtime", Long.valueOf(parama.joT));
      }
      if ((parama.eQl & 0x100) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(parama.goJ));
      }
      if ((parama.eQl & 0x200) != 0) {
        localContentValues.put("reserved2", Integer.valueOf(parama.gDs));
      }
      if ((parama.eQl & 0x400) != 0)
      {
        if (parama.goL != null) {
          break label340;
        }
        str = "";
        label270:
        localContentValues.put("reserved3", str);
      }
      if ((parama.eQl & 0x800) != 0) {
        if (parama.goM != null) {
          break label348;
        }
      }
    }
    label340:
    label348:
    for (parama = "";; parama = parama.goM)
    {
      localContentValues.put("reserved4", parama);
      if ((int)this.goN.insert("bottleinfo1", "bottleid", localContentValues) == -1) {
        break label356;
      }
      GMTrace.o(7598468235264L, 56613);
      return true;
      str = parama.joO;
      break;
      str = parama.goL;
      break label270;
    }
    label356:
    GMTrace.o(7598468235264L, 56613);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */