package com.tencent.qqmusic.mediaplayer.seektable.mpeg4;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Mdhd;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stco;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Mp4SeekTable
  implements SeekTable
{
  private final Map<String, IMpeg4Box> essentialStblChunkMap = new HashMap();
  private final Mdhd mdhd;
  
  public Mp4SeekTable()
  {
    this.essentialStblChunkMap.put("stco", new Stco());
    this.essentialStblChunkMap.put("co64", new Co64());
    this.essentialStblChunkMap.put("stts", new Stts());
    this.essentialStblChunkMap.put("stsc", new Stsc());
    this.essentialStblChunkMap.put("stsz", new Stsz());
    this.mdhd = new Mdhd();
  }
  
  private static void chunkOfSample(Stsc paramStsc, int paramInt, int[] paramArrayOfInt)
  {
    int i1 = paramStsc.getEntryCount();
    int m = 0;
    int j = 1;
    int i = 0;
    int k = 0;
    int n = paramStsc.getFirstChunk()[k];
    int i2 = (n - j) * m;
    if (paramInt < i + i2)
    {
      n = 1;
      k = i;
      i = m;
      m = n;
      label57:
      if (i == 0) {
        break label149;
      }
      if (m != 0)
      {
        paramInt = (paramInt - k) / i + j;
        label76:
        paramArrayOfInt[0] = paramInt;
        paramArrayOfInt[1] = ((paramInt - j) * i + k);
      }
    }
    else
    {
      m = paramStsc.getSamplesPerChunk()[k];
      if (k >= i1) {
        break label165;
      }
      i += i2;
    }
    label149:
    label165:
    for (j = k + 1;; j = k)
    {
      if (j >= i1)
      {
        k = i;
        j = n;
        i = m;
        m = 0;
        break label57;
        paramInt = j;
        break label76;
        paramInt = 1;
        break label76;
      }
      k = j;
      j = n;
      break;
    }
  }
  
  public static boolean needMoreChunks(HashSet<String> paramHashSet)
  {
    if (paramHashSet.size() > 2) {}
    while ((paramHashSet.contains("stco")) && (paramHashSet.contains("co64"))) {
      return true;
    }
    return false;
  }
  
  private static long offset64OfChunk(Co64 paramCo64, int paramInt)
  {
    if (paramInt > paramCo64.getEntryCount()) {
      return paramCo64.getChunkOffset()[(paramCo64.getEntryCount() - 1)];
    }
    if (paramCo64.getEntryCount() > 0) {
      return paramCo64.getChunkOffset()[(paramInt - 1)];
    }
    return 8L;
  }
  
  private static int offsetOfChunk(Stco paramStco, int paramInt)
  {
    if (paramInt > paramStco.getEntryCount()) {
      return paramStco.getChunkOffset()[(paramStco.getEntryCount() - 1)];
    }
    if (paramStco.getEntryCount() > 0) {
      return paramStco.getChunkOffset()[(paramInt - 1)];
    }
    return 8;
  }
  
  private static int offsetOfSampleInChunk(Stsz paramStsz, int paramInt1, int paramInt2)
  {
    if (paramStsz.getSampleSize() != 0)
    {
      i = (paramInt1 - paramInt2) * paramStsz.getSampleSize();
      return i;
    }
    int i = 0;
    int j = Math.min(paramInt1, paramStsz.getSampleCount());
    paramInt1 = i;
    for (;;)
    {
      i = paramInt1;
      if (paramInt2 >= j) {
        break;
      }
      paramInt1 += paramStsz.getEntrySize()[paramInt2];
      paramInt2 += 1;
    }
  }
  
  private static void parseChunks(Parsable paramParsable, Map<String, IMpeg4Box> paramMap, Function1<HashSet<String>, Boolean> paramFunction1)
  {
    GhostBox localGhostBox = new GhostBox();
    HashSet localHashSet = new HashSet(paramMap.keySet());
    while (((paramFunction1 == null) || (((Boolean)paramFunction1.call(localHashSet)).booleanValue())) && (localHashSet.size() != 0) && (paramParsable.available() > 0L))
    {
      localGhostBox.parse(paramParsable, null);
      String str = localGhostBox.getType();
      IMpeg4Box localIMpeg4Box = (IMpeg4Box)paramMap.get(str);
      if (localIMpeg4Box == null)
      {
        paramParsable.skip(localGhostBox.getSize() - 8L);
      }
      else
      {
        localIMpeg4Box.parse(paramParsable, localGhostBox);
        localHashSet.remove(str);
      }
    }
    if ((paramFunction1 != null) && (((Boolean)paramFunction1.call(localHashSet)).booleanValue())) {
      throw new InvalidBoxException("invalid box: critical box not found!");
    }
  }
  
  private static int sampleOfTime(Stts paramStts, int paramInt)
  {
    int n = 0;
    int i1 = paramStts.getEntryCount();
    int k = 0;
    int m = 0;
    int i = 0;
    int j = paramInt;
    for (paramInt = m;; paramInt = m + paramInt)
    {
      m = n;
      int i2;
      if (k < i1)
      {
        i = paramStts.getSampleDelta()[k];
        m = paramStts.getSampleCount()[k];
        i2 = m * i;
        if (j < i2) {
          m = 1;
        }
      }
      else
      {
        k = paramInt;
        if (m != 0) {
          k = paramInt + j / i;
        }
        return k;
      }
      j -= i2;
      k += 1;
    }
  }
  
  private long seekInternal(int paramInt)
  {
    int[] arrayOfInt = new int[2];
    paramInt = sampleOfTime((Stts)this.essentialStblChunkMap.get("stts"), paramInt);
    chunkOfSample((Stsc)this.essentialStblChunkMap.get("stsc"), paramInt, arrayOfInt);
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    if (((IMpeg4Box)this.essentialStblChunkMap.get("stco")).getSize() != 0L) {}
    for (long l = offsetOfChunk((Stco)this.essentialStblChunkMap.get("stco"), i);; l = offset64OfChunk((Co64)this.essentialStblChunkMap.get("co64"), i))
    {
      return offsetOfSampleInChunk((Stsz)this.essentialStblChunkMap.get("stsz"), paramInt, j) + l;
      if (((IMpeg4Box)this.essentialStblChunkMap.get("co64")).getSize() == 0L) {
        break;
      }
    }
    throw new RuntimeException("invalid stbl: both [stco] nor [co64] was found!");
  }
  
  private static IMpeg4Box seekTo(Parsable paramParsable, String paramString)
  {
    GhostBox localGhostBox = new GhostBox();
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ".");
    paramString = null;
    for (;;)
    {
      if (!localStringTokenizer.hasMoreTokens()) {
        return paramString;
      }
      String str = localStringTokenizer.nextToken();
      int i = 0;
      while ((i == 0) && (paramParsable.available() > 0L))
      {
        localGhostBox.parse(paramParsable, null);
        if (str.equalsIgnoreCase(localGhostBox.getType())) {
          break label90;
        }
        paramParsable.skip(localGhostBox.getSize() - 8L);
      }
      continue;
      label90:
      i = 1;
      if (localStringTokenizer.hasMoreTokens()) {
        break;
      }
      paramString = localGhostBox;
    }
    return paramString;
  }
  
  public void parse(InputStream paramInputStream)
  {
    paramInputStream = new ParsableInputStreamWrapper(paramInputStream);
    if (seekTo(paramInputStream, "moov.trak.mdia") == null) {
      throw new InvalidBoxException("invalid mp4: no [mdia] was found!");
    }
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("mdhd", this.mdhd);
    localHashMap.put("minf", new GhostBox());
    parseChunks(paramInputStream, localHashMap, null);
    if (seekTo(paramInputStream, "stbl") == null) {
      throw new InvalidBoxException("invalid mp4: no [stbl] was found!");
    }
    parseChunks(paramInputStream, this.essentialStblChunkMap, new Function1()
    {
      public Boolean call(HashSet<String> paramAnonymousHashSet)
      {
        return Boolean.valueOf(Mp4SeekTable.needMoreChunks(paramAnonymousHashSet));
      }
    });
  }
  
  public long seek(long paramLong)
  {
    return seekInternal((int)Math.round(this.mdhd.getTimeScale() * paramLong / 1000.0D));
  }
  
  private static abstract interface Function1<T, R>
  {
    public abstract R call(T paramT);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\seektable\mpeg4\Mp4SeekTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */