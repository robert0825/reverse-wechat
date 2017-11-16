package com.tencent.mm.modelsfs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SFSContext
{
  public long mNativePtr;
  
  public SFSContext(Builder paramBuilder)
  {
    GMTrace.i(13845766602752L, 103159);
    Iterator localIterator = paramBuilder.mConf.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      localObject = ((Map.Entry)localObject).getValue();
      if ((localObject instanceof Integer)) {
        nativeSetIntConf(i, ((Integer)localObject).intValue());
      } else if ((localObject instanceof String)) {
        nativeSetStringConf(i, (String)localObject);
      } else if ((localObject instanceof int[])) {
        nativeSetIntArrayConf(i, (int[])localObject);
      }
    }
    long l = nativeInit(paramBuilder.mName);
    if (l == 0L) {
      throw new RuntimeException(nativeErrorMessage());
    }
    this.mNativePtr = l;
    GMTrace.o(13845766602752L, 103159);
  }
  
  static native int nativeClear(long paramLong);
  
  static native String nativeErrorMessage();
  
  static native boolean nativeExists(long paramLong, String paramString);
  
  private static native long nativeInit(String paramString);
  
  private static native int nativeList(long paramLong, String paramString, List<FileEntry> paramList);
  
  private static native long nativeOpenRead(long paramLong, String paramString);
  
  private static native long nativeOpenWrite(long paramLong, String paramString);
  
  private static native void nativeRelease(long paramLong);
  
  private static native void nativeSetIntArrayConf(int paramInt, int[] paramArrayOfInt);
  
  private static native void nativeSetIntConf(int paramInt1, int paramInt2);
  
  private static native void nativeSetStringConf(int paramInt, String paramString);
  
  private static native FileEntry nativeStat(long paramLong, String paramString);
  
  static native Statistics nativeStatistics(long paramLong);
  
  private static native boolean nativeUnlink(long paramLong, String paramString);
  
  public final OutputStream aj(String paramString1, String paramString2)
  {
    GMTrace.i(13846169255936L, 103162);
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    long l = nativeOpenWrite(this.mNativePtr, paramString1);
    if (l == 0L) {
      throw new IOException(paramString1 + ": " + nativeErrorMessage());
    }
    if (!TextUtils.isEmpty(paramString2))
    {
      paramString1 = new e(l, paramString2);
      GMTrace.o(13846169255936L, 103162);
      return paramString1;
    }
    paramString1 = new SFSOutputStream(l);
    GMTrace.o(13846169255936L, 103162);
    return paramString1;
  }
  
  protected void finalize()
  {
    GMTrace.i(13846706126848L, 103166);
    if (this.mNativePtr != 0L) {
      release();
    }
    super.finalize();
    GMTrace.o(13846706126848L, 103166);
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(13846571909120L, 103165);
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    String str = paramString;
    if (f.le(paramString))
    {
      f.lg(paramString);
      str = f.lf(paramString);
    }
    boolean bool = nativeUnlink(this.mNativePtr, str);
    GMTrace.o(13846571909120L, 103165);
    return bool;
  }
  
  public final List<FileEntry> li(String paramString)
  {
    GMTrace.i(13846303473664L, 103163);
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    ArrayList localArrayList = new ArrayList();
    if (nativeList(this.mNativePtr, paramString, localArrayList) != 0) {
      throw new IOException(nativeErrorMessage());
    }
    GMTrace.o(13846303473664L, 103163);
    return localArrayList;
  }
  
  public final FileEntry lj(String paramString)
  {
    GMTrace.i(13846437691392L, 103164);
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    String str = paramString;
    if (f.le(paramString))
    {
      f.lg(paramString);
      str = f.lf(paramString);
    }
    paramString = nativeStat(this.mNativePtr, str);
    GMTrace.o(13846437691392L, 103164);
    return paramString;
  }
  
  public final InputStream openRead(String paramString)
  {
    GMTrace.i(13846035038208L, 103161);
    if (this.mNativePtr == 0L) {
      throw new IllegalArgumentException("Reuse already released SFSContext.");
    }
    long l1;
    if (f.le(paramString))
    {
      l1 = f.lg(paramString);
      paramString = f.lf(paramString);
    }
    for (;;)
    {
      long l2 = nativeOpenRead(this.mNativePtr, paramString);
      if (l2 == 0L) {
        throw new FileNotFoundException(paramString + ": " + nativeErrorMessage());
      }
      if (l1 != 0L)
      {
        paramString = new d(l2, l1);
        GMTrace.o(13846035038208L, 103161);
        return paramString;
      }
      paramString = new SFSInputStream(l2);
      GMTrace.o(13846035038208L, 103161);
      return paramString;
      l1 = 0L;
    }
  }
  
  public final void release()
  {
    GMTrace.i(13845900820480L, 103160);
    nativeRelease(this.mNativePtr);
    this.mNativePtr = 0L;
    GMTrace.o(13845900820480L, 103160);
  }
  
  public static class Builder
    implements Parcelable
  {
    public static final Parcelable.Creator<Builder> CREATOR;
    HashMap<Integer, Object> mConf;
    String mName;
    
    static
    {
      GMTrace.i(13832344829952L, 103059);
      CREATOR = new Parcelable.Creator()
      {
        public final SFSContext.Builder createFromParcel(Parcel paramAnonymousParcel)
        {
          GMTrace.i(13829392039936L, 103037);
          paramAnonymousParcel = new SFSContext.Builder(paramAnonymousParcel);
          GMTrace.o(13829392039936L, 103037);
          return paramAnonymousParcel;
        }
        
        public final SFSContext.Builder[] newArray(int paramAnonymousInt)
        {
          GMTrace.i(13829526257664L, 103038);
          SFSContext.Builder[] arrayOfBuilder = new SFSContext.Builder[paramAnonymousInt];
          GMTrace.o(13829526257664L, 103038);
          return arrayOfBuilder;
        }
      };
      GMTrace.o(13832344829952L, 103059);
    }
    
    public Builder()
    {
      GMTrace.i(13831539523584L, 103053);
      this.mName = null;
      this.mConf = new HashMap();
      GMTrace.o(13831539523584L, 103053);
    }
    
    public Builder(Parcel paramParcel)
    {
      GMTrace.i(13832076394496L, 103057);
      this.mName = paramParcel.readString();
      this.mConf = new HashMap();
      paramParcel = paramParcel.readArray(Builder.class.getClassLoader());
      if (paramParcel != null)
      {
        int i = 0;
        while (i < paramParcel.length)
        {
          if (paramParcel[i] != null) {
            this.mConf.put(Integer.valueOf(i), paramParcel[i]);
          }
          i += 1;
        }
      }
      GMTrace.o(13832076394496L, 103057);
    }
    
    public SFSContext create()
    {
      GMTrace.i(13831673741312L, 103054);
      SFSContext localSFSContext = new SFSContext(this);
      GMTrace.o(13831673741312L, 103054);
      return localSFSContext;
    }
    
    public int describeContents()
    {
      GMTrace.i(13831807959040L, 103055);
      GMTrace.o(13831807959040L, 103055);
      return 0;
    }
    
    public Builder setBlockFileMaxSize(int paramInt)
    {
      GMTrace.i(13830734217216L, 103047);
      this.mConf.put(Integer.valueOf(4), Integer.valueOf(paramInt));
      GMTrace.o(13830734217216L, 103047);
      return this;
    }
    
    public Builder setBlockFilePrefix(String paramString)
    {
      GMTrace.i(13830197346304L, 103043);
      this.mConf.put(Integer.valueOf(2), paramString);
      GMTrace.o(13830197346304L, 103043);
      return this;
    }
    
    public Builder setBlockSizeArray(int[] paramArrayOfInt)
    {
      GMTrace.i(13830599999488L, 103046);
      this.mConf.put(Integer.valueOf(5), paramArrayOfInt);
      GMTrace.o(13830599999488L, 103046);
      return this;
    }
    
    public Builder setConnectionPool(int paramInt)
    {
      GMTrace.i(13830868434944L, 103048);
      this.mConf.put(Integer.valueOf(7), Integer.valueOf(paramInt));
      GMTrace.o(13830868434944L, 103048);
      return this;
    }
    
    public Builder setDBDirectory(String paramString)
    {
      GMTrace.i(13831405305856L, 103052);
      String str = paramString;
      if (paramString.endsWith("/")) {
        str = paramString.substring(0, paramString.length() - 1);
      }
      this.mConf.put(Integer.valueOf(1), str + "/%s.index");
      GMTrace.o(13831405305856L, 103052);
      return this;
    }
    
    public Builder setIOMode(int paramInt)
    {
      GMTrace.i(13830465781760L, 103045);
      this.mConf.put(Integer.valueOf(9), Integer.valueOf(paramInt));
      GMTrace.o(13830465781760L, 103045);
      return this;
    }
    
    public Builder setIndexDBPath(String paramString)
    {
      GMTrace.i(13830063128576L, 103042);
      this.mConf.put(Integer.valueOf(1), paramString);
      GMTrace.o(13830063128576L, 103042);
      return this;
    }
    
    public Builder setMaxConcurrentIO(int paramInt)
    {
      GMTrace.i(13831002652672L, 103049);
      this.mConf.put(Integer.valueOf(10), Integer.valueOf(paramInt));
      GMTrace.o(13831002652672L, 103049);
      return this;
    }
    
    public Builder setName(String paramString)
    {
      GMTrace.i(13829928910848L, 103041);
      this.mName = paramString;
      GMTrace.o(13829928910848L, 103041);
      return this;
    }
    
    public Builder setOverflowPrefix(String paramString)
    {
      GMTrace.i(13830331564032L, 103044);
      this.mConf.put(Integer.valueOf(3), paramString);
      GMTrace.o(13830331564032L, 103044);
      return this;
    }
    
    public Builder setStoragePath(String paramString)
    {
      GMTrace.i(13831271088128L, 103051);
      String str = paramString;
      if (paramString.endsWith("/")) {
        str = paramString.substring(0, paramString.length() - 1);
      }
      this.mConf.put(Integer.valueOf(2), str + "/%s.block");
      this.mConf.put(Integer.valueOf(3), str + "/%s/");
      GMTrace.o(13831271088128L, 103051);
      return this;
    }
    
    public Builder setSyncMode(int paramInt)
    {
      GMTrace.i(13831136870400L, 103050);
      this.mConf.put(Integer.valueOf(11), Integer.valueOf(paramInt));
      GMTrace.o(13831136870400L, 103050);
      return this;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(13831942176768L, 103056);
      paramParcel.writeString(this.mName);
      Object[] arrayOfObject = new Object[12];
      Iterator localIterator = this.mConf.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramInt = ((Integer)localEntry.getKey()).intValue();
        if ((paramInt < 12) && (paramInt >= 0)) {
          arrayOfObject[paramInt] = localEntry.getValue();
        }
      }
      paramParcel.writeArray(arrayOfObject);
      GMTrace.o(13831942176768L, 103056);
    }
  }
  
  public static class FileEntry
  {
    public String name;
    public long size;
    public long timestamp;
    
    public FileEntry()
    {
      GMTrace.i(13841605853184L, 103128);
      GMTrace.o(13841605853184L, 103128);
    }
  }
  
  public static class Statistics
    implements Serializable
  {
    private static final long serialVersionUID = 1L;
    public BlockFile[] blockFiles;
    public long blockSizeEmpty;
    public long blockSizeUsed;
    public BlockType[] blockTypes;
    public long overflowActualSize;
    public long totalActualSize;
    
    public Statistics()
    {
      GMTrace.i(13843753336832L, 103144);
      GMTrace.o(13843753336832L, 103144);
    }
    
    public String toString()
    {
      int k = 0;
      GMTrace.i(13843887554560L, 103145);
      Object localObject1 = new StringBuilder(4096);
      ((StringBuilder)localObject1).append("Total:\n\tActualSize: ").append(this.totalActualSize).append('\n').append("\tUsedBlockSize: ").append(this.blockSizeUsed).append('\n').append("\tEmptyBlockSize: ").append(this.blockSizeEmpty).append('\n').append("\tOverflowSize: ").append(this.overflowActualSize).append('\n');
      int i = 0;
      int j;
      Object localObject2;
      for (;;)
      {
        j = k;
        if (i >= this.blockTypes.length) {
          break;
        }
        localObject2 = this.blockTypes[i];
        ((StringBuilder)localObject1).append("BlockType: ").append(((BlockType)localObject2).blockSize).append('\n').append("\tUsedCount: ").append(((BlockType)localObject2).usedCount).append('\n').append("\tEmptyCount: ").append(((BlockType)localObject2).emptyCount).append('\n').append("\tActualSize: ").append(((BlockType)localObject2).actualSize).append('\n');
        i += 1;
      }
      while (j < this.blockFiles.length)
      {
        localObject2 = this.blockFiles[j];
        ((StringBuilder)localObject1).append("BlockFile: ").append(j).append('\n').append("\tFileSize: ").append(((BlockFile)localObject2).fileSize).append('\n').append("\tUsedBlockCount: ").append(((BlockFile)localObject2).blockCount).append('\n').append("\tEmptyBlockCount: ").append(((BlockFile)localObject2).emptyCount).append('\n').append("\tTimestamp: ").append(((BlockFile)localObject2).timestamp).append('\n').append("\tDeleted: ").append(((BlockFile)localObject2).deleted).append('\n');
        j += 1;
      }
      localObject1 = ((StringBuilder)localObject1).toString();
      GMTrace.o(13843887554560L, 103145);
      return (String)localObject1;
    }
    
    public static class BlockFile
      implements Serializable
    {
      private static final long serialVersionUID = 1L;
      public int blockCount;
      public boolean deleted;
      public int emptyCount;
      public long fileSize;
      public long timestamp;
      
      public BlockFile()
      {
        GMTrace.i(13845632385024L, 103158);
        GMTrace.o(13845632385024L, 103158);
      }
    }
    
    public static class BlockType
      implements Serializable
    {
      private static final long serialVersionUID = 1L;
      public long actualSize;
      public int blockSize;
      public int emptyCount;
      public int usedCount;
      
      public BlockType()
      {
        GMTrace.i(13841471635456L, 103127);
        GMTrace.o(13841471635456L, 103127);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsfs\SFSContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */