package com.tencent.mm.at;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ch;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;

public final class a
  extends ch
{
  public static c.a fTp;
  public String gOO;
  
  static
  {
    GMTrace.i(4410394542080L, 32860);
    fTp = ch.qM();
    GMTrace.o(4410394542080L, 32860);
  }
  
  public a()
  {
    GMTrace.i(4409455017984L, 32853);
    GMTrace.o(4409455017984L, 32853);
  }
  
  public final boolean JL()
  {
    GMTrace.i(4409723453440L, 32855);
    if ((this.field_songBgColor != 0) && (this.field_songLyricColor != 0))
    {
      GMTrace.o(4409723453440L, 32855);
      return true;
    }
    GMTrace.o(4409723453440L, 32855);
    return false;
  }
  
  public final boolean JM()
  {
    GMTrace.i(4409857671168L, 32856);
    if (!bg.nm(this.field_songHAlbumUrl))
    {
      GMTrace.o(4409857671168L, 32856);
      return true;
    }
    GMTrace.o(4409857671168L, 32856);
    return false;
  }
  
  public final apv JN()
  {
    GMTrace.i(4410260324352L, 32859);
    apv localapv = new apv();
    localapv.ucY = this.field_originMusicId;
    localapv.uFq = this.field_musicType;
    localapv.lQa = this.field_appId;
    localapv.uFu = this.field_songAlbum;
    localapv.uFC = this.field_songAlbumType;
    localapv.uFv = this.field_songAlbumUrl;
    localapv.uFw = this.field_songWifiUrl;
    localapv.uFs = this.field_songName;
    localapv.uFt = this.field_songSinger;
    localapv.uFx = this.field_songWapLinkUrl;
    localapv.uFy = this.field_songWebUrl;
    localapv.uFA = this.field_songAlbumLocalPath;
    localapv.ugf = this.field_songMediaId;
    localapv.uFG = this.field_songSnsAlbumUser;
    localapv.uFH = this.field_songSnsShareUser;
    localapv.uFJ = this.field_hideBanner;
    localapv.uFK = this.field_jsWebUrlDomain;
    localapv.grQ = this.field_startTime;
    localapv.gOO = this.gOO;
    GMTrace.o(4410260324352L, 32859);
    return localapv;
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(4410126106624L, 32858);
    if (parama == null)
    {
      GMTrace.o(4410126106624L, 32858);
      return false;
    }
    boolean bool = this.field_musicId.equals(parama.field_musicId);
    GMTrace.o(4410126106624L, 32858);
    return bool;
  }
  
  public final boolean e(int[] paramArrayOfInt)
  {
    GMTrace.i(4409991888896L, 32857);
    if ((this.field_songBgColor == paramArrayOfInt[0]) && (this.field_songLyricColor == paramArrayOfInt[1]))
    {
      GMTrace.o(4409991888896L, 32857);
      return true;
    }
    GMTrace.o(4409991888896L, 32857);
    return false;
  }
  
  protected final c.a uw()
  {
    GMTrace.i(4409589235712L, 32854);
    c.a locala = fTp;
    GMTrace.o(4409589235712L, 32854);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\at\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */