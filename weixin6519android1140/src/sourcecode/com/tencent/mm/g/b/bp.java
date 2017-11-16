package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.t;
import com.tencent.mm.sdk.platformtools.w;

public abstract class bp
  extends c
{
  private static final int eZC;
  public static final String[] eZt;
  private static final int fhk;
  private static final int fqn;
  private static final int fsA;
  private static final int fsp;
  private static final int fsq;
  private static final int fsr;
  private static final int fss;
  private static final int fst;
  private static final int fsu;
  private static final int fsv;
  private static final int fsw;
  private static final int fsx;
  private static final int fsy;
  private static final int fsz;
  public String category;
  private boolean fgR;
  public byte[] field_authBuf;
  public String field_authKey;
  public String field_brandName;
  public int field_closeStrategy;
  public String field_connProto;
  public int field_connStrategy;
  public String field_deviceID;
  public String field_deviceType;
  public byte[] field_lvbuffer;
  public long field_mac;
  public String field_md5Str;
  public byte[] field_sessionBuf;
  public byte[] field_sessionKey;
  public String field_url;
  private boolean fqa;
  public int fsB;
  public int fsC;
  public long fsD;
  private long fsE;
  public String fsF;
  public String fsG;
  public String fsH;
  private int fsI;
  public int fsJ;
  public long fsK;
  public String fsL;
  public String fsM;
  private String fsN;
  public String fsO;
  private boolean fsd;
  private boolean fse;
  private boolean fsf;
  private boolean fsg;
  private boolean fsh;
  private boolean fsi;
  private boolean fsj;
  private boolean fsk;
  private boolean fsl;
  private boolean fsm;
  private boolean fsn;
  public boolean fso;
  public String iconUrl;
  public String jumpUrl;
  
  static
  {
    GMTrace.i(4143703916544L, 30873);
    eZt = new String[0];
    fsp = "deviceID".hashCode();
    fsq = "brandName".hashCode();
    fqn = "mac".hashCode();
    fsr = "deviceType".hashCode();
    fss = "connProto".hashCode();
    fst = "connStrategy".hashCode();
    fsu = "closeStrategy".hashCode();
    fsv = "md5Str".hashCode();
    fsw = "authKey".hashCode();
    fhk = "url".hashCode();
    fsx = "sessionKey".hashCode();
    fsy = "sessionBuf".hashCode();
    fsz = "authBuf".hashCode();
    fsA = "lvbuffer".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4143703916544L, 30873);
  }
  
  public bp()
  {
    GMTrace.i(4141556432896L, 30857);
    this.fsd = true;
    this.fse = true;
    this.fqa = true;
    this.fsf = true;
    this.fsg = true;
    this.fsh = true;
    this.fsi = true;
    this.fsj = true;
    this.fsk = true;
    this.fgR = true;
    this.fsl = true;
    this.fsm = true;
    this.fsn = true;
    this.fso = true;
    GMTrace.o(4141556432896L, 30857);
  }
  
  public final void B(long paramLong)
  {
    GMTrace.i(4143032827904L, 30868);
    this.fsK = paramLong;
    this.fso = true;
    GMTrace.o(4143032827904L, 30868);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4141690650624L, 30858);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4141690650624L, 30858);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fsp == k)
      {
        this.field_deviceID = paramCursor.getString(i);
        this.fsd = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fsq == k) {
          this.field_brandName = paramCursor.getString(i);
        } else if (fqn == k) {
          this.field_mac = paramCursor.getLong(i);
        } else if (fsr == k) {
          this.field_deviceType = paramCursor.getString(i);
        } else if (fss == k) {
          this.field_connProto = paramCursor.getString(i);
        } else if (fst == k) {
          this.field_connStrategy = paramCursor.getInt(i);
        } else if (fsu == k) {
          this.field_closeStrategy = paramCursor.getInt(i);
        } else if (fsv == k) {
          this.field_md5Str = paramCursor.getString(i);
        } else if (fsw == k) {
          this.field_authKey = paramCursor.getString(i);
        } else if (fhk == k) {
          this.field_url = paramCursor.getString(i);
        } else if (fsx == k) {
          this.field_sessionKey = paramCursor.getBlob(i);
        } else if (fsy == k) {
          this.field_sessionBuf = paramCursor.getBlob(i);
        } else if (fsz == k) {
          this.field_authBuf = paramCursor.getBlob(i);
        } else if (fsA == k) {
          this.field_lvbuffer = paramCursor.getBlob(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    try
    {
      if (this.field_lvbuffer != null)
      {
        i = this.field_lvbuffer.length;
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(4141690650624L, 30858);
        return;
      }
      paramCursor = new t();
      i = paramCursor.bl(this.field_lvbuffer);
      if (i != 0)
      {
        w.e("MicroMsg.SDK.BaseHardDeviceInfo", "parse LVBuffer error:" + i);
        GMTrace.o(4141690650624L, 30858);
        return;
      }
      if (!paramCursor.bPB()) {
        this.fsB = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fsC = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fsD = paramCursor.getLong();
      }
      if (!paramCursor.bPB()) {
        this.fsE = paramCursor.getLong();
      }
      if (!paramCursor.bPB()) {
        this.fsF = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.iconUrl = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.jumpUrl = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fsG = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fsH = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.category = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fsI = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fsJ = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fsK = paramCursor.getLong();
      }
      if (!paramCursor.bPB()) {
        this.fsL = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fsM = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fsN = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fsO = paramCursor.getString();
      }
      GMTrace.o(4141690650624L, 30858);
      return;
    }
    catch (Exception paramCursor)
    {
      w.e("MicroMsg.SDK.BaseHardDeviceInfo", "get value failed");
      GMTrace.o(4141690650624L, 30858);
    }
  }
  
  public final void cS(String paramString)
  {
    GMTrace.i(4142093303808L, 30861);
    this.iconUrl = paramString;
    this.fso = true;
    GMTrace.o(4142093303808L, 30861);
  }
  
  public final void cT(String paramString)
  {
    GMTrace.i(4142227521536L, 30862);
    this.jumpUrl = paramString;
    this.fso = true;
    GMTrace.o(4142227521536L, 30862);
  }
  
  public final void cU(String paramString)
  {
    GMTrace.i(4142361739264L, 30863);
    this.fsG = paramString;
    this.fso = true;
    GMTrace.o(4142361739264L, 30863);
  }
  
  public final void cV(String paramString)
  {
    GMTrace.i(4142495956992L, 30864);
    this.fsH = paramString;
    this.fso = true;
    GMTrace.o(4142495956992L, 30864);
  }
  
  public final void cW(String paramString)
  {
    GMTrace.i(4142630174720L, 30865);
    this.category = paramString;
    this.fso = true;
    GMTrace.o(4142630174720L, 30865);
  }
  
  public final void cX(String paramString)
  {
    GMTrace.i(4143167045632L, 30869);
    this.fsL = paramString;
    this.fso = true;
    GMTrace.o(4143167045632L, 30869);
  }
  
  public final void cY(String paramString)
  {
    GMTrace.i(4143301263360L, 30870);
    this.fsM = paramString;
    this.fso = true;
    GMTrace.o(4143301263360L, 30870);
  }
  
  public final void cZ(String paramString)
  {
    GMTrace.i(4143435481088L, 30871);
    this.fsN = paramString;
    this.fso = true;
    GMTrace.o(4143435481088L, 30871);
  }
  
  public final void ci(String paramString)
  {
    GMTrace.i(4141959086080L, 30860);
    this.fsF = paramString;
    this.fso = true;
    GMTrace.o(4141959086080L, 30860);
  }
  
  public final void dJ(int paramInt)
  {
    GMTrace.i(4142764392448L, 30866);
    this.fsI = paramInt;
    this.fso = true;
    GMTrace.o(4142764392448L, 30866);
  }
  
  public final void dK(int paramInt)
  {
    GMTrace.i(4142898610176L, 30867);
    this.fsJ = paramInt;
    this.fso = true;
    GMTrace.o(4142898610176L, 30867);
  }
  
  public final void da(String paramString)
  {
    GMTrace.i(4143569698816L, 30872);
    this.fsO = paramString;
    this.fso = true;
    GMTrace.o(4143569698816L, 30872);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4141824868352L, 30859);
    try
    {
      if (this.fso)
      {
        localObject = new t();
        ((t)localObject).bPC();
        ((t)localObject).Ak(this.fsB);
        ((t)localObject).Ak(this.fsC);
        ((t)localObject).eH(this.fsD);
        ((t)localObject).eH(this.fsE);
        ((t)localObject).RL(this.fsF);
        ((t)localObject).RL(this.iconUrl);
        ((t)localObject).RL(this.jumpUrl);
        ((t)localObject).RL(this.fsG);
        ((t)localObject).RL(this.fsH);
        ((t)localObject).RL(this.category);
        ((t)localObject).Ak(this.fsI);
        ((t)localObject).Ak(this.fsJ);
        ((t)localObject).eH(this.fsK);
        ((t)localObject).RL(this.fsL);
        ((t)localObject).RL(this.fsM);
        ((t)localObject).RL(this.fsN);
        ((t)localObject).RL(this.fsO);
        this.field_lvbuffer = ((t)localObject).bPD();
      }
      Object localObject = new ContentValues();
      if (this.fsd) {
        ((ContentValues)localObject).put("deviceID", this.field_deviceID);
      }
      if (this.fse) {
        ((ContentValues)localObject).put("brandName", this.field_brandName);
      }
      if (this.fqa) {
        ((ContentValues)localObject).put("mac", Long.valueOf(this.field_mac));
      }
      if (this.fsf) {
        ((ContentValues)localObject).put("deviceType", this.field_deviceType);
      }
      if (this.fsg) {
        ((ContentValues)localObject).put("connProto", this.field_connProto);
      }
      if (this.fsh) {
        ((ContentValues)localObject).put("connStrategy", Integer.valueOf(this.field_connStrategy));
      }
      if (this.fsi) {
        ((ContentValues)localObject).put("closeStrategy", Integer.valueOf(this.field_closeStrategy));
      }
      if (this.fsj) {
        ((ContentValues)localObject).put("md5Str", this.field_md5Str);
      }
      if (this.fsk) {
        ((ContentValues)localObject).put("authKey", this.field_authKey);
      }
      if (this.fgR) {
        ((ContentValues)localObject).put("url", this.field_url);
      }
      if (this.fsl) {
        ((ContentValues)localObject).put("sessionKey", this.field_sessionKey);
      }
      if (this.fsm) {
        ((ContentValues)localObject).put("sessionBuf", this.field_sessionBuf);
      }
      if (this.fsn) {
        ((ContentValues)localObject).put("authBuf", this.field_authBuf);
      }
      if (this.fso) {
        ((ContentValues)localObject).put("lvbuffer", this.field_lvbuffer);
      }
      if (this.vmr > 0L) {
        ((ContentValues)localObject).put("rowid", Long.valueOf(this.vmr));
      }
      GMTrace.o(4141824868352L, 30859);
      return (ContentValues)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.BaseHardDeviceInfo", "get value failed, %s", new Object[] { localException.getMessage() });
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\b\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */