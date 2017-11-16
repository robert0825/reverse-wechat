package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DataRangeTracker
{
  private static final String TAG = "DataRangeTracker";
  private Comparator<Range> mComparator = new Comparator()
  {
    public int compare(DataRangeTracker.Range paramAnonymousRange1, DataRangeTracker.Range paramAnonymousRange2)
    {
      return (int)(paramAnonymousRange1.first - paramAnonymousRange2.first);
    }
  };
  private final ArrayList<Range> mDownloadDataList = new ArrayList();
  
  public void addRange(long paramLong1, long paramLong2)
  {
    if (paramLong1 > paramLong2) {
      Logger.e("DataRangeTracker", "[addRange] illegal arguments! beginPos(%s) > endPos(%s)", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    }
    ArrayList localArrayList;
    int j;
    Range localRange1;
    do
    {
      return;
      Logger.d("DataRangeTracker", String.format("[addRange] [%d, %d]", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) }));
      localArrayList = new ArrayList();
      this.mDownloadDataList.add(new Range(paramLong1, paramLong2));
      Collections.sort(this.mDownloadDataList, this.mComparator);
      j = this.mDownloadDataList.size() - 1;
      localRange1 = (Range)this.mDownloadDataList.get(0);
    } while (j <= 0);
    int i = 1;
    while (i <= j)
    {
      Range localRange2 = (Range)this.mDownloadDataList.get(i);
      if (localRange1.second + 1L < localRange2.first)
      {
        localArrayList.add(new Range(localRange1.first, localRange1.second));
        localRange1 = new Range(localRange2.first, localRange2.second);
        if (i >= j) {
          localArrayList.add(localRange1);
        }
        i += 1;
      }
      else
      {
        if (localRange1.second > localRange2.second) {}
        for (paramLong1 = localRange1.second;; paramLong1 = localRange2.second)
        {
          localRange1 = new Range(localRange1.first, paramLong1);
          break;
        }
      }
    }
    this.mDownloadDataList.clear();
    this.mDownloadDataList.addAll(localArrayList);
  }
  
  public long findEnd(long paramLong)
  {
    int j = this.mDownloadDataList.size();
    if (j == 0) {
      return -1L;
    }
    int i = 0;
    while (i < j)
    {
      if (paramLong < ((Range)this.mDownloadDataList.get(i)).first) {
        return ((Range)this.mDownloadDataList.get(i)).first - 1L;
      }
      if ((paramLong <= ((Range)this.mDownloadDataList.get(i)).second) && (i + 1 < j)) {
        return ((Range)this.mDownloadDataList.get(i + 1)).first - 1L;
      }
      i += 1;
    }
    return 0L;
  }
  
  public long findStart(long paramLong)
  {
    int i = 0;
    int j = this.mDownloadDataList.size();
    if (j == 0) {
      return -1L;
    }
    long l = ((Range)this.mDownloadDataList.get(0)).second + 1L;
    while (i < j)
    {
      if (paramLong < ((Range)this.mDownloadDataList.get(i)).first) {
        return l;
      }
      l = ((Range)this.mDownloadDataList.get(i)).second + 1L;
      if (paramLong <= ((Range)this.mDownloadDataList.get(i)).second) {
        return ((Range)this.mDownloadDataList.get(i)).second + 1L;
      }
      i += 1;
    }
    return ((Range)this.mDownloadDataList.get(this.mDownloadDataList.size() - 1)).second + 1L;
  }
  
  public long getContinuousEnd()
  {
    if (this.mDownloadDataList.size() == 0) {
      return -1L;
    }
    return ((Range)this.mDownloadDataList.get(0)).second;
  }
  
  /* Error */
  java.util.List<Range> getEmptyContentPairList(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 25	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 26	java/util/ArrayList:<init>	()V
    //   9: astore 6
    //   11: aload_0
    //   12: getfield 28	com/tencent/qqmusic/mediaplayer/DataRangeTracker:mDownloadDataList	Ljava/util/ArrayList;
    //   15: astore 5
    //   17: aload 5
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield 28	com/tencent/qqmusic/mediaplayer/DataRangeTracker:mDownloadDataList	Ljava/util/ArrayList;
    //   24: invokevirtual 109	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   27: astore 7
    //   29: lconst_0
    //   30: lstore_3
    //   31: aload 7
    //   33: invokeinterface 115 1 0
    //   38: ifeq +59 -> 97
    //   41: aload 7
    //   43: invokeinterface 119 1 0
    //   48: checkcast 8	com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range
    //   51: astore 8
    //   53: lload_3
    //   54: aload 8
    //   56: getfield 89	com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range:first	J
    //   59: lcmp
    //   60: ifge +26 -> 86
    //   63: aload 6
    //   65: new 8	com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range
    //   68: dup
    //   69: lload_3
    //   70: aload 8
    //   72: getfield 89	com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range:first	J
    //   75: lconst_1
    //   76: lsub
    //   77: invokespecial 64	com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range:<init>	(JJ)V
    //   80: invokeinterface 122 2 0
    //   85: pop
    //   86: aload 8
    //   88: getfield 86	com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range:second	J
    //   91: lconst_1
    //   92: ladd
    //   93: lstore_3
    //   94: goto -63 -> 31
    //   97: aload 5
    //   99: monitorexit
    //   100: lload_3
    //   101: lload_1
    //   102: lcmp
    //   103: ifge +22 -> 125
    //   106: aload 6
    //   108: new 8	com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range
    //   111: dup
    //   112: lload_3
    //   113: lload_1
    //   114: lconst_1
    //   115: lsub
    //   116: invokespecial 64	com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range:<init>	(JJ)V
    //   119: invokeinterface 122 2 0
    //   124: pop
    //   125: aload_0
    //   126: monitorexit
    //   127: aload 6
    //   129: areturn
    //   130: astore 6
    //   132: aload 5
    //   134: monitorexit
    //   135: aload 6
    //   137: athrow
    //   138: astore 5
    //   140: aload_0
    //   141: monitorexit
    //   142: aload 5
    //   144: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	DataRangeTracker
    //   0	145	1	paramLong	long
    //   30	83	3	l	long
    //   138	5	5	localObject1	Object
    //   9	119	6	localArrayList2	ArrayList
    //   130	6	6	localObject2	Object
    //   27	15	7	localIterator	java.util.Iterator
    //   51	36	8	localRange	Range
    // Exception table:
    //   from	to	target	type
    //   20	29	130	finally
    //   31	86	130	finally
    //   86	94	130	finally
    //   97	100	130	finally
    //   132	135	130	finally
    //   2	20	138	finally
    //   106	125	138	finally
    //   135	138	138	finally
  }
  
  public boolean isCached(long paramLong, int paramInt)
  {
    long l1 = findStart(paramLong);
    long l2 = findStart(paramInt + paramLong);
    long l3 = findEnd(paramLong);
    long l4 = findEnd(paramInt + paramLong);
    if ((l1 != l2) || (l3 != l4)) {}
    while ((l3 == -1L) || (paramInt + paramLong > l1)) {
      return false;
    }
    return true;
  }
  
  public String print()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < this.mDownloadDataList.size())
    {
      localStringBuilder.append(((Range)this.mDownloadDataList.get(i)).toString());
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  private static class Range
  {
    public final long first;
    public final long second;
    
    public Range(long paramLong1, long paramLong2)
    {
      this.first = paramLong1;
      this.second = paramLong2;
    }
    
    public String toString()
    {
      return "[" + this.first + ", " + this.second + ']';
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\qqmusic\mediaplayer\DataRangeTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */