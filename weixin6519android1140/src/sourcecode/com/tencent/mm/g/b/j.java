package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class j
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fbX;
  private static final int fbY;
  private static final int fbZ;
  private static final int fbb;
  private static final int fca;
  private boolean faZ;
  private boolean fbT;
  private boolean fbU;
  private boolean fbV;
  private boolean fbW;
  public String field_brandId;
  public int field_recordId;
  public int field_scene;
  public long field_updateTime;
  public int field_versionType;
  
  static
  {
    GMTrace.i(4163433922560L, 31020);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemUpdateTimeIndex ON AppBrandLauncherLayoutItem(updateTime)", "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemSceneIndex ON AppBrandLauncherLayoutItem(scene)" };
    fbX = "recordId".hashCode();
    fbY = "brandId".hashCode();
    fbZ = "versionType".hashCode();
    fca = "updateTime".hashCode();
    fbb = "scene".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4163433922560L, 31020);
  }
  
  public j()
  {
    GMTrace.i(4163031269376L, 31017);
    this.fbT = true;
    this.fbU = true;
    this.fbV = true;
    this.fbW = true;
    this.faZ = true;
    GMTrace.o(4163031269376L, 31017);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4163165487104L, 31018);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4163165487104L, 31018);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbX == k)
      {
        this.field_recordId = paramCursor.getInt(i);
        this.fbT = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fbY == k) {
          this.field_brandId = paramCursor.getString(i);
        } else if (fbZ == k) {
          this.field_versionType = paramCursor.getInt(i);
        } else if (fca == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (fbb == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4163165487104L, 31018);
  }
  
  public ContentValues qL()
  {
    GMTrace.i(4163299704832L, 31019);
    ContentValues localContentValues = new ContentValues();
    if (this.fbT) {
      localContentValues.put("recordId", Integer.valueOf(this.field_recordId));
    }
    if (this.fbU) {
      localContentValues.put("brandId", this.field_brandId);
    }
    if (this.fbV) {
      localContentValues.put("versionType", Integer.valueOf(this.field_versionType));
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.faZ) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4163299704832L, 31019);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */