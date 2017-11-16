package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ae
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fid;
  private static final int fie;
  private static final int fif;
  private static final int fig;
  private static final int fih;
  private static final int fii;
  private static final int fij;
  private static final int fik;
  private static final int fil;
  private static final int fim;
  private static final int fin;
  private static final int fio;
  private static final int fip;
  private static final int fiq;
  private static final int fir;
  private static final int fis;
  private static final int fit;
  private static final int fiu;
  private boolean fhL;
  private boolean fhM;
  private boolean fhN;
  private boolean fhO;
  private boolean fhP;
  private boolean fhQ;
  private boolean fhR;
  private boolean fhS;
  private boolean fhT;
  private boolean fhU;
  private boolean fhV;
  private boolean fhW;
  private boolean fhX;
  private boolean fhY;
  private boolean fhZ;
  private boolean fia;
  private boolean fib;
  private boolean fic;
  public long field_addtime;
  public long field_chatroomLocalVersion;
  public int field_chatroomVersion;
  public int field_chatroomdataflag;
  public String field_chatroomname;
  public String field_chatroomnick;
  public String field_chatroomnotice;
  public String field_chatroomnoticeEditor;
  public long field_chatroomnoticePublishTime;
  public String field_displayname;
  public int field_isShowname;
  public String field_memberlist;
  public long field_modifytime;
  public byte[] field_roomdata;
  public int field_roomflag;
  public String field_roomowner;
  public String field_selfDisplayName;
  public int field_style;
  
  static
  {
    GMTrace.i(4168399978496L, 31057);
    eZt = new String[0];
    fid = "chatroomname".hashCode();
    fie = "addtime".hashCode();
    fif = "memberlist".hashCode();
    fig = "displayname".hashCode();
    fih = "chatroomnick".hashCode();
    fii = "roomflag".hashCode();
    fij = "roomowner".hashCode();
    fik = "roomdata".hashCode();
    fil = "isShowname".hashCode();
    fim = "selfDisplayName".hashCode();
    fin = "style".hashCode();
    fio = "chatroomdataflag".hashCode();
    fip = "modifytime".hashCode();
    fiq = "chatroomnotice".hashCode();
    fir = "chatroomVersion".hashCode();
    fis = "chatroomnoticeEditor".hashCode();
    fit = "chatroomnoticePublishTime".hashCode();
    fiu = "chatroomLocalVersion".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4168399978496L, 31057);
  }
  
  public ae()
  {
    GMTrace.i(4167997325312L, 31054);
    this.fhL = true;
    this.fhM = true;
    this.fhN = true;
    this.fhO = true;
    this.fhP = true;
    this.fhQ = true;
    this.fhR = true;
    this.fhS = true;
    this.fhT = true;
    this.fhU = true;
    this.fhV = true;
    this.fhW = true;
    this.fhX = true;
    this.fhY = true;
    this.fhZ = true;
    this.fia = true;
    this.fib = true;
    this.fic = true;
    GMTrace.o(4167997325312L, 31054);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4168131543040L, 31055);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4168131543040L, 31055);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fid == k)
      {
        this.field_chatroomname = paramCursor.getString(i);
        this.fhL = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fie == k) {
          this.field_addtime = paramCursor.getLong(i);
        } else if (fif == k) {
          this.field_memberlist = paramCursor.getString(i);
        } else if (fig == k) {
          this.field_displayname = paramCursor.getString(i);
        } else if (fih == k) {
          this.field_chatroomnick = paramCursor.getString(i);
        } else if (fii == k) {
          this.field_roomflag = paramCursor.getInt(i);
        } else if (fij == k) {
          this.field_roomowner = paramCursor.getString(i);
        } else if (fik == k) {
          this.field_roomdata = paramCursor.getBlob(i);
        } else if (fil == k) {
          this.field_isShowname = paramCursor.getInt(i);
        } else if (fim == k) {
          this.field_selfDisplayName = paramCursor.getString(i);
        } else if (fin == k) {
          this.field_style = paramCursor.getInt(i);
        } else if (fio == k) {
          this.field_chatroomdataflag = paramCursor.getInt(i);
        } else if (fip == k) {
          this.field_modifytime = paramCursor.getLong(i);
        } else if (fiq == k) {
          this.field_chatroomnotice = paramCursor.getString(i);
        } else if (fir == k) {
          this.field_chatroomVersion = paramCursor.getInt(i);
        } else if (fis == k) {
          this.field_chatroomnoticeEditor = paramCursor.getString(i);
        } else if (fit == k) {
          this.field_chatroomnoticePublishTime = paramCursor.getLong(i);
        } else if (fiu == k) {
          this.field_chatroomLocalVersion = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4168131543040L, 31055);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4168265760768L, 31056);
    ContentValues localContentValues = new ContentValues();
    if (this.field_chatroomname == null) {
      this.field_chatroomname = "";
    }
    if (this.fhL) {
      localContentValues.put("chatroomname", this.field_chatroomname);
    }
    if (this.fhM) {
      localContentValues.put("addtime", Long.valueOf(this.field_addtime));
    }
    if (this.fhN) {
      localContentValues.put("memberlist", this.field_memberlist);
    }
    if (this.fhO) {
      localContentValues.put("displayname", this.field_displayname);
    }
    if (this.fhP) {
      localContentValues.put("chatroomnick", this.field_chatroomnick);
    }
    if (this.fhQ) {
      localContentValues.put("roomflag", Integer.valueOf(this.field_roomflag));
    }
    if (this.fhR) {
      localContentValues.put("roomowner", this.field_roomowner);
    }
    if (this.fhS) {
      localContentValues.put("roomdata", this.field_roomdata);
    }
    if (this.fhT) {
      localContentValues.put("isShowname", Integer.valueOf(this.field_isShowname));
    }
    if (this.fhU) {
      localContentValues.put("selfDisplayName", this.field_selfDisplayName);
    }
    if (this.fhV) {
      localContentValues.put("style", Integer.valueOf(this.field_style));
    }
    if (this.fhW) {
      localContentValues.put("chatroomdataflag", Integer.valueOf(this.field_chatroomdataflag));
    }
    if (this.fhX) {
      localContentValues.put("modifytime", Long.valueOf(this.field_modifytime));
    }
    if (this.fhY) {
      localContentValues.put("chatroomnotice", this.field_chatroomnotice);
    }
    if (this.fhZ) {
      localContentValues.put("chatroomVersion", Integer.valueOf(this.field_chatroomVersion));
    }
    if (this.fia) {
      localContentValues.put("chatroomnoticeEditor", this.field_chatroomnoticeEditor);
    }
    if (this.fib) {
      localContentValues.put("chatroomnoticePublishTime", Long.valueOf(this.field_chatroomnoticePublishTime));
    }
    if (this.fic) {
      localContentValues.put("chatroomLocalVersion", Long.valueOf(this.field_chatroomLocalVersion));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4168265760768L, 31056);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */