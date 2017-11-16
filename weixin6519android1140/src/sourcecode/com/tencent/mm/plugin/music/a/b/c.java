package com.tencent.mm.plugin.music.a.b;

import android.content.ContentValues;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.music.a.g.b;
import com.tencent.mm.plugin.music.a.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.BitSet;

public final class c
{
  public int count;
  public long hmS;
  public String mUrl;
  public BitSet nrh;
  public String nri;
  
  public c(String paramString)
  {
    GMTrace.i(15025540431872L, 111949);
    this.nrh = new BitSet();
    this.hmS = -1L;
    this.count = 0;
    this.nri = "";
    this.mUrl = paramString;
    GMTrace.o(15025540431872L, 111949);
  }
  
  private void rt(int paramInt)
  {
    GMTrace.i(15025943085056L, 111952);
    w.i("MicroMsg.IndexBitMgr", "setFileCacheComplete %d", new Object[] { Integer.valueOf(paramInt) });
    if (!TextUtils.isEmpty(this.nri))
    {
      Object localObject = h.aSw();
      String str = this.nri;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("fileCacheComplete", Integer.valueOf(paramInt));
      w.i("MicroMsg.PieceMusicInfoStorage", "updateMusicFileCacheComplete raw=%d musicId=%s fileCacheComplete=%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.music.a.g.c)localObject).fTZ.update("PieceMusicInfo", localContentValues, "musicId=?", new String[] { str })), str, Integer.valueOf(paramInt) });
      localObject = (b)((com.tencent.mm.plugin.music.a.g.c)localObject).nsm.get(str);
      if (localObject != null) {
        ((b)localObject).field_fileCacheComplete = paramInt;
      }
    }
    GMTrace.o(15025943085056L, 111952);
  }
  
  public final void aTd()
  {
    int k = 0;
    GMTrace.i(15025674649600L, 111950);
    if (!TextUtils.isEmpty(this.nri))
    {
      BitSet localBitSet = this.nrh;
      byte[] arrayOfByte = new byte[localBitSet.size() / 8];
      i = 0;
      if (i < localBitSet.size())
      {
        int m = i / 8;
        int n = arrayOfByte[m];
        if (localBitSet.get(i)) {}
        for (int j = 1;; j = 0)
        {
          arrayOfByte[m] = ((byte)(j << 7 - i % 8 | n));
          i += 1;
          break;
        }
      }
      h.aSw().p(this.nri, arrayOfByte);
    }
    w.d("MicroMsg.IndexBitMgr", "saveBitCache bitSet:%s", new Object[] { this.nrh.toString() });
    w.i("MicroMsg.IndexBitMgr", "saveBitCache bitSet count %d, cardinality:" + this.count + "," + this.nrh.cardinality());
    w.i("MicroMsg.IndexBitMgr", "isCacheComplete, count:%d, cardinality:%d", new Object[] { Integer.valueOf(this.count), Integer.valueOf(this.nrh.cardinality()) });
    int i = k;
    if (this.count > 0)
    {
      i = k;
      if (this.count == this.nrh.cardinality()) {
        i = 1;
      }
    }
    if (i != 0) {
      rt(1);
    }
    GMTrace.o(15025674649600L, 111950);
  }
  
  public final boolean cA(int paramInt1, int paramInt2)
  {
    GMTrace.i(15026211520512L, 111954);
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt1 > this.hmS) || (paramInt1 + paramInt2 > this.hmS))
    {
      w.e("MicroMsg.IndexBitMgr", "canReadFromCache offset %d, size %d, fileLength %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(this.hmS) });
      w.e("MicroMsg.IndexBitMgr", "canReadFromCache invalid parameter!");
      GMTrace.o(15026211520512L, 111954);
      return false;
    }
    int i = getIndex(paramInt1);
    paramInt2 = getIndex(paramInt1 + paramInt2);
    paramInt1 = i;
    while (paramInt1 <= paramInt2)
    {
      if (!ru(i))
      {
        w.d("MicroMsg.IndexBitMgr", "index %d, indexBit 0", new Object[] { Integer.valueOf(paramInt1) });
        GMTrace.o(15026211520512L, 111954);
        return false;
      }
      paramInt1 += 1;
    }
    GMTrace.o(15026211520512L, 111954);
    return true;
  }
  
  public final void clearCache()
  {
    GMTrace.i(15025808867328L, 111951);
    w.i("MicroMsg.IndexBitMgr", "clearCache");
    this.nrh = new BitSet(this.count);
    rt(0);
    if (!TextUtils.isEmpty(this.nri)) {
      h.aSw().p(this.nri, null);
    }
    GMTrace.o(15025808867328L, 111951);
  }
  
  public final int getIndex(int paramInt)
  {
    GMTrace.i(15026077302784L, 111953);
    if (paramInt > this.hmS)
    {
      w.e("MicroMsg.IndexBitMgr", "getIndex, offset is invalid, offset:%d, fileLength:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.hmS) });
      GMTrace.o(15026077302784L, 111953);
      return 0;
    }
    paramInt /= 8192;
    GMTrace.o(15026077302784L, 111953);
    return paramInt;
  }
  
  public final boolean ru(int paramInt)
  {
    GMTrace.i(20499207815168L, 152731);
    boolean bool = this.nrh.get(paramInt);
    GMTrace.o(20499207815168L, 152731);
    return bool;
  }
  
  public final void rv(int paramInt)
  {
    GMTrace.i(20499342032896L, 152732);
    this.nrh.set(paramInt);
    GMTrace.o(20499342032896L, 152732);
  }
  
  public static final class a
  {
    public static BitSet az(byte[] paramArrayOfByte)
    {
      GMTrace.i(15024600907776L, 111942);
      BitSet localBitSet = new BitSet(paramArrayOfByte.length * 8);
      int i = 0;
      int j = 0;
      while (i < paramArrayOfByte.length)
      {
        int k = 7;
        if (k >= 0)
        {
          if ((paramArrayOfByte[i] & 1 << k) >> k == 1) {}
          for (boolean bool = true;; bool = false)
          {
            localBitSet.set(j, bool);
            k -= 1;
            j += 1;
            break;
          }
        }
        i += 1;
      }
      GMTrace.o(15024600907776L, 111942);
      return localBitSet;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */