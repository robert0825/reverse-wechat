package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cw
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int fAP;
  private static final int fAQ;
  private static final int fAR;
  private static final int fAS;
  private static final int fAT;
  private static final int fAU;
  private static final int fAV;
  private static final int fAW;
  private static final int fAX;
  private static final int fAY;
  private static final int fAZ;
  private static final int fBa;
  private static final int fBb;
  private static final int fca;
  private static final int fhf;
  private static final int fhg;
  private static final int fmn;
  private static final int jdField_for;
  private boolean eZF;
  private boolean fAC;
  private boolean fAD;
  private boolean fAE;
  private boolean fAF;
  private boolean fAG;
  private boolean fAH;
  private boolean fAI;
  private boolean fAJ;
  private boolean fAK;
  private boolean fAL;
  private boolean fAM;
  private boolean fAN;
  private boolean fAO;
  private boolean fbW;
  private boolean fgM;
  private boolean fgN;
  public String field_app_id;
  public long field_begin_time;
  public long field_block_mask;
  public byte[] field_cardTpInfoData;
  public String field_card_id;
  public String field_card_tp_id;
  public int field_categoryType;
  public String field_consumer;
  public byte[] field_dataInfoData;
  public long field_end_time;
  public String field_from_username;
  public int field_itemIndex;
  public long field_local_updateTime;
  public byte[] field_shareInfoData;
  public long field_share_time;
  public byte[] field_shopInfoData;
  public int field_status;
  public long field_updateSeq;
  public long field_updateTime;
  private boolean flO;
  private boolean fod;
  
  static
  {
    GMTrace.i(4114041798656L, 30652);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS ShareCardInfo_card_tp_id_index ON ShareCardInfo(card_tp_id)" };
    fhf = "card_id".hashCode();
    fhg = "card_tp_id".hashCode();
    fAP = "from_username".hashCode();
    fAQ = "consumer".hashCode();
    fmn = "app_id".hashCode();
    eZI = "status".hashCode();
    fAR = "share_time".hashCode();
    fAS = "local_updateTime".hashCode();
    fca = "updateTime".hashCode();
    fAT = "begin_time".hashCode();
    fAU = "end_time".hashCode();
    for = "updateSeq".hashCode();
    fAV = "block_mask".hashCode();
    fAW = "dataInfoData".hashCode();
    fAX = "cardTpInfoData".hashCode();
    fAY = "shareInfoData".hashCode();
    fAZ = "shopInfoData".hashCode();
    fBa = "categoryType".hashCode();
    fBb = "itemIndex".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4114041798656L, 30652);
  }
  
  public cw()
  {
    GMTrace.i(4113639145472L, 30649);
    this.fgM = true;
    this.fgN = true;
    this.fAC = true;
    this.fAD = true;
    this.flO = true;
    this.eZF = true;
    this.fAE = true;
    this.fAF = true;
    this.fbW = true;
    this.fAG = true;
    this.fAH = true;
    this.fod = true;
    this.fAI = true;
    this.fAJ = true;
    this.fAK = true;
    this.fAL = true;
    this.fAM = true;
    this.fAN = true;
    this.fAO = true;
    GMTrace.o(4113639145472L, 30649);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4113773363200L, 30650);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4113773363200L, 30650);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fhf == k)
      {
        this.field_card_id = paramCursor.getString(i);
        this.fgM = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fhg == k) {
          this.field_card_tp_id = paramCursor.getString(i);
        } else if (fAP == k) {
          this.field_from_username = paramCursor.getString(i);
        } else if (fAQ == k) {
          this.field_consumer = paramCursor.getString(i);
        } else if (fmn == k) {
          this.field_app_id = paramCursor.getString(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fAR == k) {
          this.field_share_time = paramCursor.getLong(i);
        } else if (fAS == k) {
          this.field_local_updateTime = paramCursor.getLong(i);
        } else if (fca == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (fAT == k) {
          this.field_begin_time = paramCursor.getLong(i);
        } else if (fAU == k) {
          this.field_end_time = paramCursor.getLong(i);
        } else if (for == k) {
          this.field_updateSeq = paramCursor.getLong(i);
        } else if (fAV == k) {
          this.field_block_mask = paramCursor.getLong(i);
        } else if (fAW == k) {
          this.field_dataInfoData = paramCursor.getBlob(i);
        } else if (fAX == k) {
          this.field_cardTpInfoData = paramCursor.getBlob(i);
        } else if (fAY == k) {
          this.field_shareInfoData = paramCursor.getBlob(i);
        } else if (fAZ == k) {
          this.field_shopInfoData = paramCursor.getBlob(i);
        } else if (fBa == k) {
          this.field_categoryType = paramCursor.getInt(i);
        } else if (fBb == k) {
          this.field_itemIndex = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4113773363200L, 30650);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4113907580928L, 30651);
    ContentValues localContentValues = new ContentValues();
    if (this.fgM) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.fgN) {
      localContentValues.put("card_tp_id", this.field_card_tp_id);
    }
    if (this.fAC) {
      localContentValues.put("from_username", this.field_from_username);
    }
    if (this.fAD) {
      localContentValues.put("consumer", this.field_consumer);
    }
    if (this.flO) {
      localContentValues.put("app_id", this.field_app_id);
    }
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fAE) {
      localContentValues.put("share_time", Long.valueOf(this.field_share_time));
    }
    if (this.fAF) {
      localContentValues.put("local_updateTime", Long.valueOf(this.field_local_updateTime));
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.fAG) {
      localContentValues.put("begin_time", Long.valueOf(this.field_begin_time));
    }
    if (this.fAH) {
      localContentValues.put("end_time", Long.valueOf(this.field_end_time));
    }
    if (this.fod) {
      localContentValues.put("updateSeq", Long.valueOf(this.field_updateSeq));
    }
    if (this.fAI) {
      localContentValues.put("block_mask", Long.valueOf(this.field_block_mask));
    }
    if (this.fAJ) {
      localContentValues.put("dataInfoData", this.field_dataInfoData);
    }
    if (this.fAK) {
      localContentValues.put("cardTpInfoData", this.field_cardTpInfoData);
    }
    if (this.fAL) {
      localContentValues.put("shareInfoData", this.field_shareInfoData);
    }
    if (this.fAM) {
      localContentValues.put("shopInfoData", this.field_shopInfoData);
    }
    if (this.fAN) {
      localContentValues.put("categoryType", Integer.valueOf(this.field_categoryType));
    }
    if (this.fAO) {
      localContentValues.put("itemIndex", Integer.valueOf(this.field_itemIndex));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4113907580928L, 30651);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */