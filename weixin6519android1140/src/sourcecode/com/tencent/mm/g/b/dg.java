package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dg
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fCN;
  private static final int fCO;
  private static final int fCP;
  private static final int fiL;
  private static final int fiV;
  private boolean fCK;
  private boolean fCL;
  private boolean fCM;
  private boolean fiG;
  public String field_conDescription;
  public String field_conPhone;
  public String field_conRemark;
  public String field_contactLabels;
  public String field_encryptUsername;
  private boolean fiw;
  
  static
  {
    GMTrace.i(13343926517760L, 99420);
    eZt = new String[0];
    fiV = "encryptUsername".hashCode();
    fiL = "conRemark".hashCode();
    fCN = "contactLabels".hashCode();
    fCO = "conDescription".hashCode();
    fCP = "conPhone".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(13343926517760L, 99420);
  }
  
  public dg()
  {
    GMTrace.i(13343523864576L, 99417);
    this.fiG = true;
    this.fiw = true;
    this.fCK = true;
    this.fCL = true;
    this.fCM = true;
    GMTrace.o(13343523864576L, 99417);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(13343658082304L, 99418);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(13343658082304L, 99418);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fiV == k)
      {
        this.field_encryptUsername = paramCursor.getString(i);
        this.fiG = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fiL == k) {
          this.field_conRemark = paramCursor.getString(i);
        } else if (fCN == k) {
          this.field_contactLabels = paramCursor.getString(i);
        } else if (fCO == k) {
          this.field_conDescription = paramCursor.getString(i);
        } else if (fCP == k) {
          this.field_conPhone = paramCursor.getString(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(13343658082304L, 99418);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(13343792300032L, 99419);
    ContentValues localContentValues = new ContentValues();
    if (this.field_encryptUsername == null) {
      this.field_encryptUsername = "";
    }
    if (this.fiG) {
      localContentValues.put("encryptUsername", this.field_encryptUsername);
    }
    if (this.field_conRemark == null) {
      this.field_conRemark = "";
    }
    if (this.fiw) {
      localContentValues.put("conRemark", this.field_conRemark);
    }
    if (this.field_contactLabels == null) {
      this.field_contactLabels = "";
    }
    if (this.fCK) {
      localContentValues.put("contactLabels", this.field_contactLabels);
    }
    if (this.field_conDescription == null) {
      this.field_conDescription = "";
    }
    if (this.fCL) {
      localContentValues.put("conDescription", this.field_conDescription);
    }
    if (this.field_conPhone == null) {
      this.field_conPhone = "";
    }
    if (this.fCM) {
      localContentValues.put("conPhone", this.field_conPhone);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(13343792300032L, 99419);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */