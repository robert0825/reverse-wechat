package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cv
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faJ;
  private static final int faO;
  private static final int fbb;
  private static final int ffa;
  private static final int fme;
  private static final int fnq;
  private static final int ftO;
  private static final int ftP;
  private static final int ftQ;
  private static final int ftR;
  private boolean eZF;
  private boolean faZ;
  private boolean fan;
  private boolean fas;
  private boolean feM;
  public String field_content;
  public long field_createtime;
  public String field_imgpath;
  public int field_isSend;
  public String field_sayhicontent;
  public String field_sayhiuser;
  public int field_scene;
  public int field_status;
  public long field_svrid;
  public String field_talker;
  public int field_type;
  private boolean flF;
  private boolean fna;
  private boolean ftJ;
  private boolean ftK;
  private boolean ftL;
  private boolean ftM;
  
  static
  {
    GMTrace.i(4152830722048L, 30941);
    eZt = new String[0];
    fme = "svrid".hashCode();
    eZI = "status".hashCode();
    faJ = "type".hashCode();
    fbb = "scene".hashCode();
    ftO = "createtime".hashCode();
    fnq = "talker".hashCode();
    faO = "content".hashCode();
    ftP = "sayhiuser".hashCode();
    ftQ = "sayhicontent".hashCode();
    ftR = "imgpath".hashCode();
    ffa = "isSend".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4152830722048L, 30941);
  }
  
  public cv()
  {
    GMTrace.i(4152428068864L, 30938);
    this.flF = true;
    this.eZF = true;
    this.fan = true;
    this.faZ = true;
    this.ftJ = true;
    this.fna = true;
    this.fas = true;
    this.ftK = true;
    this.ftL = true;
    this.ftM = true;
    this.feM = true;
    GMTrace.o(4152428068864L, 30938);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4152562286592L, 30939);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4152562286592L, 30939);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fme == k)
      {
        this.field_svrid = paramCursor.getLong(i);
        this.flF = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (fbb == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (ftO == k) {
          this.field_createtime = paramCursor.getLong(i);
        } else if (fnq == k) {
          this.field_talker = paramCursor.getString(i);
        } else if (faO == k) {
          this.field_content = paramCursor.getString(i);
        } else if (ftP == k) {
          this.field_sayhiuser = paramCursor.getString(i);
        } else if (ftQ == k) {
          this.field_sayhicontent = paramCursor.getString(i);
        } else if (ftR == k) {
          this.field_imgpath = paramCursor.getString(i);
        } else if (ffa == k) {
          this.field_isSend = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4152562286592L, 30939);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4152696504320L, 30940);
    ContentValues localContentValues = new ContentValues();
    if (this.flF) {
      localContentValues.put("svrid", Long.valueOf(this.field_svrid));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.faZ) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.ftJ) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.fna) {
      localContentValues.put("talker", this.field_talker);
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.ftK) {
      localContentValues.put("sayhiuser", this.field_sayhiuser);
    }
    if (this.ftL) {
      localContentValues.put("sayhicontent", this.field_sayhicontent);
    }
    if (this.ftM) {
      localContentValues.put("imgpath", this.field_imgpath);
    }
    if (this.feM) {
      localContentValues.put("isSend", Integer.valueOf(this.field_isSend));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4152696504320L, 30940);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */