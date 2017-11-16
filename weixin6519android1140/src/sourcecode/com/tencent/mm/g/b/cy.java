package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cy
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fBn;
  private static final int fBo;
  private static final int fBp;
  private static final int fBq;
  private static final int fBr;
  private static final int faG;
  private static final int foa;
  private static final int fpA;
  private boolean fBi;
  private boolean fBj;
  private boolean fBk;
  private boolean fBl;
  private boolean fBm;
  private boolean fak;
  public long field_createTime;
  public int field_fileDuration;
  public long field_fileLength;
  public String field_fileMd5;
  public String field_fileName;
  public int field_fileNameHash;
  public int field_fileStatus;
  public int field_localId;
  private boolean fnY;
  private boolean fpg;
  
  static
  {
    GMTrace.i(4112431185920L, 30640);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS file_name_hash_index ON SightDraftInfo(fileNameHash)" };
    foa = "localId".hashCode();
    fpA = "fileName".hashCode();
    fBn = "fileNameHash".hashCode();
    fBo = "fileMd5".hashCode();
    fBp = "fileLength".hashCode();
    fBq = "fileStatus".hashCode();
    fBr = "fileDuration".hashCode();
    faG = "createTime".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4112431185920L, 30640);
  }
  
  public cy()
  {
    GMTrace.i(4112028532736L, 30637);
    this.fnY = true;
    this.fpg = true;
    this.fBi = true;
    this.fBj = true;
    this.fBk = true;
    this.fBl = true;
    this.fBm = true;
    this.fak = true;
    GMTrace.o(4112028532736L, 30637);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4112162750464L, 30638);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4112162750464L, 30638);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (foa == k)
      {
        this.field_localId = paramCursor.getInt(i);
        this.fnY = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fpA == k) {
          this.field_fileName = paramCursor.getString(i);
        } else if (fBn == k) {
          this.field_fileNameHash = paramCursor.getInt(i);
        } else if (fBo == k) {
          this.field_fileMd5 = paramCursor.getString(i);
        } else if (fBp == k) {
          this.field_fileLength = paramCursor.getLong(i);
        } else if (fBq == k) {
          this.field_fileStatus = paramCursor.getInt(i);
        } else if (fBr == k) {
          this.field_fileDuration = paramCursor.getInt(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4112162750464L, 30638);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4112296968192L, 30639);
    ContentValues localContentValues = new ContentValues();
    if (this.fnY) {
      localContentValues.put("localId", Integer.valueOf(this.field_localId));
    }
    if (this.fpg) {
      localContentValues.put("fileName", this.field_fileName);
    }
    if (this.fBi) {
      localContentValues.put("fileNameHash", Integer.valueOf(this.field_fileNameHash));
    }
    if (this.field_fileMd5 == null) {
      this.field_fileMd5 = "";
    }
    if (this.fBj) {
      localContentValues.put("fileMd5", this.field_fileMd5);
    }
    if (this.fBk) {
      localContentValues.put("fileLength", Long.valueOf(this.field_fileLength));
    }
    if (this.fBl) {
      localContentValues.put("fileStatus", Integer.valueOf(this.field_fileStatus));
    }
    if (this.fBm) {
      localContentValues.put("fileDuration", Integer.valueOf(this.field_fileDuration));
    }
    if (this.fak) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4112296968192L, 30639);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */