package com.tencent.mm.protocal;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

public final class aa
{
  public static final class a
    extends k.d
    implements k.b
  {
    public byte[] fYy;
    public byte[] gMx;
    public int netType;
    public int tKv;
    public int uin;
    
    public a()
    {
      GMTrace.i(13592095096832L, 101269);
      this.gMx = new byte[0];
      this.uin = 0;
      GMTrace.o(13592095096832L, 101269);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13592363532288L, 101271);
      int j = this.uin;
      if (this.gMx == null) {}
      for (int i = -1;; i = this.gMx.length)
      {
        w.d("MicroMsg.MMSyncCheck", "toProtoBuf dksynccheck uin:%d keybuf:%d, stack[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(i), bg.bQW() });
        if ((this.uin != 0) && (!bg.bq(this.gMx))) {
          break;
        }
        GMTrace.o(13592363532288L, 101271);
        return new byte[0];
      }
      i = (this.uin >> 13 & 0x7FFFF | this.gMx.length << 19) ^ 0x5601F281;
      j = 0x5601F281 ^ (this.gMx.length >> 13 & 0x7FFFF | this.uin << 19);
      byte[] arrayOfByte = new byte[this.gMx.length + 32];
      w.d("MicroMsg.MMSyncCheck", "dksynccheck uin=[%d/%d], keyBufLen=[%d/%d] outBuf=[%d]", new Object[] { Integer.valueOf(this.uin), Integer.valueOf(i), Integer.valueOf(this.gMx.length), Integer.valueOf(j), Integer.valueOf(arrayOfByte.length) });
      arrayOfByte[0] = ((byte)(i >> 24 & 0xFF));
      arrayOfByte[1] = ((byte)(i >> 16 & 0xFF));
      arrayOfByte[2] = ((byte)(i >> 8 & 0xFF));
      arrayOfByte[3] = ((byte)(i & 0xFF));
      arrayOfByte[4] = ((byte)(j >> 24 & 0xFF));
      arrayOfByte[5] = ((byte)(j >> 16 & 0xFF));
      arrayOfByte[6] = ((byte)(j >> 8 & 0xFF));
      arrayOfByte[7] = ((byte)(j & 0xFF));
      System.arraycopy(this.gMx, 0, arrayOfByte, 8, this.gMx.length);
      arrayOfByte[(arrayOfByte.length - 24)] = ((byte)(d.tJC >> 24 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 23)] = ((byte)(d.tJC >> 16 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 22)] = ((byte)(d.tJC >> 8 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 21)] = ((byte)(d.tJC & 0xFF));
      String str = Locale.getDefault().toString();
      Object localObject = str;
      if (str.length() > 8) {
        localObject = str.substring(0, 8);
      }
      localObject = ((String)localObject).getBytes();
      System.arraycopy(localObject, 0, arrayOfByte, arrayOfByte.length - 20, localObject.length);
      w.d("MicroMsg.MMSyncCheck", "language:%x" + Arrays.toString((byte[])localObject));
      arrayOfByte[(arrayOfByte.length - 12)] = 0;
      arrayOfByte[(arrayOfByte.length - 11)] = 0;
      arrayOfByte[(arrayOfByte.length - 10)] = 0;
      arrayOfByte[(arrayOfByte.length - 9)] = 2;
      arrayOfByte[(arrayOfByte.length - 8)] = ((byte)(this.netType >> 24 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 7)] = ((byte)(this.netType >> 16 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 6)] = ((byte)(this.netType >> 8 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 5)] = ((byte)(this.netType & 0xFF));
      arrayOfByte[(arrayOfByte.length - 4)] = ((byte)(this.tKv >> 24 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 3)] = ((byte)(this.tKv >> 16 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 2)] = ((byte)(this.tKv >> 8 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 1)] = ((byte)(this.tKv & 0xFF));
      w.d("MicroMsg.MMSyncCheck", "outbuf:%x" + Arrays.toString(arrayOfByte));
      this.fYy = g.o(arrayOfByte);
      GMTrace.o(13592363532288L, 101271);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(13592497750016L, 101272);
      GMTrace.o(13592497750016L, 101272);
      return 0;
    }
    
    public final boolean Ei()
    {
      GMTrace.i(13592900403200L, 101275);
      GMTrace.o(13592900403200L, 101275);
      return false;
    }
    
    public final boolean bOl()
    {
      GMTrace.i(13592766185472L, 101274);
      GMTrace.o(13592766185472L, 101274);
      return true;
    }
    
    public final void dp(int paramInt)
    {
      GMTrace.i(13592229314560L, 101270);
      this.uin = paramInt;
      GMTrace.o(13592229314560L, 101270);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13592631967744L, 101273);
      GMTrace.o(13592631967744L, 101273);
      return 205;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    private String ePi;
    public byte[] fYy;
    public long tKZ;
    private byte[] tLa;
    
    public b()
    {
      GMTrace.i(13607530135552L, 101384);
      this.ePi = null;
      this.fYy = null;
      this.tKZ = 7L;
      GMTrace.o(13607530135552L, 101384);
    }
    
    public final boolean bOl()
    {
      GMTrace.i(13608067006464L, 101388);
      GMTrace.o(13608067006464L, 101388);
      return true;
    }
    
    @TargetApi(9)
    public final String bOn()
    {
      GMTrace.i(13607664353280L, 101385);
      if (this.fYy == null)
      {
        GMTrace.o(13607664353280L, 101385);
        return "";
      }
      Object localObject;
      if (this.ePi == null)
      {
        localObject = MMProtocalJni.aesDecrypt(this.tLa, this.fYy);
        if (bg.bq((byte[])localObject))
        {
          GMTrace.o(13607664353280L, 101385);
          return "";
        }
        if (Build.VERSION.SDK_INT < 9) {
          break label103;
        }
      }
      label103:
      for (this.ePi = new String((byte[])localObject, Charset.forName("UTF-8"));; this.ePi = new String((byte[])localObject))
      {
        localObject = this.ePi;
        GMTrace.o(13607664353280L, 101385);
        return (String)localObject;
      }
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13607932788736L, 101387);
      GMTrace.o(13607932788736L, 101387);
      return 1000000205;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13607798571008L, 101386);
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 12))
      {
        StringBuilder localStringBuilder = new StringBuilder("dksynccheck err resp buf:");
        if (paramArrayOfByte == null) {}
        for (i = -1;; i = paramArrayOfByte.length)
        {
          w.e("MicroMsg.MMSyncCheck", i);
          GMTrace.o(13607798571008L, 101386);
          return -1;
        }
      }
      this.tKZ = (paramArrayOfByte[3] & 0xFF | (paramArrayOfByte[2] & 0xFF) << 8 | (paramArrayOfByte[1] & 0xFF) << 16 | (paramArrayOfByte[0] & 0xFF) << 24);
      int i = paramArrayOfByte[7] & 0xFF | (paramArrayOfByte[6] & 0xFF) << 8 | (paramArrayOfByte[5] & 0xFF) << 16 | (paramArrayOfByte[4] & 0xFF) << 24;
      int j = paramArrayOfByte[11] & 0xFF | (paramArrayOfByte[10] & 0xFF) << 8 | (paramArrayOfByte[9] & 0xFF) << 16 | (paramArrayOfByte[8] & 0xFF) << 24;
      w.d("MicroMsg.MMSyncCheck", " fromProtoBuf oreh synccheck resp selector:%d, redCode:%d, keyLen:%d", new Object[] { Long.valueOf(this.tKZ), Integer.valueOf(i), Integer.valueOf(j) });
      if (i != 62534)
      {
        this.ePi = "";
        GMTrace.o(13607798571008L, 101386);
        return i;
      }
      if ((j != paramArrayOfByte.length - 12) && (j != paramArrayOfByte.length - 12 - 16))
      {
        w.e("MicroMsg.MMSyncCheck", " the key len is invalid keyLen:%d, bufLen:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramArrayOfByte.length) });
        GMTrace.o(13607798571008L, 101386);
        return -1;
      }
      if (j == paramArrayOfByte.length - 12 - 16)
      {
        this.fYy = new byte[16];
        System.arraycopy(paramArrayOfByte, paramArrayOfByte.length - 16, this.fYy, 0, 16);
      }
      this.tLa = new byte[j];
      System.arraycopy(paramArrayOfByte, 12, this.tLa, 0, j);
      GMTrace.o(13607798571008L, 101386);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */