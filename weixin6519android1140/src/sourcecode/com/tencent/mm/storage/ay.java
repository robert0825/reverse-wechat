package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class ay
{
  int eQl;
  public String name;
  int status;
  public a vCe;
  public int vCf;
  
  public ay()
  {
    GMTrace.i(13307016642560L, 99145);
    this.eQl = 135;
    this.name = "";
    this.vCe = null;
    this.vCe = null;
    this.name = "";
    this.status = 0;
    this.vCf = 0;
    GMTrace.o(13307016642560L, 99145);
  }
  
  public ay(String paramString, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(13307150860288L, 99146);
    this.eQl = 135;
    this.name = "";
    this.vCe = null;
    this.vCe = new a(paramString);
    this.name = paramString;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.status = (i | 0x2);
      this.vCf = paramInt;
      GMTrace.o(13307150860288L, 99146);
      return;
    }
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(13307687731200L, 99150);
    if ((this.eQl & 0x2) != 0)
    {
      this.name = paramCursor.getString(1);
      if (this.vCe == null) {
        this.vCe = new a(this.name);
      }
    }
    if ((this.eQl & 0x4) != 0) {
      this.status = paramCursor.getInt(2);
    }
    if ((this.eQl & 0x80) != 0) {
      this.vCf = paramCursor.getInt(7);
    }
    GMTrace.o(13307687731200L, 99150);
  }
  
  public final boolean bUo()
  {
    GMTrace.i(13307553513472L, 99149);
    if ((this.status & 0x2) != 0)
    {
      GMTrace.o(13307553513472L, 99149);
      return true;
    }
    GMTrace.o(13307553513472L, 99149);
    return false;
  }
  
  public final void fv(boolean paramBoolean)
  {
    GMTrace.i(13307285078016L, 99147);
    if (paramBoolean)
    {
      int j = this.status;
      if (paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        this.status = (i | j);
        GMTrace.o(13307285078016L, 99147);
        return;
      }
    }
    this.status &= 0xFFFFFFFE;
    GMTrace.o(13307285078016L, 99147);
  }
  
  public final boolean isEnable()
  {
    GMTrace.i(13307419295744L, 99148);
    if ((this.status & 0x1) != 0)
    {
      GMTrace.o(13307419295744L, 99148);
      return true;
    }
    GMTrace.o(13307419295744L, 99148);
    return false;
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(13307821948928L, 99151);
    ContentValues localContentValues = new ContentValues();
    if ((this.eQl & 0x2) != 0) {
      localContentValues.put("name", this.name);
    }
    if ((this.eQl & 0x4) != 0) {
      localContentValues.put("status", Integer.valueOf(this.status));
    }
    if ((this.eQl & 0x80) != 0) {
      localContentValues.put("int_reserved1", Integer.valueOf(this.vCf));
    }
    GMTrace.o(13307821948928L, 99151);
    return localContentValues;
  }
  
  public static final class a
  {
    private String eQu;
    private String eYR;
    
    public a(String paramString)
    {
      GMTrace.i(13303795417088L, 99121);
      int i = paramString.indexOf("@");
      if (i >= 0)
      {
        this.eQu = paramString.substring(0, i);
        this.eYR = paramString.substring(i);
        GMTrace.o(13303795417088L, 99121);
        return;
      }
      this.eQu = paramString;
      this.eYR = "";
      GMTrace.o(13303795417088L, 99121);
    }
    
    public final String Ux(String paramString)
    {
      GMTrace.i(13303929634816L, 99122);
      if (this.eYR != null)
      {
        paramString = this.eYR;
        GMTrace.o(13303929634816L, 99122);
        return paramString;
      }
      GMTrace.o(13303929634816L, 99122);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */