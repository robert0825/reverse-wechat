package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class ad
{
  public String eCQ;
  int eQl;
  public long gDV;
  public int gDW;
  int gDX;
  String gDY;
  String gDZ;
  String gEa;
  String gEb;
  String gEc;
  public String gEd;
  String gEe;
  String gEf;
  String gsO;
  String gsP;
  public int gsQ;
  public int gsR;
  public String username;
  
  public ad()
  {
    GMTrace.i(4420460871680L, 32935);
    this.eQl = -1;
    this.gDV = 0L;
    this.gDW = 0;
    this.gDX = 0;
    this.username = "";
    this.eCQ = "";
    this.gDY = "";
    this.gDZ = "";
    this.gEa = "";
    this.gEb = "";
    this.gEc = "";
    this.gEd = "";
    this.gEe = "";
    this.gEf = "";
    this.gsO = "";
    this.gsP = "";
    this.gsQ = 0;
    this.gsR = 0;
    GMTrace.o(4420460871680L, 32935);
  }
  
  public final ContentValues HV()
  {
    GMTrace.i(4420729307136L, 32937);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x1) != 0) {
      localContentValues.put("qq", Long.valueOf(this.gDV));
    }
    int i;
    if ((this.eQl & 0x2) != 0)
    {
      i = this.gDW;
      if (i == 0) {
        localContentValues.put("wexinstatus", Integer.valueOf(65536));
      }
    }
    else
    {
      if ((this.eQl & 0x4) != 0) {
        localContentValues.put("groupid", Integer.valueOf(this.gDX));
      }
      if ((this.eQl & 0x8) != 0) {
        localContentValues.put("username", getUsername());
      }
      if ((this.eQl & 0x10) != 0) {
        localContentValues.put("nickname", HW());
      }
      if ((this.eQl & 0x20) != 0)
      {
        if (this.gDY != null) {
          break label406;
        }
        str = "";
        label149:
        localContentValues.put("pyinitial", str);
      }
      if ((this.eQl & 0x40) != 0)
      {
        if (this.gDZ != null) {
          break label414;
        }
        str = "";
        label176:
        localContentValues.put("quanpin", str);
      }
      if ((this.eQl & 0x80) != 0) {
        localContentValues.put("qqnickname", HX());
      }
      if ((this.eQl & 0x100) != 0) {
        localContentValues.put("qqpyinitial", HY());
      }
      if ((this.eQl & 0x200) != 0) {
        localContentValues.put("qqquanpin", HZ());
      }
      if ((this.eQl & 0x400) != 0) {
        localContentValues.put("qqremark", Ia());
      }
      if ((this.eQl & 0x800) != 0) {
        localContentValues.put("qqremarkpyinitial", Ib());
      }
      if ((this.eQl & 0x1000) != 0) {
        localContentValues.put("qqremarkquanpin", Ic());
      }
      if ((this.eQl & 0x4000) != 0) {
        if (this.gsP != null) {
          break label422;
        }
      }
    }
    label406:
    label414:
    label422:
    for (String str = "";; str = this.gsP)
    {
      localContentValues.put("reserved2", str);
      if ((this.eQl & 0x8000) != 0) {
        localContentValues.put("reserved3", Integer.valueOf(this.gsQ));
      }
      if ((this.eQl & 0x10000) != 0) {
        localContentValues.put("reserved4", Integer.valueOf(this.gsR));
      }
      GMTrace.o(4420729307136L, 32937);
      return localContentValues;
      localContentValues.put("wexinstatus", Integer.valueOf(i));
      break;
      str = this.gDY;
      break label149;
      str = this.gDZ;
      break label176;
    }
  }
  
  public final String HW()
  {
    GMTrace.i(4420997742592L, 32939);
    if (this.eCQ == null)
    {
      GMTrace.o(4420997742592L, 32939);
      return "";
    }
    String str = this.eCQ;
    GMTrace.o(4420997742592L, 32939);
    return str;
  }
  
  public final String HX()
  {
    GMTrace.i(4421131960320L, 32940);
    if (this.gEa == null)
    {
      GMTrace.o(4421131960320L, 32940);
      return "";
    }
    String str = this.gEa;
    GMTrace.o(4421131960320L, 32940);
    return str;
  }
  
  public final String HY()
  {
    GMTrace.i(4421266178048L, 32941);
    if (this.gEb == null)
    {
      GMTrace.o(4421266178048L, 32941);
      return "";
    }
    String str = this.gEb;
    GMTrace.o(4421266178048L, 32941);
    return str;
  }
  
  public final String HZ()
  {
    GMTrace.i(4421400395776L, 32942);
    if (this.gEc == null)
    {
      GMTrace.o(4421400395776L, 32942);
      return "";
    }
    String str = this.gEc;
    GMTrace.o(4421400395776L, 32942);
    return str;
  }
  
  public final String Ia()
  {
    GMTrace.i(4421534613504L, 32943);
    if (this.gEd == null)
    {
      GMTrace.o(4421534613504L, 32943);
      return "";
    }
    String str = this.gEd;
    GMTrace.o(4421534613504L, 32943);
    return str;
  }
  
  public final String Ib()
  {
    GMTrace.i(4421668831232L, 32944);
    if (this.gEe == null)
    {
      GMTrace.o(4421668831232L, 32944);
      return "";
    }
    String str = this.gEe;
    GMTrace.o(4421668831232L, 32944);
    return str;
  }
  
  public final String Ic()
  {
    GMTrace.i(4421803048960L, 32945);
    if (this.gEf == null)
    {
      GMTrace.o(4421803048960L, 32945);
      return "";
    }
    String str = this.gEf;
    GMTrace.o(4421803048960L, 32945);
    return str;
  }
  
  public final void Id()
  {
    GMTrace.i(4422071484416L, 32947);
    this.gsQ |= 0x1;
    GMTrace.o(4422071484416L, 32947);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4420595089408L, 32936);
    this.gDV = paramCursor.getLong(0);
    int i = paramCursor.getInt(1);
    if (i == 65536) {}
    for (this.gDW = 0;; this.gDW = i)
    {
      this.gDX = paramCursor.getInt(2);
      this.username = paramCursor.getString(3);
      this.eCQ = paramCursor.getString(4);
      this.gDY = paramCursor.getString(5);
      this.gDZ = paramCursor.getString(6);
      this.gEa = paramCursor.getString(7);
      this.gEb = paramCursor.getString(8);
      this.gEc = paramCursor.getString(9);
      this.gEd = paramCursor.getString(10);
      this.gEe = paramCursor.getString(11);
      this.gEf = paramCursor.getString(12);
      this.gsO = paramCursor.getString(13);
      this.gsP = paramCursor.getString(14);
      this.gsQ = paramCursor.getInt(15);
      this.gsR = paramCursor.getInt(16);
      GMTrace.o(4420595089408L, 32936);
      return;
    }
  }
  
  public final String getDisplayName()
  {
    GMTrace.i(4421937266688L, 32946);
    if ((Ia() == null) || (Ia().length() <= 0))
    {
      str = HX();
      GMTrace.o(4421937266688L, 32946);
      return str;
    }
    String str = Ia();
    GMTrace.o(4421937266688L, 32946);
    return str;
  }
  
  public final String getUsername()
  {
    GMTrace.i(4420863524864L, 32938);
    if (this.username == null)
    {
      GMTrace.o(4420863524864L, 32938);
      return "";
    }
    String str = this.username;
    GMTrace.o(4420863524864L, 32938);
    return str;
  }
  
  public final String toString()
  {
    GMTrace.i(4422205702144L, 32948);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("groupID\t:").append(this.gDX).append("\n");
    ((StringBuilder)localObject).append("qq\t:").append(this.gDV).append("\n");
    ((StringBuilder)localObject).append("username\t:").append(this.username).append("\n");
    ((StringBuilder)localObject).append("nickname\t:").append(this.eCQ).append("\n");
    ((StringBuilder)localObject).append("wexinStatus\t:").append(this.gDW).append("\n");
    ((StringBuilder)localObject).append("reserved3\t:").append(this.gsQ).append("\n");
    ((StringBuilder)localObject).append("reserved4\t:").append(this.gsR).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(4422205702144L, 32948);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */