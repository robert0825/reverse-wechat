package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class e
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int faD;
  private static final int faE;
  private static final int faF;
  private static final int faG;
  private static final int faH;
  private static final int faI;
  private static final int faJ;
  private static final int faK;
  private static final int faL;
  private static final int faM;
  private static final int faN;
  private static final int faO;
  private static final int faP;
  private static final int faQ;
  private static final int faR;
  private static final int faS;
  private static final int faT;
  private static final int faU;
  private static final int faV;
  private static final int faW;
  private static final int faX;
  private static final int faY;
  private boolean faA;
  private boolean faB;
  private boolean faC;
  private boolean fah;
  private boolean fai;
  private boolean faj;
  private boolean fak;
  private boolean fal;
  private boolean fam;
  private boolean fan;
  private boolean fao;
  private boolean fap;
  private boolean faq;
  private boolean far;
  private boolean fas;
  private boolean fat;
  private boolean fau;
  private boolean fav;
  private boolean faw;
  private boolean fax;
  private boolean fay;
  private boolean faz;
  public String field_adinfo;
  public String field_adxml;
  public byte[] field_attrBuf;
  public byte[] field_content;
  public int field_createAdTime;
  public int field_createTime;
  public int field_exposureCount;
  public int field_exposureTime;
  public int field_firstControlTime;
  public int field_head;
  public int field_likeFlag;
  public int field_localFlag;
  public int field_localPrivate;
  public byte[] field_postBuf;
  public int field_pravited;
  public String field_recxml;
  public long field_snsId;
  public int field_sourceType;
  public String field_stringSeq;
  public int field_subType;
  public int field_type;
  public String field_userName;
  
  static
  {
    GMTrace.i(4113504927744L, 30648);
    eZt = new String[0];
    faD = "snsId".hashCode();
    faE = "userName".hashCode();
    faF = "localFlag".hashCode();
    faG = "createTime".hashCode();
    faH = "head".hashCode();
    faI = "localPrivate".hashCode();
    faJ = "type".hashCode();
    faK = "sourceType".hashCode();
    faL = "likeFlag".hashCode();
    faM = "pravited".hashCode();
    faN = "stringSeq".hashCode();
    faO = "content".hashCode();
    faP = "attrBuf".hashCode();
    faQ = "postBuf".hashCode();
    faR = "adinfo".hashCode();
    faS = "adxml".hashCode();
    faT = "createAdTime".hashCode();
    faU = "exposureTime".hashCode();
    faV = "firstControlTime".hashCode();
    faW = "recxml".hashCode();
    faX = "subType".hashCode();
    faY = "exposureCount".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4113504927744L, 30648);
  }
  
  public e()
  {
    GMTrace.i(4113102274560L, 30645);
    this.fah = true;
    this.fai = true;
    this.faj = true;
    this.fak = true;
    this.fal = true;
    this.fam = true;
    this.fan = true;
    this.fao = true;
    this.fap = true;
    this.faq = true;
    this.far = true;
    this.fas = true;
    this.fat = true;
    this.fau = true;
    this.fav = true;
    this.faw = true;
    this.fax = true;
    this.fay = true;
    this.faz = true;
    this.faA = true;
    this.faB = true;
    this.faC = true;
    GMTrace.o(4113102274560L, 30645);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4113236492288L, 30646);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4113236492288L, 30646);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (faD == k) {
        this.field_snsId = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (faE == k) {
          this.field_userName = paramCursor.getString(i);
        } else if (faF == k) {
          this.field_localFlag = paramCursor.getInt(i);
        } else if (faG == k) {
          this.field_createTime = paramCursor.getInt(i);
        } else if (faH == k) {
          this.field_head = paramCursor.getInt(i);
        } else if (faI == k) {
          this.field_localPrivate = paramCursor.getInt(i);
        } else if (faJ == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (faK == k) {
          this.field_sourceType = paramCursor.getInt(i);
        } else if (faL == k) {
          this.field_likeFlag = paramCursor.getInt(i);
        } else if (faM == k) {
          this.field_pravited = paramCursor.getInt(i);
        } else if (faN == k) {
          this.field_stringSeq = paramCursor.getString(i);
        } else if (faO == k) {
          this.field_content = paramCursor.getBlob(i);
        } else if (faP == k) {
          this.field_attrBuf = paramCursor.getBlob(i);
        } else if (faQ == k) {
          this.field_postBuf = paramCursor.getBlob(i);
        } else if (faR == k) {
          this.field_adinfo = paramCursor.getString(i);
        } else if (faS == k) {
          this.field_adxml = paramCursor.getString(i);
        } else if (faT == k) {
          this.field_createAdTime = paramCursor.getInt(i);
        } else if (faU == k) {
          this.field_exposureTime = paramCursor.getInt(i);
        } else if (faV == k) {
          this.field_firstControlTime = paramCursor.getInt(i);
        } else if (faW == k) {
          this.field_recxml = paramCursor.getString(i);
        } else if (faX == k) {
          this.field_subType = paramCursor.getInt(i);
        } else if (faY == k) {
          this.field_exposureCount = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4113236492288L, 30646);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4113370710016L, 30647);
    ContentValues localContentValues = new ContentValues();
    if (this.fah) {
      localContentValues.put("snsId", Long.valueOf(this.field_snsId));
    }
    if (this.fai) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.faj) {
      localContentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
    }
    if (this.fak) {
      localContentValues.put("createTime", Integer.valueOf(this.field_createTime));
    }
    if (this.fal) {
      localContentValues.put("head", Integer.valueOf(this.field_head));
    }
    if (this.fam) {
      localContentValues.put("localPrivate", Integer.valueOf(this.field_localPrivate));
    }
    if (this.fan) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.fao) {
      localContentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
    }
    if (this.fap) {
      localContentValues.put("likeFlag", Integer.valueOf(this.field_likeFlag));
    }
    if (this.faq) {
      localContentValues.put("pravited", Integer.valueOf(this.field_pravited));
    }
    if (this.far) {
      localContentValues.put("stringSeq", this.field_stringSeq);
    }
    if (this.fas) {
      localContentValues.put("content", this.field_content);
    }
    if (this.fat) {
      localContentValues.put("attrBuf", this.field_attrBuf);
    }
    if (this.fau) {
      localContentValues.put("postBuf", this.field_postBuf);
    }
    if (this.fav) {
      localContentValues.put("adinfo", this.field_adinfo);
    }
    if (this.faw) {
      localContentValues.put("adxml", this.field_adxml);
    }
    if (this.fax) {
      localContentValues.put("createAdTime", Integer.valueOf(this.field_createAdTime));
    }
    if (this.fay) {
      localContentValues.put("exposureTime", Integer.valueOf(this.field_exposureTime));
    }
    if (this.faz) {
      localContentValues.put("firstControlTime", Integer.valueOf(this.field_firstControlTime));
    }
    if (this.faA) {
      localContentValues.put("recxml", this.field_recxml);
    }
    if (this.faB) {
      localContentValues.put("subType", Integer.valueOf(this.field_subType));
    }
    if (this.faC) {
      localContentValues.put("exposureCount", Integer.valueOf(this.field_exposureCount));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4113370710016L, 30647);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */