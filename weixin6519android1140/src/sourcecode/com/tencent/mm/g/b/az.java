package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.tl;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class az
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faJ;
  private static final int fbb;
  private static final int fhe;
  private static final int foa;
  private static final int fob;
  private boolean faZ;
  private boolean fan;
  private boolean fgL;
  public long field_localId;
  public tl field_modItem;
  public int field_scene;
  public long field_time;
  public int field_type;
  private boolean fnY;
  private boolean fnZ;
  
  static
  {
    GMTrace.i(4111894315008L, 30636);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS FavModInfo_LocalId_Index ON FavEditInfo(localId)" };
    foa = "localId".hashCode();
    fob = "modItem".hashCode();
    fhe = "time".hashCode();
    faJ = "type".hashCode();
    fbb = "scene".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4111894315008L, 30636);
  }
  
  public az()
  {
    GMTrace.i(4111357444096L, 30632);
    this.fnY = true;
    this.fnZ = true;
    this.fgL = true;
    this.fan = true;
    this.faZ = true;
    GMTrace.o(4111357444096L, 30632);
  }
  
  public static c.a qM()
  {
    GMTrace.i(4111491661824L, 30633);
    c.a locala = new c.a();
    locala.gZM = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.vmt.put("localId", "LONG");
    localStringBuilder.append(" localId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "modItem";
    locala.vmt.put("modItem", "BLOB");
    localStringBuilder.append(" modItem BLOB");
    localStringBuilder.append(", ");
    locala.columns[2] = "time";
    locala.vmt.put("time", "LONG");
    localStringBuilder.append(" time LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "type";
    locala.vmt.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "scene";
    locala.vmt.put("scene", "INTEGER default '1' ");
    localStringBuilder.append(" scene INTEGER default '1' ");
    locala.columns[5] = "rowid";
    locala.vmu = localStringBuilder.toString();
    GMTrace.o(4111491661824L, 30633);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4111625879552L, 30634);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4111625879552L, 30634);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (foa == k) {
        this.field_localId = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fob == k) {
          try
          {
            byte[] arrayOfByte = paramCursor.getBlob(i);
            if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
              continue;
            }
            this.field_modItem = ((tl)new tl().aD(arrayOfByte));
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.SDK.BaseFavEditInfo", localIOException.getMessage());
          }
        } else if (fhe == k) {
          this.field_time = paramCursor.getLong(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (fbb == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4111625879552L, 30634);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4111760097280L, 30635);
    ContentValues localContentValues = new ContentValues();
    if (this.fnY) {
      localContentValues.put("localId", Long.valueOf(this.field_localId));
    }
    if ((this.fnZ) && (this.field_modItem != null)) {}
    try
    {
      localContentValues.put("modItem", this.field_modItem.toByteArray());
      if (this.fgL) {
        localContentValues.put("time", Long.valueOf(this.field_time));
      }
      if (this.fan) {
        localContentValues.put("type", Integer.valueOf(this.field_type));
      }
      if (this.faZ) {
        localContentValues.put("scene", Integer.valueOf(this.field_scene));
      }
      if (this.vmr > 0L) {
        localContentValues.put("rowid", Long.valueOf(this.vmr));
      }
      GMTrace.o(4111760097280L, 30635);
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.BaseFavEditInfo", localIOException.getMessage());
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */