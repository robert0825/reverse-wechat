package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class bb
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faJ;
  private static final int faO;
  private static final int fhe;
  private static final int foG;
  private static final int foH;
  private static final int foa;
  private boolean fan;
  private boolean fas;
  private boolean fgL;
  public String field_content;
  public long field_localId;
  public int field_subtype;
  public String field_tagContent;
  public long field_time;
  public int field_type;
  private boolean fnY;
  private boolean foE;
  private boolean foF;
  
  static
  {
    GMTrace.i(4115786629120L, 30665);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS FavSearchInfo_Content_Index ON FavSearchInfo(content)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_TagContent_Index ON FavSearchInfo(tagContent)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_SubType_Index ON FavSearchInfo(subtype)" };
    foa = "localId".hashCode();
    faO = "content".hashCode();
    foG = "tagContent".hashCode();
    fhe = "time".hashCode();
    faJ = "type".hashCode();
    foH = "subtype".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4115786629120L, 30665);
  }
  
  public bb()
  {
    GMTrace.i(4115249758208L, 30661);
    this.fnY = true;
    this.fas = true;
    this.foE = true;
    this.fgL = true;
    this.fan = true;
    this.foF = true;
    GMTrace.o(4115249758208L, 30661);
  }
  
  public static c.a qM()
  {
    GMTrace.i(4115383975936L, 30662);
    c.a locala = new c.a();
    locala.gZM = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.vmt.put("localId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" localId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "localId";
    locala.columns[1] = "content";
    locala.vmt.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "tagContent";
    locala.vmt.put("tagContent", "TEXT");
    localStringBuilder.append(" tagContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "time";
    locala.vmt.put("time", "LONG");
    localStringBuilder.append(" time LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "type";
    locala.vmt.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "subtype";
    locala.vmt.put("subtype", "INTEGER default '0' ");
    localStringBuilder.append(" subtype INTEGER default '0' ");
    locala.columns[6] = "rowid";
    locala.vmu = localStringBuilder.toString();
    GMTrace.o(4115383975936L, 30662);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4115518193664L, 30663);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4115518193664L, 30663);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (foa == k)
      {
        this.field_localId = paramCursor.getLong(i);
        this.fnY = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (faO == k) {
          this.field_content = paramCursor.getString(i);
        } else if (foG == k) {
          this.field_tagContent = paramCursor.getString(i);
        } else if (fhe == k) {
          this.field_time = paramCursor.getLong(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (foH == k) {
          this.field_subtype = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4115518193664L, 30663);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4115652411392L, 30664);
    ContentValues localContentValues = new ContentValues();
    if (this.fnY) {
      localContentValues.put("localId", Long.valueOf(this.field_localId));
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.foE) {
      localContentValues.put("tagContent", this.field_tagContent);
    }
    if (this.fgL) {
      localContentValues.put("time", Long.valueOf(this.field_time));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.foF) {
      localContentValues.put("subtype", Integer.valueOf(this.field_subtype));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4115652411392L, 30664);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */