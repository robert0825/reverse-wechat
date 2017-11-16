package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dh
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int fAP;
  private static final int fAS;
  private static final int fAT;
  private static final int fAU;
  private static final int fAV;
  private static final int fAW;
  private static final int fAX;
  private static final int fAY;
  private static final int fAZ;
  private static final int fCX;
  private static final int fCY;
  private static final int fCZ;
  private static final int fDa;
  private static final int fDb;
  private static final int fDc;
  private static final int fDd;
  private static final int fca;
  private static final int fhc;
  private static final int fhf;
  private static final int fhg;
  private static final int jdField_for;
  private boolean eZF;
  private boolean fAC;
  private boolean fAF;
  private boolean fAG;
  private boolean fAH;
  private boolean fAI;
  private boolean fAJ;
  private boolean fAK;
  private boolean fAL;
  private boolean fAM;
  private boolean fCQ;
  private boolean fCR;
  private boolean fCS;
  private boolean fCT;
  private boolean fCU;
  private boolean fCV;
  private boolean fCW;
  private boolean fbW;
  private boolean fgJ;
  private boolean fgM;
  private boolean fgN;
  public long field_begin_time;
  public String field_block_mask;
  public byte[] field_cardTpInfoData;
  public String field_card_id;
  public String field_card_tp_id;
  public int field_card_type;
  public long field_create_time;
  public byte[] field_dataInfoData;
  public int field_delete_state_flag;
  public long field_end_time;
  public String field_from_username;
  public boolean field_is_dynamic;
  public String field_label_wording;
  public long field_local_updateTime;
  public byte[] field_shareInfoData;
  public byte[] field_shopInfoData;
  public int field_status;
  public String field_stickyAnnouncement;
  public int field_stickyEndTime;
  public int field_stickyIndex;
  public long field_updateSeq;
  public long field_updateTime;
  private boolean fod;
  
  static
  {
    GMTrace.i(4120081596416L, 30697);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS UserCardInfo_card_type_index ON UserCardInfo(card_type)" };
    fhf = "card_id".hashCode();
    fhg = "card_tp_id".hashCode();
    fAP = "from_username".hashCode();
    eZI = "status".hashCode();
    fCX = "delete_state_flag".hashCode();
    fAS = "local_updateTime".hashCode();
    fca = "updateTime".hashCode();
    for = "updateSeq".hashCode();
    fCY = "create_time".hashCode();
    fAT = "begin_time".hashCode();
    fAU = "end_time".hashCode();
    fAV = "block_mask".hashCode();
    fAW = "dataInfoData".hashCode();
    fAX = "cardTpInfoData".hashCode();
    fAY = "shareInfoData".hashCode();
    fAZ = "shopInfoData".hashCode();
    fCZ = "stickyIndex".hashCode();
    fDa = "stickyEndTime".hashCode();
    fDb = "stickyAnnouncement".hashCode();
    fhc = "card_type".hashCode();
    fDc = "label_wording".hashCode();
    fDd = "is_dynamic".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4120081596416L, 30697);
  }
  
  public dh()
  {
    GMTrace.i(4119678943232L, 30694);
    this.fgM = true;
    this.fgN = true;
    this.fAC = true;
    this.eZF = true;
    this.fCQ = true;
    this.fAF = true;
    this.fbW = true;
    this.fod = true;
    this.fCR = true;
    this.fAG = true;
    this.fAH = true;
    this.fAI = true;
    this.fAJ = true;
    this.fAK = true;
    this.fAL = true;
    this.fAM = true;
    this.fCS = true;
    this.fCT = true;
    this.fCU = true;
    this.fgJ = true;
    this.fCV = true;
    this.fCW = true;
    GMTrace.o(4119678943232L, 30694);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4119813160960L, 30695);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4119813160960L, 30695);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
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
        if (fhg == k)
        {
          this.field_card_tp_id = paramCursor.getString(i);
        }
        else if (fAP == k)
        {
          this.field_from_username = paramCursor.getString(i);
        }
        else if (eZI == k)
        {
          this.field_status = paramCursor.getInt(i);
        }
        else if (fCX == k)
        {
          this.field_delete_state_flag = paramCursor.getInt(i);
        }
        else if (fAS == k)
        {
          this.field_local_updateTime = paramCursor.getLong(i);
        }
        else if (fca == k)
        {
          this.field_updateTime = paramCursor.getLong(i);
        }
        else if (for == k)
        {
          this.field_updateSeq = paramCursor.getLong(i);
        }
        else if (fCY == k)
        {
          this.field_create_time = paramCursor.getLong(i);
        }
        else if (fAT == k)
        {
          this.field_begin_time = paramCursor.getLong(i);
        }
        else if (fAU == k)
        {
          this.field_end_time = paramCursor.getLong(i);
        }
        else if (fAV == k)
        {
          this.field_block_mask = paramCursor.getString(i);
        }
        else if (fAW == k)
        {
          this.field_dataInfoData = paramCursor.getBlob(i);
        }
        else if (fAX == k)
        {
          this.field_cardTpInfoData = paramCursor.getBlob(i);
        }
        else if (fAY == k)
        {
          this.field_shareInfoData = paramCursor.getBlob(i);
        }
        else if (fAZ == k)
        {
          this.field_shopInfoData = paramCursor.getBlob(i);
        }
        else if (fCZ == k)
        {
          this.field_stickyIndex = paramCursor.getInt(i);
        }
        else if (fDa == k)
        {
          this.field_stickyEndTime = paramCursor.getInt(i);
        }
        else if (fDb == k)
        {
          this.field_stickyAnnouncement = paramCursor.getString(i);
        }
        else if (fhc == k)
        {
          this.field_card_type = paramCursor.getInt(i);
        }
        else if (fDc == k)
        {
          this.field_label_wording = paramCursor.getString(i);
        }
        else
        {
          if (fDd == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_is_dynamic = bool;
              break;
            }
          }
          if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4119813160960L, 30695);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4119947378688L, 30696);
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
    if (this.eZF) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fCQ) {
      localContentValues.put("delete_state_flag", Integer.valueOf(this.field_delete_state_flag));
    }
    if (this.fAF) {
      localContentValues.put("local_updateTime", Long.valueOf(this.field_local_updateTime));
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.fod) {
      localContentValues.put("updateSeq", Long.valueOf(this.field_updateSeq));
    }
    if (this.fCR) {
      localContentValues.put("create_time", Long.valueOf(this.field_create_time));
    }
    if (this.fAG) {
      localContentValues.put("begin_time", Long.valueOf(this.field_begin_time));
    }
    if (this.fAH) {
      localContentValues.put("end_time", Long.valueOf(this.field_end_time));
    }
    if (this.fAI) {
      localContentValues.put("block_mask", this.field_block_mask);
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
    if (this.fCS) {
      localContentValues.put("stickyIndex", Integer.valueOf(this.field_stickyIndex));
    }
    if (this.fCT) {
      localContentValues.put("stickyEndTime", Integer.valueOf(this.field_stickyEndTime));
    }
    if (this.fCU) {
      localContentValues.put("stickyAnnouncement", this.field_stickyAnnouncement);
    }
    if (this.fgJ) {
      localContentValues.put("card_type", Integer.valueOf(this.field_card_type));
    }
    if (this.fCV) {
      localContentValues.put("label_wording", this.field_label_wording);
    }
    if (this.fCW) {
      localContentValues.put("is_dynamic", Boolean.valueOf(this.field_is_dynamic));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4119947378688L, 30696);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */