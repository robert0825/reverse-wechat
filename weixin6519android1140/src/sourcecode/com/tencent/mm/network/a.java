package com.tencent.mm.network;

import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.t;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.av;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class a
  extends d.a
  implements c
{
  private boolean foreground;
  byte[] gvf;
  private byte[] hge;
  private a hgf;
  byte[] hgg;
  String hgh;
  private Map<String, byte[]> hgi;
  private int uin;
  String username;
  
  public a(a parama)
  {
    GMTrace.i(13665243758592L, 101814);
    this.hgf = null;
    this.foreground = true;
    this.hgi = new HashMap();
    this.hgf = parama;
    Ov();
    GMTrace.o(13665243758592L, 101814);
  }
  
  private void Ov()
  {
    GMTrace.i(13665512194048L, 101816);
    this.gvf = bg.St(av.AX().getString("server_id", ""));
    GMTrace.o(13665512194048L, 101816);
  }
  
  private String Ow()
  {
    GMTrace.i(13668062330880L, 101835);
    try
    {
      Object localObject = ByteBuffer.allocate(4096);
      ((ByteBuffer)localObject).put(this.hge).put(this.hgg).put(this.gvf).putInt(this.uin).put(this.hgh.getBytes()).put(this.username.getBytes());
      localObject = g.n(((ByteBuffer)localObject).array());
      GMTrace.o(13668062330880L, 101835);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      GMTrace.o(13668062330880L, 101835);
    }
    return "";
  }
  
  private void clear()
  {
    GMTrace.i(13667928113152L, 101834);
    this.username = null;
    this.hge = null;
    this.gvf = null;
    this.uin = 0;
    this.hgg = null;
    this.hgh = null;
    GMTrace.o(13667928113152L, 101834);
  }
  
  public final int A(byte[] paramArrayOfByte)
  {
    GMTrace.i(13668330766336L, 101837);
    long l = bg.Pv();
    if (DU())
    {
      w.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : isLogin == true ");
      GMTrace.o(13668330766336L, 101837);
      return -2;
    }
    try
    {
      t localt = new t();
      int i = localt.bl(paramArrayOfByte);
      if (i != 0)
      {
        w.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : initParse: %s", new Object[] { Integer.valueOf(i) });
        GMTrace.o(13668330766336L, 101837);
        return -3;
      }
      this.username = localt.getString();
      this.hgh = localt.getString();
      this.uin = localt.getInt();
      this.gvf = localt.getBuffer();
      this.hgg = localt.getBuffer();
      this.hge = localt.getBuffer();
      paramArrayOfByte = localt.getString();
      if ((bg.nm(paramArrayOfByte)) || (!paramArrayOfByte.equals(Ow())))
      {
        clear();
        w.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : checksum failed");
        GMTrace.o(13668330766336L, 101837);
        return -4;
      }
      w.i("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf finish time:%s  md5:%s", new Object[] { Long.valueOf(bg.aH(l)), paramArrayOfByte });
      GMTrace.o(13668330766336L, 101837);
      return 0;
    }
    catch (Exception paramArrayOfByte)
    {
      clear();
      w.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", new Object[] { bg.f(paramArrayOfByte) });
      GMTrace.o(13668330766336L, 101837);
    }
    return -5;
  }
  
  public final byte[] DT()
  {
    GMTrace.i(13666451718144L, 101823);
    byte[] arrayOfByte = this.gvf;
    GMTrace.o(13666451718144L, 101823);
    return arrayOfByte;
  }
  
  public final boolean DU()
  {
    GMTrace.i(13666854371328L, 101826);
    if ((this.hge != null) && (this.hge.length > 0))
    {
      GMTrace.o(13666854371328L, 101826);
      return true;
    }
    GMTrace.o(13666854371328L, 101826);
    return false;
  }
  
  public final byte[] DV()
  {
    GMTrace.i(13666317500416L, 101822);
    byte[] arrayOfByte = this.hgg;
    GMTrace.o(13666317500416L, 101822);
    return arrayOfByte;
  }
  
  public final boolean DW()
  {
    GMTrace.i(13667659677696L, 101832);
    boolean bool = this.foreground;
    GMTrace.o(13667659677696L, 101832);
    return bool;
  }
  
  public final byte[] DX()
  {
    GMTrace.i(13668196548608L, 101836);
    long l = bg.Pv();
    int i;
    if (bg.nm(this.username)) {
      i = 0;
    }
    while (i == 0)
    {
      w.e("MicroMsg.AccInfo", "AccInfoCacheInWorker getCacheBuffer Error : isCacheValid== false");
      GMTrace.o(13668196548608L, 101836);
      return null;
      if (bg.bq(this.hge)) {
        i = 0;
      } else if (bg.bq(this.gvf)) {
        i = 0;
      } else if ((this.uin == 0) || (this.uin == -1)) {
        i = 0;
      } else if (bg.bq(this.hgg)) {
        i = 0;
      } else if (bg.nm(this.hgh)) {
        i = 0;
      } else {
        i = 1;
      }
    }
    try
    {
      Object localObject = new t();
      ((t)localObject).bPC();
      ((t)localObject).RL(this.username);
      ((t)localObject).RL(this.hgh);
      ((t)localObject).Ak(this.uin);
      ((t)localObject).bm(this.gvf);
      ((t)localObject).bm(this.hgg);
      ((t)localObject).bm(this.hge);
      String str = Ow();
      ((t)localObject).RL(str);
      localObject = ((t)localObject).bPD();
      w.i("MicroMsg.AccInfo", "AccInfoCacheInWorker getCacheBuffer finish time:%s buflen:%s md5:%s", new Object[] { Long.valueOf(bg.aH(l)), Integer.valueOf(localObject.length), str });
      GMTrace.o(13668196548608L, 101836);
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AccInfo", "AccInfoCacheInWorker getCacheBuffer exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13668196548608L, 101836);
    }
    return null;
  }
  
  public final String Et()
  {
    GMTrace.i(13667257024512L, 101829);
    String str = this.hgh;
    GMTrace.o(13667257024512L, 101829);
    return str;
  }
  
  public final void F(byte[] paramArrayOfByte)
  {
    GMTrace.i(13665914847232L, 101819);
    this.gvf = paramArrayOfByte;
    GMTrace.o(13665914847232L, 101819);
  }
  
  public final void G(byte[] paramArrayOfByte)
  {
    GMTrace.i(13666049064960L, 101820);
    this.hgg = paramArrayOfByte;
    GMTrace.o(13666049064960L, 101820);
  }
  
  public final void bl(boolean paramBoolean)
  {
    GMTrace.i(13667793895424L, 101833);
    this.foreground = paramBoolean;
    w.i("MicroMsg.AccInfo", "somr accinfo setForegroundMuteRoom :%b", new Object[] { Boolean.valueOf(this.foreground) });
    GMTrace.o(13667793895424L, 101833);
  }
  
  public final void dp(int paramInt)
  {
    GMTrace.i(13668464984064L, 101838);
    w.i("MicroMsg.AccInfo", "summerauth setuin [%d -> %d], stack[%s]", new Object[] { Integer.valueOf(this.uin), Integer.valueOf(paramInt), bg.bQW() });
    this.uin = paramInt;
    GMTrace.o(13668464984064L, 101838);
  }
  
  public final void g(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(13667391242240L, 101830);
    this.hgi.put(paramString, paramArrayOfByte);
    GMTrace.o(13667391242240L, 101830);
  }
  
  public final String getUsername()
  {
    GMTrace.i(13666585935872L, 101824);
    String str = this.username;
    GMTrace.o(13666585935872L, 101824);
    return str;
  }
  
  public final void i(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(13665780629504L, 101818);
    w.i("MicroMsg.AccInfo", "summerauth update session info: session:%s, uin:%d -> %d stack:[%s]", new Object[] { bg.SJ(bg.bp(paramArrayOfByte)), Integer.valueOf(this.uin), Integer.valueOf(paramInt), bg.bQW() });
    this.hge = paramArrayOfByte;
    this.uin = paramInt;
    if (this.hgf != null) {
      DU();
    }
    GMTrace.o(13665780629504L, 101818);
  }
  
  public final byte[] ii(String paramString)
  {
    GMTrace.i(13667525459968L, 101831);
    paramString = (byte[])this.hgi.get(paramString);
    GMTrace.o(13667525459968L, 101831);
    return paramString;
  }
  
  public final void mW(String paramString)
  {
    GMTrace.i(13667122806784L, 101828);
    this.hgh = paramString;
    GMTrace.o(13667122806784L, 101828);
  }
  
  public final void reset()
  {
    GMTrace.i(13665377976320L, 101815);
    w.i("MicroMsg.AccInfo", "reset accinfo");
    this.username = "";
    this.hge = null;
    Ov();
    this.uin = 0;
    GMTrace.o(13665377976320L, 101815);
  }
  
  public final void setUsername(String paramString)
  {
    GMTrace.i(13665646411776L, 101817);
    this.username = paramString;
    GMTrace.o(13665646411776L, 101817);
  }
  
  public final String toString()
  {
    GMTrace.i(13666988589056L, 101827);
    String str = "AccInfo:\n" + "|-uin     =" + ww() + "\n";
    str = str + "|-user    =" + getUsername() + "\n";
    str = str + "|-wxuser  =" + Et() + "\n";
    str = str + "|-session =" + bg.bp(wR()) + "\n";
    str = str + "|-ecdhkey =" + bg.bp(DV()) + "\n";
    str = str + "`-cookie  =" + bg.bp(DT());
    GMTrace.o(13666988589056L, 101827);
    return str;
  }
  
  public final byte[] wR()
  {
    GMTrace.i(13666183282688L, 101821);
    byte[] arrayOfByte = this.hge;
    GMTrace.o(13666183282688L, 101821);
    return arrayOfByte;
  }
  
  public final int ww()
  {
    GMTrace.i(13666720153600L, 101825);
    int i = this.uin;
    GMTrace.o(13666720153600L, 101825);
    return i;
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */