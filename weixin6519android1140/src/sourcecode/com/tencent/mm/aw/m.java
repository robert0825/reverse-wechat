package com.tencent.mm.aw;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class m
{
  private String eHy;
  public int eII;
  int eQl;
  String gQj;
  private String gsO;
  private String gsP;
  private int gsQ;
  private int gsR;
  public int id;
  String name;
  int size;
  public int status;
  public int version;
  
  public m()
  {
    GMTrace.i(12941944422400L, 96425);
    this.eQl = -1;
    this.id = 0;
    this.version = 0;
    this.name = "";
    this.size = 0;
    this.gQj = "";
    this.status = 0;
    this.eII = 0;
    this.gsO = "";
    this.gsP = "";
    this.gsQ = 0;
    this.gsR = 0;
    this.eHy = (this.id + "_" + this.eII);
    GMTrace.o(12941944422400L, 96425);
  }
  
  public final String Ke()
  {
    GMTrace.i(12942347075584L, 96428);
    if (this.gQj == null)
    {
      GMTrace.o(12942347075584L, 96428);
      return "";
    }
    String str = this.gQj;
    GMTrace.o(12942347075584L, 96428);
    return str;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(12942078640128L, 96426);
    this.version = paramCursor.getInt(2);
    this.name = paramCursor.getString(3);
    this.size = paramCursor.getInt(4);
    this.gQj = paramCursor.getString(5);
    this.status = paramCursor.getInt(6);
    this.gsO = paramCursor.getString(8);
    this.gsP = paramCursor.getString(9);
    this.eII = paramCursor.getInt(7);
    this.gsR = paramCursor.getInt(11);
    this.id = paramCursor.getInt(1);
    this.gsQ = paramCursor.getInt(10);
    this.eHy = paramCursor.getString(0);
    GMTrace.o(12942078640128L, 96426);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(12942212857856L, 96427);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("id", Integer.valueOf(this.id));
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("version", Integer.valueOf(this.version));
    }
    if ((this.eQl & 0x8) != 0)
    {
      if (this.name == null)
      {
        str = "";
        localContentValues.put("name", str);
      }
    }
    else
    {
      if ((this.eQl & 0x10) != 0) {
        localContentValues.put("size", Integer.valueOf(this.size));
      }
      if ((this.eQl & 0x20) != 0) {
        localContentValues.put("packname", Ke());
      }
      if ((this.eQl & 0x40) != 0) {
        localContentValues.put("status", Integer.valueOf(this.status));
      }
      if ((this.eQl & 0x80) != 0) {
        localContentValues.put("type", Integer.valueOf(this.eII));
      }
      if ((this.eQl & 0x100) != 0)
      {
        if (this.gsO != null) {
          break label343;
        }
        str = "";
        label198:
        localContentValues.put("reserved1", str);
      }
      if ((this.eQl & 0x200) != 0) {
        if (this.gsP != null) {
          break label351;
        }
      }
    }
    label343:
    label351:
    for (String str = "";; str = this.gsP)
    {
      localContentValues.put("reserved2", str);
      if ((this.eQl & 0x400) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.gsQ));
      }
      if ((this.eQl & 0x800) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.gsR));
      }
      if ((this.eQl & 0x1) != 0) {
        localContentValues.put("localId", this.id + "_" + this.eII);
      }
      GMTrace.o(12942212857856L, 96427);
      return localContentValues;
      str = this.name;
      break;
      str = this.gsO;
      break label198;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */