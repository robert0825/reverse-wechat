package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class ax
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int faJ;
  private static final int fbA;
  private static final int fbR;
  private static final int fbz;
  private static final int fdt;
  private static final int fmu;
  private static final int fnR;
  private static final int fnS;
  private static final int fnT;
  private static final int fnU;
  private static final int fnV;
  private boolean eZF;
  private boolean fan;
  private boolean fbO;
  private boolean fbi;
  private boolean fbj;
  private boolean fcX;
  public String field_cdnKey;
  public String field_cdnUrl;
  public String field_dataId;
  public int field_dataType;
  public int field_extFlag;
  public long field_favLocalId;
  public long field_modifyTime;
  public int field_offset;
  public String field_path;
  public int field_status;
  public int field_totalLen;
  public int field_type;
  private boolean flV;
  private boolean fnM;
  private boolean fnN;
  private boolean fnO;
  private boolean fnP;
  private boolean fnQ;
  
  static
  {
    GMTrace.i(4154575552512L, 30954);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS FavCdnTransferInfo_LocalId ON FavCdnInfo(favLocalId)", "CREATE INDEX IF NOT EXISTS FavCDNInfo_modifyTime_Index ON FavCdnInfo(modifyTime)" };
    fnR = "dataId".hashCode();
    fnS = "favLocalId".hashCode();
    faJ = "type".hashCode();
    fmu = "cdnUrl".hashCode();
    fnT = "cdnKey".hashCode();
    fbz = "totalLen".hashCode();
    fbA = "offset".hashCode();
    eZI = "status".hashCode();
    fnU = "path".hashCode();
    fbR = "dataType".hashCode();
    fdt = "modifyTime".hashCode();
    fnV = "extFlag".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4154575552512L, 30954);
  }
  
  public ax()
  {
    GMTrace.i(4154038681600L, 30950);
    this.fnM = true;
    this.fnN = true;
    this.fan = true;
    this.flV = true;
    this.fnO = true;
    this.fbi = true;
    this.fbj = true;
    this.eZF = true;
    this.fnP = true;
    this.fbO = true;
    this.fcX = true;
    this.fnQ = true;
    GMTrace.o(4154038681600L, 30950);
  }
  
  public static c.a qM()
  {
    GMTrace.i(4154172899328L, 30951);
    c.a locala = new c.a();
    locala.gZM = new Field[12];
    locala.columns = new String[13];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "dataId";
    locala.vmt.put("dataId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" dataId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "dataId";
    locala.columns[1] = "favLocalId";
    locala.vmt.put("favLocalId", "LONG");
    localStringBuilder.append(" favLocalId LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "type";
    locala.vmt.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "cdnUrl";
    locala.vmt.put("cdnUrl", "TEXT");
    localStringBuilder.append(" cdnUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "cdnKey";
    locala.vmt.put("cdnKey", "TEXT");
    localStringBuilder.append(" cdnKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "totalLen";
    locala.vmt.put("totalLen", "INTEGER");
    localStringBuilder.append(" totalLen INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "offset";
    locala.vmt.put("offset", "INTEGER");
    localStringBuilder.append(" offset INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "status";
    locala.vmt.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "path";
    locala.vmt.put("path", "TEXT");
    localStringBuilder.append(" path TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "dataType";
    locala.vmt.put("dataType", "INTEGER");
    localStringBuilder.append(" dataType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "modifyTime";
    locala.vmt.put("modifyTime", "LONG default '0' ");
    localStringBuilder.append(" modifyTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "extFlag";
    locala.vmt.put("extFlag", "INTEGER default '0' ");
    localStringBuilder.append(" extFlag INTEGER default '0' ");
    locala.columns[12] = "rowid";
    locala.vmu = localStringBuilder.toString();
    GMTrace.o(4154172899328L, 30951);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4154307117056L, 30952);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4154307117056L, 30952);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fnR == k)
      {
        this.field_dataId = paramCursor.getString(i);
        this.fnM = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fnS == k) {
          this.field_favLocalId = paramCursor.getLong(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (fmu == k) {
          this.field_cdnUrl = paramCursor.getString(i);
        } else if (fnT == k) {
          this.field_cdnKey = paramCursor.getString(i);
        } else if (fbz == k) {
          this.field_totalLen = paramCursor.getInt(i);
        } else if (fbA == k) {
          this.field_offset = paramCursor.getInt(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fnU == k) {
          this.field_path = paramCursor.getString(i);
        } else if (fbR == k) {
          this.field_dataType = paramCursor.getInt(i);
        } else if (fdt == k) {
          this.field_modifyTime = paramCursor.getLong(i);
        } else if (fnV == k) {
          this.field_extFlag = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4154307117056L, 30952);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4154441334784L, 30953);
    ContentValues localContentValues = new ContentValues();
    if (this.fnM) {
      localContentValues.put("dataId", this.field_dataId);
    }
    if (this.fnN) {
      localContentValues.put("favLocalId", Long.valueOf(this.field_favLocalId));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.flV) {
      localContentValues.put("cdnUrl", this.field_cdnUrl);
    }
    if (this.fnO) {
      localContentValues.put("cdnKey", this.field_cdnKey);
    }
    if (this.fbi) {
      localContentValues.put("totalLen", Integer.valueOf(this.field_totalLen));
    }
    if (this.fbj) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fnP) {
      localContentValues.put("path", this.field_path);
    }
    if (this.fbO) {
      localContentValues.put("dataType", Integer.valueOf(this.field_dataType));
    }
    if (this.fcX) {
      localContentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
    }
    if (this.fnQ) {
      localContentValues.put("extFlag", Integer.valueOf(this.field_extFlag));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4154441334784L, 30953);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */