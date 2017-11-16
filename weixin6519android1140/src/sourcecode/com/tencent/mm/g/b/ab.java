package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ab
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fem;
  private static final int fen;
  private static final int fhc;
  private static final int fhd;
  private static final int fhe;
  private static final int fhf;
  private static final int fhg;
  private static final int fhh;
  private static final int fhi;
  private static final int fhj;
  private static final int fhk;
  private static final int fhl;
  private static final int fhm;
  private static final int fhn;
  private static final int fho;
  private static final int fhp;
  private static final int fhq;
  private static final int fhr;
  private static final int fhs;
  private static final int fht;
  private static final int fhu;
  private boolean fei;
  private boolean fej;
  private boolean fgJ;
  private boolean fgK;
  private boolean fgL;
  private boolean fgM;
  private boolean fgN;
  private boolean fgO;
  private boolean fgP;
  private boolean fgQ;
  private boolean fgR;
  private boolean fgS;
  private boolean fgT;
  private boolean fgU;
  private boolean fgV;
  private boolean fgW;
  private boolean fgX;
  private boolean fgY;
  private boolean fgZ;
  private boolean fha;
  private boolean fhb;
  public String field_accept_buttons;
  public boolean field_all_unavailable;
  public byte[] field_buttonData;
  public String field_card_id;
  public String field_card_tp_id;
  public int field_card_type;
  public String field_consumed_box_id;
  public String field_description;
  public String field_jump_buttons;
  public int field_jump_type;
  public String field_logo_color;
  public String field_logo_url;
  public String field_msg_id;
  public int field_msg_type;
  public byte[] field_operData;
  public int field_read_state;
  public int field_report_scene;
  public int field_time;
  public String field_title;
  public String field_unavailable_qr_code_list;
  public String field_url;
  
  static
  {
    GMTrace.i(4135113981952L, 30809);
    eZt = new String[0];
    fhc = "card_type".hashCode();
    fem = "title".hashCode();
    fen = "description".hashCode();
    fhd = "logo_url".hashCode();
    fhe = "time".hashCode();
    fhf = "card_id".hashCode();
    fhg = "card_tp_id".hashCode();
    fhh = "msg_id".hashCode();
    fhi = "msg_type".hashCode();
    fhj = "jump_type".hashCode();
    fhk = "url".hashCode();
    fhl = "buttonData".hashCode();
    fhm = "operData".hashCode();
    fhn = "report_scene".hashCode();
    fho = "read_state".hashCode();
    fhp = "accept_buttons".hashCode();
    fhq = "consumed_box_id".hashCode();
    fhr = "jump_buttons".hashCode();
    fhs = "logo_color".hashCode();
    fht = "unavailable_qr_code_list".hashCode();
    fhu = "all_unavailable".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4135113981952L, 30809);
  }
  
  public ab()
  {
    GMTrace.i(4134711328768L, 30806);
    this.fgJ = true;
    this.fei = true;
    this.fej = true;
    this.fgK = true;
    this.fgL = true;
    this.fgM = true;
    this.fgN = true;
    this.fgO = true;
    this.fgP = true;
    this.fgQ = true;
    this.fgR = true;
    this.fgS = true;
    this.fgT = true;
    this.fgU = true;
    this.fgV = true;
    this.fgW = true;
    this.fgX = true;
    this.fgY = true;
    this.fgZ = true;
    this.fha = true;
    this.fhb = true;
    GMTrace.o(4134711328768L, 30806);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4134845546496L, 30807);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4134845546496L, 30807);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fhc == k) {
        this.field_card_type = paramCursor.getInt(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fem == k)
        {
          this.field_title = paramCursor.getString(i);
        }
        else if (fen == k)
        {
          this.field_description = paramCursor.getString(i);
        }
        else if (fhd == k)
        {
          this.field_logo_url = paramCursor.getString(i);
        }
        else if (fhe == k)
        {
          this.field_time = paramCursor.getInt(i);
        }
        else if (fhf == k)
        {
          this.field_card_id = paramCursor.getString(i);
        }
        else if (fhg == k)
        {
          this.field_card_tp_id = paramCursor.getString(i);
        }
        else if (fhh == k)
        {
          this.field_msg_id = paramCursor.getString(i);
          this.fgO = true;
        }
        else if (fhi == k)
        {
          this.field_msg_type = paramCursor.getInt(i);
        }
        else if (fhj == k)
        {
          this.field_jump_type = paramCursor.getInt(i);
        }
        else if (fhk == k)
        {
          this.field_url = paramCursor.getString(i);
        }
        else if (fhl == k)
        {
          this.field_buttonData = paramCursor.getBlob(i);
        }
        else if (fhm == k)
        {
          this.field_operData = paramCursor.getBlob(i);
        }
        else if (fhn == k)
        {
          this.field_report_scene = paramCursor.getInt(i);
        }
        else if (fho == k)
        {
          this.field_read_state = paramCursor.getInt(i);
        }
        else if (fhp == k)
        {
          this.field_accept_buttons = paramCursor.getString(i);
        }
        else if (fhq == k)
        {
          this.field_consumed_box_id = paramCursor.getString(i);
        }
        else if (fhr == k)
        {
          this.field_jump_buttons = paramCursor.getString(i);
        }
        else if (fhs == k)
        {
          this.field_logo_color = paramCursor.getString(i);
        }
        else if (fht == k)
        {
          this.field_unavailable_qr_code_list = paramCursor.getString(i);
        }
        else
        {
          if (fhu == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_all_unavailable = bool;
              break;
            }
          }
          if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4134845546496L, 30807);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4134979764224L, 30808);
    ContentValues localContentValues = new ContentValues();
    if (this.fgJ) {
      localContentValues.put("card_type", Integer.valueOf(this.field_card_type));
    }
    if (this.fei) {
      localContentValues.put("title", this.field_title);
    }
    if (this.fej) {
      localContentValues.put("description", this.field_description);
    }
    if (this.fgK) {
      localContentValues.put("logo_url", this.field_logo_url);
    }
    if (this.fgL) {
      localContentValues.put("time", Integer.valueOf(this.field_time));
    }
    if (this.fgM) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.fgN) {
      localContentValues.put("card_tp_id", this.field_card_tp_id);
    }
    if (this.fgO) {
      localContentValues.put("msg_id", this.field_msg_id);
    }
    if (this.fgP) {
      localContentValues.put("msg_type", Integer.valueOf(this.field_msg_type));
    }
    if (this.fgQ) {
      localContentValues.put("jump_type", Integer.valueOf(this.field_jump_type));
    }
    if (this.fgR) {
      localContentValues.put("url", this.field_url);
    }
    if (this.fgS) {
      localContentValues.put("buttonData", this.field_buttonData);
    }
    if (this.fgT) {
      localContentValues.put("operData", this.field_operData);
    }
    if (this.fgU) {
      localContentValues.put("report_scene", Integer.valueOf(this.field_report_scene));
    }
    if (this.fgV) {
      localContentValues.put("read_state", Integer.valueOf(this.field_read_state));
    }
    if (this.fgW) {
      localContentValues.put("accept_buttons", this.field_accept_buttons);
    }
    if (this.fgX) {
      localContentValues.put("consumed_box_id", this.field_consumed_box_id);
    }
    if (this.fgY) {
      localContentValues.put("jump_buttons", this.field_jump_buttons);
    }
    if (this.fgZ) {
      localContentValues.put("logo_color", this.field_logo_color);
    }
    if (this.fha) {
      localContentValues.put("unavailable_qr_code_list", this.field_unavailable_qr_code_list);
    }
    if (this.fhb) {
      localContentValues.put("all_unavailable", Boolean.valueOf(this.field_all_unavailable));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4134979764224L, 30808);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */