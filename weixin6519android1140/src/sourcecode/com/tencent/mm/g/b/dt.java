package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dt
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fGf;
  private static final int fGg;
  private static final int fGh;
  private static final int fGi;
  private static final int fGj;
  private static final int fGk;
  private static final int fGl;
  private static final int fGm;
  private static final int fGn;
  private static final int fGo;
  private static final int fGp;
  private static final int fGq;
  private static final int fGr;
  private static final int fGs;
  private static final int fGt;
  private static final int fGu;
  private static final int fGv;
  private boolean fFO;
  private boolean fFP;
  private boolean fFQ;
  private boolean fFR;
  private boolean fFS;
  private boolean fFT;
  private boolean fFU;
  private boolean fFV;
  private boolean fFW;
  private boolean fFX;
  private boolean fFY;
  private boolean fFZ;
  private boolean fGa;
  private boolean fGb;
  private boolean fGc;
  private boolean fGd;
  private boolean fGe;
  public int field_card_num;
  public String field_cre_name;
  public int field_cre_type;
  public String field_find_passwd_url;
  public String field_ftf_pay_url;
  public boolean field_isDomesticUser;
  public int field_is_open_touch;
  public int field_is_reg;
  public String field_lct_url;
  public String field_lct_wording;
  public int field_lqt_state;
  public String field_main_card_bind_serialno;
  public int field_paymenu_use_new;
  public String field_reset_passwd_flag;
  public int field_switchConfig;
  public String field_true_name;
  public String field_uin;
  
  static
  {
    GMTrace.i(4176050388992L, 31114);
    eZt = new String[0];
    fGf = "uin".hashCode();
    fGg = "is_reg".hashCode();
    fGh = "true_name".hashCode();
    fGi = "card_num".hashCode();
    fGj = "isDomesticUser".hashCode();
    fGk = "cre_type".hashCode();
    fGl = "main_card_bind_serialno".hashCode();
    fGm = "ftf_pay_url".hashCode();
    fGn = "switchConfig".hashCode();
    fGo = "reset_passwd_flag".hashCode();
    fGp = "find_passwd_url".hashCode();
    fGq = "is_open_touch".hashCode();
    fGr = "lct_wording".hashCode();
    fGs = "lct_url".hashCode();
    fGt = "cre_name".hashCode();
    fGu = "lqt_state".hashCode();
    fGv = "paymenu_use_new".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4176050388992L, 31114);
  }
  
  public dt()
  {
    GMTrace.i(4175647735808L, 31111);
    this.fFO = true;
    this.fFP = true;
    this.fFQ = true;
    this.fFR = true;
    this.fFS = true;
    this.fFT = true;
    this.fFU = true;
    this.fFV = true;
    this.fFW = true;
    this.fFX = true;
    this.fFY = true;
    this.fFZ = true;
    this.fGa = true;
    this.fGb = true;
    this.fGc = true;
    this.fGd = true;
    this.fGe = true;
    GMTrace.o(4175647735808L, 31111);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4175781953536L, 31112);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4175781953536L, 31112);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fGf == k)
      {
        this.field_uin = paramCursor.getString(i);
        this.fFO = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fGg == k)
        {
          this.field_is_reg = paramCursor.getInt(i);
        }
        else if (fGh == k)
        {
          this.field_true_name = paramCursor.getString(i);
        }
        else if (fGi == k)
        {
          this.field_card_num = paramCursor.getInt(i);
        }
        else
        {
          if (fGj == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isDomesticUser = bool;
              break;
            }
          }
          if (fGk == k) {
            this.field_cre_type = paramCursor.getInt(i);
          } else if (fGl == k) {
            this.field_main_card_bind_serialno = paramCursor.getString(i);
          } else if (fGm == k) {
            this.field_ftf_pay_url = paramCursor.getString(i);
          } else if (fGn == k) {
            this.field_switchConfig = paramCursor.getInt(i);
          } else if (fGo == k) {
            this.field_reset_passwd_flag = paramCursor.getString(i);
          } else if (fGp == k) {
            this.field_find_passwd_url = paramCursor.getString(i);
          } else if (fGq == k) {
            this.field_is_open_touch = paramCursor.getInt(i);
          } else if (fGr == k) {
            this.field_lct_wording = paramCursor.getString(i);
          } else if (fGs == k) {
            this.field_lct_url = paramCursor.getString(i);
          } else if (fGt == k) {
            this.field_cre_name = paramCursor.getString(i);
          } else if (fGu == k) {
            this.field_lqt_state = paramCursor.getInt(i);
          } else if (fGv == k) {
            this.field_paymenu_use_new = paramCursor.getInt(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4175781953536L, 31112);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4175916171264L, 31113);
    ContentValues localContentValues = new ContentValues();
    if (this.fFO) {
      localContentValues.put("uin", this.field_uin);
    }
    if (this.fFP) {
      localContentValues.put("is_reg", Integer.valueOf(this.field_is_reg));
    }
    if (this.fFQ) {
      localContentValues.put("true_name", this.field_true_name);
    }
    if (this.fFR) {
      localContentValues.put("card_num", Integer.valueOf(this.field_card_num));
    }
    if (this.fFS) {
      localContentValues.put("isDomesticUser", Boolean.valueOf(this.field_isDomesticUser));
    }
    if (this.fFT) {
      localContentValues.put("cre_type", Integer.valueOf(this.field_cre_type));
    }
    if (this.fFU) {
      localContentValues.put("main_card_bind_serialno", this.field_main_card_bind_serialno);
    }
    if (this.fFV) {
      localContentValues.put("ftf_pay_url", this.field_ftf_pay_url);
    }
    if (this.fFW) {
      localContentValues.put("switchConfig", Integer.valueOf(this.field_switchConfig));
    }
    if (this.fFX) {
      localContentValues.put("reset_passwd_flag", this.field_reset_passwd_flag);
    }
    if (this.fFY) {
      localContentValues.put("find_passwd_url", this.field_find_passwd_url);
    }
    if (this.fFZ) {
      localContentValues.put("is_open_touch", Integer.valueOf(this.field_is_open_touch));
    }
    if (this.fGa) {
      localContentValues.put("lct_wording", this.field_lct_wording);
    }
    if (this.fGb) {
      localContentValues.put("lct_url", this.field_lct_url);
    }
    if (this.fGc) {
      localContentValues.put("cre_name", this.field_cre_name);
    }
    if (this.fGd) {
      localContentValues.put("lqt_state", Integer.valueOf(this.field_lqt_state));
    }
    if (this.fGe) {
      localContentValues.put("paymenu_use_new", Integer.valueOf(this.field_paymenu_use_new));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4175916171264L, 31113);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */