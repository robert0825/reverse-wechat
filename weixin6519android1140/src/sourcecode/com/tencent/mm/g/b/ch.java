package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class ch
  extends c
{
  private static final int eZC;
  private static final int eZW;
  public static final String[] eZt;
  private static final int fbu;
  private static final int fca;
  private static final int fxA;
  private static final int fxB;
  private static final int fxC;
  private static final int fxD;
  private static final int fxE;
  private static final int fxF;
  private static final int fxG;
  private static final int fxH;
  private static final int fxI;
  private static final int fxJ;
  private static final int fxK;
  private static final int fxL;
  private static final int fxM;
  private static final int fxN;
  private static final int fxO;
  private static final int fxP;
  private static final int fxQ;
  private static final int fxR;
  private static final int fxS;
  private static final int fxT;
  private static final int fxU;
  private static final int fxV;
  private static final int fxW;
  private static final int fxX;
  private static final int fxY;
  private static final int fxZ;
  private static final int fya;
  private static final int fyb;
  private static final int fyc;
  private static final int fyd;
  private boolean eZO;
  private boolean fbW;
  private boolean fbd;
  public String field_appId;
  public long field_downloadedLength;
  public int field_endFlag;
  public boolean field_hideBanner;
  public int field_isBlock;
  public String field_jsWebUrlDomain;
  public String field_mimetype;
  public String field_musicId;
  public int field_musicType;
  public String field_originMusicId;
  public String field_songAlbum;
  public String field_songAlbumLocalPath;
  public int field_songAlbumType;
  public String field_songAlbumUrl;
  public int field_songBgColor;
  public long field_songFileLength;
  public String field_songHAlbumUrl;
  public int field_songId;
  public String field_songLyric;
  public int field_songLyricColor;
  public String field_songMediaId;
  public String field_songName;
  public String field_songSinger;
  public String field_songSnsAlbumUser;
  public String field_songSnsShareUser;
  public String field_songWapLinkUrl;
  public String field_songWebUrl;
  public long field_songWifiFileLength;
  public String field_songWifiUrl;
  public int field_startTime;
  public long field_updateTime;
  public long field_wifiDownloadedLength;
  public int field_wifiEndFlag;
  private boolean fwW;
  private boolean fwX;
  private boolean fwY;
  private boolean fwZ;
  private boolean fxa;
  private boolean fxb;
  private boolean fxc;
  private boolean fxd;
  private boolean fxe;
  private boolean fxf;
  private boolean fxg;
  private boolean fxh;
  private boolean fxi;
  private boolean fxj;
  private boolean fxk;
  private boolean fxl;
  private boolean fxm;
  private boolean fxn;
  private boolean fxo;
  private boolean fxp;
  private boolean fxq;
  private boolean fxr;
  private boolean fxs;
  private boolean fxt;
  private boolean fxu;
  private boolean fxv;
  private boolean fxw;
  private boolean fxx;
  private boolean fxy;
  private boolean fxz;
  
  static
  {
    GMTrace.i(4159138955264L, 30988);
    eZt = new String[0];
    fxA = "musicId".hashCode();
    fxB = "originMusicId".hashCode();
    fxC = "musicType".hashCode();
    fxD = "downloadedLength".hashCode();
    fxE = "wifiDownloadedLength".hashCode();
    fxF = "endFlag".hashCode();
    fxG = "wifiEndFlag".hashCode();
    fca = "updateTime".hashCode();
    fxH = "songId".hashCode();
    fxI = "songName".hashCode();
    fxJ = "songSinger".hashCode();
    fxK = "songAlbum".hashCode();
    fxL = "songAlbumType".hashCode();
    fxM = "songAlbumUrl".hashCode();
    fxN = "songHAlbumUrl".hashCode();
    fxO = "songAlbumLocalPath".hashCode();
    fxP = "songWifiUrl".hashCode();
    fxQ = "songWapLinkUrl".hashCode();
    fxR = "songWebUrl".hashCode();
    fbu = "appId".hashCode();
    fxS = "songMediaId".hashCode();
    fxT = "songSnsAlbumUser".hashCode();
    fxU = "songSnsShareUser".hashCode();
    fxV = "songLyric".hashCode();
    fxW = "songBgColor".hashCode();
    fxX = "songLyricColor".hashCode();
    fxY = "songFileLength".hashCode();
    fxZ = "songWifiFileLength".hashCode();
    fya = "hideBanner".hashCode();
    fyb = "jsWebUrlDomain".hashCode();
    fyc = "isBlock".hashCode();
    eZW = "startTime".hashCode();
    fyd = "mimetype".hashCode();
    eZC = "rowid".hashCode();
    GMTrace.o(4159138955264L, 30988);
  }
  
  public ch()
  {
    GMTrace.i(4158602084352L, 30984);
    this.fwW = true;
    this.fwX = true;
    this.fwY = true;
    this.fwZ = true;
    this.fxa = true;
    this.fxb = true;
    this.fxc = true;
    this.fbW = true;
    this.fxd = true;
    this.fxe = true;
    this.fxf = true;
    this.fxg = true;
    this.fxh = true;
    this.fxi = true;
    this.fxj = true;
    this.fxk = true;
    this.fxl = true;
    this.fxm = true;
    this.fxn = true;
    this.fbd = true;
    this.fxo = true;
    this.fxp = true;
    this.fxq = true;
    this.fxr = true;
    this.fxs = true;
    this.fxt = true;
    this.fxu = true;
    this.fxv = true;
    this.fxw = true;
    this.fxx = true;
    this.fxy = true;
    this.eZO = true;
    this.fxz = true;
    GMTrace.o(4158602084352L, 30984);
  }
  
  public static c.a qM()
  {
    GMTrace.i(4158736302080L, 30985);
    c.a locala = new c.a();
    locala.gZM = new Field[33];
    locala.columns = new String[34];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "musicId";
    locala.vmt.put("musicId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" musicId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "musicId";
    locala.columns[1] = "originMusicId";
    locala.vmt.put("originMusicId", "TEXT");
    localStringBuilder.append(" originMusicId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "musicType";
    locala.vmt.put("musicType", "INTEGER");
    localStringBuilder.append(" musicType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "downloadedLength";
    locala.vmt.put("downloadedLength", "LONG");
    localStringBuilder.append(" downloadedLength LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "wifiDownloadedLength";
    locala.vmt.put("wifiDownloadedLength", "LONG");
    localStringBuilder.append(" wifiDownloadedLength LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "endFlag";
    locala.vmt.put("endFlag", "INTEGER");
    localStringBuilder.append(" endFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "wifiEndFlag";
    locala.vmt.put("wifiEndFlag", "INTEGER");
    localStringBuilder.append(" wifiEndFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "updateTime";
    locala.vmt.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "songId";
    locala.vmt.put("songId", "INTEGER");
    localStringBuilder.append(" songId INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "songName";
    locala.vmt.put("songName", "TEXT");
    localStringBuilder.append(" songName TEXT");
    localStringBuilder.append(", ");
    locala.columns[10] = "songSinger";
    locala.vmt.put("songSinger", "TEXT");
    localStringBuilder.append(" songSinger TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "songAlbum";
    locala.vmt.put("songAlbum", "TEXT");
    localStringBuilder.append(" songAlbum TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "songAlbumType";
    locala.vmt.put("songAlbumType", "INTEGER");
    localStringBuilder.append(" songAlbumType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "songAlbumUrl";
    locala.vmt.put("songAlbumUrl", "TEXT");
    localStringBuilder.append(" songAlbumUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "songHAlbumUrl";
    locala.vmt.put("songHAlbumUrl", "TEXT");
    localStringBuilder.append(" songHAlbumUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "songAlbumLocalPath";
    locala.vmt.put("songAlbumLocalPath", "TEXT");
    localStringBuilder.append(" songAlbumLocalPath TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "songWifiUrl";
    locala.vmt.put("songWifiUrl", "TEXT");
    localStringBuilder.append(" songWifiUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "songWapLinkUrl";
    locala.vmt.put("songWapLinkUrl", "TEXT");
    localStringBuilder.append(" songWapLinkUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "songWebUrl";
    locala.vmt.put("songWebUrl", "TEXT");
    localStringBuilder.append(" songWebUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "songMediaId";
    locala.vmt.put("songMediaId", "TEXT");
    localStringBuilder.append(" songMediaId TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "songSnsAlbumUser";
    locala.vmt.put("songSnsAlbumUser", "TEXT");
    localStringBuilder.append(" songSnsAlbumUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "songSnsShareUser";
    locala.vmt.put("songSnsShareUser", "TEXT");
    localStringBuilder.append(" songSnsShareUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[23] = "songLyric";
    locala.vmt.put("songLyric", "TEXT");
    localStringBuilder.append(" songLyric TEXT");
    localStringBuilder.append(", ");
    locala.columns[24] = "songBgColor";
    locala.vmt.put("songBgColor", "INTEGER");
    localStringBuilder.append(" songBgColor INTEGER");
    localStringBuilder.append(", ");
    locala.columns[25] = "songLyricColor";
    locala.vmt.put("songLyricColor", "INTEGER");
    localStringBuilder.append(" songLyricColor INTEGER");
    localStringBuilder.append(", ");
    locala.columns[26] = "songFileLength";
    locala.vmt.put("songFileLength", "LONG");
    localStringBuilder.append(" songFileLength LONG");
    localStringBuilder.append(", ");
    locala.columns[27] = "songWifiFileLength";
    locala.vmt.put("songWifiFileLength", "LONG");
    localStringBuilder.append(" songWifiFileLength LONG");
    localStringBuilder.append(", ");
    locala.columns[28] = "hideBanner";
    locala.vmt.put("hideBanner", "INTEGER");
    localStringBuilder.append(" hideBanner INTEGER");
    localStringBuilder.append(", ");
    locala.columns[29] = "jsWebUrlDomain";
    locala.vmt.put("jsWebUrlDomain", "TEXT");
    localStringBuilder.append(" jsWebUrlDomain TEXT");
    localStringBuilder.append(", ");
    locala.columns[30] = "isBlock";
    locala.vmt.put("isBlock", "INTEGER");
    localStringBuilder.append(" isBlock INTEGER");
    localStringBuilder.append(", ");
    locala.columns[31] = "startTime";
    locala.vmt.put("startTime", "INTEGER");
    localStringBuilder.append(" startTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[32] = "mimetype";
    locala.vmt.put("mimetype", "TEXT");
    localStringBuilder.append(" mimetype TEXT");
    locala.columns[33] = "rowid";
    locala.vmu = localStringBuilder.toString();
    GMTrace.o(4158736302080L, 30985);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4158870519808L, 30986);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4158870519808L, 30986);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fxA == k)
      {
        this.field_musicId = paramCursor.getString(i);
        this.fwW = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fxB == k)
        {
          this.field_originMusicId = paramCursor.getString(i);
        }
        else if (fxC == k)
        {
          this.field_musicType = paramCursor.getInt(i);
        }
        else if (fxD == k)
        {
          this.field_downloadedLength = paramCursor.getLong(i);
        }
        else if (fxE == k)
        {
          this.field_wifiDownloadedLength = paramCursor.getLong(i);
        }
        else if (fxF == k)
        {
          this.field_endFlag = paramCursor.getInt(i);
        }
        else if (fxG == k)
        {
          this.field_wifiEndFlag = paramCursor.getInt(i);
        }
        else if (fca == k)
        {
          this.field_updateTime = paramCursor.getLong(i);
        }
        else if (fxH == k)
        {
          this.field_songId = paramCursor.getInt(i);
        }
        else if (fxI == k)
        {
          this.field_songName = paramCursor.getString(i);
        }
        else if (fxJ == k)
        {
          this.field_songSinger = paramCursor.getString(i);
        }
        else if (fxK == k)
        {
          this.field_songAlbum = paramCursor.getString(i);
        }
        else if (fxL == k)
        {
          this.field_songAlbumType = paramCursor.getInt(i);
        }
        else if (fxM == k)
        {
          this.field_songAlbumUrl = paramCursor.getString(i);
        }
        else if (fxN == k)
        {
          this.field_songHAlbumUrl = paramCursor.getString(i);
        }
        else if (fxO == k)
        {
          this.field_songAlbumLocalPath = paramCursor.getString(i);
        }
        else if (fxP == k)
        {
          this.field_songWifiUrl = paramCursor.getString(i);
        }
        else if (fxQ == k)
        {
          this.field_songWapLinkUrl = paramCursor.getString(i);
        }
        else if (fxR == k)
        {
          this.field_songWebUrl = paramCursor.getString(i);
        }
        else if (fbu == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else if (fxS == k)
        {
          this.field_songMediaId = paramCursor.getString(i);
        }
        else if (fxT == k)
        {
          this.field_songSnsAlbumUser = paramCursor.getString(i);
        }
        else if (fxU == k)
        {
          this.field_songSnsShareUser = paramCursor.getString(i);
        }
        else if (fxV == k)
        {
          this.field_songLyric = paramCursor.getString(i);
        }
        else if (fxW == k)
        {
          this.field_songBgColor = paramCursor.getInt(i);
        }
        else if (fxX == k)
        {
          this.field_songLyricColor = paramCursor.getInt(i);
        }
        else if (fxY == k)
        {
          this.field_songFileLength = paramCursor.getLong(i);
        }
        else if (fxZ == k)
        {
          this.field_songWifiFileLength = paramCursor.getLong(i);
        }
        else
        {
          if (fya == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_hideBanner = bool;
              break;
            }
          }
          if (fyb == k) {
            this.field_jsWebUrlDomain = paramCursor.getString(i);
          } else if (fyc == k) {
            this.field_isBlock = paramCursor.getInt(i);
          } else if (eZW == k) {
            this.field_startTime = paramCursor.getInt(i);
          } else if (fyd == k) {
            this.field_mimetype = paramCursor.getString(i);
          } else if (eZC == k) {
            this.vmr = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4158870519808L, 30986);
  }
  
  public final ContentValues qL()
  {
    GMTrace.i(4159004737536L, 30987);
    ContentValues localContentValues = new ContentValues();
    if (this.fwW) {
      localContentValues.put("musicId", this.field_musicId);
    }
    if (this.fwX) {
      localContentValues.put("originMusicId", this.field_originMusicId);
    }
    if (this.fwY) {
      localContentValues.put("musicType", Integer.valueOf(this.field_musicType));
    }
    if (this.fwZ) {
      localContentValues.put("downloadedLength", Long.valueOf(this.field_downloadedLength));
    }
    if (this.fxa) {
      localContentValues.put("wifiDownloadedLength", Long.valueOf(this.field_wifiDownloadedLength));
    }
    if (this.fxb) {
      localContentValues.put("endFlag", Integer.valueOf(this.field_endFlag));
    }
    if (this.fxc) {
      localContentValues.put("wifiEndFlag", Integer.valueOf(this.field_wifiEndFlag));
    }
    if (this.fbW) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.fxd) {
      localContentValues.put("songId", Integer.valueOf(this.field_songId));
    }
    if (this.fxe) {
      localContentValues.put("songName", this.field_songName);
    }
    if (this.fxf) {
      localContentValues.put("songSinger", this.field_songSinger);
    }
    if (this.fxg) {
      localContentValues.put("songAlbum", this.field_songAlbum);
    }
    if (this.fxh) {
      localContentValues.put("songAlbumType", Integer.valueOf(this.field_songAlbumType));
    }
    if (this.fxi) {
      localContentValues.put("songAlbumUrl", this.field_songAlbumUrl);
    }
    if (this.fxj) {
      localContentValues.put("songHAlbumUrl", this.field_songHAlbumUrl);
    }
    if (this.fxk) {
      localContentValues.put("songAlbumLocalPath", this.field_songAlbumLocalPath);
    }
    if (this.fxl) {
      localContentValues.put("songWifiUrl", this.field_songWifiUrl);
    }
    if (this.fxm) {
      localContentValues.put("songWapLinkUrl", this.field_songWapLinkUrl);
    }
    if (this.fxn) {
      localContentValues.put("songWebUrl", this.field_songWebUrl);
    }
    if (this.fbd) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fxo) {
      localContentValues.put("songMediaId", this.field_songMediaId);
    }
    if (this.fxp) {
      localContentValues.put("songSnsAlbumUser", this.field_songSnsAlbumUser);
    }
    if (this.fxq) {
      localContentValues.put("songSnsShareUser", this.field_songSnsShareUser);
    }
    if (this.fxr) {
      localContentValues.put("songLyric", this.field_songLyric);
    }
    if (this.fxs) {
      localContentValues.put("songBgColor", Integer.valueOf(this.field_songBgColor));
    }
    if (this.fxt) {
      localContentValues.put("songLyricColor", Integer.valueOf(this.field_songLyricColor));
    }
    if (this.fxu) {
      localContentValues.put("songFileLength", Long.valueOf(this.field_songFileLength));
    }
    if (this.fxv) {
      localContentValues.put("songWifiFileLength", Long.valueOf(this.field_songWifiFileLength));
    }
    if (this.fxw) {
      localContentValues.put("hideBanner", Boolean.valueOf(this.field_hideBanner));
    }
    if (this.fxx) {
      localContentValues.put("jsWebUrlDomain", this.field_jsWebUrlDomain);
    }
    if (this.fxy) {
      localContentValues.put("isBlock", Integer.valueOf(this.field_isBlock));
    }
    if (this.eZO) {
      localContentValues.put("startTime", Integer.valueOf(this.field_startTime));
    }
    if (this.fxz) {
      localContentValues.put("mimetype", this.field_mimetype);
    }
    if (this.vmr > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.vmr));
    }
    GMTrace.o(4159004737536L, 30987);
    return localContentValues;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\b\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */