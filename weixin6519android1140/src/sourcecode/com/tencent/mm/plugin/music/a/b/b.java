package com.tencent.mm.plugin.music.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  private byte[] buffer;
  public int mSize;
  public com.tencent.mm.plugin.music.a.e.c nrc;
  public c nrd;
  public e nre;
  public int nrf;
  public int nrg;
  public int vq;
  
  public b(com.tencent.mm.plugin.music.a.e.c paramc)
  {
    GMTrace.i(15024735125504L, 111943);
    this.buffer = new byte[81920];
    this.vq = -1;
    this.mSize = 0;
    this.nrf = -1;
    this.nrg = 0;
    this.nrc = paramc;
    GMTrace.o(15024735125504L, 111943);
  }
  
  public final boolean aTc()
  {
    int j = 0;
    boolean bool = false;
    int m;
    int i;
    label214:
    int[] arrayOfInt;
    int n;
    int k;
    int i1;
    for (;;)
    {
      c localc;
      try
      {
        GMTrace.i(15025137778688L, 111946);
        if ((this.vq < 0) || (this.mSize <= 0))
        {
          w.e("MicroMsg.FileBytesCacheMgr", "flushBufferAll(), mOffset:%d, mSize:%d", new Object[] { Integer.valueOf(this.vq), Integer.valueOf(this.mSize) });
          GMTrace.o(15025137778688L, 111946);
          return bool;
        }
        byte[] arrayOfByte = new byte[this.mSize];
        System.arraycopy(this.buffer, 0, arrayOfByte, 0, this.mSize);
        this.nre.b(arrayOfByte, this.vq, this.mSize);
        localc = this.nrd;
        m = this.vq;
        i = this.mSize;
        if ((m < 0) || (i < 0) || (m > localc.hmS) || (m + i > localc.hmS))
        {
          w.i("MicroMsg.IndexBitMgr", "getWriteBuffIndexRange offset %d, size %d, fileLength %d", new Object[] { Integer.valueOf(m), Integer.valueOf(i), Long.valueOf(localc.hmS) });
          w.e("MicroMsg.IndexBitMgr", "getWriteBuffRange invalid parameter!");
          arrayOfByte = null;
          if (arrayOfByte != null) {
            break label616;
          }
          w.e("MicroMsg.FileBytesCacheMgr", "flushBufferAll, range is null");
          GMTrace.o(15025137778688L, 111946);
          continue;
        }
        arrayOfInt = new int[2];
      }
      finally {}
      arrayOfInt[1] = -1;
      arrayOfInt[0] = -1;
      n = m + i;
      k = localc.getIndex(m);
      i1 = localc.getIndex(n);
      i = k;
      break;
      label287:
      if ((arrayOfInt[0] != -1) || (arrayOfInt[1] != -1) || (n != localc.hmS)) {
        break label613;
      }
      w.i("MicroMsg.IndexBitMgr", "write to file end!");
      arrayOfInt[0] = k;
      arrayOfInt[1] = i1;
      break label613;
      label336:
      w.d("MicroMsg.FileBytesCacheMgr", "flushBufferAll range[0]:%d, range[1]:%d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]) });
      GMTrace.o(15025137778688L, 111946);
    }
    for (;;)
    {
      if (i <= arrayOfInt[1])
      {
        this.nrd.rv(i);
        i += 1;
      }
      else
      {
        k = arrayOfInt[0];
        i = j;
        if (k > 0)
        {
          k -= 1;
          i = j;
          if (!this.nrd.ru(k))
          {
            i = j;
            if (this.nrf + this.nrg == this.vq)
            {
              i = j;
              if (this.mSize > 0)
              {
                i = j;
                if (this.nrg >= 8192)
                {
                  w.i("MicroMsg.FileBytesCacheMgr", "isCanSavePreviousIndex, save index :%d", new Object[] { Integer.valueOf(k) });
                  i = 1;
                }
              }
            }
          }
        }
        if (i != 0) {
          this.nrd.rv(arrayOfInt[0] - 1);
        }
        this.nrd.aTd();
        GMTrace.o(15025137778688L, 111946);
        bool = true;
        break;
        while (i <= i1)
        {
          if ((i * 8192 >= m) && ((i + 1) * 8192 <= n))
          {
            if (arrayOfInt[0] == -1) {
              arrayOfInt[0] = i;
            }
            if (arrayOfInt[0] > i) {
              arrayOfInt[0] = i;
            }
            if (arrayOfInt[1] == -1) {
              arrayOfInt[1] = i;
            }
            if (arrayOfInt[1] < i) {
              arrayOfInt[1] = i;
            }
          }
          i += 1;
        }
        break label287;
        label613:
        break label214;
        label616:
        if ((arrayOfInt[0] == -1) || (arrayOfInt[1] == -1)) {
          break label336;
        }
        i = arrayOfInt[0];
      }
    }
  }
  
  public final void e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      GMTrace.i(15025406214144L, 111948);
      paramInt1 -= this.vq;
      this.mSize = (paramInt1 + paramInt2);
      System.arraycopy(paramArrayOfByte, 0, this.buffer, paramInt1, paramInt2);
      GMTrace.o(15025406214144L, 111948);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  /* Error */
  public final boolean rq(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 141
    //   5: ldc -113
    //   7: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 36	com/tencent/mm/plugin/music/a/b/b:vq	I
    //   14: iload_1
    //   15: if_icmpgt +28 -> 43
    //   18: iload_1
    //   19: aload_0
    //   20: getfield 36	com/tencent/mm/plugin/music/a/b/b:vq	I
    //   23: ldc 32
    //   25: iadd
    //   26: if_icmpgt +17 -> 43
    //   29: iconst_1
    //   30: istore_2
    //   31: ldc2_w 141
    //   34: ldc -113
    //   36: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   39: aload_0
    //   40: monitorexit
    //   41: iload_2
    //   42: ireturn
    //   43: iconst_0
    //   44: istore_2
    //   45: ldc2_w 141
    //   48: ldc -113
    //   50: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   53: goto -14 -> 39
    //   56: astore_3
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_3
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	b
    //   0	61	1	paramInt	int
    //   30	15	2	bool	boolean
    //   56	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	29	56	finally
    //   31	39	56	finally
    //   45	53	56	finally
  }
  
  /* Error */
  public final boolean rr(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 145
    //   5: ldc -109
    //   7: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 36	com/tencent/mm/plugin/music/a/b/b:vq	I
    //   14: iload_1
    //   15: if_icmpgt +30 -> 45
    //   18: iload_1
    //   19: aload_0
    //   20: getfield 36	com/tencent/mm/plugin/music/a/b/b:vq	I
    //   23: aload_0
    //   24: getfield 38	com/tencent/mm/plugin/music/a/b/b:mSize	I
    //   27: iadd
    //   28: if_icmpgt +17 -> 45
    //   31: iconst_1
    //   32: istore_2
    //   33: ldc2_w 145
    //   36: ldc -109
    //   38: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   41: aload_0
    //   42: monitorexit
    //   43: iload_2
    //   44: ireturn
    //   45: iconst_0
    //   46: istore_2
    //   47: ldc2_w 145
    //   50: ldc -109
    //   52: invokestatic 47	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   55: goto -14 -> 41
    //   58: astore_3
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_3
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	b
    //   0	63	1	paramInt	int
    //   32	15	2	bool	boolean
    //   58	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	31	58	finally
    //   33	41	58	finally
    //   47	55	58	finally
  }
  
  public final void rs(int paramInt)
  {
    try
    {
      GMTrace.i(15025271996416L, 111947);
      this.nrf = this.vq;
      this.nrg = this.mSize;
      this.vq = paramInt;
      this.mSize = 0;
      GMTrace.o(15025271996416L, 111947);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */