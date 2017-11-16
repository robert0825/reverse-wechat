package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.t;
import com.tencent.mm.sdk.platformtools.w;

public abstract class n
  extends c
{
  private static final int eZC;
  private static final int eZI;
  public static final String[] eZt;
  private static final int fbI;
  private static final int fbu;
  private static final int fcs;
  private static final int fdA;
  private static final int fdB;
  private static final int fdC;
  private static final int fdD;
  private static final int fdE;
  private static final int fdF;
  private static final int fdG;
  private static final int fdH;
  private static final int fdI;
  private static final int fdn;
  private static final int fdo;
  private static final int fdp;
  private static final int fdq;
  private static final int fdr;
  private static final int fds;
  private static final int fdt;
  private static final int fdu;
  private static final int fdv;
  private static final int fdw;
  private static final int fdx;
  private static final int fdy;
  private static final int fdz;
  private boolean eZF;
  private boolean fbd;
  private boolean fbr;
  private boolean fcR;
  private boolean fcS;
  private boolean fcT;
  private boolean fcU;
  private boolean fcV;
  private boolean fcW;
  private boolean fcX;
  private boolean fcY;
  private boolean fcZ;
  private boolean fcf;
  public String fdJ;
  public String fdK;
  public String fdL;
  public int fdM;
  public int fdN;
  public String fdO;
  public String fdP;
  public String fdQ;
  public String fdR;
  public String fdS;
  public String fdT;
  public int fdU;
  public String fdV;
  public String fdW;
  public String fdX;
  public String fdY;
  public String fdZ;
  private boolean fda;
  private boolean fdb;
  private boolean fdc;
  private boolean fdd;
  private boolean fde;
  private boolean fdf;
  private boolean fdg;
  public boolean fdh;
  private boolean fdi;
  private boolean fdj;
  private boolean fdk;
  private boolean fdl;
  private boolean fdm;
  public int fea;
  public String feb;
  private int fec;
  public String fed;
  public String fee;
  public String fef;
  public int feg;
  public String field_appDiscription;
  public String field_appDiscription_en;
  public String field_appDiscription_tw;
  public String field_appIconUrl;
  public String field_appId;
  public int field_appInfoFlag;
  public String field_appName;
  public String field_appName_en;
  public String field_appName_hk;
  public String field_appName_tw;
  public String field_appStoreUrl;
  public long field_appSupportContentType;
  public String field_appType;
  public int field_appVersion;
  public String field_appWatermarkUrl;
  public int field_authFlag;
  public byte[] field_lvbuff;
  public long field_modifyTime;
  public String field_openId;
  public String field_packageName;
  public int field_serviceAppInfoFlag;
  public int field_serviceAppType;
  public int field_serviceShowFlag;
  public String field_signature;
  public int field_status;
  public long field_svrAppSupportContentType;
  
  static
  {
    GMTrace.i(4179003179008L, 31136);
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS appInfo_status_Index ON AppInfo(status)" };
    fbu = "appId".hashCode();
    fcs = "appName".hashCode();
    fdn = "appDiscription".hashCode();
    fdo = "appIconUrl".hashCode();
    fdp = "appStoreUrl".hashCode();
    fdq = "appVersion".hashCode();
    fdr = "appWatermarkUrl".hashCode();
    fds = "packageName".hashCode();
    eZI = "status".hashCode();
    fbI = "signature".hashCode();
    fdt = "modifyTime".hashCode();
    fdu = "appName_en".hashCode();
    fdv = "appName_tw".hashCode();
    fdw = "appName_hk".hashCode();
    fdx = "appDiscription_en".hashCode();
    fdy = "appDiscription_tw".hashCode();
    fdz = "appType".hashCode();
    fdA = "openId".hashCode();
    fdB = "authFlag".hashCode();
    fdC = "appInfoFlag".hashCode();
    fdD = "lvbuff".hashCode();
    fdE = "serviceAppType".hashCode();
    fdF = "serviceAppInfoFlag".hashCode();
    fdG = "serviceShowFlag".hashCode();
    fdH = "appSupportContentType".hashCode();
    fdI = "svrAppSupportContentType".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4179003179008L, 31136);
  }
  
  public n()
  {
    GMTrace.i(4176184606720L, 31115);
    this.fbd = true;
    this.fcf = true;
    this.fcR = true;
    this.fcS = true;
    this.fcT = true;
    this.fcU = true;
    this.fcV = true;
    this.fcW = true;
    this.eZF = true;
    this.fbr = true;
    this.fcX = true;
    this.fcY = true;
    this.fcZ = true;
    this.fda = true;
    this.fdb = true;
    this.fdc = true;
    this.fdd = true;
    this.fde = true;
    this.fdf = true;
    this.fdg = true;
    this.fdh = true;
    this.fdi = true;
    this.fdj = true;
    this.fdk = true;
    this.fdl = true;
    this.fdm = true;
    GMTrace.o(4176184606720L, 31115);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4176318824448L, 31116);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4176318824448L, 31116);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fbu == k)
      {
        this.field_appId = paramCursor.getString(i);
        this.fbd = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fcs == k) {
          this.field_appName = paramCursor.getString(i);
        } else if (fdn == k) {
          this.field_appDiscription = paramCursor.getString(i);
        } else if (fdo == k) {
          this.field_appIconUrl = paramCursor.getString(i);
        } else if (fdp == k) {
          this.field_appStoreUrl = paramCursor.getString(i);
        } else if (fdq == k) {
          this.field_appVersion = paramCursor.getInt(i);
        } else if (fdr == k) {
          this.field_appWatermarkUrl = paramCursor.getString(i);
        } else if (fds == k) {
          this.field_packageName = paramCursor.getString(i);
        } else if (eZI == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fbI == k) {
          this.field_signature = paramCursor.getString(i);
        } else if (fdt == k) {
          this.field_modifyTime = paramCursor.getLong(i);
        } else if (fdu == k) {
          this.field_appName_en = paramCursor.getString(i);
        } else if (fdv == k) {
          this.field_appName_tw = paramCursor.getString(i);
        } else if (fdw == k) {
          this.field_appName_hk = paramCursor.getString(i);
        } else if (fdx == k) {
          this.field_appDiscription_en = paramCursor.getString(i);
        } else if (fdy == k) {
          this.field_appDiscription_tw = paramCursor.getString(i);
        } else if (fdz == k) {
          this.field_appType = paramCursor.getString(i);
        } else if (fdA == k) {
          this.field_openId = paramCursor.getString(i);
        } else if (fdB == k) {
          this.field_authFlag = paramCursor.getInt(i);
        } else if (fdC == k) {
          this.field_appInfoFlag = paramCursor.getInt(i);
        } else if (fdD == k) {
          this.field_lvbuff = paramCursor.getBlob(i);
        } else if (fdE == k) {
          this.field_serviceAppType = paramCursor.getInt(i);
        } else if (fdF == k) {
          this.field_serviceAppInfoFlag = paramCursor.getInt(i);
        } else if (fdG == k) {
          this.field_serviceShowFlag = paramCursor.getInt(i);
        } else if (fdH == k) {
          this.field_appSupportContentType = paramCursor.getLong(i);
        } else if (fdI == k) {
          this.field_svrAppSupportContentType = paramCursor.getLong(i);
        } else if (eZC == k) {
          this.vmr = paramCursor.getLong(i);
        }
      }
    }
    try
    {
      if (this.field_lvbuff != null)
      {
        i = this.field_lvbuff.length;
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(4176318824448L, 31116);
        return;
      }
      paramCursor = new t();
      i = paramCursor.bl(this.field_lvbuff);
      if (i != 0)
      {
        w.e("MicroMsg.SDK.BaseAppInfo", "parse LVBuffer error:" + i);
        GMTrace.o(4176318824448L, 31116);
        return;
      }
      this.fdJ = paramCursor.getString();
      this.fdK = paramCursor.getString();
      this.fdL = paramCursor.getString();
      this.fdM = paramCursor.getInt();
      this.fdN = paramCursor.getInt();
      this.fdO = paramCursor.getString();
      this.fdP = paramCursor.getString();
      this.fdQ = paramCursor.getString();
      this.fdR = paramCursor.getString();
      if (!paramCursor.bPB()) {
        this.fdS = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fdT = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fdU = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fdV = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fdW = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fdX = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fdY = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fdZ = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fea = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.feb = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fec = paramCursor.getInt();
      }
      if (!paramCursor.bPB()) {
        this.fed = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fee = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.fef = paramCursor.getString();
      }
      if (!paramCursor.bPB()) {
        this.feg = paramCursor.getInt();
      }
      GMTrace.o(4176318824448L, 31116);
      return;
    }
    catch (Exception paramCursor)
    {
      w.e("MicroMsg.SDK.BaseAppInfo", "get value failed");
      GMTrace.o(4176318824448L, 31116);
    }
  }
  
  public final void bV(String paramString)
  {
    GMTrace.i(4176587259904L, 31118);
    this.fdJ = paramString;
    this.fdh = true;
    GMTrace.o(4176587259904L, 31118);
  }
  
  public final void bW(String paramString)
  {
    GMTrace.i(4176721477632L, 31119);
    this.fdK = paramString;
    this.fdh = true;
    GMTrace.o(4176721477632L, 31119);
  }
  
  public final void bX(String paramString)
  {
    GMTrace.i(4176989913088L, 31121);
    this.fdL = paramString;
    this.fdh = true;
    GMTrace.o(4176989913088L, 31121);
  }
  
  public final void bY(String paramString)
  {
    GMTrace.i(4177124130816L, 31122);
    this.fdO = paramString;
    this.fdh = true;
    GMTrace.o(4177124130816L, 31122);
  }
  
  public final void bZ(String paramString)
  {
    GMTrace.i(4177258348544L, 31123);
    this.fdP = paramString;
    this.fdh = true;
    GMTrace.o(4177258348544L, 31123);
  }
  
  public final void ca(String paramString)
  {
    GMTrace.i(4177526784000L, 31125);
    this.fdQ = paramString;
    this.fdh = true;
    GMTrace.o(4177526784000L, 31125);
  }
  
  public final void cb(String paramString)
  {
    GMTrace.i(4177795219456L, 31127);
    this.fdR = paramString;
    this.fdh = true;
    GMTrace.o(4177795219456L, 31127);
  }
  
  public final void cc(String paramString)
  {
    GMTrace.i(4177929437184L, 31128);
    this.fdS = paramString;
    this.fdh = true;
    GMTrace.o(4177929437184L, 31128);
  }
  
  public final void cd(String paramString)
  {
    GMTrace.i(4178063654912L, 31129);
    this.fdT = paramString;
    this.fdh = true;
    GMTrace.o(4178063654912L, 31129);
  }
  
  public final void ce(String paramString)
  {
    GMTrace.i(4178332090368L, 31131);
    this.fdV = paramString;
    this.fdh = true;
    GMTrace.o(4178332090368L, 31131);
  }
  
  public final void cf(String paramString)
  {
    GMTrace.i(4178466308096L, 31132);
    this.fdW = paramString;
    this.fdh = true;
    GMTrace.o(4178466308096L, 31132);
  }
  
  public final void cg(String paramString)
  {
    GMTrace.i(4178600525824L, 31133);
    this.fdX = paramString;
    this.fdh = true;
    GMTrace.o(4178600525824L, 31133);
  }
  
  public final void ch(String paramString)
  {
    GMTrace.i(4178734743552L, 31134);
    this.fdY = paramString;
    this.fdh = true;
    GMTrace.o(4178734743552L, 31134);
  }
  
  public final void dg(int paramInt)
  {
    GMTrace.i(4178197872640L, 31130);
    this.fdU = paramInt;
    this.fdh = true;
    GMTrace.o(4178197872640L, 31130);
  }
  
  public final void dh(int paramInt)
  {
    GMTrace.i(4178868961280L, 31135);
    this.fea = paramInt;
    this.fdh = true;
    GMTrace.o(4178868961280L, 31135);
  }
  
  public ContentValues qL()
  {
    GMTrace.i(4176453042176L, 31117);
    try
    {
      if (this.fdh)
      {
        localObject = new t();
        ((t)localObject).bPC();
        ((t)localObject).RL(this.fdJ);
        ((t)localObject).RL(this.fdK);
        ((t)localObject).RL(this.fdL);
        ((t)localObject).Ak(this.fdM);
        ((t)localObject).Ak(this.fdN);
        ((t)localObject).RL(this.fdO);
        ((t)localObject).RL(this.fdP);
        ((t)localObject).RL(this.fdQ);
        ((t)localObject).RL(this.fdR);
        ((t)localObject).RL(this.fdS);
        ((t)localObject).RL(this.fdT);
        ((t)localObject).Ak(this.fdU);
        ((t)localObject).RL(this.fdV);
        ((t)localObject).RL(this.fdW);
        ((t)localObject).RL(this.fdX);
        ((t)localObject).RL(this.fdY);
        ((t)localObject).RL(this.fdZ);
        ((t)localObject).Ak(this.fea);
        ((t)localObject).RL(this.feb);
        ((t)localObject).Ak(this.fec);
        ((t)localObject).RL(this.fed);
        ((t)localObject).RL(this.fee);
        ((t)localObject).RL(this.fef);
        ((t)localObject).Ak(this.feg);
        this.field_lvbuff = ((t)localObject).bPD();
      }
      Object localObject = new ContentValues();
      if (this.field_appId == null) {
        this.field_appId = "";
      }
      if (this.fbd) {
        ((ContentValues)localObject).put("appId", this.field_appId);
      }
      if (this.fcf) {
        ((ContentValues)localObject).put("appName", this.field_appName);
      }
      if (this.fcR) {
        ((ContentValues)localObject).put("appDiscription", this.field_appDiscription);
      }
      if (this.fcS) {
        ((ContentValues)localObject).put("appIconUrl", this.field_appIconUrl);
      }
      if (this.fcT) {
        ((ContentValues)localObject).put("appStoreUrl", this.field_appStoreUrl);
      }
      if (this.fcU) {
        ((ContentValues)localObject).put("appVersion", Integer.valueOf(this.field_appVersion));
      }
      if (this.fcV) {
        ((ContentValues)localObject).put("appWatermarkUrl", this.field_appWatermarkUrl);
      }
      if (this.fcW) {
        ((ContentValues)localObject).put("packageName", this.field_packageName);
      }
      if (this.eZF) {
        ((ContentValues)localObject).put("status", Integer.valueOf(this.field_status));
      }
      if (this.fbr) {
        ((ContentValues)localObject).put("signature", this.field_signature);
      }
      if (this.fcX) {
        ((ContentValues)localObject).put("modifyTime", Long.valueOf(this.field_modifyTime));
      }
      if (this.fcY) {
        ((ContentValues)localObject).put("appName_en", this.field_appName_en);
      }
      if (this.fcZ) {
        ((ContentValues)localObject).put("appName_tw", this.field_appName_tw);
      }
      if (this.fda) {
        ((ContentValues)localObject).put("appName_hk", this.field_appName_hk);
      }
      if (this.fdb) {
        ((ContentValues)localObject).put("appDiscription_en", this.field_appDiscription_en);
      }
      if (this.fdc) {
        ((ContentValues)localObject).put("appDiscription_tw", this.field_appDiscription_tw);
      }
      if (this.fdd) {
        ((ContentValues)localObject).put("appType", this.field_appType);
      }
      if (this.fde) {
        ((ContentValues)localObject).put("openId", this.field_openId);
      }
      if (this.fdf) {
        ((ContentValues)localObject).put("authFlag", Integer.valueOf(this.field_authFlag));
      }
      if (this.fdg) {
        ((ContentValues)localObject).put("appInfoFlag", Integer.valueOf(this.field_appInfoFlag));
      }
      if (this.fdh) {
        ((ContentValues)localObject).put("lvbuff", this.field_lvbuff);
      }
      if (this.fdi) {
        ((ContentValues)localObject).put("serviceAppType", Integer.valueOf(this.field_serviceAppType));
      }
      if (this.fdj) {
        ((ContentValues)localObject).put("serviceAppInfoFlag", Integer.valueOf(this.field_serviceAppInfoFlag));
      }
      if (this.fdk) {
        ((ContentValues)localObject).put("serviceShowFlag", Integer.valueOf(this.field_serviceShowFlag));
      }
      if (this.fdl) {
        ((ContentValues)localObject).put("appSupportContentType", Long.valueOf(this.field_appSupportContentType));
      }
      if (this.fdm) {
        ((ContentValues)localObject).put("svrAppSupportContentType", Long.valueOf(this.field_svrAppSupportContentType));
      }
      if (this.vmr > 0L) {
        ((ContentValues)localObject).put("rowid", Long.valueOf(this.vmr));
      }
      GMTrace.o(4176453042176L, 31117);
      return (ContentValues)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.BaseAppInfo", "get value failed, %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public final String qN()
  {
    GMTrace.i(4176855695360L, 31120);
    String str = this.fdL;
    GMTrace.o(4176855695360L, 31120);
    return str;
  }
  
  public final String qO()
  {
    GMTrace.i(4177392566272L, 31124);
    String str = this.fdQ;
    GMTrace.o(4177392566272L, 31124);
    return str;
  }
  
  public final String qP()
  {
    GMTrace.i(4177661001728L, 31126);
    String str = this.fdR;
    GMTrace.o(4177661001728L, 31126);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */