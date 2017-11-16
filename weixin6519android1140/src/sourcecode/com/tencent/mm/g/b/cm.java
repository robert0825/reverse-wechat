package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class cm
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fpA;
  private static final int fxA;
  private static final int fyA;
  private static final int fyB;
  private static final int fyC;
  private static final int fyD;
  public int field_fileCacheComplete;
  public String field_fileName;
  public byte[] field_indexBitData;
  public String field_musicId;
  public String field_musicUrl;
  public String field_pieceFileMIMEType;
  private boolean fpg;
  private boolean fwW;
  private boolean fyw;
  private boolean fyx;
  private boolean fyy;
  private boolean fyz;
  
  static
  {
    GMTrace.i(15003662942208L, 111786);
    eZt = new String[0];
    fxA = "musicId".hashCode();
    fyA = "musicUrl".hashCode();
    fpA = "fileName".hashCode();
    fyB = "indexBitData".hashCode();
    fyC = "fileCacheComplete".hashCode();
    fyD = "pieceFileMIMEType".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(15003662942208L, 111786);
  }
  
  public cm()
  {
    GMTrace.i(15003126071296L, 111782);
    this.fwW = true;
    this.fyw = true;
    this.fpg = true;
    this.fyx = true;
    this.fyy = true;
    this.fyz = true;
    GMTrace.o(15003126071296L, 111782);
  }
  
  public static c.a qM()
  {
    GMTrace.i(15003260289024L, 111783);
    c.a locala = new c.a();
    locala.gZM = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "musicId";
    locala.vmt.put("musicId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" musicId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "musicId";
    locala.columns[1] = "musicUrl";
    locala.vmt.put("musicUrl", "TEXT");
    localStringBuilder.append(" musicUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "fileName";
    locala.vmt.put("fileName", "TEXT");
    localStringBuilder.append(" fileName TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "indexBitData";
    locala.vmt.put("indexBitData", "BLOB");
    localStringBuilder.append(" indexBitData BLOB");
    localStringBuilder.append(", ");
    locala.columns[4] = "fileCacheComplete";
    locala.vmt.put("fileCacheComplete", "INTEGER");
    localStringBuilder.append(" fileCacheComplete INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "pieceFileMIMEType";
    locala.vmt.put("pieceFileMIMEType", "TEXT");
    localStringBuilder.append(" pieceFileMIMEType TEXT");
    locala.columns[6] = "rowid";
    locala.vmu = localStringBuilder.toString();
    GMTrace.o(15003260289024L, 111783);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(15003394506752L, 111784);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(15003394506752L, 111784);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fxA == k)
      {
        this.field_musicId = paramCursor.getString(i);
        this.fwW = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fyA == k) {
          this.field_musicUrl = paramCursor.getString(i);
        } else if (fpA == k) {
          this.field_fileName = paramCursor.getString(i);
        } else if (fyB == k) {
          this.field_indexBitData = paramCursor.getBlob(i);
        } else if (fyC == k) {
          this.field_fileCacheComplete = paramCursor.getInt(i);
        } else if (fyD == k) {
          this.field_pieceFileMIMEType = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(15003394506752L, 111784);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(15003528724480L, 111785);
    ContentValues localContentValues = new ContentValues();
    if (this.fwW) {
      localContentValues.put("musicId", this.field_musicId);
    }
    if (this.fyw) {
      localContentValues.put("musicUrl", this.field_musicUrl);
    }
    if (this.fpg) {
      localContentValues.put("fileName", this.field_fileName);
    }
    if (this.fyx) {
      localContentValues.put("indexBitData", this.field_indexBitData);
    }
    if (this.fyy) {
      localContentValues.put("fileCacheComplete", Integer.valueOf(this.field_fileCacheComplete));
    }
    if (this.fyz) {
      localContentValues.put("pieceFileMIMEType", this.field_pieceFileMIMEType);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(15003528724480L, 111785);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */