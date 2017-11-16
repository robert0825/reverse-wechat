package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class ba
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faJ;
  private static final int faK;
  private static final int fca;
  private static final int fel;
  private static final int fer;
  private static final int fkB;
  private static final int foA;
  private static final int foB;
  private static final int foC;
  private static final int foD;
  private static final int foa;
  private static final int foq;
  private static final int jdField_for;
  private static final int fos;
  private static final int fot;
  private static final int fou;
  private static final int fov;
  private static final int fow;
  private static final int fox;
  private static final int foy;
  private static final int foz;
  private boolean fan;
  private boolean fao;
  private boolean fbW;
  private boolean feh;
  private boolean fep;
  public long field_datatotalsize;
  public long field_edittime;
  public String field_ext;
  public tt field_favProto;
  public int field_flag;
  public String field_fromUser;
  public int field_id;
  public int field_itemStatus;
  public long field_localId;
  public int field_localSeq;
  public String field_realChatName;
  public String field_sessionId;
  public long field_sourceCreateTime;
  public String field_sourceId;
  public int field_sourceType;
  public ud field_tagProto;
  public String field_toUser;
  public int field_type;
  public int field_updateSeq;
  public long field_updateTime;
  public String field_xml;
  private boolean fky;
  private boolean fnY;
  private boolean foc;
  private boolean fod;
  private boolean foe;
  private boolean fof;
  private boolean fog;
  private boolean foh;
  private boolean foi;
  private boolean foj;
  private boolean fok;
  private boolean fol;
  private boolean fom;
  private boolean fon;
  private boolean foo;
  private boolean fop;
  
  static
  {
    GMTrace.i(4158467866624L, 30983);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS FavItemInfo_id_Index ON FavItemInfo(id)", "CREATE INDEX IF NOT EXISTS FavItemInfo_type_Index ON FavItemInfo(type)", "CREATE INDEX IF NOT EXISTS FavItemInfo_updateSeq_Index ON FavItemInfo(updateSeq)", "CREATE INDEX IF NOT EXISTS FavItemInfo_flag_Index ON FavItemInfo(flag)", "CREATE INDEX IF NOT EXISTS FavItemInfo_sourceId_Index ON FavItemInfo(sourceId)", "CREATE INDEX IF NOT EXISTS FavItemInfo_datatotalsize_Index ON FavItemInfo(datatotalsize)" };
    foa = "localId".hashCode();
    fkB = "id".hashCode();
    faJ = "type".hashCode();
    foq = "localSeq".hashCode();
    for = "updateSeq".hashCode();
    fer = "flag".hashCode();
    fos = "sourceId".hashCode();
    fot = "itemStatus".hashCode();
    faK = "sourceType".hashCode();
    fou = "sourceCreateTime".hashCode();
    fca = "updateTime".hashCode();
    fov = "fromUser".hashCode();
    fow = "toUser".hashCode();
    fox = "realChatName".hashCode();
    foy = "favProto".hashCode();
    fel = "xml".hashCode();
    foz = "ext".hashCode();
    foA = "edittime".hashCode();
    foB = "tagProto".hashCode();
    foC = "sessionId".hashCode();
    foD = "datatotalsize".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4158467866624L, 30983);
  }
  
  public ba()
  {
    GMTrace.i(4157930995712L, 30979);
    this.fnY = true;
    this.fky = true;
    this.fan = true;
    this.foc = true;
    this.fod = true;
    this.fep = true;
    this.foe = true;
    this.fof = true;
    this.fao = true;
    this.fog = true;
    this.fbW = true;
    this.foh = true;
    this.foi = true;
    this.foj = true;
    this.fok = true;
    this.feh = true;
    this.fol = true;
    this.fom = true;
    this.fon = true;
    this.foo = true;
    this.fop = true;
    GMTrace.o(4157930995712L, 30979);
  }
  
  public static c.a qM()
  {
    GMTrace.i(4158065213440L, 30980);
    c.a locala = new c.a();
    locala.gZM = new Field[21];
    locala.columns = new String[22];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.vmt.put("localId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" localId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "localId";
    locala.columns[1] = "id";
    locala.vmt.put("id", "INTEGER");
    localStringBuilder.append(" id INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "type";
    locala.vmt.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "localSeq";
    locala.vmt.put("localSeq", "INTEGER");
    localStringBuilder.append(" localSeq INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "updateSeq";
    locala.vmt.put("updateSeq", "INTEGER");
    localStringBuilder.append(" updateSeq INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "flag";
    locala.vmt.put("flag", "INTEGER");
    localStringBuilder.append(" flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "sourceId";
    locala.vmt.put("sourceId", "TEXT");
    localStringBuilder.append(" sourceId TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "itemStatus";
    locala.vmt.put("itemStatus", "INTEGER");
    localStringBuilder.append(" itemStatus INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "sourceType";
    locala.vmt.put("sourceType", "INTEGER");
    localStringBuilder.append(" sourceType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "sourceCreateTime";
    locala.vmt.put("sourceCreateTime", "LONG");
    localStringBuilder.append(" sourceCreateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "updateTime";
    locala.vmt.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "fromUser";
    locala.vmt.put("fromUser", "TEXT");
    localStringBuilder.append(" fromUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "toUser";
    locala.vmt.put("toUser", "TEXT");
    localStringBuilder.append(" toUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "realChatName";
    locala.vmt.put("realChatName", "TEXT");
    localStringBuilder.append(" realChatName TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "favProto";
    locala.vmt.put("favProto", "BLOB");
    localStringBuilder.append(" favProto BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "xml";
    locala.vmt.put("xml", "TEXT");
    localStringBuilder.append(" xml TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "ext";
    locala.vmt.put("ext", "TEXT");
    localStringBuilder.append(" ext TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "edittime";
    locala.vmt.put("edittime", "LONG");
    localStringBuilder.append(" edittime LONG");
    localStringBuilder.append(", ");
    locala.columns[18] = "tagProto";
    locala.vmt.put("tagProto", "BLOB");
    localStringBuilder.append(" tagProto BLOB");
    localStringBuilder.append(", ");
    locala.columns[19] = "sessionId";
    locala.vmt.put("sessionId", "TEXT");
    localStringBuilder.append(" sessionId TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "datatotalsize";
    locala.vmt.put("datatotalsize", "LONG");
    localStringBuilder.append(" datatotalsize LONG");
    locala.columns[21] = "rowid";
    locala.vmu = localStringBuilder.toString();
    GMTrace.o(4158065213440L, 30980);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4158199431168L, 30981);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4158199431168L, 30981);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
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
        if (fkB == k) {
          this.field_id = paramCursor.getInt(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (foq == k) {
          this.field_localSeq = paramCursor.getInt(i);
        } else if (for == k) {
          this.field_updateSeq = paramCursor.getInt(i);
        } else if (fer == k) {
          this.field_flag = paramCursor.getInt(i);
        } else if (fos == k) {
          this.field_sourceId = paramCursor.getString(i);
        } else if (fot == k) {
          this.field_itemStatus = paramCursor.getInt(i);
        } else if (faK == k) {
          this.field_sourceType = paramCursor.getInt(i);
        } else if (fou == k) {
          this.field_sourceCreateTime = paramCursor.getLong(i);
        } else if (fca == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (fov == k) {
          this.field_fromUser = paramCursor.getString(i);
        } else if (fow == k) {
          this.field_toUser = paramCursor.getString(i);
        } else if (fox == k) {
          this.field_realChatName = paramCursor.getString(i);
        } else if (foy == k) {
          try
          {
            byte[] arrayOfByte1 = paramCursor.getBlob(i);
            if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
              continue;
            }
            this.field_favProto = ((tt)new tt().aD(arrayOfByte1));
          }
          catch (IOException localIOException1)
          {
            w.e("MicroMsg.SDK.BaseFavItemInfo", localIOException1.getMessage());
          }
        } else if (fel == k) {
          this.field_xml = paramCursor.getString(i);
        } else if (foz == k) {
          this.field_ext = paramCursor.getString(i);
        } else if (foA == k) {
          this.field_edittime = paramCursor.getLong(i);
        } else if (foB == k) {
          try
          {
            byte[] arrayOfByte2 = paramCursor.getBlob(i);
            if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
              continue;
            }
            this.field_tagProto = ((ud)new ud().aD(arrayOfByte2));
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.SDK.BaseFavItemInfo", localIOException2.getMessage());
          }
        } else if (foC == k) {
          this.field_sessionId = paramCursor.getString(i);
        } else if (foD == k) {
          this.field_datatotalsize = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4158199431168L, 30981);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4158333648896L, 30982);
    ContentValues localContentValues = new ContentValues();
    if (this.fnY) {
      localContentValues.put("localId", Long.valueOf(this.field_localId));
    }
    if (this.fky) {
      localContentValues.put("id", Integer.valueOf(this.field_id));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.foc) {
      localContentValues.put("localSeq", Integer.valueOf(this.field_localSeq));
    }
    if (this.fod) {
      localContentValues.put("updateSeq", Integer.valueOf(this.field_updateSeq));
    }
    if (this.fep) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.foe) {
      localContentValues.put("sourceId", this.field_sourceId);
    }
    if (this.fof) {
      localContentValues.put("itemStatus", Integer.valueOf(this.field_itemStatus));
    }
    if (this.fao) {
      localContentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
    }
    if (this.fog) {
      localContentValues.put("sourceCreateTime", Long.valueOf(this.field_sourceCreateTime));
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.foh) {
      localContentValues.put("fromUser", this.field_fromUser);
    }
    if (this.foi) {
      localContentValues.put("toUser", this.field_toUser);
    }
    if (this.foj) {
      localContentValues.put("realChatName", this.field_realChatName);
    }
    if ((this.fok) && (this.field_favProto != null)) {}
    try
    {
      localContentValues.put("favProto", this.field_favProto.toByteArray());
      if (this.feh) {
        localContentValues.put("xml", this.field_xml);
      }
      if (this.fol) {
        localContentValues.put("ext", this.field_ext);
      }
      if (this.fom) {
        localContentValues.put("edittime", Long.valueOf(this.field_edittime));
      }
      if ((!this.fon) || (this.field_tagProto == null)) {}
    }
    catch (IOException localIOException1)
    {
      try
      {
        localContentValues.put("tagProto", this.field_tagProto.toByteArray());
        if (this.foo) {
          localContentValues.put("sessionId", this.field_sessionId);
        }
        if (this.fop) {
          localContentValues.put("datatotalsize", Long.valueOf(this.field_datatotalsize));
        }
        if (this.vmr > 0L) {
          localContentValues.put("rowid", Long.valueOf(this.vmr));
        }
        GMTrace.o(4158333648896L, 30982);
        return localContentValues;
        localIOException1 = localIOException1;
        w.e("MicroMsg.SDK.BaseFavItemInfo", localIOException1.getMessage());
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          w.e("MicroMsg.SDK.BaseFavItemInfo", localIOException2.getMessage());
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */